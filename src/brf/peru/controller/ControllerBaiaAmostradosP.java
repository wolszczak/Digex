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
	private ViewBaiaAmostradosP viewBaiaAmostrados;
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
		viewBaiaAmostrados = new ViewBaiaAmostradosP();
		viewBaiaAmostrados.setTitle("DIGEX - Peru");
		viewBaiaAmostrados.setResizable(false);
		viewBaiaAmostrados.setLocationRelativeTo(null);
		viewBaiaAmostrados.setVisible(true);
		viewBaiaAmostrados.getRegistrosLabel().setVisible(false);
		viewBaiaAmostrados.getCheckColunaExtra().addItemListener(this);
		viewBaiaAmostrados.getCheckColunaExtra().addKeyListener(this);

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
		defaultBorder = viewBaiaAmostrados.getBaiaAmostradosJP().getBorder();

		viewBaiaAmostrados.getControleJFT().setText("000000");
		viewBaiaAmostrados.getAviarioJFT().setText(aviario);
		viewBaiaAmostrados.getAbateJFT().setText(String.valueOf(abate));
		viewBaiaAmostrados.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewBaiaAmostrados.getDataAbateJFT().setText(dataAbate);
		loadHist();
		atualizaOrdemBaiaAmostrados();
		if (ordem > 5) {
			viewBaiaAmostrados.getCheckColunaExtra().setEnabled(false);
			viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
			viewBaiaAmostrados.getBaia1JFT().grabFocus();
			criarOrdemComponentes();
			criaListaOrdemAux();
		} else {
			viewBaiaAmostrados.getCheckColunaExtra().setEnabled(true);
			viewBaiaAmostrados.getCheckColunaExtra().grabFocus();
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
			JFormattedTextField src = null;
			String text = "";

			if (e.getSource() == viewBaiaAmostrados.getCheckColunaExtra()) {
				viewBaiaAmostrados.getCheckColunaExtra().setEnabled(false);
				viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
				viewBaiaAmostrados.getBaia1JFT().grabFocus();
				criarOrdemComponentes();
				criaListaOrdemAux();
			} else {
				src = (JFormattedTextField) e.getSource();
				text = src.getText();

				if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getBaia1JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewBaiaAmostrados.getRegistrosLabel().setVisible(false);
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
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso11JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso12JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso12JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso12JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso12JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso13JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso13JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso13JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso13JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso14JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso14JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso14JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso14JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso15JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso15JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso15JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
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
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso21JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso22JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso22JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso22JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso22JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso23JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso23JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso23JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso23JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso24JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso24JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso24JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso24JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso25JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso25JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso25JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso25JFT().setEnabled(false);
					if (usarColunaExtra) {
						viewBaiaAmostrados.getNasa31JFT().setEnabled(true);
						viewBaiaAmostrados.getNasa31JFT().requestFocus();
					} else {
						popularListaAmostrados();
						String msg = bo.verificaAmostrados(amostrados);
						if (msg != null && msg.length() != 0) {
							JOptionPane.showMessageDialog(viewBaiaAmostrados, "Problema(s):\n" + msg, "DIGEX - Erro",
									JOptionPane.ERROR_MESSAGE);
							amostrados = new ArrayList<>();
							fluxoProblemaDigitacao();
						} else {
//							finalDigitacao = bo.validaFinalDigitacao(amostradosTemp, usarColunaExtra);
							viewBaiaAmostrados.getControleJFT().setEnabled(true);
							viewBaiaAmostrados.getControleJFT().grabFocus();
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa31JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewBaiaAmostrados.getNasa31JFT().setEnabled(false);
					viewBaiaAmostrados.getNasa32JFT().setEnabled(true);
					viewBaiaAmostrados.getNasa32JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa32JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewBaiaAmostrados.getNasa32JFT().setEnabled(false);
					viewBaiaAmostrados.getNasa33JFT().setEnabled(true);
					viewBaiaAmostrados.getNasa33JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa33JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewBaiaAmostrados.getNasa33JFT().setEnabled(false);
					viewBaiaAmostrados.getNasa34JFT().setEnabled(true);
					viewBaiaAmostrados.getNasa34JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa34JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewBaiaAmostrados.getNasa34JFT().setEnabled(false);
					viewBaiaAmostrados.getNasa35JFT().setEnabled(true);
					viewBaiaAmostrados.getNasa35JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getNasa35JFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewBaiaAmostrados.getNasa35JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso31JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso31JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso31JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso31JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso32JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso32JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso32JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso32JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso33JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso33JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso33JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso33JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso34JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso34JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso34JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso34JFT().setEnabled(false);
					viewBaiaAmostrados.getPeso35JFT().setEnabled(true);
					viewBaiaAmostrados.getPeso35JFT().requestFocus();
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getPeso35JFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewBaiaAmostrados.getPeso35JFT().setEnabled(false);
					if (usarColunaExtra) {
						viewBaiaAmostrados.getNasa31JFT().setEnabled(true);
						viewBaiaAmostrados.getNasa31JFT().requestFocus();
					} else {
						popularListaAmostrados();
						String msg = bo.verificaAmostrados(amostrados);
						if (msg != null && msg.length() != 0) {
							amostrados = new ArrayList<>();
							fluxoProblemaDigitacao();
						} else {
							viewBaiaAmostrados.getControleJFT().setEnabled(true);
							viewBaiaAmostrados.getControleJFT().grabFocus();
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewBaiaAmostrados.getControleJFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					if (Integer.parseInt(viewBaiaAmostrados.getControleJFT().getText()) == calculaTotalControle()) {
							viewBaiaAmostrados.getControleJFT().setEnabled(false);
							addAmostradosExperimento();
							updateHist();
							fluxoContinuarDigitacao();
							amostrados = new ArrayList<>();
							viewBaiaAmostrados.getRegistrosLabel().setVisible(true);
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
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewBaiaAmostrados.getBaia1JFT())) {
			Component prev = viewBaiaAmostrados.getFocusTraversalPolicy().getComponentBefore(viewBaiaAmostrados,
					(JFormattedTextField) src);
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
		} else {
			order = new ArrayList<>();
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
			order.add(viewBaiaAmostrados.getControleJFT());

			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			viewBaiaAmostrados.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
		}
	}

	private Integer calculaTotalControle() {
		int controle = 0;
		for (BaiaAmostradosVOP a : amostrados) {
			if (a.getNasa() % 2 != 0) {
				controle += a.getNrBaia();
				controle += a.getNasa();
				controle += a.getPeso();
			} else {
				controle += a.getNasa();
				controle += a.getPeso();
			}
		}
		return controle;
	}

	private void fluxoProblemaDigitacao() {
		viewBaiaAmostrados.getBaiaAmostradosJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
		viewBaiaAmostrados.getBaia1JFT().grabFocus();
	}

	private void fluxoContinuarDigitacao() {
		viewBaiaAmostrados.getBaiaAmostradosJP().setBorder(defaultBorder);
		viewBaiaAmostrados.getBaia1JFT().setEnabled(true);
		viewBaiaAmostrados.getBaia1JFT().grabFocus();
	}

	private void updateHist() {
		viewBaiaAmostrados.getOrdemHist1Label().setText(viewBaiaAmostrados.getOrdem1JFT().getText());
		viewBaiaAmostrados.getOrdemHist2Label().setText(viewBaiaAmostrados.getOrdem2JFT().getText());
		viewBaiaAmostrados.getOrdemHist3Label().setText(viewBaiaAmostrados.getOrdem3JFT().getText());
		viewBaiaAmostrados.getOrdemHist4Label().setText(viewBaiaAmostrados.getOrdem4JFT().getText());
		viewBaiaAmostrados.getOrdemHist5Label().setText(viewBaiaAmostrados.getOrdem5JFT().getText());
		viewBaiaAmostrados.getBaiaHist1Label().setText(viewBaiaAmostrados.getBaia1JFT().getText());
		viewBaiaAmostrados.getBaiaHist2Label().setText(viewBaiaAmostrados.getBaia2JFT().getText());
		viewBaiaAmostrados.getBaiaHist3Label().setText(viewBaiaAmostrados.getBaia3JFT().getText());
		viewBaiaAmostrados.getBaiaHist4Label().setText(viewBaiaAmostrados.getBaia4JFT().getText());
		viewBaiaAmostrados.getBaiaHist5Label().setText(viewBaiaAmostrados.getBaia5JFT().getText());
		viewBaiaAmostrados.getNasa1Hist1Label().setText(viewBaiaAmostrados.getNasa11JFT().getText());
		viewBaiaAmostrados.getNasa1Hist2Label().setText(viewBaiaAmostrados.getNasa12JFT().getText());
		viewBaiaAmostrados.getNasa1Hist3Label().setText(viewBaiaAmostrados.getNasa13JFT().getText());
		viewBaiaAmostrados.getNasa1Hist4Label().setText(viewBaiaAmostrados.getNasa14JFT().getText());
		viewBaiaAmostrados.getNasa1Hist5Label().setText(viewBaiaAmostrados.getNasa15JFT().getText());
		viewBaiaAmostrados.getPeso1Hist1Label().setText(viewBaiaAmostrados.getPeso11JFT().getText());
		viewBaiaAmostrados.getPeso1Hist2Label().setText(viewBaiaAmostrados.getPeso12JFT().getText());
		viewBaiaAmostrados.getPeso1Hist3Label().setText(viewBaiaAmostrados.getPeso13JFT().getText());
		viewBaiaAmostrados.getPeso1Hist4Label().setText(viewBaiaAmostrados.getPeso14JFT().getText());
		viewBaiaAmostrados.getPeso1Hist5Label().setText(viewBaiaAmostrados.getPeso15JFT().getText());
		viewBaiaAmostrados.getNasa2Hist1Label().setText(viewBaiaAmostrados.getNasa21JFT().getText());
		viewBaiaAmostrados.getNasa2Hist2Label().setText(viewBaiaAmostrados.getNasa22JFT().getText());
		viewBaiaAmostrados.getNasa2Hist3Label().setText(viewBaiaAmostrados.getNasa23JFT().getText());
		viewBaiaAmostrados.getNasa2Hist4Label().setText(viewBaiaAmostrados.getNasa24JFT().getText());
		viewBaiaAmostrados.getNasa2Hist5Label().setText(viewBaiaAmostrados.getNasa25JFT().getText());
		viewBaiaAmostrados.getPeso2Hist1Label().setText(viewBaiaAmostrados.getPeso21JFT().getText());
		viewBaiaAmostrados.getPeso2Hist2Label().setText(viewBaiaAmostrados.getPeso22JFT().getText());
		viewBaiaAmostrados.getPeso2Hist3Label().setText(viewBaiaAmostrados.getPeso23JFT().getText());
		viewBaiaAmostrados.getPeso2Hist4Label().setText(viewBaiaAmostrados.getPeso24JFT().getText());
		viewBaiaAmostrados.getPeso2Hist5Label().setText(viewBaiaAmostrados.getPeso25JFT().getText());
		viewBaiaAmostrados.getBaia1JFT().setText("");
		viewBaiaAmostrados.getBaia2JFT().setText("");
		viewBaiaAmostrados.getBaia3JFT().setText("");
		viewBaiaAmostrados.getBaia4JFT().setText("");
		viewBaiaAmostrados.getBaia5JFT().setText("");
		viewBaiaAmostrados.getNasa11JFT().setText("");
		viewBaiaAmostrados.getNasa12JFT().setText("");
		viewBaiaAmostrados.getNasa13JFT().setText("");
		viewBaiaAmostrados.getNasa14JFT().setText("");
		viewBaiaAmostrados.getNasa15JFT().setText("");
		viewBaiaAmostrados.getPeso11JFT().setText("");
		viewBaiaAmostrados.getPeso12JFT().setText("");
		viewBaiaAmostrados.getPeso13JFT().setText("");
		viewBaiaAmostrados.getPeso14JFT().setText("");
		viewBaiaAmostrados.getPeso15JFT().setText("");
		viewBaiaAmostrados.getNasa21JFT().setText("");
		viewBaiaAmostrados.getNasa22JFT().setText("");
		viewBaiaAmostrados.getNasa23JFT().setText("");
		viewBaiaAmostrados.getNasa24JFT().setText("");
		viewBaiaAmostrados.getNasa25JFT().setText("");
		viewBaiaAmostrados.getPeso21JFT().setText("");
		viewBaiaAmostrados.getPeso22JFT().setText("");
		viewBaiaAmostrados.getPeso23JFT().setText("");
		viewBaiaAmostrados.getPeso24JFT().setText("");
		viewBaiaAmostrados.getPeso25JFT().setText("");
		if (usarColunaExtra) {
			viewBaiaAmostrados.getNasa3Hist1Label().setText(viewBaiaAmostrados.getNasa31JFT().getText());
			viewBaiaAmostrados.getNasa3Hist2Label().setText(viewBaiaAmostrados.getNasa32JFT().getText());
			viewBaiaAmostrados.getNasa3Hist3Label().setText(viewBaiaAmostrados.getNasa33JFT().getText());
			viewBaiaAmostrados.getNasa3Hist4Label().setText(viewBaiaAmostrados.getNasa34JFT().getText());
			viewBaiaAmostrados.getNasa3Hist5Label().setText(viewBaiaAmostrados.getNasa35JFT().getText());
			viewBaiaAmostrados.getPeso3Hist1Label().setText(viewBaiaAmostrados.getPeso31JFT().getText());
			viewBaiaAmostrados.getPeso3Hist2Label().setText(viewBaiaAmostrados.getPeso32JFT().getText());
			viewBaiaAmostrados.getPeso3Hist3Label().setText(viewBaiaAmostrados.getPeso33JFT().getText());
			viewBaiaAmostrados.getPeso3Hist4Label().setText(viewBaiaAmostrados.getPeso34JFT().getText());
			viewBaiaAmostrados.getPeso3Hist5Label().setText(viewBaiaAmostrados.getPeso35JFT().getText());
			viewBaiaAmostrados.getNasa31JFT().setText("");
			viewBaiaAmostrados.getNasa32JFT().setText("");
			viewBaiaAmostrados.getNasa33JFT().setText("");
			viewBaiaAmostrados.getNasa34JFT().setText("");
			viewBaiaAmostrados.getNasa35JFT().setText("");
			viewBaiaAmostrados.getPeso31JFT().setText("");
			viewBaiaAmostrados.getPeso32JFT().setText("");
			viewBaiaAmostrados.getPeso33JFT().setText("");
			viewBaiaAmostrados.getPeso34JFT().setText("");
			viewBaiaAmostrados.getPeso35JFT().setText("");
		}
		viewBaiaAmostrados.getControleJFT().setText("000000");
		atualizaOrdemBaiaAmostrados();
	}

	private void atualizaOrdemBaiaAmostrados() {
		List<JFormattedTextField> ordens = new ArrayList<>();
		ordens.add(viewBaiaAmostrados.getOrdem1JFT());
		ordens.add(viewBaiaAmostrados.getOrdem2JFT());
		ordens.add(viewBaiaAmostrados.getOrdem3JFT());
		ordens.add(viewBaiaAmostrados.getOrdem4JFT());
		ordens.add(viewBaiaAmostrados.getOrdem5JFT());

		for (JFormattedTextField o : ordens) {
			ordem++;
			o.setText("" + String.valueOf(ordem));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED && e.getSource() == viewBaiaAmostrados.getCheckColunaExtra()) {
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
			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
			orderAux.add(viewBaiaAmostrados.getNasa11JFT());
			orderAux.add(viewBaiaAmostrados.getPeso11JFT());
			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
			orderAux.add(viewBaiaAmostrados.getNasa21JFT());
			orderAux.add(viewBaiaAmostrados.getPeso21JFT());

			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
			orderAux.add(viewBaiaAmostrados.getNasa12JFT());
			orderAux.add(viewBaiaAmostrados.getPeso12JFT());
			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
			orderAux.add(viewBaiaAmostrados.getNasa22JFT());
			orderAux.add(viewBaiaAmostrados.getPeso22JFT());

			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
			orderAux.add(viewBaiaAmostrados.getNasa13JFT());
			orderAux.add(viewBaiaAmostrados.getPeso13JFT());
			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
			orderAux.add(viewBaiaAmostrados.getNasa23JFT());
			orderAux.add(viewBaiaAmostrados.getPeso23JFT());

			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
			orderAux.add(viewBaiaAmostrados.getNasa14JFT());
			orderAux.add(viewBaiaAmostrados.getPeso14JFT());
			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
			orderAux.add(viewBaiaAmostrados.getNasa24JFT());
			orderAux.add(viewBaiaAmostrados.getPeso24JFT());

			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
			orderAux.add(viewBaiaAmostrados.getNasa15JFT());
			orderAux.add(viewBaiaAmostrados.getPeso15JFT());
			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
			orderAux.add(viewBaiaAmostrados.getNasa25JFT());
			orderAux.add(viewBaiaAmostrados.getPeso25JFT());
		} else {
			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
			orderAux.add(viewBaiaAmostrados.getNasa11JFT());
			orderAux.add(viewBaiaAmostrados.getPeso11JFT());
			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
			orderAux.add(viewBaiaAmostrados.getNasa21JFT());
			orderAux.add(viewBaiaAmostrados.getPeso21JFT());
			orderAux.add(viewBaiaAmostrados.getBaia1JFT());
			orderAux.add(viewBaiaAmostrados.getNasa31JFT());
			orderAux.add(viewBaiaAmostrados.getPeso31JFT());

			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
			orderAux.add(viewBaiaAmostrados.getNasa12JFT());
			orderAux.add(viewBaiaAmostrados.getPeso12JFT());
			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
			orderAux.add(viewBaiaAmostrados.getNasa22JFT());
			orderAux.add(viewBaiaAmostrados.getPeso22JFT());
			orderAux.add(viewBaiaAmostrados.getBaia2JFT());
			orderAux.add(viewBaiaAmostrados.getNasa32JFT());
			orderAux.add(viewBaiaAmostrados.getPeso32JFT());

			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
			orderAux.add(viewBaiaAmostrados.getNasa13JFT());
			orderAux.add(viewBaiaAmostrados.getPeso13JFT());
			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
			orderAux.add(viewBaiaAmostrados.getNasa23JFT());
			orderAux.add(viewBaiaAmostrados.getPeso23JFT());
			orderAux.add(viewBaiaAmostrados.getBaia3JFT());
			orderAux.add(viewBaiaAmostrados.getNasa33JFT());
			orderAux.add(viewBaiaAmostrados.getPeso33JFT());

			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
			orderAux.add(viewBaiaAmostrados.getNasa14JFT());
			orderAux.add(viewBaiaAmostrados.getPeso14JFT());
			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
			orderAux.add(viewBaiaAmostrados.getNasa24JFT());
			orderAux.add(viewBaiaAmostrados.getPeso24JFT());
			orderAux.add(viewBaiaAmostrados.getBaia4JFT());
			orderAux.add(viewBaiaAmostrados.getNasa34JFT());
			orderAux.add(viewBaiaAmostrados.getPeso34JFT());

			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
			orderAux.add(viewBaiaAmostrados.getNasa15JFT());
			orderAux.add(viewBaiaAmostrados.getPeso15JFT());
			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
			orderAux.add(viewBaiaAmostrados.getNasa25JFT());
			orderAux.add(viewBaiaAmostrados.getPeso25JFT());
			orderAux.add(viewBaiaAmostrados.getBaia5JFT());
			orderAux.add(viewBaiaAmostrados.getNasa35JFT());
			orderAux.add(viewBaiaAmostrados.getPeso35JFT());
		}
	}

	private void loadHist() {
		if (!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().isEmpty()) {
			List<BaiaAmostradosVOP> amostradosHist = new ArrayList<>();
			amostradosHist
					.addAll(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados());
			if (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBaiaAmostrados().get(2)
					.getNrBaia() == controller.getModel().getExperimentoVO().getAbates().get(abate - 1)
							.getBaiaAmostrados().get(0).getNrBaia()) {
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

		labelsOrdem.add(viewBaiaAmostrados.getOrdemHist1Label());
		labelsOrdem.add(viewBaiaAmostrados.getOrdemHist2Label());
		labelsOrdem.add(viewBaiaAmostrados.getOrdemHist3Label());
		labelsOrdem.add(viewBaiaAmostrados.getOrdemHist4Label());
		labelsOrdem.add(viewBaiaAmostrados.getOrdemHist5Label());

		if (size == 2) {
			labels.add(viewBaiaAmostrados.getPeso2Hist5Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist5Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist5Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist5Label());
			labels.add(viewBaiaAmostrados.getBaiaHist5Label());

			labels.add(viewBaiaAmostrados.getPeso2Hist4Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist4Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist4Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist4Label());
			labels.add(viewBaiaAmostrados.getBaiaHist4Label());

			labels.add(viewBaiaAmostrados.getPeso2Hist3Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist3Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist3Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist3Label());
			labels.add(viewBaiaAmostrados.getBaiaHist3Label());

			labels.add(viewBaiaAmostrados.getPeso2Hist2Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist2Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist2Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist2Label());
			labels.add(viewBaiaAmostrados.getBaiaHist2Label());

			labels.add(viewBaiaAmostrados.getPeso2Hist1Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist1Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist1Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist1Label());
			labels.add(viewBaiaAmostrados.getBaiaHist1Label());
		} else {
			labels.add(viewBaiaAmostrados.getPeso3Hist5Label());
			labels.add(viewBaiaAmostrados.getNasa3Hist5Label());
			labels.add(viewBaiaAmostrados.getPeso2Hist5Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist5Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist5Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist5Label());
			labels.add(viewBaiaAmostrados.getBaiaHist5Label());

			labels.add(viewBaiaAmostrados.getPeso3Hist4Label());
			labels.add(viewBaiaAmostrados.getNasa3Hist4Label());
			labels.add(viewBaiaAmostrados.getPeso2Hist4Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist4Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist4Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist4Label());
			labels.add(viewBaiaAmostrados.getBaiaHist4Label());

			labels.add(viewBaiaAmostrados.getPeso3Hist3Label());
			labels.add(viewBaiaAmostrados.getNasa3Hist3Label());
			labels.add(viewBaiaAmostrados.getPeso2Hist3Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist3Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist3Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist3Label());
			labels.add(viewBaiaAmostrados.getBaiaHist3Label());

			labels.add(viewBaiaAmostrados.getPeso3Hist2Label());
			labels.add(viewBaiaAmostrados.getNasa3Hist2Label());
			labels.add(viewBaiaAmostrados.getPeso2Hist2Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist2Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist2Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist2Label());
			labels.add(viewBaiaAmostrados.getBaiaHist2Label());

			labels.add(viewBaiaAmostrados.getPeso3Hist1Label());
			labels.add(viewBaiaAmostrados.getNasa3Hist1Label());
			labels.add(viewBaiaAmostrados.getPeso2Hist1Label());
			labels.add(viewBaiaAmostrados.getNasa2Hist1Label());
			labels.add(viewBaiaAmostrados.getPeso1Hist1Label());
			labels.add(viewBaiaAmostrados.getNasa1Hist1Label());
			labels.add(viewBaiaAmostrados.getBaiaHist1Label());

			labels.add(viewBaiaAmostrados.getBaiaHist5Label());
			labels.add(viewBaiaAmostrados.getBaiaHist4Label());
			labels.add(viewBaiaAmostrados.getBaiaHist3Label());
			labels.add(viewBaiaAmostrados.getBaiaHist2Label());
			labels.add(viewBaiaAmostrados.getBaiaHist1Label());
		}

	}

}
