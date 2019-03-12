package brf.peru.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;

import brf.peru.model.vo.ConeVOP;
import brf.peru.view.ViewEscolhaConeP;

public class ControllerEscolhaConeP extends KeyAdapter {
	private final ControllerP controller;
	private ViewEscolhaConeP viewEscolhaCone;
	private String escolha;
	private int abate, idadeAbate, camara;
	private String aviario, dataAbate;

	public ControllerEscolhaConeP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate, Integer camara) {
		viewEscolhaCone = new ViewEscolhaConeP();
		viewEscolhaCone.setTitle("DIGEX - Peru");
		viewEscolhaCone.setResizable(false);
		viewEscolhaCone.setLocationRelativeTo(null);
		viewEscolhaCone.setVisible(true);
		viewEscolhaCone.getOpcaoJFT().addKeyListener(this);

		this.abate = abate;
		this.idadeAbate = idadeAbate;
		this.camara = camara;
		this.aviario = aviario;
		this.dataAbate = dataAbate;

		if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 1) {
			viewEscolhaCone.getAbate2Label().setForeground(Color.GRAY);
			viewEscolhaCone.getQtdeAbate2Label().setVisible(false);
		}
		histSetup();
	}

	public void histSetup() {
		int obsCone[] = { 0, 0 };
		if (!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().isEmpty()) {
			for (ConeVOP c : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones()) {
				if (c.getAbate() == abate && c.getCamara() == 1) {
					obsCone[0]++;
				} else {
					obsCone[1]++;
				}
			}
			viewEscolhaCone.getQtdeAbate1Label().setText(obsCone[0] + " registro(s)");
			viewEscolhaCone.getQtdeAbate2Label().setText(obsCone[1] + " registro(s)");
		} else {
			viewEscolhaCone.getQtdeAbate1Label().setText(obsCone[0] + " registro(s)");
			viewEscolhaCone.getQtdeAbate2Label().setText(obsCone[1] + " registro(s)");
		}
	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaCone.setLocationRelativeTo(null);
		viewEscolhaCone.setVisible(true);
		viewEscolhaCone.getOpcaoJFT().setText("");
		viewEscolhaCone.getOpcaoJFT().grabFocus();
	}
}
