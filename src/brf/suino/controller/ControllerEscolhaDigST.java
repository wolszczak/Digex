package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import brf.main.controller.ControllerEscolhaExp;
import brf.main.view.ViewEscolhaExp;
import brf.suino.model.dao.ConsumoDAOSC;
import brf.suino.model.dao.MedicadosDAOSC;
import brf.suino.model.dao.MortalidadeDAOSC;
import brf.suino.view.ViewEscolhaDigST;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;

public class ControllerEscolhaDigST extends KeyAdapter {
	private final ControllerST controller;
	private ViewEscolhaDigST viewEscolhaDig;
	private ViewEscolhaExp viewEscolhaExp;
	private ControllerEscolhaExp controllerescolhaExp;
	private List<String> datasFases = new ArrayList<>();

	public ControllerEscolhaDigST(ControllerST c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		viewEscolhaDig = new ViewEscolhaDigST();
		viewEscolhaDig.setTitle("DIGEX - Suínos Creche");
		viewEscolhaDig.setResizable(false);
		viewEscolhaDig.setLocationRelativeTo(null);
		viewEscolhaDig.setVisible(true);
		viewEscolhaDig.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		viewEscolhaDig.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		viewEscolhaDig.getOpcaoJFT().addKeyListener(this);
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getConsumo() != null
				&& controller.getModel().getExperimentoVO().getConsumo().isEmpty()) {
			viewEscolhaDig.getExportarConsLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getMortalidade() != null
				&& controller.getModel().getExperimentoVO().getMortalidade().isEmpty()) {
			viewEscolhaDig.getExportarMortLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getMedicados() != null
				&& controller.getModel().getExperimentoVO().getMedicados().isEmpty()) {
			viewEscolhaDig.getExportarMediLabel().setForeground(Color.GRAY);
		}else {
			
		}
		histSetup();
	}

	public void histSetup() {
		int obsConsumo = controller.getModel().getExperimentoVO().getConsumo().size();
		int obsMedi = controller.getModel().getExperimentoVO().getMedicados().size();
		int obsMort = controller.getModel().getExperimentoVO().getMortalidade().size();
		viewEscolhaDig.getQtdeConsLabel()
				.setText(obsConsumo + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaDig.setLocationRelativeTo(null);
		viewEscolhaDig.setVisible(true);
		viewEscolhaDig.getOpcaoJFT().setText("");
		viewEscolhaDig.getOpcaoJFT().grabFocus();

		if (controller.getModel().getExperimentoVO().getConsumo().isEmpty()) {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.GRAY);
		} else {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.BLACK);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(viewEscolhaDig, "Deseja realmente sair do programa?", "DIGEX - Sair",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(viewEscolhaDig, "Deseja realmente voltar para tela de escolha de experimento?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewEscolhaDig.setVisible(false);
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(controller.getIdDigitador());
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
//			viewEscolhaDig.setVisible(false);
//			if (controller.getModel().getExperimentoVO().getConsumo() != null
//					&& controller.getModel().getExperimentoVO().getConsumo().size() != 0) {
//				// VERIFICA SE O CONSUMO NA ULTIMA BAIA JÁ FOI FINALIZADO
//				if (controller.getModel().getExperimentoVO().getConsumo()
//						.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isFinalizado()) {
//					// DIGITAÇÃO DO CONSUMO JÁ FOI FINALIZADA, VERIFICAR SE MORTALIDADE ESTÁ
//					// FINALIZADA E SE SÃO DA MESMA BAIA DO CONSUMO
//					if (controller.getModel().getExperimentoVO().getMortalidade() != null
//							&& controller.getModel().getExperimentoVO().getMortalidade().size() != 0) {
////						if (controller.getModel().getExperimentoVO().getConsumo()
////								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getBaia() == controller.getModel()
////										.getExperimentoVO().getMortalidade()
////										.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getBaia()) {
//						// ESCOLHA DIGITACAO MORTALIDADE PARA A ULTIMA BAIA DIGITADA
//						ControllerEscolhaTipoDigST controllerEscolhaTipoDigSC = new ControllerEscolhaTipoDigST(controller);
//						controllerEscolhaTipoDigSC.openWindow(datasFases);
//						viewEscolhaDig.setVisible(false);
//						break;
////						}
//					} else {
//						ControllerEscolhaTipoDigST controllerEscolhaTipoDigSC = new ControllerEscolhaTipoDigST(controller);
//						controllerEscolhaTipoDigSC.openWindow(datasFases);
//						viewEscolhaDig.setVisible(false);
//						break;
//					}
//				} else {
//					// ABRIR TELA CONSUMOS
//					controller.startConsumoSC(datasFases);
//					System.out.println("Abrir tela de CONSUMOS");
//					break;
//				}
//			} else {
//				controller.startConsumoSC(datasFases);
//				System.out.println("Abrir tela de CONSUMOS");
//				break;
//			}
		case KeyEvent.VK_2:
			if (controller.getModel().getExperimentoVO().getConsumo().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de CONSUMOS!", "DIGEX - Aviso", JOptionPane.WARNING_MESSAGE);
			} else {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new ExpFileFilter());
				fileChooser.setFileView(new SystemFileView());
				fileChooser.setAcceptAllFileFilterUsed(false);
				fileChooser.setSelectedFile(new File(viewEscolhaDig.getTesteJFT().getText()));
				int returnVal = fileChooser.showDialog(viewEscolhaDig, "Salvar");
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					String localExportar = file.getAbsolutePath();
					try {
						ConsumoDAOSC.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getConsumo(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de CONSUMOS salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_3:
			if (controller.getModel().getExperimentoVO().getMortalidade().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Mortalidade!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			} else {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new ExpFileFilter());
				fileChooser.setFileView(new SystemFileView());
				fileChooser.setAcceptAllFileFilterUsed(false);
				fileChooser.setSelectedFile(new File(viewEscolhaDig.getTesteJFT().getText()));
				int returnVal = fileChooser.showDialog(viewEscolhaDig, "Salvar");
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					String localExportar = file.getAbsolutePath();
					try {
					MortalidadeDAOSC.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getMortalidade(), localExportar);
					JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de MORTALIDADE salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(viewEscolhaDig, msg);
				}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_4:
			if (controller.getModel().getExperimentoVO().getMedicados().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Medicados!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			} else {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new ExpFileFilter());
				fileChooser.setFileView(new SystemFileView());
				fileChooser.setAcceptAllFileFilterUsed(false);
				fileChooser.setSelectedFile(new File(viewEscolhaDig.getTesteJFT().getText()));
				int returnVal = fileChooser.showDialog(viewEscolhaDig, "Salvar");
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					String localExportar = file.getAbsolutePath();
					try {
						MedicadosDAOSC.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getMedicados(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de MEDICADOS salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		}
	}

}
