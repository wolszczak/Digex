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
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.peru.model.dao.ModelStateDAOP;
import brf.peru.model.vo.CamaraVOP;
import brf.peru.model.vo.ConeVOP;
import brf.peru.view.ViewConeP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerConeP extends KeyAdapter implements FocusListener {
	private ControllerP controller;
	private ModelStateDAOP dao;
	private ViewConeP viewCone;
	private List<ConeVOP> conesTemp;
	private String aviario, dataAbate;
	private int abate, idadeAbate, camara, cone, ordem;
	private Border defaultBorder;
	private List<Component> order, orderAux;

	public ControllerConeP(ControllerP c) {
		controller = c;
	}

	public void openWindow(String aviario, Integer abate, Integer idadeAbate, String dataAbate, Integer camara,
			Integer cone) {
		this.dao = new ModelStateDAOP(controller.getModel());
		this.aviario = aviario;
		this.camara = camara;
		this.abate = abate;
		this.idadeAbate = idadeAbate;
		this.dataAbate = dataAbate;
		this.cone = cone;
		conesTemp = new ArrayList<>();

		viewCone = new ViewConeP();
		viewCone.setTitle("DIGEX - Peru");
		viewCone.setResizable(false);
		viewCone.setLocationRelativeTo(null);
		viewCone.setVisible(true);
		viewCone.getRegistrosLabel().setVisible(false);
		viewCone.getControleJFT().setText("000000");
		defaultBorder = viewCone.getConeJP().getBorder();
		viewCone.getAviarioJFT().setText(aviario);
		viewCone.getAbateJFT().setText(String.valueOf(abate));
		viewCone.getIdadeJFT().setText(String.valueOf(idadeAbate));
		viewCone.getDataAbateJFT().setText(dataAbate);
		viewCone.getCamaraJFT().setText(String.valueOf(camara));
		viewCone.getConeJFT().setText(String.valueOf(cone));
		viewCone.getNumero1JFT().setEnabled(true);
		viewCone.getNumero1JFT().grabFocus();

		criarOrdemComponentes();
		criarOrdemComponentesAux();
		loadHist();
		atualizaOrdem();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewCone, "Deseja realmente voltar para tela anterior?",
					"Digex - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewCone.setVisible(false);
				controller.startCamaras(Integer.valueOf(aviario), abate, idadeAbate, dataAbate, camara);
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == viewCone.getNumero1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCone.getRegistrosLabel().setVisible(false);
				viewCone.getNumero1JFT().setEnabled(false);
				viewCone.getNumero2JFT().setEnabled(true);
				viewCone.getNumero2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getNumero2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCone.getNumero2JFT().setEnabled(false);
				viewCone.getNumero3JFT().setEnabled(true);
				viewCone.getNumero3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getNumero3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCone.getNumero3JFT().setEnabled(false);
				viewCone.getNumero4JFT().setEnabled(true);
				viewCone.getNumero4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getNumero4JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCone.getNumero4JFT().setEnabled(false);
				viewCone.getNumero5JFT().setEnabled(true);
				viewCone.getNumero5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getNumero5JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewCone.getNumero5JFT().setEnabled(false);
				viewCone.getpGord1JFT().setEnabled(true);
				viewCone.getpGord1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpGord1JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewCone.getpGord1JFT().setEnabled(false);
				viewCone.getpGord2JFT().setEnabled(true);
				viewCone.getpGord2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpGord2JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewCone.getpGord2JFT().setEnabled(false);
				viewCone.getpGord3JFT().setEnabled(true);
				viewCone.getpGord3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpGord3JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewCone.getpGord3JFT().setEnabled(false);
				viewCone.getpGord4JFT().setEnabled(true);
				viewCone.getpGord4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpGord4JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewCone.getpGord4JFT().setEnabled(false);
				viewCone.getpGord5JFT().setEnabled(true);
				viewCone.getpGord5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpGord5JFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewCone.getpGord5JFT().setEnabled(false);
				viewCone.getpPeito11JFT().setEnabled(true);
				viewCone.getpPeito11JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpPeito11JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpPeito11JFT().setEnabled(false);
				viewCone.getpPeito12JFT().setEnabled(true);
				viewCone.getpPeito12JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpPeito12JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpPeito12JFT().setEnabled(false);
				viewCone.getpPeito13JFT().setEnabled(true);
				viewCone.getpPeito13JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpPeito13JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpPeito13JFT().setEnabled(false);
				viewCone.getpPeito14JFT().setEnabled(true);
				viewCone.getpPeito14JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpPeito14JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpPeito14JFT().setEnabled(false);
				viewCone.getpPeito15JFT().setEnabled(true);
				viewCone.getpPeito15JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpPeito15JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpPeito15JFT().setEnabled(false);
				viewCone.getpCoxa1JFT().setEnabled(true);
				viewCone.getpCoxa1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpCoxa1JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpCoxa1JFT().setEnabled(false);
				viewCone.getpCoxa2JFT().setEnabled(true);
				viewCone.getpCoxa2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpCoxa2JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpCoxa2JFT().setEnabled(false);
				viewCone.getpCoxa3JFT().setEnabled(true);
				viewCone.getpCoxa3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpCoxa3JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpCoxa3JFT().setEnabled(false);
				viewCone.getpCoxa4JFT().setEnabled(true);
				viewCone.getpCoxa4JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpCoxa4JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				viewCone.getpCoxa4JFT().setEnabled(false);
				viewCone.getpCoxa5JFT().setEnabled(true);
				viewCone.getpCoxa5JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getpCoxa5JFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				// Adicionar valores nos objetos e popular lista
				popularListaCones();
				viewCone.getpCoxa5JFT().setEnabled(false);
				viewCone.getControleJFT().setEnabled(true);
				viewCone.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewCone.getControleJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (Integer.parseInt(viewCone.getControleJFT().getText()) == calculaTotalControle()) {
					viewCone.getConeJP().setBorder(defaultBorder);
					controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().addAll(conesTemp);
					dao.saveModelState(false);
					conesTemp = new ArrayList<>();
					atualizaHist();
					viewCone.getControleJFT().setText("000000");
					viewCone.getControleJFT().setEnabled(false);
					viewCone.getNumero1JFT().setEnabled(true);
					viewCone.getNumero1JFT().grabFocus();
					viewCone.getRegistrosLabel().setVisible(true);
				} else {
					viewCone.getConeJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					conesTemp = new ArrayList<>();
					viewCone.getControleJFT().setEnabled(false);
					viewCone.getNumero1JFT().setEnabled(true);
					viewCone.getNumero1JFT().grabFocus();
				}
			}
		}
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	@Override
	public void focusLost(FocusEvent e) {

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
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewCone.getCamaraJFT())) {
			Component prev = viewCone.getFocusTraversalPolicy().getComponentBefore(viewCone, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(viewCone.getCamaraJFT());
		order.add(viewCone.getNumero1JFT());
		order.add(viewCone.getNumero2JFT());
		order.add(viewCone.getNumero3JFT());
		order.add(viewCone.getNumero4JFT());
		order.add(viewCone.getNumero5JFT());
		order.add(viewCone.getpGord1JFT());
		order.add(viewCone.getpGord2JFT());
		order.add(viewCone.getpGord3JFT());
		order.add(viewCone.getpGord4JFT());
		order.add(viewCone.getpGord5JFT());
		order.add(viewCone.getpPeito11JFT());
		order.add(viewCone.getpPeito12JFT());
		order.add(viewCone.getpPeito13JFT());
		order.add(viewCone.getpPeito14JFT());
		order.add(viewCone.getpPeito15JFT());
		order.add(viewCone.getpCoxa1JFT());
		order.add(viewCone.getpCoxa2JFT());
		order.add(viewCone.getpCoxa3JFT());
		order.add(viewCone.getpCoxa4JFT());
		order.add(viewCone.getpCoxa5JFT());
		order.add(viewCone.getControleJFT());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewCone.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	private void criarOrdemComponentesAux() {
		orderAux = new ArrayList<>();
		orderAux.add(viewCone.getNumHist5Label());
		orderAux.add(viewCone.getpGordHist5Label());
		orderAux.add(viewCone.getpPeito1Hist5Label());
		orderAux.add(viewCone.getpCoxaHist5Label());
		orderAux.add(viewCone.getNumHist4Label());
		orderAux.add(viewCone.getpGordHist4Label());
		orderAux.add(viewCone.getpPeito1Hist4Label());
		orderAux.add(viewCone.getpCoxaHist4Label());
		orderAux.add(viewCone.getNumHist3Label());
		orderAux.add(viewCone.getpGordHist3Label());
		orderAux.add(viewCone.getpPeito1Hist3Label());
		orderAux.add(viewCone.getpCoxaHist3Label());
		orderAux.add(viewCone.getNumHist2Label());
		orderAux.add(viewCone.getpGordHist2Label());
		orderAux.add(viewCone.getpPeito1Hist2Label());
		orderAux.add(viewCone.getpCoxaHist2Label());
		orderAux.add(viewCone.getNumHist1Label());
		orderAux.add(viewCone.getpGordHist1Label());
		orderAux.add(viewCone.getpPeito1Hist1Label());
		orderAux.add(viewCone.getpCoxaHist1Label());
	}

	private void atualizaOrdem() {
		List<JFormattedTextField> ordens = new ArrayList<>();
		ordens.add(viewCone.getOrdem1JFT());
		ordens.add(viewCone.getOrdem2JFT());
		ordens.add(viewCone.getOrdem3JFT());
		ordens.add(viewCone.getOrdem4JFT());
		ordens.add(viewCone.getOrdem5JFT());

		for (JFormattedTextField o : ordens) {
			ordem++;
			o.setText("" + String.valueOf(ordem));
		}
	}

	private void loadHist() {
		boolean key = false;
		if (!controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().isEmpty()) {
			for (int i = controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones()
					.size(); i > 0; i--) {
				if (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().get(i - 1)
						.getAbate() == abate
						&& controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().get(i - 1)
								.getCamara() == camara
						&& controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getCones().get(i - 1)
								.getNcone() == cone) {
					key = true;
					ordem++;
					JLabel lbl1 = (JLabel) orderAux.get(0);
					lbl1.setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates().get(abate - 1)
							.getCones().get(i - 1).getNasa()));
					orderAux.remove(0);

					JLabel lbl2 = (JLabel) orderAux.get(0);
					lbl2.setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates().get(abate - 1)
							.getCones().get(i - 1).getpGordura()));
					orderAux.remove(0);

					JLabel lbl3 = (JLabel) orderAux.get(0);
					lbl3.setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates().get(abate - 1)
							.getCones().get(i - 1).getpPeito1()));
					orderAux.remove(0);

					JLabel lbl4 = (JLabel) orderAux.get(0);
					lbl4.setText(String.valueOf(controller.getModel().getExperimentoVO().getAbates().get(abate - 1)
							.getCones().get(i - 1).getPesoSobreCoxa()));
					orderAux.remove(0);
					if (orderAux.size() == 0) {
						break;
					}
				}
			}
			if (key) {
				int aux = ordem;
				viewCone.getOrdemHist5Label().setText(String.valueOf(aux));
				aux--;
				viewCone.getOrdemHist4Label().setText(String.valueOf(aux));
				aux--;
				viewCone.getOrdemHist3Label().setText(String.valueOf(aux));
				aux--;
				viewCone.getOrdemHist2Label().setText(String.valueOf(aux));
				aux--;
				viewCone.getOrdemHist1Label().setText(String.valueOf(aux));
				criarOrdemComponentesAux();
			}
		} else {
			viewCone.getNumHist1Label().setText("");
			viewCone.getNumHist2Label().setText("");
			viewCone.getNumHist3Label().setText("");
			viewCone.getNumHist4Label().setText("");
			viewCone.getNumHist5Label().setText("");
			viewCone.getpGord1JFT().setText("");
			viewCone.getpGord2JFT().setText("");
			viewCone.getpGord3JFT().setText("");
			viewCone.getpGord4JFT().setText("");
			viewCone.getpGord5JFT().setText("");
			viewCone.getpPeito11JFT().setText("");
			viewCone.getpPeito12JFT().setText("");
			viewCone.getpPeito13JFT().setText("");
			viewCone.getpPeito14JFT().setText("");
			viewCone.getpPeito15JFT().setText("");
			viewCone.getpCoxa1JFT().setText("");
			viewCone.getpCoxa2JFT().setText("");
			viewCone.getpCoxa3JFT().setText("");
			viewCone.getpCoxa4JFT().setText("");
			viewCone.getpCoxa5JFT().setText("");
		}
	}

	private Integer calculaTotalControle() {
		int controle = 0;
		for (ConeVOP c : conesTemp) {
			controle += c.getNasa();
			controle += c.getpGordura();
			controle += c.getpPeito1();
			controle += c.getPesoSobreCoxa();
		}
		return controle;
	}

	private void atualizaHist() {
		viewCone.getOrdemHist1Label().setText(viewCone.getOrdem1JFT().getText());
		viewCone.getOrdemHist2Label().setText(viewCone.getOrdem2JFT().getText());
		viewCone.getOrdemHist3Label().setText(viewCone.getOrdem3JFT().getText());
		viewCone.getOrdemHist4Label().setText(viewCone.getOrdem4JFT().getText());
		viewCone.getOrdemHist5Label().setText(viewCone.getOrdem5JFT().getText());
		viewCone.getNumHist1Label().setText(viewCone.getNumero1JFT().getText());
		viewCone.getNumHist2Label().setText(viewCone.getNumero2JFT().getText());
		viewCone.getNumHist3Label().setText(viewCone.getNumero3JFT().getText());
		viewCone.getNumHist4Label().setText(viewCone.getNumero4JFT().getText());
		viewCone.getNumHist5Label().setText(viewCone.getNumero5JFT().getText());
		viewCone.getpGordHist1Label().setText(viewCone.getpGord1JFT().getText());
		viewCone.getpGordHist2Label().setText(viewCone.getpGord2JFT().getText());
		viewCone.getpGordHist3Label().setText(viewCone.getpGord3JFT().getText());
		viewCone.getpGordHist4Label().setText(viewCone.getpGord4JFT().getText());
		viewCone.getpGordHist5Label().setText(viewCone.getpGord5JFT().getText());
		viewCone.getpPeito1Hist1Label().setText(viewCone.getpPeito11JFT().getText());
		viewCone.getpPeito1Hist2Label().setText(viewCone.getpPeito12JFT().getText());
		viewCone.getpPeito1Hist3Label().setText(viewCone.getpPeito13JFT().getText());
		viewCone.getpPeito1Hist4Label().setText(viewCone.getpPeito14JFT().getText());
		viewCone.getpPeito1Hist5Label().setText(viewCone.getpPeito15JFT().getText());
		viewCone.getpCoxaHist1Label().setText(viewCone.getpCoxa1JFT().getText());
		viewCone.getpCoxaHist2Label().setText(viewCone.getpCoxa2JFT().getText());
		viewCone.getpCoxaHist3Label().setText(viewCone.getpCoxa3JFT().getText());
		viewCone.getpCoxaHist4Label().setText(viewCone.getpCoxa4JFT().getText());
		viewCone.getpCoxaHist5Label().setText(viewCone.getpCoxa5JFT().getText());
		viewCone.getNumero1JFT().setText("");
		viewCone.getNumero2JFT().setText("");
		viewCone.getNumero3JFT().setText("");
		viewCone.getNumero4JFT().setText("");
		viewCone.getNumero5JFT().setText("");
		viewCone.getpGord1JFT().setText("");
		viewCone.getpGord2JFT().setText("");
		viewCone.getpGord3JFT().setText("");
		viewCone.getpGord4JFT().setText("");
		viewCone.getpGord5JFT().setText("");
		viewCone.getpPeito11JFT().setText("");
		viewCone.getpPeito12JFT().setText("");
		viewCone.getpPeito13JFT().setText("");
		viewCone.getpPeito14JFT().setText("");
		viewCone.getpPeito15JFT().setText("");
		viewCone.getpCoxa1JFT().setText("");
		viewCone.getpCoxa2JFT().setText("");
		viewCone.getpCoxa3JFT().setText("");
		viewCone.getpCoxa4JFT().setText("");
		viewCone.getpCoxa5JFT().setText("");
		atualizaOrdem();
	}

	private void popularListaCones() {
		conesTemp.add(new ConeVOP(abate, camara, cone, Integer.parseInt(viewCone.getNumero1JFT().getText()),
				Integer.parseInt(viewCone.getpGord1JFT().getText()),
				Integer.parseInt(viewCone.getpPeito11JFT().getText()),
				Integer.parseInt(viewCone.getpCoxa1JFT().getText())));
		conesTemp.add(new ConeVOP(abate, camara, cone, Integer.parseInt(viewCone.getNumero2JFT().getText()),
				Integer.parseInt(viewCone.getpGord2JFT().getText()),
				Integer.parseInt(viewCone.getpPeito12JFT().getText()),
				Integer.parseInt(viewCone.getpCoxa2JFT().getText())));
		conesTemp.add(new ConeVOP(abate, camara, cone, Integer.parseInt(viewCone.getNumero3JFT().getText()),
				Integer.parseInt(viewCone.getpGord3JFT().getText()),
				Integer.parseInt(viewCone.getpPeito13JFT().getText()),
				Integer.parseInt(viewCone.getpCoxa3JFT().getText())));
		conesTemp.add(new ConeVOP(abate, camara, cone, Integer.parseInt(viewCone.getNumero4JFT().getText()),
				Integer.parseInt(viewCone.getpGord4JFT().getText()),
				Integer.parseInt(viewCone.getpPeito14JFT().getText()),
				Integer.parseInt(viewCone.getpCoxa4JFT().getText())));
		conesTemp.add(new ConeVOP(abate, camara, cone, Integer.parseInt(viewCone.getNumero5JFT().getText()),
				Integer.parseInt(viewCone.getpGord5JFT().getText()),
				Integer.parseInt(viewCone.getpPeito15JFT().getText()),
				Integer.parseInt(viewCone.getpCoxa5JFT().getText())));
	}

}
