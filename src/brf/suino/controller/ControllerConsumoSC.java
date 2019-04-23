package brf.suino.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.border.Border;

import brf.suino.view.ViewConsumoSC;
import brf.util.FocusOrderPolicy;

public class ControllerConsumoSC extends KeyAdapter implements ActionListener, FocusListener, ItemListener {
	private final ControllerSC controller;
	private ViewConsumoSC viewConsumo;
	private String inicioExp, fimExp;
	private int faseCounter;
	private List<String> datasFase;
	private Border defaultJP;

	public ControllerConsumoSC(ControllerSC c) {
		this.controller = c;
	}

	public void openWindow(List<String> datasFases) {
		viewConsumo = new ViewConsumoSC();
		viewConsumo.setTitle("DIGEX - Suínos Creche");
		viewConsumo.setResizable(false);
		viewConsumo.setLocationRelativeTo(null);
		viewConsumo.setVisible(true);
		viewConsumo.getGalpaoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getInfoExp().getGalpao()).trim());
		datasFase = new ArrayList<>();
		defaultJP = viewConsumo.getConsumoJP().getBorder();
		faseCounter = 1;

		List<Component> order = new ArrayList<>();
		order.add(viewConsumo.getGalpaoJFT());
		order.add(viewConsumo.getBaiaJFT());
		order.add(viewConsumo.getSexoJFT());
		order.add(viewConsumo.getTrataJFT()); 
		order.add(viewConsumo.getTrata2JFT());
		order.add(viewConsumo.getControleBaiaJFT());
		order.add(viewConsumo.getChkUsarColunaExtra());
		order.add(viewConsumo.getIdadeJFT());
		order.add(viewConsumo.getFornecidaJFT());
		order.add(viewConsumo.getSobraJFT());
		order.add(viewConsumo.getPesoJFT());
		order.add(viewConsumo.getnAnimaisJFT());
		order.add(viewConsumo.getControleFornecidaJFT());
		order.add(viewConsumo.getControleSobraJFT());
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewConsumo.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	public void listenerSetup(List<Component> components) {
		components.stream().forEach((it) -> {
			if (it instanceof JFormattedTextField) {
				((JFormattedTextField) it).addFocusListener(this);
			} else if (it instanceof JCheckBox) {
				((JCheckBox) it).addItemListener(this);
			}
			if (!(it instanceof JCheckBox)) {
				it.addKeyListener(this);
			}
		});
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object src = e.getSource();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				if (src instanceof JFormattedTextField) {
					((JFormattedTextField) src).setCaretPosition(0);
					((JFormattedTextField) src).selectAll();
				}
			}
		});
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("item: " + e.getStateChange());

	}

	@Override
	public void focusLost(FocusEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewConsumo.getIdadeJFT())) {
			System.out.println("left");
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("enter");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewConsumo, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
//				viewInfoExp.setVisible(false);
//				ControllerEscolhaExp ce = new ControllerEscolhaExp();
//				ce.openWindow(idDigitador);
//				System.out.println("Voltar");
			}
		} else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			Object src = e.getSource();
			String text = "";
		}
	}

//	public void resetaFasesAbates() {
//		viewInfoExp.getFaseJFT().setText("1");
//		viewInfoExp.getFaseHist1Label().setText("");
//		viewInfoExp.getFaseHist2Label().setText("");
//		viewInfoExp.getIdadeHist1Label().setText("");
//		viewInfoExp.getIdadeHist2Label().setText("");
//		viewInfoExp.getIdadeFaseJFT().setText("");
////        idadeFase.removeAll(idadeFase);
//		faseCounter = 1;
////        dataAbate.removeAll(dataAbate);
//		datasFase = new ArrayList<>();
//	}
}
