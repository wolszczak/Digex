package brf.peru.controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;

import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;

import brf.peru.view.ViewBaiaAmostradosP;

public class ControllerBaiaAmostradosP extends KeyAdapter implements FocusListener{
	private final ControllerP controller;
	private ViewBaiaAmostradosP viewBaiaAmostrados;
	private String aviario;
	private int abate, idadeAbate;
	
	public ControllerBaiaAmostradosP(ControllerP c) {
		controller = c;
	}
	
	public void openWindow(String aviario, int abate, String dataAbate) {
		viewBaiaAmostrados = new ViewBaiaAmostradosP();
		viewBaiaAmostrados.setTitle("DIGEX - Peru");
		viewBaiaAmostrados.setResizable(false);
		viewBaiaAmostrados.setLocationRelativeTo(null);
		viewBaiaAmostrados.setVisible(true);
		viewBaiaAmostrados.getIdadeJFT().grabFocus();
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
		// TODO Auto-generated method stub
		
	}
    
}
