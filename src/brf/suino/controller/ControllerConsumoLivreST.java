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
import brf.suino.model.vo.BaiaVOST;
import brf.suino.model.vo.ConsumoLivreVOST;
import brf.suino.model.vo.RmeLivreVOST;
import brf.suino.view.ViewConsumoLivreST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoLivreST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewConsumoLivreST view;
	private ConsumoLivreVOST consumoHist;
	private ConsumoBOST consumoBO;
	private BaiaVOST ultimaBaia;
	private List<RmeLivreVOST> consumosErros;
	private int ordem;
	private Integer galpao, baia, sexo, trata, trata2, trata3;
	private List<String> datasFases;
	private List<Component> order, orderLoadHist;
	private Border defaultBorder;

	public ControllerConsumoLivreST(ControllerST controller) {
		this.controller = controller;
		this.consumoBO = new ConsumoBOST(controller);
	}

	public void openWindow(BaiaVOST baia, List<String> datasFases) {
		this.galpao = baia.getGalpao();
		this.baia = baia.getBaia();
		this.sexo = baia.getSexo();
		this.trata = baia.getTrat1();
		this.trata2 = baia.getTrat2();
		this.trata3 = baia.getTrat3();
		this.datasFases = datasFases;
		this.ultimaBaia = baia;
		view = new ViewConsumoLivreST();
		view.setTitle("DIGEX - Consumo Livre Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		consumoHist = new ConsumoLivreVOST();

		consumosErros = new ArrayList<>();
		view.getRegistrosLabel().setVisible(false);
		defaultBorder = view.getPnlConsumo().getBorder();
		ordem = 1;
//		view.getOpcaoJFT().addKeyListener(this);
		view.getGalpaoJFT().setText(String.valueOf(galpao));

		if (this.baia != null && sexo != null && trata != null && trata2 != null) {
			view.getBaiaJFT().setText(String.valueOf(this.baia));
			view.getSexoJFT().setText(String.valueOf(sexo));
			view.getTrataJFT().setText(String.valueOf(trata));
			view.getTrata2JFT().setText(String.valueOf(trata2));

			view.getGalpaoJFT().setEnabled(false);
			view.getBaiaJFT().setEnabled(false);
			view.getSexoJFT().setEnabled(false);
			view.getTrataJFT().setEnabled(false);
			view.getTrata2JFT().setEnabled(false);

			view.getDataJFT().setEnabled(true);
			view.getDataJFT().grabFocus();
		} else {
			view.getGalpaoJFT().setEnabled(false);
			view.getBaiaJFT().setEnabled(true);
			view.getSexoJFT().setEnabled(false);
			view.getTrataJFT().setEnabled(false);
			view.getTrata2JFT().setEnabled(false);
			view.getBaiaJFT().grabFocus();
		}

		criarOrdemComponentes();
		criarOrdemComponentesHist();

		loadHist();

		if (ultimaBaia.getConsumos() != null) {
			if (ultimaBaia.getConsumos().getRme().size() > 0) {
				ordem = ultimaBaia.getConsumos().getRme().get(baia.getConsumos().getRme().size() - 1).getOrdem() + 1;
			} else {
				ordem = 1;
			}
		} else {
			ordem = 1;
		}

		view.getFornecidaJFT().setText("00000");
		view.getSobraJFT().setText("00000");
		view.getControleFornecidaJFT().setText("000000");
		view.getControleSobraJFT().setText("000000");

		view.getOrdemJFT().setText(String.valueOf(ordem).trim());
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
		view.pack();
	}

	private void loadHist() {
		if (ultimaBaia.getConsumos() != null) {
//			if (!ultimaBaia.getConsumos().isFinalizado()) {
			consumoHist = ultimaBaia.getConsumos();
			view.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()));
			view.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()));
			view.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()));
			view.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()));
			view.getTrata3JFT().setText(String.valueOf(consumoHist.getTrat3()));
			carregaRacao();
//			} else {
//				consumoHist = controller.getModel().getExperimentoVO().getBaias()
//						.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos();
//				view.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()));
//				view.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()));
//				view.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()));
//				view.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()));
//				view.getTrata3JFT().setText(String.valueOf(consumoHist.getTrat3()));
//				carregaRacao();
//				view.getDataJFT().setEnabled(false);
//				view.getFornecidaJFT().setEnabled(false);
//				view.getSobraJFT().setEnabled(false);
//				view.getControleFornecidaJFT().setEnabled(false);
//				view.getControleSobraJFT().setEnabled(false);
//				view.getOpcaoJFT().setEnabled(true);
//				view.getOpcaoJFT().grabFocus();
//			}
		}
	}

	public void carregaRacao() {
		if (ultimaBaia.getConsumos().getRme().size() > 5) {
			for (int k = 1; k <= 5; k++) {
				JLabel lbl1 = (JLabel) orderLoadHist.get(0);
				lbl1.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getSobra()).trim());
				orderLoadHist.remove(0);
				JLabel lbl2 = (JLabel) orderLoadHist.get(0);
				lbl2.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getFornecida()).trim());
				orderLoadHist.remove(0);
				JLabel lbl3 = (JLabel) orderLoadHist.get(0);
				lbl3.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getDataRacao()).trim());
				orderLoadHist.remove(0);
				JLabel lbl4 = (JLabel) orderLoadHist.get(0);
				lbl4.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getOrdem()).trim());
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
				controller.startMortalidadeST(Integer.parseInt(view.getGalpaoJFT().getText().trim()),
						Integer.parseInt(view.getBaiaJFT().getText().trim()), Integer.parseInt(view.getSexoJFT().getText().trim()),
						Integer.parseInt(view.getTrataJFT().getText().trim()), Integer.parseInt(view.getTrata2JFT().getText().trim()),
						datasFases);
				break;
			case KeyEvent.VK_2:
				if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
						.getMedicados() == null
						&& controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getMortalidades() == null
						&& controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos() == null) {
					int option = JOptionPane.showConfirmDialog(view,
							"Nenhum dado foi digitado para essa baia.\nDeseja realmente finalizá-la?", "DIGEX - Aviso",
							JOptionPane.WARNING_MESSAGE);
					if (option == 0) {
						view.setVisible(false);
//						controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().setFinalizado(true);
						controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).setFinalizado(true);
						controller.getModel().getModelStateDAO().saveModelState(false);
						ControllerMortalidadeST cont = new ControllerMortalidadeST(controller);
						cont.openWindow(datasFases);
					} else {
						view.getOpcaoJFT().grabFocus();
					}
				} else {
					view.setVisible(false);
//					controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
//							.getConsumos().setFinalizado(true);
					controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
							.setFinalizado(true);
					controller.getModel().getModelStateDAO().saveModelState(false);
					ControllerMortalidadeST cont = new ControllerMortalidadeST(controller);
					cont.openWindow(datasFases);
				}
				break;
			case KeyEvent.VK_3:
//				view.setVisible(false);
//				openWindow(Integer.parseInt(view.getGalpaoJFT().getText()), Integer.parseInt(view.getBaiaJFT().getText()),
//						Integer.parseInt(view.getSexoJFT().getText()), Integer.parseInt(view.getTrataJFT().getText()),
//						Integer.parseInt(view.getTrata2JFT().getText()), datasFases);
				break;
			case KeyEvent.VK_4:
//				view.setVisible(false);
//				ControllerEscolhaDigSC escolhaDigSC = new ControllerEscolhaDigSC(controller);
//				escolhaDigSC.openWindow(datasFases);
				break;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getOpcaoJFT()) && !e.getSource().equals(view.getDataJFT())
				&& !e.getSource().equals(view.getControleFornecidaJFT()) && !e.getSource().equals(view.getControleSobraJFT())
				&& !e.getSource().equals(view.getBaiaJFT())) {
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
				ControllerEscolhaDigST ce = new ControllerEscolhaDigST(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
			JFormattedTextField jft = null;
			String text = "";
			jft = (JFormattedTextField) e.getSource();
			text = jft.getText();
			if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				TextFormatter.formatStringJFT(jft, text, 10);
				String msg = consumoBO.verificaData(view.getDataJFT().getText(), datasFases);
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
				if (view.getDataJFT().getText().equals("00/00/0000") && view.getFornecidaJFT().getText().equals("00000")
						&& view.getSobraJFT().getText().equals("00000")) {
					TextFormatter.formatStringJFT(jft, text, 5);
					view.getSobraJFT().setEnabled(false);
					view.getControleFornecidaJFT().setEnabled(true);
					view.getControleFornecidaJFT().requestFocus();
				} else {
					String msg = consumoBO.verificaRacao(view.getDataJFT().getText(), Integer.parseInt(view.getFornecidaJFT().getText()),
							Integer.parseInt(view.getSobraJFT().getText()), datasFases);
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaDigitacaoRacoes();
					} else {
						TextFormatter.formatStringJFT(jft, text, 5);
						view.getSobraJFT().setEnabled(false);
						view.getDataJFT().setEnabled(true);
						view.getDataJFT().grabFocus();
						if (controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos() == null) {
//							controller.getModel().getExperimentoVO().getBaias()
//									.get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
//									.setConsumos(new ConsumoLivreVOST(galpao, baia, sexo, trata, trata2, trata3, false, new ArrayList<>()));
							controller.getModel().getExperimentoVO().getBaias()
									.get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
									.setConsumos(new ConsumoLivreVOST(galpao, baia, sexo, trata, trata2, trata3, new ArrayList<>()));
							controller.getModel().getExperimentoVO().getBaias()
									.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme()
									.add(new RmeLivreVOST(Integer.parseInt(view.getOrdemJFT().getText().trim()),
											view.getDataJFT().getText().trim(), Integer.parseInt(view.getFornecidaJFT().getText().trim()),
											Integer.parseInt(view.getSobraJFT().getText().trim())));
							controller.getModel().getModelStateDAO().saveModelState(false);
						} else {
							controller.getModel().getExperimentoVO().getBaias()
									.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme()
									.add(new RmeLivreVOST(Integer.parseInt(view.getOrdemJFT().getText().trim()),
											view.getDataJFT().getText().trim(), Integer.parseInt(view.getFornecidaJFT().getText().trim()),
											Integer.parseInt(view.getSobraJFT().getText().trim())));
							controller.getModel().getModelStateDAO().saveModelState(false);
						}
						updateHistRME();
						ordem++;
						view.getOrdemJFT().setText(String.valueOf(ordem));
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
						view.getPnlConsumo().setBorder(defaultBorder);
					}
				}

			} else if ((JFormattedTextField) e.getSource() == view.getControleFornecidaJFT()) {
				if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
						.getConsumos() == null && view.getDataJFT().getText().equals("00/00/0000")
						&& Integer.parseInt(view.getFornecidaJFT().getText()) == 0
						&& Integer.parseInt(view.getFornecidaJFT().getText()) == 0) {
					view.getPnlConsumo().setBorder(defaultBorder);
					view.getControleFornecidaJFT().setEnabled(false);
					view.getControleSobraJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					view.getControleSobraJFT().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
						view.getPnlConsumo().setBorder(defaultBorder);
						view.getControleFornecidaJFT().setEnabled(false);
						view.getControleSobraJFT().setEnabled(true);
						view.getControleSobraJFT().grabFocus();
					} else {
						view.getPnlConsumo().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme());
						controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos()
								.setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControleFornecidaJFT().setText("000000");
						view.getControleFornecidaJFT().setEnabled(false);
						ordem = consumosErros.get(0).getOrdem();
						recuperaHistConsumo();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getControleSobraJFT()) {
				if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
						.getConsumos() == null && view.getDataJFT().getText().equals("00/00/0000")
						&& Integer.parseInt(view.getFornecidaJFT().getText()) == 0
						&& Integer.parseInt(view.getFornecidaJFT().getText()) == 0) {
					view.getControleSobraJFT().setEnabled(false);
					view.getOpcaoJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					view.getOpcaoJFT().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleSobraJFT().getText().trim()) == calculaControleSobra()) {
						TextFormatter.formatStringJFT(jft, text, 6);
						view.getPnlConsumo().setBorder(defaultBorder);
//						controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().setFinalizado(true);
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getControleSobraJFT().setEnabled(false);
						view.getOpcaoJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						view.getOpcaoJFT().grabFocus();
					} else {
						view.getPnlConsumo().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						consumosErros.addAll(controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme());
						controller.getModel().getExperimentoVO().getBaias()
								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos()
								.setRme(new ArrayList<>());
						fluxoErroControle();
						view.getControleSobraJFT().setText("000000");
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
		view.getDataHist1Label().setText(view.getDataHist2Label().getText());
		view.getDataHist2Label().setText(view.getDataHist3Label().getText());
		view.getDataHist3Label().setText(view.getDataHist4Label().getText());
		view.getDataHist4Label().setText(view.getDataHist5Label().getText());
		view.getDataHist5Label().setText(view.getDataJFT().getText());
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
		view.getPnlConsumo().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
		view.getFornecidaJFT().setEnabled(false);
		view.getSobraJFT().setEnabled(false);
		view.getControleFornecidaJFT().setEnabled(false);
		view.getControleSobraJFT().setEnabled(false);
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
		consumosErros.remove(0);
		view.getSobraJFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private Integer calculaControleRacaoFornecida() {
		int soma = 0;
		for (RmeLivreVOST consumo : controller.getModel().getExperimentoVO().getBaias()
				.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme()) {
			soma += consumo.getFornecida();
		}
		return soma;
	}

	private Integer calculaControleSobra() {
		int soma = 0;
		for (RmeLivreVOST consumo : controller.getModel().getExperimentoVO().getBaias()
				.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme()) {
			soma += consumo.getSobra();
		}
		return soma;
	}

	public void fluxoErroControle() {
		view.getDataJFT().setText("00/00/0000");
		view.getFornecidaJFT().setText("00000");
		view.getSobraJFT().setText("00000");
		view.getOrdemHist5Label().setText("");
		view.getOrdemHist4Label().setText("");
		view.getOrdemHist3Label().setText("");
		view.getOrdemHist2Label().setText("");
		view.getOrdemHist1Label().setText("");
		view.getDataHist5Label().setText("");
		view.getDataHist4Label().setText("");
		view.getDataHist3Label().setText("");
		view.getDataHist2Label().setText("");
		view.getDataHist1Label().setText("");
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
	}

	private void fluxoOkCabecalho() {
		view.getBaiaJP().setBorder(defaultBorder);
		view.getBaiaJFT().setEnabled(false);
		view.getSexoJFT().setEnabled(false);
		view.getTrataJFT().setEnabled(false);
		view.getTrata2JFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private void criarOrdemComponentesHist() {
		orderLoadHist = new ArrayList<>();
		orderLoadHist.add(view.getSobraHist5Label());
		orderLoadHist.add(view.getFornecidaHist5Label());
		orderLoadHist.add(view.getDataHist5Label());
		orderLoadHist.add(view.getOrdemHist5Label());
		orderLoadHist.add(view.getSobraHist4Label());
		orderLoadHist.add(view.getFornecidaHist4Label());
		orderLoadHist.add(view.getDataHist4Label());
		orderLoadHist.add(view.getOrdemHist4Label());
		orderLoadHist.add(view.getSobraHist3Label());
		orderLoadHist.add(view.getFornecidaHist3Label());
		orderLoadHist.add(view.getDataHist3Label());
		orderLoadHist.add(view.getOrdemHist3Label());
		orderLoadHist.add(view.getSobraHist2Label());
		orderLoadHist.add(view.getFornecidaHist2Label());
		orderLoadHist.add(view.getDataHist2Label());
		orderLoadHist.add(view.getOrdemHist2Label());
		orderLoadHist.add(view.getSobraHist1Label());
		orderLoadHist.add(view.getFornecidaHist1Label());
		orderLoadHist.add(view.getDataHist1Label());
		orderLoadHist.add(view.getOrdemHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getGalpaoJFT());
		order.add(view.getBaiaJFT());
		order.add(view.getSexoJFT());
		order.add(view.getTrataJFT());
		order.add(view.getTrata2JFT());
		order.add(view.getDataJFT());
		order.add(view.getFornecidaJFT());
		order.add(view.getSobraJFT());
		order.add(view.getControleFornecidaJFT());
		order.add(view.getControleSobraJFT());
		order.add(view.getOpcaoJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

}
