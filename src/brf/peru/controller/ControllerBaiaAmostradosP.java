package brf.peru.controller;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.peru.model.bo.AbateBOP;
import brf.peru.model.dao.ModelStateDAOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.view.ViewBaiaAmostradosP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerBaiaAmostradosP extends KeyAdapter implements FocusListener, ItemListener {
	private final ControllerP controller;
	private int abate, idadeAbate, ordem;
	private boolean usarColunaExtra, finalDigitacao;
	private ModelStateDAOP dao;
	private ControllerEscolhaDigRendP controllerEscolhaDigRendP;
	private ViewBaiaAmostradosP view;
	private BaiaAmostradosVOP amostradoTemp;
	private List<JLabel> labels, labelsOrdem;
	private List<BaiaAmostradosVOP> amostrados;
	private List<Component> order, orderAux;
	private String aviario, dataAbate;
	private AbateBOP bo;
	private Border defaultBorder;

	public ControllerBaiaAmostradosP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate) {
		view = new ViewBaiaAmostradosP();
		view.setTitle("DIGEX - Peru");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getRegistrosLabel().setVisible(false);
		view.getCheckColunaExtra().addItemListener(this);
		view.getCheckColunaExtra().addKeyListener(this);

		this.dataAbate = dataAbate;
		this.idadeAbate = idadeAbate;
		this.aviario = aviario;
		this.abate = abate;
		controllerEscolhaDigRendP = new ControllerEscolhaDigRendP(controller);
		dao = new ModelStateDAOP(controller.getModel());
		ordem = 0;
		usarColunaExtra = false;
		finalDigitacao = false;
		amostradoTemp = new BaiaAmostradosVOP();
		amostrados = new ArrayList<>();
		bo = new AbateBOP(controller);
		defaultBorder = view.getBaiaAmostradosJP().getBorder();

		view.getControleJFT().setText("000000");
		view.getAviarioJFT().setText(aviario);
		view.getAbateJFT().setText(String.valueOf(abate));
		view.getIdadeJFT().setText(String.valueOf(idadeAbate));
		view.getDataAbateJFT().setText(dataAbate);
		loadHist();
		atualizaOrdemBaiaAmostrados();
		if (ordem > 5) {
			view.getCheckColunaExtra().setEnabled(false);
			view.getBaia1JFT().setEnabled(true);
			view.getBaia1JFT().grabFocus();
			criarOrdemComponentes();
			criaListaOrdemAux();
		} else {
			view.getCheckColunaExtra().setEnabled(true);
			view.getCheckColunaExtra().grabFocus();
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
	public void focusLost(FocusEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "Digex - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				controller.startEscolhaDigRend(abate, idadeAbate, dataAbate);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = null;
			String text = "";

			if (e.getSource() == view.getCheckColunaExtra()) {
				view.getCheckColunaExtra().setEnabled(false);
				view.getBaia1JFT().setEnabled(true);
				view.getBaia1JFT().grabFocus();
				criarOrdemComponentes();
				criaListaOrdemAux();
			} else {
				src = (JFormattedTextField) e.getSource();
				text = src.getText();

				if ((JFormattedTextField) e.getSource() == view.getBaia1JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					view.getRegistrosLabel().setVisible(false);
					view.getBaia1JFT().setEnabled(false);
					view.getBaia2JFT().setEnabled(true);
					view.getBaia2JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getBaia2JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					view.getBaia2JFT().setEnabled(false);
					view.getBaia3JFT().setEnabled(true);
					view.getBaia3JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getBaia3JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					view.getBaia3JFT().setEnabled(false);
					view.getBaia4JFT().setEnabled(true);
					view.getBaia4JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getBaia4JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					view.getBaia4JFT().setEnabled(false);
					view.getBaia5JFT().setEnabled(true);
					view.getBaia5JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getBaia5JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					view.getBaia5JFT().setEnabled(false);
					view.getNasa11JFT().setEnabled(true);
					view.getNasa11JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa11JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa11JFT().setEnabled(false);
					view.getNasa12JFT().setEnabled(true);
					view.getNasa12JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa12JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa12JFT().setEnabled(false);
					view.getNasa13JFT().setEnabled(true);
					view.getNasa13JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa13JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa13JFT().setEnabled(false);
					view.getNasa14JFT().setEnabled(true);
					view.getNasa14JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa14JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa14JFT().setEnabled(false);
					view.getNasa15JFT().setEnabled(true);
					view.getNasa15JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa15JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa15JFT().setEnabled(false);
					view.getPeso11JFT().setEnabled(true);
					view.getPeso11JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso11JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso11JFT().setEnabled(false);
					view.getPeso12JFT().setEnabled(true);
					view.getPeso12JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso12JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso12JFT().setEnabled(false);
					view.getPeso13JFT().setEnabled(true);
					view.getPeso13JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso13JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso13JFT().setEnabled(false);
					view.getPeso14JFT().setEnabled(true);
					view.getPeso14JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso14JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso14JFT().setEnabled(false);
					view.getPeso15JFT().setEnabled(true);
					view.getPeso15JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso15JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso15JFT().setEnabled(false);
					view.getNasa21JFT().setEnabled(true);
					view.getNasa21JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa21JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa21JFT().setEnabled(false);
					view.getNasa22JFT().setEnabled(true);
					view.getNasa22JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa22JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa22JFT().setEnabled(false);
					view.getNasa23JFT().setEnabled(true);
					view.getNasa23JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa23JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa23JFT().setEnabled(false);
					view.getNasa24JFT().setEnabled(true);
					view.getNasa24JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa24JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa24JFT().setEnabled(false);
					view.getNasa25JFT().setEnabled(true);
					view.getNasa25JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa25JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa25JFT().setEnabled(false);
					view.getPeso21JFT().setEnabled(true);
					view.getPeso21JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso21JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso21JFT().setEnabled(false);
					view.getPeso22JFT().setEnabled(true);
					view.getPeso22JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso22JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso22JFT().setEnabled(false);
					view.getPeso23JFT().setEnabled(true);
					view.getPeso23JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso23JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso23JFT().setEnabled(false);
					view.getPeso24JFT().setEnabled(true);
					view.getPeso24JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso24JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso24JFT().setEnabled(false);
					view.getPeso25JFT().setEnabled(true);
					view.getPeso25JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso25JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso25JFT().setEnabled(false);
					if (usarColunaExtra) {
						view.getNasa31JFT().setEnabled(true);
						view.getNasa31JFT().requestFocus();
					} else {
						popularListaAmostrados();
						String msg = bo.verificaAmostrados(amostrados);
						if (msg != null && msg.length() != 0) {
							JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
							amostrados = new ArrayList<>();
							fluxoProblemaDigitacao();
						} else {
//							finalDigitacao = bo.validaFinalDigitacao(amostradosTemp, usarColunaExtra);
							view.getControleJFT().setEnabled(true);
							view.getControleJFT().grabFocus();
						}
					}
				} else if ((JFormattedTextField) e.getSource() == view.getNasa31JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa31JFT().setEnabled(false);
					view.getNasa32JFT().setEnabled(true);
					view.getNasa32JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa32JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa32JFT().setEnabled(false);
					view.getNasa33JFT().setEnabled(true);
					view.getNasa33JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa33JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa33JFT().setEnabled(false);
					view.getNasa34JFT().setEnabled(true);
					view.getNasa34JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa34JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa34JFT().setEnabled(false);
					view.getNasa35JFT().setEnabled(true);
					view.getNasa35JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getNasa35JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					view.getNasa35JFT().setEnabled(false);
					view.getPeso31JFT().setEnabled(true);
					view.getPeso31JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso31JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso31JFT().setEnabled(false);
					view.getPeso32JFT().setEnabled(true);
					view.getPeso32JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso32JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso32JFT().setEnabled(false);
					view.getPeso33JFT().setEnabled(true);
					view.getPeso33JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso33JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso33JFT().setEnabled(false);
					view.getPeso34JFT().setEnabled(true);
					view.getPeso34JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso34JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso34JFT().setEnabled(false);
					view.getPeso35JFT().setEnabled(true);
					view.getPeso35JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == view.getPeso35JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					view.getPeso35JFT().setEnabled(false);
//					if (usarColunaExtra) {
//						viewBaiaAmostrados.getNasa31JFT().setEnabled(true);
//						viewBaiaAmostrados.getNasa31JFT().requestFocus();
//					} else {
					popularListaAmostrados();
					String msg = bo.verificaAmostrados(amostrados);
					if (msg != null && msg.length() != 0) {
						amostrados = new ArrayList<>();
						fluxoProblemaDigitacao();
					} else {
						view.getControleJFT().setEnabled(true);
						view.getControleJFT().grabFocus();
					}
//					}
				} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					if (Integer.parseInt(view.getControleJFT().getText()) == calculaTotalControle()) {
						view.getControleJFT().setEnabled(false);
						addAmostradosExperimento();
						updateHist();
						fluxoContinuarDigitacao();
						amostrados = new ArrayList<>();
						view.getRegistrosLabel().setVisible(true);
						dao.saveModelState(false);
					} else {
						fluxoProblemaDigitacao();
						amostrados = new ArrayList<>();
					}
				}
			}

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getBaia1JFT())) {
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	private void addAmostradosExperimento() {
		if (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados() == null) {
			controller.getModel().getExperimentoVO().getAbates().get(abate - 1).setBaiaAmostrados(new ArrayList<>());
			for (BaiaAmostradosVOP a : amostrados) {
				if (a.getNasa() != 0 && a.getNrBaia() != 0 && a.getPeso() != 0) {
					controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().add(a);
				}
			}
		} else {
			for (BaiaAmostradosVOP a : amostrados) {
				if (a.getNasa() != 0 && a.getNrBaia() != 0 && a.getPeso() != 0) {
					controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().add(a);
				}
			}
		}
	}

	private void criarOrdemComponentes() {
		if (usarColunaExtra) {
			order = new ArrayList<>();
			order.add(view.getBaia1JFT());
			order.add(view.getBaia2JFT());
			order.add(view.getBaia3JFT());
			order.add(view.getBaia4JFT());
			order.add(view.getBaia5JFT());
			order.add(view.getNasa11JFT());
			order.add(view.getNasa12JFT());
			order.add(view.getNasa13JFT());
			order.add(view.getNasa14JFT());
			order.add(view.getNasa15JFT());
			order.add(view.getPeso11JFT());
			order.add(view.getPeso12JFT());
			order.add(view.getPeso13JFT());
			order.add(view.getPeso14JFT());
			order.add(view.getPeso15JFT());
			order.add(view.getNasa21JFT());
			order.add(view.getNasa22JFT());
			order.add(view.getNasa23JFT());
			order.add(view.getNasa24JFT());
			order.add(view.getNasa25JFT());
			order.add(view.getPeso21JFT());
			order.add(view.getPeso22JFT());
			order.add(view.getPeso23JFT());
			order.add(view.getPeso24JFT());
			order.add(view.getPeso25JFT());
			order.add(view.getNasa31JFT());
			order.add(view.getNasa32JFT());
			order.add(view.getNasa33JFT());
			order.add(view.getNasa34JFT());
			order.add(view.getNasa35JFT());
			order.add(view.getPeso31JFT());
			order.add(view.getPeso32JFT());
			order.add(view.getPeso33JFT());
			order.add(view.getPeso34JFT());
			order.add(view.getPeso35JFT());
			order.add(view.getControleJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			view.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		} else {
			order = new ArrayList<>();
			order.add(view.getBaia1JFT());
			order.add(view.getBaia2JFT());
			order.add(view.getBaia3JFT());
			order.add(view.getBaia4JFT());
			order.add(view.getBaia5JFT());
			order.add(view.getNasa11JFT());
			order.add(view.getNasa12JFT());
			order.add(view.getNasa13JFT());
			order.add(view.getNasa14JFT());
			order.add(view.getNasa15JFT());
			order.add(view.getPeso11JFT());
			order.add(view.getPeso12JFT());
			order.add(view.getPeso13JFT());
			order.add(view.getPeso14JFT());
			order.add(view.getPeso15JFT());
			order.add(view.getNasa21JFT());
			order.add(view.getNasa22JFT());
			order.add(view.getNasa23JFT());
			order.add(view.getNasa24JFT());
			order.add(view.getNasa25JFT());
			order.add(view.getPeso21JFT());
			order.add(view.getPeso22JFT());
			order.add(view.getPeso23JFT());
			order.add(view.getPeso24JFT());
			order.add(view.getPeso25JFT());
			order.add(view.getControleJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			view.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		}
	}

	private Integer calculaTotalControle() {
		int controle = 0;

		controle += Integer.parseInt(view.getBaia1JFT().getText().trim());
		controle += Integer.parseInt(view.getBaia2JFT().getText().trim());
		controle += Integer.parseInt(view.getBaia3JFT().getText().trim());
		controle += Integer.parseInt(view.getBaia4JFT().getText().trim());
		controle += Integer.parseInt(view.getBaia5JFT().getText().trim());

		controle += Integer.parseInt(view.getNasa11JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa12JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa13JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa14JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa15JFT().getText().trim());

		controle += Integer.parseInt(view.getPeso11JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso12JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso13JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso14JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso15JFT().getText().trim());

		controle += Integer.parseInt(view.getNasa21JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa22JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa23JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa24JFT().getText().trim());
		controle += Integer.parseInt(view.getNasa25JFT().getText().trim());

		controle += Integer.parseInt(view.getPeso21JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso22JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso23JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso24JFT().getText().trim());
		controle += Integer.parseInt(view.getPeso25JFT().getText().trim());

		if (usarColunaExtra) {
			controle += Integer.parseInt(view.getNasa31JFT().getText().trim());
			controle += Integer.parseInt(view.getNasa32JFT().getText().trim());
			controle += Integer.parseInt(view.getNasa33JFT().getText().trim());
			controle += Integer.parseInt(view.getNasa34JFT().getText().trim());
			controle += Integer.parseInt(view.getNasa35JFT().getText().trim());

			controle += Integer.parseInt(view.getPeso31JFT().getText().trim());
			controle += Integer.parseInt(view.getPeso32JFT().getText().trim());
			controle += Integer.parseInt(view.getPeso33JFT().getText().trim());
			controle += Integer.parseInt(view.getPeso34JFT().getText().trim());
			controle += Integer.parseInt(view.getPeso35JFT().getText().trim());
		}

		return controle;
	}

	private void fluxoProblemaDigitacao() {
		view.getBaiaAmostradosJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		view.getBaia1JFT().setEnabled(true);
		view.getBaia1JFT().grabFocus();
	}

	private void fluxoContinuarDigitacao() {
		view.getBaiaAmostradosJP().setBorder(defaultBorder);
		view.getBaia1JFT().setEnabled(true);
		view.getBaia1JFT().grabFocus();
	}

	private void updateHist() {
		view.getOrdemHist1Label().setText(view.getOrdem1JFT().getText());
		view.getOrdemHist2Label().setText(view.getOrdem2JFT().getText());
		view.getOrdemHist3Label().setText(view.getOrdem3JFT().getText());
		view.getOrdemHist4Label().setText(view.getOrdem4JFT().getText());
		view.getOrdemHist5Label().setText(view.getOrdem5JFT().getText());
		view.getBaiaHist1Label().setText(view.getBaia1JFT().getText());
		view.getBaiaHist2Label().setText(view.getBaia2JFT().getText());
		view.getBaiaHist3Label().setText(view.getBaia3JFT().getText());
		view.getBaiaHist4Label().setText(view.getBaia4JFT().getText());
		view.getBaiaHist5Label().setText(view.getBaia5JFT().getText());
		view.getNasa1Hist1Label().setText(view.getNasa11JFT().getText());
		view.getNasa1Hist2Label().setText(view.getNasa12JFT().getText());
		view.getNasa1Hist3Label().setText(view.getNasa13JFT().getText());
		view.getNasa1Hist4Label().setText(view.getNasa14JFT().getText());
		view.getNasa1Hist5Label().setText(view.getNasa15JFT().getText());
		view.getPeso1Hist1Label().setText(view.getPeso11JFT().getText());
		view.getPeso1Hist2Label().setText(view.getPeso12JFT().getText());
		view.getPeso1Hist3Label().setText(view.getPeso13JFT().getText());
		view.getPeso1Hist4Label().setText(view.getPeso14JFT().getText());
		view.getPeso1Hist5Label().setText(view.getPeso15JFT().getText());
		view.getNasa2Hist1Label().setText(view.getNasa21JFT().getText());
		view.getNasa2Hist2Label().setText(view.getNasa22JFT().getText());
		view.getNasa2Hist3Label().setText(view.getNasa23JFT().getText());
		view.getNasa2Hist4Label().setText(view.getNasa24JFT().getText());
		view.getNasa2Hist5Label().setText(view.getNasa25JFT().getText());
		view.getPeso2Hist1Label().setText(view.getPeso21JFT().getText());
		view.getPeso2Hist2Label().setText(view.getPeso22JFT().getText());
		view.getPeso2Hist3Label().setText(view.getPeso23JFT().getText());
		view.getPeso2Hist4Label().setText(view.getPeso24JFT().getText());
		view.getPeso2Hist5Label().setText(view.getPeso25JFT().getText());
		view.getBaia1JFT().setText("");
		view.getBaia2JFT().setText("");
		view.getBaia3JFT().setText("");
		view.getBaia4JFT().setText("");
		view.getBaia5JFT().setText("");
		view.getNasa11JFT().setText("");
		view.getNasa12JFT().setText("");
		view.getNasa13JFT().setText("");
		view.getNasa14JFT().setText("");
		view.getNasa15JFT().setText("");
		view.getPeso11JFT().setText("");
		view.getPeso12JFT().setText("");
		view.getPeso13JFT().setText("");
		view.getPeso14JFT().setText("");
		view.getPeso15JFT().setText("");
		view.getNasa21JFT().setText("");
		view.getNasa22JFT().setText("");
		view.getNasa23JFT().setText("");
		view.getNasa24JFT().setText("");
		view.getNasa25JFT().setText("");
		view.getPeso21JFT().setText("");
		view.getPeso22JFT().setText("");
		view.getPeso23JFT().setText("");
		view.getPeso24JFT().setText("");
		view.getPeso25JFT().setText("");
		if (usarColunaExtra) {
			view.getNasa3Hist1Label().setText(view.getNasa31JFT().getText());
			view.getNasa3Hist2Label().setText(view.getNasa32JFT().getText());
			view.getNasa3Hist3Label().setText(view.getNasa33JFT().getText());
			view.getNasa3Hist4Label().setText(view.getNasa34JFT().getText());
			view.getNasa3Hist5Label().setText(view.getNasa35JFT().getText());
			view.getPeso3Hist1Label().setText(view.getPeso31JFT().getText());
			view.getPeso3Hist2Label().setText(view.getPeso32JFT().getText());
			view.getPeso3Hist3Label().setText(view.getPeso33JFT().getText());
			view.getPeso3Hist4Label().setText(view.getPeso34JFT().getText());
			view.getPeso3Hist5Label().setText(view.getPeso35JFT().getText());
			view.getNasa31JFT().setText("");
			view.getNasa32JFT().setText("");
			view.getNasa33JFT().setText("");
			view.getNasa34JFT().setText("");
			view.getNasa35JFT().setText("");
			view.getPeso31JFT().setText("");
			view.getPeso32JFT().setText("");
			view.getPeso33JFT().setText("");
			view.getPeso34JFT().setText("");
			view.getPeso35JFT().setText("");
		}
		view.getControleJFT().setText("000000");
		atualizaOrdemBaiaAmostrados();
	}

	private void atualizaOrdemBaiaAmostrados() {
		List<JFormattedTextField> ordens = new ArrayList<>();
		ordens.add(view.getOrdem1JFT());
		ordens.add(view.getOrdem2JFT());
		ordens.add(view.getOrdem3JFT());
		ordens.add(view.getOrdem4JFT());
		ordens.add(view.getOrdem5JFT());

		for (JFormattedTextField o : ordens) {
			ordem++;
			o.setText("" + String.valueOf(ordem));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == view.getCheckColunaExtra()) {
			usarColunaExtra = true;
		} else {
			usarColunaExtra = false;
		}
	}

	private void popularListaAmostrados() {
		// POPULA A LISTA DE OBJETOS COM DADOS DE CADA BLOCO DIGITADO.
		int count = 0;
		int size = orderAux.size();
		for (int i = 0; i < size; i++) {
			if (count == 0) {
				JFormattedTextField baia = (JFormattedTextField) orderAux.get(0);
				amostradoTemp.setIdade(idadeAbate);
				amostradoTemp.setAbate(Integer.parseInt(view.getAbateJFT().getText()));
				amostradoTemp.setNrBaia(Integer.parseInt(baia.getText()));
				orderAux.remove(0);
				count++;
			} else if (count == 1) {
				JFormattedTextField nasa = (JFormattedTextField) orderAux.get(0);
				amostradoTemp.setNasa(Integer.parseInt(nasa.getText()));
				orderAux.remove(0);
				count++;
			} else {
				JFormattedTextField peso = (JFormattedTextField) orderAux.get(0);
				amostradoTemp.setPeso(Integer.parseInt(peso.getText()));
				orderAux.remove(0);
				amostrados.add(amostradoTemp);
				amostradoTemp = new BaiaAmostradosVOP();
				count = 0;
			}
		}
		criaListaOrdemAux();
	}

	private void criaListaOrdemAux() {
		// CRIA LISTA DE COMPONENTES ORDENADOS PARA SALVAR OS OBJETOS AO FINAL DE CADA
		// BLOCO DIGITADO.
		orderAux = new ArrayList<Component>();
		if (!usarColunaExtra) {
			orderAux.add(view.getBaia1JFT());
			orderAux.add(view.getNasa11JFT());
			orderAux.add(view.getPeso11JFT());
			orderAux.add(view.getBaia1JFT());
			orderAux.add(view.getNasa21JFT());
			orderAux.add(view.getPeso21JFT());

			orderAux.add(view.getBaia2JFT());
			orderAux.add(view.getNasa12JFT());
			orderAux.add(view.getPeso12JFT());
			orderAux.add(view.getBaia2JFT());
			orderAux.add(view.getNasa22JFT());
			orderAux.add(view.getPeso22JFT());

			orderAux.add(view.getBaia3JFT());
			orderAux.add(view.getNasa13JFT());
			orderAux.add(view.getPeso13JFT());
			orderAux.add(view.getBaia3JFT());
			orderAux.add(view.getNasa23JFT());
			orderAux.add(view.getPeso23JFT());

			orderAux.add(view.getBaia4JFT());
			orderAux.add(view.getNasa14JFT());
			orderAux.add(view.getPeso14JFT());
			orderAux.add(view.getBaia4JFT());
			orderAux.add(view.getNasa24JFT());
			orderAux.add(view.getPeso24JFT());

			orderAux.add(view.getBaia5JFT());
			orderAux.add(view.getNasa15JFT());
			orderAux.add(view.getPeso15JFT());
			orderAux.add(view.getBaia5JFT());
			orderAux.add(view.getNasa25JFT());
			orderAux.add(view.getPeso25JFT());
		} else {
			orderAux.add(view.getBaia1JFT());
			orderAux.add(view.getNasa11JFT());
			orderAux.add(view.getPeso11JFT());
			orderAux.add(view.getBaia1JFT());
			orderAux.add(view.getNasa21JFT());
			orderAux.add(view.getPeso21JFT());
			orderAux.add(view.getBaia1JFT());
			orderAux.add(view.getNasa31JFT());
			orderAux.add(view.getPeso31JFT());

			orderAux.add(view.getBaia2JFT());
			orderAux.add(view.getNasa12JFT());
			orderAux.add(view.getPeso12JFT());
			orderAux.add(view.getBaia2JFT());
			orderAux.add(view.getNasa22JFT());
			orderAux.add(view.getPeso22JFT());
			orderAux.add(view.getBaia2JFT());
			orderAux.add(view.getNasa32JFT());
			orderAux.add(view.getPeso32JFT());

			orderAux.add(view.getBaia3JFT());
			orderAux.add(view.getNasa13JFT());
			orderAux.add(view.getPeso13JFT());
			orderAux.add(view.getBaia3JFT());
			orderAux.add(view.getNasa23JFT());
			orderAux.add(view.getPeso23JFT());
			orderAux.add(view.getBaia3JFT());
			orderAux.add(view.getNasa33JFT());
			orderAux.add(view.getPeso33JFT());

			orderAux.add(view.getBaia4JFT());
			orderAux.add(view.getNasa14JFT());
			orderAux.add(view.getPeso14JFT());
			orderAux.add(view.getBaia4JFT());
			orderAux.add(view.getNasa24JFT());
			orderAux.add(view.getPeso24JFT());
			orderAux.add(view.getBaia4JFT());
			orderAux.add(view.getNasa34JFT());
			orderAux.add(view.getPeso34JFT());

			orderAux.add(view.getBaia5JFT());
			orderAux.add(view.getNasa15JFT());
			orderAux.add(view.getPeso15JFT());
			orderAux.add(view.getBaia5JFT());
			orderAux.add(view.getNasa25JFT());
			orderAux.add(view.getPeso25JFT());
			orderAux.add(view.getBaia5JFT());
			orderAux.add(view.getNasa35JFT());
			orderAux.add(view.getPeso35JFT());
		}
	}

	private void loadHist() {
		if (!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().isEmpty()) {
			List<BaiaAmostradosVOP> amostradosHist = new ArrayList<>();
			amostradosHist.addAll(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados());
			if (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().get(2).getNrBaia() == controller
					.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().get(0).getNrBaia()) {
				// UTILIZA 3 COLUNAS
				int countHist = 0;
				listarOrdemHist(3);
				ordem = (amostradosHist.size() / 2) - 4;
				for (int i = 0; i < 5; i++) {
					labelsOrdem.get(i).setText(String.valueOf(ordem));
					if (i < 4) {
						ordem++;
					}
				}
				for (JLabel label : labels) {
					if (countHist == 0) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 1).getPeso()));
						countHist++;
					} else if (countHist == 1) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 1).getNasa()));
						countHist++;
					} else if (countHist == 2) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 2).getPeso()));
						countHist++;
					} else if (countHist == 3) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 2).getNasa()));
						countHist++;
					} else if (countHist == 4) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 3).getPeso()));
						countHist++;
					} else if (countHist == 5) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 3).getNasa()));
						countHist++;
					} else {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 3).getNrBaia()));
						countHist = 0;
						amostradosHist.remove(amostradosHist.size() - 3);
						amostradosHist.remove(amostradosHist.size() - 2);
						amostradosHist.remove(amostradosHist.size() - 1);
					}
				}
			} else {
				// UTILIZA 2 COLUNAS
				int countHist = 0;
				listarOrdemHist(2);
				ordem = (amostradosHist.size() / 2) - 4;
				for (int i = 0; i < 5; i++) {
					labelsOrdem.get(i).setText(String.valueOf(ordem));
					if (i < 4) {
						ordem++;
					}
				}
				for (JLabel label : labels) {
					if (countHist == 0) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 1).getPeso()));
						countHist++;
					} else if (countHist == 1) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 1).getNasa()));
						countHist++;
					} else if (countHist == 2) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 2).getPeso()));
						countHist++;
					} else if (countHist == 3) {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 2).getNasa()));
						countHist++;
					} else {
						label.setText(String.valueOf(amostradosHist.get(amostradosHist.size() - 2).getNrBaia()));
						countHist = 0;
						amostradosHist.remove(amostradosHist.size() - 2);
						amostradosHist.remove(amostradosHist.size() - 1);
					}
				}
			}
		}
	}

	private void listarOrdemHist(int size) {
		labels = new ArrayList<>();
		labelsOrdem = new ArrayList<>();

		labelsOrdem.add(view.getOrdemHist1Label());
		labelsOrdem.add(view.getOrdemHist2Label());
		labelsOrdem.add(view.getOrdemHist3Label());
		labelsOrdem.add(view.getOrdemHist4Label());
		labelsOrdem.add(view.getOrdemHist5Label());

		if (size == 2) {
			labels.add(view.getPeso2Hist5Label());
			labels.add(view.getNasa2Hist5Label());
			labels.add(view.getPeso1Hist5Label());
			labels.add(view.getNasa1Hist5Label());
			labels.add(view.getBaiaHist5Label());

			labels.add(view.getPeso2Hist4Label());
			labels.add(view.getNasa2Hist4Label());
			labels.add(view.getPeso1Hist4Label());
			labels.add(view.getNasa1Hist4Label());
			labels.add(view.getBaiaHist4Label());

			labels.add(view.getPeso2Hist3Label());
			labels.add(view.getNasa2Hist3Label());
			labels.add(view.getPeso1Hist3Label());
			labels.add(view.getNasa1Hist3Label());
			labels.add(view.getBaiaHist3Label());

			labels.add(view.getPeso2Hist2Label());
			labels.add(view.getNasa2Hist2Label());
			labels.add(view.getPeso1Hist2Label());
			labels.add(view.getNasa1Hist2Label());
			labels.add(view.getBaiaHist2Label());

			labels.add(view.getPeso2Hist1Label());
			labels.add(view.getNasa2Hist1Label());
			labels.add(view.getPeso1Hist1Label());
			labels.add(view.getNasa1Hist1Label());
			labels.add(view.getBaiaHist1Label());
		} else {
			labels.add(view.getPeso3Hist5Label());
			labels.add(view.getNasa3Hist5Label());
			labels.add(view.getPeso2Hist5Label());
			labels.add(view.getNasa2Hist5Label());
			labels.add(view.getPeso1Hist5Label());
			labels.add(view.getNasa1Hist5Label());
			labels.add(view.getBaiaHist5Label());

			labels.add(view.getPeso3Hist4Label());
			labels.add(view.getNasa3Hist4Label());
			labels.add(view.getPeso2Hist4Label());
			labels.add(view.getNasa2Hist4Label());
			labels.add(view.getPeso1Hist4Label());
			labels.add(view.getNasa1Hist4Label());
			labels.add(view.getBaiaHist4Label());

			labels.add(view.getPeso3Hist3Label());
			labels.add(view.getNasa3Hist3Label());
			labels.add(view.getPeso2Hist3Label());
			labels.add(view.getNasa2Hist3Label());
			labels.add(view.getPeso1Hist3Label());
			labels.add(view.getNasa1Hist3Label());
			labels.add(view.getBaiaHist3Label());

			labels.add(view.getPeso3Hist2Label());
			labels.add(view.getNasa3Hist2Label());
			labels.add(view.getPeso2Hist2Label());
			labels.add(view.getNasa2Hist2Label());
			labels.add(view.getPeso1Hist2Label());
			labels.add(view.getNasa1Hist2Label());
			labels.add(view.getBaiaHist2Label());

			labels.add(view.getPeso3Hist1Label());
			labels.add(view.getNasa3Hist1Label());
			labels.add(view.getPeso2Hist1Label());
			labels.add(view.getNasa2Hist1Label());
			labels.add(view.getPeso1Hist1Label());
			labels.add(view.getNasa1Hist1Label());
			labels.add(view.getBaiaHist1Label());

			labels.add(view.getBaiaHist5Label());
			labels.add(view.getBaiaHist4Label());
			labels.add(view.getBaiaHist3Label());
			labels.add(view.getBaiaHist2Label());
			labels.add(view.getBaiaHist1Label());
		}

	}

}
