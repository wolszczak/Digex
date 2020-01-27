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
import brf.suino.model.vo.PernilVOST;
import brf.suino.view.ViewDigitarPernilST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerPernilST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewDigitarPernilST view;
	private Border defaultBorder;
	private List<Component> order, orderHist;
	private List<String> datasFases;
	private DigitacaoFrigoBOST bo;
	private List<PernilVOST> PernilHist;

	public ControllerPernilST(ControllerST controller) {
		this.controller = controller;
		this.bo = new DigitacaoFrigoBOST(controller);
		this.PernilHist = new ArrayList<>();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().size() > 0) {
			this.PernilHist.addAll(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil());
		} else {
			PernilHist = new ArrayList<>();
		}
		view = new ViewDigitarPernilST();
		view.setTitle("DIGEX - Avaliação Pernil");
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
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem1JFT().getText()));
					if (msg == null) {
						view.getTatuagem1JFT().setEnabled(false);
						view.getTatuagem2JFT().setEnabled(true);
						view.getTatuagem2JFT().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagem1JFT().grabFocus();
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
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem2JFT().getText()));
					if (msg == null) {
						view.getTatuagem2JFT().setEnabled(false);
						view.getTatuagem3JFT().setEnabled(true);
						view.getTatuagem3JFT().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagem2JFT().grabFocus();
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
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem3JFT().getText()));
					if (msg == null) {
						view.getTatuagem3JFT().setEnabled(false);
						view.getPeso1JFT().setEnabled(true);
						view.getPeso1JFT().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagem3JFT().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getPeso1JFT()) {
				TextFormatter.formatStringJFT(view.getPeso1JFT(), view.getPeso1JFT().getText(), 4);
				view.getPeso1JFT().setEnabled(false);
				view.getPeso2JFT().setEnabled(true);
				view.getPeso2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPeso2JFT()) {
				TextFormatter.formatStringJFT(view.getPeso2JFT(), view.getPeso2JFT().getText(), 4);
				view.getPeso2JFT().setEnabled(false);
				view.getPeso3JFT().setEnabled(true);
				view.getPeso3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPeso3JFT()) {
				TextFormatter.formatStringJFT(view.getPeso3JFT(), view.getPeso3JFT().getText(), 4);
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
				TextFormatter.formatStringJFT(view.getPegof1JFT(), view.getPegof1JFT().getText(), 2);
				view.getPegof1JFT().setEnabled(false);
				view.getPegof2JFT().setEnabled(true);
				view.getPegof2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegof2JFT()) {
				TextFormatter.formatStringJFT(view.getPegof2JFT(), view.getPegof2JFT().getText(), 2);
				view.getPegof2JFT().setEnabled(false);
				view.getPegof3JFT().setEnabled(true);
				view.getPegof3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPegof3JFT()) {
				TextFormatter.formatStringJFT(view.getPegof3JFT(), view.getPegof3JFT().getText(), 2);
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
				TextFormatter.formatStringJFT(view.getOsste1JFT(), view.getOsste1JFT().getText(), 2);
				view.getOsste1JFT().setEnabled(false);
				view.getOsste2JFT().setEnabled(true);
				view.getOsste2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getOsste2JFT()) {
				TextFormatter.formatStringJFT(view.getOsste2JFT(), view.getOsste2JFT().getText(), 2);
				view.getOsste2JFT().setEnabled(false);
				view.getOsste3JFT().setEnabled(true);
				view.getOsste3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getOsste3JFT()) {
				TextFormatter.formatStringJFT(view.getOsste3JFT(), view.getOsste3JFT().getText(), 2);
				view.getOsste3JFT().setEnabled(false);
				view.getMuscu1JFT().setEnabled(true);
				view.getMuscu1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getMuscu1JFT()) {
				TextFormatter.formatStringJFT(view.getMuscu1JFT(), view.getMuscu1JFT().getText(), 2);
				view.getMuscu1JFT().setEnabled(false);
				view.getMuscu2JFT().setEnabled(true);
				view.getMuscu2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getMuscu2JFT()) {
				TextFormatter.formatStringJFT(view.getMuscu2JFT(), view.getMuscu2JFT().getText(), 2);
				view.getMuscu2JFT().setEnabled(false);
				view.getMuscu3JFT().setEnabled(true);
				view.getMuscu3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getMuscu3JFT()) {
				TextFormatter.formatStringJFT(view.getMuscu3JFT(), view.getMuscu3JFT().getText(), 2);
				view.getMuscu3JFT().setEnabled(false);
				view.getPe1JFT().setEnabled(true);
				view.getPe1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPe1JFT()) {
				TextFormatter.formatStringJFT(view.getPe1JFT(), view.getPe1JFT().getText(), 2);
				view.getPe1JFT().setEnabled(false);
				view.getPe2JFT().setEnabled(true);
				view.getPe2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPe2JFT()) {
				TextFormatter.formatStringJFT(view.getPe2JFT(), view.getPe2JFT().getText(), 2);
				view.getPe2JFT().setEnabled(false);
				view.getPe3JFT().setEnabled(true);
				view.getPe3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPe3JFT()) {
				TextFormatter.formatStringJFT(view.getPe3JFT(), view.getPe3JFT().getText(), 2);
				view.getPe3JFT().setEnabled(false);
				view.getJpc1JFT().setEnabled(true);
				view.getJpc1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getJpc1JFT()) {
				TextFormatter.formatStringJFT(view.getJpc1JFT(), view.getJpc1JFT().getText(), 2);
				view.getJpc1JFT().setEnabled(false);
				view.getJpc2JFT().setEnabled(true);
				view.getJpc2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getJpc2JFT()) {
				TextFormatter.formatStringJFT(view.getJpc2JFT(), view.getJpc2JFT().getText(), 2);
				view.getJpc2JFT().setEnabled(false);
				view.getJpc3JFT().setEnabled(true);
				view.getJpc3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getJpc3JFT()) {
				TextFormatter.formatStringJFT(view.getJpc3JFT(), view.getJpc3JFT().getText(), 2);
				view.getJpc3JFT().setEnabled(false);
				view.getPh1JFT().setEnabled(true);
				view.getPh1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPh1JFT()) {
				TextFormatter.formatStringJFT(view.getPh1JFT(), view.getPh1JFT().getText(), 2);
				view.getPh1JFT().setEnabled(false);
				view.getPh2JFT().setEnabled(true);
				view.getPh2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPh2JFT()) {
				TextFormatter.formatStringJFT(view.getPh2JFT(), view.getPh2JFT().getText(), 2);
				view.getPh2JFT().setEnabled(false);
				view.getPh3JFT().setEnabled(true);
				view.getPh3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPh3JFT()) {
				TextFormatter.formatStringJFT(view.getPh3JFT(), view.getPh3JFT().getText(), 2);
				view.getPh3JFT().setEnabled(false);
				view.getIni1JFT().setEnabled(true);
				view.getIni1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getIni1JFT()) {
				TextFormatter.formatStringJFT(view.getIni1JFT(), view.getIni1JFT().getText(), 2);
				view.getIni1JFT().setEnabled(false);
				view.getIni2JFT().setEnabled(true);
				view.getIni2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getIni2JFT()) {
				TextFormatter.formatStringJFT(view.getIni2JFT(), view.getIni2JFT().getText(), 2);
				view.getIni2JFT().setEnabled(false);
				view.getIni3JFT().setEnabled(true);
				view.getIni3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getIni3JFT()) {
				TextFormatter.formatStringJFT(view.getIni3JFT(), view.getIni3JFT().getText(), 2);
				view.getIni3JFT().setEnabled(false);
				view.getFin1JFT().setEnabled(true);
				view.getFin1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFin1JFT()) {
				TextFormatter.formatStringJFT(view.getFin1JFT(), view.getFin1JFT().getText(), 2);
				view.getFin1JFT().setEnabled(false);
				view.getFin2JFT().setEnabled(true);
				view.getFin2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFin2JFT()) {
				TextFormatter.formatStringJFT(view.getFin2JFT(), view.getFin2JFT().getText(), 2);
				view.getFin2JFT().setEnabled(false);
				view.getFin3JFT().setEnabled(true);
				view.getFin3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFin3JFT()) {
				TextFormatter.formatStringJFT(view.getFin3JFT(), view.getFin3JFT().getText(), 2);
				view.getFin3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 5);
				if (Integer.parseInt(view.getControleJFT().getText()) == calculaControle()) {
					if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil() == null) {
						controller.getModel().getExperimentoVO().getFrigorificoTempVOST().setPernil(new ArrayList<>());
						salvarPernil();
					} else {
						salvarPernil();
					}
					updateHist();
					view.getPnlPernil().setBorder(defaultBorder);
					view.getControleJFT().setText("00000");
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				} else {
					view.getPnlPernil().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				}
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE)

		{
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
		for (int n = controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().size() - 1; n >= 0; n--) {
			if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(n).getData()
					.equals(view.getDataJFT().getText())) {
				index = n;
				break;
			}
		}
		if (index != 0) {
			view.getTatuagem3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getTatuagem()));
			view.getPeso3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpeso()));
			view.getPelgo3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpelgo()));
			view.getPegof3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpegof()));
			view.getPegom3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpegom()));
			view.getOsste3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerosste()));
			view.getMuscu3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPermusc()));
			view.getPe3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpe()));
			view.getJpc3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPercjpcs()));
			view.getPh3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerpeh24()));
			view.getIni3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerdini()));
			view.getFin3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index).getPerdfin()));
			view.getTatuagem2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getTatuagem()));
			view.getPeso2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpeso()));
			view.getPelgo2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpelgo()));
			view.getPegof2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpegof()));
			view.getPegom2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpegom()));
			view.getOsste2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerosste()));
			view.getMuscu2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPermusc()));
			view.getPe2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpe()));
			view.getJpc2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPercjpcs()));
			view.getPh2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerpeh24()));
			view.getIni2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerdini()));
			view.getFin2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 1).getPerdfin()));
			view.getTatuagem1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getTatuagem()));
			view.getPeso1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpeso()));
			view.getPelgo1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpelgo()));
			view.getPegof1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpegof()));
			view.getPegom1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpegom()));
			view.getOsste1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerosste()));
			view.getMuscu1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPermusc()));
			view.getPe1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpe()));
			view.getJpc1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPercjpcs()));
			view.getPh1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerpeh24()));
			view.getIni1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerdini()));
			view.getFin1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil().get(index - 2).getPerdfin()));
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
		view.getMuscu3JFT().setText("");
	}

	private void salvarPernil() {
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil()
				.add(new PernilVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem1JFT().getText()),
						Integer.parseInt(view.getPeso1JFT().getText()), Integer.parseInt(view.getPelgo1JFT().getText()),
						Integer.parseInt(view.getPegof1JFT().getText()), Integer.parseInt(view.getPegom1JFT().getText()),
						Integer.parseInt(view.getOsste1JFT().getText()), Integer.parseInt(view.getMuscu1JFT().getText()),
						Integer.parseInt(view.getPe1JFT().getText()), Integer.parseInt(view.getJpc1JFT().getText()),
						Integer.parseInt(view.getPh1JFT().getText()), Integer.parseInt(view.getIni1JFT().getText()),
						Integer.parseInt(view.getFin1JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil()
				.add(new PernilVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem2JFT().getText()),
						Integer.parseInt(view.getPeso2JFT().getText()), Integer.parseInt(view.getPelgo2JFT().getText()),
						Integer.parseInt(view.getPegof2JFT().getText()), Integer.parseInt(view.getPegom2JFT().getText()),
						Integer.parseInt(view.getOsste2JFT().getText()), Integer.parseInt(view.getMuscu2JFT().getText()),
						Integer.parseInt(view.getPe2JFT().getText()), Integer.parseInt(view.getJpc2JFT().getText()),
						Integer.parseInt(view.getPh2JFT().getText()), Integer.parseInt(view.getIni2JFT().getText()),
						Integer.parseInt(view.getFin2JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil()
				.add(new PernilVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem3JFT().getText()),
						Integer.parseInt(view.getPeso3JFT().getText()), Integer.parseInt(view.getPelgo3JFT().getText()),
						Integer.parseInt(view.getPegof3JFT().getText()), Integer.parseInt(view.getPegom3JFT().getText()),
						Integer.parseInt(view.getMuscu3JFT().getText()), Integer.parseInt(view.getMuscu3JFT().getText()),
						Integer.parseInt(view.getPe3JFT().getText()), Integer.parseInt(view.getJpc3JFT().getText()),
						Integer.parseInt(view.getPh3JFT().getText()), Integer.parseInt(view.getIni3JFT().getText()),
						Integer.parseInt(view.getFin3JFT().getText())));
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void loadHist() {
		if (PernilHist.size() > 0) {
			for (int k = 1; k <= 3; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getTatuagem()));
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpeso()));
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpelgo()));
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpegof()));
				orderHist.remove(0);
				JLabel lbl5 = (JLabel) orderHist.get(0);
				lbl5.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpegom()));
				orderHist.remove(0);
				JLabel lbl6 = (JLabel) orderHist.get(0);
				lbl6.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerosste()));
				orderHist.remove(0);
				JLabel lbl7 = (JLabel) orderHist.get(0);
				lbl7.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPermusc()));
				orderHist.remove(0);
				JLabel lbl8 = (JLabel) orderHist.get(0);
				lbl8.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpe()));
				orderHist.remove(0);
				JLabel lbl9 = (JLabel) orderHist.get(0);
				lbl9.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPercjpcs()));
				orderHist.remove(0);
				JLabel lbl10 = (JLabel) orderHist.get(0);
				lbl10.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerpeh24()));
				orderHist.remove(0);
				JLabel lbl11 = (JLabel) orderHist.get(0);
				lbl11.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerdini()));
				orderHist.remove(0);
				JLabel lbl12 = (JLabel) orderHist.get(0);
				lbl12.setText(String.valueOf(PernilHist.get(PernilHist.size() - k).getPerdfin()));
				orderHist.remove(0);
			}
			view.getDataJFT().setText(PernilHist.get(PernilHist.size() - 1).getData());
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
		view.getOsste3Hist().setText(view.getMuscu3JFT().getText());

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
		view.getMuscu3JFT().setText("");
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
		soma += Integer.parseInt(view.getMuscu3JFT().getText());
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
		order.add(view.getMuscu3JFT());
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
		orderHist.add(view.getMuscu3Hist());
		orderHist.add(view.getPe3Hist());
		orderHist.add(view.getJpc3Hist());
		orderHist.add(view.getPh3Hist());
		orderHist.add(view.getIni3Hist());
		orderHist.add(view.getFin3Hist());
		orderHist.add(view.getTatuagem2Hist());
		orderHist.add(view.getPeso2Hist());
		orderHist.add(view.getPelgo2Hist());
		orderHist.add(view.getPegof2Hist());
		orderHist.add(view.getPegom2Hist());
		orderHist.add(view.getOsste2Hist());
		orderHist.add(view.getMuscu2Hist());
		orderHist.add(view.getPe2Hist());
		orderHist.add(view.getJpc2Hist());
		orderHist.add(view.getPh2Hist());
		orderHist.add(view.getIni2Hist());
		orderHist.add(view.getFin2Hist());
		orderHist.add(view.getTatuagem1Hist());
		orderHist.add(view.getPeso1Hist());
		orderHist.add(view.getPelgo1Hist());
		orderHist.add(view.getPegof1Hist());
		orderHist.add(view.getPegom1Hist());
		orderHist.add(view.getOsste1Hist());
		orderHist.add(view.getMuscu1Hist());
		orderHist.add(view.getPe1Hist());
		orderHist.add(view.getJpc1Hist());
		orderHist.add(view.getPh1Hist());
		orderHist.add(view.getIni1Hist());
		orderHist.add(view.getFin1Hist());
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	public List<PernilVOST> getPernilHist() {
		return PernilHist;
	}

	public void setPernilHist(List<PernilVOST> PernilHist) {
		this.PernilHist = PernilHist;
	}

}
