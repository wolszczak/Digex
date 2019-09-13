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

public class ControllerConsumoSC extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerSC controller;
	private ViewConsumoSC view;
	private ConsumoBOSC consumoBO;
	private List<RmeVOSC> consumos, consumosErros;
	private int ordem, controleBaia;
	private boolean usarColunaExtra;
	private List<String> datasFases;
	private List<Component> order, orderLoadHist;
	private Border defaultBorder;

	public ControllerConsumoSC(ControllerSC c) {
		this.controller = c;
		this.consumoBO = new ConsumoBOSC(controller);
	}

	public void openWindow(List<String> datasFases) {
		view = new ViewConsumoSC();
		view.setTitle("DIGEX - Consumo Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		this.datasFases = datasFases;
		consumos = new ArrayList<>();
		consumosErros = new ArrayList<>();
		usarColunaExtra = false;
		view.getRegistrosLabel().setVisible(false);
		defaultBorder = view.getConsumoJP().getBorder();
		ordem = 1;
		view.getChkUsarColunaExtra().addItemListener(this);
		view.getChkUsarColunaExtra().addKeyListener(this);
		view.getOpcaoJFT().addKeyListener(this);

		if (controller.getModel().getExperimentoVO().getConsumo() != null
				&& controller.getModel().getExperimentoVO().getConsumo().size() > 0) {
			usarColunaExtra = controller.getModel().getExperimentoVO().getConsumo()
					.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isColunaExtra();
			if (controller.getModel().getExperimentoVO().getConsumo().get(controller.getModel().getExperimentoVO().getConsumo().size() - 1)
					.getRme().size() > 0
					&& !controller.getModel().getExperimentoVO().getConsumo()
							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isFinalizado()) {
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
			view.getPesoHist1Label().setText("--");
			view.getPesoHist2Label().setText("--");
			view.getPesoHist3Label().setText("--");
			view.getPesoHist4Label().setText("--");
			view.getPesoHist5Label().setText("--");
			view.getnAnimaisHist1Label().setText("--");
			view.getnAnimaisHist2Label().setText("--");
			view.getnAnimaisHist3Label().setText("--");
			view.getnAnimaisHist4Label().setText("--");
			view.getnAnimaisHist5Label().setText("--");
			view.getPesoJFT().setText("--");
			view.getnAnimaisJFT().setText("--");
			view.getControlePesoJFT().setText("--");
			view.getControleAnimaisJFT().setText("--");
			view.getFornecidaJFT().setText("00000");
			view.getSobraJFT().setText("00000");
			view.getPesoJFT().setText("00");
			TextFormatter.formatEmptySpace(view.getPesoJFT(), view.getPesoJFT().getText());
			view.getnAnimaisJFT().setText("00");
			view.getControleFornecidaJFT().setText("000000");
			view.getControleSobraJFT().setText("000000");
			view.getControlePesoJFT().setText("00");
			TextFormatter.formatEmptySpace(view.getControlePesoJFT(), view.getControlePesoJFT().getText());
			view.getControleAnimaisJFT().setText("00");
			TextFormatter.formatEmptySpace(view.getControleAnimaisJFT(), view.getControleAnimaisJFT().getText());

		} else {
			view.getFornecidaJFT().setText("00000");
			view.getSobraJFT().setText("00000");
			view.getPesoJFT().setText("000000");
			view.getnAnimaisJFT().setText("000");
			view.getControleFornecidaJFT().setText("000000");
			view.getControleSobraJFT().setText("000000");
			view.getControlePesoJFT().setText("000000");
			view.getControleAnimaisJFT().setText("000000");
		}

		view.getOrdemJFT().setText(String.valueOf(ordem).trim());
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
		view.pack();
	}

	private void loadHist() {
		view.getGalpaoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getInfoExp().getGalpao()).trim());
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
				view.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()).trim());
				view.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()).trim());
				view.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()).trim());
				view.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()).trim());
				if (consumoHist.isColunaExtra()) {
					view.getChkUsarColunaExtra().setSelected(true);
				} else {
					view.getChkUsarColunaExtra().setSelected(false);
				}
				view.getBaiaJFT().setEnabled(false);
				view.getControleBaiaLabel().setVisible(false);
				view.getControleBaiaJFT().setVisible(false);
				view.getChkUsarColunaExtra().setEnabled(false);
				view.getDataJFT().setEnabled(true);
				view.getDataJFT().grabFocus();
			} else {
				view.getBaiaJFT().setEnabled(true);
				view.getBaiaJFT().grabFocus();
			}
		} else {
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
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == view.getChkUsarColunaExtra()) {
			usarColunaExtra = true;
			if (view.getPesoHist5Label().getText().trim().equals("--") || view.getnAnimaisHist5Label().getText().trim().equals("--")) {
				view.getPesoHist1Label().setText("");
				view.getPesoHist2Label().setText("");
				view.getPesoHist3Label().setText("");
				view.getPesoHist4Label().setText("");
				view.getPesoHist5Label().setText("");
				view.getnAnimaisHist1Label().setText("");
				view.getnAnimaisHist2Label().setText("");
				view.getnAnimaisHist3Label().setText("");
				view.getnAnimaisHist4Label().setText("");
				view.getnAnimaisHist5Label().setText("");
				view.getPesoJFT().setText("000000");
				view.getnAnimaisJFT().setText("00");
			}
		} else {
			usarColunaExtra = false;
			view.getPesoJFT().setEnabled(false);
			view.getnAnimaisJFT().setEnabled(false);
			view.getPesoHist1Label().setText("--");
			view.getPesoHist2Label().setText("--");
			view.getPesoHist3Label().setText("--");
			view.getPesoHist4Label().setText("--");
			view.getPesoHist5Label().setText("--");
			view.getnAnimaisHist1Label().setText("--");
			view.getnAnimaisHist2Label().setText("--");
			view.getnAnimaisHist3Label().setText("--");
			view.getnAnimaisHist4Label().setText("--");
			view.getnAnimaisHist5Label().setText("--");
			view.getPesoJFT().setText("00");
			view.getnAnimaisJFT().setText("00");

		}
	}

	@Override
	public void focusLost(FocusEvent e) {
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
				view.setVisible(false);
				controller.startMortalidadeSC(Integer.parseInt(view.getGalpaoJFT().getText().trim()),
						Integer.parseInt(view.getBaiaJFT().getText().trim()), Integer.parseInt(view.getSexoJFT().getText().trim()),
						Integer.parseInt(view.getTrataJFT().getText().trim()), Integer.parseInt(view.getTrata2JFT().getText().trim()),
						datasFases);
				break;
			case KeyEvent.VK_2:
				view.setVisible(false);
				ControllerMedicadosSC medicados = new ControllerMedicadosSC(controller);
				medicados.openWindow(Integer.parseInt(view.getGalpaoJFT().getText()), Integer.parseInt(view.getBaiaJFT().getText()),
						Integer.parseInt(view.getSexoJFT().getText()), Integer.parseInt(view.getTrataJFT().getText()),
						Integer.parseInt(view.getTrata2JFT().getText()), datasFases);
				break;
			case KeyEvent.VK_3:
				view.setVisible(false);
				openWindow(datasFases);
				break;
			case KeyEvent.VK_4:
				view.setVisible(false);
				ControllerEscolhaDigSC escolhaDigSC = new ControllerEscolhaDigSC(controller);
				escolhaDigSC.openWindow(datasFases);
				break;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getOpcaoJFT()) && !e.getSource().equals(view.getDataJFT())
				&& !e.getSource().equals(view.getControleFornecidaJFT()) && !e.getSource().equals(view.getControleSobraJFT())
				&& !e.getSource().equals(view.getControlePesoJFT()) && !e.getSource().equals(view.getControleAnimaisJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigSC ce = new ControllerEscolhaDigSC(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
			JFormattedTextField jft = null;
			String text = "";
			if (e.getSource() == view.getChkUsarColunaExtra()) {
				if (view.getBaiaJFT().getText().matches("^[0-9]{3}") && view.getSexoJFT().getText().matches("^[0-9]{1}")
						&& view.getTrataJFT().getText().matches("^[0-9]{1}") && view.getTrata2JFT().getText().matches("^[0-9]{1,2}")
						&& view.getControleBaiaJFT().getText().matches("^[0-9]{4}")) {
					if (consumoBO.isBaiaDigitada(Integer.parseInt(view.getBaiaJFT().getText()))) {
						int option = JOptionPane.showConfirmDialog(view, "Baia já digitada.\nDeseja digitar novamente?", "DIGEX - Aviso",
								JOptionPane.WARNING_MESSAGE);
						if (option == 0) {
							consumoBO.excluirBaia(Integer.parseInt(view.getBaiaJFT().getText()));
							System.out.println("Baia antiga foi excluida");
							controller.getModel().getExperimentoVO().getConsumo()
									.add(new ConsumoVOSC(Integer.parseInt(view.getGalpaoJFT().getText()),
											Integer.parseInt(view.getBaiaJFT().getText()), Integer.parseInt(view.getSexoJFT().getText()),
											Integer.parseInt(view.getTrataJFT().getText()), Integer.parseInt(view.getTrata2JFT().getText()),
											usarColunaExtra, false, new ArrayList<>()));
							controller.getModel().getModelStateDAO().saveModelState(false);
							System.out.println("Adicionada nova Baia");
							view.getOrdemJFT().setText("1");
							TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
							fluxoOkCabecalho();
						} else {
							fluxoProblemaCabecalho();
						}
					} else {
						controller.getModel().getExperimentoVO().getConsumo()
								.add(new ConsumoVOSC(Integer.parseInt(view.getGalpaoJFT().getText()),
										Integer.parseInt(view.getBaiaJFT().getText()), Integer.parseInt(view.getSexoJFT().getText()),
										Integer.parseInt(view.getTrataJFT().getText()), Integer.parseInt(view.getTrata2JFT().getText()),
										usarColunaExtra, false, new ArrayList<>()));
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getOrdemJFT().setText("1");
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
						fluxoOkCabecalho();
					}
				} else {
					view.getBaiaJFT().setEnabled(true);
					view.getBaiaJFT().grabFocus();
				}

//				criarOrdemComponentes();
			} else {
				jft = (JFormattedTextField) e.getSource();
				text = jft.getText();

				if ((JFormattedTextField) e.getSource() == view.getBaiaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 3);
					view.getRegistrosLabel().setVisible(false);
					view.getBaiaJFT().setEnabled(false);
					view.getSexoJFT().setEnabled(true);
					view.getSexoJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getSexoJFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					view.getSexoJFT().setEnabled(false);
					view.getTrataJFT().setEnabled(true);
					view.getTrataJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getTrataJFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					view.getTrataJFT().setEnabled(false);
					view.getTrata2JFT().setEnabled(true);
					view.getTrata2JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getTrata2JFT()) {
					TextFormatter.formatStringJFT(jft, text, 1);
					view.getTrata2JFT().setEnabled(false);
					view.getControleBaiaJFT().setEnabled(true);
					view.getControleBaiaJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getControleBaiaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 4);
					controleBaia = Integer.parseInt(view.getControleBaiaJFT().getText());
					int somaControle = Integer.parseInt(view.getBaiaJFT().getText()) + Integer.parseInt(view.getSexoJFT().getText())
							+ Integer.parseInt(view.getTrataJFT().getText()) + Integer.parseInt(view.getTrata2JFT().getText());
					if (controleBaia != somaControle) {
						fluxoProblemaCabecalho();
					} else {
						String msg = consumoBO.verificaCabecalho(Integer.parseInt(view.getBaiaJFT().getText()),
								Integer.parseInt(view.getSexoJFT().getText()), Integer.parseInt(view.getTrataJFT().getText()),
								Integer.parseInt(view.getTrata2JFT().getText()));
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaCabecalho();
						} else {
							view.getControleBaiaJFT().setEnabled(false);
							view.getChkUsarColunaExtra().grabFocus();
						}
					}
				} else if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
					TextFormatter.formatStringJFT(jft, text, 8);
					String msg = consumoBO.verificaData(view.getData().getText(), datasFases);
					if (msg != null) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					} else {
						view.getDataJFT().setEnabled(false);
						view.getFornecidaJFT().setEnabled(true);
						view.getFornecidaJFT().requestFocus();
					}
				} else if ((JFormattedTextField) e.getSource() == view.getFornecidaJFT()) {
					TextFormatter.formatStringJFT(jft, text, 5);
					view.getFornecidaJFT().setEnabled(false);
					view.getSobraJFT().setEnabled(true);
					view.getSobraJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getSobraJFT()) {
					TextFormatter.formatStringJFT(jft, text, 5);
					if (view.getDataJFT().getText().equals("00/00/00") && view.getFornecidaJFT().getText().equals("00000")
							&& view.getSobraJFT().getText().equals("00000")) {
						TextFormatter.formatStringJFT(jft, text, 5);
						view.getSobraJFT().setEnabled(false);
						view.getControleFornecidaJFT().setEnabled(true);
						view.getControleFornecidaJFT().requestFocus();
					} else {
						String msg = consumoBO.verificaRacao(view.getDataJFT().getText(),
								Integer.parseInt(view.getFornecidaJFT().getText()), Integer.parseInt(view.getSobraJFT().getText()),
								Integer.parseInt(view.getPesoJFT().getText().trim()),
								Integer.parseInt(view.getnAnimaisJFT().getText().trim()), datasFases);
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaDigitacaoRacoes();
						} else {
							if (usarColunaExtra) {
								TextFormatter.formatStringJFT(jft, text, 5);
								view.getSobraJFT().setEnabled(false);
								view.getPesoJFT().setEnabled(true);
								view.getPesoJFT().grabFocus();
							} else {
								TextFormatter.formatStringJFT(jft, text, 5);
								view.getSobraJFT().setEnabled(false);
								view.getDataJFT().setEnabled(true);
								view.getDataJFT().grabFocus();
								controller.getModel().getExperimentoVO().getConsumo()
										.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
										.add(new RmeVOSC(Integer.parseInt(view.getOrdemJFT().getText().trim()),
												view.getDataJFT().getText().trim(),
												Integer.parseInt(view.getFornecidaJFT().getText().trim()),
												Integer.parseInt(view.getSobraJFT().getText().trim()), 0, 0));
								updateHistRME();
								ordem++;
								view.getOrdemJFT().setText(String.valueOf(ordem));
								TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
								view.getConsumoJP().setBorder(defaultBorder);
							}
						}
					}

				} else if ((JFormattedTextField) e.getSource() == view.getPesoJFT()) {
					TextFormatter.formatStringJFT(jft, text, 6);
					view.getPesoJFT().setEnabled(false);
					view.getnAnimaisJFT().setEnabled(true);
					view.getnAnimaisJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getnAnimaisJFT()) {
					TextFormatter.formatStringJFT(jft, text, 2);
					String msg = consumoBO.verificaRacao(view.getDataJFT().getText().trim(),
							Integer.parseInt(view.getFornecidaJFT().getText().trim()),
							Integer.parseInt(view.getSobraJFT().getText().trim()), Integer.parseInt(view.getPesoJFT().getText().trim()),
							Integer.parseInt(view.getnAnimaisJFT().getText().trim()), datasFases);
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaDigitacaoRacoes();
					} else if (view.getData().getText().equals("00/00/0000")
							&& Integer.parseInt(view.getFornecidaJFT().getText().trim()) == 0
							&& Integer.parseInt(view.getSobraJFT().getText().trim()) == 0
							&& Integer.parseInt(view.getPesoJFT().getText().trim()) == 0
							&& Integer.parseInt(view.getnAnimaisJFT().getText().trim()) == 0) {
						if (controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size() > 0) {
							view.getnAnimaisJFT().setEnabled(false);
							view.getControleFornecidaJFT().setEnabled(true);
							view.getControleFornecidaJFT().grabFocus();
						} else {
							// Mensagem de erro
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaDigitacaoRacoes();
						}
					} else {
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
								.add(new RmeVOSC(Integer.parseInt(view.getOrdemJFT().getText()), view.getData().getText(),
										Integer.parseInt(view.getFornecidaJFT().getText().trim()),
										Integer.parseInt(view.getSobraJFT().getText().trim()),
										Integer.parseInt(view.getPesoJFT().getText().trim()),
										Integer.parseInt(view.getnAnimaisJFT().getText().trim())));
						controller.getModel().getModelStateDAO().saveModelState(false);
						updateHistRME();
						view.getOrdemJFT().setText(String.valueOf(++ordem));
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == view.getControleFornecidaJFT()) {
					if (Integer.parseInt(view.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						view.getConsumoJP().setBorder(defaultBorder);
						view.getControleFornecidaJFT().setEnabled(false);
						view.getControleSobraJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						view.getControleSobraJFT().grabFocus();
					} else {
						view.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControleFornecidaJFT().setText("000000");
						view.getControleFornecidaJFT().setEnabled(false);
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == view.getControleSobraJFT()) {
					if (Integer.parseInt(view.getControleSobraJFT().getText().trim()) == calculaControleSobra()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						view.getConsumoJP().setBorder(defaultBorder);
						if (usarColunaExtra) {
							view.getControleSobraJFT().setEnabled(false);
							view.getControlePesoJFT().setEnabled(true);
							((JFormattedTextField) e.getSource()).transferFocus();
							view.getControlePesoJFT().grabFocus();
						} else {
							controller.getModel().getExperimentoVO().getConsumo()
									.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setFinalizado(true);
							controller.getModel().getModelStateDAO().saveModelState(false);
							view.getControleSobraJFT().setEnabled(false);
							view.getOpcaoJFT().setEnabled(true);
							((JFormattedTextField) e.getSource()).transferFocus();
							view.getOpcaoJFT().grabFocus();
						}
					} else {
						view.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControleSobraJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == view.getControlePesoJFT()) {
					if (Integer.parseInt(view.getControlePesoJFT().getText().trim()) == calculaControlePeso()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						view.getConsumoJP().setBorder(defaultBorder);
						view.getControlePesoJFT().setEnabled(false);
						view.getControleAnimaisJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						view.getControleAnimaisJFT().grabFocus();
					} else {
						view.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControlePesoJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == view.getControleAnimaisJFT()) {
					if (Integer.parseInt(view.getControleAnimaisJFT().getText().trim()) == calculaControleAnimais()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setFinalizado(true);
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getConsumoJP().setBorder(defaultBorder);
						view.getControleAnimaisJFT().setEnabled(false);
						view.getOpcaoJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						view.getOpcaoJFT().grabFocus();
					} else {
						view.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControleAnimaisJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				}

			}
		}

	}

	public void updateHistRME() {
		view.getOrdemHist1Label().setText(view.getOrdemHist2Label().getText());
		view.getOrdemHist2Label().setText(view.getOrdemHist3Label().getText());
		view.getOrdemHist3Label().setText(view.getOrdemHist4Label().getText());
		view.getOrdemHist4Label().setText(view.getOrdemHist5Label().getText());
		view.getOrdemHist5Label().setText(view.getOrdemJFT().getText());
		view.getData1HistLabel().setText(view.getData2HistLabel().getText());
		view.getData2HistLabel().setText(view.getData3HistLabel().getText());
		view.getData3HistLabel().setText(view.getData4HistLabel().getText());
		view.getData4HistLabel().setText(view.getData5HistLabel().getText());
		view.getData5HistLabel().setText(view.getDataJFT().getText());
		view.getFornecidaHist1Label().setText(view.getFornecidaHist2Label().getText());
		view.getFornecidaHist2Label().setText(view.getFornecidaHist3Label().getText());
		view.getFornecidaHist3Label().setText(view.getFornecidaHist4Label().getText());
		view.getFornecidaHist4Label().setText(view.getFornecidaHist5Label().getText());
		view.getFornecidaHist5Label().setText(view.getFornecidaJFT().getText());
		view.getSobraHist1Label().setText(view.getSobraHist2Label().getText());
		view.getSobraHist2Label().setText(view.getSobraHist3Label().getText());
		view.getSobraHist3Label().setText(view.getSobraHist4Label().getText());
		view.getSobraHist4Label().setText(view.getSobraHist5Label().getText());
		view.getSobraHist5Label().setText(view.getSobraJFT().getText());
		if (usarColunaExtra) {
			view.getPesoHist1Label().setText(view.getPesoHist2Label().getText());
			view.getPesoHist2Label().setText(view.getPesoHist3Label().getText());
			view.getPesoHist3Label().setText(view.getPesoHist4Label().getText());
			view.getPesoHist4Label().setText(view.getPesoHist5Label().getText());
			view.getPesoHist5Label().setText(view.getPesoJFT().getText());
			view.getnAnimaisHist1Label().setText(view.getnAnimaisHist2Label().getText());
			view.getnAnimaisHist2Label().setText(view.getnAnimaisHist3Label().getText());
			view.getnAnimaisHist3Label().setText(view.getnAnimaisHist4Label().getText());
			view.getnAnimaisHist4Label().setText(view.getnAnimaisHist5Label().getText());
			view.getnAnimaisHist5Label().setText(view.getnAnimaisJFT().getText());
			view.getPesoJFT().setText("00000");
			view.getnAnimaisJFT().setText("00000");
		}
		if (!consumosErros.isEmpty()) {
			recuperaHistConsumo();
		} else {
			view.getDataJFT().setText("00000000");
			view.getFornecidaJFT().setText("00000");
			view.getSobraJFT().setText("00000");
			view.getSobraJFT().setEnabled(false);
			view.getDataJFT().setEnabled(true);
			view.getSobraJFT().transferFocus();
			view.getDataJFT().grabFocus();
			view.pack();
		}
	}

	public void fluxoProblemaDigitacaoRacoes() {
		view.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
		view.getFornecidaJFT().setEnabled(false);
		view.getSobraJFT().setEnabled(false);
		view.getControleFornecidaJFT().setEnabled(false);
		view.getControleSobraJFT().setEnabled(false);
		if (usarColunaExtra) {
			view.getPesoJFT().setEnabled(false);
			view.getnAnimaisJFT().setEnabled(false);
			view.getControlePesoJFT().setEnabled(false);
			view.getControleAnimaisJFT().setEnabled(false);
		}
	}

	public void recuperaHistConsumo() {
		view.getOrdemJFT().setText("" + consumosErros.get(0).getOrdem());
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
		view.getDataJFT().setText("" + consumosErros.get(0).getDataRacao());
		TextFormatter.formatStringJFT(view.getDataJFT(), view.getDataJFT().getText(), 10);
		view.getFornecidaJFT().setText("" + consumosErros.get(0).getFornecida());
		TextFormatter.formatStringJFT(view.getFornecidaJFT(), view.getFornecidaJFT().getText(), 5);
		view.getSobraJFT().setText("" + consumosErros.get(0).getSobra());
		TextFormatter.formatStringJFT(view.getSobraJFT(), view.getSobraJFT().getText(), 5);
		if (usarColunaExtra) {
			view.getPesoJFT().setText("" + consumosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(view.getPesoJFT(), view.getPesoJFT().getText(), 6);
			view.getnAnimaisJFT().setText("" + consumosErros.get(0).getNumAnimais());
			TextFormatter.formatStringJFT(view.getnAnimaisJFT(), view.getnAnimaisJFT().getText(), 3);
		}
		consumosErros.remove(0);
		view.getSobraJFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private Integer calculaControleRacaoFornecida() {
		int soma = 0;
		for (RmeVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()
				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()) {
			soma += consumo.getFornecida();
		}
		return soma;
	}

	private Integer calculaControleSobra() {
		int soma = 0;
		for (RmeVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()
				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()) {
			soma += consumo.getSobra();
		}
		return soma;
	}

	private Integer calculaControlePeso() {
		int soma = 0;
		for (RmeVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()
				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()) {
			soma += consumo.getFornecida();
		}
		return soma;
	}

	private Integer calculaControleAnimais() {
		int soma = 0;
		for (RmeVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()
				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()) {
			soma += consumo.getNumAnimais();
		}
		return soma;
	}

	public void fluxoErroControle() {
		view.getDataJFT().setText("00/00/0000");
		view.getFornecidaJFT().setText("00000");
		view.getSobraJFT().setText("00000");
		if (usarColunaExtra) {
			view.getPesoJFT().setText("000000");
			view.getnAnimaisJFT().setText("00");
		}
		view.getOrdemHist5Label().setText("");
		view.getOrdemHist4Label().setText("");
		view.getOrdemHist3Label().setText("");
		view.getOrdemHist2Label().setText("");
		view.getOrdemHist1Label().setText("");
		view.getData5HistLabel().setText("");
		view.getData4HistLabel().setText("");
		view.getData3HistLabel().setText("");
		view.getData2HistLabel().setText("");
		view.getData1HistLabel().setText("");
		view.getFornecidaHist5Label().setText("");
		view.getFornecidaHist1Label().setText("");
		view.getFornecidaHist2Label().setText("");
		view.getFornecidaHist3Label().setText("");
		view.getFornecidaHist4Label().setText("");
		view.getSobraHist5Label().setText("");
		view.getSobraHist1Label().setText("");
		view.getSobraHist2Label().setText("");
		view.getSobraHist3Label().setText("");
		view.getSobraHist4Label().setText("");
	}

	private void fluxoProblemaCabecalho() {
		view.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		view.getBaiaJFT().setEnabled(true);
		view.getBaiaJFT().grabFocus();
		view.getSexoJFT().setEnabled(false);
		view.getTrataJFT().setEnabled(false);
		view.getTrata2JFT().setEnabled(false);
		view.getControleBaiaJFT().setEnabled(false);
	}

	private void fluxoOkCabecalho() {
		view.getBaiaJP().setBorder(defaultBorder);
		view.getBaiaJFT().setEnabled(false);
		view.getSexoJFT().setEnabled(false);
		view.getTrataJFT().setEnabled(false);
		view.getTrata2JFT().setEnabled(false);
		view.getControleBaiaJFT().setEnabled(false);
		view.getChkUsarColunaExtra().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private void criarOrdemComponentesHist() {
		if (usarColunaExtra) {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(view.getnAnimaisHist5Label());
			orderLoadHist.add(view.getPesoHist5Label());
			orderLoadHist.add(view.getSobraHist5Label());
			orderLoadHist.add(view.getFornecidaHist5Label());
			orderLoadHist.add(view.getData5HistLabel());
			orderLoadHist.add(view.getOrdemHist5Label());
			orderLoadHist.add(view.getnAnimaisHist4Label());
			orderLoadHist.add(view.getPesoHist4Label());
			orderLoadHist.add(view.getSobraHist4Label());
			orderLoadHist.add(view.getFornecidaHist4Label());
			orderLoadHist.add(view.getData4HistLabel());
			orderLoadHist.add(view.getOrdemHist4Label());
			orderLoadHist.add(view.getnAnimaisHist3Label());
			orderLoadHist.add(view.getPesoHist3Label());
			orderLoadHist.add(view.getSobraHist3Label());
			orderLoadHist.add(view.getFornecidaHist3Label());
			orderLoadHist.add(view.getData3HistLabel());
			orderLoadHist.add(view.getOrdemHist3Label());
			orderLoadHist.add(view.getnAnimaisHist2Label());
			orderLoadHist.add(view.getPesoHist2Label());
			orderLoadHist.add(view.getSobraHist2Label());
			orderLoadHist.add(view.getFornecidaHist2Label());
			orderLoadHist.add(view.getData2HistLabel());
			orderLoadHist.add(view.getOrdemHist2Label());
			orderLoadHist.add(view.getnAnimaisHist1Label());
			orderLoadHist.add(view.getPesoHist1Label());
			orderLoadHist.add(view.getSobraHist1Label());
			orderLoadHist.add(view.getFornecidaHist1Label());
			orderLoadHist.add(view.getData1HistLabel());
			orderLoadHist.add(view.getOrdemHist1Label());
		} else {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(view.getSobraHist5Label());
			orderLoadHist.add(view.getFornecidaHist5Label());
			orderLoadHist.add(view.getData5HistLabel());
			orderLoadHist.add(view.getOrdemHist5Label());
			orderLoadHist.add(view.getSobraHist4Label());
			orderLoadHist.add(view.getFornecidaHist4Label());
			orderLoadHist.add(view.getData4HistLabel());
			orderLoadHist.add(view.getOrdemHist4Label());
			orderLoadHist.add(view.getSobraHist3Label());
			orderLoadHist.add(view.getFornecidaHist3Label());
			orderLoadHist.add(view.getData3HistLabel());
			orderLoadHist.add(view.getOrdemHist3Label());
			orderLoadHist.add(view.getSobraHist2Label());
			orderLoadHist.add(view.getFornecidaHist2Label());
			orderLoadHist.add(view.getData2HistLabel());
			orderLoadHist.add(view.getOrdemHist2Label());
			orderLoadHist.add(view.getSobraHist1Label());
			orderLoadHist.add(view.getFornecidaHist1Label());
			orderLoadHist.add(view.getData1HistLabel());
			orderLoadHist.add(view.getOrdemHist1Label());
		}

	}

	private void criarOrdemComponentes() {
		if (usarColunaExtra) {
			order = new ArrayList<>();
			order.add(view.getGalpaoJFT());
			order.add(view.getBaiaJFT());
			order.add(view.getSexoJFT());
			order.add(view.getTrataJFT());
			order.add(view.getTrata2JFT());
			order.add(view.getControleBaiaJFT());
//			order.add(viewConsumo.getChkUsarColunaExtra());
			order.add(view.getDataJFT());
			order.add(view.getFornecidaJFT());
			order.add(view.getSobraJFT());
			order.add(view.getPesoJFT());
			order.add(view.getnAnimaisJFT());
			order.add(view.getControleFornecidaJFT());
			order.add(view.getControleSobraJFT());
			order.add(view.getControlePesoJFT());
			order.add(view.getControleAnimaisJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			view.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		} else {
			order = new ArrayList<>();
			order.add(view.getGalpaoJFT());
			order.add(view.getBaiaJFT());
			order.add(view.getSexoJFT());
			order.add(view.getTrataJFT());
			order.add(view.getTrata2JFT());
			order.add(view.getControleBaiaJFT());
//			order.add(viewConsumo.getChkUsarColunaExtra());
			order.add(view.getDataJFT());
			order.add(view.getFornecidaJFT());
			order.add(view.getSobraJFT());
			order.add(view.getControleFornecidaJFT());
			order.add(view.getControleSobraJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			view.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		}
	}

}
