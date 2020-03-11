package brf.suino.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.bo.DigitacaoFrigoBOST;
import brf.suino.model.vo.PaletaVOST;
import brf.suino.view.ViewDigitarPaletaST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerPaletaST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewDigitarPaletaST view;
	private Border defaultBorder;
	private List<Component> order, orderHist;
	private List<String> datasFases;
	private DigitacaoFrigoBOST bo;
	private List<PaletaVOST> paletaHist;

	public ControllerPaletaST(ControllerST controller) {
		this.controller = controller;
		this.bo = new DigitacaoFrigoBOST(controller);
		this.paletaHist = new ArrayList<>();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().size() > 0) {
			this.paletaHist.addAll(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta());
		} else {
			paletaHist = new ArrayList<>();
		}
		view = new ViewDigitarPaletaST();
		view.setTitle("DIGEX - Avaliação Paleta");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getControleJFT().setEnabled(false);
		view.getRegistrosLabel().setVisible(false);
		defaultBorder = view.getBaiaJP().getBorder();
		view.getControleJFT().setText("00000");

		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();
		view.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				TextFormatter.formatStringJFT(view.getDataJFT(), view.getDataJFT().getText(), 10);
				String msg = bo.verificaData(view.getDataJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					carregarHistData();
					view.getDataJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().requestFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem1JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem1JFT(), view.getTatuagem1JFT().getText(), 4);
				if (Integer.parseInt(view.getTatuagem1JFT().getText()) == 9999) {
					view.getTatuagem1JFT().setText(" ");
					view.getTatuagem1JFT().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					if (Integer.parseInt(view.getTatuagem1JFT().getText()) != 0) {
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem1JFT().getText()), "PALETA");
						if (msg == null) {
							view.getTatuagem1JFT().setEnabled(false);
							view.getTatuagem2JFT().setEnabled(true);
							view.getTatuagem2JFT().grabFocus();
						} else if (msg.equals("INEXISTENTE")) {
							msg = "tatuagem digitada não existe no arquivo de frigorífico";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						} else if (msg.equals("DUPLICADA")) {
							msg = "Tatuagem nº" + view.getTatuagem1JFT().getText() + " já foi digitada.";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						view.getTatuagem1JFT().setEnabled(false);
						view.getTatuagem2JFT().setEnabled(true);
						view.getTatuagem2JFT().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem2JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem2JFT(), view.getTatuagem2JFT().getText(), 4);
				if (Integer.parseInt(view.getTatuagem1JFT().getText()) == 9999) {
					view.getTatuagem2JFT().setText(" ");
					view.getTatuagem2JFT().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					if (Integer.parseInt(view.getTatuagem2JFT().getText()) != 0) {
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem2JFT().getText()), "PALETA");
						if (msg == null) {
							view.getTatuagem2JFT().setEnabled(false);
							view.getTatuagem3JFT().setEnabled(true);
							view.getTatuagem3JFT().grabFocus();
						} else if (msg.equals("INEXISTENTE")) {
							msg = "Tatuagem nº" + view.getTatuagem2JFT().getText() + " já foi digitada.";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						} else if (msg.equals("DUPLICADA")) {
							msg = "tatuagem não encontrada não existe no arquivo de frigorífico";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						view.getTatuagem2JFT().setEnabled(false);
						view.getTatuagem3JFT().setEnabled(true);
						view.getTatuagem3JFT().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem3JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem3JFT(), view.getTatuagem3JFT().getText(), 4);
				if (Integer.parseInt(view.getTatuagem1JFT().getText()) == 9999) {
					view.getTatuagem3JFT().setText(" ");
					view.getTatuagem3JFT().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					if (Integer.parseInt(view.getTatuagem3JFT().getText()) != 0) {
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem3JFT().getText()), "PALETA");
						if (msg == null) {
							view.getTatuagem3JFT().setEnabled(false);
							view.getPeso1JFT().setEnabled(true);
							view.getPeso1JFT().grabFocus();
						} else if (msg.equals("INEXISTENTE")) {
							msg = "Tatuagem nº" + view.getTatuagem3JFT().getText() + " já foi digitada.";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						} else if (msg.equals("DUPLICADA")) {
							msg = "tatuagem não encontrada não existe no arquivo de frigorífico";
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						view.getTatuagem3JFT().setEnabled(false);
						view.getPeso1JFT().setEnabled(true);
						view.getPeso1JFT().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getPeso1JFT()) {
				TextFormatter.formatStringJFT(view.getPeso1JFT(), view.getPeso1JFT().getText(), 5);
				view.getPeso1JFT().setEnabled(false);
				view.getPeso2JFT().setEnabled(true);
				view.getPeso2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPeso2JFT()) {
				TextFormatter.formatStringJFT(view.getPeso2JFT(), view.getPeso2JFT().getText(), 5);
				view.getPeso2JFT().setEnabled(false);
				view.getPeso3JFT().setEnabled(true);
				view.getPeso3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPeso3JFT()) {
				TextFormatter.formatStringJFT(view.getPeso3JFT(), view.getPeso3JFT().getText(), 5);
				view.getPeso3JFT().setEnabled(false);
				view.getPelgo1JFT().setEnabled(true);
				view.getPelgo1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPelgo1JFT()) {
				TextFormatter.formatStringJFT(view.getPelgo1JFT(), view.getPelgo1JFT().getText(), 4);
				view.getPelgo1JFT().setEnabled(false);
				view.getPelgo2JFT().setEnabled(true);
				view.getPelgo2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPelgo2JFT()) {
				TextFormatter.formatStringJFT(view.getPelgo2JFT(), view.getPelgo2JFT().getText(), 4);
				view.getPelgo2JFT().setEnabled(false);
				view.getPelgo3JFT().setEnabled(true);
				view.getPelgo3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPelgo3JFT()) {
				TextFormatter.formatStringJFT(view.getPelgo3JFT(), view.getPelgo3JFT().getText(), 4);
				view.getPelgo3JFT().setEnabled(false);
				view.getPegof1JFT().setEnabled(true);
				view.getPegof1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegof1JFT()) {
				TextFormatter.formatStringJFT(view.getPegof1JFT(), view.getPegof1JFT().getText(), 4);
				view.getPegof1JFT().setEnabled(false);
				view.getPegof2JFT().setEnabled(true);
				view.getPegof2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegof2JFT()) {
				TextFormatter.formatStringJFT(view.getPegof2JFT(), view.getPegof2JFT().getText(), 4);
				view.getPegof2JFT().setEnabled(false);
				view.getPegof3JFT().setEnabled(true);
				view.getPegof3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegof3JFT()) {
				TextFormatter.formatStringJFT(view.getPegof3JFT(), view.getPegof3JFT().getText(), 4);
				view.getPegof3JFT().setEnabled(false);
				view.getPegom1JFT().setEnabled(true);
				view.getPegom1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegom1JFT()) {
				TextFormatter.formatStringJFT(view.getPegom1JFT(), view.getPegom1JFT().getText(), 3);
				view.getPegom1JFT().setEnabled(false);
				view.getPegom2JFT().setEnabled(true);
				view.getPegom2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegom2JFT()) {
				TextFormatter.formatStringJFT(view.getPegom2JFT(), view.getPegom2JFT().getText(), 3);
				view.getPegom2JFT().setEnabled(false);
				view.getPegom3JFT().setEnabled(true);
				view.getPegom3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegom3JFT()) {
				TextFormatter.formatStringJFT(view.getPegom3JFT(), view.getPegom3JFT().getText(), 3);
				view.getPegom3JFT().setEnabled(false);
				view.getOsste1JFT().setEnabled(true);
				view.getOsste1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getOsste1JFT()) {
				TextFormatter.formatStringJFT(view.getOsste1JFT(), view.getOsste1JFT().getText(), 4);
				view.getOsste1JFT().setEnabled(false);
				view.getOsste2JFT().setEnabled(true);
				view.getOsste2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getOsste2JFT()) {
				TextFormatter.formatStringJFT(view.getOsste2JFT(), view.getOsste2JFT().getText(), 4);
				view.getOsste2JFT().setEnabled(false);
				view.getOsste3JFT().setEnabled(true);
				view.getOsste3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getOsste3JFT()) {
				TextFormatter.formatStringJFT(view.getOsste3JFT(), view.getOsste3JFT().getText(), 4);
				view.getOsste3JFT().setEnabled(false);
				view.getCama1JFT().setEnabled(true);
				view.getCama1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCama1JFT()) {
				TextFormatter.formatStringJFT(view.getCama1JFT(), view.getCama1JFT().getText(), 4);
				view.getCama1JFT().setEnabled(false);
				view.getCama2JFT().setEnabled(true);
				view.getCama2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCama2JFT()) {
				TextFormatter.formatStringJFT(view.getCama2JFT(), view.getCama2JFT().getText(), 4);
				view.getCama2JFT().setEnabled(false);
				view.getCama3JFT().setEnabled(true);
				view.getCama3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCama3JFT()) {
				TextFormatter.formatStringJFT(view.getCama3JFT(), view.getCama3JFT().getText(), 4);
				view.getCama3JFT().setEnabled(false);
				view.getCmsp1JFT().setEnabled(true);
				view.getCmsp1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCmsp1JFT()) {
				TextFormatter.formatStringJFT(view.getCmsp1JFT(), view.getCmsp1JFT().getText(), 4);
				view.getCmsp1JFT().setEnabled(false);
				view.getCmsp2JFT().setEnabled(true);
				view.getCmsp2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCmsp2JFT()) {
				TextFormatter.formatStringJFT(view.getCmsp2JFT(), view.getCmsp2JFT().getText(), 4);
				view.getCmsp2JFT().setEnabled(false);
				view.getCmsp3JFT().setEnabled(true);
				view.getCmsp3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCmsp3JFT()) {
				TextFormatter.formatStringJFT(view.getCmsp3JFT(), view.getCmsp3JFT().getText(), 4);
				view.getCmsp3JFT().setEnabled(false);
				view.getPalleca1JFT().setEnabled(true);
				view.getPalleca1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPalleca1JFT()) {
				TextFormatter.formatStringJFT(view.getPalleca1JFT(), view.getPalleca1JFT().getText(), 2);
				view.getPalleca1JFT().setEnabled(false);
				view.getPalleca2JFT().setEnabled(true);
				view.getPalleca2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPalleca2JFT()) {
				TextFormatter.formatStringJFT(view.getPalleca2JFT(), view.getPalleca2JFT().getText(), 2);
				view.getPalleca2JFT().setEnabled(false);
				view.getPalleca3JFT().setEnabled(true);
				view.getPalleca3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPalleca3JFT()) {
				TextFormatter.formatStringJFT(view.getPalleca3JFT(), view.getPalleca3JFT().getText(), 2);
				view.getPalleca3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 6);
				if (Integer.parseInt(view.getControleJFT().getText()) == calculaControle()) {
					if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta() == null) {
						controller.getModel().getExperimentoVO().getFrigorificoTempVOST().setPaleta(new ArrayList<>());
						salvarPaleta();
					} else {
						salvarPaleta();
					}
					updateHist();
					view.getPnlPaleta().setBorder(defaultBorder);
					view.getControleJFT().setText("00000");
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				} else {
					view.getPnlPaleta().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				}
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerImportarFrigoST ce = new ControllerImportarFrigoST(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}

	}

	private void carregarHistData() {
		int index = 0;
		for (int n = controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().size() - 1; n >= 0; n--) {
			if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(n).getData()
					.equals(view.getDataJFT().getText())) {
				index = n;
				break;
			}
		}
		if (index != 0) {
			view.getTatuagem3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getTatuagem()));
			view.getPeso3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalpeso()));
			view.getPelgo3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalpelgo()));
			view.getPegof3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalpegof()));
			view.getPegom3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalpegom()));
			view.getOsste3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalosste()));
			view.getCama3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalcama()));
			view.getCmsp3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalcmsp()));
			view.getPalleca3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index).getPalleca()));
			view.getTatuagem2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getTatuagem()));
			view.getPeso2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalpeso()));
			view.getPelgo2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalpelgo()));
			view.getPegof2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalpegof()));
			view.getPegom2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalpegom()));
			view.getOsste2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalosste()));
			view.getCama2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalcama()));
			view.getCmsp2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalcmsp()));
			view.getPalleca2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 1).getPalleca()));
			view.getTatuagem1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getTatuagem()));
			view.getPeso1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalpeso()));
			view.getPelgo1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalpelgo()));
			view.getPegof1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalpegof()));
			view.getPegom1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalpegom()));
			view.getOsste1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalosste()));
			view.getCama1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalcama()));
			view.getCmsp1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalcmsp()));
			view.getPalleca1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta().get(index - 2).getPalleca()));

		} else {
			limparTela();
		}

	}

	private void limparTela() {
		view.getTatuagem1Hist().setText("");
		view.getTatuagem2Hist().setText("");
		view.getTatuagem3Hist().setText("");
		view.getPeso1Hist().setText("");
		view.getPeso2Hist().setText("");
		view.getPeso3Hist().setText("");
		view.getPelgo1Hist().setText("");
		view.getPelgo2Hist().setText("");
		view.getPelgo3Hist().setText("");
		view.getPegof1Hist().setText("");
		view.getPegof2Hist().setText("");
		view.getPegof3Hist().setText("");
		view.getPegom1Hist().setText("");
		view.getPegom2Hist().setText("");
		view.getPegom3Hist().setText("");
		view.getOsste1Hist().setText("");
		view.getOsste2Hist().setText("");
		view.getOsste3Hist().setText("");
		view.getCama1Hist().setText("");
		view.getCama2Hist().setText("");
		view.getCama3Hist().setText("");
		view.getCmsp1Hist().setText("");
		view.getCmsp2Hist().setText("");
		view.getCmsp3Hist().setText("");
		view.getPalleca1Hist().setText("");
		view.getPalleca2Hist().setText("");
		view.getPalleca3Hist().setText("");
		view.getTatuagem1JFT().setText("");
		view.getTatuagem2JFT().setText("");
		view.getTatuagem3JFT().setText("");
		view.getPeso1JFT().setText("");
		view.getPeso2JFT().setText("");
		view.getPeso3JFT().setText("");
		view.getPelgo1JFT().setText("");
		view.getPelgo2JFT().setText("");
		view.getPelgo3JFT().setText("");
		view.getPegof1JFT().setText("");
		view.getPegof2JFT().setText("");
		view.getPegof3JFT().setText("");
		view.getPegom1JFT().setText("");
		view.getPegom2JFT().setText("");
		view.getPegom3JFT().setText("");
		view.getOsste1JFT().setText("");
		view.getOsste2JFT().setText("");
		view.getOsste3JFT().setText("");
		view.getCama1JFT().setText("");
		view.getCama2JFT().setText("");
		view.getCama3JFT().setText("");
		view.getCmsp1JFT().setText("");
		view.getCmsp2JFT().setText("");
		view.getCmsp3JFT().setText("");
		view.getPalleca1JFT().setText("");
		view.getPalleca2JFT().setText("");
		view.getPalleca3JFT().setText("");
	}

	private void salvarPaleta() {

		if (Integer.parseInt(view.getTatuagem1JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta()
					.add(new PaletaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem1JFT().getText()),
							Integer.parseInt(view.getPeso1JFT().getText()), Integer.parseInt(view.getPelgo1JFT().getText()),
							Integer.parseInt(view.getPegof1JFT().getText()), Integer.parseInt(view.getPegom1JFT().getText()),
							Integer.parseInt(view.getOsste1JFT().getText()), Integer.parseInt(view.getCama1JFT().getText()),
							Integer.parseInt(view.getCmsp1JFT().getText()), Integer.parseInt(view.getPalleca1JFT().getText())));
		}
		if (Integer.parseInt(view.getTatuagem2JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta()
					.add(new PaletaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem2JFT().getText()),
							Integer.parseInt(view.getPeso2JFT().getText()), Integer.parseInt(view.getPelgo2JFT().getText()),
							Integer.parseInt(view.getPegof2JFT().getText()), Integer.parseInt(view.getPegom2JFT().getText()),
							Integer.parseInt(view.getOsste2JFT().getText()), Integer.parseInt(view.getCama2JFT().getText()),
							Integer.parseInt(view.getCmsp2JFT().getText()), Integer.parseInt(view.getPalleca2JFT().getText())));
		}

		if (Integer.parseInt(view.getTatuagem3JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta()
					.add(new PaletaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem3JFT().getText()),
							Integer.parseInt(view.getPeso3JFT().getText()), Integer.parseInt(view.getPelgo3JFT().getText()),
							Integer.parseInt(view.getPegof3JFT().getText()), Integer.parseInt(view.getPegom3JFT().getText()),
							Integer.parseInt(view.getOsste3JFT().getText()), Integer.parseInt(view.getCama3JFT().getText()),
							Integer.parseInt(view.getCmsp3JFT().getText()), Integer.parseInt(view.getPalleca3JFT().getText())));
		}

		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void loadHist() {
		if (paletaHist.size() > 0) {
			for (int k = 1; k <= 3; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getTatuagem()));
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalpeso()));
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalpelgo()));
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalpegof()));
				orderHist.remove(0);
				JLabel lbl5 = (JLabel) orderHist.get(0);
				lbl5.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalpegom()));
				orderHist.remove(0);
				JLabel lbl6 = (JLabel) orderHist.get(0);
				lbl6.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalosste()));
				orderHist.remove(0);
				JLabel lbl7 = (JLabel) orderHist.get(0);
				lbl7.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalcama()));
				orderHist.remove(0);
				JLabel lbl8 = (JLabel) orderHist.get(0);
				lbl8.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalcmsp()));
				orderHist.remove(0);
				JLabel lbl9 = (JLabel) orderHist.get(0);
				lbl9.setText(String.valueOf(paletaHist.get(paletaHist.size() - k).getPalleca()));
				orderHist.remove(0);
			}
			view.getDataJFT().setText(paletaHist.get(paletaHist.size() - 1).getData());
			criarOrdemComponentesHist();
		} else {
			for (Component c : orderHist) {
				JLabel lbl = (JLabel) c;
				lbl.setText("0");
			}
		}
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	@Override
	public void focusGained(FocusEvent e) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				((JFormattedTextField) e.getSource()).setCaretPosition(0);
				((JFormattedTextField) e.getSource()).selectAll();
			}
		});
	}

	@Override
	public void focusLost(FocusEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getDataJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

	}

	public void updateHist() {
		view.getTatuagem1Hist().setText(view.getTatuagem1JFT().getText());
		view.getTatuagem2Hist().setText(view.getTatuagem2JFT().getText());
		view.getTatuagem3Hist().setText(view.getTatuagem3JFT().getText());
		view.getPeso1Hist().setText(view.getTatuagem1JFT().getText());
		view.getPeso2Hist().setText(view.getTatuagem2JFT().getText());
		view.getPeso3Hist().setText(view.getTatuagem3JFT().getText());
		view.getPelgo1Hist().setText(view.getPelgo1JFT().getText());
		view.getPelgo2Hist().setText(view.getPelgo2JFT().getText());
		view.getPelgo3Hist().setText(view.getPelgo3JFT().getText());
		view.getPegof1Hist().setText(view.getPegof1JFT().getText());
		view.getPegof2Hist().setText(view.getPegof1JFT().getText());
		view.getPegof3Hist().setText(view.getPegof1JFT().getText());
		view.getPegom1Hist().setText(view.getPegom1JFT().getText());
		view.getPegom2Hist().setText(view.getPegom2JFT().getText());
		view.getPegom3Hist().setText(view.getPegom3JFT().getText());
		view.getOsste1Hist().setText(view.getOsste1JFT().getText());
		view.getOsste2Hist().setText(view.getOsste2JFT().getText());
		view.getOsste3Hist().setText(view.getOsste3JFT().getText());
		view.getCama1Hist().setText(view.getCama1JFT().getText());
		view.getCama2Hist().setText(view.getCama2JFT().getText());
		view.getCama3Hist().setText(view.getCama3JFT().getText());
		view.getCmsp1Hist().setText(view.getCmsp1JFT().getText());
		view.getCmsp2Hist().setText(view.getCmsp2JFT().getText());
		view.getCmsp3Hist().setText(view.getCmsp3JFT().getText());
		view.getPalleca1Hist().setText(view.getPalleca1JFT().getText());
		view.getPalleca2Hist().setText(view.getPalleca2JFT().getText());
		view.getPalleca3Hist().setText(view.getPalleca3JFT().getText());

		view.getTatuagem1JFT().setText("");
		view.getTatuagem2JFT().setText("");
		view.getTatuagem3JFT().setText("");
		view.getPeso1JFT().setText("");
		view.getPeso2JFT().setText("");
		view.getPeso3JFT().setText("");
		view.getPelgo1JFT().setText("");
		view.getPelgo2JFT().setText("");
		view.getPelgo3JFT().setText("");
		view.getPegof1JFT().setText("");
		view.getPegof2JFT().setText("");
		view.getPegof3JFT().setText("");
		view.getPegom1JFT().setText("");
		view.getPegom2JFT().setText("");
		view.getPegom3JFT().setText("");
		view.getOsste1JFT().setText("");
		view.getOsste2JFT().setText("");
		view.getOsste3JFT().setText("");
		view.getCama1JFT().setText("");
		view.getCama2JFT().setText("");
		view.getCama3JFT().setText("");
		view.getCmsp1JFT().setText("");
		view.getCmsp2JFT().setText("");
		view.getCmsp3JFT().setText("");
		view.getPalleca1JFT().setText("");
		view.getPalleca2JFT().setText("");
		view.getPalleca3JFT().setText("");
	}

	private Integer calculaControle() {
		int soma = 0;
		soma += Integer.parseInt(view.getTatuagem1JFT().getText());
		soma += Integer.parseInt(view.getTatuagem2JFT().getText());
		soma += Integer.parseInt(view.getTatuagem3JFT().getText());

		soma += Integer.parseInt(view.getPeso1JFT().getText());
		soma += Integer.parseInt(view.getPeso2JFT().getText());
		soma += Integer.parseInt(view.getPeso3JFT().getText());

		soma += Integer.parseInt(view.getPelgo1JFT().getText());
		soma += Integer.parseInt(view.getPelgo2JFT().getText());
		soma += Integer.parseInt(view.getPelgo3JFT().getText());

		soma += Integer.parseInt(view.getPegof1JFT().getText());
		soma += Integer.parseInt(view.getPegof2JFT().getText());
		soma += Integer.parseInt(view.getPegof3JFT().getText());

		soma += Integer.parseInt(view.getPegom1JFT().getText());
		soma += Integer.parseInt(view.getPegom2JFT().getText());
		soma += Integer.parseInt(view.getPegom3JFT().getText());

		soma += Integer.parseInt(view.getOsste1JFT().getText());
		soma += Integer.parseInt(view.getOsste2JFT().getText());
		soma += Integer.parseInt(view.getOsste3JFT().getText());

		soma += Integer.parseInt(view.getCama1JFT().getText());
		soma += Integer.parseInt(view.getCama2JFT().getText());
		soma += Integer.parseInt(view.getCama3JFT().getText());

		soma += Integer.parseInt(view.getCmsp1JFT().getText());
		soma += Integer.parseInt(view.getCmsp2JFT().getText());
		soma += Integer.parseInt(view.getCmsp3JFT().getText());

		soma += Integer.parseInt(view.getPalleca1JFT().getText());
		soma += Integer.parseInt(view.getPalleca2JFT().getText());
		soma += Integer.parseInt(view.getPalleca3JFT().getText());

		return soma;
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTatuagem1JFT());
		order.add(view.getTatuagem2JFT());
		order.add(view.getTatuagem3JFT());
		order.add(view.getPeso1JFT());
		order.add(view.getPeso2JFT());
		order.add(view.getPeso3JFT());
		order.add(view.getPelgo1JFT());
		order.add(view.getPelgo2JFT());
		order.add(view.getPelgo3JFT());
		order.add(view.getPegof1JFT());
		order.add(view.getPegof2JFT());
		order.add(view.getPegof3JFT());
		order.add(view.getPegom1JFT());
		order.add(view.getPegom2JFT());
		order.add(view.getPegom3JFT());
		order.add(view.getOsste1JFT());
		order.add(view.getOsste2JFT());
		order.add(view.getOsste3JFT());
		order.add(view.getCama1JFT());
		order.add(view.getCama2JFT());
		order.add(view.getCama3JFT());
		order.add(view.getCmsp1JFT());
		order.add(view.getCmsp2JFT());
		order.add(view.getCmsp3JFT());
		order.add(view.getPalleca1JFT());
		order.add(view.getPalleca2JFT());
		order.add(view.getPalleca3JFT());
		order.add(view.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getTatuagem3Hist());
		orderHist.add(view.getPeso3Hist());
		orderHist.add(view.getPelgo3Hist());
		orderHist.add(view.getPegof3Hist());
		orderHist.add(view.getPegom3Hist());
		orderHist.add(view.getOsste3Hist());
		orderHist.add(view.getCama3Hist());
		orderHist.add(view.getCmsp3Hist());
		orderHist.add(view.getPalleca3Hist());
		orderHist.add(view.getTatuagem2Hist());
		orderHist.add(view.getPeso2Hist());
		orderHist.add(view.getPelgo2Hist());
		orderHist.add(view.getPegof2Hist());
		orderHist.add(view.getPegom2Hist());
		orderHist.add(view.getOsste2Hist());
		orderHist.add(view.getCama2Hist());
		orderHist.add(view.getCmsp2Hist());
		orderHist.add(view.getPalleca2Hist());
		orderHist.add(view.getTatuagem1Hist());
		orderHist.add(view.getPeso1Hist());
		orderHist.add(view.getPelgo1Hist());
		orderHist.add(view.getPegof1Hist());
		orderHist.add(view.getPegom1Hist());
		orderHist.add(view.getOsste1Hist());
		orderHist.add(view.getCama1Hist());
		orderHist.add(view.getCmsp1Hist());
		orderHist.add(view.getPalleca1Hist());
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	public List<PaletaVOST> getPaletaHist() {
		return paletaHist;
	}

	public void setPaletaHist(List<PaletaVOST> paletaHist) {
		this.paletaHist = paletaHist;
	}

}
