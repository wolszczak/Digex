package brf.peru.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import brf.peru.view.ViewBaiaAmostradosP;
import brf.util.FocusOrderPolicy;

public class ControllerBaiaAmostradosP extends KeyAdapter implements FocusListener{
	private final ControllerP controller;
	private ViewBaiaAmostradosP viewBaiaAmostrados;
	private String aviario,dataAbate;
	private int abate, idadeAbate;
	
	public ControllerBaiaAmostradosP(ControllerP c) {
		controller = c;
	}
	
	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		viewBaiaAmostrados = new ViewBaiaAmostradosP();
		viewBaiaAmostrados.setTitle("DIGEX - Peru");
		viewBaiaAmostrados.setResizable(false);
		viewBaiaAmostrados.setLocationRelativeTo(null);
		viewBaiaAmostrados.setVisible(true);
		
		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;
		
		List<Component> order = new ArrayList<>();
		order.add(viewBaiaAmostrados.getBaia1JFT());
		order.add(viewBaiaAmostrados.getBaia2JFT());
		order.add(viewBaiaAmostrados.getBaia3JFT());
		order.add(viewBaiaAmostrados.getBaia4JFT());
		order.add(viewBaiaAmostrados.getBaia5JFT());
		order.add(viewBaiaAmostrados.getNasa11JFT());
		order.add(viewBaiaAmostrados.getNasa12JFT());
		order.add(viewBaiaAmostrados.getNasa13JFT());
		order.add(viewBaiaAmostrados.getNasa14JFT());
		order.add(viewBaiaAmostrados.getNasa15JFT());
		order.add(viewBaiaAmostrados.getPeso11JFT());
		order.add(viewBaiaAmostrados.getPeso12JFT());
		order.add(viewBaiaAmostrados.getPeso13JFT());
		order.add(viewBaiaAmostrados.getPeso14JFT());
		order.add(viewBaiaAmostrados.getPeso15JFT());
		order.add(viewBaiaAmostrados.getNasa21JFT());
		order.add(viewBaiaAmostrados.getNasa22JFT());
		order.add(viewBaiaAmostrados.getNasa23JFT());
		order.add(viewBaiaAmostrados.getNasa24JFT());
		order.add(viewBaiaAmostrados.getNasa25JFT());
		order.add(viewBaiaAmostrados.getPeso21JFT());
		order.add(viewBaiaAmostrados.getPeso22JFT());
		order.add(viewBaiaAmostrados.getPeso23JFT());
		order.add(viewBaiaAmostrados.getPeso24JFT());
		order.add(viewBaiaAmostrados.getPeso25JFT());
		order.add(viewBaiaAmostrados.getNasa31JFT());
		order.add(viewBaiaAmostrados.getNasa32JFT());
		order.add(viewBaiaAmostrados.getNasa33JFT());
		order.add(viewBaiaAmostrados.getNasa34JFT());
		order.add(viewBaiaAmostrados.getNasa35JFT());
		order.add(viewBaiaAmostrados.getPeso31JFT());
		order.add(viewBaiaAmostrados.getPeso32JFT());
		order.add(viewBaiaAmostrados.getPeso33JFT());
		order.add(viewBaiaAmostrados.getPeso34JFT());
		order.add(viewBaiaAmostrados.getPeso35JFT());
		order.add(viewBaiaAmostrados.getControleJFT());
		
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewBaiaAmostrados.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
		
		viewBaiaAmostrados.getAviarioJFT().setText(aviario);
		viewBaiaAmostrados.getAbateJFT().setText(String.valueOf(abate));
		viewBaiaAmostrados.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewBaiaAmostrados.getDataAbateJFT().setText(dataAbate);
		viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
		viewBaiaAmostrados.getBaia1JFT().grabFocus();
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
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewBaiaAmostrados, "Deseja realmente voltar para tela anterior?",
					"SDDGE - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewBaiaAmostrados.setVisible(false);
				controller.startEscolhaDigRend(abate,idadeAbate,dataAbate);
				System.out.println("Voltar");
			}
		}
		
		
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
