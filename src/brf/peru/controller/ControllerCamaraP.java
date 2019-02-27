package brf.peru.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import brf.peru.view.ViewCamaraP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerCamaraP extends KeyAdapter implements FocusListener {
	private ControllerP controller;
	private ViewCamaraP viewCamara;
	private int abate, idadeAbate, ordem;
	private String aviario, dataAbate;
	private boolean finalDigitacao;
	private List<Component> order, orderAux;

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		viewCamara = new ViewCamaraP();
		viewCamara.setTitle("DIGEX - Peru");
		viewCamara.setResizable(false);
		viewCamara.setLocationRelativeTo(null);
		viewCamara.setVisible(true);
		viewCamara.getRegistrosLabel().setVisible(false);

		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;

		viewCamara.getControleJFT().setText("000000");
		viewCamara.getAviarioJFT().setText(aviario);
		viewCamara.getAbateJFT().setText(String.valueOf(abate));
		viewCamara.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewCamara.getDataAbateJFT().setText(dataAbate);
		atualizaOrdemBaiaAmostrados();
		criarOrdemComponentes();
		criaListaOrdemAux();
		if (ordem > 5) {
			viewCamara.getCamaraJFT().setEnabled(false);
			viewCamara.getNumero1JFT().setEnabled(true);
			viewCamara.getNumero1JFT().grabFocus();
		} else {
			viewCamara.getCamaraJFT().grabFocus();
		}

	}

	public ControllerCamaraP(ControllerP c) {
		this.controller = c;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewCamara, "Deseja realmente voltar para tela anterior?",
					"Digex - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewCamara.setVisible(false);
				controller.startEscolhaDigRend(abate, idadeAbate, dataAbate);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if (e.getSource() == viewCamara.getCamaraJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				if (viewCamara.getCamaraJFT().getText().equals("")
						|| Integer.parseInt(viewCamara.getCamaraJFT().getText()) == 0) {
					JOptionPane.showMessageDialog(viewCamara, "Nº da Camara não pode ser 0.", "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					TextFormatter.formatStringJFT(src, text, 1);
					viewCamara.getCamaraJFT().setEnabled(false);
					viewCamara.getNumero1JFT().setEnabled(true);
					viewCamara.getNumero1JFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getNumero1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getRegistrosLabel().setVisible(false);
				viewCamara.getNumero1JFT().setEnabled(false);
				viewCamara.getNumero2JFT().setEnabled(true);
				viewCamara.getNumero2JFT().requestFocus();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewCamara.getCamaraJFT())) {
			Component prev = viewCamara.getFocusTraversalPolicy().getComponentBefore(viewCamara,
					(JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
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

	private void atualizaOrdemBaiaAmostrados() {
		List<JFormattedTextField> ordens = new ArrayList<>();
		ordens.add(viewCamara.getOrdem1JFT());
		ordens.add(viewCamara.getOrdem2JFT());
		ordens.add(viewCamara.getOrdem3JFT());
		ordens.add(viewCamara.getOrdem4JFT());
		ordens.add(viewCamara.getOrdem5JFT());

		for (JFormattedTextField o : ordens) {
			ordem++;
			o.setText("" + String.valueOf(ordem));
		}
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(viewCamara.getCamaraJFT());
		order.add(viewCamara.getNumero1JFT());
		order.add(viewCamara.getNumero2JFT());
		order.add(viewCamara.getNumero3JFT());
		order.add(viewCamara.getNumero4JFT());
		order.add(viewCamara.getNumero5JFT());
		order.add(viewCamara.getpCarcaca1JFT());
		order.add(viewCamara.getpCarcaca2JFT());
		order.add(viewCamara.getpCarcaca3JFT());
		order.add(viewCamara.getpCarcaca4JFT());
		order.add(viewCamara.getpCarcaca5JFT());
		order.add(viewCamara.getEscGordura1JFT());
		order.add(viewCamara.getEscGordura2JFT());
		order.add(viewCamara.getEscGordura3JFT());
		order.add(viewCamara.getEscGordura4JFT());
		order.add(viewCamara.getEscGordura5JFT());
		order.add(viewCamara.getEscCarcaca1JFT());
		order.add(viewCamara.getEscCarcaca2JFT());
		order.add(viewCamara.getEscCarcaca3JFT());
		order.add(viewCamara.getEscCarcaca4JFT());
		order.add(viewCamara.getEscCarcaca5JFT());
		order.add(viewCamara.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewCamara.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criaListaOrdemAux() {
		orderAux = new ArrayList<>();
		orderAux.add(viewCamara.getNumero1JFT());
		orderAux.add(viewCamara.getpCarcaca1JFT());
		orderAux.add(viewCamara.getEscGordura1JFT());
		orderAux.add(viewCamara.getEscCarcaca1JFT());
		orderAux.add(viewCamara.getNumero2JFT());
		orderAux.add(viewCamara.getpCarcaca2JFT());
		orderAux.add(viewCamara.getEscGordura2JFT());
		orderAux.add(viewCamara.getEscCarcaca2JFT());
		orderAux.add(viewCamara.getNumero3JFT());
		orderAux.add(viewCamara.getpCarcaca3JFT());
		orderAux.add(viewCamara.getEscGordura3JFT());
		orderAux.add(viewCamara.getEscCarcaca3JFT());
		orderAux.add(viewCamara.getNumero4JFT());
		orderAux.add(viewCamara.getpCarcaca4JFT());
		orderAux.add(viewCamara.getEscGordura4JFT());
		orderAux.add(viewCamara.getEscCarcaca4JFT());
		orderAux.add(viewCamara.getNumero5JFT());
		orderAux.add(viewCamara.getpCarcaca5JFT());
		orderAux.add(viewCamara.getEscGordura5JFT());
		orderAux.add(viewCamara.getEscCarcaca5JFT());
	}

}
