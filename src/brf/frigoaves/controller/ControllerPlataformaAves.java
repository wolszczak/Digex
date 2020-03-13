package brf.frigoaves.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import brf.frigoaves.model.vo.PlataformaAvesVO;
import brf.frigoaves.view.ViewPlataformaAves;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerPlataformaAves extends KeyAdapter implements FocusListener {

	private String idDigitador;
	private List<PlataformaAvesVO> plataformasTemp;
	private ViewPlataformaAves view;
	private List<Component> order;
	private String data, nome;
	private int contrato, instal, carga, horaIni, horaFim;

	public void openWindow(String idDigitador) {
		this.idDigitador = idDigitador;
		view = new ViewPlataformaAves();
		view.setTitle("DIGEX - Digitação dados plataforma");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);

		criarOrdemComponentes();

		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getNomeJFT());
		order.add(view.getContratoJFT());
		order.add(view.getInstalJFT());
		order.add(view.getCargaJFT());
		order.add(view.getHoraIniJFT());
		order.add(view.getHoraFinJFT());
		order.add(view.getNumeroJFT1());
		order.add(view.getNumeroJFT2());
		order.add(view.getNumeroJFT3());
		order.add(view.getNumeroJFT4());
		order.add(view.getNumeroJFT5());
		order.add(view.getPesoJFT1());
		order.add(view.getPesoJFT2());
		order.add(view.getPesoJFT3());
		order.add(view.getPesoJFT4());
		order.add(view.getPesoJFT5());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela de escolha de experimento?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigAves ced = new ControllerEscolhaDigAves();
				ced.openWindow(idDigitador);
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_ENTER:
			if((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				TextFormatter.formatStringJFT(view.getDataJFT(), view.getDataJFT().getText(), 8);
				data = view.getDataJFT().getText();
				view.getDataJFT().setEnabled(false);
				view.getNomeJFT().setEnabled(true);
				view.getNomeJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getNomeJFT()) {
				nome = view.getNomeJFT().getText();
				view.getNomeJFT().setEnabled(false);
				view.getContratoJFT().setEnabled(true);
				view.getContratoJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getContratoJFT()) {
				contrato = Integer.parseInt(view.getContratoJFT().getText());
				view.getContratoJFT().setEnabled(false);
				view.getInstalJFT().setEnabled(true);
				view.getInstalJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getInstalJFT()) {
				instal = Integer.parseInt(view.getInstalJFT().getText());
				view.getInstalJFT().setEnabled(false);
				view.getCargaJFT().setEnabled(true);
				view.getCargaJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getCargaJFT()) {
				carga = Integer.parseInt(view.getCargaJFT().getText());
				view.getCargaJFT().setEnabled(false);
				view.getHoraIniJFT().setEnabled(true);
				view.getHoraIniJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getHoraIniJFT()) {
				horaIni = Integer.parseInt(view.getHoraIniJFT().getText());
				view.getHoraIniJFT().setEnabled(false);
				view.getHoraFinJFT().setEnabled(true);
				view.getHoraFinJFT().grabFocus();
			}else if((JFormattedTextField) e.getSource() == view.getHoraFinJFT()) {
				horaFim = Integer.parseInt(view.getHoraFinJFT().getText());
				view.getHoraFinJFT().setEnabled(false);
				limparCabecalho();
				view.getCargaJFT().setEnabled(true);
				view.getCargaJFT().grabFocus();
			}
			break;
		}
	}

	private void limparCabecalho() {
		view.getDataJFT().setText("");
		view.getNomeJFT().setText("");
		view.getContratoJFT().setText("");
		view.getInstalJFT().setText("");
		view.getCargaJFT().setText("");
		view.getHoraIniJFT().setText("");
		view.getHoraFinJFT().setText("");
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getDataJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

}
