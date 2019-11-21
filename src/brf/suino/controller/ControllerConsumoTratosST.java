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
import brf.suino.view.ViewConsumoTratosST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConsumoTratosST extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerST controller;
//	private ViewConsumoLivreST viewLivre;
	private ViewConsumoTratosST view;
	private ConsumoLivreVOST consumoHist;
	private ConsumoBOST consumoBO;
	private BaiaVOST ultimaBaia;
	private List<RmeLivreVOST> consumosErros;
	private int ordem;
	private List<String> datasFases;
	private List<Component> order, orderHist;
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

		criarOrdemComponentes();
//		criarOrdemComponentesHist();

//		loadHist();

		view.pack();
	}

	private void loadHist() {
		if (ultimaBaia.getConsumos() != null) {
			if (!ultimaBaia.getConsumos().isFinalizado()) {
				consumoHist = controller.getModel().getExperimentoVO().getBaias()
						.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos();
//				viewLivre.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()));
//				viewLivre.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()));
//				viewLivre.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()));
//				viewLivre.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()));
//				viewLivre.getTrata3JFT().setText(String.valueOf(consumoHist.getTrat3()));
				carregaRacao();
			} else {
				consumoHist = controller.getModel().getExperimentoVO().getBaias()
						.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos();
//				viewLivre.getBaiaJFT().setText(String.valueOf(consumoHist.getBaia()));
//				viewLivre.getSexoJFT().setText(String.valueOf(consumoHist.getSexo()));
//				viewLivre.getTrataJFT().setText(String.valueOf(consumoHist.getTrat1()));
//				viewLivre.getTrata2JFT().setText(String.valueOf(consumoHist.getTrat2()));
//				viewLivre.getTrata3JFT().setText(String.valueOf(consumoHist.getTrat3()));
				carregaRacao();
//				viewLivre.getDataJFT().setEnabled(false);
//				viewLivre.getFornecidaJFT().setEnabled(false);
//				viewLivre.getSobraJFT().setEnabled(false);
//				viewLivre.getControleFornecidaJFT().setEnabled(false);
//				viewLivre.getControleSobraJFT().setEnabled(false);
//				viewLivre.getOpcaoJFT().setEnabled(true);
//				viewLivre.getOpcaoJFT().grabFocus();
			}
		}
	}

	public void carregaRacao() {
		if (ultimaBaia.getConsumos().getRme().size() > 5) {
			for (int k = 1; k <= 5; k++) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getSobra()).trim());
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getFornecida()).trim());
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getDataRacao()).trim());
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(consumoHist.getRme().get(consumoHist.getRme().size() - k).getOrdem()).trim());
				orderHist.remove(0);
			}
//			criarOrdemComponentesHist();
		} else {
			for (int z = consumoHist.getRme().size(); z > 0; z--) {
				JLabel lbl1 = (JLabel) orderHist.get(0);
				lbl1.setText(String.valueOf(consumoHist.getRme().get(z - 1).getSobra()).trim());
				orderHist.remove(0);
				JLabel lbl2 = (JLabel) orderHist.get(0);
				lbl2.setText(String.valueOf(consumoHist.getRme().get(z - 1).getFornecida()).trim());
				orderHist.remove(0);
				JLabel lbl3 = (JLabel) orderHist.get(0);
				lbl3.setText(String.valueOf(consumoHist.getRme().get(z - 1).getDataRacao()).trim());
				orderHist.remove(0);
				JLabel lbl4 = (JLabel) orderHist.get(0);
				lbl4.setText(String.valueOf(consumoHist.getRme().get(z - 1).getOrdem()).trim());
				orderHist.remove(0);
			}
//			criarOrdemComponentesHist();
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
				String msg = consumoBO.verificaData(view.getDataJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					view.getDataJFT().setEnabled(false);
					view.getTratosJFT().setEnabled(true);
					view.getTratosJFT().requestFocus();
				}
			} else if (e.getSource() == view.getTratosJFT()) {
				TextFormatter.formatStringJFT(src, view.getDataJFT().getText(), 1);
				view.getTratosJFT().setEnabled(false);
				view.getBaiaJFT().setEnabled(true);
				view.getBaiaJFT().grabFocus();
			} else if (e.getSource() == view.getBaiaJFT()) {

			} else if (e.getSource() == view.getConsumoJFT()) {

			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
//		if ((JFormattedTextField) e.getSource() == viewLivre.getOpcaoJFT()) {
//			switch (e.getKeyChar()) {
//			case KeyEvent.VK_0:
//				int n = JOptionPane.showConfirmDialog(viewLivre, "Deseja realmente sair do programa?", "DIGEX - Sair",
//						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//				if (n == 0) {
//					System.out.println("Fim...");
//					System.exit(0);
//				}
//				break;
//			case KeyEvent.VK_1:
//				viewLivre.setVisible(false);
//				controller.startMortalidadeST(Integer.parseInt(viewLivre.getGalpaoJFT().getText().trim()),
//						Integer.parseInt(viewLivre.getBaiaJFT().getText().trim()),
//						Integer.parseInt(viewLivre.getSexoJFT().getText().trim()),
//						Integer.parseInt(viewLivre.getTrataJFT().getText().trim()),
//						Integer.parseInt(viewLivre.getTrata2JFT().getText().trim()), datasFases);
//				break;
//			case KeyEvent.VK_2:
//				if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
//						.getMedicados() == null
//						&& controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getMortalidades() == null
//						&& controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos() == null) {
//					int option = JOptionPane.showConfirmDialog(viewLivre,
//							"Nenhum dado foi digitado para essa baia.\nDeseja realmente finalizá-la?", "DIGEX - Aviso",
//							JOptionPane.WARNING_MESSAGE);
//					if (option == 0) {
//						viewLivre.setVisible(false);
//						controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().setFinalizado(true);
//						controller.getModel().getExperimentoVO().getBaias()
//								.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).setFinalizado(true);
//						controller.getModel().getModelStateDAO().saveModelState(false);
//						ControllerMortalidadeST cont = new ControllerMortalidadeST(controller);
//						cont.openWindow(datasFases);
//					} else {
//						viewLivre.getOpcaoJFT().grabFocus();
//					}
//				} else {
//					viewLivre.setVisible(false);
//					controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
//							.getConsumos().setFinalizado(true);
//					controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
//							.setFinalizado(true);
//					controller.getModel().getModelStateDAO().saveModelState(false);
//					ControllerMortalidadeST cont = new ControllerMortalidadeST(controller);
//					cont.openWindow(datasFases);
//				}
//				break;
//			case KeyEvent.VK_3:
////				view.setVisible(false);
////				openWindow(Integer.parseInt(view.getGalpaoJFT().getText()), Integer.parseInt(view.getBaiaJFT().getText()),
////						Integer.parseInt(view.getSexoJFT().getText()), Integer.parseInt(view.getTrataJFT().getText()),
////						Integer.parseInt(view.getTrata2JFT().getText()), datasFases);
//				break;
//			case KeyEvent.VK_4:
////				view.setVisible(false);
////				ControllerEscolhaDigSC escolhaDigSC = new ControllerEscolhaDigSC(controller);
////				escolhaDigSC.openWindow(datasFases);
//				break;
//			}
//		}
//		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewLivre.getOpcaoJFT())
//				&& !e.getSource().equals(viewLivre.getDataJFT()) && !e.getSource().equals(viewLivre.getControleFornecidaJFT())
//				&& !e.getSource().equals(viewLivre.getControleSobraJFT()) && !e.getSource().equals(viewLivre.getBaiaJFT())) {
//			System.out.println("left");
//			Component prev = viewLivre.getFocusTraversalPolicy().getComponentBefore(viewLivre, (JFormattedTextField) src);
//			((JFormattedTextField) src).setEnabled(false);
//			prev.setEnabled(true);
//			((JFormattedTextField) prev).grabFocus();
//		}

	}

//	public void updateHistRME() {
//		viewLivre.getOrdemHist1Label().setText(viewLivre.getOrdemHist2Label().getText());
//		viewLivre.getOrdemHist2Label().setText(viewLivre.getOrdemHist3Label().getText());
//		viewLivre.getOrdemHist3Label().setText(viewLivre.getOrdemHist4Label().getText());
//		viewLivre.getOrdemHist4Label().setText(viewLivre.getOrdemHist5Label().getText());
//		viewLivre.getOrdemHist5Label().setText(viewLivre.getOrdemJFT().getText());
//		viewLivre.getDataHist1Label().setText(viewLivre.getDataHist2Label().getText());
//		viewLivre.getDataHist2Label().setText(viewLivre.getDataHist3Label().getText());
//		viewLivre.getDataHist3Label().setText(viewLivre.getDataHist4Label().getText());
//		viewLivre.getDataHist4Label().setText(viewLivre.getDataHist5Label().getText());
//		viewLivre.getDataHist5Label().setText(viewLivre.getDataJFT().getText());
//		viewLivre.getFornecidaHist1Label().setText(viewLivre.getFornecidaHist2Label().getText());
//		viewLivre.getFornecidaHist2Label().setText(viewLivre.getFornecidaHist3Label().getText());
//		viewLivre.getFornecidaHist3Label().setText(viewLivre.getFornecidaHist4Label().getText());
//		viewLivre.getFornecidaHist4Label().setText(viewLivre.getFornecidaHist5Label().getText());
//		viewLivre.getFornecidaHist5Label().setText(viewLivre.getFornecidaJFT().getText());
//		viewLivre.getSobraHist1Label().setText(viewLivre.getSobraHist2Label().getText());
//		viewLivre.getSobraHist2Label().setText(viewLivre.getSobraHist3Label().getText());
//		viewLivre.getSobraHist3Label().setText(viewLivre.getSobraHist4Label().getText());
//		viewLivre.getSobraHist4Label().setText(viewLivre.getSobraHist5Label().getText());
//		viewLivre.getSobraHist5Label().setText(viewLivre.getSobraJFT().getText());
//		if (!consumosErros.isEmpty()) {
//			recuperaHistConsumo();
//		} else {
//			viewLivre.getDataJFT().setText("00000000");
//			viewLivre.getFornecidaJFT().setText("00000");
//			viewLivre.getSobraJFT().setText("00000");
//			viewLivre.getSobraJFT().setEnabled(false);
//			viewLivre.getDataJFT().setEnabled(true);
//			viewLivre.getSobraJFT().transferFocus();
//			viewLivre.getDataJFT().grabFocus();
//			viewLivre.pack();
//		}
//	}

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
//		viewLivre.getOrdemJFT().setText("" + consumosErros.get(0).getOrdem());
//		TextFormatter.formatStringJFT(viewLivre.getOrdemJFT(), viewLivre.getOrdemJFT().getText(), 2);
//		viewLivre.getDataJFT().setText("" + consumosErros.get(0).getDataRacao());
//		TextFormatter.formatStringJFT(viewLivre.getDataJFT(), viewLivre.getDataJFT().getText(), 10);
//		viewLivre.getFornecidaJFT().setText("" + consumosErros.get(0).getFornecida());
//		TextFormatter.formatStringJFT(viewLivre.getFornecidaJFT(), viewLivre.getFornecidaJFT().getText(), 5);
//		viewLivre.getSobraJFT().setText("" + consumosErros.get(0).getSobra());
//		TextFormatter.formatStringJFT(viewLivre.getSobraJFT(), viewLivre.getSobraJFT().getText(), 5);
//		consumosErros.remove(0);
//		viewLivre.getSobraJFT().setEnabled(false);
//		viewLivre.getDataJFT().setEnabled(true);
//		viewLivre.getDataJFT().grabFocus();
//	}

	private Integer calculaControleRacaoFornecida() {
		int soma = 0;
		for (RmeLivreVOST consumo : controller.getModel().getExperimentoVO().getBaias()
				.get(controller.getModel().getExperimentoVO().getBaias().size() - 1).getConsumos().getRme()) {
			soma += consumo.getFornecida();
		}
		return soma;
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

//	private void criarOrdemComponentesHist() {
//		orderHist = new ArrayList<>();
//		orderHist.add(viewLivre.getSobraHist5Label());
//		orderHist.add(viewLivre.getFornecidaHist5Label());
//		orderHist.add(viewLivre.getDataHist5Label());
//		orderHist.add(viewLivre.getOrdemHist5Label());
//		orderHist.add(viewLivre.getSobraHist4Label());
//		orderHist.add(viewLivre.getFornecidaHist4Label());
//		orderHist.add(viewLivre.getDataHist4Label());
//		orderHist.add(viewLivre.getOrdemHist4Label());
//		orderHist.add(viewLivre.getSobraHist3Label());
//		orderHist.add(viewLivre.getFornecidaHist3Label());
//		orderHist.add(viewLivre.getDataHist3Label());
//		orderHist.add(viewLivre.getOrdemHist3Label());
//		orderHist.add(viewLivre.getSobraHist2Label());
//		orderHist.add(viewLivre.getFornecidaHist2Label());
//		orderHist.add(viewLivre.getDataHist2Label());
//		orderHist.add(viewLivre.getOrdemHist2Label());
//		orderHist.add(viewLivre.getSobraHist1Label());
//		orderHist.add(viewLivre.getFornecidaHist1Label());
//		orderHist.add(viewLivre.getDataHist1Label());
//		orderHist.add(viewLivre.getOrdemHist1Label());
//	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getTratosJFT());
		order.add(view.getBaiaJFT());
		order.add(view.getConsumoJFT());
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
