package brf.suino.controller;

import java.awt.Color;
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

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.main.controller.ControllerEscolhaExp;
import brf.suino.model.vo.InfoExpVOST;
import brf.suino.view.ViewInfoExpST;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;
import brf.util.VerifyRules;

public class ControllerInfoExpST extends KeyAdapter implements ActionListener, FocusListener, ItemListener {
	private final ControllerST controller;
	private ViewInfoExpST viewInfoExp;
	private String idDigitador;
	private String protocolo;
	private String teste;
	private int idLocal;
	private String local;
	private int idArea;
	private String area;
	private String inicioExp, fimExp;
	private int galpao;
	private int faseCounter;
	private List<String> datasFase;
	private List<JFormattedTextField> erros, aleijados;
	private InfoExpVOST info1, info2;
	private ViewInfoExpST view1, view2;
	private boolean duplaDigitacao;
	private Border defaultJTF, defaultJCB, defaultJP;

	public ControllerInfoExpST(ControllerST c) {
		this.controller = c;
		this.duplaDigitacao = false;
	}

	public void openWindow(String idDigitador) {
		viewInfoExp = new ViewInfoExpST();
		viewInfoExp.setTitle("DIGEX - Suínos Terminação");
		viewInfoExp.setResizable(false);
		viewInfoExp.setLocationRelativeTo(null);
		viewInfoExp.setVisible(true);
		viewInfoExp.getIdDigitadorJFT().setText(idDigitador);
		this.idDigitador = idDigitador;

		datasFase = new ArrayList<>();

		erros = new ArrayList<>();
		aleijados = new ArrayList<>();

		defaultJTF = viewInfoExp.getProtocoloJFT().getBorder();
		defaultJCB = viewInfoExp.getLocalJCB().getBorder();
		defaultJP = viewInfoExp.getFasesJP().getBorder();

		idLocal = 1;
		local = "VIDEIRA";

		idArea = 1;
		area = "GENETICA";

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
		JComboBox src = ((JComboBox) e.getSource());
		int selectedIndex = src.getSelectedIndex();
		if (src == viewInfoExp.getLocalJCB()) {
			idLocal = selectedIndex + 1;
			switch (idLocal) {
			case 1:
				local = "VIDEIRA";
				break;
			case 2:
				local = "CATANDUVAS";
				break;
			default:
				break;
			}
		} else if (src == viewInfoExp.getAreaJCB()) {
			idArea = selectedIndex + 1;
			switch (idArea) {
			case 1:
				area = "GENETICA";
				break;
			case 2:
				area = "NUTRICAO";
				break;
			case 3:
				area = "SANIDADE";
				break;
			case 4:
				area = "MANEJO";
				break;
			default:
				break;
			}
		}
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
				if (!duplaDigitacao) {
					info1 = new InfoExpVOST(idDigitador, protocolo, idLocal, local, galpao, teste, idArea, area,
							Integer.parseInt(viewInfoExp.getNrBaiaJFT().getText()), inicioExp, fimExp,
							Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()), datasFase);
					duplaDigitacao = true;
					viewInfoExp.setVisible(false);
					view1 = viewInfoExp;
					if (view2 == null) {
						openWindow(idDigitador);
					} else {
						viewInfoExp = view2;
						viewInfoExp.setVisible(true);
						viewInfoExp.getOpcaoJFT().setEnabled(false);
						viewInfoExp.getProtocoloJFT().setEnabled(true);
						viewInfoExp.getProtocoloJFT().grabFocus();
						mostraCamposErrados();
						resetaFasesAbates();
					}
				} else if (duplaDigitacao) {
					info2 = new InfoExpVOST(idDigitador, protocolo, idLocal, local, galpao, teste, idArea, area,
							Integer.parseInt(viewInfoExp.getNrBaiaJFT().getText()), inicioExp, fimExp,
							Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()), datasFase);
					boolean isOk = controller.getModel().getInfoExpBO().duplaDigitacao(info1, info2);
					if (isOk) {
						viewInfoExp.setVisible(false);
						controller.startEscolhaDig(datasFase);
						System.out.println("Continuar digitação");
					} else {
						JOptionPane.showMessageDialog(viewInfoExp, "Problema(s):\n" + info2.getErrorMessage(), "DIGEX - Dupla Digitação",
								JOptionPane.ERROR_MESSAGE);
						duplaDigitacao = false;
						viewInfoExp.setVisible(false);
						view2 = viewInfoExp;
						viewInfoExp = view1;
						viewInfoExp.setVisible(true);
						viewInfoExp.getOpcaoJFT().setEnabled(false);
						viewInfoExp.getProtocoloJFT().setEnabled(true);
						viewInfoExp.getProtocoloJFT().grabFocus();
						datasFase = new ArrayList<>();
						mostraCamposErrados();
						resetaFasesAbates();
					}
				}
				break;
			case KeyEvent.VK_9:
				int option = JOptionPane.showConfirmDialog(viewInfoExp, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (option == 0) {
					viewInfoExp.setVisible(false);
					ControllerEscolhaExp ce = new ControllerEscolhaExp();
					ce.openWindow(idDigitador);
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
			int option = JOptionPane.showConfirmDialog(viewInfoExp, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewInfoExp.setVisible(false);
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(idDigitador);
				System.out.println("Voltar");
			}
		} else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			Object src = e.getSource();
			String text = "";
			if (src instanceof JFormattedTextField) {
				text = ((JFormattedTextField) src).getText();
			}
			if (src == viewInfoExp.getProtocoloJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 25);
				System.out.println(text);
				protocolo = viewInfoExp.getProtocoloJFT().getText();
				teste = protocolo.substring(0, 5);
				teste += protocolo.substring(19, 25);
				viewInfoExp.getTesteJFT().setText(teste);
				viewInfoExp.getProtocoloJFT().setEnabled(false);
				viewInfoExp.getLocalJCB().setEnabled(true);
			} else if (src == viewInfoExp.getLocalJCB()) {
				viewInfoExp.getLocalJCB().setEnabled(false);
				viewInfoExp.getGalpaoJFT().setEnabled(true);
			} else if (src == viewInfoExp.getGalpaoJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 1);
				galpao = Integer.parseInt(viewInfoExp.getGalpaoJFT().getText());
				viewInfoExp.getGalpaoJFT().setEnabled(false);
				viewInfoExp.getAreaJCB().setEnabled(true);
			} else if (src == viewInfoExp.getAreaJCB()) {
				viewInfoExp.getAreaJCB().setEnabled(false);
				viewInfoExp.getNrBaiaJFT().setEnabled(true);
			} else if (src == viewInfoExp.getNrBaiaJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 3);
				viewInfoExp.getNrBaiaJFT().setEnabled(false);
				viewInfoExp.getInicioExpJFT().setEnabled(true);
			} else if (src == viewInfoExp.getInicioExpJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 10);
				inicioExp = viewInfoExp.getInicioExpJFT().getText();
				if (VerifyRules.verifyData(inicioExp)) {
					viewInfoExp.getInicioExpJFT().setEnabled(false);
					viewInfoExp.getFimExpJFT().setEnabled(true);
				} else {
					viewInfoExp.getInicioExpJFT().setEnabled(true);
					viewInfoExp.getInicioExpJFT().grabFocus();
				}
			} else if (src == viewInfoExp.getFimExpJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 10);
				fimExp = viewInfoExp.getFimExpJFT().getText();
				if (VerifyRules.verifyData(fimExp)) {
					viewInfoExp.getFimExpJFT().setEnabled(false);
					viewInfoExp.getNrFasesJFT().setEnabled(true);
				} else {
					viewInfoExp.getFimExpJFT().setEnabled(true);
					viewInfoExp.getFimExpJFT().grabFocus();
				}
			} else if (src == viewInfoExp.getNrFasesJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 1);
				viewInfoExp.getNrFasesJFT().setEnabled(false);
				viewInfoExp.getIdadeFaseJFT().setEnabled(true);
				int nFases = Integer.parseInt(viewInfoExp.getNrFasesJFT().getText());
				switch (nFases) {
				default:
					break;
				}
			} else if (src == viewInfoExp.getDataFaseJFT()) {
				TextFormatter.formatStringJFT((JFormattedTextField) src, text, 10);
				System.out.println("faseCounter: " + faseCounter);
				System.out.println("viewInfoExp.getNrFasesJFT().getText(): " + viewInfoExp.getNrFasesJFT().getText());
				if (faseCounter < Integer.parseInt(viewInfoExp.getNrFasesJFT().getText())) {
					datasFase.add(viewInfoExp.getIdadeFaseJFT().getText());
					viewInfoExp.getFaseHist1Label().setText(viewInfoExp.getFaseHist2Label().getText());
					viewInfoExp.getIdadeHist1Label().setText(viewInfoExp.getIdadeHist2Label().getText());
					viewInfoExp.getFaseHist2Label().setText("" + faseCounter);
					viewInfoExp.getIdadeHist2Label().setText(viewInfoExp.getIdadeFaseJFT().getText());
					viewInfoExp.getFaseJFT().setText("" + (++faseCounter));
				} else {
					datasFase.add(viewInfoExp.getIdadeFaseJFT().getText());
					viewInfoExp.getIdadeFaseJFT().setEnabled(false);
					viewInfoExp.getOpcaoJFT().setEnabled(true);
				}
			}
			((Component) src).transferFocus();
		}
	}

	public void mostraCamposErrados() {
		if (info2.getProblemas()[0]) {
			viewInfoExp.getProtocoloJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getProtocoloJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[1] || info2.getProblemas()[2]) {
			viewInfoExp.getLocalJCB().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getLocalJCB().setBorder(defaultJCB);
		}
		if (info2.getProblemas()[3]) {
			viewInfoExp.getGalpaoJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getGalpaoJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[4]) {
			viewInfoExp.getTesteJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getTesteJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[5] || info2.getProblemas()[7]) {
			viewInfoExp.getAreaJCB().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getAreaJCB().setBorder(defaultJCB);
		}
		if (info2.getProblemas()[6]) {
			viewInfoExp.getNrBaiaJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getNrBaiaJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[7]) {
			viewInfoExp.getInicioExpJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getInicioExpJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[8]) {
			viewInfoExp.getFimExpJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getFimExpJFT().setBorder(defaultJTF);
		}
		if (info2.getProblemas()[10] || info2.getProblemas()[14]) {
			viewInfoExp.getFasesJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		} else {
			viewInfoExp.getFasesJP().setBorder(defaultJP);
		}
//        for (int i = 17; i <= 32; i++) {
//            if(info2.getProblemas()[i]) {
//                viewInfoExp.getRetiradaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
//                break;
//            }
//        }
	}

	public void resetaFasesAbates() {
		viewInfoExp.getFaseJFT().setText("1");
		viewInfoExp.getFaseHist1Label().setText("");
		viewInfoExp.getFaseHist2Label().setText("");
		viewInfoExp.getIdadeHist1Label().setText("");
		viewInfoExp.getIdadeHist2Label().setText("");
		viewInfoExp.getIdadeFaseJFT().setText("");
//        idadeFase.removeAll(idadeFase);
		faseCounter = 1;
//        dataAbate.removeAll(dataAbate);
		datasFase = new ArrayList<>();
	}
}
