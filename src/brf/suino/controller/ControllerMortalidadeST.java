package brf.suino.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.bo.MortalidadeBOST;
import brf.suino.model.vo.MortalidadeVOST;
import brf.suino.view.ViewMortalidadeST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerMortalidadeST extends KeyAdapter implements FocusListener {
	private ControllerST controller;
	private ViewMortalidadeST view;
	private List<MortalidadeVOST> mortosHist, mortosErros;
	private List<Component> order, orderMortHist, orderMediHist;
	private List<String> datasFases;
	private int ordem;
	private MortalidadeBOST bo;
	private Border defaultBorder;

	public ControllerMortalidadeST(ControllerST c) {
		this.controller = c;
		bo = new MortalidadeBOST(c);
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		view = new ViewMortalidadeST();
		view.setTitle("DIGEX - Mortalidade Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getRegistrosMortLabel().setVisible(false);
		view.getRegistrosMediLabel().setVisible(false);
		view.getOpcaoMortJFT().addKeyListener(this);
		view.getOpcaoMediJFT().addKeyListener(this);
		view.getGalpaoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getInfoExp().getGalpao()));

		view.getDataMortJFT().setText("00/00/00");
		view.getBrincoMortJFT().setText("0000");
		view.getPesoIniJFT().setText("000000");
		view.getPesoIniJFT().setText("000000");
		view.getPesoMortoJFT().setText("000000");
		view.getFaseMortJFT().setText("0");
		view.getCausaMortJFT().setText("00");
		view.getControleMortJFT().setText("000000");

		view.getDataMediJFT().setText("00/00/00");
		view.getBrincoMediJFT().setText("0000");
		view.getMedicamentoJFT().setText("00");
		view.getCausaMediJFT().setText("00");
		view.getDose1JFT().setText("000");
		view.getDose2JFT().setText("000");
		view.getDose3JFT().setText("000");
		view.getControleMediJFT().setText("000000");

		view.getBaiaJFT().setEnabled(true);
		view.getBaiaJFT().grabFocus();
		defaultBorder = view.getPnlMortalidade().getBorder();
		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();
		view.pack();
	}

	private void criarOrdemComponentesHist() {
		orderMortHist = new ArrayList<>();
		orderMortHist.add(view.getCausaHist5Label());
		orderMortHist.add(view.getFaseMortHist5Label());
		orderMortHist.add(view.getPesoIniHist5Label());
		orderMortHist.add(view.getPesoMortHist5Label());
		orderMortHist.add(view.getBrincoMortHist5Label());
		orderMortHist.add(view.getDataMortHist5Label());
		orderMortHist.add(view.getOrdemMortHist5Label());
		orderMortHist.add(view.getCausaHist4Label());
		orderMortHist.add(view.getFaseMortHist4Label());
		orderMortHist.add(view.getPesoIniHist4Label());
		orderMortHist.add(view.getPesoMortHist4Label());
		orderMortHist.add(view.getBrincoMortHist4Label());
		orderMortHist.add(view.getDataMortHist4Label());
		orderMortHist.add(view.getOrdemMortHist4Label());
		orderMortHist.add(view.getCausaHist3Label());
		orderMortHist.add(view.getFaseMortHist3Label());
		orderMortHist.add(view.getPesoIniHist3Label());
		orderMortHist.add(view.getPesoMortHist3Label());
		orderMortHist.add(view.getBrincoMortHist3Label());
		orderMortHist.add(view.getDataMortHist3Label());
		orderMortHist.add(view.getOrdemMortHist3Label());
		orderMortHist.add(view.getCausaMortHist2Label());
		orderMortHist.add(view.getFaseMortHist2Label());
		orderMortHist.add(view.getPesoIniHist2Label());
		orderMortHist.add(view.getPesoMortHist2Label());
		orderMortHist.add(view.getBrincoMortHist2Label());
		orderMortHist.add(view.getDataMortHist2Label());
		orderMortHist.add(view.getOrdemMortHist2Label());
		orderMortHist.add(view.getCausaHist1Label());
		orderMortHist.add(view.getFaseMortHist1Label());
		orderMortHist.add(view.getPesoIniHist1Label());
		orderMortHist.add(view.getPesoMortHist1Label());
		orderMortHist.add(view.getBrincoMortHist1Label());
		orderMortHist.add(view.getDataMortHist1Label());
		orderMortHist.add(view.getOrdemMortHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getBaiaJFT());
		order.add(view.getSexoJFT());
		order.add(view.getTrataJFT());
		order.add(view.getTrata2JFT());
		order.add(view.getControleBaiaJFT());
		order.add(view.getDataMortJFT());
		order.add(view.getBrincoMortJFT());
		order.add(view.getPesoIniJFT());
		order.add(view.getPesoMortoJFT());
		order.add(view.getFaseMortJFT());
		order.add(view.getCausaMortJFT());
		order.add(view.getControleMortJFT());
		order.add(view.getOpcaoMortJFT());
		order.add(view.getDataMediJFT());
		order.add(view.getBrincoMediJFT());
		order.add(view.getMedicamentoJFT());
		order.add(view.getCausaMediJFT());
		order.add(view.getDose1JFT());
		order.add(view.getDose2JFT());
		order.add(view.getDose3JFT());
		order.add(view.getControleMediJFT());
		order.add(view.getOpcaoMediJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	private void loadHist() {
		if (controller.getModel().getExperimentoVO().getMortalidade() != null
				&& controller.getModel().getExperimentoVO().getMortalidade().size() > 0) {
//			if (controller.getModel().getExperimentoVO().getMortalidade()
//					.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getBaia() == baia) {
//				mortosHist = new ArrayList<>();
//				for (MortalidadeVOST m : controller.getModel().getExperimentoVO().getMortalidade()) {
//					if (m.getBaia() == baia) {
//						mortosHist.add(m);
//					}
//				}
//				ordem = mortosHist.get(mortosHist.size() - 1).getOrdem() + 1;
//			} else {
//				ordem = 1;
//			}
		} else {
			ordem = 1;
		}

		view.getOrdemMortJFT().setText(String.valueOf(ordem));
		TextFormatter.formatStringJFT(view.getOrdemMortJFT(), view.getOrdemMortJFT().getText(), 2);

		if (mortosHist != null) {
			for (int k = 0; k < 5; k++) {
				if (mortosHist != null && mortosHist.size() > 0) {
					JLabel lbl1 = (JLabel) orderMortHist.get(0);
					lbl1.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getCausa()));
					orderMortHist.remove(0);

					JLabel lbl2 = (JLabel) orderMortHist.get(0);
					lbl2.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getFase()));
					orderMortHist.remove(0);

					JLabel lbl3 = (JLabel) orderMortHist.get(0);
					lbl3.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getPesoIni()));
					orderMortHist.remove(0);

					JLabel lbl4 = (JLabel) orderMortHist.get(0);
					lbl4.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getPesoMorto()));
					orderMortHist.remove(0);

					JLabel lbl5 = (JLabel) orderMortHist.get(0);
					lbl5.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getBrinco()));
					orderMortHist.remove(0);

					JLabel lbl6 = (JLabel) orderMortHist.get(0);
					lbl6.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getData()));
					orderMortHist.remove(0);

					JLabel lbl7 = (JLabel) orderMortHist.get(0);
					lbl7.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getOrdem()));
					TextFormatter.formatStringOrdem(lbl6, lbl6.getText(), 3);

					orderMortHist.remove(0);
					mortosHist.remove(mortosHist.size() - 1);
				}

			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getDataMortJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigST controllerEscolhaDigST = new ControllerEscolhaDigST(controller);
				controllerEscolhaDigST.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
		if ((JFormattedTextField) e.getSource() == view.getOpcaoMortJFT()) {
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
				view.getOpcaoMortJFT().setEnabled(false);
				view.getDataMediJFT().setEnabled(true);
				view.getDataMediJFT().grabFocus();
				break;
			case KeyEvent.VK_2:
				view.setVisible(false);
				ControllerMortalidadeST m = new ControllerMortalidadeST(controller);
				m.openWindow(datasFases);
				break;
			case KeyEvent.VK_3:
				view.setVisible(false);
//				ControllerConsumoSC consumo = new ControllerConsumoSC(controller);
//				consumo.openWindow(datasFases);
				break;
			case KeyEvent.VK_9:
				view.setVisible(false);
				ControllerEscolhaTipoDigST controllerEscolha = new ControllerEscolhaTipoDigST(controller);
				controllerEscolha.openWindow(datasFases);
				break;
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == view.getBaiaJFT()) {
				view.getBaiaJFT().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 3);
				view.getSexoJFT().setEnabled(true);
				view.getSexoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getSexoJFT()) {
				view.getSexoJFT().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 1);
				view.getTrataJFT().setEnabled(true);
				view.getTrataJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getTrataJFT()) {
				view.getTrataJFT().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 2);
				view.getTrata2JFT().setEnabled(true);
				view.getTrata2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getTrata2JFT()) {
				view.getTrata2JFT().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 2);
				view.getControleBaiaJFT().setEnabled(true);
				view.getControleBaiaJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleBaiaJFT()) {
				view.getControleBaiaJFT().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 4);
				if (Integer.parseInt(view.getControleBaiaJFT().getText()) == calculaControleBaia()) {
					view.getDataMortJFT().setEnabled(true);
					view.getDataMortJFT().grabFocus();
					view.getBaiaJP().setBorder(defaultBorder);
				} else {
					fluxoErroControleBaia();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getDataMortJFT()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, text, 8);
				String msg = bo.verificaData(view.getDataMortJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					view.getDataMortJFT().setEnabled(false);
					view.getBrincoMortJFT().setEnabled(true);
					view.getBrincoMortJFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getBrincoMortJFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				view.getBrincoMortJFT().setEnabled(false);
				view.getPesoIniJFT().setEnabled(true);
				view.getPesoIniJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPesoIniJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				view.getPesoIniJFT().setEnabled(false);
				view.getPesoMortoJFT().setEnabled(true);
				view.getPesoMortoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPesoMortJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				view.getPesoMortoJFT().setEnabled(false);
				view.getFaseMortJFT().setEnabled(true);
				view.getFaseMortJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFaseMortJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				view.getFaseMortJFT().setEnabled(false);
				view.getCausaMortJFT().setEnabled(true);
				view.getCausaMortJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCausaMortJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				view.getCausaMortJFT().setEnabled(false);
				view.getControleMortJFT().setEnabled(true);
				view.getControleMortJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleMortJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (view.getDataMortJFT().getText().equals("00/00/00") && view.getBrincoMortJFT().getText().equals("0000")
						&& view.getPesoIniJFT().getText().equals("000000") && view.getPesoMortoJFT().getText().equals("000000")
						&& view.getFaseMortJFT().getText().equals("0") && view.getCausaMortJFT().getText().equals("00")) {
					view.getControleMortJFT().setEnabled(false);
					view.getOpcaoMortJFT().setEnabled(true);
					view.getOpcaoMortJFT().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleMortJFT().getText()) == calculaControleMortJFT()) {
						controller.getModel().getExperimentoVO().getMortalidade()
								.add(new MortalidadeVOST(Integer.parseInt(view.getGalpaoJFT().getText().trim()),
										Integer.parseInt(view.getBaiaJFT().getText().trim()),
										Integer.parseInt(view.getSexoJFT().getText().trim()),
										Integer.parseInt(view.getTrataJFT().getText().trim()),
										Integer.parseInt(view.getTrata2JFT().getText().trim()),
										Integer.parseInt(view.getOrdemMortJFT().getText().trim()), view.getDataMortJFT().getText().trim(),
										Integer.parseInt(view.getPesoIniJFT().getText().trim()),
										Integer.parseInt(view.getPesoMortJFT().getText().trim()),
										Integer.parseInt(view.getBrincoMortJFT().getText().trim()),
										Integer.parseInt(view.getFaseMortJFT().getText().trim()),
										Integer.parseInt(view.getCausaMortJFT().getText().trim())));
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getDataMortJFT().setEnabled(true);
						view.getDataMortJFT().grabFocus();
						TextFormatter.formatStringJFT(view.getOrdemMortJFT(), view.getOrdemMortJFT().getText(), 2);
						updateHistMort();
						ordem++;
						view.getOrdemMortJFT().setText(String.valueOf(ordem));
						view.getRegistrosLabel().setVisible(true);
						view.getPnlMortalidade().setBorder(defaultBorder);
					} else {
						fluxoErroControleMort();
						view.getPnlMortalidade().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				}

			}
		}
	}

	private void updateHistMort() {
		view.getOrdemMortHist1Label().setText(String.valueOf(view.getOrdemMortHist2Label().getText()));
		view.getOrdemMortHist2Label().setText(String.valueOf(view.getOrdemMortHist3Label().getText()));
		view.getOrdemMortHist3Label().setText(String.valueOf(view.getOrdemMortHist4Label().getText()));
		view.getOrdemMortHist4Label().setText(String.valueOf(view.getOrdemMortHist5Label().getText()));
		view.getOrdemMortHist5Label().setText(String.valueOf(view.getOrdemMortJFT().getText()));

		view.getDataMortHist1Label().setText(String.valueOf(view.getDataMortHist2Label().getText()));
		view.getDataMortHist2Label().setText(String.valueOf(view.getDataMortHist3Label().getText()));
		view.getDataMortHist3Label().setText(String.valueOf(view.getDataMortHist4Label().getText()));
		view.getDataMortHist4Label().setText(String.valueOf(view.getDataMortHist5Label().getText()));
		view.getDataMortHist5Label().setText(String.valueOf(view.getDataMortJFT().getText()));

		view.getBrincoMortHist1Label().setText(String.valueOf(view.getBrincoMortHist2Label().getText()));
		view.getBrincoMortHist2Label().setText(String.valueOf(view.getBrincoMortHist3Label().getText()));
		view.getBrincoMortHist3Label().setText(String.valueOf(view.getBrincoMortHist4Label().getText()));
		view.getBrincoMortHist4Label().setText(String.valueOf(view.getBrincoMortHist5Label().getText()));
		view.getBrincoMortHist5Label().setText(String.valueOf(view.getBrincoMortJFT().getText()));

		view.getPesoIniHist1Label().setText(String.valueOf(view.getPesoIniHist2Label().getText()));
		view.getPesoIniHist2Label().setText(String.valueOf(view.getPesoIniHist3Label().getText()));
		view.getPesoIniHist3Label().setText(String.valueOf(view.getPesoIniHist4Label().getText()));
		view.getPesoIniHist4Label().setText(String.valueOf(view.getPesoIniHist5Label().getText()));
		view.getPesoIniHist5Label().setText(String.valueOf(view.getPesoIniJFT().getText()));

		view.getPesoMortHist1Label().setText(String.valueOf(view.getPesoMortHist2Label().getText()));
		view.getPesoMortHist2Label().setText(String.valueOf(view.getPesoMortHist3Label().getText()));
		view.getPesoMortHist3Label().setText(String.valueOf(view.getPesoMortHist4Label().getText()));
		view.getPesoMortHist4Label().setText(String.valueOf(view.getPesoMortHist5Label().getText()));
		view.getPesoMortHist5Label().setText(String.valueOf(view.getPesoMortJFT().getText()));

		view.getFaseMortHist1Label().setText(String.valueOf(view.getFaseMortHist2Label().getText()));
		view.getFaseMortHist2Label().setText(String.valueOf(view.getFaseMortHist3Label().getText()));
		view.getFaseMortHist3Label().setText(String.valueOf(view.getFaseMortHist4Label().getText()));
		view.getFaseMortHist4Label().setText(String.valueOf(view.getFaseMortHist5Label().getText()));
		view.getFaseMortHist5Label().setText(String.valueOf(view.getFaseMortJFT().getText()));

		view.getCausaMortHist1Label().setText(String.valueOf(view.getCausaMortHist2Label().getText()));
		view.getCausaMortHist2Label().setText(String.valueOf(view.getCausaMortHist3Label().getText()));
		view.getCausaMortHist3Label().setText(String.valueOf(view.getCausaMortHist4Label().getText()));
		view.getCausaMortHist4Label().setText(String.valueOf(view.getCausaMortHist5Label().getText()));
		view.getCausaMortHist5Label().setText(String.valueOf(view.getCausaMortJFT().getText()));

		view.getDataMortJFT().setText("00/00/00");
		view.getBrincoMortJFT().setText("0000");
		view.getPesoIniJFT().setText("000000");
		view.getPesoMortJFT().setText("000000");
		view.getFaseMortJFT().setText("0");
		view.getCausaMortJFT().setText("00");
		view.getControleMortJFT().setText("000000");

		view.getBrincoMortJFT().setEnabled(false);
		view.getPesoIniJFT().setEnabled(false);
		view.getPesoMortJFT().setEnabled(false);
		view.getFaseMortJFT().setEnabled(false);
		view.getCausaMortJFT().setEnabled(false);
		view.getControleMortJFT().setEnabled(false);
		view.pack();
	}

	private void fluxoErroControleMort() {
		view.getControleMortJFT().setEnabled(false);
		view.getDataMortJFT().setEnabled(true);
		view.getDataMortJFT().grabFocus();
	}

	private Integer calculaControleMortJFT() {
		int soma = 0;
		String[] split = view.getDataMortJFT().getText().split("/");
//		soma += Integer.parseInt(split[0]);
//		soma += Integer.parseInt(split[1]);
//		soma += Integer.parseInt(split[2]);
		soma += Integer.parseInt(split[0] + split[1] + split[2]);
		soma += Integer.parseInt(view.getBrincoMortJFT().getText());
		soma += Integer.parseInt(view.getPesoIniJFT().getText());
		soma += Integer.parseInt(view.getPesoMortJFT().getText());
		soma += Integer.parseInt(view.getFaseMortJFT().getText());
		soma += Integer.parseInt(view.getCausaMortJFT().getText());
		return soma;
	}

	private Integer calculaControleBaia() {
		int soma = 0;
		soma += Integer.parseInt(view.getGalpaoJFT().getText().trim());
		soma += Integer.parseInt(view.getBaiaJFT().getText().trim());
		soma += Integer.parseInt(view.getSexoJFT().getText().trim());
		soma += Integer.parseInt(view.getTrataJFT().getText().trim());
		soma += Integer.parseInt(view.getTrata2JFT().getText().trim());
		return soma;
	}

	private void fluxoErroControleBaia() {
		view.getControleBaiaJFT().setEnabled(false);
		view.getBaiaJFT().setEnabled(true);
		view.getBaiaJFT().grabFocus();
		view.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
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
	public void focusLost(FocusEvent arg0) {
	}
}