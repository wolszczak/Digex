package brf.suino.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.bo.ConsumoBOSC;
import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.RmeVOSC;
import brf.suino.view.ViewConsumoSC;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoSC extends KeyAdapter implements ActionListener, FocusListener, ItemListener {
	private final ControllerSC controller;
	private ViewConsumoSC viewConsumo;
	private ConsumoBOSC consumoBO;
	private List<RmeVOSC> consumos, consumosErros;
	private int ordem, controleBaia;
	private boolean usarColunaExtra;
	private List<String> datasFase;
	private List<Component> order, orderLoadHist;
	private Border defaultBorder;

	public ControllerConsumoSC(ControllerSC c) {
		this.controller = c;
		this.consumoBO = new ConsumoBOSC(controller);
	}

	public void openWindow(List<String> datasFases) {
		viewConsumo = new ViewConsumoSC();
		this.datasFase = datasFases;
		consumos = new ArrayList<>();
		consumosErros = new ArrayList<>();
		usarColunaExtra = false;
		viewConsumo.setTitle("DIGEX - Suínos Creche");
		viewConsumo.setResizable(false);
		viewConsumo.setLocationRelativeTo(null);
		viewConsumo.setVisible(true);
		viewConsumo.getRegistrosLabel().setVisible(false);
		defaultBorder = viewConsumo.getConsumoJP().getBorder();
		ordem = 1;

		viewConsumo.getChkUsarColunaExtra().addItemListener(this);
		viewConsumo.getChkUsarColunaExtra().addKeyListener(this);
		if (controller.getModel().getExperimentoVO().getConsumo() != null
				&& controller.getModel().getExperimentoVO().getConsumo().size() > 0) {
			usarColunaExtra = controller.getModel().getExperimentoVO().getConsumo()
					.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isColunaExtra();
			if (controller.getModel().getExperimentoVO().getConsumo().get(controller.getModel().getExperimentoVO().getConsumo().size() - 1)
					.getRme().size() > 0) {
				ordem = controller.getModel().getExperimentoVO().getConsumo()
						.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
						.get(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size() - 1)
						.getOrdem() + 1;
			}
		}

		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();

		if (!usarColunaExtra) {
			viewConsumo.getPesoHist1Label().setText("--");
			viewConsumo.getPesoHist2Label().setText("--");
			viewConsumo.getPesoHist3Label().setText("--");
			viewConsumo.getPesoHist4Label().setText("--");
			viewConsumo.getPesoHist5Label().setText("--");
			viewConsumo.getnAnimaisHist1Label().setText("--");
			viewConsumo.getnAnimaisHist2Label().setText("--");
			viewConsumo.getnAnimaisHist3Label().setText("--");
			viewConsumo.getnAnimaisHist4Label().setText("--");
			viewConsumo.getnAnimaisHist5Label().setText("--");
			viewConsumo.getPesoJFT().setText("--");
			viewConsumo.getnAnimaisJFT().setText("--");
			viewConsumo.getControlePesoJFT().setText("--");
			viewConsumo.getControleAnimaisJFT().setText("--");
			viewConsumo.getFornecidaJFT().setText("00000");
			viewConsumo.getSobraJFT().setText("00000");
			viewConsumo.getPesoJFT().setText("00");
			viewConsumo.getnAnimaisJFT().setText("00");
			viewConsumo.getControleFornecidaJFT().setText("000000");
			viewConsumo.getControleSobraJFT().setText("000000");
			viewConsumo.getControlePesoJFT().setText("00");
			viewConsumo.getControleAnimaisJFT().setText("00");

		} else {
			viewConsumo.getFornecidaJFT().setText("00000");
			viewConsumo.getSobraJFT().setText("00000");
			viewConsumo.getPesoJFT().setText("000000");
			viewConsumo.getnAnimaisJFT().setText("000");
			viewConsumo.getControleFornecidaJFT().setText("000000");
			viewConsumo.getControleSobraJFT().setText("000000");
			viewConsumo.getControlePesoJFT().setText("000000");
			viewConsumo.getControleAnimaisJFT().setText("000000");
		}

		viewConsumo.getOrdemJFT().setText(String.valueOf(ordem).trim());
		TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
		viewConsumo.pack();
	}

	private void loadHist() {
		viewConsumo.getGalpaoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getInfoExp().getGalpao()).trim());
		if (controller.getModel().getExperimentoVO().getConsumo() != null
				&& controller.getModel().getExperimentoVO().getConsumo().size() > 0) {

			if (controller.getModel().getExperimentoVO().getConsumo() != null && !controller.getModel().getExperimentoVO().getConsumo()
					.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isFinalizado()) {
				ConsumoVOSC consumoHist = controller.getModel().getExperimentoVO().getConsumo()
						.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1);

				if (consumoHist.getRme().size() > 0) {
					if (consumoHist.getRme().size() > 5) {
						if (usarColunaExtra) {
							for (int k = 1; k <= 5; k++) {
								JLabel lbl1 = (JLabel) orderLoadHist.get(0);
								lbl1.setText(
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getNumAnimais()).trim());
								orderLoadHist.remove(0);
								JLabel lbl2 = (JLabel) orderLoadHist.get(0);
								lbl2.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getPeso()).trim());
								orderLoadHist.remove(0);
								JLabel lbl3 = (JLabel) orderLoadHist.get(0);
								lbl3.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getSobra()).trim());
								orderLoadHist.remove(0);
								JLabel lbl4 = (JLabel) orderLoadHist.get(0);
								lbl4.setText(
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getFornecida()).trim());
								orderLoadHist.remove(0);
								JLabel lbl5 = (JLabel) orderLoadHist.get(0);
								lbl5.setText(
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getDataRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl6 = (JLabel) orderLoadHist.get(0);
								lbl6.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						} else {
							for (int k = 1; k <= 5; k++) {
								JLabel lbl1 = (JLabel) orderLoadHist.get(0);
								lbl1.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getSobra()).trim());
								orderLoadHist.remove(0);
								JLabel lbl2 = (JLabel) orderLoadHist.get(0);
								lbl2.setText(
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getFornecida()).trim());
								orderLoadHist.remove(0);
								JLabel lbl3 = (JLabel) orderLoadHist.get(0);
								lbl3.setText(
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getDataRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl4 = (JLabel) orderLoadHist.get(0);
								lbl4.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						}
					} else {
						if (usarColunaExtra) {
							for (int z = consumoHist.getRme().size(); z > 0; z--) {
								JLabel lbl1 = (JLabel) orderLoadHist.get(0);
								lbl1.setText(String.valueOf(consumoHist.getRme().get(z - 1).getNumAnimais()).trim());
								orderLoadHist.remove(0);
								JLabel lbl2 = (JLabel) orderLoadHist.get(0);
								lbl2.setText(String.valueOf(consumoHist.getRme().get(z - 1).getPeso()).trim());
								orderLoadHist.remove(0);
								JLabel lbl3 = (JLabel) orderLoadHist.get(0);
								lbl3.setText(String.valueOf(consumoHist.getRme().get(z - 1).getSobra()).trim());
								orderLoadHist.remove(0);
								JLabel lbl4 = (JLabel) orderLoadHist.get(0);
								lbl4.setText(String.valueOf(consumoHist.getRme().get(z - 1).getFornecida()).trim());
								orderLoadHist.remove(0);
								JLabel lbl5 = (JLabel) orderLoadHist.get(0);
								lbl5.setText(String.valueOf(consumoHist.getRme().get(z - 1).getDataRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl6 = (JLabel) orderLoadHist.get(0);
								lbl6.setText(String.valueOf(consumoHist.getRme().get(z - 1).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						} else {
							for (int z = consumoHist.getRme().size(); z > 0; z--) {
								JLabel lbl1 = (JLabel) orderLoadHist.get(0);
								lbl1.setText(String.valueOf(consumoHist.getRme().get(z - 1).getSobra()).trim());
								orderLoadHist.remove(0);
								JLabel lbl2 = (JLabel) orderLoadHist.get(0);
								lbl2.setText(String.valueOf(consumoHist.getRme().get(z - 1).getFornecida()).trim());
								orderLoadHist.remove(0);
								JLabel lbl3 = (JLabel) orderLoadHist.get(0);
								lbl3.setText(String.valueOf(consumoHist.getRme().get(z - 1).getDataRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl4 = (JLabel) orderLoadHist.get(0);
								lbl4.setText(String.valueOf(consumoHist.getRme().get(z - 1).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						}
					}
				}
				viewConsumo.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()).trim());
				viewConsumo.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()).trim());
				viewConsumo.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()).trim());
				viewConsumo.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()).trim());
				if (consumoHist.isColunaExtra()) {
					viewConsumo.getChkUsarColunaExtra().setSelected(true);
				} else {
					viewConsumo.getChkUsarColunaExtra().setSelected(false);
				}
				viewConsumo.getBaiaJFT().setEnabled(false);
				viewConsumo.getControleBaiaLabel().setVisible(false);
				viewConsumo.getControleBaiaJFT().setVisible(false);
				viewConsumo.getChkUsarColunaExtra().setEnabled(false);
				viewConsumo.getDataJFT().setEnabled(true);
				viewConsumo.getDataJFT().grabFocus();
			} else {
				viewConsumo.getBaiaJFT().setEnabled(true);
				viewConsumo.getBaiaJFT().grabFocus();
			}
		} else {
			viewConsumo.getBaiaJFT().setEnabled(true);
			viewConsumo.getBaiaJFT().grabFocus();
		}

	}

	public void listenerSetup(List<Component> components) {
		components.stream().forEach((it) -> {
			if (it instanceof JFormattedTextField) {
				((JFormattedTextField) it).addFocusListener(this);
			} else if (it instanceof JCheckBox) {
				((JCheckBox) it).addItemListener(this);
			}
			if (!(it instanceof JCheckBox)) {
				it.addKeyListener(this);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object src = e.getSource();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				if (src instanceof JFormattedTextField) {
					((JFormattedTextField) src).setCaretPosition(0);
					((JFormattedTextField) src).selectAll();
				}
			}
		});
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == viewConsumo.getChkUsarColunaExtra()) {
			usarColunaExtra = true;
			viewConsumo.getPesoHist1Label().setText("");
			viewConsumo.getPesoHist2Label().setText("");
			viewConsumo.getPesoHist3Label().setText("");
			viewConsumo.getPesoHist4Label().setText("");
			viewConsumo.getPesoHist5Label().setText("");
			viewConsumo.getnAnimaisHist1Label().setText("");
			viewConsumo.getnAnimaisHist2Label().setText("");
			viewConsumo.getnAnimaisHist3Label().setText("");
			viewConsumo.getnAnimaisHist4Label().setText("");
			viewConsumo.getnAnimaisHist5Label().setText("");
			viewConsumo.getPesoJFT().setText("000000");
			viewConsumo.getnAnimaisJFT().setText("00");
		} else {
			usarColunaExtra = false;
			viewConsumo.getPesoJFT().setEnabled(false);
			viewConsumo.getnAnimaisJFT().setEnabled(false);
			viewConsumo.getPesoHist1Label().setText("--");
			viewConsumo.getPesoHist2Label().setText("--");
			viewConsumo.getPesoHist3Label().setText("--");
			viewConsumo.getPesoHist4Label().setText("--");
			viewConsumo.getPesoHist5Label().setText("--");
			viewConsumo.getnAnimaisHist1Label().setText("--");
			viewConsumo.getnAnimaisHist2Label().setText("--");
			viewConsumo.getnAnimaisHist3Label().setText("--");
			viewConsumo.getnAnimaisHist4Label().setText("--");
			viewConsumo.getnAnimaisHist5Label().setText("--");
			viewConsumo.getPesoJFT().setText("00");
			viewConsumo.getnAnimaisJFT().setText("00");

		}
	}

	@Override
	public void focusLost(FocusEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewConsumo.getDataJFT())) {
			System.out.println("left");
			Component prev = viewConsumo.getFocusTraversalPolicy().getComponentBefore(viewConsumo, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
			JFormattedTextField jft = null;
			JCheckBox chk = null;
			String text = "";
			if (e.getSource() == viewConsumo.getChkUsarColunaExtra()) {
				if (viewConsumo.getBaiaJFT().getText().matches("^[0-9]{3}") && viewConsumo.getSexoJFT().getText().matches("^[0-9]{1}")
						&& viewConsumo.getTrataJFT().getText().matches("^[0-9]{1}") && viewConsumo.getTrata2JFT().getText().matches("^[0-9]{1,2}")
						&& viewConsumo.getControleBaiaJFT().getText().matches("^[0-9]{4}")) {
					if (consumoBO.isBaiaDigitada(Integer.parseInt(viewConsumo.getBaiaJFT().getText()))) {
						int option = JOptionPane.showConfirmDialog(viewConsumo, "Baia já digitada.\nDeseja digitar novamente?",
								"DIGEX - Aviso", JOptionPane.WARNING_MESSAGE);
						if (option == 0) {
							consumoBO.excluirBaia(Integer.parseInt(viewConsumo.getBaiaJFT().getText()));
							System.out.println("Baia antiga foi excluida");
							controller.getModel().getExperimentoVO().getConsumo()
									.add(new ConsumoVOSC(Integer.parseInt(viewConsumo.getBaiaJFT().getText()),
											Integer.parseInt(viewConsumo.getSexoJFT().getText()),
											Integer.parseInt(viewConsumo.getTrataJFT().getText()),
											Integer.parseInt(viewConsumo.getTrata2JFT().getText()), usarColunaExtra, false,
											new ArrayList<>()));
							controller.getModel().getModelStateDAO().saveModelState(false);
							System.out.println("Adicionada nova Baia");
							viewConsumo.getOrdemJFT().setText("1");
							TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
							fluxoOkCabecalho();
						} else {
							fluxoProblemaCabecalho();
						}
					} else {
						controller.getModel().getExperimentoVO().getConsumo()
								.add(new ConsumoVOSC(Integer.parseInt(viewConsumo.getBaiaJFT().getText()),
										Integer.parseInt(viewConsumo.getSexoJFT().getText()),
										Integer.parseInt(viewConsumo.getTrataJFT().getText()),
										Integer.parseInt(viewConsumo.getTrata2JFT().getText()), usarColunaExtra, false,
										new ArrayList<>()));
						controller.getModel().getModelStateDAO().saveModelState(false);
						viewConsumo.getOrdemJFT().setText("1");
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
						fluxoOkCabecalho();
					}
				}else {
					viewConsumo.getBaiaJFT().setEnabled(true);
					viewConsumo.getBaiaJFT().grabFocus();
				}
				
				criarOrdemComponentes();
			} else {
				jft = (JFormattedTextField) e.getSource();
				text = jft.getText();

				if ((JFormattedTextField) e.getSource() == viewConsumo.getBaiaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					viewConsumo.getRegistrosLabel().setVisible(false);
					viewConsumo.getBaiaJFT().setEnabled(false);
					viewConsumo.getSexoJFT().setEnabled(true);
					viewConsumo.getSexoJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getSexoJFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					viewConsumo.getSexoJFT().setEnabled(false);
					viewConsumo.getTrataJFT().setEnabled(true);
					viewConsumo.getTrataJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getTrataJFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					viewConsumo.getTrataJFT().setEnabled(false);
					viewConsumo.getTrata2JFT().setEnabled(true);
					viewConsumo.getTrata2JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getTrata2JFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					viewConsumo.getTrata2JFT().setEnabled(false);
					viewConsumo.getControleBaiaJFT().setEnabled(true);
					viewConsumo.getControleBaiaJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleBaiaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 4);
					controleBaia = Integer.parseInt(viewConsumo.getControleBaiaJFT().getText());
					int somaControle = Integer.parseInt(viewConsumo.getBaiaJFT().getText())
							+ Integer.parseInt(viewConsumo.getSexoJFT().getText()) + Integer.parseInt(viewConsumo.getTrataJFT().getText())
							+ Integer.parseInt(viewConsumo.getTrata2JFT().getText());
					if (controleBaia != somaControle) {
						fluxoProblemaCabecalho();
					} else {
						String msg = consumoBO.verificaCabecalho(Integer.parseInt(viewConsumo.getBaiaJFT().getText()),
								Integer.parseInt(viewConsumo.getSexoJFT().getText()), Integer.parseInt(viewConsumo.getTrataJFT().getText()),
								Integer.parseInt(viewConsumo.getTrata2JFT().getText()));
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaCabecalho();
						} else {
							viewConsumo.getControleBaiaJFT().setEnabled(false);
							viewConsumo.getChkUsarColunaExtra().grabFocus();
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getDataJFT()) {
					TextFormatter.formatStringJFT(jft, text, 10);
					viewConsumo.getDataJFT().setEnabled(false);
					viewConsumo.getFornecidaJFT().setEnabled(true);
					viewConsumo.getFornecidaJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getFornecidaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					viewConsumo.getFornecidaJFT().setEnabled(false);
					viewConsumo.getSobraJFT().setEnabled(true);
					viewConsumo.getSobraJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getSobraJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					String msg = consumoBO.verificaRacao(viewConsumo.getDataJFT().getText(),
							Integer.parseInt(viewConsumo.getFornecidaJFT().getText()),
							Integer.parseInt(viewConsumo.getSobraJFT().getText()), datasFase);
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaDigitacaoRacoes();
					} else if (viewConsumo.getData().getText().equals("00/00/0000")
							&& Integer.parseInt(viewConsumo.getFornecidaJFT().getText()) == 0
							&& Integer.parseInt(viewConsumo.getSobraJFT().getText()) == 0) {
						if (controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size() > 0) {
							if (usarColunaExtra) {
								viewConsumo.getSobraJFT().setEnabled(false);
								viewConsumo.getPesoJFT().setEnabled(true);
								viewConsumo.getPesoJFT().grabFocus();
							} else {
								controller.getModel().getExperimentoVO().getConsumo()
										.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
										.add(new RmeVOSC(Integer.parseInt(viewConsumo.getOrdemJFT().getText()),
												viewConsumo.getData().getText(), Integer.parseInt(viewConsumo.getFornecidaJFT().getText()),
												Integer.parseInt(viewConsumo.getSobraJFT().getText()),
												Integer.parseInt(viewConsumo.getPesoJFT().getText()),
												Integer.parseInt(viewConsumo.getnAnimaisJFT().getText())));
								controller.getModel().getModelStateDAO().saveModelState(false);
							}
						} else {
							// mensagem de erro
							JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaDigitacaoRacoes();
						}
					} else {
						if (usarColunaExtra) {
							viewConsumo.getSobraJFT().setEnabled(false);
							viewConsumo.getPesoJFT().setEnabled(true);
							viewConsumo.getPesoJFT().grabFocus();
						} else {
							controller.getModel().getExperimentoVO().getConsumo()
									.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
									.add(new RmeVOSC(Integer.parseInt(viewConsumo.getOrdemJFT().getText()), viewConsumo.getData().getText(),
											Integer.parseInt(viewConsumo.getFornecidaJFT().getText()),
											Integer.parseInt(viewConsumo.getSobraJFT().getText()),
											Integer.parseInt(viewConsumo.getPesoJFT().getText()),
											Integer.parseInt(viewConsumo.getnAnimaisJFT().getText())));
							controller.getModel().getModelStateDAO().saveModelState(false);
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getPesoJFT()) {
					TextFormatter.formatStringJFT(jft, text, 5);
					viewConsumo.getPesoJFT().setEnabled(false);
					viewConsumo.getnAnimaisJFT().setEnabled(true);
					viewConsumo.getnAnimaisJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getnAnimaisJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					if (consumos.size() == 0 && (viewConsumo.getDataJFT().getText().trim().equals("00/00/0000")
							&& Integer.parseInt(viewConsumo.getFornecidaJFT().getText()) == 0
							&& Integer.parseInt(viewConsumo.getSobraJFT().getText()) == 0
							&& Integer.parseInt(viewConsumo.getPesoJFT().getText()) == 0
							&& Integer.parseInt(viewConsumo.getnAnimaisJFT().getText()) == 0)) {
						String mensagem = "Nenhum registro de ração foi digitado para essa baia";
						JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + mensagem, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						viewConsumo.getnAnimaisJFT().setEnabled(false);
						viewConsumo.getData().setEnabled(true);
						viewConsumo.getData().grabFocus();
					} else {
						viewConsumo.getnAnimaisJFT().setEnabled(false);
						viewConsumo.getControleFornecidaJFT().setEnabled(true);
						viewConsumo.getControleFornecidaJFT().requestFocus();
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleFornecidaJFT()) {
					if (Integer.parseInt(viewConsumo.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						viewConsumo.getControleFornecidaJFT().setEnabled(false);
						viewConsumo.getControleSobraJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						viewConsumo.getControleSobraJFT().grabFocus();
					} else {
						viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(consumos);
						consumos = new ArrayList<>();
						fluxoErroControleFornecida();
						ordem = consumosErros.get(0).getOrdem();
//						recuperaHistConsumo(true, false);
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleSobraJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					viewConsumo.getControleSobraJFT().setEnabled(false);
//					viewConsumo.getTrataJFT().setEnabled(true);
//					viewConsumo.getTrataJFT().requestFocus();
				}
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewConsumo, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewConsumo.setVisible(false);
				ControllerEscolhaDigSC ce = new ControllerEscolhaDigSC(controller);
				ce.openWindow(datasFase);
				System.out.println("Voltar");
			}
		} 
	}

	public void updateHistRME() {
		viewConsumo.getOrdemHist1Label().setText(viewConsumo.getOrdemHist2Label().getText());
		viewConsumo.getOrdemHist2Label().setText(viewConsumo.getOrdemHist3Label().getText());
		viewConsumo.getOrdemHist3Label().setText(viewConsumo.getOrdemHist4Label().getText());
		viewConsumo.getOrdemHist4Label().setText(viewConsumo.getOrdemHist5Label().getText());
		viewConsumo.getOrdemHist5Label().setText(viewConsumo.getOrdemJFT().getText());
		viewConsumo.getData1HistLabel().setText(viewConsumo.getData2HistLabel().getText());
		viewConsumo.getData2HistLabel().setText(viewConsumo.getData3HistLabel().getText());
		viewConsumo.getData3HistLabel().setText(viewConsumo.getData4HistLabel().getText());
		viewConsumo.getData4HistLabel().setText(viewConsumo.getData5HistLabel().getText());
		viewConsumo.getData5HistLabel().setText(viewConsumo.getDataJFT().getText());
		viewConsumo.getFornecidaHist1Label().setText(viewConsumo.getFornecidaHist2Label().getText());
		viewConsumo.getFornecidaHist2Label().setText(viewConsumo.getFornecidaHist3Label().getText());
		viewConsumo.getFornecidaHist3Label().setText(viewConsumo.getFornecidaHist4Label().getText());
		viewConsumo.getFornecidaHist4Label().setText(viewConsumo.getFornecidaHist5Label().getText());
		viewConsumo.getFornecidaHist5Label().setText(viewConsumo.getFornecidaJFT().getText());
		viewConsumo.getSobraHist1Label().setText(viewConsumo.getSobraHist2Label().getText());
		viewConsumo.getSobraHist2Label().setText(viewConsumo.getSobraHist3Label().getText());
		viewConsumo.getSobraHist3Label().setText(viewConsumo.getSobraHist4Label().getText());
		viewConsumo.getSobraHist4Label().setText(viewConsumo.getSobraHist5Label().getText());
		viewConsumo.getSobraHist5Label().setText(viewConsumo.getSobraJFT().getText());
		if (usarColunaExtra) {
			viewConsumo.getPesoHist1Label().setText(viewConsumo.getPesoHist2Label().getText());
			viewConsumo.getPesoHist2Label().setText(viewConsumo.getPesoHist3Label().getText());
			viewConsumo.getPesoHist3Label().setText(viewConsumo.getPesoHist4Label().getText());
			viewConsumo.getPesoHist4Label().setText(viewConsumo.getPesoHist5Label().getText());
			viewConsumo.getPesoHist5Label().setText(viewConsumo.getPesoJFT().getText());
			viewConsumo.getnAnimaisHist1Label().setText(viewConsumo.getnAnimaisHist2Label().getText());
			viewConsumo.getnAnimaisHist2Label().setText(viewConsumo.getnAnimaisHist3Label().getText());
			viewConsumo.getnAnimaisHist3Label().setText(viewConsumo.getnAnimaisHist4Label().getText());
			viewConsumo.getnAnimaisHist4Label().setText(viewConsumo.getnAnimaisHist5Label().getText());
			viewConsumo.getnAnimaisHist5Label().setText(viewConsumo.getnAnimaisJFT().getText());
		}
		if (!consumosErros.isEmpty()) {
			recuperaHistConsumo(false, false, false, false);
		} else {
			viewConsumo.getDataJFT().setText("00000000");
			viewConsumo.getFornecidaJFT().setText("00000");
			viewConsumo.getSobraJFT().setText("00000");
//			viewConsumo.pack();
		}
	}

	public void fluxoProblemaDigitacaoRacoes() {
		viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewConsumo.getDataJFT().setEnabled(true);
		viewConsumo.getDataJFT().grabFocus();
		viewConsumo.getFornecidaJFT().setEnabled(false);
		viewConsumo.getSobraJFT().setEnabled(false);
	}

	public void recuperaHistConsumo(boolean zeraControleFornecida, boolean zeraControleSobra, boolean zeraControlePeso,
			boolean zeraControleAnimais) {
		viewConsumo.getOrdemJFT().setText("" + consumosErros.get(0).getOrdem());
		TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
		viewConsumo.getDataJFT().setText("" + consumosErros.get(0).getDataRacao());
		TextFormatter.formatStringJFT(viewConsumo.getDataJFT(), viewConsumo.getDataJFT().getText(), 10);
		viewConsumo.getFornecidaJFT().setText("" + consumosErros.get(0).getFornecida());
		TextFormatter.formatStringJFT(viewConsumo.getFornecidaJFT(), viewConsumo.getFornecidaJFT().getText(), 5);
		viewConsumo.getSobraJFT().setText("" + consumosErros.get(0).getSobra());
		TextFormatter.formatStringJFT(viewConsumo.getSobraJFT(), viewConsumo.getSobraJFT().getText(), 5);
		if (usarColunaExtra) {
			viewConsumo.getPesoJFT().setText("" + consumosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewConsumo.getPesoJFT(), viewConsumo.getPesoJFT().getText(), 6);
			viewConsumo.getnAnimaisJFT().setText("" + consumosErros.get(0).getNumAnimais());
			TextFormatter.formatStringJFT(viewConsumo.getnAnimaisJFT(), viewConsumo.getnAnimaisJFT().getText(), 3);
		}
		consumosErros.remove(0);
		if (zeraControleFornecida && zeraControleSobra) {
			// ZERA OS DOIS CONTROLES
			viewConsumo.getDataJFT().setEnabled(true);
			viewConsumo.getDataJFT().grabFocus();
			viewConsumo.getControleFornecidaJFT().setEnabled(false);
			viewConsumo.getControleFornecidaJFT().setText("000000");
			viewConsumo.getControleSobraJFT().setEnabled(false);
			viewConsumo.getControleSobraJFT().setText("000000");
		} else if (zeraControleFornecida && !zeraControleSobra) {
			// ZERA O CONTROLE DA RACAO FORNECIDA
			viewConsumo.getDataJFT().setEnabled(true);
			viewConsumo.getDataJFT().grabFocus();
			viewConsumo.getControleFornecidaJFT().setEnabled(false);
			viewConsumo.getControleFornecidaJFT().setText("000000");
		} else if (!zeraControleFornecida && zeraControleSobra) {
			// ZERA O CONTROLE DA RACAO SOBRA
			viewConsumo.getDataJFT().setEnabled(true);
			viewConsumo.getDataJFT().grabFocus();
			viewConsumo.getControleSobraJFT().setEnabled(false);
			viewConsumo.getControleSobraJFT().setText("000000");
		} else {
			// NAO ZERA nada
			viewConsumo.getDataJFT().setEnabled(true);
			viewConsumo.getDataJFT().grabFocus();
		}

	}

	private Integer calculaControleRacaoFornecida() {
		int soma = 0;
		for (RmeVOSC consumo : consumos) {
			soma += consumo.getFornecida();
		}
		return soma;
	}

	public void fluxoErroControleFornecida() {
		viewConsumo.getDataJFT().setText("");
		viewConsumo.getFornecidaJFT().setText("");
		viewConsumo.getSobraJFT().setText("");
		viewConsumo.getControleFornecidaJFT().setText("");
		viewConsumo.getOrdemHist5Label().setText("");
		viewConsumo.getOrdemHist4Label().setText("");
		viewConsumo.getOrdemHist3Label().setText("");
		viewConsumo.getOrdemHist2Label().setText("");
		viewConsumo.getOrdemHist1Label().setText("");
		viewConsumo.getData5HistLabel().setText("");
		viewConsumo.getData4HistLabel().setText("");
		viewConsumo.getData3HistLabel().setText("");
		viewConsumo.getData2HistLabel().setText("");
		viewConsumo.getData1HistLabel().setText("");
		viewConsumo.getFornecidaHist5Label().setText("");
		viewConsumo.getFornecidaHist1Label().setText("");
		viewConsumo.getFornecidaHist2Label().setText("");
		viewConsumo.getFornecidaHist3Label().setText("");
		viewConsumo.getFornecidaHist4Label().setText("");
		viewConsumo.getSobraHist5Label().setText("");
		viewConsumo.getSobraHist1Label().setText("");
		viewConsumo.getSobraHist2Label().setText("");
		viewConsumo.getSobraHist3Label().setText("");
		viewConsumo.getSobraHist4Label().setText("");
	}

	private void fluxoProblemaCabecalho() {
		viewConsumo.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewConsumo.getBaiaJFT().setEnabled(true);
		viewConsumo.getBaiaJFT().grabFocus();
		viewConsumo.getSexoJFT().setEnabled(false);
		viewConsumo.getTrataJFT().setEnabled(false);
		viewConsumo.getTrata2JFT().setEnabled(false);
		viewConsumo.getControleBaiaJFT().setEnabled(false);
	}

	private void fluxoOkCabecalho() {
		viewConsumo.getBaiaJP().setBorder(defaultBorder);
		viewConsumo.getBaiaJFT().setEnabled(false);
		viewConsumo.getSexoJFT().setEnabled(false);
		viewConsumo.getTrataJFT().setEnabled(false);
		viewConsumo.getTrata2JFT().setEnabled(false);
		viewConsumo.getControleBaiaJFT().setEnabled(false);
		viewConsumo.getChkUsarColunaExtra().setEnabled(false);
		viewConsumo.getDataJFT().setEnabled(true);
		viewConsumo.getDataJFT().grabFocus();
	}

	private void criarOrdemComponentesHist() {
		if (usarColunaExtra) {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(viewConsumo.getnAnimaisHist5Label());
			orderLoadHist.add(viewConsumo.getPesoHist5Label());
			orderLoadHist.add(viewConsumo.getSobraHist5Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist5Label());
			orderLoadHist.add(viewConsumo.getData5HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist5Label());
			orderLoadHist.add(viewConsumo.getnAnimaisHist4Label());
			orderLoadHist.add(viewConsumo.getPesoHist4Label());
			orderLoadHist.add(viewConsumo.getSobraHist4Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist4Label());
			orderLoadHist.add(viewConsumo.getData4HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist4Label());
			orderLoadHist.add(viewConsumo.getnAnimaisHist3Label());
			orderLoadHist.add(viewConsumo.getPesoHist3Label());
			orderLoadHist.add(viewConsumo.getSobraHist3Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist3Label());
			orderLoadHist.add(viewConsumo.getData3HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist3Label());
			orderLoadHist.add(viewConsumo.getnAnimaisHist2Label());
			orderLoadHist.add(viewConsumo.getPesoHist2Label());
			orderLoadHist.add(viewConsumo.getSobraHist2Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist2Label());
			orderLoadHist.add(viewConsumo.getData2HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist2Label());
			orderLoadHist.add(viewConsumo.getnAnimaisHist1Label());
			orderLoadHist.add(viewConsumo.getPesoHist1Label());
			orderLoadHist.add(viewConsumo.getSobraHist1Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist1Label());
			orderLoadHist.add(viewConsumo.getData1HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist1Label());
		} else {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(viewConsumo.getSobraHist5Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist5Label());
			orderLoadHist.add(viewConsumo.getData5HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist5Label());
			orderLoadHist.add(viewConsumo.getSobraHist4Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist4Label());
			orderLoadHist.add(viewConsumo.getData4HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist4Label());
			orderLoadHist.add(viewConsumo.getSobraHist3Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist3Label());
			orderLoadHist.add(viewConsumo.getData3HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist3Label());
			orderLoadHist.add(viewConsumo.getSobraHist2Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist2Label());
			orderLoadHist.add(viewConsumo.getData2HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist2Label());
			orderLoadHist.add(viewConsumo.getSobraHist1Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist1Label());
			orderLoadHist.add(viewConsumo.getData1HistLabel());
			orderLoadHist.add(viewConsumo.getOrdemHist1Label());
		}

	}

	private void criarOrdemComponentes() {
		if (usarColunaExtra) {
			order = new ArrayList<>();
			order.add(viewConsumo.getGalpaoJFT());
			order.add(viewConsumo.getBaiaJFT());
			order.add(viewConsumo.getSexoJFT());
			order.add(viewConsumo.getTrataJFT());
			order.add(viewConsumo.getTrata2JFT());
			order.add(viewConsumo.getControleBaiaJFT());
			order.add(viewConsumo.getChkUsarColunaExtra());
			order.add(viewConsumo.getDataJFT());
			order.add(viewConsumo.getFornecidaJFT());
			order.add(viewConsumo.getSobraJFT());
			order.add(viewConsumo.getPesoJFT());
			order.add(viewConsumo.getnAnimaisJFT());
			order.add(viewConsumo.getControleFornecidaJFT());
			order.add(viewConsumo.getControleSobraJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			viewConsumo.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		} else {
			order = new ArrayList<>();
			order.add(viewConsumo.getGalpaoJFT());
			order.add(viewConsumo.getBaiaJFT());
			order.add(viewConsumo.getSexoJFT());
			order.add(viewConsumo.getTrataJFT());
			order.add(viewConsumo.getTrata2JFT());
			order.add(viewConsumo.getControleBaiaJFT());
			order.add(viewConsumo.getChkUsarColunaExtra());
			order.add(viewConsumo.getDataJFT());
			order.add(viewConsumo.getFornecidaJFT());
			order.add(viewConsumo.getSobraJFT());
			order.add(viewConsumo.getControleFornecidaJFT());
			order.add(viewConsumo.getControleSobraJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			viewConsumo.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		}
	}

}
