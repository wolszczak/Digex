package brf.suino.controller;

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

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.view.ViewConsumoSC;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoSC extends KeyAdapter implements ActionListener, FocusListener, ItemListener {
	private final ControllerSC controller;
	private ViewConsumoSC viewConsumo;
	private ConsumoVOSC consumoTemp;
	private String inicioExp, fimExp;
	private int faseCounter,ordem;
	private boolean usarColunaExtra;
	private List<String> datasFase;
	private List<Component> order, orderLoadHist, orderAux;
	private Border defaultBorder;

	public ControllerConsumoSC(ControllerSC c) {
		this.controller = c;
	}

	public void openWindow(List<String> datasFases) {
		viewConsumo = new ViewConsumoSC();
		datasFase = new ArrayList<>();
		usarColunaExtra = false;
		viewConsumo.setTitle("DIGEX - Suínos Creche");
		viewConsumo.setResizable(false);
		viewConsumo.setLocationRelativeTo(null);
		viewConsumo.setVisible(true);
		defaultBorder = viewConsumo.getConsumoJP().getBorder();
		faseCounter = 1;
		ordem = 1;

		viewConsumo.getChkUsarColunaExtra().addItemListener(this);
		viewConsumo.getChkUsarColunaExtra().addKeyListener(this);
		if (controller.getModel().getExperimentoVO().getConsumo() != null
				&& controller.getModel().getExperimentoVO().getConsumo().size() > 0) {
			usarColunaExtra = controller.getModel().getExperimentoVO().getConsumo()
					.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).isColunaExtra();
			if(controller.getModel().getExperimentoVO().getConsumo().get(controller.getModel().getExperimentoVO().getConsumo().size()-1).getRme().size() > 0) {
				ordem = controller.getModel().getExperimentoVO().getConsumo().get(controller.getModel().getExperimentoVO().getConsumo().size()-1).getRme().get(controller.getModel().getExperimentoVO().getConsumo().get(controller.getModel().getExperimentoVO().getConsumo().size()-1).getRme().size() - 1).getOrdem() + 1;
			}
		}

		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();

		viewConsumo.getOrdemJFT().setText(String.valueOf(ordem).trim());
		TextFormatter.formatStringJFT(viewConsumo.getOrdemJFT(), viewConsumo.getOrdemJFT().getText(), 3);
		viewConsumo.getIdadeJFT().setText("000");
		viewConsumo.getFornecidaJFT().setText("00000");
		viewConsumo.getSobraJFT().setText("00000");
		viewConsumo.getPesoJFT().setText("00000");
		viewConsumo.getnAnimaisJFT().setText("000");
		viewConsumo.getControleFornecidaJFT().setText("000000");
		viewConsumo.getControleSobraJFT().setText("000000");

	}

	private void criarOrdemComponentesHist() {
		if (usarColunaExtra) {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(viewConsumo.getnAnimHist5Label());
			orderLoadHist.add(viewConsumo.getPesoHist5Label());
			orderLoadHist.add(viewConsumo.getSobraHist5Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist5Label());
			orderLoadHist.add(viewConsumo.getIdadeHist5Label());
			orderLoadHist.add(viewConsumo.getOrdemHist5Label());
			orderLoadHist.add(viewConsumo.getnAnimHist4Label());
			orderLoadHist.add(viewConsumo.getPesoHist4Label());
			orderLoadHist.add(viewConsumo.getSobraHist4Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist4Label());
			orderLoadHist.add(viewConsumo.getIdadeHist4Label());
			orderLoadHist.add(viewConsumo.getOrdemHist4Label());
			orderLoadHist.add(viewConsumo.getnAnimHist3Label());
			orderLoadHist.add(viewConsumo.getPesoHist3Label());
			orderLoadHist.add(viewConsumo.getSobraHist3Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist3Label());
			orderLoadHist.add(viewConsumo.getIdadeHist3Label());
			orderLoadHist.add(viewConsumo.getOrdemHist3Label());
			orderLoadHist.add(viewConsumo.getnAnimHist2Label());
			orderLoadHist.add(viewConsumo.getPesoHist2Label());
			orderLoadHist.add(viewConsumo.getSobraHist2Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist2Label());
			orderLoadHist.add(viewConsumo.getIdadeHist2Label());
			orderLoadHist.add(viewConsumo.getOrdemHist2Label());
			orderLoadHist.add(viewConsumo.getnAnimHist1Label());
			orderLoadHist.add(viewConsumo.getPesoHist1Label());
			orderLoadHist.add(viewConsumo.getSobraHist1Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist1Label());
			orderLoadHist.add(viewConsumo.getIdadeHist1Label());
			orderLoadHist.add(viewConsumo.getOrdemHist1Label());
		} else {
			orderLoadHist = new ArrayList<>();
			orderLoadHist.add(viewConsumo.getSobraHist5Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist5Label());
			orderLoadHist.add(viewConsumo.getIdadeHist5Label());
			orderLoadHist.add(viewConsumo.getOrdemHist5Label());
			orderLoadHist.add(viewConsumo.getSobraHist4Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist4Label());
			orderLoadHist.add(viewConsumo.getIdadeHist4Label());
			orderLoadHist.add(viewConsumo.getOrdemHist4Label());
			orderLoadHist.add(viewConsumo.getSobraHist3Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist3Label());
			orderLoadHist.add(viewConsumo.getIdadeHist3Label());
			orderLoadHist.add(viewConsumo.getOrdemHist3Label());
			orderLoadHist.add(viewConsumo.getSobraHist2Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist2Label());
			orderLoadHist.add(viewConsumo.getIdadeHist2Label());
			orderLoadHist.add(viewConsumo.getOrdemHist2Label());
			orderLoadHist.add(viewConsumo.getSobraHist1Label());
			orderLoadHist.add(viewConsumo.getFornecidaHist1Label());
			orderLoadHist.add(viewConsumo.getIdadeHist1Label());
			orderLoadHist.add(viewConsumo.getOrdemHist1Label());
		}

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
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getIdadeRacao()).trim());
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
										String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getIdadeRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl4 = (JLabel) orderLoadHist.get(0);
								lbl4.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						}
					} else {
						if (usarColunaExtra) {
							for (int z = consumoHist.getRme().size(); z < 0; z--) {
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
								lbl5.setText(String.valueOf(consumoHist.getRme().get(z - 1).getIdadeRacao()).trim());
								orderLoadHist.remove(0);
								JLabel lbl6 = (JLabel) orderLoadHist.get(0);
								lbl6.setText(String.valueOf(consumoHist.getRme().get(z - 1).getOrdem()).trim());
								orderLoadHist.remove(0);
							}
							criarOrdemComponentesHist();
						} else {
							for (int z = consumoHist.getRme().size(); z < 0; z--) {
								JLabel lbl1 = (JLabel) orderLoadHist.get(0);
								lbl1.setText(String.valueOf(consumoHist.getRme().get(z - 1).getSobra()).trim());
								orderLoadHist.remove(0);
								JLabel lbl2 = (JLabel) orderLoadHist.get(0);
								lbl2.setText(String.valueOf(consumoHist.getRme().get(z - 1).getFornecida()).trim());
								orderLoadHist.remove(0);
								JLabel lbl3 = (JLabel) orderLoadHist.get(0);
								lbl3.setText(String.valueOf(consumoHist.getRme().get(z - 1).getIdadeRacao()).trim());
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
				viewConsumo.getControleBaiaLabel().setVisible(false);
				viewConsumo.getControleBaiaJFT().setVisible(false);
				viewConsumo.getIdadeJFT().setEnabled(true);
				viewConsumo.getIdadeJFT().grabFocus();
			} else {

			}
		} else {

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
	@SuppressWarnings("rawtypes")
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
		} else {
			usarColunaExtra = false;
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewConsumo.getIdadeJFT())) {
			System.out.println("left");
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
			JFormattedTextField src = null;
			JCheckBox chk = null;
			String text = "";
			if (e.getSource() == viewConsumo.getChkUsarColunaExtra()) {
				viewConsumo.getChkUsarColunaExtra().setEnabled(false);
				viewConsumo.getIdadeJFT().setEnabled(true);
				viewConsumo.getIdadeJFT().grabFocus();
				criarOrdemComponentes();
			} else {
				src = (JFormattedTextField) e.getSource();
				text = src.getText();

//				if ((JFormattedTextField) e.getSource() == viewConsumo.getBaia1JFT()) {
//					TextFormatter.formatStringJFT(src, text, 2);
//					viewConsumo.getRegistrosLabel().setVisible(false);
//					viewConsumo.getBaia1JFT().setEnabled(false);
//					viewConsumo.getBaia2JFT().setEnabled(true);
//					viewConsumo.getBaia2JFT().requestFocus();
//				}
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewConsumo, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
//				viewInfoExp.setVisible(false);
//				ControllerEscolhaExp ce = new ControllerEscolhaExp();
//				ce.openWindow(idDigitador);
//				System.out.println("Voltar");
			}
		} else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			Object src = e.getSource();
			String text = "";
		}
	}

//	public void resetaFasesAbates() {
//		viewInfoExp.getFaseJFT().setText("1");
//		viewInfoExp.getFaseHist1Label().setText("");
//		viewInfoExp.getFaseHist2Label().setText("");
//		viewInfoExp.getIdadeHist1Label().setText("");
//		viewInfoExp.getIdadeHist2Label().setText("");
//		viewInfoExp.getIdadeFaseJFT().setText("");
////        idadeFase.removeAll(idadeFase);
//		faseCounter = 1;
////        dataAbate.removeAll(dataAbate);
//		datasFase = new ArrayList<>();
//	}

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
			order.add(viewConsumo.getIdadeJFT());
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
			order.add(viewConsumo.getIdadeJFT());
			order.add(viewConsumo.getFornecidaJFT());
			order.add(viewConsumo.getSobraJFT());
			order.add(viewConsumo.getControleFornecidaJFT());
			order.add(viewConsumo.getControleSobraJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			viewConsumo.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		}
	}

//	private void criaListaOrdemAux() {
//		// CRIA LISTA DE COMPONENTES ORDENADOS PARA SALVAR OS OBJETOS AO FINAL DE CADA
//		// BLOCO DIGITADO.
//		orderAux = new ArrayList<Component>();
//		if (!usarColunaExtra) {
//			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa11JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso11JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa21JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso21JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa12JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso12JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa22JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso22JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa13JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso13JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa23JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso23JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa14JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso14JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa24JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso24JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa15JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso15JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa25JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso25JFT());
//		} else {
//			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa11JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso11JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa21JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso21JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa31JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso31JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa12JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso12JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa22JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso22JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa32JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso32JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa13JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso13JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa23JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso23JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa33JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso33JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa14JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso14JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa24JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso24JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa34JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso34JFT());
//
//			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa15JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso15JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa25JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso25JFT());
//			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
//			orderAux.add(viewBaiaAmostrados.getNasa35JFT());
//			orderAux.add(viewBaiaAmostrados.getPeso35JFT());
//		}
//	}

}
