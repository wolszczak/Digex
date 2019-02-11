package brf.peru.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;

import brf.peru.view.ViewBaiaAmostradosP;
import brf.util.FocusOrderPolicy;

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
		
		List<Component> order = new ArrayList<>();
		order.add(viewBaiaAmostrados.getBaia1JFT());
		order.add(viewBaiaAmostrados.getBaia2JFT());
		order.add(viewBaiaAmostrados.getBaia3JFT());
		order.add(viewBaiaAmostrados.getBaia4JFT());
		order.add(viewBaiaAmostrados.getBaia5JFT());
		
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewBaiaAmostrados.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
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
	public void focusLost(FocusEvent arg0) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		super.keyTyped(e);
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
			System.out.println("left");
			Component prev = viewBaiaAmostrados.getFocusTraversalPolicy().getComponentBefore(viewBaiaAmostrados,
					(JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}
    
}
