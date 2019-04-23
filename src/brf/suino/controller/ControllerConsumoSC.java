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
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.view.ViewInfoExpSC;
import brf.util.FocusOrderPolicy;

public class ControllerConsumoSC extends KeyAdapter implements ActionListener, FocusListener, ItemListener {
	private final ControllerSC controller;
	private ViewInfoExpSC viewInfoExp;
	private String inicioExp, fimExp;
	private int faseCounter;
	private List<String> datasFase;
	private Border defaultJP;

	public ControllerConsumoSC(ControllerSC c) {
		this.controller = c;
	}

	public void openWindow(String idDigitador) {
		viewInfoExp = new ViewInfoExpSC();
		viewInfoExp.setTitle("DIGEX - Suínos Creche");
		viewInfoExp.setResizable(false);
		viewInfoExp.setLocationRelativeTo(null);
		viewInfoExp.setVisible(true);
		viewInfoExp.getIdDigitadorJFT().setText(idDigitador);

		datasFase = new ArrayList<>();

		defaultJP = viewInfoExp.getFasesJP().getBorder();

		viewInfoExp.getFaseJFT().setText("1");

		faseCounter = 1;

		List<Component> order = new ArrayList<>();
		order.add(viewInfoExp.getProtocoloJFT());
		order.add(viewInfoExp.getLocalJCB());
		order.add(viewInfoExp.getGalpaoJFT());
		order.add(viewInfoExp.getAreaJCB());
		order.add(viewInfoExp.getNrBaiaJFT());
		order.add(viewInfoExp.getInicioExpJFT());
		order.add(viewInfoExp.getFimExpJFT());
		order.add(viewInfoExp.getIdadeAlojJFT());
		order.add(viewInfoExp.getNrFasesJFT());
		order.add(viewInfoExp.getIdadeFaseJFT());
		order.add(viewInfoExp.getOpcaoJFT());
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewInfoExp.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	public void listenerSetup(List<Component> components) {
		components.stream().forEach((it) -> {
			if (it instanceof JFormattedTextField) {
				((JFormattedTextField) it).addFocusListener(this);
			} else if (it instanceof JComboBox) {
				((JComboBox) it).addActionListener(this);
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
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewInfoExp.getProtocoloJFT())) {
			System.out.println("left");
			if (src instanceof JFormattedTextField) {
				((JFormattedTextField) src).setEnabled(false);
				Component prev = viewInfoExp.getFocusTraversalPolicy().getComponentBefore(viewInfoExp, (JFormattedTextField) src);
				if (prev instanceof JFormattedTextField) {
					if (prev.equals(viewInfoExp.getIdadeFaseJFT()) || prev.equals(viewInfoExp.getNrFasesJFT())) {
						viewInfoExp.getNrFasesJFT().setEnabled(true);
						viewInfoExp.getNrFasesJFT().grabFocus();
						viewInfoExp.getFaseJFT().setText("1");
						viewInfoExp.getFaseHist1Label().setText("");
						viewInfoExp.getFaseHist2Label().setText("");
						viewInfoExp.getIdadeHist1Label().setText("");
						viewInfoExp.getIdadeHist2Label().setText("");
						viewInfoExp.getIdadeFaseJFT().setText("");
						datasFase.removeAll(datasFase);
						faseCounter = 1;
					} else {
						prev.setEnabled(true);
						((JFormattedTextField) prev).grabFocus();
					}
				} else if (prev instanceof JComboBox) {
					prev.setEnabled(true);
					((JComboBox) prev).grabFocus();
				}
			} else if (src instanceof JComboBox) {
				((JComboBox) src).setEnabled(false);
				Component prev = viewInfoExp.getFocusTraversalPolicy().getComponentBefore(viewInfoExp, (JComboBox) src);
				prev.setEnabled(true);
				if (prev instanceof JFormattedTextField) {
					((JFormattedTextField) prev).grabFocus();
				} else if (prev instanceof JComboBox) {
					((JComboBox) prev).grabFocus();
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == viewInfoExp.getOpcaoJFT()) {
			switch (e.getKeyChar()) {
			case KeyEvent.VK_0:
				int n = JOptionPane.showConfirmDialog(viewInfoExp, "Deseja realmente sair do programa?", "DIGEX - Sair",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (n == 0) {
					System.out.println("Fim...");
					System.exit(0);
				}
				break;
			case KeyEvent.VK_1:
				break;
			case KeyEvent.VK_9:
				int option = JOptionPane.showConfirmDialog(viewInfoExp, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (option == 0) {
//					viewInfoExp.setVisible(false);
//					ControllerEscolhaExp ce = new ControllerEscolhaExp();
//					ce.openWindow(idDigitador);
//					System.out.println("Voltar");
				}
				break;
			default:
				System.out.println("Opção inválida!");
				((JFormattedTextField) e.getComponent()).setCaretPosition(0);
				((JFormattedTextField) e.getComponent()).selectAll();
				break;
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewInfoExp, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
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
