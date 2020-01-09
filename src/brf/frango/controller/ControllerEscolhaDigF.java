package brf.frango.controller;

import brf.frango.model.bo.InfoExpBOF;
import brf.main.controller.ControllerEscolhaExp;
import brf.frango.model.dao.AvaliacaoPeDAOF;
import brf.frango.model.dao.DesempenhoDAOF;
import brf.frango.model.dao.RendimentoDAOF;
import brf.frango.model.vo.AbateVOF;
import brf.frango.model.vo.AvaliacaoPeVOF;
import brf.frango.model.vo.BalancaVOF;
import brf.frango.model.vo.RendimentoVOF;
import brf.frango.view.ViewEscolhaDigF;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaDigF extends KeyAdapter {
	private final ControllerF controller;
	private ViewEscolhaDigF viewEscolhaDig;
	private boolean temAbate;

	public ControllerEscolhaDigF(ControllerF c) {
		controller = c;
	}

	public void openWindow() {
		viewEscolhaDig = new ViewEscolhaDigF();
		viewEscolhaDig.setTitle("DIGEX - Frango");
		viewEscolhaDig.setResizable(false);
		viewEscolhaDig.setLocationRelativeTo(null);
		viewEscolhaDig.setVisible(true);
		viewEscolhaDig.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		viewEscolhaDig.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		viewEscolhaDig.getOpcaoJFT().addKeyListener(this);

		if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 0) {
			viewEscolhaDig.getRendimentoLabel().setForeground(Color.GRAY);
			viewEscolhaDig.getAvaliacaoPeLabel().setForeground(Color.GRAY);
			viewEscolhaDig.getQtdeRendLabel().setVisible(false);
			viewEscolhaDig.getQtdeAvalLabel().setVisible(false);
			temAbate = false;
		} else {
			temAbate = true;
		}
		if (controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
			viewEscolhaDig.getExportarDesempenhoLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getRendimento().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(1).getRendimento().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(2).getRendimento().isEmpty()) {
			viewEscolhaDig.getExportarRendimentoLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getAvaliacaoPe().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(1).getAvaliacaoPe().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(2).getAvaliacaoPe().isEmpty()) {
			viewEscolhaDig.getExportarAvaliacaoLabel().setForeground(Color.GRAY);
		}
		histSetup();
	}

	public void histSetup() {
		int obsDese = controller.getModel().getExperimentoVO().getDesempenho().size();
		int obsRend = 0, obsAval = 0;
		for (AbateVOF abate : controller.getModel().getExperimentoVO().getAbates()) {
			for (RendimentoVOF rendimento : abate.getRendimento()) {
				if (rendimento.getNasa() != 0) {
					obsRend++;
				}
			}
			for (AvaliacaoPeVOF avaliacaoPe : abate.getAvaliacaoPe()) {
				if (avaliacaoPe.getLacre() != 0) {
					obsAval++;
				}
			}
		}
		viewEscolhaDig.getQtdeDesLabel().setText(
				obsDese + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
		viewEscolhaDig.getQtdeRendLabel().setText(obsRend + " registro(s)");
		viewEscolhaDig.getQtdeAvalLabel().setText(obsAval + " registro(s)");
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
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getRendimento().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(1).getRendimento().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(2).getRendimento().isEmpty()) {
			viewEscolhaDig.getExportarRendimentoLabel().setForeground(Color.GRAY);
		} else {
			viewEscolhaDig.getExportarRendimentoLabel().setForeground(Color.BLACK);
		}
		if (controller.getModel().getExperimentoVO().getAbates().get(0).getAvaliacaoPe().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(1).getAvaliacaoPe().isEmpty()
				&& controller.getModel().getExperimentoVO().getAbates().get(2).getAvaliacaoPe().isEmpty()) {
			viewEscolhaDig.getExportarAvaliacaoLabel().setForeground(Color.GRAY);
		} else {
			viewEscolhaDig.getExportarAvaliacaoLabel().setForeground(Color.BLACK);
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
		case KeyEvent.VK_1:
			viewEscolhaDig.setVisible(false);
			controller.startDesempenho();
			System.out.println("Desempenho");
			break;
		case KeyEvent.VK_2:
			if (temAbate) {
				viewEscolhaDig.setVisible(false);
				controller.startEscolhaAbate("REND");
				System.out.println("Escolha Abate (Rendimento)");
			} else {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Experimento não teve abate!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
			break;
		case KeyEvent.VK_3:
			if (temAbate) {
				viewEscolhaDig.setVisible(false);
				controller.startEscolhaAbate("AVAL");
				System.out.println("Escolha Abate (Avaliação do Pé)");
			} else {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Experimento não teve abate!", "DIGEX - Aviso",
						JOptionPane.WARNING_MESSAGE);
			}
			break;
		case KeyEvent.VK_4:
			if (controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Desempenho!", "DIGEX - Aviso",
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
						DesempenhoDAOF.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getDesempenho(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Desempenho salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo!\n"
								+ "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
						Logger.getLogger(ControllerEscolhaDigF.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_5:
			if (controller.getModel().getExperimentoVO().getAbates().get(0).getRendimento().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(1).getRendimento().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(2).getRendimento().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Rendimento!", "DIGEX - Aviso",
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
						RendimentoDAOF.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getAbates(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Rendimento salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo!\n"
								+ "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
						Logger.getLogger(ControllerEscolhaDigF.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				fileChooser.setSelectedFile(null);
			}
			break;
		case KeyEvent.VK_6:
			if (controller.getModel().getExperimentoVO().getAbates().get(0).getAvaliacaoPe().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(1).getAvaliacaoPe().isEmpty()
					&& controller.getModel().getExperimentoVO().getAbates().get(2).getAvaliacaoPe().isEmpty()) {
				JOptionPane.showMessageDialog(viewEscolhaDig, "Não há registros de Avaliação de pé!", "DIGEX - Aviso",
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
						AvaliacaoPeDAOF.exportarArquivo(controller.getModel().getExperimentoVO().getInfoExp(),
								controller.getModel().getExperimentoVO().getAbates(), localExportar);
						JOptionPane.showMessageDialog(viewEscolhaDig, "Arquivo de Avaliação de pé salvo com sucesso!");
					} catch (IOException ex) {
						String msg = "Falha ao tentar salvar o arquivo!\n"
								+ "Verifique se ele está aberto e tente novamente.";
						JOptionPane.showMessageDialog(viewEscolhaDig, msg);
						Logger.getLogger(ControllerEscolhaDigF.class.getName()).log(Level.SEVERE, null, ex);
					}

				}
				fileChooser.setSelectedFile(null);
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
		default:
			System.out.println("Opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}
	}
	
	
}
