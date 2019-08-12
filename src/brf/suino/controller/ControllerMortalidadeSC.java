package brf.suino.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import brf.suino.model.bo.MortalidadeBOSC;
import brf.suino.model.vo.MortalidadeVOSC;
import brf.suino.model.vo.MortoVOSC;
import brf.suino.view.ViewMortalidadeSC;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerMortalidadeSC extends KeyAdapter implements FocusListener {
	private ControllerSC controller;
	private ViewMortalidadeSC view;
	private List<MortoVOSC> mortosHist, mortosErros;
	private List<Component> order, orderLoadHist;
	private List<String> datasFases;
	private int ordem;
	private MortalidadeBOSC bo;

	public ControllerMortalidadeSC(ControllerSC c) {
		this.controller = c;
		mortosHist = new ArrayList<>();
		bo = new MortalidadeBOSC(c);

		if (controller.getModel().getExperimentoVO().getMortalidade() != null
				&& controller.getModel().getExperimentoVO().getMortalidade().size() > 0) {
			if (controller.getModel().getExperimentoVO().getMortalidade()
					.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos().size() > 0) {
				mortosHist = controller.getModel().getExperimentoVO().getMortalidade()
						.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos();
				ordem = controller.getModel().getExperimentoVO().getMortalidade()
						.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos()
						.get(controller.getModel().getExperimentoVO().getMortalidade()
								.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos().size() - 1)
						.getOrdem() + 1;
			} else {
				ordem = 1;
			}
		}
	}

	public void openWindow(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2, List<String> datasFases) {
		this.datasFases = datasFases;
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
		view.getOrdemJFT().setText(String.valueOf(ordem));
		view.getBrincoJFT().setText("0000");
		view.getPesoJFT().setText("000000");
		view.getFaseJFT().setText("0");
		view.getCausaJFT().setText("00");
		view.getControleJFT().setText("000000");
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();
	}

	private void criarOrdemComponentesHist() {
		orderLoadHist = new ArrayList<>();
		orderLoadHist.add(view.getCausaHist5Label());
		orderLoadHist.add(view.getFaseHist5Label());
		orderLoadHist.add(view.getPesoHist5Label());
		orderLoadHist.add(view.getBrincoHist5Label());
		orderLoadHist.add(view.getDataHist5Label());
		orderLoadHist.add(view.getCausaHist4Label());
		orderLoadHist.add(view.getFaseHist4Label());
		orderLoadHist.add(view.getPesoHist4Label());
		orderLoadHist.add(view.getBrincoHist4Label());
		orderLoadHist.add(view.getDataHist4Label());
		orderLoadHist.add(view.getCausaHist3Label());
		orderLoadHist.add(view.getFaseHist3Label());
		orderLoadHist.add(view.getPesoHist3Label());
		orderLoadHist.add(view.getBrincoHist3Label());
		orderLoadHist.add(view.getDataHist3Label());
		orderLoadHist.add(view.getCausaHist2Label());
		orderLoadHist.add(view.getFaseHist2Label());
		orderLoadHist.add(view.getPesoHist2Label());
		orderLoadHist.add(view.getBrincoHist2Label());
		orderLoadHist.add(view.getDataHist2Label());
		orderLoadHist.add(view.getCausaHist1Label());
		orderLoadHist.add(view.getFaseHist1Label());
		orderLoadHist.add(view.getPesoHist1Label());
		orderLoadHist.add(view.getBrincoHist1Label());
		orderLoadHist.add(view.getDataHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getBrincoJFT());
		order.add(view.getPesoJFT());
		order.add(view.getFaseJFT());
		order.add(view.getCausaJFT());

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
		if (mortosHist != null && mortosHist.size() > 0) {
			for (int k = 1; k <= 5; k++) {
				JLabel lbl1 = (JLabel) orderLoadHist.get(0);
				lbl1.setText(String.valueOf(mortosHist.get(mortosHist.size() - k)));
				orderLoadHist.remove(0);

				JLabel lbl2 = (JLabel) orderLoadHist.get(0);
				lbl2.setText(String.valueOf(mortosHist.get(mortosHist.size() - k)));
				orderLoadHist.remove(0);

				JLabel lbl3 = (JLabel) orderLoadHist.get(0);
				lbl3.setText(String.valueOf(mortosHist.get(mortosHist.size() - k)));
				orderLoadHist.remove(0);

				JLabel lbl4 = (JLabel) orderLoadHist.get(0);
				lbl4.setText(String.valueOf(mortosHist.get(mortosHist.size() - k)));
				orderLoadHist.remove(0);

				JLabel lbl5 = (JLabel) orderLoadHist.get(0);
				lbl5.setText(String.valueOf(mortosHist.get(mortosHist.size() - k)));
				orderLoadHist.remove(0);
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
				ControllerEscolhaDigSC controllerEscolhaDigSC = new ControllerEscolhaDigSC(controller);
				controllerEscolhaDigSC.openWindow(datasFases);
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
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				TextFormatter.formatStringJFT(src, text, 8);
				String msg = bo.verificaData(view.getDataJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					view.getBrincoJFT().setEnabled(true);
					view.getBrincoJFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getBrincoJFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				view.getPesoJFT().setEnabled(true);
				view.getPesoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getPesoJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				view.getFaseJFT().setEnabled(true);
				view.getFaseJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getFaseJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				view.getCausaJFT().setEnabled(true);
				view.getCausaJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCausaJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (view.getDataJFT().getText().equals("00/00/00") && view.getBrincoJFT().getText().equals("")
						&& view.getPesoJFT().getText().equals("") && view.getFaseJFT().getText().equals("")
						&& view.getCausaJFT().getText().equals("")) {
					view.getControleJFT().setEnabled(false);
					view.getOpcaoJFT().setEnabled(true);
					view.getOpcaoJFT().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleJFT().getText()) == calculaControleJFT()) {
						controller.getModel().getExperimentoVO().getMortalidade()
								.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos()
								.add(new MortoVOSC(Integer.parseInt(view.getOrdemJFT().getText()), view.getDataJFT().getText(),
										Integer.parseInt(view.getPesoJFT().getText()), Integer.parseInt(view.getFaseJFT().getText()),
										Integer.parseInt(view.getCausaJFT().getText())));
						view.getOpcaoJFT().setEnabled(true);
						view.getOpcaoJFT().grabFocus();
						updateHist();
					} else {
						fluxoErroControle();
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

		view.getCausaHist1Label().setText(String.valueOf(view.getCausaHist1Label().getText()));
		view.getCausaHist2Label().setText(String.valueOf(view.getCausaHist2Label().getText()));
		view.getCausaHist3Label().setText(String.valueOf(view.getCausaHist3Label().getText()));
		view.getCausaHist4Label().setText(String.valueOf(view.getCausaHist4Label().getText()));
		view.getCausaHist5Label().setText(String.valueOf(view.getCausaJFT().getText()));

		view.getDataJFT().setText("00/00/00");
		view.getBrincoJFT().setText("0000");
		view.getPesoJFT().setText("000000");
		view.getFaseJFT().setText("0");
		view.getCausaJFT().setText("00");

	}

	private void fluxoErroControle() {
		view.getControleJFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private Integer calculaControleJFT() {
		int soma = 0;
		String[] split = view.getDataJFT().getText().split("/");
		soma += Integer.parseInt(split[0]);
		soma += Integer.parseInt(split[1]);
		soma += Integer.parseInt(split[2]);
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