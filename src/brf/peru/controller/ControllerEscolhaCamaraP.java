package brf.peru.controller;

import brf.peru.model.vo.CamaraVOP;
import brf.peru.view.ViewEscolhaCamaraP;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaCamaraP extends KeyAdapter {

	private final ControllerP controller;
	private ViewEscolhaCamaraP viewEscolhaCamara;
	private String dataAbate, aviario;
	private int idadeAbate, abate;

	public ControllerEscolhaCamaraP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		viewEscolhaCamara = new ViewEscolhaCamaraP();
		viewEscolhaCamara.setTitle("DIGEX - Peru");
		viewEscolhaCamara.setResizable(false);
		viewEscolhaCamara.setLocationRelativeTo(null);
		viewEscolhaCamara.setVisible(true);
		viewEscolhaCamara.getOpcaoJFT().addKeyListener(this);

		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;

		histSetup();
	}

	public void histSetup() {
		int obsCamara[] = { 0, 0 };

		if(!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().isEmpty()) {
			for (CamaraVOP c : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras()) {
				if (c.getCamara() == 1 && c.getNasa() != 0) {
					obsCamara[0]++;
				} else if (c.getCamara() == 2 && c.getNasa() != 0) {
					obsCamara[1]++;
				}
			}
			viewEscolhaCamara.getQtdeAbate1Label().setText(obsCamara[0] + " registro(s)");
			viewEscolhaCamara.getQtdeAbate2Label().setText(obsCamara[1] + " registro(s)");
		} else {
			viewEscolhaCamara.getQtdeAbate1Label().setText(obsCamara[0] + " registro(s)");
			viewEscolhaCamara.getQtdeAbate2Label().setText(obsCamara[1] + " registro(s)");
		}

	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaCamara.setLocationRelativeTo(null);
		viewEscolhaCamara.setVisible(true);
		viewEscolhaCamara.getOpcaoJFT().setText("");
		viewEscolhaCamara.getOpcaoJFT().grabFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(viewEscolhaCamara, "Deseja realmente sair do programa?",
					"DIGEX - Sair", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_1:
			viewEscolhaCamara.setVisible(false);
			controller.startCamaras(Integer.parseInt(aviario), abate, idadeAbate, dataAbate, 1);
			break;
		case KeyEvent.VK_2:
			viewEscolhaCamara.setVisible(false);
			controller.startCamaras(Integer.parseInt(aviario), abate, idadeAbate, dataAbate, 2);
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(viewEscolhaCamara, "Deseja realmente voltar para tela anterior?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewEscolhaCamara.setVisible(false);
				controller.startEscolhaDigRend(abate, idadeAbate, dataAbate);
				System.out.println("Voltar");
			}
			break;
		default:
			System.out.println("opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}
	}
}
