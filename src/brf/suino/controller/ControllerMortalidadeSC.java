package brf.suino.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import brf.suino.model.vo.MortalidadeVOSC;
import brf.suino.model.vo.MortoVOSC;
import brf.suino.view.ViewMortalidadeSC;
import brf.util.FocusOrderPolicy;

public class ControllerMortalidadeSC extends KeyAdapter implements FocusListener {
	private ControllerSC controller;
	private ViewMortalidadeSC view;
	private List<MortoVOSC> mortosHist;
	private List<Component> order, orderLoadHist;
	private int ordem;

	public ControllerMortalidadeSC(ControllerSC c) {
		this.controller = c;
		mortosHist = new ArrayList<>();

		if (controller.getModel().getExperimentoVO().getMortalidade() != null && controller.getModel().getExperimentoVO().getMortalidade().size() > 0) {
			if (controller.getModel().getExperimentoVO().getMortalidade()
							.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos().size() > 0) {
				mortosHist = controller.getModel().getExperimentoVO().getMortalidade()
						.get(controller.getModel().getExperimentoVO().getMortalidade().size() - 1).getMortos();
			}
		}
	}

	public void openWindow(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2) {
		view = new ViewMortalidadeSC();
		view.setTitle("DIGEX - Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getGalpaoJFT().setText(String.valueOf(galpao));
		view.getBaiaJFT().setText(String.valueOf(baia));
		view.getSexoJFT().setText(String.valueOf(sexo));
		view.getTrataJFT().setText(String.valueOf(trata));
		view.getTrata2JFT().setText(String.valueOf(trata2));
		view.getOrdemJFT().setText(String.valueOf(ordem));
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
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public void focusLost(FocusEvent arg0) {
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyPressed(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyTyped(e);
	}
	
	
}