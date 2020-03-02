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
import brf.suino.model.dao.BaiaDAOST;
import brf.suino.model.dao.FrigorificoDAOST;
import brf.suino.model.vo.BaiaVOST;
import brf.suino.model.vo.MortalidadeVOST;
import brf.suino.view.ViewEscolhaDigST;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;

public class ControllerEscolhaDigST extends KeyAdapter {
	private final ControllerST controller;
	private ViewEscolhaDigST view;
	private ViewEscolhaExp viewEscolhaExp;
	private ControllerEscolhaExp controllerescolhaExp;
	private List<String> datasFases = new ArrayList<>();

	public ControllerEscolhaDigST(ControllerST c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		view = new ViewEscolhaDigST();
		view.setTitle("DIGEX - Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		view.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		view.getOpcaoJFT().addKeyListener(this);
		this.datasFases = datasFases;

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarMortLabel().setForeground(Color.GRAY);
		} else {
			for(BaiaVOST b : controller.getModel().getExperimentoVO().getBaias()) {
				if(b.getMortalidades().size() > 0) {
					break;
				}else {
					view.getExportarMortLabel().setForeground(Color.GRAY);
				}
			}
		}

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarMediLabel().setForeground(Color.GRAY);
		} else{
			for(BaiaVOST b : controller.getModel().getExperimentoVO().getBaias()) {
				if(b.getMedicados().size() > 0) {
					break;
				}else {
					view.getExportarMediLabel().setForeground(Color.GRAY);
				}
			}
		}

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarLivreLabel().setForeground(Color.GRAY);
		} else {
			for(BaiaVOST b : controller.getModel().getExperimentoVO().getBaias()) {
				if(b.getConsumos().getRme().size() > 0) {
					break;
				}else {
					view.getExportarMortLabel().setForeground(Color.GRAY);
				}
			}
		}

		if (controller.getModel().getExperimentoVO().getConsumosTratos() == null
				|| controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
			view.getExportarTratosLabel().setForeground(Color.GRAY);
		}

		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST() == null
				|| (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr().size() == 0
						&& controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().size() == 0
						&& controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().size() == 0
						&& controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().size() == 0
						&& controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().size() == 0)) {
			view.getExportarFrigoLabel().setForeground(Color.GRAY);
		}

		histSetup();
	}

	public void histSetup() {
//		int obsConsumo = controller.getModel().getExperimentoVO().getConsumo().size();
//		int obsMedi = controller.getModel().getExperimentoVO().getMedicados().size();
//		int obsMort = controller.getModel().getExperimentoVO().getMortalidade().size();
//		viewEscolhaDig.getQtdeConsLabel()
//				.setText(obsConsumo + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
	}

	public void resumeWindow() {
		histSetup();
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().setText("");
		view.getOpcaoJFT().grabFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(view, "Deseja realmente sair do programa?", "DIGEX - Sair", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela de escolha de experimento?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(controller.getIdDigitador());
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			view.setVisible(false);
			ControllerMortalidadeST mortalidade = new ControllerMortalidadeST(controller);
			mortalidade.openWindow(datasFases);
			break;
		case KeyEvent.VK_2:
			view.setVisible(false);
			ControllerConsumoTST cl = new ControllerConsumoTST(controller);
			cl.openWindow(datasFases);
			break;
		case KeyEvent.VK_3:
			view.setVisible(false);
			ControllerImportarFrigoST cif = new ControllerImportarFrigoST(controller);
			cif.openWindow(datasFases);
			break;
		case KeyEvent.VK_4:
			JFileChooser fileMort = new JFileChooser();
			fileMort.addChoosableFileFilter(new ExpFileFilter());
			fileMort.setFileView(new SystemFileView());
			fileMort.setAcceptAllFileFilterUsed(false);
			fileMort.setSelectedFile(new File(view.getTesteJFT().getText()));
			int returnMort = fileMort.showDialog(view, "Salvar");
			if (returnMort == JFileChooser.APPROVE_OPTION) {
				File file = fileMort.getSelectedFile();
				String localExportar = file.getAbsolutePath();
				try {
					BaiaDAOST.exportarArquivoMortalidade(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getBaias(), localExportar);
					JOptionPane.showMessageDialog(view, "Arquivo de MORTALIDADE salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(view, msg);
				}
			}
			fileMort.setSelectedFile(null);
			break;
		case KeyEvent.VK_5:
			JFileChooser fileMedi = new JFileChooser();
			fileMedi.addChoosableFileFilter(new ExpFileFilter());
			fileMedi.setFileView(new SystemFileView());
			fileMedi.setAcceptAllFileFilterUsed(false);
			fileMedi.setSelectedFile(new File(view.getTesteJFT().getText()));
			int returnMedi = fileMedi.showDialog(view, "Salvar");
			if (returnMedi == JFileChooser.APPROVE_OPTION) {
				File file = fileMedi.getSelectedFile();
				String localExportar = file.getAbsolutePath();
				try {
					BaiaDAOST.exportarArquivoMedicados(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getBaias(), localExportar);
					JOptionPane.showMessageDialog(view, "Arquivo de MEDICADOS salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(view, msg);
				}
			}
			fileMedi.setSelectedFile(null);
			break;
		case KeyEvent.VK_6:
			JFileChooser fileConsl = new JFileChooser();
			fileConsl.addChoosableFileFilter(new ExpFileFilter());
			fileConsl.setFileView(new SystemFileView());
			fileConsl.setAcceptAllFileFilterUsed(false);
			fileConsl.setSelectedFile(new File(view.getTesteJFT().getText()));
			int returnConsl = fileConsl.showDialog(view, "Salvar");
			if (returnConsl == JFileChooser.APPROVE_OPTION) {
				File file = fileConsl.getSelectedFile();
				String localExportar = file.getAbsolutePath();
				try {
					BaiaDAOST.exportarArquivoConsumoLivre(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getBaias(), localExportar);
					JOptionPane.showMessageDialog(view, "Arquivo de CONSUMO LIVRE salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(view, msg);
				}
			}
			fileConsl.setSelectedFile(null);
			break;
		case KeyEvent.VK_7:
			JFileChooser fileConsT = new JFileChooser();
			fileConsT.addChoosableFileFilter(new ExpFileFilter());
			fileConsT.setFileView(new SystemFileView());
			fileConsT.setAcceptAllFileFilterUsed(false);
			fileConsT.setSelectedFile(new File(view.getTesteJFT().getText()));
			int returnConsT = fileConsT.showDialog(view, "Salvar");
			if (returnConsT == JFileChooser.APPROVE_OPTION) {
				File file = fileConsT.getSelectedFile();
				String localExportar = file.getAbsolutePath();
				try {
					BaiaDAOST.exportarArquivoConsumoTratos(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getConsumosTratos(), localExportar);
					JOptionPane.showMessageDialog(view, "Arquivo de CONSUMO TRATOS salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(view, msg);
				}
			}
			fileConsT.setSelectedFile(null);
			break;
		case KeyEvent.VK_8:
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new ExpFileFilter());
			fileChooser.setFileView(new SystemFileView());
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.setSelectedFile(new File(view.getTesteJFT().getText()));
			int returnVal = fileChooser.showDialog(view, "Salvar");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				String localExportar = file.getAbsolutePath();
				try {
					FrigorificoDAOST.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
							controller.getModel().getExperimentoVO().getFrigorificoVOST(),
							controller.getModel().getExperimentoVO().getFrigorificoTempVOST(), localExportar);
					JOptionPane.showMessageDialog(view, "Arquivo de FRIGORIFICO salvo com sucesso!");
				} catch (IOException ex) {
					String msg = "Falha ao tentar salvar o arquivo! \n" + "Verifique se ele está aberto e tente novamente.";
					JOptionPane.showMessageDialog(view, msg);
				}
			}
			fileChooser.setSelectedFile(null);
			break;
		}
	}

}
