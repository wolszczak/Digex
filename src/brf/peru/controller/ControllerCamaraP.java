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

import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.model.vo.CamaraVOP;
import brf.peru.view.ViewCamaraP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerCamaraP extends KeyAdapter implements FocusListener {
	private int abate, idadeAbate, ordem;
	private boolean finalDigitacao;
	private ControllerP controller;
	private ViewCamaraP viewCamara;
	private List<CamaraVOP> camaras, camarasTemp;
	private String aviario, dataAbate;
	private List<Component> order, orderAux;

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		viewCamara = new ViewCamaraP();
		viewCamara.setTitle("DIGEX - Peru");
		viewCamara.setResizable(false);
		viewCamara.setLocationRelativeTo(null);
		viewCamara.setVisible(true);
		viewCamara.getRegistrosLabel().setVisible(false);

		this.camaras = new ArrayList<>();
		this.camarasTemp = new ArrayList<>();
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
				viewCamara.getNumero2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getNumero2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getNumero2JFT().setEnabled(false);
				viewCamara.getNumero3JFT().setEnabled(true);
				viewCamara.getNumero3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getNumero3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getNumero3JFT().setEnabled(false);
				viewCamara.getNumero4JFT().setEnabled(true);
				viewCamara.getNumero4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getNumero4JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getNumero4JFT().setEnabled(false);
				viewCamara.getNumero5JFT().setEnabled(true);
				viewCamara.getNumero5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getNumero5JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getNumero5JFT().setEnabled(false);
				viewCamara.getpCarcaca1JFT().setEnabled(true);
				viewCamara.getpCarcaca1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getpCarcaca1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getpCarcaca1JFT().setEnabled(false);
				viewCamara.getpCarcaca2JFT().setEnabled(true);
				viewCamara.getpCarcaca2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getpCarcaca2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getpCarcaca2JFT().setEnabled(false);
				viewCamara.getpCarcaca3JFT().setEnabled(true);
				viewCamara.getpCarcaca3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getpCarcaca3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getpCarcaca3JFT().setEnabled(false);
				viewCamara.getpCarcaca4JFT().setEnabled(true);
				viewCamara.getpCarcaca4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getpCarcaca4JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getpCarcaca4JFT().setEnabled(false);
				viewCamara.getpCarcaca5JFT().setEnabled(true);
				viewCamara.getpCarcaca5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getpCarcaca5JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getpCarcaca5JFT().setEnabled(false);
				viewCamara.getEscGordura1JFT().setEnabled(true);
				viewCamara.getEscGordura1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscGordura1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscGordura1JFT().setEnabled(false);
				viewCamara.getEscGordura2JFT().setEnabled(true);
				viewCamara.getEscGordura2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscGordura2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscGordura2JFT().setEnabled(false);
				viewCamara.getEscGordura3JFT().setEnabled(true);
				viewCamara.getEscGordura3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscGordura3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscGordura3JFT().setEnabled(false);
				viewCamara.getEscGordura4JFT().setEnabled(true);
				viewCamara.getEscGordura4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscGordura4JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscGordura4JFT().setEnabled(false);
				viewCamara.getEscGordura5JFT().setEnabled(true);
				viewCamara.getEscGordura5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscGordura5JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscGordura5JFT().setEnabled(false);
				viewCamara.getEscCarcaca1JFT().setEnabled(true);
				viewCamara.getEscCarcaca1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscCarcaca1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscCarcaca1JFT().setEnabled(false);
				viewCamara.getEscCarcaca2JFT().setEnabled(true);
				viewCamara.getEscCarcaca2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscCarcaca2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscCarcaca2JFT().setEnabled(false);
				viewCamara.getEscCarcaca3JFT().setEnabled(true);
				viewCamara.getEscCarcaca3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscCarcaca3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscCarcaca3JFT().setEnabled(false);
				viewCamara.getEscCarcaca4JFT().setEnabled(true);
				viewCamara.getEscCarcaca4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscCarcaca4JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCamara.getEscCarcaca4JFT().setEnabled(false);
				viewCamara.getEscCarcaca5JFT().setEnabled(true);
				viewCamara.getEscCarcaca5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getEscCarcaca5JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				// Adicionar valores nos objetos e popular lista
				popularListaCamaras();
				viewCamara.getEscCarcaca5JFT().setEnabled(false);
				viewCamara.getControleJFT().setEnabled(true);
				viewCamara.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCamara.getControleJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (Integer.parseInt(viewCamara.getControleJFT().getText()) == calculaTotalControle()) {
					camaras.addAll(camarasTemp);
					camarasTemp = new ArrayList<>();
					atualizaHist();
					viewCamara.getControleJFT().setText("000000");
					viewCamara.getControleJFT().setEnabled(false);
					viewCamara.getNumero1JFT().setEnabled(true);
					viewCamara.getNumero1JFT().grabFocus();
				} else {
					camarasTemp =  new ArrayList<>();
					viewCamara.getControleJFT().setEnabled(false);
					viewCamara.getNumero1JFT().setEnabled(true);
					viewCamara.getNumero1JFT().grabFocus();
				}
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

	private Integer calculaTotalControle() {
		int controle = 0;
		for (CamaraVOP c : camaras) {
			controle += c.getNasa();
			controle += c.getpCarcaca();
			controle += c.getEscGordura();
			controle += c.getEscCarcaca();
		}
		return controle;
	}

	private void popularListaCamaras() {
		camarasTemp.add(new CamaraVOP(Integer.parseInt(viewCamara.getCamaraJFT().getText()),
				Integer.parseInt(viewCamara.getNumero1JFT().getText()),
				Integer.parseInt(viewCamara.getpCarcaca1JFT().getText()),
				Integer.parseInt(viewCamara.getEscGordura1JFT().getText()),
				Integer.parseInt(viewCamara.getEscCarcaca1JFT().getText())));
		camarasTemp.add(new CamaraVOP(Integer.parseInt(viewCamara.getCamaraJFT().getText()),
				Integer.parseInt(viewCamara.getNumero2JFT().getText()),
				Integer.parseInt(viewCamara.getpCarcaca2JFT().getText()),
				Integer.parseInt(viewCamara.getEscGordura2JFT().getText()),
				Integer.parseInt(viewCamara.getEscCarcaca2JFT().getText())));
		camarasTemp.add(new CamaraVOP(Integer.parseInt(viewCamara.getCamaraJFT().getText()),
				Integer.parseInt(viewCamara.getNumero3JFT().getText()),
				Integer.parseInt(viewCamara.getpCarcaca3JFT().getText()),
				Integer.parseInt(viewCamara.getEscGordura3JFT().getText()),
				Integer.parseInt(viewCamara.getEscCarcaca3JFT().getText())));
		camarasTemp.add(new CamaraVOP(Integer.parseInt(viewCamara.getCamaraJFT().getText()),
				Integer.parseInt(viewCamara.getNumero4JFT().getText()),
				Integer.parseInt(viewCamara.getpCarcaca4JFT().getText()),
				Integer.parseInt(viewCamara.getEscGordura4JFT().getText()),
				Integer.parseInt(viewCamara.getEscCarcaca4JFT().getText())));
		camarasTemp.add(new CamaraVOP(Integer.parseInt(viewCamara.getCamaraJFT().getText()),
				Integer.parseInt(viewCamara.getNumero5JFT().getText()),
				Integer.parseInt(viewCamara.getpCarcaca5JFT().getText()),
				Integer.parseInt(viewCamara.getEscGordura5JFT().getText()),
				Integer.parseInt(viewCamara.getEscCarcaca5JFT().getText())));
	}
	
	private void atualizaHist() {
		viewCamara.getNumHist1Label().setText(viewCamara.getNumero1JFT().getText());
		viewCamara.getNumHist2Label().setText(viewCamara.getNumero2JFT().getText());
		viewCamara.getNumHist3Label().setText(viewCamara.getNumero3JFT().getText());
		viewCamara.getNumHist4Label().setText(viewCamara.getNumero4JFT().getText());
		viewCamara.getNumHist5Label().setText(viewCamara.getNumero5JFT().getText());
		viewCamara.getpCarcacaHist1Label().setText(viewCamara.getpCarcaca1JFT().getText());
		viewCamara.getpCarcacaHist2Label().setText(viewCamara.getpCarcaca2JFT().getText());
		viewCamara.getpCarcacaHist3Label().setText(viewCamara.getpCarcaca3JFT().getText());
		viewCamara.getpCarcacaHist4Label().setText(viewCamara.getpCarcaca4JFT().getText());
		viewCamara.getpCarcacaHist5Label().setText(viewCamara.getpCarcaca5JFT().getText());
		viewCamara.getEscGorduraHist1Label().setText(viewCamara.getEscGordura1JFT().getText());
		viewCamara.getEscGorduraHist2Label().setText(viewCamara.getEscGordura2JFT().getText());
		viewCamara.getEscGorduraHist3Label().setText(viewCamara.getEscGordura3JFT().getText());
		viewCamara.getEscGorduraHist4Label().setText(viewCamara.getEscGordura4JFT().getText());
		viewCamara.getEscGorduraHist5Label().setText(viewCamara.getEscGordura5JFT().getText());
		viewCamara.getEscCarcacaHist1Label().setText(viewCamara.getEscCarcaca1JFT().getText());
		viewCamara.getEscCarcacaHist2Label().setText(viewCamara.getEscCarcaca2JFT().getText());
		viewCamara.getEscCarcacaHist3Label().setText(viewCamara.getEscCarcaca3JFT().getText());
		viewCamara.getEscCarcacaHist4Label().setText(viewCamara.getEscCarcaca4JFT().getText());
		viewCamara.getEscCarcacaHist5Label().setText(viewCamara.getEscCarcaca5JFT().getText());
	}

}
