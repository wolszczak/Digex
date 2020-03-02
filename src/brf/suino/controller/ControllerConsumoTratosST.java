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
import brf.suino.view.ViewConsumoTratosST_old;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoTratosST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewConsumoTratosST_old view;
	private ConsumoBOST consumoBO;
	private ConsumoTratosVOST ultimoConsumo, consumoHist;
	private List<RmeTratosVOST> consumosErros, consumoTemp;
	private int ordem;
	private List<String> datasFases;
	private List<Component> order, orderHist, orderErros;
	private Border defaultBorder;

	public ControllerConsumoTratosST(ControllerST controller) {
		this.controller = controller;
		this.consumoBO = new ConsumoBOST(controller);
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		this.consumoTemp = new ArrayList<>();
		this.consumosErros = new ArrayList<>();
		view = new ViewConsumoTratosST_old();
		view.setTitle("DIGEX - Consumo Tratos Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getRegistrosLabel().setVisible(false);

		if (controller.getModel().getExperimentoVO().getConsumosTratos().size() > 0) {
			if (!controller.getModel().getExperimentoVO().getConsumosTratos()
					.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).isFinalizado()) {
				ultimoConsumo = new ConsumoTratosVOST();
				ultimoConsumo = controller.getModel().getExperimentoVO().getConsumosTratos()
						.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1);
				ordem = ultimoConsumo.getConsumo().size() + 1;
			} else {
				ordem = 1;
			}
		} else {
			ordem = 1;
		}
		view.getOrdemJFT().setText(String.valueOf(ordem));
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText().trim(), 3);
		criarOrdemComponentes();
		criarOrdemComponentesHist();
		criarOrdemComponentesErros();

		loadHist();

		view.pack();
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
			view.getBaiaJFT().setEnabled(true);
			view.getBaiaJFT().grabFocus();
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
					view.getDataJFT().setEnabled(false);
					view.getTratosJFT().setEnabled(true);
					view.getTratosJFT().requestFocus();
				}
			} else if (e.getSource() == view.getTratosJFT()) {
				TextFormatter.formatStringJFT(src, view.getTratosJFT().getText().trim(), 1);
				if (view.getTratosJFT().getText().trim().equals("")) {
					String msg = "É necessário digitar a quantidade de tratos.";
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					view.getDataJFT().grabFocus();
				} else {
					String msg = consumoBO.verificaCabecalhoConsumoTratos(view.getDataJFT().getText(), datasFases,
							Integer.parseInt(view.getTratosJFT().getText()));
					if (msg != null) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getTratosJFT().setEnabled(false);
						view.getDataJFT().setEnabled(true);
						view.getDataJFT().grabFocus();
					} else {
						view.getTratosJFT().setEnabled(false);
						view.getBaiaJFT().setEnabled(true);
						view.getBaiaJFT().grabFocus();
					}
				}
			} else if (e.getSource() == view.getBaiaJFT()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, view.getBaiaJFT().getText(), 3);
				view.getBaiaJFT().setEnabled(false);
				view.getConsumoJFT().setEnabled(true);
				view.getConsumoJFT().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT()) {
				TextFormatter.formatStringJFT(src, view.getConsumoJFT().getText(), 5);
				if (Integer.parseInt(view.getBaiaJFT().getText().trim()) == 0
						&& Integer.parseInt(view.getConsumoJFT().getText().trim()) == 0) {
					view.getConsumoJFT().setEnabled(false);
					view.getControle().setEnabled(true);
					view.getControle().grabFocus();
				} else {
					String msg = consumoBO.verificaConsumoTratos(Integer.parseInt(view.getBaiaJFT().getText().trim()),
							Integer.parseInt(view.getConsumoJFT().getText()));
					if (msg == null) {
						consumoTemp.add(new RmeTratosVOST(Integer.parseInt(view.getOrdemJFT().getText().trim()),
								Integer.parseInt(view.getBaiaJFT().getText()), Integer.parseInt(view.getConsumoJFT().getText())));
						view.getConsumoJFT().setEnabled(false);
						view.getBaiaJFT().setEnabled(true);
						view.getBaiaJFT().grabFocus();
						updateHist();
					} else {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getConsumoJFT().grabFocus();
					}
				}
			} else if (e.getSource() == view.getControle()) {
				TextFormatter.formatStringJFT(src, view.getControle().getText(), 5);
				if (Integer.parseInt(view.getBaiaJFT().getText()) == 0 && Integer.parseInt(view.getConsumoJFT().getText()) == 0
						&& Integer.parseInt(view.getControle().getText()) == 0) {
					view.getControle().setEnabled(false);
					view.getOpcaoJFT().setEnabled(true);
					view.getOpcaoJFT().grabFocus();
				} else if (Integer.parseInt(view.getControle().getText()) == calculaControleConsumo()) {
					if (controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
						ConsumoTratosVOST novoconsumo = new ConsumoTratosVOST();
						novoconsumo.getConsumo().addAll(consumoTemp);
						novoconsumo.setData(view.getDataJFT().getText());
						novoconsumo.setTratos(Integer.parseInt(view.getTratosJFT().getText()));
						controller.getModel().getExperimentoVO().getConsumosTratos().add(novoconsumo);
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getRegistrosLabel().setVisible(true);
						view.getPnlConsumo().setBorder(defaultBorder);
						consumoTemp = new ArrayList<>();
						atualizarHistorico();
						view.getControle().setText("00000");
						view.getControle().setEnabled(false);
						view.getBaiaJFT().setEnabled(true);
						view.getBaiaJFT().grabFocus();
					} else {
						if (controller.getModel().getExperimentoVO().getConsumosTratos()
								.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getData()
								.equals(view.getDataJFT().getText())) {
							ConsumoTratosVOST novoconsumo = new ConsumoTratosVOST();
							novoconsumo.getConsumo().addAll(consumoTemp);
							novoconsumo.setData(view.getDataJFT().getText());
							novoconsumo.setTratos(Integer.parseInt(view.getTratosJFT().getText()));
							controller.getModel().getExperimentoVO().getConsumosTratos()
									.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getConsumo()
									.addAll(novoconsumo.getConsumo());
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
						view.getPnlConsumo().setBorder(defaultBorder);
						atualizarHistorico();
						view.getControle().setText("00000");
						view.getControle().setEnabled(false);
						view.getBaiaJFT().setEnabled(true);
						view.getBaiaJFT().grabFocus();
					}
				} else {
					consumosErros.addAll(consumoTemp);
					consumoTemp = new ArrayList<>();
					fluxoErroControle();
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
			ordem = consumoHist.getConsumo().size() + 1;
			view.getOrdemJFT().setText(String.valueOf(ordem));
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
		} else {
			limparTela();
			ordem = 1;
			view.getOrdemJFT().setText(String.valueOf(ordem));
		}

	}

	private void adicionarConsumo(ConsumoTratosVOST novoConsumo) {
		novoConsumo.setData(view.getDataJFT().getText());
		novoConsumo.setTratos(Integer.parseInt(view.getTratosJFT().getText()));
		if (!view.getBaia1Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia1Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo1Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem1Label().getText().trim()),
								Integer.parseInt(view.getBaia1Label().getText().trim()),
								Integer.parseInt(view.getConsumo1Label().getText().trim())));
			}
		}

		if (!view.getBaia2Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia2Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo2Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem2Label().getText().trim()),
								Integer.parseInt(view.getBaia2Label().getText().trim()),
								Integer.parseInt(view.getConsumo2Label().getText().trim())));
			}
		}
		if (!view.getBaia3Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia3Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo3Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem3Label().getText().trim()),
								Integer.parseInt(view.getBaia3Label().getText().trim()),
								Integer.parseInt(view.getConsumo3Label().getText().trim())));
			}
		}
		if (!view.getBaia4Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia4Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo4Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem4Label().getText().trim()),
								Integer.parseInt(view.getBaia4Label().getText().trim()),
								Integer.parseInt(view.getConsumo4Label().getText().trim())));
			}
		}
		if (!view.getBaia5Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia5Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo5Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem5Label().getText().trim()),
								Integer.parseInt(view.getBaia5Label().getText().trim()),
								Integer.parseInt(view.getConsumo5Label().getText().trim())));
			}
		}
		if (!view.getBaia6Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia6Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo6Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem6Label().getText().trim()),
								Integer.parseInt(view.getBaia6Label().getText().trim()),
								Integer.parseInt(view.getConsumo6Label().getText().trim())));
			}
		}
		if (!view.getBaia7Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia7Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo7Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem7Label().getText().trim()),
								Integer.parseInt(view.getBaia7Label().getText().trim()),
								Integer.parseInt(view.getConsumo7Label().getText().trim())));
			}
		}
		if (!view.getBaia8Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia8Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo8Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem8Label().getText().trim()),
								Integer.parseInt(view.getBaia8Label().getText().trim()),
								Integer.parseInt(view.getConsumo8Label().getText().trim())));
			}
		}
		if (!view.getBaia9Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia9Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo9Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem9Label().getText().trim()),
								Integer.parseInt(view.getBaia9Label().getText().trim()),
								Integer.parseInt(view.getConsumo9Label().getText().trim())));
			}
		}
		if (!view.getBaia10Label().getText().trim().equals("")) {
			if (Integer.parseInt(view.getBaia10Label().getText().trim()) != 0
					&& Integer.parseInt(view.getConsumo10Label().getText().trim()) != 0) {
				novoConsumo.getConsumo()
						.add(new RmeTratosVOST(Integer.parseInt(view.getOrdem10Label().getText().trim()),
								Integer.parseInt(view.getBaia10Label().getText().trim()),
								Integer.parseInt(view.getConsumo10Label().getText().trim())));
			}
		}
	}

	private void atualizarHistorico() {
		view.getOrdemHist1Label().setText(view.getOrdem1Label().getText().trim());
		view.getOrdemHist2Label().setText(view.getOrdem2Label().getText().trim());
		view.getOrdemHist3Label().setText(view.getOrdem3Label().getText().trim());
		view.getOrdemHist4Label().setText(view.getOrdem4Label().getText().trim());
		view.getOrdemHist5Label().setText(view.getOrdem5Label().getText().trim());
		view.getOrdemHist6Label().setText(view.getOrdem6Label().getText().trim());
		view.getOrdemHist7Label().setText(view.getOrdem7Label().getText().trim());
		view.getOrdemHist8Label().setText(view.getOrdem8Label().getText().trim());
		view.getOrdemHist9Label().setText(view.getOrdem9Label().getText().trim());
		view.getOrdemHist10Label().setText(view.getOrdem10Label().getText().trim());
		view.getBaiaHist1Label().setText(view.getBaia1Label().getText().trim());
		view.getBaiaHist2Label().setText(view.getBaia2Label().getText().trim());
		view.getBaiaHist3Label().setText(view.getBaia3Label().getText().trim());
		view.getBaiaHist4Label().setText(view.getBaia4Label().getText().trim());
		view.getBaiaHist5Label().setText(view.getBaia5Label().getText().trim());
		view.getBaiaHist6Label().setText(view.getBaia6Label().getText().trim());
		view.getBaiaHist7Label().setText(view.getBaia7Label().getText().trim());
		view.getBaiaHist8Label().setText(view.getBaia8Label().getText().trim());
		view.getBaiaHist9Label().setText(view.getBaia9Label().getText().trim());
		view.getBaiaHist10Label().setText(view.getBaia10Label().getText().trim());
		view.getConsumoHist1Label().setText(view.getConsumo1Label().getText().trim());
		view.getConsumoHist2Label().setText(view.getConsumo2Label().getText().trim());
		view.getConsumoHist3Label().setText(view.getConsumo3Label().getText().trim());
		view.getConsumoHist4Label().setText(view.getConsumo4Label().getText().trim());
		view.getConsumoHist5Label().setText(view.getConsumo5Label().getText().trim());
		view.getConsumoHist6Label().setText(view.getConsumo6Label().getText().trim());
		view.getConsumoHist7Label().setText(view.getConsumo7Label().getText().trim());
		view.getConsumoHist8Label().setText(view.getConsumo8Label().getText().trim());
		view.getConsumoHist9Label().setText(view.getConsumo9Label().getText().trim());
		view.getConsumoHist10Label().setText(view.getConsumo10Label().getText().trim());

		view.getOrdem1Label().setText("");
		view.getBaia1Label().setText("");
		view.getConsumo1Label().setText("");
		view.getOrdem2Label().setText("");
		view.getBaia2Label().setText("");
		view.getConsumo2Label().setText("");
		view.getOrdem3Label().setText("");
		view.getBaia3Label().setText("");
		view.getConsumo3Label().setText("");
		view.getOrdem4Label().setText("");
		view.getBaia4Label().setText("");
		view.getConsumo4Label().setText("");
		view.getOrdem5Label().setText("");
		view.getBaia5Label().setText("");
		view.getConsumo5Label().setText("");
		view.getOrdem6Label().setText("");
		view.getBaia6Label().setText("");
		view.getConsumo6Label().setText("");
		view.getOrdem7Label().setText("");
		view.getBaia7Label().setText("");
		view.getConsumo7Label().setText("");
		view.getOrdem8Label().setText("");
		view.getBaia8Label().setText("");
		view.getConsumo8Label().setText("");
		view.getOrdem9Label().setText("");
		view.getBaia9Label().setText("");
		view.getConsumo9Label().setText("");
		view.getOrdem10Label().setText("");
		view.getBaia10Label().setText("");
		view.getConsumo10Label().setText("");
		view.getBaiaJFT().setText("");
		view.getConsumoJFT().setText("");
		view.getControle().setText("");
	}

	private void fluxoErroControle() {
		view.getOrdem1Label().setText("");
		view.getBaia1Label().setText("");
		view.getConsumo1Label().setText("");
		view.getOrdem2Label().setText("");
		view.getBaia2Label().setText("");
		view.getConsumo2Label().setText("");
		view.getOrdem3Label().setText("");
		view.getBaia3Label().setText("");
		view.getConsumo3Label().setText("");
		view.getOrdem4Label().setText("");
		view.getBaia4Label().setText("");
		view.getConsumo4Label().setText("");
		view.getOrdem5Label().setText("");
		view.getBaia5Label().setText("");
		view.getConsumo5Label().setText("");
		view.getOrdem6Label().setText("");
		view.getBaia6Label().setText("");
		view.getConsumo6Label().setText("");
		view.getOrdem7Label().setText("");
		view.getBaia7Label().setText("");
		view.getConsumo7Label().setText("");
		view.getOrdem8Label().setText("");
		view.getBaia8Label().setText("");
		view.getConsumo8Label().setText("");
		view.getOrdem9Label().setText("");
		view.getBaia9Label().setText("");
		view.getConsumo9Label().setText("");
		view.getOrdem10Label().setText("");
		view.getBaia10Label().setText("");
		view.getConsumo10Label().setText("");

		view.getOrdemJFT().setText(String.valueOf(consumosErros.get(0).getOrdem()));
		view.getBaiaJFT().setText(String.valueOf(consumosErros.get(0).getBaia()));
		view.getConsumoJFT().setText(String.valueOf(consumosErros.get(0).getConsumo()));

		consumosErros.remove(0);

		view.getBaiaJFT().setEnabled(false);
		view.getConsumoJFT().setEnabled(false);
		view.getControle().setEnabled(false);
		view.getPnlConsumo().setBorder(BorderFactory.createLineBorder(Color.RED, 2));

		view.getBaiaJFT().setEnabled(true);
		view.getBaiaJFT().grabFocus();

	}

	private int calculaControleConsumo() {
		int soma = 0;
		if (!view.getBaia1Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia1Label().getText().trim());
		}
		if (!view.getBaia2Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia2Label().getText().trim());
		}
		if (!view.getBaia3Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia3Label().getText().trim());
		}
		if (!view.getBaia4Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia4Label().getText().trim());
		}
		if (!view.getBaia5Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia5Label().getText().trim());
		}
		if (!view.getBaia6Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia6Label().getText().trim());
		}
		if (!view.getBaia7Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia7Label().getText().trim());
		}
		if (!view.getBaia8Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia8Label().getText().trim());
		}
		if (!view.getBaia9Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia9Label().getText().trim());
		}
		if (!view.getBaia10Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getBaia10Label().getText().trim());
		}
		if (!view.getConsumo1Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo1Label().getText().trim());
		}
		if (!view.getConsumo2Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo2Label().getText().trim());
		}
		if (!view.getConsumo3Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo3Label().getText().trim());
		}
		if (!view.getConsumo4Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo4Label().getText().trim());
		}
		if (!view.getConsumo5Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo5Label().getText().trim());
		}
		if (!view.getConsumo6Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo6Label().getText().trim());
		}
		if (!view.getConsumo7Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo7Label().getText().trim());
		}
		if (!view.getConsumo8Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo8Label().getText().trim());
		}
		if (!view.getConsumo9Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo9Label().getText().trim());
		}
		if (!view.getConsumo10Label().getText().trim().equals("")) {
			soma += Integer.parseInt(view.getConsumo10Label().getText().trim());
		}
		return soma;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if ((JFormattedTextField) e.getSource() == view.getOpcaoJFT()) {
			switch (e.getKeyChar()) {
			case KeyEvent.VK_0:
				int n = JOptionPane.showConfirmDialog(view, "Deseja realmente sair do programa?", "DIGEX - Sair", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (n == 0) {
					System.out.println("Fim...");
					System.exit(0);
				}
				break;
			case KeyEvent.VK_1:
				view.getRegistrosLabel().setVisible(true);
				limparTela();
				ordem = 1;
				view.getOrdemJFT().setText(String.valueOf(ordem));
				view.getOpcaoJFT().setText("");
				view.getOpcaoJFT().setEnabled(false);
				view.getTratosJFT().setText("0");
				view.getTratosJFT().setEnabled(false);
				view.getDataJFT().setText("00/00/0000");
				view.getDataJFT().setEnabled(true);
				view.getDataJFT().grabFocus();
				break;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getOpcaoJFT()) && !e.getSource().equals(view.getDataJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

	}

	private void limparTela() {
		view.getTratosJFT().setText("");
		view.getOrdemHist1Label().setText("");
		view.getOrdemHist2Label().setText("");
		view.getOrdemHist3Label().setText("");
		view.getOrdemHist4Label().setText("");
		view.getOrdemHist5Label().setText("");
		view.getOrdemHist6Label().setText("");
		view.getOrdemHist7Label().setText("");
		view.getOrdemHist8Label().setText("");
		view.getOrdemHist9Label().setText("");
		view.getOrdemHist10Label().setText("");
		view.getBaiaHist1Label().setText("");
		view.getBaiaHist2Label().setText("");
		view.getBaiaHist3Label().setText("");
		view.getBaiaHist4Label().setText("");
		view.getBaiaHist5Label().setText("");
		view.getBaiaHist6Label().setText("");
		view.getBaiaHist7Label().setText("");
		view.getBaiaHist8Label().setText("");
		view.getBaiaHist9Label().setText("");
		view.getBaiaHist10Label().setText("");
		view.getConsumoHist1Label().setText("");
		view.getConsumoHist2Label().setText("");
		view.getConsumoHist3Label().setText("");
		view.getConsumoHist4Label().setText("");
		view.getConsumoHist5Label().setText("");
		view.getConsumoHist6Label().setText("");
		view.getConsumoHist7Label().setText("");
		view.getConsumoHist8Label().setText("");
		view.getConsumoHist9Label().setText("");
		view.getConsumoHist10Label().setText("");
		view.getOrdem1Label().setText("");
		view.getBaia1Label().setText("");
		view.getConsumo1Label().setText("");
		view.getOrdem2Label().setText("");
		view.getBaia2Label().setText("");
		view.getConsumo2Label().setText("");
		view.getOrdem3Label().setText("");
		view.getBaia3Label().setText("");
		view.getConsumo3Label().setText("");
		view.getOrdem4Label().setText("");
		view.getBaia4Label().setText("");
		view.getConsumo4Label().setText("");
		view.getOrdem5Label().setText("");
		view.getBaia5Label().setText("");
		view.getConsumo5Label().setText("");
		view.getOrdem6Label().setText("");
		view.getBaia6Label().setText("");
		view.getConsumo6Label().setText("");
		view.getOrdem7Label().setText("");
		view.getBaia7Label().setText("");
		view.getConsumo7Label().setText("");
		view.getOrdem8Label().setText("");
		view.getBaia8Label().setText("");
		view.getConsumo8Label().setText("");
		view.getOrdem9Label().setText("");
		view.getBaia9Label().setText("");
		view.getConsumo9Label().setText("");
		view.getOrdem10Label().setText("");
		view.getBaia10Label().setText("");
		view.getConsumo10Label().setText("");
		view.getBaiaJFT().setText("");
		view.getConsumoJFT().setText("");
		view.getControle().setText("");

	}

	public void updateHist() {
		view.getOrdem1Label().setText(view.getOrdem2Label().getText().trim());
		view.getOrdem2Label().setText(view.getOrdem3Label().getText().trim());
		view.getOrdem3Label().setText(view.getOrdem4Label().getText().trim());
		view.getOrdem4Label().setText(view.getOrdem5Label().getText().trim());
		view.getOrdem5Label().setText(view.getOrdem6Label().getText().trim());
		view.getOrdem6Label().setText(view.getOrdem7Label().getText().trim());
		view.getOrdem7Label().setText(view.getOrdem8Label().getText().trim());
		view.getOrdem8Label().setText(view.getOrdem9Label().getText().trim());
		view.getOrdem9Label().setText(view.getOrdem10Label().getText().trim());
		view.getOrdem10Label().setText(view.getOrdemJFT().getText().trim());
		view.getBaia1Label().setText(view.getBaia2Label().getText().trim());
		view.getBaia2Label().setText(view.getBaia3Label().getText().trim());
		view.getBaia3Label().setText(view.getBaia4Label().getText().trim());
		view.getBaia4Label().setText(view.getBaia5Label().getText().trim());
		view.getBaia5Label().setText(view.getBaia6Label().getText().trim());
		view.getBaia6Label().setText(view.getBaia7Label().getText().trim());
		view.getBaia7Label().setText(view.getBaia8Label().getText().trim());
		view.getBaia8Label().setText(view.getBaia9Label().getText().trim());
		view.getBaia9Label().setText(view.getBaia10Label().getText().trim());
		view.getBaia10Label().setText(view.getBaiaJFT().getText().trim());
		view.getConsumo1Label().setText(view.getConsumo2Label().getText().trim());
		view.getConsumo2Label().setText(view.getConsumo3Label().getText().trim());
		view.getConsumo3Label().setText(view.getConsumo4Label().getText().trim());
		view.getConsumo4Label().setText(view.getConsumo5Label().getText().trim());
		view.getConsumo5Label().setText(view.getConsumo6Label().getText().trim());
		view.getConsumo6Label().setText(view.getConsumo7Label().getText().trim());
		view.getConsumo7Label().setText(view.getConsumo8Label().getText().trim());
		view.getConsumo8Label().setText(view.getConsumo9Label().getText().trim());
		view.getConsumo9Label().setText(view.getConsumo10Label().getText().trim());
		view.getConsumo10Label().setText(view.getConsumoJFT().getText().trim());

		if (consumosErros.size() > 0) {
			recuperaHistConsumo();
		} else {
			view.getOrdemJFT().setText(String.valueOf(++ordem));
			TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText().trim(), 3);
			view.getBaiaJFT().setText("000");
			TextFormatter.formatStringJFT(view.getBaiaJFT(), view.getBaiaJFT().getText().trim(), 3);
			view.getConsumoJFT().setText("00000");
			TextFormatter.formatStringJFT(view.getConsumoJFT(), view.getConsumoJFT().getText().trim(), 5);

			view.getBaiaJFT().grabFocus();
			view.pack();
		}
	}

//	public void fluxoProblemaDigitacaoRacoes() {
//		viewLivre.getPnlConsumo().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
//		viewLivre.getDataJFT().setEnabled(true);
//		viewLivre.getDataJFT().grabFocus();
//		viewLivre.getFornecidaJFT().setEnabled(false);
//		viewLivre.getSobraJFT().setEnabled(false);
//		viewLivre.getControleFornecidaJFT().setEnabled(false);
//		viewLivre.getControleSobraJFT().setEnabled(false);
//	}

	public void recuperaHistConsumo() {
		view.getConsumoJFT().setText("" + consumosErros.get(0).getConsumo());
		TextFormatter.formatStringJFT(view.getConsumoJFT(), view.getConsumoJFT().getText(), 5);
		view.getBaiaJFT().setText("" + consumosErros.get(0).getBaia());
		TextFormatter.formatStringJFT(view.getBaiaJFT(), view.getBaiaJFT().getText(), 3);
		view.getOrdemJFT().setText("" + consumosErros.get(0).getOrdem());
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 3);

		consumosErros.remove(0);
		view.getConsumoJFT().setEnabled(false);
		view.getBaiaJFT().setEnabled(true);
		view.getBaiaJFT().grabFocus();
	}

//	public void fluxoErroControle() {
//		viewLivre.getDataJFT().setText("00/00/0000");
//		viewLivre.getFornecidaJFT().setText("00000");
//		viewLivre.getSobraJFT().setText("00000");
//		viewLivre.getOrdemHist5Label().setText("");
//		viewLivre.getOrdemHist4Label().setText("");
//		viewLivre.getOrdemHist3Label().setText("");
//		viewLivre.getOrdemHist2Label().setText("");
//		viewLivre.getOrdemHist1Label().setText("");
//		viewLivre.getDataHist5Label().setText("");
//		viewLivre.getDataHist4Label().setText("");
//		viewLivre.getDataHist3Label().setText("");
//		viewLivre.getDataHist2Label().setText("");
//		viewLivre.getDataHist1Label().setText("");
//		viewLivre.getFornecidaHist5Label().setText("");
//		viewLivre.getFornecidaHist1Label().setText("");
//		viewLivre.getFornecidaHist2Label().setText("");
//		viewLivre.getFornecidaHist3Label().setText("");
//		viewLivre.getFornecidaHist4Label().setText("");
//		viewLivre.getSobraHist5Label().setText("");
//		viewLivre.getSobraHist1Label().setText("");
//		viewLivre.getSobraHist2Label().setText("");
//		viewLivre.getSobraHist3Label().setText("");
//		viewLivre.getSobraHist4Label().setText("");
//	}

//	private void fluxoProblemaCabecalho() {
//		viewLivre.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
//		viewLivre.getBaiaJFT().setEnabled(true);
//		viewLivre.getBaiaJFT().grabFocus();
//		viewLivre.getSexoJFT().setEnabled(false);
//		viewLivre.getTrataJFT().setEnabled(false);
//		viewLivre.getTrata2JFT().setEnabled(false);
//	}

//	private void fluxoOkCabecalho() {
//		viewLivre.getBaiaJP().setBorder(defaultBorder);
//		viewLivre.getBaiaJFT().setEnabled(false);
//		viewLivre.getSexoJFT().setEnabled(false);
//		viewLivre.getTrataJFT().setEnabled(false);
//		viewLivre.getTrata2JFT().setEnabled(false);
//		viewLivre.getDataJFT().setEnabled(true);
//		viewLivre.getDataJFT().grabFocus();
//	}

	private void criarOrdemComponentesErros() {
		orderErros = new ArrayList<>();
		orderErros.add(view.getOrdem1Label());
		orderErros.add(view.getBaia1Label());
		orderErros.add(view.getConsumo1Label());
		orderErros.add(view.getOrdem2Label());
		orderErros.add(view.getBaia2Label());
		orderErros.add(view.getConsumo2Label());
		orderErros.add(view.getOrdem3Label());
		orderErros.add(view.getBaia3Label());
		orderErros.add(view.getConsumo3Label());
		orderErros.add(view.getOrdem4Label());
		orderErros.add(view.getBaia4Label());
		orderErros.add(view.getConsumo4Label());
		orderErros.add(view.getOrdem5Label());
		orderErros.add(view.getBaia5Label());
		orderErros.add(view.getConsumo5Label());
		orderErros.add(view.getOrdem6Label());
		orderErros.add(view.getBaia6Label());
		orderErros.add(view.getConsumo6Label());
		orderErros.add(view.getOrdem7Label());
		orderErros.add(view.getBaia7Label());
		orderErros.add(view.getConsumo7Label());
		orderErros.add(view.getOrdem8Label());
		orderErros.add(view.getBaia8Label());
		orderErros.add(view.getConsumo8Label());
		orderErros.add(view.getOrdem9Label());
		orderErros.add(view.getBaia9Label());
		orderErros.add(view.getConsumo9Label());
		orderErros.add(view.getOrdem10Label());
		orderErros.add(view.getBaia10Label());
		orderErros.add(view.getConsumo10Label());

		for (int k = 0; k < orderErros.size(); k++) {
			if (k % 2 == 0) {
				orderErros.get(k).setName("baia");
			} else if (k % 3 == 0) {
				orderErros.get(k).setName("consumo");
			} else {
				orderErros.get(k).setName("ordem");
			}
		}

	}

	private void criarOrdemComponentesHist() {
		orderHist = new ArrayList<>();
		orderHist.add(view.getOrdemHist10Label());
		orderHist.add(view.getBaiaHist10Label());
		orderHist.add(view.getConsumoHist10Label());
		orderHist.add(view.getOrdemHist9Label());
		orderHist.add(view.getBaiaHist9Label());
		orderHist.add(view.getConsumoHist9Label());
		orderHist.add(view.getOrdemHist8Label());
		orderHist.add(view.getBaiaHist8Label());
		orderHist.add(view.getConsumoHist8Label());
		orderHist.add(view.getOrdemHist7Label());
		orderHist.add(view.getBaiaHist7Label());
		orderHist.add(view.getConsumoHist7Label());
		orderHist.add(view.getOrdemHist6Label());
		orderHist.add(view.getBaiaHist6Label());
		orderHist.add(view.getConsumoHist6Label());
		orderHist.add(view.getOrdemHist5Label());
		orderHist.add(view.getBaiaHist5Label());
		orderHist.add(view.getConsumoHist5Label());
		orderHist.add(view.getOrdemHist4Label());
		orderHist.add(view.getBaiaHist4Label());
		orderHist.add(view.getConsumoHist4Label());
		orderHist.add(view.getOrdemHist3Label());
		orderHist.add(view.getBaiaHist3Label());
		orderHist.add(view.getConsumoHist3Label());
		orderHist.add(view.getOrdemHist2Label());
		orderHist.add(view.getBaiaHist2Label());
		orderHist.add(view.getConsumoHist2Label());
		orderHist.add(view.getOrdemHist1Label());
		orderHist.add(view.getBaiaHist1Label());
		orderHist.add(view.getConsumoHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTratosJFT());
		order.add(view.getBaiaJFT());
		order.add(view.getConsumoJFT());
		order.add(view.getControle());
		order.add(view.getOpcaoJFT());

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
