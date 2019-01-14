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

import brf.peru.model.vo.AbateVOP;
import brf.peru.view.ViewEscolhaDigRendP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerEscolhaDigRendP extends KeyAdapter implements FocusListener {
	private final ControllerP controller;
	private ViewEscolhaDigRendP viewEscolhaDigRend;
	private boolean temAbate;
	private String aviario;
	private int abate, idadeAbate;
	private String dataAbate;

	public ControllerEscolhaDigRendP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, int abate, String dataAbate) {
		viewEscolhaDigRend = new ViewEscolhaDigRendP();
		viewEscolhaDigRend.setTitle("DIGEX - Peru");
		viewEscolhaDigRend.setResizable(false);
		viewEscolhaDigRend.setLocationRelativeTo(null);
		viewEscolhaDigRend.setVisible(true);
		viewEscolhaDigRend.getIdadeJFT().grabFocus();

		this.aviario = aviario;
		this.abate = abate;
		this.dataAbate = dataAbate;

		viewEscolhaDigRend.getAviarioJFT().setText(aviario);
		viewEscolhaDigRend.getAbateJFT().setText("" + abate);
		viewEscolhaDigRend.getDataAbateJFT().setText(dataAbate);

		List<Component> order = new ArrayList<>();
		order.add(viewEscolhaDigRend.getIdadeJFT());
		order.add(viewEscolhaDigRend.getOpcaoJFT());
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewEscolhaDigRend.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
		viewEscolhaDigRend.getIdadeJFT().setEnabled(true);
		viewEscolhaDigRend.getIdadeJFT().grabFocus();
		histSetup();
	}

	public void histSetup() {
		int obsAmostrados = 0;
		for (AbateVOP a : controller.getModel().getExperimentoVO().getAbates()) {
			if(a.getAbate() == abate) {
				obsAmostrados++;
			}
		}
		viewEscolhaDigRend.getQtdeDesLabel().setText(obsAmostrados + " amostrados digitados");
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	public void resumeWindow() {
		histSetup();
		viewEscolhaDigRend.setLocationRelativeTo(null);
		viewEscolhaDigRend.setVisible(true);
		viewEscolhaDigRend.getOpcaoJFT().setText("");
		viewEscolhaDigRend.getOpcaoJFT().grabFocus();

		// if (controller.getModel().getExperimentoVO().getDesempenho().isEmpty()) {
		// viewEscolhaDigRend.getExportarDesempenhoLabel().setForeground(Color.GRAY);
		// } else {
		// viewEscolhaDigRend.getExportarDesempenhoLabel().setForeground(Color.BLACK);
		// }
		// if
		// (controller.getModel().getExperimentoVO().getAbates().get(0).getCamaras().isEmpty()
		// &&
		// controller.getModel().getExperimentoVO().getAbates().get(0).getBaiaAmostrados().isEmpty())
		// {
		// viewEscolhaDigRend.getExportarRendimentoLabel().setForeground(Color.GRAY);
		// }

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewEscolhaDigRend.getIdadeJFT())) {
			System.out.println("left");
			Component prev = viewEscolhaDigRend.getFocusTraversalPolicy().getComponentBefore(viewEscolhaDigRend,
					(JFormattedTextField) src);			
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if ((JFormattedTextField) e.getSource() == viewEscolhaDigRend.getOpcaoJFT()) {
			switch (e.getKeyChar()) {
			case KeyEvent.VK_0:
				int n = JOptionPane.showConfirmDialog(viewEscolhaDigRend, "Deseja realmente sair do programa?",
						"DIGEX - Sair", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (n == 0) {
					System.out.println("Fim...");
					System.exit(0);
				}
				break;
			case KeyEvent.VK_1:
				viewEscolhaDigRend.setVisible(false);
				controller.startBaiaAmostrados(Integer.parseInt(aviario),dataAbate);
				System.out.print("Amostrados");
				break;
			case KeyEvent.VK_2:
				viewEscolhaDigRend.setVisible(false);
				controller.startCamaras();
				System.out.println("Camaras");
				break;
			case KeyEvent.VK_3:
				viewEscolhaDigRend.setVisible(false);
				controller.startCones();
				System.out.println("Cones");
				break;
			case KeyEvent.VK_9:
				int option = JOptionPane.showConfirmDialog(viewEscolhaDigRend,
						"Deseja realmente voltar para tela de escolha de experimento?", "DIGEX - Voltar",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (option == 0) {
					viewEscolhaDigRend.setVisible(false);
					ControllerEscolhaDigP ce = new ControllerEscolhaDigP(controller);
					ce.openWindow(null);
					System.out.println("Voltar");
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
			int option = JOptionPane.showConfirmDialog(viewEscolhaDigRend,
					"Deseja realmente voltar para tela de escolha de experimento?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewEscolhaDigRend.setVisible(false);
				ControllerEscolhaDigP ce = new ControllerEscolhaDigP(controller);
				ce.openWindow(null);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == viewEscolhaDigRend.getIdadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewEscolhaDigRend.getOpcaoJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewEscolhaDigRend.getOpcaoJFT().requestFocus();
				viewEscolhaDigRend.getIdadeJFT().setEnabled(false);
			}
			
		}

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
