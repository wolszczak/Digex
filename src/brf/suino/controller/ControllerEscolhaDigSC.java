package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import brf.main.controller.ControllerEscolhaExp;
import brf.main.view.ViewEscolhaExp;
import brf.peru.model.dao.AbateDAOP;
import brf.peru.model.dao.DesempenhoDAOP;
import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.model.vo.RmeVOP;
import brf.suino.view.ViewEscolhaDigSC;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;

public class ControllerEscolhaDigSC extends KeyAdapter {
	private final ControllerSC controller;
	private ViewEscolhaDigSC viewEscolhaDig;
	private ViewEscolhaExp viewEscolhaExp;
	private ControllerEscolhaExp controllerescolhaExp;
	private List<String> datasFases = new ArrayList<>();

	public ControllerEscolhaDigSC(ControllerSC c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		viewEscolhaDig = new ViewEscolhaDigSC();
		viewEscolhaDig.setTitle("DIGEX - Peru");
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
		if (controller.getModel().getExperimentoVO().getMedicados() != null
				&& controller.getModel().getExperimentoVO().getMedicados().isEmpty()) {
			viewEscolhaDig.getExportarMediLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getMortalidade() != null
				&& controller.getModel().getExperimentoVO().getMortalidade().isEmpty()) {
			viewEscolhaDig.getExportarMortLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getPesagens() != null
				&& controller.getModel().getExperimentoVO().getPesagens().isEmpty()) {
			viewEscolhaDig.getExportarPesagemLabel().setForeground(Color.GRAY);
		}

		histSetup();
	}

	public void histSetup() {
		int obsConsumo = controller.getModel().getExperimentoVO().getConsumo().size();
		int obsMedi = controller.getModel().getExperimentoVO().getMedicados().size();
		int obsMort = controller.getModel().getExperimentoVO().getMortalidade().size();
		viewEscolhaDig.getQtdeConsLabel()
				.setText(obsConsumo + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
		viewEscolhaDig.getQtdeMediLabel().setText(obsMedi + " registro(s)");
		viewEscolhaDig.getQtdeMortLabel().setText(obsMort + " registro(s)");
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
			viewEscolhaDig.setVisible(false);
			if (controller.getModel().getExperimentoVO().getConsumo() != null
					&& controller.getModel().getExperimentoVO().getConsumo().size() != 0) {
				if (controller.getModel().getExperimentoVO().getConsumo()
						.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isFinalizado()) {
					if (controller.getModel().getExperimentoVO().getMortalidade()
							.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).isFinalizado()) {
						if (!controller.getModel().getExperimentoVO().getMedicados()
								.get(controller.getModel().getExperimentoVO().getMedicados().size() - 1).isFinalizado()) {
//							controller.startMedicadosSC(datasFases);
							System.out.println("Abrir tela de Mortalidade");
							break;
						}
					} else {
//						controller.startMortalidadeSC(datasFases);
						System.out.println("Abrir tela de Mortalidade");
						break;
					}
				} else {
					controller.startConsumoSC(datasFases);
					System.out.println("Abrir tela de CONSUMOS");
					break;
				}
			} else {
				controller.startConsumoSC(datasFases);
				System.out.println("Abrir tela de CONSUMOS");
				break;
			}
		case KeyEvent.VK_2:
			viewEscolhaDig.setVisible(false);
			if (controller.getModel().getExperimentoVO().getMedicados() != null
					&& controller.getModel().getExperimentoVO().getMedicados().size() != 0) {

			} else {
//				controller.startMedicadosSC(idades);
				System.out.println("Abrir tela de MEDICADOS");
				break;
			}
			break;
		case KeyEvent.VK_3:
			viewEscolhaDig.setVisible(false);
			if (controller.getModel().getExperimentoVO().getMortalidade() != null
					&& controller.getModel().getExperimentoVO().getMortalidade().size() != 0) {

			} else {
//				controller.startMortalidadeSC(idades);
				System.out.println("Abrir tela de MORTALIDADE");
				break;
			}
			break;
		case KeyEvent.VK_4:
			viewEscolhaDig.setVisible(false);
			if (controller.getModel().getExperimentoVO().getPesagens() != null
					&& controller.getModel().getExperimentoVO().getPesagens().size() != 0) {

			} else {
//				controller.startPesagensSC(idades);
				System.out.println("Abrir tela de IMPORTAÇÃO DE ARQUIVOS DA BALANÇA");
				break;
			}
			break;
		case KeyEvent.VK_5:
			if (controller.getModel().getExperimentoVO().getConsumo().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Granja!", "DIGEX - Aviso", JOptionPane.WARNING_MESSAGE);
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
//					try {
//						DesempenhoDAOP.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
//								controller.getModel().getExperimentoVO().getConsumo(), localExportar);
//						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Granja salvo com sucesso!");
//					} catch (IOException ex) {
//						String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
//						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
//						Logger.getLogger(ControllerEscolhaDigSC.class.getName()).log(Level.SEVERE, null, ex);
//					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_6:
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new ExpFileFilter());
			fileChooser.setFileView(new SystemFileView());
			fileChooser.setAcceptAllFileFilterUsed(false);
			int returnVal = fileChooser.showDialog(viewEscolhaDig, "Salvar");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				String localExportar = file.getAbsolutePath();
//				try {
//					AbateDAOP.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
//							controller.getModel().getExperimentoVO().getAbates(), localExportar);
//					JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Rendimento salvo com sucesso!");
//				} catch (Exception ex) {
//					String msg = "Falha ao tentar salvar o arquivo!\n" + "Verifique se ele está aberto e tente novamente.";
//					JOptionPane.showMessageDialog(viewEscolhaDig, msg);
//					Logger.getLogger(ControllerEscolhaDigSC.class.getName()).log(Level.SEVERE, null, ex);
//				}
			}
			fileChooser.setSelectedFile(null);

			break;
		case KeyEvent.VK_7:
			viewEscolhaDig.setVisible(false);
//			if (controller.getModel().getExperimentoVO().getPesagens() != null
//					&& controller.getModel().getExperimentoVO().getPesagens().size() != 0) {
//				
//			} else {
////				controller.startPesagensSC(idades);
//				System.out.println("Abrir tela de IMPORTAÇÃO DE ARQUIVOS DA BALANÇA");
//				break;
//			}
			break;
		case KeyEvent.VK_8:
			viewEscolhaDig.setVisible(false);
//			if (controller.getModel().getExperimentoVO().getPesagens() != null
//					&& controller.getModel().getExperimentoVO().getPesagens().size() != 0) {
//				
//			} else {
////				controller.startPesagensSC(idades);
//				System.out.println("Abrir tela de IMPORTAÇÃO DE ARQUIVOS DA BALANÇA");
//				break;
//			}
			break;
		}
	}

}
