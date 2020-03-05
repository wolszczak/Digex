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

import brf.suino.model.bo.ConsumoBOST;
import brf.suino.model.vo.ConsumoTratosVOST;
import brf.suino.model.vo.RmeTratosVOST;
import brf.suino.view.ViewConsumoTST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoTST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewConsumoTST view;
	private ConsumoBOST consumoBO;
	private ConsumoTratosVOST ultimoConsumo, consumoHist;
	private List<RmeTratosVOST> consumoTemp;
	private int ordem;
	private List<String> datasFases;
	private List<Component> order, orderHist;
	private Border defaultBorder;

	public ControllerConsumoTST(ControllerST controller) {
		this.controller = controller;
		this.consumoBO = new ConsumoBOST(controller);
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		this.consumoTemp = new ArrayList<>();
		view = new ViewConsumoTST();
		view.setTitle("DIGEX - Consumo Tratos Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getRegistrosLabel().setVisible(false);

		criarOrdemComponentes();
		criarOrdemComponentesHist();

		if (controller.getModel().getExperimentoVO().getConsumosTratos().size() > 0) {
			if (controller.getModel().getExperimentoVO().getConsumosTratos()
					.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getConsumo().size() > 0) {
				ultimoConsumo = controller.getModel().getExperimentoVO().getConsumosTratos()
						.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1);
				ordem = ultimoConsumo.getConsumo().size();
			} else {
				ordem = 0;
			}
		}
		updateOrdem();
		view.getDataJFT().setEnabled(true);

		loadHist();
		view.pack();
	}

	private void updateOrdem() {
		view.getOrdemJFT1().setText(String.valueOf(++ordem));
		view.getOrdemJFT2().setText(String.valueOf(++ordem));
		view.getOrdemJFT3().setText(String.valueOf(++ordem));
		view.getOrdemJFT4().setText(String.valueOf(++ordem));
		view.getOrdemJFT5().setText(String.valueOf(++ordem));
		view.getOrdemJFT6().setText(String.valueOf(++ordem));
		view.getOrdemJFT7().setText(String.valueOf(++ordem));
		view.getOrdemJFT8().setText(String.valueOf(++ordem));
		view.getOrdemJFT9().setText(String.valueOf(++ordem));
		view.getOrdemJFT10().setText(String.valueOf(++ordem));
	}

	private void loadHist() {
		if (ultimoConsumo != null) {
			if (ultimoConsumo.getConsumo().size() < 10) {
				for (int z = 1; z <= ultimoConsumo.getConsumo().size(); z++) {
					JLabel lbl1 = (JLabel) orderHist.get(0);
					lbl1.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getOrdem()).trim());
					orderHist.remove(0);
					JLabel lbl2 = (JLabel) orderHist.get(0);
					lbl2.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getBaia()).trim());
					orderHist.remove(0);
					JLabel lbl3 = (JLabel) orderHist.get(0);
					lbl3.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getConsumo()).trim());
					orderHist.remove(0);
				}
			} else {
				for (int z = 1; z <= 10; z++) {
					JLabel lbl1 = (JLabel) orderHist.get(0);
					lbl1.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getOrdem()).trim());
					orderHist.remove(0);
					JLabel lbl2 = (JLabel) orderHist.get(0);
					lbl2.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getBaia()).trim());
					orderHist.remove(0);
					JLabel lbl3 = (JLabel) orderHist.get(0);
					lbl3.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getConsumo()).trim());
					orderHist.remove(0);
				}
			}
			criarOrdemComponentesHist();

			view.getDataJFT().setText(ultimoConsumo.getData());
			view.getTratosJFT().setText(String.valueOf(ultimoConsumo.getTratos()));
			view.getDataJFT().setEnabled(false);
			view.getTratosJFT().setEnabled(false);
			view.getBaiaJFT1().setEnabled(true);
			view.getBaiaJFT1().grabFocus();
		}
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
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigST ce = new ControllerEscolhaDigST(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			if (e.getSource() == view.getDataJFT()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getDataJFT().getText().trim(), 10);
				String msg = consumoBO.verificaData(view.getDataJFT().getText().trim(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					carregarHistData();

				}
			} else if (e.getSource() == view.getTratosJFT()) {
				TextFormatter.formatStringJFT(src, view.getTratosJFT().getText().trim(), 1);
				if (view.getTratosJFT().getText().trim().equals("")) {
					String msg = "É necessário digitar a quantidade de tratos.";
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					view.getDataJFT().grabFocus();
				} else {
					String msg = consumoBO.verificaConsumoTratos(consumoTemp);
					if (msg != null) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTratosJFT().setEnabled(false);
						view.getDataJFT().setEnabled(true);
						view.getDataJFT().grabFocus();
					} else {
						view.getTratosJFT().setEnabled(false);
						view.getBaiaJFT1().setEnabled(true);
						view.getBaiaJFT1().grabFocus();
					}
				}
			} else if (e.getSource() == view.getBaiaJFT1()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT1().getText(), 2);
				view.getBaiaJFT1().setEnabled(false);
				view.getBaiaJFT2().setEnabled(true);
				view.getBaiaJFT2().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT2()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT2().getText(), 2);
				view.getBaiaJFT2().setEnabled(false);
				view.getBaiaJFT3().setEnabled(true);
				view.getBaiaJFT3().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT3()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT3().getText(), 2);
				view.getBaiaJFT3().setEnabled(false);
				view.getBaiaJFT4().setEnabled(true);
				view.getBaiaJFT4().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT4()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT4().getText(), 2);
				view.getBaiaJFT4().setEnabled(false);
				view.getBaiaJFT5().setEnabled(true);
				view.getBaiaJFT5().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT5()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT5().getText(), 2);
				view.getBaiaJFT5().setEnabled(false);
				view.getBaiaJFT6().setEnabled(true);
				view.getBaiaJFT6().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT6()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT6().getText(), 2);
				view.getBaiaJFT6().setEnabled(false);
				view.getBaiaJFT7().setEnabled(true);
				view.getBaiaJFT7().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT7()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT7().getText(), 2);
				view.getBaiaJFT7().setEnabled(false);
				view.getBaiaJFT8().setEnabled(true);
				view.getBaiaJFT8().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT8()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT8().getText(), 2);
				view.getBaiaJFT8().setEnabled(false);
				view.getBaiaJFT9().setEnabled(true);
				view.getBaiaJFT9().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT9()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT9().getText(), 2);
				view.getBaiaJFT9().setEnabled(false);
				view.getBaiaJFT10().setEnabled(true);
				view.getBaiaJFT10().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT10()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT10().getText(), 2);
				view.getBaiaJFT10().setEnabled(false);
				view.getConsumoJFT1().setEnabled(true);
				view.getConsumoJFT1().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT1()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT1().getText(), 5);
				view.getConsumoJFT1().setEnabled(false);
				view.getConsumoJFT2().setEnabled(true);
				view.getConsumoJFT2().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT2()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT2().getText(), 5);
				view.getConsumoJFT2().setEnabled(false);
				view.getConsumoJFT3().setEnabled(true);
				view.getConsumoJFT3().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT3()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT3().getText(), 5);
				view.getConsumoJFT3().setEnabled(false);
				view.getConsumoJFT4().setEnabled(true);
				view.getConsumoJFT4().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT4()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT4().getText(), 5);
				view.getConsumoJFT4().setEnabled(false);
				view.getConsumoJFT5().setEnabled(true);
				view.getConsumoJFT5().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT5()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT5().getText(), 5);
				view.getConsumoJFT5().setEnabled(false);
				view.getConsumoJFT6().setEnabled(true);
				view.getConsumoJFT6().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT6()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT6().getText(), 5);
				view.getConsumoJFT6().setEnabled(false);
				view.getConsumoJFT7().setEnabled(true);
				view.getConsumoJFT7().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT7()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT7().getText(), 5);
				view.getConsumoJFT7().setEnabled(false);
				view.getConsumoJFT8().setEnabled(true);
				view.getConsumoJFT8().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT8()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT8().getText(), 5);
				view.getConsumoJFT8().setEnabled(false);
				view.getConsumoJFT9().setEnabled(true);
				view.getConsumoJFT9().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT9()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT9().getText(), 5);
				view.getConsumoJFT9().setEnabled(false);
				view.getConsumoJFT10().setEnabled(true);
				view.getConsumoJFT10().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT10()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getConsumoJFT10().getText(), 5);
				if (Integer.parseInt(view.getBaiaJFT1().getText()) != 0 && Integer.parseInt(view.getConsumoJFT1().getText()) != 0) {
					adicionarConsumo();
					view.getConsumoJFT10().setEnabled(false);
					view.getControleJFT().setEnabled(true);
					view.getControleJFT().grabFocus();
				} else {
					adicionarConsumo();
					String msg = consumoBO.verificaConsumoTratos(consumoTemp);
					if (msg != null) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getConsumoJFT10().setEnabled(false);
						view.getBaiaJFT1().setEnabled(true);
						view.getBaiaJFT1().grabFocus();
					} else {
						view.getConsumoJFT10().setEnabled(false);
						view.getBaiaJFT1().setEnabled(true);
						view.getBaiaJFT1().grabFocus();
					}
				}
			} else if (e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(src, view.getControleJFT().getText(), 6);
				if (Integer.parseInt(view.getBaiaJFT1().getText()) == 0 && Integer.parseInt(view.getConsumoJFT1().getText()) == 0
						&& Integer.parseInt(view.getControleJFT().getText()) == 0) {
					view.getControleJFT().setEnabled(false);
				} else if (Integer.parseInt(view.getControleJFT().getText()) == calculaControleConsumo()) {
					if (controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
						ConsumoTratosVOST novoconsumo = new ConsumoTratosVOST();
						novoconsumo.getConsumo().addAll(consumoTemp);
						novoconsumo.setData(view.getDataJFT().getText());
						novoconsumo.setTratos(Integer.parseInt(view.getTratosJFT().getText()));
						controller.getModel().getExperimentoVO().getConsumosTratos().add(novoconsumo);
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getRegistrosLabel().setVisible(true);
						view.getPnlConsT().setBorder(defaultBorder);
						consumoTemp = new ArrayList<>();
						atualizarHistorico();
						view.getControleJFT().setText("00000");
						view.getControleJFT().setEnabled(false);
						view.getBaiaJFT1().setEnabled(true);
						view.getBaiaJFT1().grabFocus();
					} else {
						Integer index = null;
						for (int t = 0; t < controller.getModel().getExperimentoVO().getConsumosTratos().size(); t++) {
							if (controller.getModel().getExperimentoVO().getConsumosTratos().get(t).getData()
									.equals(view.getDataJFT().getText())) {
								index = t;
								break;
							}
						}
						if (index != null) {
							controller.getModel().getExperimentoVO().getConsumosTratos().get(index).getConsumo().addAll(consumoTemp);
						} else {
							ConsumoTratosVOST novoconsumo = new ConsumoTratosVOST();
							novoconsumo.getConsumo().addAll(consumoTemp);
							novoconsumo.setData(view.getDataJFT().getText());
							novoconsumo.setTratos(Integer.parseInt(view.getTratosJFT().getText()));
							controller.getModel().getExperimentoVO().getConsumosTratos().add(novoconsumo);
						}
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getRegistrosLabel().setVisible(true);
						consumoTemp = new ArrayList<>();
						view.getPnlConsT().setBorder(defaultBorder);
						atualizarHistorico();
						view.getControleJFT().setText("000000");
						view.getControleJFT().setEnabled(false);
						view.getBaiaJFT1().setEnabled(true);
						view.getBaiaJFT1().grabFocus();
					}
				} else {
					consumoTemp = new ArrayList<>();
					view.getConsumoJFT10().setEnabled(false);
					view.getBaiaJFT1().setEnabled(true);
					view.getBaiaJFT1().grabFocus();
					view.getPnlConsT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
				}
			}
		}

	}

	private void carregarHistData() {
		limparTela();
		consumoHist = new ConsumoTratosVOST();
		if (controller.getModel().getExperimentoVO().getConsumosTratos().size() > 0) {
			for (int t = 0; t < controller.getModel().getExperimentoVO().getConsumosTratos().size(); t++) {
				if (controller.getModel().getExperimentoVO().getConsumosTratos().get(t).getData().equals(view.getDataJFT().getText())) {
					consumoHist = controller.getModel().getExperimentoVO().getConsumosTratos().get(t);
					break;
				}
			}
		}

		if (consumoHist.getConsumo().size() > 0) {
			ordem = consumoHist.getConsumo().size();
//			view.getOrdemJFT().setText(String.valueOf(ordem));
			if (consumoHist.getConsumo().size() < 10) {
				for (int s = 1; s <= consumoHist.getConsumo().size(); s++) {
					JLabel l1 = (JLabel) orderHist.get(0);
					l1.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getOrdem()));
					orderHist.remove(0);
					JLabel l2 = (JLabel) orderHist.get(0);
					l2.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getBaia()));
					orderHist.remove(0);
					JLabel l3 = (JLabel) orderHist.get(0);
					l3.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getConsumo()));
					orderHist.remove(0);
				}
				updateOrdem();
				view.getTratosJFT().setText(String.valueOf(consumoHist.getTratos()));
				view.getDataJFT().setEnabled(false);
				view.getBaiaJFT1().setEnabled(true);
				view.getBaiaJFT1().requestFocus();
			} else {
				for (int s = 1; s <= 10; s++) {
					JLabel l1 = (JLabel) orderHist.get(0);
					l1.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getOrdem()));
					orderHist.remove(0);
					JLabel l2 = (JLabel) orderHist.get(0);
					l2.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getBaia()));
					orderHist.remove(0);
					JLabel l3 = (JLabel) orderHist.get(0);
					l3.setText(String.valueOf(consumoHist.getConsumo().get(consumoHist.getConsumo().size() - s).getConsumo()));
					orderHist.remove(0);
				}
			}
			criarOrdemComponentesHist();
			updateOrdem();
			view.getTratosJFT().setText(String.valueOf(consumoHist.getTratos()));
			view.getDataJFT().setEnabled(false);
			view.getBaiaJFT1().setEnabled(true);
			view.getBaiaJFT1().requestFocus();
		} else {
			limparTela();
			ordem = 0;
			updateOrdem();
			view.getDataJFT().setEnabled(false);
			view.getTratosJFT().setEnabled(true);
			view.getTratosJFT().requestFocus();
		}

	}

	private void adicionarConsumo() {
		if (Integer.parseInt(view.getBaiaJFT1().getText()) != 0 && Integer.parseInt(view.getConsumoJFT1().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT1().getText()),
					Integer.parseInt(view.getBaiaJFT1().getText()), Integer.parseInt(view.getConsumoJFT1().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT2().getText()) != 0 && Integer.parseInt(view.getConsumoJFT2().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT2().getText()),
					Integer.parseInt(view.getBaiaJFT2().getText()), Integer.parseInt(view.getConsumoJFT2().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT3().getText()) != 0 && Integer.parseInt(view.getConsumoJFT3().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT3().getText()),
					Integer.parseInt(view.getBaiaJFT3().getText()), Integer.parseInt(view.getConsumoJFT3().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT4().getText()) != 0 && Integer.parseInt(view.getConsumoJFT4().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT4().getText()),
					Integer.parseInt(view.getBaiaJFT4().getText()), Integer.parseInt(view.getConsumoJFT4().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT5().getText()) != 0 && Integer.parseInt(view.getConsumoJFT5().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT5().getText()),
					Integer.parseInt(view.getBaiaJFT5().getText()), Integer.parseInt(view.getConsumoJFT5().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT6().getText()) != 0 && Integer.parseInt(view.getConsumoJFT6().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT6().getText()),
					Integer.parseInt(view.getBaiaJFT6().getText()), Integer.parseInt(view.getConsumoJFT6().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT7().getText()) != 0 && Integer.parseInt(view.getConsumoJFT7().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT7().getText()),
					Integer.parseInt(view.getBaiaJFT7().getText()), Integer.parseInt(view.getConsumoJFT7().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT8().getText()) != 0 && Integer.parseInt(view.getConsumoJFT8().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT8().getText()),
					Integer.parseInt(view.getBaiaJFT8().getText()), Integer.parseInt(view.getConsumoJFT8().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT9().getText()) != 0 && Integer.parseInt(view.getConsumoJFT9().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT9().getText()),
					Integer.parseInt(view.getBaiaJFT9().getText()), Integer.parseInt(view.getConsumoJFT9().getText())));
		}
		if (Integer.parseInt(view.getBaiaJFT10().getText()) != 0 && Integer.parseInt(view.getConsumoJFT10().getText()) != 0) {
			consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT10().getText()),
					Integer.parseInt(view.getBaiaJFT10().getText()), Integer.parseInt(view.getConsumoJFT10().getText())));
		}

	}

	private void atualizarHistorico() {
		for (ConsumoTratosVOST c : controller.getModel().getExperimentoVO().getConsumosTratos()) {
			if (c.getData().equals(view.getDataJFT().getText())) {
				ultimoConsumo = c;
				break;
			}
		}

		if (ultimoConsumo.getConsumo().size() < 10) {
			for (int z = 1; z <= ultimoConsumo.getConsumo().size(); z++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getOrdem()).trim());
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getBaia()).trim());
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getConsumo()).trim());
				orderHist.remove(0);
			}
		} else {
			for (int z = 1; z <= 10; z++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getOrdem()).trim());
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getBaia()).trim());
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(ultimoConsumo.getConsumo().get(ultimoConsumo.getConsumo().size() - z).getConsumo()).trim());
				orderHist.remove(0);
			}
		}
		criarOrdemComponentesHist();
		ordem = ultimoConsumo.getConsumo().size();
		updateOrdem();

		view.getBaiaJFT1().setText("");
		view.getBaiaJFT2().setText("");
		view.getBaiaJFT3().setText("");
		view.getBaiaJFT4().setText("");
		view.getBaiaJFT5().setText("");
		view.getBaiaJFT6().setText("");
		view.getBaiaJFT7().setText("");
		view.getBaiaJFT8().setText("");
		view.getBaiaJFT9().setText("");
		view.getBaiaJFT10().setText("");
		view.getConsumoJFT1().setText("");
		view.getConsumoJFT2().setText("");
		view.getConsumoJFT3().setText("");
		view.getConsumoJFT4().setText("");
		view.getConsumoJFT5().setText("");
		view.getConsumoJFT6().setText("");
		view.getConsumoJFT7().setText("");
		view.getConsumoJFT8().setText("");
		view.getConsumoJFT9().setText("");
		view.getConsumoJFT10().setText("");
	}

	private int calculaControleConsumo() {
		int soma = 0;
		soma += Integer.parseInt(view.getBaiaJFT1().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT2().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT3().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT4().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT5().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT6().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT7().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT8().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT9().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT10().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT1().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT2().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT3().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT4().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT5().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT6().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT7().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT8().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT9().getText().trim());
		soma += Integer.parseInt(view.getConsumoJFT10().getText().trim());
		return soma;
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

	private void limparTela() {
		view.getTratosJFT().setText("");
		view.getOrdemJFT1().setText("");
		view.getOrdemJFT2().setText("");
		view.getOrdemJFT3().setText("");
		view.getOrdemJFT4().setText("");
		view.getOrdemJFT5().setText("");
		view.getOrdemJFT6().setText("");
		view.getOrdemJFT7().setText("");
		view.getOrdemJFT8().setText("");
		view.getOrdemJFT9().setText("");
		view.getOrdemJFT10().setText("");
		view.getBaiaJFT1().setText("");
		view.getBaiaJFT2().setText("");
		view.getBaiaJFT3().setText("");
		view.getBaiaJFT4().setText("");
		view.getBaiaJFT5().setText("");
		view.getBaiaJFT6().setText("");
		view.getBaiaJFT7().setText("");
		view.getBaiaJFT8().setText("");
		view.getBaiaJFT9().setText("");
		view.getBaiaJFT10().setText("");
		view.getConsumoJFT1().setText("");
		view.getConsumoJFT2().setText("");
		view.getConsumoJFT3().setText("");
		view.getConsumoJFT4().setText("");
		view.getConsumoJFT5().setText("");
		view.getConsumoJFT6().setText("");
		view.getConsumoJFT7().setText("");
		view.getConsumoJFT8().setText("");
		view.getConsumoJFT9().setText("");
		view.getConsumoJFT10().setText("");
		view.getOrdemHist1().setText("");
		view.getOrdemHist2().setText("");
		view.getOrdemHist3().setText("");
		view.getOrdemHist4().setText("");
		view.getOrdemHist5().setText("");
		view.getOrdemHist6().setText("");
		view.getOrdemHist7().setText("");
		view.getOrdemHist8().setText("");
		view.getOrdemHist9().setText("");
		view.getOrdemHist10().setText("");
		view.getBaiaHist1().setText("");
		view.getBaiaHist2().setText("");
		view.getBaiaHist3().setText("");
		view.getBaiaHist4().setText("");
		view.getBaiaHist5().setText("");
		view.getBaiaHist6().setText("");
		view.getBaiaHist7().setText("");
		view.getBaiaHist8().setText("");
		view.getBaiaHist9().setText("");
		view.getBaiaHist10().setText("");
		view.getConsumoHist1().setText("");
		view.getConsumoHist2().setText("");
		view.getConsumoHist3().setText("");
		view.getConsumoHist4().setText("");
		view.getConsumoHist5().setText("");
		view.getConsumoHist6().setText("");
		view.getConsumoHist7().setText("");
		view.getConsumoHist8().setText("");
		view.getConsumoHist9().setText("");
		view.getConsumoHist10().setText("");
		view.getControleJFT().setText("");
	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getOrdemHist10());
		orderHist.add(view.getBaiaHist10());
		orderHist.add(view.getConsumoHist10());
		orderHist.add(view.getOrdemHist9());
		orderHist.add(view.getBaiaHist9());
		orderHist.add(view.getConsumoHist9());
		orderHist.add(view.getOrdemHist8());
		orderHist.add(view.getBaiaHist8());
		orderHist.add(view.getConsumoHist8());
		orderHist.add(view.getOrdemHist7());
		orderHist.add(view.getBaiaHist7());
		orderHist.add(view.getConsumoHist7());
		orderHist.add(view.getOrdemHist6());
		orderHist.add(view.getBaiaHist6());
		orderHist.add(view.getConsumoHist6());
		orderHist.add(view.getOrdemHist5());
		orderHist.add(view.getBaiaHist5());
		orderHist.add(view.getConsumoHist5());
		orderHist.add(view.getOrdemHist4());
		orderHist.add(view.getBaiaHist4());
		orderHist.add(view.getConsumoHist4());
		orderHist.add(view.getOrdemHist3());
		orderHist.add(view.getBaiaHist3());
		orderHist.add(view.getConsumoHist3());
		orderHist.add(view.getOrdemHist2());
		orderHist.add(view.getBaiaHist2());
		orderHist.add(view.getConsumoHist2());
		orderHist.add(view.getOrdemHist1());
		orderHist.add(view.getBaiaHist1());
		orderHist.add(view.getConsumoHist1());

	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTratosJFT());
		order.add(view.getBaiaJFT1());
		order.add(view.getBaiaJFT2());
		order.add(view.getBaiaJFT3());
		order.add(view.getBaiaJFT4());
		order.add(view.getBaiaJFT5());
		order.add(view.getBaiaJFT6());
		order.add(view.getBaiaJFT7());
		order.add(view.getBaiaJFT8());
		order.add(view.getBaiaJFT9());
		order.add(view.getBaiaJFT10());
		order.add(view.getConsumoJFT1());
		order.add(view.getConsumoJFT2());
		order.add(view.getConsumoJFT3());
		order.add(view.getConsumoJFT4());
		order.add(view.getConsumoJFT5());
		order.add(view.getConsumoJFT6());
		order.add(view.getConsumoJFT7());
		order.add(view.getConsumoJFT8());
		order.add(view.getConsumoJFT9());
		order.add(view.getConsumoJFT10());
		order.add(view.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
	}

	@Override
	public void focusLost(FocusEvent e) {
	}

}
