package brf.suino.controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import brf.suino.view.ViewConsumoSC;
import brf.suino.view.ViewEscolhaDigitacaoSC;

public class ControllerEscolhaDigitacaoSC extends KeyAdapter implements ItemListener {
	private ViewEscolhaDigitacaoSC view;
	
	public ControllerEscolhaDigitacaoSC() {
	}
	
	private void openWindow() {
		view = new ViewEscolhaDigitacaoSC();
		view.setTitle("DIGEX - Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		super.keyTyped(e);
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
	}

}