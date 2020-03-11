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
import brf.suino.model.vo.CostadoVOST;
import brf.suino.model.vo.CostadoVOST;
import brf.suino.view.ViewDigitarCostadoST;
import brf.suino.view.ViewDigitarCostadoST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerCostadoST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewDigitarCostadoST view;
	private Border defaultBorder;
	private List<Component> order, orderHist;
	private List<String> datasFases;
	private DigitacaoFrigoBOST bo;
	private List<CostadoVOST> costadoHist;

	public ControllerCostadoST(ControllerST controller) {
		this.controller = controller;
		this.bo = new DigitacaoFrigoBOST(controller);
		this.costadoHist = new ArrayList<>();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().size() > 0) {
			this.costadoHist.addAll(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado());
		} else {
			costadoHist = new ArrayList<>();
		}
		view = new ViewDigitarCostadoST();
		view.setTitle("DIGEX - Avaliação Costado");
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
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem1JFT().getText()), "COSTADO");
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
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem2JFT().getText()), "COSTADO");
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
						String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem3JFT().getText()), "COSTADO");
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
				view.getLombo1JFT().setEnabled(true);
				view.getLombo1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getLombo1JFT()) {
				TextFormatter.formatStringJFT(view.getLombo1JFT(), view.getLombo1JFT().getText(), 4);
				view.getLombo1JFT().setEnabled(false);
				view.getLombo2JFT().setEnabled(true);
				view.getLombo2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getLombo2JFT()) {
				TextFormatter.formatStringJFT(view.getLombo2JFT(), view.getLombo2JFT().getText(), 4);
				view.getLombo2JFT().setEnabled(false);
				view.getLombo3JFT().setEnabled(true);
				view.getLombo3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getLombo3JFT()) {
				TextFormatter.formatStringJFT(view.getLombo3JFT(), view.getLombo3JFT().getText(), 4);
				view.getLombo3JFT().setEnabled(false);
				view.getReta1JFT().setEnabled(true);
				view.getReta1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getReta1JFT()) {
				TextFormatter.formatStringJFT(view.getReta1JFT(), view.getReta1JFT().getText(), 4);
				view.getReta1JFT().setEnabled(false);
				view.getReta2JFT().setEnabled(true);
				view.getReta2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getReta2JFT()) {
				TextFormatter.formatStringJFT(view.getReta2JFT(), view.getReta2JFT().getText(), 4);
				view.getReta2JFT().setEnabled(false);
				view.getReta3JFT().setEnabled(true);
				view.getReta3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getReta3JFT()) {
				TextFormatter.formatStringJFT(view.getReta3JFT(), view.getReta3JFT().getText(), 4);
				view.getReta3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 5);
				if (Integer.parseInt(view.getControleJFT().getText()) == calculaControle()) {
					if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado() == null) {
						controller.getModel().getExperimentoVO().getFrigorificoTempVOST().setCostado(new ArrayList<>());
						salvarCostado();
					} else {
						salvarCostado();
					}
					updateHist();
					view.getPnlCostado().setBorder(defaultBorder);
					view.getControleJFT().setText("00000");
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				} else {
					view.getPnlCostado().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
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
		for (int n = controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().size() - 1; n >= 0; n--) {
			if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(n).getData()
					.equals(view.getDataJFT().getText())) {
				index = n;
				break;
			}
		}
		if (index != 0) {
			view.getTatuagem3Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getTatuagem()));
			view.getPeso3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getCospeso()));
			view.getOsste3Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getCocosste()));
			view.getPelgo3Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getCospelgo()));
			view.getLombo3Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getCoslombo()));
			view.getReta3Hist().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index).getCosreta()));
			view.getTatuagem2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getTatuagem()));
			view.getPeso2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getCospeso()));
			view.getOsste2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getCocosste()));
			view.getPelgo2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getCospelgo()));
			view.getLombo2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getCoslombo()));
			view.getReta2Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 1).getCosreta()));
			view.getTatuagem1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getTatuagem()));
			view.getPeso1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getCospeso()));
			view.getOsste1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getCocosste()));
			view.getPelgo1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getCospelgo()));
			view.getLombo1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getCoslombo()));
			view.getReta1Hist().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado().get(index - 2).getCosreta()));
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
		view.getOsste1Hist().setText("");
		view.getOsste2Hist().setText("");
		view.getOsste3Hist().setText("");
		view.getPelgo1Hist().setText("");
		view.getPelgo2Hist().setText("");
		view.getPelgo3Hist().setText("");
		view.getLombo1Hist().setText("");
		view.getLombo2Hist().setText("");
		view.getLombo3Hist().setText("");
		view.getReta1Hist().setText("");
		view.getReta2Hist().setText("");
		view.getReta3Hist().setText("");
	}

	private void salvarCostado() {
		if (Integer.parseInt(view.getTatuagem1JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado()
					.add(new CostadoVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem1JFT().getText()),
							Integer.parseInt(view.getPeso1JFT().getText()), Integer.parseInt(view.getOsste1JFT().getText()),
							Integer.parseInt(view.getPelgo1JFT().getText()), Integer.parseInt(view.getLombo1JFT().getText()),
							Integer.parseInt(view.getReta1JFT().getText())));
		}

		if (Integer.parseInt(view.getTatuagem2JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado()
					.add(new CostadoVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem2JFT().getText()),
							Integer.parseInt(view.getPeso2JFT().getText()), Integer.parseInt(view.getOsste2JFT().getText()),
							Integer.parseInt(view.getPelgo2JFT().getText()), Integer.parseInt(view.getLombo2JFT().getText()),
							Integer.parseInt(view.getReta2JFT().getText())));
		}
		if (Integer.parseInt(view.getTatuagem3JFT().getText()) != 0) {
			controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado()
					.add(new CostadoVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem3JFT().getText()),
							Integer.parseInt(view.getPeso3JFT().getText()), Integer.parseInt(view.getOsste3JFT().getText()),
							Integer.parseInt(view.getPelgo3JFT().getText()), Integer.parseInt(view.getLombo3JFT().getText()),
							Integer.parseInt(view.getReta3JFT().getText())));
		}

		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void loadHist() {
		if (costadoHist.size() > 0) {
			for (int k = 1; k <= 3; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getTatuagem()));
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getCospeso()));
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getCocosste()));
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getCospelgo()));
				orderHist.remove(0);
				JLabel lbl5 = (JLabel) orderHist.get(0);
				lbl5.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getCoslombo()));
				orderHist.remove(0);
				JLabel lbl6 = (JLabel) orderHist.get(0);
				lbl6.setText(String.valueOf(costadoHist.get(costadoHist.size() - k).getCosreta()));
				orderHist.remove(0);
			}
			view.getDataJFT().setText(costadoHist.get(costadoHist.size() - 1).getData());
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
		view.getOsste1Hist().setText(view.getOsste1JFT().getText());
		view.getOsste2Hist().setText(view.getOsste2JFT().getText());
		view.getOsste3Hist().setText(view.getOsste3JFT().getText());
		view.getPelgo1Hist().setText(view.getPelgo1JFT().getText());
		view.getPelgo2Hist().setText(view.getPelgo1JFT().getText());
		view.getPelgo3Hist().setText(view.getPelgo1JFT().getText());
		view.getLombo1Hist().setText(view.getLombo1JFT().getText());
		view.getLombo2Hist().setText(view.getLombo2JFT().getText());
		view.getLombo3Hist().setText(view.getLombo3JFT().getText());
		view.getReta1Hist().setText(view.getReta1JFT().getText());
		view.getReta2Hist().setText(view.getReta2JFT().getText());
		view.getReta3Hist().setText(view.getReta3JFT().getText());

		view.getTatuagem1JFT().setText("");
		view.getTatuagem2JFT().setText("");
		view.getTatuagem3JFT().setText("");
		view.getPeso1JFT().setText("");
		view.getPeso2JFT().setText("");
		view.getPeso3JFT().setText("");
		view.getOsste1JFT().setText("");
		view.getOsste2JFT().setText("");
		view.getOsste3JFT().setText("");
		view.getPelgo1JFT().setText("");
		view.getPelgo2JFT().setText("");
		view.getPelgo3JFT().setText("");
		view.getLombo1JFT().setText("");
		view.getLombo2JFT().setText("");
		view.getLombo3JFT().setText("");
		view.getReta1JFT().setText("");
		view.getReta2JFT().setText("");
		view.getReta3JFT().setText("");
	}

	private Integer calculaControle() {
		int soma = 0;
		soma += Integer.parseInt(view.getTatuagem1JFT().getText());
		soma += Integer.parseInt(view.getTatuagem2JFT().getText());
		soma += Integer.parseInt(view.getTatuagem3JFT().getText());

		soma += Integer.parseInt(view.getPeso1JFT().getText());
		soma += Integer.parseInt(view.getPeso2JFT().getText());
		soma += Integer.parseInt(view.getPeso3JFT().getText());

		soma += Integer.parseInt(view.getOsste1JFT().getText());
		soma += Integer.parseInt(view.getOsste2JFT().getText());
		soma += Integer.parseInt(view.getOsste3JFT().getText());

		soma += Integer.parseInt(view.getPelgo1JFT().getText());
		soma += Integer.parseInt(view.getPelgo2JFT().getText());
		soma += Integer.parseInt(view.getPelgo3JFT().getText());

		soma += Integer.parseInt(view.getLombo1JFT().getText());
		soma += Integer.parseInt(view.getLombo2JFT().getText());
		soma += Integer.parseInt(view.getLombo3JFT().getText());

		soma += Integer.parseInt(view.getReta1JFT().getText());
		soma += Integer.parseInt(view.getReta2JFT().getText());
		soma += Integer.parseInt(view.getReta3JFT().getText());
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
		order.add(view.getOsste1JFT());
		order.add(view.getOsste2JFT());
		order.add(view.getOsste3JFT());
		order.add(view.getPelgo1JFT());
		order.add(view.getPelgo2JFT());
		order.add(view.getPelgo3JFT());
		order.add(view.getLombo1JFT());
		order.add(view.getLombo2JFT());
		order.add(view.getLombo3JFT());
		order.add(view.getReta1JFT());
		order.add(view.getReta2JFT());
		order.add(view.getReta3JFT());
		order.add(view.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getTatuagem3Hist());
		orderHist.add(view.getPeso3Hist());
		orderHist.add(view.getOsste3Hist());
		orderHist.add(view.getPelgo3Hist());
		orderHist.add(view.getLombo3Hist());
		orderHist.add(view.getReta3Hist());
		orderHist.add(view.getTatuagem2Hist());
		orderHist.add(view.getPeso2Hist());
		orderHist.add(view.getOsste2Hist());
		orderHist.add(view.getPelgo2Hist());
		orderHist.add(view.getLombo2Hist());
		orderHist.add(view.getReta2Hist());
		orderHist.add(view.getTatuagem1Hist());
		orderHist.add(view.getPeso1Hist());
		orderHist.add(view.getOsste1Hist());
		orderHist.add(view.getPelgo1Hist());
		orderHist.add(view.getLombo1Hist());
		orderHist.add(view.getReta1Hist());
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	public List<CostadoVOST> getCostadoHist() {
		return costadoHist;
	}

	public void setCostadoHist(List<CostadoVOST> costadoHist) {
		this.costadoHist = costadoHist;
	}

}
