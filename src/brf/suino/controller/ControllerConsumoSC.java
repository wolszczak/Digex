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
		viewConsumo.setTitle("DIGEX - Suínos Creche");
		viewConsumo.setResizable(false);
		viewConsumo.setLocationRelativeTo(null);
		viewConsumo.setVisible(true);
		this.datasFase = datasFases;
		consumos = new ArrayList<>();
		consumosErros = new ArrayList<>();
		usarColunaExtra = false;
		viewConsumo.getRegistrosLabel().setVisible(false);
		defaultBorder = viewConsumo.getConsumoJP().getBorder();
		ordem = 1;
		viewConsumo.getChkUsarColunaExtra().addItemListener(this);
		viewConsumo.getChkUsarColunaExtra().addKeyListener(this);
		viewConsumo.getOpcaoJFT().addKeyListener(this);

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
			TextFormatter.formatEmptySpace(viewConsumo.getPesoJFT(), viewConsumo.getPesoJFT().getText());
			viewConsumo.getnAnimaisJFT().setText("00");
			viewConsumo.getControleFornecidaJFT().setText("000000");
			viewConsumo.getControleSobraJFT().setText("000000");
			viewConsumo.getControlePesoJFT().setText("00");
			TextFormatter.formatEmptySpace(viewConsumo.getControlePesoJFT(), viewConsumo.getControlePesoJFT().getText());
			viewConsumo.getControleAnimaisJFT().setText("00");
			TextFormatter.formatEmptySpace(viewConsumo.getControleAnimaisJFT(), viewConsumo.getControleAnimaisJFT().getText());

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
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == viewConsumo.getChkUsarColunaExtra()) {
			usarColunaExtra = true;
			if (viewConsumo.getPesoHist5Label().getText().trim().equals("--")
					|| viewConsumo.getnAnimaisHist5Label().getText().trim().equals("--")) {
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
			}
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
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewConsumo.getOpcaoJFT())
				&& !e.getSource().equals(viewConsumo.getDataJFT()) && !e.getSource().equals(viewConsumo.getControleFornecidaJFT())
				&& !e.getSource().equals(viewConsumo.getControleSobraJFT()) && !e.getSource().equals(viewConsumo.getControlePesoJFT())
				&& !e.getSource().equals(viewConsumo.getControleAnimaisJFT())) {
			System.out.println("left");
			Component prev = viewConsumo.getFocusTraversalPolicy().getComponentBefore(viewConsumo, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if ((JFormattedTextField) e.getSource() == viewConsumo.getOpcaoJFT()) {
			switch (e.getKeyChar()) {
			case KeyEvent.VK_0:
				int n = JOptionPane.showConfirmDialog(viewConsumo, "Deseja realmente sair do programa?", "DIGEX - Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (n == 0) {
					System.out.println("Fim...");
					System.exit(0);
				}
				break;
			case KeyEvent.VK_1:
				viewConsumo.setVisible(false);
				controller.startMortalidadeSC(Integer.parseInt(viewConsumo.getGalpaoJFT().getText()),
						Integer.parseInt(viewConsumo.getBaiaJFT().getText()), Integer.parseInt(viewConsumo.getSexoJFT().getText()),
						Integer.parseInt(viewConsumo.getTrataJFT().getText()), Integer.parseInt(viewConsumo.getTrata2JFT().getText()));
				break;
			case KeyEvent.VK_2:
//				medicados
				break;
			case KeyEvent.VK_3:
				viewConsumo.setVisible(false);
				openWindow(datasFase);
				break;
			case KeyEvent.VK_4:
				viewConsumo.setVisible(false);
				ControllerEscolhaDigSC escolhaDigSC = new ControllerEscolhaDigSC(controller);
				escolhaDigSC.openWindow(datasFase);
				break;
			}
		}
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
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
			JFormattedTextField jft = null;
			JCheckBox chk = null;
			String text = "";
			if (e.getSource() == viewConsumo.getChkUsarColunaExtra()) {
				if (viewConsumo.getBaiaJFT().getText().matches("^[0-9]{3}") && viewConsumo.getSexoJFT().getText().matches("^[0-9]{1}")
						&& viewConsumo.getTrataJFT().getText().matches("^[0-9]{1}")
						&& viewConsumo.getTrata2JFT().getText().matches("^[0-9]{1,2}")
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
										Integer.parseInt(viewConsumo.getTrata2JFT().getText()), usarColunaExtra, false, new ArrayList<>()));
						controller.getModel().getModelStateDAO().saveModelState(false);
						viewConsumo.getOrdemJFT().setText("1");
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
						fluxoOkCabecalho();
					}
				} else {
					viewConsumo.getBaiaJFT().setEnabled(true);
					viewConsumo.getBaiaJFT().grabFocus();
				}

//				criarOrdemComponentes();
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
							Integer.parseInt(viewConsumo.getSobraJFT().getText()),
							Integer.parseInt(viewConsumo.getPesoJFT().getText().trim()),
							Integer.parseInt(viewConsumo.getnAnimaisJFT().getText().trim()), datasFase);
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaDigitacaoRacoes();
					} else if (viewConsumo.getData().getText().equals("00/00/0000")
							&& Integer.parseInt(viewConsumo.getFornecidaJFT().getText().trim()) == 0
							&& Integer.parseInt(viewConsumo.getSobraJFT().getText().trim()) == 0) {
						if (controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size() > 0) {
							if (usarColunaExtra) {
								viewConsumo.getSobraJFT().setEnabled(false);
								viewConsumo.getPesoJFT().setEnabled(true);
								viewConsumo.getPesoJFT().grabFocus();
							} else {
								viewConsumo.getSobraJFT().setEnabled(false);
								viewConsumo.getControleFornecidaJFT().setEnabled(true);
								viewConsumo.getControleFornecidaJFT().grabFocus();
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
											Integer.parseInt(viewConsumo.getFornecidaJFT().getText().trim()),
											Integer.parseInt(viewConsumo.getSobraJFT().getText().trim()),
											Integer.parseInt(viewConsumo.getPesoJFT().getText().trim()),
											Integer.parseInt(viewConsumo.getnAnimaisJFT().getText().trim())));
							controller.getModel().getModelStateDAO().saveModelState(false);
							updateHistRME();
							viewConsumo.getOrdemJFT().setText(String.valueOf(++ordem));
							TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getPesoJFT()) {
					TextFormatter.formatStringJFT(jft, text, 6);
					viewConsumo.getPesoJFT().setEnabled(false);
					viewConsumo.getnAnimaisJFT().setEnabled(true);
					viewConsumo.getnAnimaisJFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getnAnimaisJFT()) {
					TextFormatter.formatStringJFT(jft, text, 2);
					String msg = consumoBO.verificaRacao(viewConsumo.getDataJFT().getText().trim(),
							Integer.parseInt(viewConsumo.getFornecidaJFT().getText().trim()),
							Integer.parseInt(viewConsumo.getSobraJFT().getText().trim()),
							Integer.parseInt(viewConsumo.getPesoJFT().getText().trim()),
							Integer.parseInt(viewConsumo.getnAnimaisJFT().getText().trim()), datasFase);
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaDigitacaoRacoes();
					} else if (viewConsumo.getData().getText().equals("00/00/0000")
							&& Integer.parseInt(viewConsumo.getFornecidaJFT().getText().trim()) == 0
							&& Integer.parseInt(viewConsumo.getSobraJFT().getText().trim()) == 0
							&& Integer.parseInt(viewConsumo.getPesoJFT().getText().trim()) == 0
							&& Integer.parseInt(viewConsumo.getnAnimaisJFT().getText().trim()) == 0) {
						if (controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size() > 0) {
							viewConsumo.getnAnimaisJFT().setEnabled(false);
							viewConsumo.getControleFornecidaJFT().setEnabled(true);
							viewConsumo.getControleFornecidaJFT().grabFocus();
						} else {
							// Mensagem de erro
							JOptionPane.showMessageDialog(viewConsumo, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							fluxoProblemaDigitacaoRacoes();
						}
					} else {
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme()
								.add(new RmeVOSC(Integer.parseInt(viewConsumo.getOrdemJFT().getText()), viewConsumo.getData().getText(),
										Integer.parseInt(viewConsumo.getFornecidaJFT().getText().trim()),
										Integer.parseInt(viewConsumo.getSobraJFT().getText().trim()),
										Integer.parseInt(viewConsumo.getPesoJFT().getText().trim()),
										Integer.parseInt(viewConsumo.getnAnimaisJFT().getText().trim())));
						controller.getModel().getModelStateDAO().saveModelState(false);
						updateHistRME();
						viewConsumo.getOrdemJFT().setText(String.valueOf(++ordem));
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleFornecidaJFT()) {
					if (Integer.parseInt(viewConsumo.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						viewConsumo.getConsumoJP().setBorder(defaultBorder);
						viewConsumo.getControleFornecidaJFT().setEnabled(false);
						viewConsumo.getControleSobraJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						viewConsumo.getControleSobraJFT().grabFocus();
					} else {
						viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						viewConsumo.getControleFornecidaJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleSobraJFT()) {
					if (Integer.parseInt(viewConsumo.getControleSobraJFT().getText().trim()) == calculaControleSobra()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						viewConsumo.getConsumoJP().setBorder(defaultBorder);
						if (usarColunaExtra) {
							viewConsumo.getControleSobraJFT().setEnabled(false);
							viewConsumo.getControlePesoJFT().setEnabled(true);
							((JFormattedTextField) e.getSource()).transferFocus();
							viewConsumo.getControlePesoJFT().grabFocus();
						} else {
							viewConsumo.getControleSobraJFT().setEnabled(false);
							viewConsumo.getOpcaoJFT().setEnabled(true);
							((JFormattedTextField) e.getSource()).transferFocus();
							viewConsumo.getOpcaoJFT().grabFocus();
						}
					} else {
						viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						viewConsumo.getControleSobraJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControlePesoJFT()) {
					if (Integer.parseInt(viewConsumo.getControlePesoJFT().getText().trim()) == calculaControlePeso()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						viewConsumo.getConsumoJP().setBorder(defaultBorder);
						viewConsumo.getControlePesoJFT().setEnabled(false);
						viewConsumo.getControleAnimaisJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						viewConsumo.getControleAnimaisJFT().grabFocus();
					} else {
						viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						viewConsumo.getControlePesoJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				} else if ((JFormattedTextField) e.getSource() == viewConsumo.getControleAnimaisJFT()) {
					if (Integer.parseInt(viewConsumo.getControleAnimaisJFT().getText().trim()) == calculaControleAnimais()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						viewConsumo.getConsumoJP().setBorder(defaultBorder);
						viewConsumo.getControleAnimaisJFT().setEnabled(false);
						viewConsumo.getOpcaoJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						viewConsumo.getOpcaoJFT().grabFocus();
					} else {
						viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme());
						controller.getModel().getExperimentoVO().getConsumo()
								.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).setRme(new ArrayList<>());
						fluxoErroControle();
						viewConsumo.getControleAnimaisJFT().setText("000000");
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 2);
					}
				}
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
			viewConsumo.getPesoJFT().setText("00000");
			viewConsumo.getnAnimaisJFT().setText("00000");
		}
		if (!consumosErros.isEmpty()) {
			recuperaHistConsumo();
		} else {
			viewConsumo.getDataJFT().setText("00000000");
			viewConsumo.getFornecidaJFT().setText("00000");
			viewConsumo.getSobraJFT().setText("00000");
			viewConsumo.getSobraJFT().setEnabled(false);
			viewConsumo.getDataJFT().setEnabled(true);
			viewConsumo.getSobraJFT().transferFocus();
			viewConsumo.getDataJFT().grabFocus();
//			viewConsumo.pack();
		}
	}

	public void fluxoProblemaDigitacaoRacoes() {
		viewConsumo.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewConsumo.getDataJFT().setEnabled(true);
		viewConsumo.getDataJFT().grabFocus();
		viewConsumo.getFornecidaJFT().setEnabled(false);
		viewConsumo.getSobraJFT().setEnabled(false);
		viewConsumo.getControleFornecidaJFT().setEnabled(false);
		viewConsumo.getControleSobraJFT().setEnabled(false);
		if (usarColunaExtra) {
			viewConsumo.getPesoJFT().setEnabled(false);
			viewConsumo.getnAnimaisJFT().setEnabled(false);
			viewConsumo.getControlePesoJFT().setEnabled(false);
			viewConsumo.getControleAnimaisJFT().setEnabled(false);
		}
	}

	public void recuperaHistConsumo() {
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
		viewConsumo.getSobraJFT().setEnabled(false);
		viewConsumo.getDataJFT().setEnabled(true);
		viewConsumo.getDataJFT().grabFocus();
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
		viewConsumo.getDataJFT().setText("00/00/0000");
		viewConsumo.getFornecidaJFT().setText("00000");
		viewConsumo.getSobraJFT().setText("00000");
		if (usarColunaExtra) {
			viewConsumo.getPesoJFT().setText("000000");
			viewConsumo.getnAnimaisJFT().setText("00");
		}
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
//			order.add(viewConsumo.getChkUsarColunaExtra());
			order.add(viewConsumo.getDataJFT());
			order.add(viewConsumo.getFornecidaJFT());
			order.add(viewConsumo.getSobraJFT());
			order.add(viewConsumo.getPesoJFT());
			order.add(viewConsumo.getnAnimaisJFT());
			order.add(viewConsumo.getControleFornecidaJFT());
			order.add(viewConsumo.getControleSobraJFT());
			order.add(viewConsumo.getControlePesoJFT());
			order.add(viewConsumo.getControleAnimaisJFT());

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
//			order.add(viewConsumo.getChkUsarColunaExtra());
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
