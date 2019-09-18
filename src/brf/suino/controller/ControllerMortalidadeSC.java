package brf.suino.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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

import brf.suino.model.bo.MortalidadeBOSC;
import brf.suino.model.vo.MortalidadeVOSC;
import brf.suino.view.ViewMortalidadeSC;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerMortalidadeSC extends KeyAdapter implements FocusListener {
	private ControllerSC controller;
	private ViewMortalidadeSC view;
	private List<MortalidadeVOSC> mortosHist, mortosErros;
	private List<Component> order, orderLoadHist;
	private List<String> datasFases;
	private int ordem, galpao, baia, sexo, trata, trata2;
	private MortalidadeBOSC bo;
	private Border defaultBorder;

	public ControllerMortalidadeSC(ControllerSC c) {
		this.controller = c;
		bo = new MortalidadeBOSC(c);
	}

	public void openWindow(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2, List<String> datasFases) {
		this.datasFases = datasFases;
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trata = trata;
		this.trata2 = trata2;
		view = new ViewMortalidadeSC();
		view.setTitle("DIGEX - Mortalidade Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getGalpaoJFT().setText(String.valueOf(galpao));
		view.getBaiaJFT().setText(String.valueOf(baia));
		view.getSexoJFT().setText(String.valueOf(sexo));
		view.getTrataJFT().setText(String.valueOf(trata));
		view.getTrata2JFT().setText(String.valueOf(trata2));
		view.getBrincoJFT().setText("0000");
		view.getPesoJFT().setText("000000");
		view.getFaseJFT().setText("0");
		view.getCausaJFT().setText("00");
		view.getControleJFT().setText("000000");
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
		view.getRegistrosLabel().setVisible(false);
		view.getOpcaoJFT().addKeyListener(this);
		defaultBorder = view.getPnlMortalidade().getBorder();
		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();
		view.pack();
	}

	private void criarOrdemComponentesHist() {
		orderLoadHist = new ArrayList<>();
		orderLoadHist.add(view.getCausaHist5Label());
		orderLoadHist.add(view.getFaseHist5Label());
		orderLoadHist.add(view.getPesoHist5Label());
		orderLoadHist.add(view.getBrincoHist5Label());
		orderLoadHist.add(view.getDataHist5Label());
		orderLoadHist.add(view.getOrdemHist5Label());
		orderLoadHist.add(view.getCausaHist4Label());
		orderLoadHist.add(view.getFaseHist4Label());
		orderLoadHist.add(view.getPesoHist4Label());
		orderLoadHist.add(view.getBrincoHist4Label());
		orderLoadHist.add(view.getDataHist4Label());
		orderLoadHist.add(view.getOrdemHist4Label());
		orderLoadHist.add(view.getCausaHist3Label());
		orderLoadHist.add(view.getFaseHist3Label());
		orderLoadHist.add(view.getPesoHist3Label());
		orderLoadHist.add(view.getBrincoHist3Label());
		orderLoadHist.add(view.getDataHist3Label());
		orderLoadHist.add(view.getOrdemHist3Label());
		orderLoadHist.add(view.getCausaHist2Label());
		orderLoadHist.add(view.getFaseHist2Label());
		orderLoadHist.add(view.getPesoHist2Label());
		orderLoadHist.add(view.getBrincoHist2Label());
		orderLoadHist.add(view.getDataHist2Label());
		orderLoadHist.add(view.getOrdemHist2Label());
		orderLoadHist.add(view.getCausaHist1Label());
		orderLoadHist.add(view.getFaseHist1Label());
		orderLoadHist.add(view.getPesoHist1Label());
		orderLoadHist.add(view.getBrincoHist1Label());
		orderLoadHist.add(view.getDataHist1Label());
		orderLoadHist.add(view.getOrdemHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getBrincoJFT());
		order.add(view.getPesoJFT());
		order.add(view.getFaseJFT());
		order.add(view.getCausaJFT());
		order.add(view.getControleJFT());

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
			if (controller.getModel().getExperimentoVO().getMortalidade()
					.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getBaia() == baia) {
				mortosHist = new ArrayList<>();
				for (MortalidadeVOSC m : controller.getModel().getExperimentoVO().getMortalidade()) {
					if (m.getBaia() == baia) {
						mortosHist.add(m);
					}
				}
				ordem = mortosHist.get(mortosHist.size() - 1).getOrdem() + 1;
			} else {
				ordem = 1;
			}
		} else {
			ordem = 1;
		}

		view.getOrdemJFT().setText(String.valueOf(ordem));
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);

		if (mortosHist != null) {
			for (int k = 0; k < 5; k++) {
				if (mortosHist != null && mortosHist.size() > 0) {
					JLabel lbl1 = (JLabel) orderLoadHist.get(0);
					lbl1.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getCausa()));
					orderLoadHist.remove(0);

					JLabel lbl2 = (JLabel) orderLoadHist.get(0);
					lbl2.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getFase()));
					orderLoadHist.remove(0);

					JLabel lbl3 = (JLabel) orderLoadHist.get(0);
					lbl3.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getPeso()));
					orderLoadHist.remove(0);

					JLabel lbl4 = (JLabel) orderLoadHist.get(0);
					lbl4.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getBrinco()));
					orderLoadHist.remove(0);

					JLabel lbl5 = (JLabel) orderLoadHist.get(0);
					lbl5.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getData()));
					orderLoadHist.remove(0);

					JLabel lbl6 = (JLabel) orderLoadHist.get(0);
					lbl6.setText(String.valueOf(mortosHist.get(mortosHist.size() - 1).getOrdem()));
					TextFormatter.formatStringOrdem(lbl6, lbl6.getText(), 3);

					orderLoadHist.remove(0);
					mortosHist.remove(mortosHist.size() - 1);
				}

			}
		}
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
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaTipoDigSC controllerEscolhaTipoDigSC = new ControllerEscolhaTipoDigSC(controller);
				controllerEscolhaTipoDigSC.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
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
				ControllerMedicadosSC medicados = new ControllerMedicadosSC(controller);
				medicados.openWindow(galpao, baia, sexo, trata, trata2, datasFases);
				break;
			case KeyEvent.VK_2:
				view.setVisible(false);
				ControllerConsumoSC consumo = new ControllerConsumoSC(controller);
				consumo.openWindow(datasFases);
				break;
			case KeyEvent.VK_9:
				view.setVisible(false);
				ControllerEscolhaTipoDigSC controllerEscolha = new ControllerEscolhaTipoDigSC(controller);
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
			if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, text, 8);
				String msg = bo.verificaData(view.getDataJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					view.getDataJFT().setEnabled(false);
					view.getBrincoJFT().setEnabled(true);
					view.getBrincoJFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getBrincoJFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				view.getBrincoJFT().setEnabled(false);
				view.getPesoJFT().setEnabled(true);
				view.getPesoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPesoJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				view.getPesoJFT().setEnabled(false);
				view.getFaseJFT().setEnabled(true);
				view.getFaseJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFaseJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				view.getFaseJFT().setEnabled(false);
				view.getCausaJFT().setEnabled(true);
				view.getCausaJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCausaJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				view.getCausaJFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (view.getDataJFT().getText().equals("00/00/00") && view.getBrincoJFT().getText().equals("0000")
						&& view.getPesoJFT().getText().equals("000000") && view.getFaseJFT().getText().equals("0")
						&& view.getCausaJFT().getText().equals("00")) {
					view.getControleJFT().setEnabled(false);
					view.getOpcaoJFT().setEnabled(true);
					view.getOpcaoJFT().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleJFT().getText()) == calculaControleJFT()) {
						controller.getModel().getExperimentoVO().getMortalidade()
								.add(new MortalidadeVOSC(Integer.parseInt(view.getGalpaoJFT().getText().trim()),
										Integer.parseInt(view.getBaiaJFT().getText().trim()),
										Integer.parseInt(view.getSexoJFT().getText().trim()),
										Integer.parseInt(view.getTrataJFT().getText().trim()),
										Integer.parseInt(view.getTrata2JFT().getText().trim()),
										Integer.parseInt(view.getOrdemJFT().getText().trim()), view.getDataJFT().getText().trim(),
										Integer.parseInt(view.getPesoJFT().getText().trim()),
										Integer.parseInt(view.getBrincoJFT().getText().trim()),
										Integer.parseInt(view.getFaseJFT().getText().trim()),
										Integer.parseInt(view.getCausaJFT().getText().trim())));
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getDataJFT().setEnabled(true);
						view.getDataJFT().grabFocus();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
						updateHist();
						ordem++;
						view.getOrdemJFT().setText(String.valueOf(ordem));
						view.getRegistrosLabel().setVisible(true);
						view.getPnlMortalidade().setBorder(defaultBorder);
					} else {
						fluxoErroControle();
						view.getPnlMortalidade().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				}

			}
		}
	}

	private void updateHist() {
		view.getOrdemHist1Label().setText(String.valueOf(view.getOrdemHist2Label().getText()));
		view.getOrdemHist2Label().setText(String.valueOf(view.getOrdemHist3Label().getText()));
		view.getOrdemHist3Label().setText(String.valueOf(view.getOrdemHist4Label().getText()));
		view.getOrdemHist4Label().setText(String.valueOf(view.getOrdemHist5Label().getText()));
		view.getOrdemHist5Label().setText(String.valueOf(view.getOrdemJFT().getText()));

		view.getDataHist1Label().setText(String.valueOf(view.getDataHist2Label().getText()));
		view.getDataHist2Label().setText(String.valueOf(view.getDataHist3Label().getText()));
		view.getDataHist3Label().setText(String.valueOf(view.getDataHist4Label().getText()));
		view.getDataHist4Label().setText(String.valueOf(view.getDataHist5Label().getText()));
		view.getDataHist5Label().setText(String.valueOf(view.getDataJFT().getText()));

		view.getBrincoHist1Label().setText(String.valueOf(view.getBrincoHist2Label().getText()));
		view.getBrincoHist2Label().setText(String.valueOf(view.getBrincoHist3Label().getText()));
		view.getBrincoHist3Label().setText(String.valueOf(view.getBrincoHist4Label().getText()));
		view.getBrincoHist4Label().setText(String.valueOf(view.getBrincoHist5Label().getText()));
		view.getBrincoHist5Label().setText(String.valueOf(view.getBrincoJFT().getText()));

		view.getPesoHist1Label().setText(String.valueOf(view.getPesoHist2Label().getText()));
		view.getPesoHist2Label().setText(String.valueOf(view.getPesoHist3Label().getText()));
		view.getPesoHist3Label().setText(String.valueOf(view.getPesoHist4Label().getText()));
		view.getPesoHist4Label().setText(String.valueOf(view.getPesoHist5Label().getText()));
		view.getPesoHist5Label().setText(String.valueOf(view.getPesoJFT().getText()));

		view.getFaseHist1Label().setText(String.valueOf(view.getFaseHist2Label().getText()));
		view.getFaseHist2Label().setText(String.valueOf(view.getFaseHist3Label().getText()));
		view.getFaseHist3Label().setText(String.valueOf(view.getFaseHist4Label().getText()));
		view.getFaseHist4Label().setText(String.valueOf(view.getFaseHist5Label().getText()));
		view.getFaseHist5Label().setText(String.valueOf(view.getFaseJFT().getText()));

		view.getCausaHist1Label().setText(String.valueOf(view.getCausaHist2Label().getText()));
		view.getCausaHist2Label().setText(String.valueOf(view.getCausaHist3Label().getText()));
		view.getCausaHist3Label().setText(String.valueOf(view.getCausaHist4Label().getText()));
		view.getCausaHist4Label().setText(String.valueOf(view.getCausaHist5Label().getText()));
		view.getCausaHist5Label().setText(String.valueOf(view.getCausaJFT().getText()));

		view.getDataJFT().setText("00/00/00");
		view.getBrincoJFT().setText("0000");
		view.getPesoJFT().setText("000000");
		view.getFaseJFT().setText("0");
		view.getCausaJFT().setText("00");
		view.getControleJFT().setText("000000");

		view.getBrincoJFT().setEnabled(false);
		view.getPesoJFT().setEnabled(false);
		view.getFaseJFT().setEnabled(false);
		view.getCausaJFT().setEnabled(false);
		view.getControleJFT().setEnabled(false);
		view.pack();
	}

	private void fluxoErroControle() {
		view.getControleJFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private Integer calculaControleJFT() {
		int soma = 0;
		String[] split = view.getDataJFT().getText().split("/");
//		soma += Integer.parseInt(split[0]);
//		soma += Integer.parseInt(split[1]);
//		soma += Integer.parseInt(split[2]);
		soma += Integer.parseInt(split[0] + split[1] + split[2]);
		soma += Integer.parseInt(view.getBrincoJFT().getText());
		soma += Integer.parseInt(view.getPesoJFT().getText());
		soma += Integer.parseInt(view.getFaseJFT().getText());
		soma += Integer.parseInt(view.getCausaJFT().getText());
		return soma;
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