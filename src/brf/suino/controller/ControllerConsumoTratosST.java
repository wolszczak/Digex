package brf.suino.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.bo.ConsumoBOST;
import brf.suino.model.vo.ConsumoTratosVOST;
import brf.suino.model.vo.RmeTratosVOST;
import brf.suino.view.ViewConsumoTratosST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoTratosST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewConsumoTratosST view;
	private ConsumoBOST consumoBO;
	private ConsumoTratosVOST ultimoConsumo;
	private List<RmeTratosVOST> consumosErros;
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
		view = new ViewConsumoTratosST();
		view.setTitle("DIGEX - Consumo Tratos Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);

		if (!controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
			if (!controller.getModel().getExperimentoVO().getConsumosTratos()
					.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).isFinalizado()) {
				ultimoConsumo = new ConsumoTratosVOST();
				ultimoConsumo = controller.getModel().getExperimentoVO().getConsumosTratos()
						.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1);
			}
		}

		criarOrdemComponentes();
		criarOrdemComponentesHist();
		criarOrdemComponentesErros();

		loadHist();

		view.pack();
	}

	private void loadHist() {
		if (ultimoConsumo != null) {
			for (int z = 0; z < 10; z++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(ultimoConsumo.getConsumosTratos().get(ultimoConsumo.getConsumosTratos().size() - z).getOrdem())
						.trim());
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(ultimoConsumo.getConsumosTratos().get(ultimoConsumo.getConsumosTratos().size() - z).getOrdem())
						.trim());
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(ultimoConsumo.getConsumosTratos().get(ultimoConsumo.getConsumosTratos().size() - z).getOrdem())
						.trim());
				orderHist.remove(0);
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
				TextFormatter.formatStringJFT(src, view.getDataJFT().getText(), 10);
				view.getDataJFT().setEnabled(false);
				view.getTratosJFT().setEnabled(true);
				view.getTratosJFT().grabFocus();
			} else if (e.getSource() == view.getTratosJFT()) {
				TextFormatter.formatStringJFT(src, view.getTratosJFT().getText(), 1);
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
			} else if (e.getSource() == view.getBaiaJFT()) {
				TextFormatter.formatStringJFT(src, view.getBaiaJFT().getText(), 3);
				view.getBaiaJFT().setEnabled(false);
				view.getConsumoJFT().setEnabled(true);
				view.getConsumoJFT().grabFocus();
			} else if (e.getSource() == view.getConsumoJFT()) {
				TextFormatter.formatStringJFT(src, view.getConsumoJFT().getText(), 5);
				if (Integer.parseInt(view.getBaiaJFT().getText()) == 0 && Integer.parseInt(view.getConsumoJFT().getText()) == 0) {
					view.getConsumoJFT().setEnabled(false);
					view.getControleJFT().setEnabled(true);
					view.getControleJFT().grabFocus();
				} else {
					String msg = consumoBO.verificaConsumoTratos(Integer.parseInt(view.getBaiaJFT().getText()),
							Integer.parseInt(view.getConsumoJFT().getText()));
					if (msg != null) {
						view.getConsumoJFT().setEnabled(false);
						view.getControleJFT().setEnabled(true);
						view.getControleJFT().grabFocus();
					} else {

						JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						view.getConsumoJFT().grabFocus();
					}
				}
			} else if (e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(src, view.getBaiaJFT().getText(), 6);
				view.getControleJFT().setEnabled(false);
				if (Integer.parseInt(view.getConsumoJFT().getText()) == 0) {
					if (Integer.parseInt(view.getBaiaJFT().getText()) == 0 && Integer.parseInt(view.getConsumoJFT().getText()) == 0) {
						view.getOpcaoJFT().setEnabled(true);
						view.getOpcaoJFT().grabFocus();
					} else if (Integer.parseInt(view.getControleJFT().getText()) == calculaControleConsumo()) {
						if (controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
//							controller.getModel().getExperimentoVO().getConsumosTratos().add(new ConsumoTratosVOST(
//									view.getDataJFT().getText(), Integer.parseInt(view.getTratosJFT().getText()), false));
							controller.getModel().getModelStateDAO().saveModelState(false);
						} else {
							controller.getModel().getExperimentoVO().getConsumosTratos()
									.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getConsumosTratos()
									.add(new RmeTratosVOST(ordem, Integer.parseInt(view.getBaiaJFT().getText()),
											Integer.parseInt(view.getConsumoJFT().getText())));
							controller.getModel().getModelStateDAO().saveModelState(false);
						}
					} else {
						fluxoErroControle();
					}
				} else {
					view.getOpcaoJFT().setEnabled(true);
					view.getOpcaoJFT().grabFocus();
				}
			}
		}
	}

	private void fluxoErroControle() {
		view.getBaiaJFT().setEnabled(false);
		view.getConsumoJFT().setEnabled(false);
		view.getControleJFT().setEnabled(false);
		view.getConsumoJFT().grabFocus();

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

		
		
		
		

//		consumosErros.addAll(controller.getModel().getExperimentoVO().getConsumosTratos()
//				.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getConsumosTratos());
		controller.getModel().getExperimentoVO().getConsumosTratos()
				.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).setConsumosTratos(new ArrayList<>());
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private int calculaControleConsumo() {
		int soma = 0;
		for (RmeTratosVOST consumo : controller.getModel().getExperimentoVO().getConsumosTratos()
				.get(controller.getModel().getExperimentoVO().getConsumosTratos().size() - 1).getConsumosTratos()) {
			soma += consumo.getBaia();
			soma += consumo.getConsumo();
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
				limparTela();
				view.getOpcaoJFT().setText("");
				view.getOpcaoJFT().setEnabled(false);
				view.getBaiaJFT().setEnabled(true);
				view.getBaiaJFT().grabFocus();
				break;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getOpcaoJFT()) && !e.getSource().equals(view.getBaiaJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}

	}

	private void limparTela() {
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
		view.getControleJFT().setText("");
	}

	public void updateHist() {
		view.getOrdem1Label().setText(view.getOrdem2Label().getText());
		view.getOrdem2Label().setText(view.getOrdem3Label().getText());
		view.getOrdem3Label().setText(view.getOrdem4Label().getText());
		view.getOrdem4Label().setText(view.getOrdem5Label().getText());
		view.getOrdem5Label().setText(view.getOrdem6Label().getText());
		view.getOrdem6Label().setText(view.getOrdem7Label().getText());
		view.getOrdem7Label().setText(view.getOrdem8Label().getText());
		view.getOrdem8Label().setText(view.getOrdem9Label().getText());
		view.getOrdem9Label().setText(view.getOrdem10Label().getText());
		view.getOrdem10Label().setText(view.getOrdemJFT().getText());
		view.getBaia1Label().setText(view.getBaia2Label().getText());
		view.getBaia2Label().setText(view.getBaia3Label().getText());
		view.getBaia3Label().setText(view.getBaia4Label().getText());
		view.getBaia4Label().setText(view.getBaia5Label().getText());
		view.getBaia5Label().setText(view.getBaia6Label().getText());
		view.getBaia6Label().setText(view.getBaia7Label().getText());
		view.getBaia7Label().setText(view.getBaia8Label().getText());
		view.getBaia8Label().setText(view.getBaia9Label().getText());
		view.getBaia9Label().setText(view.getBaia10Label().getText());
		view.getBaia10Label().setText(view.getBaiaJFT().getText());
		view.getConsumo1Label().setText(view.getConsumo2Label().getText());
		view.getConsumo2Label().setText(view.getConsumo3Label().getText());
		view.getConsumo3Label().setText(view.getConsumo4Label().getText());
		view.getConsumo4Label().setText(view.getConsumo5Label().getText());
		view.getConsumo5Label().setText(view.getConsumo6Label().getText());
		view.getConsumo6Label().setText(view.getConsumo7Label().getText());
		view.getConsumo7Label().setText(view.getConsumo8Label().getText());
		view.getConsumo8Label().setText(view.getConsumo9Label().getText());
		view.getConsumo9Label().setText(view.getConsumo10Label().getText());
		view.getConsumo10Label().setText(view.getConsumoJFT().getText());

		if (consumosErros != null) {
//			recuperaHistConsumo();
		} else {
			view.getOrdemJFT().setText(String.valueOf(++ordem));
			TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 3);
			view.getBaiaJFT().setText("");
			TextFormatter.formatStringJFT(view.getBaiaJFT(), view.getBaiaJFT().getText(), 3);
			view.getConsumoJFT().setText("");
			TextFormatter.formatStringJFT(view.getConsumoJFT(), view.getConsumoJFT().getText(), 5);

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

//	public void recuperaHistConsumo() {
//		
//		view.getOrdemJFT().setText("" + consumosErros.getConsumosTratos().getOrdem());
//		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 3);
//		view.getDataJFT().setText("" + consumosErros.get(0).getData());
//		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 3);
//		view.getOrdemJFT().setText("" + consumosErros.get(0).getOrdem());
//		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 3);
//
//		consumosErros.remove(0);
//		view.getSobraJFT().setEnabled(false);
//		view.getDataJFT().setEnabled(true);
//		view.getDataJFT().grabFocus();
//	}

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

	private void criarOrdemComponentesErros(){
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
		order.add(view.getControleJFT());
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
