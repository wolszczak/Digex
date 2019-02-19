package brf.peru.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.view.ViewEscolhaAbateP;

public class ControllerEscolhaAbateP extends KeyAdapter {
	private final ControllerP controller;
	private ViewEscolhaAbateP viewEscolhaAbate;
	private List<Integer> idadesFases;

	public ControllerEscolhaAbateP(ControllerP c) {
		controller = c;
	}

	public void openWindow(List<Integer> idades) {
		viewEscolhaAbate = new ViewEscolhaAbateP();
		viewEscolhaAbate.setTitle("DIGEX - Peru");
		viewEscolhaAbate.setResizable(false);
		viewEscolhaAbate.setLocationRelativeTo(null);
		viewEscolhaAbate.setVisible(true);
		viewEscolhaAbate.getOpcaoJFT().addKeyListener(this);

		if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 1) {
			viewEscolhaAbate.getAbate2Label().setForeground(Color.GRAY);
			viewEscolhaAbate.getAbate3Label().setForeground(Color.GRAY);
			viewEscolhaAbate.getQtdeAbate2Label().setVisible(false);
			viewEscolhaAbate.getQtdeAbate3Label().setVisible(false);
		} else if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 2) {
			viewEscolhaAbate.getAbate3Label().setForeground(Color.GRAY);
			viewEscolhaAbate.getQtdeAbate3Label().setVisible(false);
		}
		histSetup();
	}

	public void histSetup() {
		int obsAbate[] = { 0, 0, 0 };
		for (AbateVOP abate : controller.getModel().getExperimentoVO().getAbates()) {
			for (BaiaAmostradosVOP baiaAmostrado : abate.getBaiaAmostrados()) {
				if (abate.getAbate() == 1) {
					obsAbate[0]++;
				} else if (abate.getAbate() == 2) {
					obsAbate[1]++;
				} else {
					obsAbate[2]++;
				}
			}
		}

		viewEscolhaAbate.getQtdeAbate1Label().setText(obsAbate[0] + " registro(s)");
		viewEscolhaAbate.getQtdeAbate2Label().setText(obsAbate[1] + " registro(s)");
		viewEscolhaAbate.getQtdeAbate3Label().setText(obsAbate[2] + " registro(s)");
	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaAbate.setLocationRelativeTo(null);
		viewEscolhaAbate.setVisible(true);
		viewEscolhaAbate.getOpcaoJFT().setText("");
		viewEscolhaAbate.getOpcaoJFT().grabFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(viewEscolhaAbate, "Deseja realmente sair do programa?",
					"DIGEX - Sair", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_1:
			viewEscolhaAbate.setVisible(false);
			controller.startEscolhaDigRend(1,0,
					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(0));
			System.out.println("Abate 1");
			if(controller.getModel().getExperimentoVO().getAbates() == null) {
				controller.getModel().getExperimentoVO().getAbates().add(new AbateVOP());
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(1);
			}else {
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(1);
			}
			break;
		case KeyEvent.VK_2:
			viewEscolhaAbate.setVisible(false);
			controller.startEscolhaDigRend(2,0,
					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(1));
			if(controller.getModel().getExperimentoVO().getAbates() == null) {
				controller.getModel().getExperimentoVO().getAbates().add(new AbateVOP());
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(2);
			}else {
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(2);
			}
			System.out.println("Abate 2");
			break;
		case KeyEvent.VK_3:
			viewEscolhaAbate.setVisible(false);
			controller.startEscolhaDigRend(3,0,
					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(2));
			if(controller.getModel().getExperimentoVO().getAbates() == null) {
				controller.getModel().getExperimentoVO().getAbates().add(new AbateVOP());
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(3);
			}else {
				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(3);
			}
			System.out.println("Abate 3");
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(viewEscolhaAbate, "Deseja realmente voltar para tela anterior?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewEscolhaAbate.setVisible(false);
				controller.resumeEscolhaDig();
				System.out.println("Voltar");
			}
			break;
		default:
			System.out.println("Opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}
	}
}
