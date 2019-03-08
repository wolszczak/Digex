package brf.peru.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.peru.model.dao.ModelStateDAOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.model.vo.CamaraVOP;
import brf.peru.view.ViewCamaraP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerCamaraP extends KeyAdapter implements FocusListener {
	private int abate, idadeAbate, ordem, camara;
	private ControllerP controller;
	private ModelStateDAOP dao;
	private ViewCamaraP viewCamara;
	private List<CamaraVOP> camaras, camarasTemp;
	private String aviario, dataAbate;
	private List<Component> order;
	private Border defaultBorder;

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate, Integer camara) {
		this.dao = new ModelStateDAOP(controller.getModel());
		this.camara = camara;
		this.camaras = new ArrayList<>();
		this.camarasTemp = new ArrayList<>();
		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;
		viewCamara = new ViewCamaraP();
		defaultBorder = viewCamara.getCamaraJP().getBorder();

		viewCamara.setTitle("DIGEX - Peru");
		viewCamara.setResizable(false);
		viewCamara.setLocationRelativeTo(null);
		viewCamara.setVisible(true);
		viewCamara.getRegistrosLabel().setVisible(false);
		viewCamara.getControleJFT().setText("000000");
		viewCamara.getAviarioJFT().setText(aviario);
		viewCamara.getAbateJFT().setText(String.valueOf(abate));
		viewCamara.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewCamara.getDataAbateJFT().setText(dataAbate);
		viewCamara.getCamaraJFT().setText(String.valueOf(camara));
		viewCamara.getNumero1JFT().setEnabled(true);
		viewCamara.getNumero1JFT().grabFocus();

		loadHist();
		atualizaOrdem();
		criarOrdemComponentes();
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
			if ((JFormattedTextField) e.getSource() == viewCamara.getNumero1JFT()) {
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
					viewCamara.getCamaraJP().setBorder(defaultBorder);
					camaras.addAll(camarasTemp);
					controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().addAll(camaras);
					dao.saveModelState(false);
					camarasTemp = new ArrayList<>();
					atualizaHist();
					viewCamara.getControleJFT().setText("000000");
					viewCamara.getControleJFT().setEnabled(false);
					viewCamara.getNumero1JFT().setEnabled(true);
					viewCamara.getNumero1JFT().grabFocus();
				} else {
					viewCamara.getCamaraJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					camarasTemp = new ArrayList<>();
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

	private void atualizaOrdem() {
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

	private Integer calculaTotalControle() {
		int controle = 0;
		for (CamaraVOP c : camarasTemp) {
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
		viewCamara.getOrdemHist1Label().setText(viewCamara.getOrdem1JFT().getText());
		viewCamara.getOrdemHist2Label().setText(viewCamara.getOrdem2JFT().getText());
		viewCamara.getOrdemHist3Label().setText(viewCamara.getOrdem3JFT().getText());
		viewCamara.getOrdemHist4Label().setText(viewCamara.getOrdem4JFT().getText());
		viewCamara.getOrdemHist5Label().setText(viewCamara.getOrdem5JFT().getText());
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
		viewCamara.getNumero1JFT().setText("");
		viewCamara.getNumero2JFT().setText("");
		viewCamara.getNumero3JFT().setText("");
		viewCamara.getNumero4JFT().setText("");
		viewCamara.getNumero5JFT().setText("");
		viewCamara.getpCarcaca1JFT().setText("");
		viewCamara.getpCarcaca2JFT().setText("");
		viewCamara.getpCarcaca3JFT().setText("");
		viewCamara.getpCarcaca4JFT().setText("");
		viewCamara.getpCarcaca5JFT().setText("");
		viewCamara.getEscGordura1JFT().setText("");
		viewCamara.getEscGordura2JFT().setText("");
		viewCamara.getEscGordura3JFT().setText("");
		viewCamara.getEscGordura4JFT().setText("");
		viewCamara.getEscGordura5JFT().setText("");
		viewCamara.getEscCarcaca1JFT().setText("");
		viewCamara.getEscCarcaca2JFT().setText("");
		viewCamara.getEscCarcaca3JFT().setText("");
		viewCamara.getEscCarcaca4JFT().setText("");
		viewCamara.getEscCarcaca5JFT().setText("");
		atualizaOrdem();
	}

	private void loadHist() {
		if(!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().isEmpty()) {
			
		}
		
		if (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().get(camara - 1).getNasa() != 0) {
			viewCamara.getNumHist5Label().setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates()
					.get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 1)
					.getNasa()));
			viewCamara.getpCarcacaHist5Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 1)
					.getpCarcaca()));
			viewCamara.getEscGorduraHist5Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 1)
					.getEscGordura()));
			viewCamara.getEscCarcacaHist5Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 1)
					.getEscCarcaca()));

			viewCamara.getNumHist4Label().setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates()
					.get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 2)
					.getNasa()));
			viewCamara.getpCarcacaHist4Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 2)
					.getpCarcaca()));
			viewCamara.getEscGorduraHist4Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 2)
					.getEscGordura()));
			viewCamara.getEscCarcacaHist4Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 2)
					.getEscCarcaca()));

			viewCamara.getNumHist3Label().setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates()
					.get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 3)
					.getNasa()));
			viewCamara.getpCarcacaHist3Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 3)
					.getpCarcaca()));
			viewCamara.getEscGorduraHist3Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 3)
					.getEscGordura()));
			viewCamara.getEscCarcacaHist3Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 3)
					.getEscCarcaca()));

			viewCamara.getNumHist2Label().setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates()
					.get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 4)
					.getNasa()));
			viewCamara.getpCarcacaHist2Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 4)
					.getpCarcaca()));
			viewCamara.getEscGorduraHist2Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 4)
					.getEscGordura()));
			viewCamara.getEscCarcacaHist2Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 4)
					.getEscCarcaca()));

			viewCamara.getNumHist1Label().setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates()
					.get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 5)
					.getNasa()));
			viewCamara.getpCarcacaHist1Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 5)
					.getpCarcaca()));
			viewCamara.getEscGorduraHist1Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 5)
					.getEscGordura()));
			viewCamara.getEscCarcacaHist1Label().setText(String.valueOf(controller.getModel().getExperimentoVO()
					.getAbates().get(abate - 1).getCamaras()
					.get(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size() - 5)
					.getEscCarcaca()));

			ordem = controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCamaras().size();
			int aux = ordem;
			viewCamara.getOrdemHist5Label().setText(String.valueOf(aux));
			aux--;
			viewCamara.getOrdemHist4Label().setText(String.valueOf(aux));
			aux--;
			viewCamara.getOrdemHist3Label().setText(String.valueOf(aux));
			aux--;
			viewCamara.getOrdemHist2Label().setText(String.valueOf(aux));
			aux--;
			viewCamara.getOrdemHist1Label().setText(String.valueOf(aux));
		} else {
			viewCamara.getNumHist1Label().setText("");
			viewCamara.getNumHist2Label().setText("");
			viewCamara.getNumHist3Label().setText("");
			viewCamara.getNumHist4Label().setText("");
			viewCamara.getNumHist5Label().setText("");
			viewCamara.getpCarcacaHist1Label().setText("");
			viewCamara.getpCarcacaHist2Label().setText("");
			viewCamara.getpCarcacaHist3Label().setText("");
			viewCamara.getpCarcacaHist4Label().setText("");
			viewCamara.getpCarcacaHist5Label().setText("");
			viewCamara.getEscGorduraHist1Label().setText("");
			viewCamara.getEscGorduraHist2Label().setText("");
			viewCamara.getEscGorduraHist3Label().setText("");
			viewCamara.getEscGorduraHist4Label().setText("");
			viewCamara.getEscGorduraHist5Label().setText("");
			viewCamara.getEscCarcacaHist1Label().setText("");
			viewCamara.getEscCarcacaHist2Label().setText("");
			viewCamara.getEscCarcacaHist3Label().setText("");
			viewCamara.getEscCarcacaHist4Label().setText("");
			viewCamara.getEscCarcacaHist5Label().setText("");
		}
	}

}
