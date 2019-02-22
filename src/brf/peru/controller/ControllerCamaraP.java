package brf.peru.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.SwingUtilities;

public class ControllerCamaraP extends KeyAdapter implements FocusListener {
	private ControllerP controller;
	private int abate, idadeAbate, ordem;
	private String aviario, dataAbate;
	private boolean finalDigitacao;
	private List<Component> order, orderAux;

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;
	}

	public ControllerCamaraP(ControllerP c) {
		this.controller = c;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		super.keyTyped(e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
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
	public void focusLost(FocusEvent e) {

	}

}
