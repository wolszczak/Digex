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
import brf.suino.model.vo.PCRVOST;
import brf.suino.view.ViewDigitarPCRST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerPCRST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewDigitarPCRST view;
	private Border defaultBorder;
	private List<Component> order, orderHist;
	private List<String> datasFases;
	private DigitacaoFrigoBOST bo;
	private List<PCRVOST> pcrHist;

	public ControllerPCRST(ControllerST controller) {
		this.controller = controller;
		this.bo = new DigitacaoFrigoBOST(controller);
		this.pcrHist =  new ArrayList<>();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr().size() > 0) {
			this.pcrHist.addAll(controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr());
		} else {
			pcrHist = new ArrayList<>();
		}
		view = new ViewDigitarPCRST();
		view.setTitle("DIGEX - Avaliação PCR");
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
					if (msg.equals("existente")) {
						int option = JOptionPane.showConfirmDialog(view, "A data informada já foi digitada, deseja digitar novamente??",
								"DIGEX - Aviso", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
						if (option == 0) {
							for (int k = controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr().size()
									- 1; k == 0; k--) {
								if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr().get(k).getData()
										.equals(view.getDataJFT().getText())) {
									controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr().remove(k);
								}
							}
							controller.getModel().getModelStateDAO().saveModelState(false);
						} else {
							view.getDataJFT().grabFocus();
						}
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					view.getDataJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().requestFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem1JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem1JFT(), view.getTatuagem1JFT().getText(), 4);
				String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem1JFT().getText()));
				if (msg == null) {
					view.getTatuagem1JFT().setEnabled(false);
					view.getTatuagem2JFT().setEnabled(true);
					view.getTatuagem2JFT().grabFocus();
				} else {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					view.getTatuagem1JFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem2JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem2JFT(), view.getTatuagem2JFT().getText(), 4);
				String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem2JFT().getText()));
				if (msg == null) {
					view.getTatuagem2JFT().setEnabled(false);
					view.getTatuagem3JFT().setEnabled(true);
					view.getTatuagem3JFT().grabFocus();
				} else {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					view.getTatuagem2JFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getTatuagem3JFT()) {
				TextFormatter.formatStringJFT(view.getTatuagem3JFT(), view.getTatuagem3JFT().getText(), 4);
				String msg = bo.verificaTatuagem(Integer.parseInt(view.getTatuagem3JFT().getText()));
				if (msg == null) {
					view.getTatuagem3JFT().setEnabled(false);
					view.getEtpaquim1JFT().setEnabled(true);
					view.getEtpaquim1JFT().grabFocus();
				} else {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					view.getTatuagem3JFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getEtpaquim1JFT()) {
				TextFormatter.formatStringJFT(view.getEtpaquim1JFT(), view.getEtpaquim1JFT().getText(), 4);
				view.getEtpaquim1JFT().setEnabled(false);
				view.getEtpaquim2JFT().setEnabled(true);
				view.getEtpaquim2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getEtpaquim2JFT()) {
				TextFormatter.formatStringJFT(view.getEtpaquim2JFT(), view.getEtpaquim2JFT().getText(), 4);
				view.getEtpaquim2JFT().setEnabled(false);
				view.getEtpaquim3JFT().setEnabled(true);
				view.getEtpaquim3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getEtpaquim3JFT()) {
				TextFormatter.formatStringJFT(view.getEtpaquim3JFT(), view.getEtpaquim3JFT().getText(), 4);
				view.getEtpaquim3JFT().setEnabled(false);
				view.getPlpaquim1JFT().setEnabled(true);
				view.getPlpaquim1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPlpaquim1JFT()) {
				TextFormatter.formatStringJFT(view.getPlpaquim1JFT(), view.getPlpaquim1JFT().getText(), 4);
				view.getPlpaquim1JFT().setEnabled(false);
				view.getPlpaquim2JFT().setEnabled(true);
				view.getPlpaquim2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPlpaquim2JFT()) {
				TextFormatter.formatStringJFT(view.getPlpaquim2JFT(), view.getPlpaquim2JFT().getText(), 4);
				view.getPlpaquim2JFT().setEnabled(false);
				view.getPlpaquim3JFT().setEnabled(true);
				view.getPlpaquim3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPlpaquim3JFT()) {
				TextFormatter.formatStringJFT(view.getPlpaquim3JFT(), view.getPlpaquim3JFT().getText(), 4);
				view.getPlpaquim3JFT().setEnabled(false);
				view.getGim1JFT().setEnabled(true);
				view.getGim1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getGim1JFT()) {
				TextFormatter.formatStringJFT(view.getGim1JFT(), view.getGim1JFT().getText(), 2);
				view.getGim1JFT().setEnabled(false);
				view.getGim2JFT().setEnabled(true);
				view.getGim2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getGim2JFT()) {
				TextFormatter.formatStringJFT(view.getGim2JFT(), view.getGim2JFT().getText(), 2);
				view.getGim2JFT().setEnabled(false);
				view.getGim3JFT().setEnabled(true);
				view.getGim3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getGim3JFT()) {
				TextFormatter.formatStringJFT(view.getGim3JFT(), view.getGim3JFT().getText(), 2);
				view.getGim3JFT().setEnabled(false);
				view.getCosph1JFT().setEnabled(true);
				view.getCosph1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCosph1JFT()) {
				TextFormatter.formatStringJFT(view.getCosph1JFT(), view.getCosph1JFT().getText(), 3);
				view.getCosph1JFT().setEnabled(false);
				view.getCosph2JFT().setEnabled(true);
				view.getCosph2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCosph2JFT()) {
				TextFormatter.formatStringJFT(view.getCosph2JFT(), view.getCosph2JFT().getText(), 3);
				view.getCosph2JFT().setEnabled(false);
				view.getCosph3JFT().setEnabled(true);
				view.getCosph3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCosph3JFT()) {
				TextFormatter.formatStringJFT(view.getCosph3JFT(), view.getCosph3JFT().getText(), 3);
				view.getCosph3JFT().setEnabled(false);
				view.getCoscjpcs1JFT().setEnabled(true);
				view.getCoscjpcs1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCoscjpcs1JFT()) {
				TextFormatter.formatStringJFT(view.getCoscjpcs1JFT(), view.getCoscjpcs1JFT().getText(), 2);
				view.getCoscjpcs1JFT().setEnabled(false);
				view.getCoscjpcs2JFT().setEnabled(true);
				view.getCoscjpcs2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCoscjpcs2JFT()) {
				TextFormatter.formatStringJFT(view.getCoscjpcs2JFT(), view.getCoscjpcs2JFT().getText(), 2);
				view.getCoscjpcs2JFT().setEnabled(false);
				view.getCoscjpcs3JFT().setEnabled(true);
				view.getCoscjpcs3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCoscjpcs3JFT()) {
				TextFormatter.formatStringJFT(view.getCoscjpcs3JFT(), view.getCoscjpcs3JFT().getText(), 2);
				view.getCoscjpcs3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 5);
				if (Integer.parseInt(view.getControleJFT().getText()) == calculaControle()) {
					if (controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr() == null) {
						controller.getModel().getExperimentoVO().getFrigorificoTempVOST().setPcr(new ArrayList<>());
						salvarPCR();
					} else {
						salvarPCR();
					}
					updateHist();
					view.getPnlPCR().setBorder(defaultBorder);
					view.getControleJFT().setText("00000");
					view.getControleJFT().setEnabled(false);
					view.getTatuagem1JFT().setEnabled(true);
					view.getTatuagem1JFT().grabFocus();
				} else {
					view.getPnlPCR().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
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

	private void salvarPCR() {
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr()
				.add(new PCRVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem1JFT().getText()),
						Integer.parseInt(view.getEtpaquim1JFT().getText()), Integer.parseInt(view.getPlpaquim1JFT().getText()),
						Integer.parseInt(view.getGim1JFT().getText()), Integer.parseInt(view.getCosph1JFT().getText()),
						Integer.parseInt(view.getCoscjpcs1JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr()
				.add(new PCRVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem2JFT().getText()),
						Integer.parseInt(view.getEtpaquim2JFT().getText()), Integer.parseInt(view.getPlpaquim2JFT().getText()),
						Integer.parseInt(view.getGim2JFT().getText()), Integer.parseInt(view.getCosph2JFT().getText()),
						Integer.parseInt(view.getCoscjpcs2JFT().getText())));
		controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr()
				.add(new PCRVOST(view.getDataJFT().getText(), Integer.parseInt(view.getTatuagem3JFT().getText()),
						Integer.parseInt(view.getEtpaquim3JFT().getText()), Integer.parseInt(view.getPlpaquim3JFT().getText()),
						Integer.parseInt(view.getGim3JFT().getText()), Integer.parseInt(view.getCosph3JFT().getText()),
						Integer.parseInt(view.getCoscjpcs3JFT().getText())));
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void loadHist() {
		if (pcrHist.size() > 0) {
			for (int k = 1 - 1; k <= 3; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getTatuagem()));
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getEtpaquim()));
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getPlpaquim()));
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getGim()));
				orderHist.remove(0);
				JLabel lbl5 = (JLabel) orderHist.get(0);
				lbl5.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getCosph24()));
				orderHist.remove(0);
				JLabel lbl6 = (JLabel) orderHist.get(0);
				lbl6.setText(String.valueOf(pcrHist.get(pcrHist.size() - k).getCoscjpcs()));
				orderHist.remove(0);
			}
			view.getDataJFT().setText(pcrHist.get(pcrHist.size()-1).getData());
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
		view.getTatuagemHist1().setText(view.getTatuagem1JFT().getText());
		view.getTatuagemHist2().setText(view.getTatuagem2JFT().getText());
		view.getTatuagemHist3().setText(view.getTatuagem3JFT().getText());
		view.getEtpaquimHist1().setText(view.getTatuagem1JFT().getText());
		view.getEtpaquimHist2().setText(view.getTatuagem2JFT().getText());
		view.getEtpaquimHist3().setText(view.getTatuagem3JFT().getText());
		view.getPlpaquimHist1().setText(view.getPlpaquim1JFT().getText());
		view.getPlpaquimHist2().setText(view.getPlpaquim2JFT().getText());
		view.getPlpaquimHist3().setText(view.getPlpaquim3JFT().getText());
		view.getCosph24Hist1().setText(view.getCosph1JFT().getText());
		view.getCosph24Hist2().setText(view.getCosph2JFT().getText());
		view.getCosph24Hist3().setText(view.getCosph3JFT().getText());
		view.getCospcjpcsHist1().setText(view.getCoscjpcs1JFT().getText());
		view.getCospcjpcsHist2().setText(view.getCoscjpcs2JFT().getText());
		view.getCospcjpcsHist3().setText(view.getCoscjpcs3JFT().getText());
		

		view.getTatuagem1JFT().setText("");
		view.getTatuagem2JFT().setText("");
		view.getTatuagem3JFT().setText("");
		view.getEtpaquim1JFT().setText("");
		view.getEtpaquim2JFT().setText("");
		view.getEtpaquim3JFT().setText("");
		view.getPlpaquim1JFT().setText("");
		view.getPlpaquim2JFT().setText("");
		view.getPlpaquim3JFT().setText("");
		view.getGim1JFT().setText("");
		view.getGim2JFT().setText("");
		view.getGim3JFT().setText("");
		view.getCosph1JFT().setText("");
		view.getCosph2JFT().setText("");
		view.getCosph3JFT().setText("");
		view.getCoscjpcs1JFT().setText("");
		view.getCoscjpcs2JFT().setText("");
		view.getCoscjpcs3JFT().setText("");
	}

	private Integer calculaControle() {
		int soma = 0;
		soma += Integer.parseInt(view.getTatuagem1JFT().getText());
		soma += Integer.parseInt(view.getTatuagem2JFT().getText());
		soma += Integer.parseInt(view.getTatuagem3JFT().getText());

		soma += Integer.parseInt(view.getEtpaquim1JFT().getText());
		soma += Integer.parseInt(view.getEtpaquim2JFT().getText());
		soma += Integer.parseInt(view.getEtpaquim3JFT().getText());

		soma += Integer.parseInt(view.getPlpaquim1JFT().getText());
		soma += Integer.parseInt(view.getPlpaquim2JFT().getText());
		soma += Integer.parseInt(view.getPlpaquim3JFT().getText());

		soma += Integer.parseInt(view.getGim1JFT().getText());
		soma += Integer.parseInt(view.getGim2JFT().getText());
		soma += Integer.parseInt(view.getGim3JFT().getText());

		soma += Integer.parseInt(view.getCosph1JFT().getText());
		soma += Integer.parseInt(view.getCosph2JFT().getText());
		soma += Integer.parseInt(view.getCosph3JFT().getText());

		soma += Integer.parseInt(view.getCoscjpcs1JFT().getText());
		soma += Integer.parseInt(view.getCoscjpcs2JFT().getText());
		soma += Integer.parseInt(view.getCoscjpcs3JFT().getText());
		return soma;
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTatuagem1JFT());
		order.add(view.getTatuagem2JFT());
		order.add(view.getTatuagem3JFT());
		order.add(view.getEtpaquim1JFT());
		order.add(view.getEtpaquim2JFT());
		order.add(view.getEtpaquim3JFT());
		order.add(view.getPlpaquim1JFT());
		order.add(view.getPlpaquim2JFT());
		order.add(view.getPlpaquim3JFT());
		order.add(view.getGim1JFT());
		order.add(view.getGim2JFT());
		order.add(view.getGim3JFT());
		order.add(view.getCosph1JFT());
		order.add(view.getCosph2JFT());
		order.add(view.getCosph3JFT());
		order.add(view.getCoscjpcs1JFT());
		order.add(view.getCoscjpcs2JFT());
		order.add(view.getCoscjpcs3JFT());
		order.add(view.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getTatuagemHist3());
		orderHist.add(view.getEtpaquimHist3());
		orderHist.add(view.getPlpaquimHist3());
		orderHist.add(view.getGimHist3());
		orderHist.add(view.getCosph24Hist3());
		orderHist.add(view.getCospcjpcsHist3());
		orderHist.add(view.getTatuagemHist2());
		orderHist.add(view.getEtpaquimHist2());
		orderHist.add(view.getPlpaquimHist2());
		orderHist.add(view.getGimHist2());
		orderHist.add(view.getCosph24Hist2());
		orderHist.add(view.getCospcjpcsHist2());
		orderHist.add(view.getTatuagemHist1());
		orderHist.add(view.getEtpaquimHist1());
		orderHist.add(view.getPlpaquimHist1());
		orderHist.add(view.getGimHist1());
		orderHist.add(view.getCosph24Hist1());
		orderHist.add(view.getCospcjpcsHist1());
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	public List<PCRVOST> getPcrHist() {
		return pcrHist;
	}

	public void setPcrHist(List<PCRVOST> pcrHist) {
		this.pcrHist = pcrHist;
	}

}
