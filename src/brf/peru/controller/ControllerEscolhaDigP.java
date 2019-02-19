package brf.peru.controller;

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
import brf.peru.model.dao.DesempenhoDAOP;
import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.view.ViewEscolhaDigP;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;

public class ControllerEscolhaDigP extends KeyAdapter {
	private final ControllerP controller;
	private ViewEscolhaDigP viewEscolhaDig;
	private ViewEscolhaExp viewEscolhaExp;
	private ControllerEscolhaExp controllerescolhaExp;
	private boolean temAbate;
	private List<Integer> idades = new ArrayList<>();

	public ControllerEscolhaDigP(ControllerP c) {
		controller = c;
	}

	public void openWindow(List<Integer> idadesFases) {
		viewEscolhaDig = new ViewEscolhaDigP();
		viewEscolhaDig.setTitle("DIGEX - Peru");
		viewEscolhaDig.setResizable(false);
		viewEscolhaDig.setLocationRelativeTo(null);
		viewEscolhaDig.setVisible(true);
		viewEscolhaDig.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		viewEscolhaDig.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		viewEscolhaDig.getOpcaoJFT().addKeyListener(this);
		idades = idadesFases;

		if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 0) {
			viewEscolhaDig.getRendimentoLabel().setForeground(Color.GRAY);
			viewEscolhaDig.getQtdeRendLabel().setVisible(false);
			temAbate = false;
		} else {
			temAbate = true;
		}
		if (controller.getModel().getExperimentoVO().getDesempenho() != null
				&& controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getCamaras().isEmpty()) {
			viewEscolhaDig.getExportarRendimentoLabel().setForeground(Color.GRAY);
		}
		histSetup();
	}

	public void histSetup() {
		int obsDese = controller.getModel().getExperimentoVO().getDesempenho().size();
		int obsRend = 0;
		for (AbateVOP abate : controller.getModel().getExperimentoVO().getAbates()) {
			for (BaiaAmostradosVOP baiaAmostrado : abate.getBaiaAmostrados()) {
					obsRend++;
			}
		}
		viewEscolhaDig.getQtdeDesLabel().setText(
				obsDese + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
		viewEscolhaDig.getQtdeRendLabel().setText(obsRend + " registro(s)");
	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaDig.setLocationRelativeTo(null);
		viewEscolhaDig.setVisible(true);
		viewEscolhaDig.getOpcaoJFT().setText("");
		viewEscolhaDig.getOpcaoJFT().grabFocus();

		if (controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.GRAY);
		} else {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.BLACK);
		}
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getCamaras().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(0).getBaiaAmostrados().isEmpty()) {
			viewEscolhaDig.getExportarRendimentoLabel().setForeground(Color.GRAY);
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
			int option = JOptionPane.showConfirmDialog(viewEscolhaDig,
					"Deseja realmente voltar para tela de escolha de experimento?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewEscolhaDig.setVisible(false);
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(controller.getIdDigitador());
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			viewEscolhaDig.setVisible(false);
			controller.startDesempenho(idades);
			System.out.println("Desempenho");
			break;
		case KeyEvent.VK_2:
			if (temAbate) {
				viewEscolhaDig.setVisible(false);
				controller.startEscolhaAbate(idades);
				System.out.println("Escolha");
			} else {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Experimento não teve abate!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
			break;
		case KeyEvent.VK_3:
			if (controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Granja!", "DIGEX - Aviso",
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
						DesempenhoDAOP.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getDesempenho(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Granja salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo! \n"
								+ "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
						Logger.getLogger(ControllerEscolhaDigP.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_4:
			if (controller.getModel().getExperimentoVO().getAbates().get(0).getCamaras().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(1).getCamaras().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(2).getCamaras().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Frigorifico!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			} else {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.addChoosableFileFilter(new ExpFileFilter());
				fileChooser.setFileView(new SystemFileView());
				fileChooser.setAcceptAllFileFilterUsed(false);
				int returnVal = fileChooser.showDialog(viewEscolhaDig, "Salvar");
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					String localExportar = file.getAbsolutePath();
					try {
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Rendimento salvo com sucesso!");
					} catch (Exception ex) {
						String msg = "Falha ao tentar salvar o arquivo!\n"
								+ "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
						Logger.getLogger(ControllerEscolhaDigP.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				fileChooser.setSelectedFile(null);
			}
		}
	}

}
