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
import brf.suino.model.vo.BarrigaVOST;
import brf.suino.view.ViewDigitarBarrigaST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerBarrigaST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewDigitarBarrigaST view;
	private Border defaultBorder;
	private List<Component> order, orderHist;
	private List<String> datasFases;
	private DigitacaoFrigoBOST bo;
	private List<BarrigaVOST> barrigaHist;

	public ControllerBarrigaST(ControllerST controller) {
		this.controller = controller;
		this.bo = new DigitacaoFrigoBOST(controller);
		this.barrigaHist = new ArrayList<>();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().size() > 0) {
			this.barrigaHist.addAll(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga());
		} else {
			barrigaHist = new ArrayList<>();
		}
		view = new ViewDigitarBarrigaST();
		view.setTitle("DIGEX - Avaliação Barriga");
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
					view.getTatuagemJFT1().setEnabled(true);
					view.getTatuagemJFT1().requestFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagemJFT1()) {
				TextFormatter.formatStringJFT(view.getTatuagemJFT1(), view.getTatuagemJFT1().getText(), 4);
				if (Integer.parseInt(view.getTatuagemJFT1().getText()) == 9999) {
					view.getTatuagemJFT1().setText(" ");
					view.getTatuagemJFT1().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagemJFT1().getText()));
					if (msg == null) {
						view.getTatuagemJFT1().setEnabled(false);
						view.getTatuagemJFT2().setEnabled(true);
						view.getTatuagemJFT2().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagemJFT1().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagemJFT2()) {
				TextFormatter.formatStringJFT(view.getTatuagemJFT2(), view.getTatuagemJFT2().getText(), 4);
				if (Integer.parseInt(view.getTatuagemJFT1().getText()) == 9999) {
					view.getTatuagemJFT2().setText(" ");
					view.getTatuagemJFT2().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagemJFT2().getText()));
					if (msg == null) {
						view.getTatuagemJFT2().setEnabled(false);
						view.getTatuagemJFT3().setEnabled(true);
						view.getTatuagemJFT3().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagemJFT2().grabFocus();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagemJFT3()) {
				TextFormatter.formatStringJFT(view.getTatuagemJFT3(), view.getTatuagemJFT3().getText(), 4);
				if (Integer.parseInt(view.getTatuagemJFT1().getText()) == 9999) {
					view.getTatuagemJFT3().setText(" ");
					view.getTatuagemJFT3().setEnabled(false);
					view.getDataJFT().setEnabled(true);
					view.getDataJFT().setText("00/00/0000");
					view.getDataJFT().grabFocus();
					limparTela();
				} else {
					String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagemJFT3().getText()));
					if (msg == null) {
						view.getTatuagemJFT3().setEnabled(false);
						view.getPeso1JFT().setEnabled(true);
						view.getPeso1JFT().grabFocus();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTatuagemJFT3().grabFocus();
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
				view.getCptf1JFT().setEnabled(true);
				view.getCptf1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCptf1JFT()) {
				TextFormatter.formatStringJFT(view.getCptf1JFT(), view.getCptf1JFT().getText(), 4);
				view.getCptf1JFT().setEnabled(false);
				view.getCptf2JFT().setEnabled(true);
				view.getCptf2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCptf2JFT()) {
				TextFormatter.formatStringJFT(view.getCptf2JFT(), view.getCptf2JFT().getText(), 4);
				view.getCptf2JFT().setEnabled(false);
				view.getCptf3JFT().setEnabled(true);
				view.getCptf3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCptf3JFT()) {
				TextFormatter.formatStringJFT(view.getCptf3JFT(), view.getCptf3JFT().getText(), 4);
				view.getCptf3JFT().setEnabled(false);
				view.getPronta1JFT().setEnabled(true);
				view.getPronta1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPronta1JFT()) {
				TextFormatter.formatStringJFT(view.getPronta1JFT(), view.getPronta1JFT().getText(), 4);
				view.getPronta1JFT().setEnabled(false);
				view.getPronta2JFT().setEnabled(true);
				view.getPronta2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPronta2JFT()) {
				TextFormatter.formatStringJFT(view.getPronta2JFT(), view.getPronta2JFT().getText(), 4);
				view.getPronta2JFT().setEnabled(false);
				view.getPronta3JFT().setEnabled(true);
				view.getPronta3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPronta3JFT()) {
				TextFormatter.formatStringJFT(view.getPronta3JFT(), view.getPronta3JFT().getText(), 4);
				view.getPronta3JFT().setEnabled(false);
				view.getEsgor1JFT().setEnabled(true);
				view.getEsgor1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getEsgor1JFT()) {
				TextFormatter.formatStringJFT(view.getEsgor1JFT(), view.getEsgor1JFT().getText(), 3);
				view.getEsgor1JFT().setEnabled(false);
				view.getEsgor2JFT().setEnabled(true);
				view.getEsgor2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getEsgor2JFT()) {
				TextFormatter.formatStringJFT(view.getEsgor2JFT(), view.getEsgor2JFT().getText(), 3);
				view.getEsgor2JFT().setEnabled(false);
				view.getEsgor3JFT().setEnabled(true);
				view.getEsgor3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getEsgor3JFT()) {
				TextFormatter.formatStringJFT(view.getEsgor3JFT(), view.getEsgor3JFT().getText(), 3);
				view.getEsgor3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 5);
				if (Integer.parseInt(view.getControleJFT().getText()) == calculaControle()) {
					if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga() == null) {
						controller.getModel().getExperimentoVO().getFrigorificoTempVOST().setBarriga(new ArrayList<>());
						salvarBarriga();
					} else {
						salvarBarriga();
					}
					updateHist();
					view.getPnlBarriga().setBorder(defaultBorder);
					view.getControleJFT().setText("00000");
					view.getControleJFT().setEnabled(false);
					view.getTatuagemJFT1().setEnabled(true);
					view.getTatuagemJFT1().grabFocus();
				} else {
					view.getPnlBarriga().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					view.getControleJFT().setEnabled(false);
					view.getTatuagemJFT1().setEnabled(true);
					view.getTatuagemJFT1().grabFocus();
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
		for (int n = controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().size() - 1; n >= 0; n--) {
			if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(n).getData()
					.equals(view.getDataJFT().getText())) {
				index = n;
				break;
			}
		}
		if (index != 0) {
			view.getTatuagemHist3_1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index).getTatuagem()));
			view.getPesoHist3().setText(
					String.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index).getBarpeso()));
			view.getCptfHist3().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index).getBarcptpf()));
			view.getProntaHist3().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index).getBarpront()));
			view.getEsgorHist3().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index).getBaresgor()));
			view.getTatuagemHist2().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 1).getTatuagem()));
			view.getPesoHist2().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 1).getBarpeso()));
			view.getCptfHist2().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 1).getBarcptpf()));
			view.getProntaHist2().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 1).getBarpront()));
			view.getEsgorHist2().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 1).getBaresgor()));
			view.getTatuagemHist1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 2).getTatuagem()));
			view.getPesoHist1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 2).getBarpeso()));
			view.getCptfHist1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 2).getBarcptpf()));
			view.getProntaHist1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 2).getBarpront()));
			view.getEsgorHist1().setText(String
					.valueOf(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga().get(index - 2).getBaresgor()));
		} else {
			limparTela();
		}

	}

	private void limparTela() {
		view.getTatuagemHist1().setText("");
		view.getTatuagemHist2().setText("");
		view.getTatuagemHist3_1().setText("");
		view.getPesoHist1().setText("");
		view.getPesoHist2().setText("");
		view.getPesoHist3().setText("");
		view.getCptfHist1().setText("");
		view.getCptfHist2().setText("");
		view.getCptfHist3().setText("");
		view.getProntaHist1().setText("");
		view.getProntaHist2().setText("");
		view.getProntaHist3().setText("");
		view.getEsgorHist1().setText("");
		view.getEsgorHist2().setText("");
		view.getEsgorHist3().setText("");
		view.getTatuagemJFT1().setText("");
		view.getTatuagemJFT2().setText("");
		view.getTatuagemJFT3().setText("");
		view.getPeso1JFT().setText("");
		view.getPeso2JFT().setText("");
		view.getPeso3JFT().setText("");
		view.getCptf1JFT().setText("");
		view.getCptf2JFT().setText("");
		view.getCptf3JFT().setText("");
		view.getPronta1JFT().setText("");
		view.getPronta2JFT().setText("");
		view.getPronta3JFT().setText("");
		view.getEsgor1JFT().setText("");
		view.getEsgor2JFT().setText("");
		view.getEsgor3JFT().setText("");
	}

	private void salvarBarriga() {
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga()
				.add(new BarrigaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagemJFT1().getText()),
						Integer.parseInt(view.getPeso1JFT().getText()), Integer.parseInt(view.getCptf1JFT().getText()),
						Integer.parseInt(view.getPronta1JFT().getText()), Integer.parseInt(view.getEsgor1JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga()
				.add(new BarrigaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagemJFT2().getText()),
						Integer.parseInt(view.getPeso2JFT().getText()), Integer.parseInt(view.getCptf2JFT().getText()),
						Integer.parseInt(view.getPronta2JFT().getText()), Integer.parseInt(view.getEsgor2JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga()
				.add(new BarrigaVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagemJFT3().getText()),
						Integer.parseInt(view.getPeso3JFT().getText()), Integer.parseInt(view.getCptf3JFT().getText()),
						Integer.parseInt(view.getPronta3JFT().getText()), Integer.parseInt(view.getEsgor3JFT().getText())));
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void loadHist() {
		if (barrigaHist.size() > 0) {
			for (int k = 1; k <= 3; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(barrigaHist.get(barrigaHist.size() - k).getTatuagem()));
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(barrigaHist.get(barrigaHist.size() - k).getBarpeso()));
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(barrigaHist.get(barrigaHist.size() - k).getBarcptpf()));
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(barrigaHist.get(barrigaHist.size() - k).getBarpront()));
				orderHist.remove(0);
				JLabel lbl5 = (JLabel) orderHist.get(0);
				lbl5.setText(String.valueOf(barrigaHist.get(barrigaHist.size() - k).getBaresgor()));
				orderHist.remove(0);
			}
			view.getDataJFT().setText(barrigaHist.get(barrigaHist.size() - 1).getData());
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
		view.getTatuagemHist1().setText(view.getTatuagemJFT1().getText());
		view.getTatuagemHist2().setText(view.getTatuagemJFT2().getText());
		view.getTatuagemHist3_1().setText(view.getTatuagemJFT3().getText());
		view.getPesoHist1().setText(view.getTatuagemJFT1().getText());
		view.getPesoHist2().setText(view.getTatuagemJFT2().getText());
		view.getPesoHist3().setText(view.getTatuagemJFT3().getText());
		view.getCptfHist1().setText(view.getCptf1JFT().getText());
		view.getCptfHist2().setText(view.getCptf2JFT().getText());
		view.getCptfHist3().setText(view.getCptf3JFT().getText());
		view.getProntaHist1().setText(view.getPronta1JFT().getText());
		view.getProntaHist2().setText(view.getPronta1JFT().getText());
		view.getProntaHist3().setText(view.getPronta1JFT().getText());
		view.getEsgorHist1().setText(view.getEsgor1JFT().getText());
		view.getEsgorHist2().setText(view.getEsgor2JFT().getText());
		view.getEsgorHist3().setText(view.getEsgor3JFT().getText());

		view.getTatuagemJFT1().setText("");
		view.getTatuagemJFT2().setText("");
		view.getTatuagemJFT3().setText("");
		view.getPeso1JFT().setText("");
		view.getPeso2JFT().setText("");
		view.getPeso3JFT().setText("");
		view.getCptf1JFT().setText("");
		view.getCptf2JFT().setText("");
		view.getCptf3JFT().setText("");
		view.getPronta1JFT().setText("");
		view.getPronta2JFT().setText("");
		view.getPronta3JFT().setText("");
		view.getEsgor1JFT().setText("");
		view.getEsgor2JFT().setText("");
		view.getEsgor3JFT().setText("");
	}

	private Integer calculaControle() {
		int soma = 0;
		soma += Integer.parseInt(view.getTatuagemJFT1().getText());
		soma += Integer.parseInt(view.getTatuagemJFT2().getText());
		soma += Integer.parseInt(view.getTatuagemJFT3().getText());

		soma += Integer.parseInt(view.getPeso1JFT().getText());
		soma += Integer.parseInt(view.getPeso2JFT().getText());
		soma += Integer.parseInt(view.getPeso3JFT().getText());

		soma += Integer.parseInt(view.getCptf1JFT().getText());
		soma += Integer.parseInt(view.getCptf2JFT().getText());
		soma += Integer.parseInt(view.getCptf3JFT().getText());

		soma += Integer.parseInt(view.getPronta1JFT().getText());
		soma += Integer.parseInt(view.getPronta2JFT().getText());
		soma += Integer.parseInt(view.getPronta3JFT().getText());

		soma += Integer.parseInt(view.getEsgor1JFT().getText());
		soma += Integer.parseInt(view.getEsgor2JFT().getText());
		soma += Integer.parseInt(view.getEsgor3JFT().getText());

		return soma;
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTatuagemJFT1());
		order.add(view.getTatuagemJFT2());
		order.add(view.getTatuagemJFT3());
		order.add(view.getPeso1JFT());
		order.add(view.getPeso2JFT());
		order.add(view.getPeso3JFT());
		order.add(view.getCptf1JFT());
		order.add(view.getCptf2JFT());
		order.add(view.getCptf3JFT());
		order.add(view.getPronta1JFT());
		order.add(view.getPronta2JFT());
		order.add(view.getPronta3JFT());
		order.add(view.getEsgor1JFT());
		order.add(view.getEsgor2JFT());
		order.add(view.getEsgor3JFT());
		order.add(view.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getTatuagemHist3_1());
		orderHist.add(view.getPesoHist3());
		orderHist.add(view.getCptfHist3());
		orderHist.add(view.getProntaHist3());
		orderHist.add(view.getEsgorHist3());
		orderHist.add(view.getTatuagemHist2());
		orderHist.add(view.getPesoHist2());
		orderHist.add(view.getCptfHist2());
		orderHist.add(view.getProntaHist2());
		orderHist.add(view.getEsgorHist2());
		orderHist.add(view.getTatuagemHist1());
		orderHist.add(view.getPesoHist1());
		orderHist.add(view.getCptfHist1());
		orderHist.add(view.getProntaHist1());
		orderHist.add(view.getEsgorHist1());
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	public List<BarrigaVOST> getBarrigaHist() {
		return barrigaHist;
	}

	public void setBarrigaHist(List<BarrigaVOST> barrigaHist) {
		this.barrigaHist = barrigaHist;
	}

}
