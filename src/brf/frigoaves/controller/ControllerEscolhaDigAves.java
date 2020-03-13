package brf.frigoaves.controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JOptionPane;

import brf.frigoaves.model.vo.PlataformaAvesVO;
import brf.frigoaves.view.ViewEscolhaDigAves;
import brf.main.controller.ControllerEscolhaExp;
import brf.main.view.ViewEscolhaExp;
import brf.suino.controller.ControllerMortalidadeST;
import brf.suino.controller.ControllerST;
import brf.suino.view.ViewEscolhaDigST;

public class ControllerEscolhaDigAves extends KeyAdapter implements FocusListener {

	private String idDigitador;
	private ViewEscolhaDigAves view;

	public void openWindow(String idDigitador) {
		this.idDigitador = idDigitador;

		view = new ViewEscolhaDigAves();
		view.setTitle("DIGEX - Avaliação de Aves no Frigorífico");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela de escolha de experimento?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(idDigitador);
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			view.setVisible(false);
			ControllerPlataformaAves plataforma = new ControllerPlataformaAves();
			plataforma.openWindow(idDigitador);
			break;
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}
}
