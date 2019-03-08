package brf.frango.controller;

import brf.frango.model.bo.DesempenhoBOF;
import brf.frango.model.vo.DesempenhoVOF;
import brf.frango.model.vo.PesagemVOF;
import brf.frango.model.vo.RmeVOF;
import brf.frango.view.ViewDesempenhoF;
import brf.util.FocusOrderPolicy;
import brf.util.SaveUpdater;
import brf.util.TextFormatter;
import brf.util.Utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class ControllerDesempenhoF extends KeyAdapter implements FocusListener {

	private final ControllerF controller;
	private ViewDesempenhoF viewDesempenho;
	private Border defaultBaiaJP, defaultRmeJP, defaultPesagemJP;
	private int controleBaia, controleRME, controleFornecida, controleSobra, controlePesagem;
	private List<DesempenhoVOF> desempenho;
	private List<RmeVOF> rme;
	private List<RmeVOF> lastHistRME;
	private List<PesagemVOF> pesagem;
	private int ordemRME, ordemP;
	private final DesempenhoBOF desempenhoBO;
	private Utils utils;

	public ControllerDesempenhoF(ControllerF c, DesempenhoBOF desempenhoBO) {
		controller = c;
		this.desempenhoBO = desempenhoBO;
		utils = new Utils();
	}

	public void openWindow() {
		try {
			viewDesempenho = new ViewDesempenhoF();
			viewDesempenho.setTitle("DIGEX - Frango");
			viewDesempenho.setResizable(false);
			viewDesempenho.setLocationRelativeTo(null);
			viewDesempenho.setVisible(true);
			viewDesempenho.getRegistroLabel().setVisible(false);
			viewDesempenho.getAviarioJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getAviario());
			defaultBaiaJP = viewDesempenho.getBaiaJP().getBorder();
			defaultRmeJP = viewDesempenho.getRmeJP().getBorder();
			defaultPesagemJP = viewDesempenho.getPesagemJP().getBorder();

			rme = new ArrayList<>();
			pesagem = new ArrayList<>();
			lastHistRME = new ArrayList<>();

			ordemRME = 1;
			ordemP = 1;
			viewDesempenho.getOrdemRMEJFT().setText("001");
			viewDesempenho.getOrdemPJFT().setText("001");

			List<Component> order = new ArrayList<>();
			order.add(viewDesempenho.getBaiaJFT());
			order.add(viewDesempenho.getSexoJFT());
			order.add(viewDesempenho.getLadoJFT());
			order.add(viewDesempenho.getTrat1JFT());
			order.add(viewDesempenho.getTrat2JFT());
			order.add(viewDesempenho.getAvesAlojadasJFT());
			order.add(viewDesempenho.getControleBaiaJFT());
			order.add(viewDesempenho.getIdadeRacaoJFT());
			order.add(viewDesempenho.getFornecidaJFT());
			order.add(viewDesempenho.getSobraJFT());
			order.add(viewDesempenho.getIdadeMortalidadeJFT());
			order.add(viewDesempenho.getNrMortalidadeJFT());
			order.add(viewDesempenho.getPesoMortalidadeJFT());
			order.add(viewDesempenho.getIdadeEliminadosJFT());
			order.add(viewDesempenho.getNrEliminadosJFT());
			order.add(viewDesempenho.getPesoEliminadosJFT());
			order.add(viewDesempenho.getControleRmeJFT());
			order.add(viewDesempenho.getControleFornecidaJFT());
			order.add(viewDesempenho.getControleSobraJFT());
			order.add(viewDesempenho.getIdadePesagemJFT());
			order.add(viewDesempenho.getNrPesagemJFT());
			order.add(viewDesempenho.getTaraPesagemJFT());
			order.add(viewDesempenho.getPesoAnimais1JFT());
			order.add(viewDesempenho.getPesoAnimais2JFT());
			order.add(viewDesempenho.getNrAmostradosJFT());
			order.add(viewDesempenho.getPesoAmostradosJFT());
			order.add(viewDesempenho.getNrErrosJFT());
			order.add(viewDesempenho.getPesoErrosJFT());
			order.add(viewDesempenho.getNrAleijadosJFT());
			order.add(viewDesempenho.getPesoAleijadosJFT());
			order.add(viewDesempenho.getControlePesagemJFT());
			order.add(viewDesempenho.getOpcaoJFT());
			FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
			viewDesempenho.setFocusTraversalPolicy(newPolicy);
			listenerSetup(order);
			desempenho = controller.getModel().getExperimentoVO().getDesempenho();
		} catch (Exception e) {
			utils.salvarLogErro(e, "Erro no openWindow");
		}
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	public void loadHist() {
		try {
			List<JLabel> histOrdensRME = new ArrayList<>();
			List<JLabel> histIdadeConsumoRME = new ArrayList<>();
			List<JLabel> histFornecidaRME = new ArrayList<>();
			List<JLabel> histSobraRME = new ArrayList<>();
			List<JLabel> histIdadeMortosRME = new ArrayList<>();
			List<JLabel> histNrMortosRME = new ArrayList<>();
			List<JLabel> histPesoMortosRME = new ArrayList<>();
			List<JLabel> histIdadeEliminadosRME = new ArrayList<>();
			List<JLabel> histNrEliminadosRME = new ArrayList<>();
			List<JLabel> histPesoEliminados = new ArrayList<>();

			histOrdensRME.add(viewDesempenho.getOrdemRME1Label());
			histIdadeConsumoRME.add(viewDesempenho.getIdadeRHist1Label());
			histFornecidaRME.add(viewDesempenho.getFornecidaHist1Label());
			histSobraRME.add(viewDesempenho.getSobraHist1Label());
			histIdadeMortosRME.add(viewDesempenho.getIdadeMHist1Label());
			histNrMortosRME.add(viewDesempenho.getNrMHist1Label());
			histPesoMortosRME.add(viewDesempenho.getPesoMHist1Label());
			histIdadeEliminadosRME.add(viewDesempenho.getIdadeElHist1Label());
			histNrEliminadosRME.add(viewDesempenho.getNrElHist1Label());
			histPesoEliminados.add(viewDesempenho.getPesoElHist1Label());

			histOrdensRME.add(viewDesempenho.getOrdemRME2Label());
			histIdadeConsumoRME.add(viewDesempenho.getIdadeRHist2Label());
			histFornecidaRME.add(viewDesempenho.getFornecidaHist2Label());
			histSobraRME.add(viewDesempenho.getSobraHist2Label());
			histIdadeMortosRME.add(viewDesempenho.getIdadeMHist2Label());
			histNrMortosRME.add(viewDesempenho.getNrMHist2Label());
			histPesoMortosRME.add(viewDesempenho.getPesoMHist2Label());
			histIdadeEliminadosRME.add(viewDesempenho.getIdadeElHist2Label());
			histNrEliminadosRME.add(viewDesempenho.getNrElHist2Label());
			histPesoEliminados.add(viewDesempenho.getPesoElHist2Label());

			histOrdensRME.add(viewDesempenho.getOrdemRME3Label());
			histIdadeConsumoRME.add(viewDesempenho.getIdadeRHist3Label());
			histFornecidaRME.add(viewDesempenho.getFornecidaHist3Label());
			histSobraRME.add(viewDesempenho.getSobraHist3Label());
			histIdadeMortosRME.add(viewDesempenho.getIdadeMHist3Label());
			histNrMortosRME.add(viewDesempenho.getNrMHist3Label());
			histPesoMortosRME.add(viewDesempenho.getPesoMHist3Label());
			histIdadeEliminadosRME.add(viewDesempenho.getIdadeElHist3Label());
			histNrEliminadosRME.add(viewDesempenho.getNrElHist3Label());
			histPesoEliminados.add(viewDesempenho.getPesoElHist3Label());

			histOrdensRME.add(viewDesempenho.getOrdemRME4Label());
			histIdadeConsumoRME.add(viewDesempenho.getIdadeRHist4Label());
			histFornecidaRME.add(viewDesempenho.getFornecidaHist4Label());
			histSobraRME.add(viewDesempenho.getSobraHist4Label());
			histIdadeMortosRME.add(viewDesempenho.getIdadeMHist4Label());
			histNrMortosRME.add(viewDesempenho.getNrMHist4Label());
			histPesoMortosRME.add(viewDesempenho.getPesoMHist4Label());
			histIdadeEliminadosRME.add(viewDesempenho.getIdadeElHist4Label());
			histNrEliminadosRME.add(viewDesempenho.getNrElHist4Label());
			histPesoEliminados.add(viewDesempenho.getPesoElHist4Label());

			histOrdensRME.add(viewDesempenho.getOrdemRME5Label());
			histIdadeConsumoRME.add(viewDesempenho.getIdadeRHist5Label());
			histFornecidaRME.add(viewDesempenho.getFornecidaHist5Label());
			histSobraRME.add(viewDesempenho.getSobraHist5Label());
			histIdadeMortosRME.add(viewDesempenho.getIdadeMHist5Label());
			histNrMortosRME.add(viewDesempenho.getNrMHist5Label());
			histPesoMortosRME.add(viewDesempenho.getPesoMHist5Label());
			histIdadeEliminadosRME.add(viewDesempenho.getIdadeElHist5Label());
			histNrEliminadosRME.add(viewDesempenho.getNrElHist5Label());
			histPesoEliminados.add(viewDesempenho.getPesoElHist5Label());

			// Pesagem
			List<JLabel> histOrdensP = new ArrayList<>();
			List<JLabel> histIdadeP = new ArrayList<>();
			List<JLabel> histNrP = new ArrayList<>();
			List<JLabel> histTaraP = new ArrayList<>();
			List<JLabel> histPeso1P = new ArrayList<>();
			List<JLabel> histPeso2P = new ArrayList<>();
			List<JLabel> histNrAmostradosP = new ArrayList<>();
			List<JLabel> histPesoAmostradosP = new ArrayList<>();
			List<JLabel> histNrErrosP = new ArrayList<>();
			List<JLabel> histPesoErrosP = new ArrayList<>();
			List<JLabel> histNrAleijadosP = new ArrayList<>();
			List<JLabel> histPesoAleijadosP = new ArrayList<>();
			List<JLabel> histControleP = new ArrayList<>();

			histOrdensP.add(viewDesempenho.getOrdemP1Label());
			histIdadeP.add(viewDesempenho.getIdadePHist1Label());
			histNrP.add(viewDesempenho.getNrPHist1Label());
			histTaraP.add(viewDesempenho.getTaraHist1Label());
			histPeso1P.add(viewDesempenho.getPeso1Hist1Label());
			histPeso2P.add(viewDesempenho.getPeso2Hist1Label());
			histNrAmostradosP.add(viewDesempenho.getNrAmHist1Label());
			histPesoAmostradosP.add(viewDesempenho.getPesoAmHist1Label());
			histNrErrosP.add(viewDesempenho.getNrErHist1Label());
			histPesoErrosP.add(viewDesempenho.getPesoErHist1Label());
			histNrAleijadosP.add(viewDesempenho.getNrAlHist1Label());
			histPesoAleijadosP.add(viewDesempenho.getPesoAlHist1Label());

			histOrdensP.add(viewDesempenho.getOrdemP2Label());
			histIdadeP.add(viewDesempenho.getIdadePHist2Label());
			histNrP.add(viewDesempenho.getNrPHist2Label());
			histTaraP.add(viewDesempenho.getTaraHist2Label());
			histPeso1P.add(viewDesempenho.getPeso1Hist2Label());
			histPeso2P.add(viewDesempenho.getPeso2Hist2Label());
			histNrAmostradosP.add(viewDesempenho.getNrAmHist2Label());
			histPesoAmostradosP.add(viewDesempenho.getPesoAmHist2Label());
			histNrErrosP.add(viewDesempenho.getNrErHist2Label());
			histPesoErrosP.add(viewDesempenho.getPesoErHist2Label());
			histNrAleijadosP.add(viewDesempenho.getNrAlHist2Label());
			histPesoAleijadosP.add(viewDesempenho.getPesoAlHist2Label());

			histOrdensP.add(viewDesempenho.getOrdemP3Label());
			histIdadeP.add(viewDesempenho.getIdadePHist3Label());
			histNrP.add(viewDesempenho.getNrPHist3Label());
			histTaraP.add(viewDesempenho.getTaraHist3Label());
			histPeso1P.add(viewDesempenho.getPeso1Hist3Label());
			histPeso2P.add(viewDesempenho.getPeso2Hist3Label());
			histNrAmostradosP.add(viewDesempenho.getNrAmHist3Label());
			histPesoAmostradosP.add(viewDesempenho.getPesoAmHist3Label());
			histNrErrosP.add(viewDesempenho.getNrErHist3Label());
			histPesoErrosP.add(viewDesempenho.getPesoErHist3Label());
			histNrAleijadosP.add(viewDesempenho.getNrAlHist3Label());
			histPesoAleijadosP.add(viewDesempenho.getPesoAlHist3Label());

			histOrdensP.add(viewDesempenho.getOrdemP4Label());
			histIdadeP.add(viewDesempenho.getIdadePHist4Label());
			histNrP.add(viewDesempenho.getNrPHist4Label());
			histTaraP.add(viewDesempenho.getTaraHist4Label());
			histPeso1P.add(viewDesempenho.getPeso1Hist4Label());
			histPeso2P.add(viewDesempenho.getPeso2Hist4Label());
			histNrAmostradosP.add(viewDesempenho.getNrAmHist4Label());
			histPesoAmostradosP.add(viewDesempenho.getPesoAmHist4Label());
			histNrErrosP.add(viewDesempenho.getNrErHist4Label());
			histPesoErrosP.add(viewDesempenho.getPesoErHist4Label());
			histNrAleijadosP.add(viewDesempenho.getNrAlHist4Label());
			histPesoAleijadosP.add(viewDesempenho.getPesoAlHist4Label());

			histOrdensP.add(viewDesempenho.getOrdemP5Label());
			histIdadeP.add(viewDesempenho.getIdadePHist5Label());
			histNrP.add(viewDesempenho.getNrPHist5Label());
			histTaraP.add(viewDesempenho.getTaraHist5Label());
			histPeso1P.add(viewDesempenho.getPeso1Hist5Label());
			histPeso2P.add(viewDesempenho.getPeso2Hist5Label());
			histNrAmostradosP.add(viewDesempenho.getNrAmHist5Label());
			histPesoAmostradosP.add(viewDesempenho.getPesoAmHist5Label());
			histNrErrosP.add(viewDesempenho.getNrErHist5Label());
			histPesoErrosP.add(viewDesempenho.getPesoErHist5Label());
			histNrAleijadosP.add(viewDesempenho.getNrAlHist5Label());
			histPesoAleijadosP.add(viewDesempenho.getPesoAlHist5Label());

			System.out.println("size hist RME: " + histOrdensRME.size());
			System.out.println("size hist P: " + histOrdensP.size());

			desempenho = controller.getModel().getExperimentoVO().getDesempenho();
			// Cabeçalho
			if (!desempenho.isEmpty()) {
				System.out.println("nao vazio");
				viewDesempenho.getBaiaJFT().setText("" + desempenho.get(desempenho.size() - 1).getBaia());
				viewDesempenho.getSexoJFT().setText("" + desempenho.get(desempenho.size() - 1).getSexo());
				viewDesempenho.getLadoJFT().setText("" + desempenho.get(desempenho.size() - 1).getLado());
				viewDesempenho.getTrat1JFT().setText("" + desempenho.get(desempenho.size() - 1).getTrat1());
				viewDesempenho.getTrat2JFT().setText("" + desempenho.get(desempenho.size() - 1).getTrat2());
				viewDesempenho.getAvesAlojadasJFT().setText("" + desempenho.get(desempenho.size() - 1).getNrAlojados());
				viewDesempenho.getControleBaiaJFT()
						.setText("" + desempenho.get(desempenho.size() - 1).getControleBaia());
				viewDesempenho.getBaiaJFT().setEnabled(false);
				viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
				viewDesempenho.getIdadeRacaoJFT().grabFocus();
			}
			ordemRME++;
			ordemP++;
			viewDesempenho.getOrdemRMEJFT().setText("" + ordemRME);
			viewDesempenho.getOrdemPJFT().setText("" + ordemP);
			TextFormatter.formatStringJFT(viewDesempenho.getOrdemRMEJFT(), viewDesempenho.getOrdemRMEJFT().getText(),
					3);
			TextFormatter.formatStringJFT(viewDesempenho.getOrdemPJFT(), viewDesempenho.getOrdemPJFT().getText(), 3);
		} catch (Exception e) {
			utils.salvarLogErro(e, "Erro no loadHist");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		try {
			Object src = e.getSource();
			if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewDesempenho.getBaiaJFT())
					&& !e.getSource().equals(viewDesempenho.getIdadeRacaoJFT())
					&& !e.getSource().equals(viewDesempenho.getIdadePesagemJFT())) {
				System.out.println("left");
				Component prev;
				((JFormattedTextField) src).setEnabled(false);
				if (!e.getSource().equals(viewDesempenho.getOpcaoJFT())) {
					prev = viewDesempenho.getFocusTraversalPolicy().getComponentBefore(viewDesempenho,
							(JFormattedTextField) src);
				} else {
					prev = viewDesempenho.getIdadeRacaoJFT();
				}
				prev.setEnabled(true);
				((JFormattedTextField) prev).grabFocus();
			}
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no keyPressed");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		try {
			if ((JFormattedTextField) e.getSource() == viewDesempenho.getOpcaoJFT()) {
				switch (e.getKeyChar()) {
				case KeyEvent.VK_0:
					int n = JOptionPane.showConfirmDialog(viewDesempenho, "Deseja realmente sair do programa?",
							"DIGEX - Sair", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (n == 0) {
						System.out.println("Fim...");
						System.exit(0);
					}
					break;
				case KeyEvent.VK_1:
					System.out.println("próx baia");
					viewDesempenho.setVisible(false);
					openWindow();
					break;
				case KeyEvent.VK_2:
					int option = JOptionPane.showConfirmDialog(viewDesempenho,
							"Deseja realmente voltar para tela principal?", "DIGEX - Finalizar Desempenho",
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (option == 0) {
						viewDesempenho.setVisible(false);
						controller.resumeEscolhaDig();
						System.out.println("Finalizar Desempenho");
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
				int option = JOptionPane.showConfirmDialog(viewDesempenho,
						"Deseja realmente voltar para tela anterior?", "DIGEX - Voltar", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (option == 0) {
					viewDesempenho.setVisible(false);
					controller.resumeEscolhaDig();
					System.out.println("Voltar");
				}
			} else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
				JFormattedTextField src = (JFormattedTextField) e.getSource();
				String text = src.getText();
				if ((JFormattedTextField) e.getSource() == viewDesempenho.getBaiaJFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewDesempenho.getSexoJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getSexoJFT()) {
					TextFormatter.formatStringJFT(src, text, 1);
					viewDesempenho.getLadoJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getLadoJFT()) {
					TextFormatter.formatStringJFT(src, text, 1);
					viewDesempenho.getTrat1JFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getTrat1JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getTrat2JFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getTrat2JFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getAvesAlojadasJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getAvesAlojadasJFT()) {
					TextFormatter.formatStringJFT(src, text, 3);
					viewDesempenho.getControleBaiaJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleBaiaJFT()) {
					TextFormatter.formatStringJFT(src, text, 4);
					controleBaia = Integer.parseInt(viewDesempenho.getControleBaiaJFT().getText());
					int somaControle = Integer.parseInt(viewDesempenho.getAviarioJFT().getText())
							+ Integer.parseInt(viewDesempenho.getBaiaJFT().getText())
							+ Integer.parseInt(viewDesempenho.getSexoJFT().getText())
							+ Integer.parseInt(viewDesempenho.getLadoJFT().getText())
							+ Integer.parseInt(viewDesempenho.getTrat1JFT().getText())
							+ Integer.parseInt(viewDesempenho.getTrat2JFT().getText())
							+ Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText());
					if (controleBaia != somaControle) {
						fluxoProblemaCabecalho();
					} else {
						String msg = desempenhoBO.verificaCabecalho(
								Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
								Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
								Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
								Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()));
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
									JOptionPane.ERROR_MESSAGE);
							fluxoProblemaCabecalho();
						} else if (desempenhoBO
								.isBaiaDigitada(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()))) {
							int option = JOptionPane.showConfirmDialog(viewDesempenho,
									"Baia já digitada.\nDeseja digitar novamente?", "DIGEX - Aviso",
									JOptionPane.WARNING_MESSAGE);
							if (option == 0) {
								desempenhoBO.excluirBaia(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()));
								fluxoOkCabecalho();
							} else {
								fluxoProblemaCabecalho();
							}
						} else {
							fluxoOkCabecalho();
						}
					}
//          RME
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeRacaoJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getFornecidaJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getFornecidaJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getSobraJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getSobraJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeMortalidadeJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getNrMortalidadeJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrMortalidadeJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getPesoMortalidadeJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoMortalidadeJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getIdadeEliminadosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeEliminadosJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getNrEliminadosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrEliminadosJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getPesoEliminadosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoEliminadosJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getControleRmeJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleRmeJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					controleRME = Integer.parseInt(viewDesempenho.getControleRmeJFT().getText());
					int somaControle = Integer.parseInt(viewDesempenho.getIdadeRacaoJFT().getText())
							+ Integer.parseInt(viewDesempenho.getFornecidaJFT().getText())
							+ Integer.parseInt(viewDesempenho.getSobraJFT().getText())
							+ Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText())
							+ Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText());
					if (controleRME != somaControle) {
						fluxoProblemaRME();
					} else {
						String msg = desempenhoBO.verificaRME(rme,
								Integer.parseInt(viewDesempenho.getIdadeRacaoJFT().getText()),
								Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()),
								Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()),
								Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText()),
								Integer.parseInt(viewDesempenho.getFornecidaJFT().getText()),
								Integer.parseInt(viewDesempenho.getSobraJFT().getText()));
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
									JOptionPane.ERROR_MESSAGE);
							fluxoProblemaRME();
						} else if (controleRME == 0) {
							fluxoOkRME();
							lastHistRME.addAll(rme);
						} else {
							rme.add(new RmeVOF(Integer.parseInt(viewDesempenho.getOrdemRMEJFT().getText()),
									Integer.parseInt(viewDesempenho.getIdadeRacaoJFT().getText()),
									Integer.parseInt(viewDesempenho.getFornecidaJFT().getText()),
									Integer.parseInt(viewDesempenho.getSobraJFT().getText()),
									Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText()),
									Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getControleRmeJFT().getText())));
							updateHistRME();
							viewDesempenho.getOrdemRMEJFT().setText("" + (++ordemRME));
							TextFormatter.formatStringJFT(viewDesempenho.getOrdemRMEJFT(),
									viewDesempenho.getOrdemRMEJFT().getText(), 3);
							fluxoContRME();
							System.out.println("próx informação RME");
						}
					}
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleFornecidaJFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					controleFornecida = Integer.parseInt(viewDesempenho.getControleFornecidaJFT().getText());
					int somaFornecida = 0;
					for (RmeVOF r : rme) {
						somaFornecida += r.getFornecida();
					}
					System.out.println("somaFornecida = " + somaFornecida);
					if (controleFornecida != somaFornecida) {
						System.out.println("diferente");
						viewDesempenho.getRmeJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						rme.removeAll(rme);
						recuperaHistRME();
						clearHistRME();
						ordemRME = 1;
						viewDesempenho.getControleFornecidaJFT().setEnabled(false);
						viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
						viewDesempenho.getIdadeRacaoJFT().grabFocus();
					} else {
						viewDesempenho.getRmeJP().setBorder(defaultRmeJP);
						viewDesempenho.getControleFornecidaJFT().setEnabled(false);
						viewDesempenho.getControleSobraJFT().setEnabled(true);
						viewDesempenho.getControleSobraJFT().grabFocus();
					}
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleSobraJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					controleSobra = Integer.parseInt(viewDesempenho.getControleSobraJFT().getText());
					int somaSobra = 0;
					for (RmeVOF r : rme) {
						somaSobra += r.getSobra();
					}
					System.out.println("somaSobra = " + somaSobra);
					if (controleSobra != somaSobra) {
						System.out.println("diferente");
						viewDesempenho.getRmeJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
						rme.removeAll(rme);
						recuperaHistRME();
						clearHistRME();
						ordemRME = 1;
						viewDesempenho.getControleSobraJFT().setEnabled(false);
						viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
						viewDesempenho.getIdadeRacaoJFT().grabFocus();
					} else {
						viewDesempenho.getRmeJP().setBorder(defaultRmeJP);
						viewDesempenho.getControleSobraJFT().setEnabled(false);
						viewDesempenho.getIdadePesagemJFT().setEnabled(true);
						viewDesempenho.getIdadePesagemJFT().grabFocus();
					}
					// Pesagem
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadePesagemJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getNrPesagemJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrPesagemJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getTaraPesagemJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getTaraPesagemJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getPesoAnimais1JFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoAnimais1JFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					viewDesempenho.getPesoAnimais2JFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoAnimais2JFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					viewDesempenho.getNrAmostradosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrAmostradosJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getPesoAmostradosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoAmostradosJFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					viewDesempenho.getNrErrosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrErrosJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getPesoErrosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoErrosJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getNrAleijadosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrAleijadosJFT()) {
					TextFormatter.formatStringJFT(src, text, 2);
					viewDesempenho.getPesoAleijadosJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoAleijadosJFT()) {
					TextFormatter.formatStringJFT(src, text, 5);
					viewDesempenho.getControlePesagemJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
				} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControlePesagemJFT()) {
					TextFormatter.formatStringJFT(src, text, 6);
					controlePesagem = Integer.parseInt(viewDesempenho.getControlePesagemJFT().getText());
					int somaControleP = Integer.parseInt(viewDesempenho.getIdadePesagemJFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrPesagemJFT().getText())
							+ Integer.parseInt(viewDesempenho.getTaraPesagemJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoAnimais1JFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoAnimais2JFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrErrosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getNrAleijadosJFT().getText())
							+ Integer.parseInt(viewDesempenho.getPesoAleijadosJFT().getText());
					if (controlePesagem != somaControleP) {
						fluxoProblemaPesagem();
					} else {
						String msg = desempenhoBO.verificaPesagem(rme, pesagem,
								Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()),
								Integer.parseInt(viewDesempenho.getIdadePesagemJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrPesagemJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()),
								Integer.parseInt(viewDesempenho.getNrAleijadosJFT().getText()),
								Integer.parseInt(viewDesempenho.getTaraPesagemJFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoAnimais1JFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoAnimais2JFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText()),
								Integer.parseInt(viewDesempenho.getPesoAleijadosJFT().getText()));
						if (msg.length() != 0) {
							JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
									JOptionPane.ERROR_MESSAGE);
							fluxoProblemaPesagem();
						} else if (controlePesagem == 0) {
							SaveUpdater.startCountdown(3, viewDesempenho.getRegistroLabel());
							desempenho.add(new DesempenhoVOF(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
									Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
									Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
									Integer.parseInt(viewDesempenho.getTrat1JFT().getText()),
									Integer.parseInt(viewDesempenho.getTrat2JFT().getText()),
									Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()),
									Integer.parseInt(viewDesempenho.getControleBaiaJFT().getText()), rme, pesagem));
							controller.getModel().getModelStateDAO().saveModelState(false);
							fluxoOkPesagem();
						} else {
							pesagem.add(new PesagemVOF(Integer.parseInt(viewDesempenho.getOrdemPJFT().getText()),
									Integer.parseInt(viewDesempenho.getIdadePesagemJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrPesagemJFT().getText()),
									Integer.parseInt(viewDesempenho.getTaraPesagemJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoAnimais1JFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoAnimais2JFT().getText()),
									Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrAleijadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoAleijadosJFT().getText())));
							updateHistP();
							viewDesempenho.getOrdemPJFT().setText("" + (++ordemP));
							TextFormatter.formatStringJFT(viewDesempenho.getOrdemPJFT(),
									viewDesempenho.getOrdemPJFT().getText(), 3);
							fluxoContPesagem();
							System.out.println("próx informação Pesagem");
						}
					}
				}
			}
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no keyTyped");
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

	public void recuperaHistRME() {
		try {
			viewDesempenho.getOrdemRMEJFT().setText("" + lastHistRME.get(0).getOrdem());
			TextFormatter.formatStringJFT(viewDesempenho.getOrdemRMEJFT(), viewDesempenho.getOrdemRMEJFT().getText(),
					3);
			viewDesempenho.getIdadeRacaoJFT().setText("" + lastHistRME.get(0).getIdadeRacao());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeRacaoJFT(),
					viewDesempenho.getIdadeRacaoJFT().getText(), 2);
			viewDesempenho.getFornecidaJFT().setText("" + lastHistRME.get(0).getFornecida());
			TextFormatter.formatStringJFT(viewDesempenho.getFornecidaJFT(), viewDesempenho.getFornecidaJFT().getText(),
					5);
			viewDesempenho.getSobraJFT().setText("" + lastHistRME.get(0).getSobra());
			TextFormatter.formatStringJFT(viewDesempenho.getSobraJFT(), viewDesempenho.getSobraJFT().getText(), 5);
			viewDesempenho.getIdadeMortalidadeJFT().setText("" + lastHistRME.get(0).getIdadeMortos());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeMortalidadeJFT(),
					viewDesempenho.getIdadeMortalidadeJFT().getText(), 2);
			viewDesempenho.getNrMortalidadeJFT().setText("" + lastHistRME.get(0).getNrMortos());
			TextFormatter.formatStringJFT(viewDesempenho.getNrMortalidadeJFT(),
					viewDesempenho.getNrMortalidadeJFT().getText(), 2);
			viewDesempenho.getPesoMortalidadeJFT().setText("" + lastHistRME.get(0).getPesoMortos());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoMortalidadeJFT(),
					viewDesempenho.getPesoMortalidadeJFT().getText(), 5);
			viewDesempenho.getIdadeEliminadosJFT().setText("" + lastHistRME.get(0).getIdadeEliminados());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeEliminadosJFT(),
					viewDesempenho.getIdadeEliminadosJFT().getText(), 2);
			viewDesempenho.getNrEliminadosJFT().setText("" + lastHistRME.get(0).getNrEliminados());
			TextFormatter.formatStringJFT(viewDesempenho.getNrEliminadosJFT(),
					viewDesempenho.getNrEliminadosJFT().getText(), 2);
			viewDesempenho.getPesoEliminadosJFT().setText("" + lastHistRME.get(0).getPesoEliminados());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoEliminadosJFT(),
					viewDesempenho.getPesoEliminadosJFT().getText(), 5);
			viewDesempenho.getControleRmeJFT().setText("" + lastHistRME.get(0).getControle());
			TextFormatter.formatStringJFT(viewDesempenho.getControleRmeJFT(),
					viewDesempenho.getControleRmeJFT().getText(), 5);
			lastHistRME.remove(0);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no recuperaHistRME");
		}
	}

	public void updateHistRME() {
		try {
			viewDesempenho.getOrdemRME1Label().setText(viewDesempenho.getOrdemRME2Label().getText());
			viewDesempenho.getOrdemRME2Label().setText(viewDesempenho.getOrdemRME3Label().getText());
			viewDesempenho.getOrdemRME3Label().setText(viewDesempenho.getOrdemRME4Label().getText());
			viewDesempenho.getOrdemRME4Label().setText(viewDesempenho.getOrdemRME5Label().getText());
			viewDesempenho.getOrdemRME5Label().setText(viewDesempenho.getOrdemRMEJFT().getText());
			viewDesempenho.getIdadeRHist1Label().setText(viewDesempenho.getIdadeRHist2Label().getText());
			viewDesempenho.getIdadeRHist2Label().setText(viewDesempenho.getIdadeRHist3Label().getText());
			viewDesempenho.getIdadeRHist3Label().setText(viewDesempenho.getIdadeRHist4Label().getText());
			viewDesempenho.getIdadeRHist4Label().setText(viewDesempenho.getIdadeRHist5Label().getText());
			viewDesempenho.getIdadeRHist5Label().setText(viewDesempenho.getIdadeRacaoJFT().getText());
			viewDesempenho.getFornecidaHist1Label().setText(viewDesempenho.getFornecidaHist2Label().getText());
			viewDesempenho.getFornecidaHist2Label().setText(viewDesempenho.getFornecidaHist3Label().getText());
			viewDesempenho.getFornecidaHist3Label().setText(viewDesempenho.getFornecidaHist4Label().getText());
			viewDesempenho.getFornecidaHist4Label().setText(viewDesempenho.getFornecidaHist5Label().getText());
			viewDesempenho.getFornecidaHist5Label().setText(viewDesempenho.getFornecidaJFT().getText());
			viewDesempenho.getSobraHist1Label().setText(viewDesempenho.getSobraHist2Label().getText());
			viewDesempenho.getSobraHist2Label().setText(viewDesempenho.getSobraHist3Label().getText());
			viewDesempenho.getSobraHist3Label().setText(viewDesempenho.getSobraHist4Label().getText());
			viewDesempenho.getSobraHist4Label().setText(viewDesempenho.getSobraHist5Label().getText());
			viewDesempenho.getSobraHist5Label().setText(viewDesempenho.getSobraJFT().getText());
			viewDesempenho.getIdadeMHist1Label().setText(viewDesempenho.getIdadeMHist2Label().getText());
			viewDesempenho.getIdadeMHist2Label().setText(viewDesempenho.getIdadeMHist3Label().getText());
			viewDesempenho.getIdadeMHist3Label().setText(viewDesempenho.getIdadeMHist4Label().getText());
			viewDesempenho.getIdadeMHist4Label().setText(viewDesempenho.getIdadeMHist5Label().getText());
			viewDesempenho.getIdadeMHist5Label().setText(viewDesempenho.getIdadeMortalidadeJFT().getText());
			viewDesempenho.getNrMHist1Label().setText(viewDesempenho.getNrMHist2Label().getText());
			viewDesempenho.getNrMHist2Label().setText(viewDesempenho.getNrMHist3Label().getText());
			viewDesempenho.getNrMHist3Label().setText(viewDesempenho.getNrMHist4Label().getText());
			viewDesempenho.getNrMHist4Label().setText(viewDesempenho.getNrMHist5Label().getText());
			viewDesempenho.getNrMHist5Label().setText(viewDesempenho.getNrMortalidadeJFT().getText());
			viewDesempenho.getPesoMHist1Label().setText(viewDesempenho.getPesoMHist2Label().getText());
			viewDesempenho.getPesoMHist2Label().setText(viewDesempenho.getPesoMHist3Label().getText());
			viewDesempenho.getPesoMHist3Label().setText(viewDesempenho.getPesoMHist4Label().getText());
			viewDesempenho.getPesoMHist4Label().setText(viewDesempenho.getPesoMHist5Label().getText());
			viewDesempenho.getPesoMHist5Label().setText(viewDesempenho.getPesoMortalidadeJFT().getText());
			viewDesempenho.getIdadeElHist1Label().setText(viewDesempenho.getIdadeElHist2Label().getText());
			viewDesempenho.getIdadeElHist2Label().setText(viewDesempenho.getIdadeElHist3Label().getText());
			viewDesempenho.getIdadeElHist3Label().setText(viewDesempenho.getIdadeElHist4Label().getText());
			viewDesempenho.getIdadeElHist4Label().setText(viewDesempenho.getIdadeElHist5Label().getText());
			viewDesempenho.getIdadeElHist5Label().setText(viewDesempenho.getIdadeEliminadosJFT().getText());
			viewDesempenho.getNrElHist1Label().setText(viewDesempenho.getNrElHist2Label().getText());
			viewDesempenho.getNrElHist2Label().setText(viewDesempenho.getNrElHist3Label().getText());
			viewDesempenho.getNrElHist3Label().setText(viewDesempenho.getNrElHist4Label().getText());
			viewDesempenho.getNrElHist4Label().setText(viewDesempenho.getNrElHist5Label().getText());
			viewDesempenho.getNrElHist5Label().setText(viewDesempenho.getNrEliminadosJFT().getText());
			viewDesempenho.getPesoElHist1Label().setText(viewDesempenho.getPesoElHist2Label().getText());
			viewDesempenho.getPesoElHist2Label().setText(viewDesempenho.getPesoElHist3Label().getText());
			viewDesempenho.getPesoElHist3Label().setText(viewDesempenho.getPesoElHist4Label().getText());
			viewDesempenho.getPesoElHist4Label().setText(viewDesempenho.getPesoElHist5Label().getText());
			viewDesempenho.getPesoElHist5Label().setText(viewDesempenho.getPesoEliminadosJFT().getText());

			if (!lastHistRME.isEmpty()) {
				recuperaHistRME();
			} else {
				viewDesempenho.getIdadeRacaoJFT().setText("00");
				viewDesempenho.getFornecidaJFT().setText("00000");
				viewDesempenho.getSobraJFT().setText("00000");
				viewDesempenho.getIdadeMortalidadeJFT().setText("00");
				viewDesempenho.getNrMortalidadeJFT().setText("00");
				viewDesempenho.getPesoMortalidadeJFT().setText("00000");
				viewDesempenho.getIdadeEliminadosJFT().setText("00");
				viewDesempenho.getNrEliminadosJFT().setText("00");
				viewDesempenho.getPesoEliminadosJFT().setText("00000");
				viewDesempenho.getControleRmeJFT().setText("00000");
			}
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no updateHistRME");
		}
	}

	public void clearHistRME() {
		try {
			viewDesempenho.getOrdemRME5Label().setText("");
			viewDesempenho.getOrdemRME1Label().setText("");
			viewDesempenho.getOrdemRME2Label().setText("");
			viewDesempenho.getOrdemRME3Label().setText("");
			viewDesempenho.getOrdemRME4Label().setText("");
			viewDesempenho.getIdadeRHist5Label().setText("");
			viewDesempenho.getIdadeRHist1Label().setText("");
			viewDesempenho.getIdadeRHist2Label().setText("");
			viewDesempenho.getIdadeRHist3Label().setText("");
			viewDesempenho.getIdadeRHist4Label().setText("");
			viewDesempenho.getFornecidaHist5Label().setText("");
			viewDesempenho.getFornecidaHist1Label().setText("");
			viewDesempenho.getFornecidaHist2Label().setText("");
			viewDesempenho.getFornecidaHist3Label().setText("");
			viewDesempenho.getFornecidaHist4Label().setText("");
			viewDesempenho.getSobraHist5Label().setText("");
			viewDesempenho.getSobraHist1Label().setText("");
			viewDesempenho.getSobraHist2Label().setText("");
			viewDesempenho.getSobraHist3Label().setText("");
			viewDesempenho.getSobraHist4Label().setText("");
			viewDesempenho.getIdadeMHist5Label().setText("");
			viewDesempenho.getIdadeMHist1Label().setText("");
			viewDesempenho.getIdadeMHist2Label().setText("");
			viewDesempenho.getIdadeMHist3Label().setText("");
			viewDesempenho.getIdadeMHist4Label().setText("");
			viewDesempenho.getNrMHist5Label().setText("");
			viewDesempenho.getNrMHist1Label().setText("");
			viewDesempenho.getNrMHist2Label().setText("");
			viewDesempenho.getNrMHist3Label().setText("");
			viewDesempenho.getNrMHist4Label().setText("");
			viewDesempenho.getPesoMHist5Label().setText("");
			viewDesempenho.getPesoMHist1Label().setText("");
			viewDesempenho.getPesoMHist2Label().setText("");
			viewDesempenho.getPesoMHist3Label().setText("");
			viewDesempenho.getPesoMHist4Label().setText("");
			viewDesempenho.getIdadeElHist5Label().setText("");
			viewDesempenho.getIdadeElHist1Label().setText("");
			viewDesempenho.getIdadeElHist2Label().setText("");
			viewDesempenho.getIdadeElHist3Label().setText("");
			viewDesempenho.getIdadeElHist4Label().setText("");
			viewDesempenho.getNrElHist5Label().setText("");
			viewDesempenho.getNrElHist1Label().setText("");
			viewDesempenho.getNrElHist2Label().setText("");
			viewDesempenho.getNrElHist3Label().setText("");
			viewDesempenho.getNrElHist4Label().setText("");
			viewDesempenho.getPesoElHist5Label().setText("");
			viewDesempenho.getPesoElHist1Label().setText("");
			viewDesempenho.getPesoElHist2Label().setText("");
			viewDesempenho.getPesoElHist3Label().setText("");
			viewDesempenho.getPesoElHist4Label().setText("");
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no clearHistRME");
		}
	}

	public void updateHistP() {
		try {
			viewDesempenho.getOrdemP1Label().setText(viewDesempenho.getOrdemP2Label().getText());
			viewDesempenho.getOrdemP2Label().setText(viewDesempenho.getOrdemP3Label().getText());
			viewDesempenho.getOrdemP3Label().setText(viewDesempenho.getOrdemP4Label().getText());
			viewDesempenho.getOrdemP4Label().setText(viewDesempenho.getOrdemP5Label().getText());
			viewDesempenho.getOrdemP5Label().setText(viewDesempenho.getOrdemPJFT().getText());
			viewDesempenho.getIdadePHist1Label().setText(viewDesempenho.getIdadePHist2Label().getText());
			viewDesempenho.getIdadePHist2Label().setText(viewDesempenho.getIdadePHist3Label().getText());
			viewDesempenho.getIdadePHist3Label().setText(viewDesempenho.getIdadePHist4Label().getText());
			viewDesempenho.getIdadePHist4Label().setText(viewDesempenho.getIdadePHist5Label().getText());
			viewDesempenho.getIdadePHist5Label().setText(viewDesempenho.getIdadePesagemJFT().getText());
			viewDesempenho.getNrPHist1Label().setText(viewDesempenho.getNrPHist2Label().getText());
			viewDesempenho.getNrPHist2Label().setText(viewDesempenho.getNrPHist3Label().getText());
			viewDesempenho.getNrPHist3Label().setText(viewDesempenho.getNrPHist4Label().getText());
			viewDesempenho.getNrPHist4Label().setText(viewDesempenho.getNrPHist5Label().getText());
			viewDesempenho.getNrPHist5Label().setText(viewDesempenho.getNrPesagemJFT().getText());
			viewDesempenho.getTaraHist1Label().setText(viewDesempenho.getTaraHist2Label().getText());
			viewDesempenho.getTaraHist2Label().setText(viewDesempenho.getTaraHist3Label().getText());
			viewDesempenho.getTaraHist3Label().setText(viewDesempenho.getTaraHist4Label().getText());
			viewDesempenho.getTaraHist4Label().setText(viewDesempenho.getTaraHist5Label().getText());
			viewDesempenho.getTaraHist5Label().setText(viewDesempenho.getTaraPesagemJFT().getText());
			viewDesempenho.getPeso1Hist1Label().setText(viewDesempenho.getPeso1Hist2Label().getText());
			viewDesempenho.getPeso1Hist2Label().setText(viewDesempenho.getPeso1Hist3Label().getText());
			viewDesempenho.getPeso1Hist3Label().setText(viewDesempenho.getPeso1Hist4Label().getText());
			viewDesempenho.getPeso1Hist4Label().setText(viewDesempenho.getPeso1Hist5Label().getText());
			viewDesempenho.getPeso1Hist5Label().setText(viewDesempenho.getPesoAnimais1JFT().getText());
			viewDesempenho.getPeso2Hist1Label().setText(viewDesempenho.getPeso2Hist2Label().getText());
			viewDesempenho.getPeso2Hist2Label().setText(viewDesempenho.getPeso2Hist3Label().getText());
			viewDesempenho.getPeso2Hist3Label().setText(viewDesempenho.getPeso2Hist4Label().getText());
			viewDesempenho.getPeso2Hist4Label().setText(viewDesempenho.getPeso2Hist5Label().getText());
			viewDesempenho.getPeso2Hist5Label().setText(viewDesempenho.getPesoAnimais2JFT().getText());
			viewDesempenho.getNrAmHist1Label().setText(viewDesempenho.getNrAmHist2Label().getText());
			viewDesempenho.getNrAmHist2Label().setText(viewDesempenho.getNrAmHist3Label().getText());
			viewDesempenho.getNrAmHist3Label().setText(viewDesempenho.getNrAmHist4Label().getText());
			viewDesempenho.getNrAmHist4Label().setText(viewDesempenho.getNrAmHist5Label().getText());
			viewDesempenho.getNrAmHist5Label().setText(viewDesempenho.getNrAmostradosJFT().getText());
			viewDesempenho.getPesoAmHist1Label().setText(viewDesempenho.getPesoAmHist2Label().getText());
			viewDesempenho.getPesoAmHist2Label().setText(viewDesempenho.getPesoAmHist3Label().getText());
			viewDesempenho.getPesoAmHist3Label().setText(viewDesempenho.getPesoAmHist4Label().getText());
			viewDesempenho.getPesoAmHist4Label().setText(viewDesempenho.getPesoAmHist5Label().getText());
			viewDesempenho.getPesoAmHist5Label().setText(viewDesempenho.getPesoAmostradosJFT().getText());
			viewDesempenho.getNrErHist1Label().setText(viewDesempenho.getNrErHist2Label().getText());
			viewDesempenho.getNrErHist2Label().setText(viewDesempenho.getNrErHist3Label().getText());
			viewDesempenho.getNrErHist3Label().setText(viewDesempenho.getNrErHist4Label().getText());
			viewDesempenho.getNrErHist4Label().setText(viewDesempenho.getNrErHist5Label().getText());
			viewDesempenho.getNrErHist5Label().setText(viewDesempenho.getNrErrosJFT().getText());
			viewDesempenho.getPesoErHist1Label().setText(viewDesempenho.getPesoErHist2Label().getText());
			viewDesempenho.getPesoErHist2Label().setText(viewDesempenho.getPesoErHist3Label().getText());
			viewDesempenho.getPesoErHist3Label().setText(viewDesempenho.getPesoErHist4Label().getText());
			viewDesempenho.getPesoErHist4Label().setText(viewDesempenho.getPesoErHist5Label().getText());
			viewDesempenho.getPesoErHist5Label().setText(viewDesempenho.getPesoErrosJFT().getText());
			viewDesempenho.getNrAlHist1Label().setText(viewDesempenho.getNrAlHist2Label().getText());
			viewDesempenho.getNrAlHist2Label().setText(viewDesempenho.getNrAlHist3Label().getText());
			viewDesempenho.getNrAlHist3Label().setText(viewDesempenho.getNrAlHist4Label().getText());
			viewDesempenho.getNrAlHist4Label().setText(viewDesempenho.getNrAlHist5Label().getText());
			viewDesempenho.getNrAlHist5Label().setText(viewDesempenho.getNrAleijadosJFT().getText());
			viewDesempenho.getPesoAlHist1Label().setText(viewDesempenho.getPesoAlHist2Label().getText());
			viewDesempenho.getPesoAlHist2Label().setText(viewDesempenho.getPesoAlHist3Label().getText());
			viewDesempenho.getPesoAlHist3Label().setText(viewDesempenho.getPesoAlHist4Label().getText());
			viewDesempenho.getPesoAlHist4Label().setText(viewDesempenho.getPesoAlHist5Label().getText());
			viewDesempenho.getPesoAlHist5Label().setText(viewDesempenho.getPesoAleijadosJFT().getText());

			viewDesempenho.getIdadePesagemJFT().setText("00");
			viewDesempenho.getNrPesagemJFT().setText("00");
			viewDesempenho.getTaraPesagemJFT().setText("00000");
			viewDesempenho.getPesoAnimais1JFT().setText("000000");
			viewDesempenho.getPesoAnimais2JFT().setText("000000");
			viewDesempenho.getNrAmostradosJFT().setText("00");
			viewDesempenho.getPesoAmostradosJFT().setText("000000");
			viewDesempenho.getNrErrosJFT().setText("00");
			viewDesempenho.getPesoErrosJFT().setText("00000");
			viewDesempenho.getNrAleijadosJFT().setText("00");
			viewDesempenho.getPesoAleijadosJFT().setText("00000");
			viewDesempenho.getControlePesagemJFT().setText("000000");
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no updateHistP");
		}
	}

	public void fluxoProblemaCabecalho() {
		try {
			viewDesempenho.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			viewDesempenho.getBaiaJFT().setEnabled(true);
			viewDesempenho.getBaiaJFT().grabFocus();
			viewDesempenho.getSexoJFT().setEnabled(false);
			viewDesempenho.getLadoJFT().setEnabled(false);
			viewDesempenho.getTrat1JFT().setEnabled(false);
			viewDesempenho.getTrat2JFT().setEnabled(false);
			viewDesempenho.getAvesAlojadasJFT().setEnabled(false);
			viewDesempenho.getControleBaiaJFT().setEnabled(false);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoProblemaCabecalho");
		}
	}

	public void fluxoOkCabecalho() {
		try {
			viewDesempenho.getBaiaJP().setBorder(defaultBaiaJP);
			viewDesempenho.getBaiaJFT().setEnabled(false);
			viewDesempenho.getSexoJFT().setEnabled(false);
			viewDesempenho.getLadoJFT().setEnabled(false);
			viewDesempenho.getTrat1JFT().setEnabled(false);
			viewDesempenho.getTrat2JFT().setEnabled(false);
			viewDesempenho.getAvesAlojadasJFT().setEnabled(false);
			viewDesempenho.getControleBaiaJFT().setEnabled(false);
			viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
			viewDesempenho.getIdadeRacaoJFT().grabFocus();
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoOkCabecalho");
		}
	}

	public void fluxoProblemaRME() {
		try {
			viewDesempenho.getRmeJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
			viewDesempenho.getIdadeRacaoJFT().grabFocus();
			viewDesempenho.getFornecidaJFT().setEnabled(false);
			viewDesempenho.getSobraJFT().setEnabled(false);
			viewDesempenho.getIdadeMortalidadeJFT().setEnabled(false);
			viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
			viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
			viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
			viewDesempenho.getNrEliminadosJFT().setEnabled(false);
			viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
			viewDesempenho.getControleRmeJFT().setEnabled(false);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoProblemaRME");
		}
	}

	public void fluxoContRME() {
		try {
			viewDesempenho.getRmeJP().setBorder(defaultRmeJP);
			viewDesempenho.getIdadeRacaoJFT().setEnabled(true);
			viewDesempenho.getIdadeRacaoJFT().grabFocus();
			viewDesempenho.getFornecidaJFT().setEnabled(false);
			viewDesempenho.getSobraJFT().setEnabled(false);
			viewDesempenho.getIdadeMortalidadeJFT().setEnabled(false);
			viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
			viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
			viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
			viewDesempenho.getNrEliminadosJFT().setEnabled(false);
			viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
			viewDesempenho.getControleRmeJFT().setEnabled(false);
			viewDesempenho.getControleFornecidaJFT().setEnabled(false);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoContRME");
		}
	}

	public void fluxoOkRME() {
		try {
			viewDesempenho.getIdadeRacaoJFT().setEnabled(false);
			viewDesempenho.getFornecidaJFT().setEnabled(false);
			viewDesempenho.getSobraJFT().setEnabled(false);
			viewDesempenho.getIdadeMortalidadeJFT().setEnabled(false);
			viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
			viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
			viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
			viewDesempenho.getNrEliminadosJFT().setEnabled(false);
			viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
			viewDesempenho.getControleRmeJFT().setEnabled(false);
			viewDesempenho.getControleFornecidaJFT().setEnabled(true);
			viewDesempenho.getControleFornecidaJFT().grabFocus();
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoOkRME");
		}
	}

	public void fluxoProblemaPesagem() {
		try {
			viewDesempenho.getPesagemJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
			viewDesempenho.getIdadePesagemJFT().setEnabled(true);
			viewDesempenho.getIdadePesagemJFT().grabFocus();
			viewDesempenho.getNrPesagemJFT().setEnabled(false);
			viewDesempenho.getTaraPesagemJFT().setEnabled(false);
			viewDesempenho.getPesoAnimais1JFT().setEnabled(false);
			viewDesempenho.getPesoAnimais2JFT().setEnabled(false);
			viewDesempenho.getNrAmostradosJFT().setEnabled(false);
			viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
			viewDesempenho.getNrErrosJFT().setEnabled(false);
			viewDesempenho.getPesoErrosJFT().setEnabled(false);
			viewDesempenho.getNrAleijadosJFT().setEnabled(false);
			viewDesempenho.getPesoAleijadosJFT().setEnabled(false);
			viewDesempenho.getControlePesagemJFT().setEnabled(false);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoProblemaPesagem");
		}
	}

	public void fluxoContPesagem() {
		try {
			viewDesempenho.getPesagemJP().setBorder(defaultPesagemJP);
			viewDesempenho.getIdadePesagemJFT().setEnabled(true);
			viewDesempenho.getIdadePesagemJFT().grabFocus();
			viewDesempenho.getNrPesagemJFT().setEnabled(false);
			viewDesempenho.getTaraPesagemJFT().setEnabled(false);
			viewDesempenho.getPesoAnimais1JFT().setEnabled(false);
			viewDesempenho.getPesoAnimais2JFT().setEnabled(false);
			viewDesempenho.getNrAmostradosJFT().setEnabled(false);
			viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
			viewDesempenho.getNrErrosJFT().setEnabled(false);
			viewDesempenho.getPesoErrosJFT().setEnabled(false);
			viewDesempenho.getNrAleijadosJFT().setEnabled(false);
			viewDesempenho.getPesoAleijadosJFT().setEnabled(false);
			viewDesempenho.getControlePesagemJFT().setEnabled(false);
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoContPesagem");
		}
	}

	public void fluxoOkPesagem() {
		try {
			viewDesempenho.getIdadePesagemJFT().setEnabled(false);
			viewDesempenho.getNrPesagemJFT().setEnabled(false);
			viewDesempenho.getTaraPesagemJFT().setEnabled(false);
			viewDesempenho.getPesoAnimais1JFT().setEnabled(false);
			viewDesempenho.getPesoAnimais2JFT().setEnabled(false);
			viewDesempenho.getNrAmostradosJFT().setEnabled(false);
			viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
			viewDesempenho.getNrErrosJFT().setEnabled(false);
			viewDesempenho.getPesoErrosJFT().setEnabled(false);
			viewDesempenho.getNrAleijadosJFT().setEnabled(false);
			viewDesempenho.getPesoAleijadosJFT().setEnabled(false);
			viewDesempenho.getControlePesagemJFT().setEnabled(false);
			viewDesempenho.getOpcaoJFT().setEnabled(true);
			viewDesempenho.getOpcaoJFT().grabFocus();
		} catch (Exception ex) {
			utils.salvarLogErro(ex, "Erro no fluxoOkPesagem");
		}
	}

}
