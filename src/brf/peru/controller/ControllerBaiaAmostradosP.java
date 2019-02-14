package brf.peru.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import brf.peru.view.ViewBaiaAmostradosP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerBaiaAmostradosP extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerP controller;
	private ViewBaiaAmostradosP viewBaiaAmostrados;
	private String aviario, dataAbate;
	private int abate, idadeAbate;
	private int ordem;

	public ControllerBaiaAmostradosP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		viewBaiaAmostrados = new ViewBaiaAmostradosP();
		viewBaiaAmostrados.setTitle("DIGEX - Peru");
		viewBaiaAmostrados.setResizable(false);
		viewBaiaAmostrados.setLocationRelativeTo(null);
		viewBaiaAmostrados.setVisible(true);
		viewBaiaAmostrados.getRegistrosLabel().setVisible(false);

		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;
		ordem = 1;

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

		atualizaOrdemBaiaAmostrados();

		viewBaiaAmostrados.getAviarioJFT().setText(aviario);
		viewBaiaAmostrados.getAbateJFT().setText(String.valueOf(abate));
		viewBaiaAmostrados.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewBaiaAmostrados.getDataAbateJFT().setText(dataAbate);
		viewBaiaAmostrados.getCheckColuna3().setEnabled(true);
		viewBaiaAmostrados.getCheckColuna3().grabFocus();
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
			int option = JOptionPane.showConfirmDialog(viewBaiaAmostrados,
					"Deseja realmente voltar para tela anterior?", "Digex - Voltar", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewBaiaAmostrados.setVisible(false);
				controller.startEscolhaDigRend(abate, idadeAbate, dataAbate);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JCheckBox) e.getSource() == viewBaiaAmostrados.getCheckColuna3()) {
				viewBaiaAmostrados.getCheckColuna3().setEnabled(false);
				viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia1JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewBaiaAmostrados.getBaia1JFT().setEnabled(false);
				viewBaiaAmostrados.getBaia2JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia2JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia2JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewBaiaAmostrados.getBaia2JFT().setEnabled(false);
				viewBaiaAmostrados.getBaia3JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia3JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia3JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewBaiaAmostrados.getBaia3JFT().setEnabled(false);
				viewBaiaAmostrados.getBaia4JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia4JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia4JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewBaiaAmostrados.getBaia4JFT().setEnabled(false);
				viewBaiaAmostrados.getBaia5JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia5JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia5JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewBaiaAmostrados.getBaia5JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa11JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa11JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa11JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa11JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa12JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa12JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa12JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa12JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa13JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa13JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa13JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa13JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa14JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa14JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa14JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa14JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa15JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa15JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa15JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa15JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso11JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso11JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso11JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso11JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso12JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso12JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso12JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso12JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso13JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso13JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso13JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso13JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso14JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso14JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso14JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso14JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso15JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso15JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso15JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso15JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa21JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa21JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa21JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa21JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa22JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa22JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa22JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa22JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa23JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa23JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa23JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa23JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa24JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa24JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa24JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa24JFT().setEnabled(false);
				viewBaiaAmostrados.getNasa25JFT().setEnabled(true);
				viewBaiaAmostrados.getNasa25JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa25JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getNasa25JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso21JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso21JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso21JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso21JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso22JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso22JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso22JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso22JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso23JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso23JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso23JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso23JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso24JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso24JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso24JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso24JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso25JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso25JFT().requestFocus();
			} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso25JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewBaiaAmostrados.getPeso25JFT().setEnabled(false);
				viewBaiaAmostrados.getPeso12JFT().setEnabled(true);
				viewBaiaAmostrados.getPeso12JFT().requestFocus();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("left");
			Component prev = viewBaiaAmostrados.getFocusTraversalPolicy().getComponentBefore(viewBaiaAmostrados,
					(JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	private void atualizaOrdemBaiaAmostrados() {
		List<JFormattedTextField> ordens = new ArrayList<>();
		ordens.add(viewBaiaAmostrados.getOrdem1JFT());
		ordens.add(viewBaiaAmostrados.getOrdem2JFT());
		ordens.add(viewBaiaAmostrados.getOrdem3JFT());
		ordens.add(viewBaiaAmostrados.getOrdem4JFT());
		ordens.add(viewBaiaAmostrados.getOrdem5JFT());

		for (JFormattedTextField o : ordens) {
			o.setText("" + String.valueOf(ordem));
			ordem++;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == viewBaiaAmostrados.getCheckColuna3()) {
			viewBaiaAmostrados.getNasa31JFT().setEnabled(true);
			viewBaiaAmostrados.getNasa32JFT().setEnabled(true);
			viewBaiaAmostrados.getNasa33JFT().setEnabled(true);
			viewBaiaAmostrados.getNasa34JFT().setEnabled(true);
			viewBaiaAmostrados.getNasa35JFT().setEnabled(true);
			viewBaiaAmostrados.getPeso31JFT().setEnabled(true);
			viewBaiaAmostrados.getPeso32JFT().setEnabled(true);
			viewBaiaAmostrados.getPeso33JFT().setEnabled(true);
			viewBaiaAmostrados.getPeso34JFT().setEnabled(true);
			viewBaiaAmostrados.getPeso35JFT().setEnabled(true);
		} else {
			viewBaiaAmostrados.getNasa31JFT().setEnabled(false);
			viewBaiaAmostrados.getNasa32JFT().setEnabled(false);
			viewBaiaAmostrados.getNasa33JFT().setEnabled(false);
			viewBaiaAmostrados.getNasa34JFT().setEnabled(false);
			viewBaiaAmostrados.getNasa35JFT().setEnabled(false);
			viewBaiaAmostrados.getPeso31JFT().setEnabled(false);
			viewBaiaAmostrados.getPeso32JFT().setEnabled(false);
			viewBaiaAmostrados.getPeso33JFT().setEnabled(false);
			viewBaiaAmostrados.getPeso34JFT().setEnabled(false);
			viewBaiaAmostrados.getPeso35JFT().setEnabled(false);
		}
	}

}
