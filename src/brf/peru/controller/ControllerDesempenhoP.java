package brf.peru.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.peru.model.bo.DesempenhoBOP;
import brf.peru.model.vo.AmostradosVOP;
import brf.peru.model.vo.DesempenhoVOP;
import brf.peru.model.vo.EliminadosVOP;
import brf.peru.model.vo.ErrosVOP;
import brf.peru.model.vo.MortalidadeVOP;
import brf.peru.model.vo.PesadosVOP;
import brf.peru.model.vo.RmeVOP;
import brf.peru.view.ViewDesempenhoP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerDesempenhoP extends KeyAdapter implements FocusListener {

	private final ControllerP controller;
	private final DesempenhoBOP desempenhoBO;
	private int controleBaia, ordemRME, ordemP;
	private ViewDesempenhoP viewDesempenho;
	private Border defaultBaiaJP, defaultRmeJP, defaultPesagemJP;
	private List<DesempenhoVOP> desempenho;
	private List<RmeVOP> rme;
	private List<RmeVOP> rmeTemp;
	private List<RmeVOP> rmeErros;
	private List<MortalidadeVOP> mortos;
	private List<MortalidadeVOP> mortosTemp;
	private List<MortalidadeVOP> mortosErros;
	private List<EliminadosVOP> eliminados;
	private List<EliminadosVOP> eliminadosTemp;
	private List<EliminadosVOP> eliminadosErros;
	private List<ErrosVOP> erros;
	private List<ErrosVOP> errosTemp;
	private List<ErrosVOP> errosErros;
	private List<AmostradosVOP> amostrados;
	private List<AmostradosVOP> amostradosTemp;
	private List<AmostradosVOP> amostradosErros;
	private List<PesadosVOP> pesados;
	private List<PesadosVOP> pesadosTemp;
	private List<PesadosVOP> pesadosErros;
	private List<Integer> idades;
	private Integer idadeFaseAtual, faseAnterior, countFase, countIdades, somaValoresRacao, somaControleRacoes;

	public ControllerDesempenhoP(ControllerP c, DesempenhoBOP desempenhoBO) {
		controller = c;
		this.desempenhoBO = desempenhoBO;
	}

	public void openWindow(List<Integer> idadesFases) {
		viewDesempenho = new ViewDesempenhoP();
		viewDesempenho.setTitle("DIGEX - Peru");
		viewDesempenho.setResizable(false);
		viewDesempenho.setLocationRelativeTo(null);
		viewDesempenho.setVisible(true);
		viewDesempenho.getLabel().setVisible(false);
		viewDesempenho.getAviarioJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getAviario());
		defaultBaiaJP = viewDesempenho.getBaiaJP().getBorder();
		defaultRmeJP = viewDesempenho.getConsumoJP().getBorder();
		idades = idadesFases;
		countIdades = 0;
		faseAnterior = 0;
		countFase = 1;
		somaValoresRacao = 0;
		idadeFaseAtual = idades.get(countIdades);
		somaControleRacoes = 0;
		viewDesempenho.getFaseConsumoLabel().setText("Fase " + countFase + " (Idade " + idadeFaseAtual + ")");
		// viewDesempenho.getFasePesagemLabel().setText("Fase " + countFase + " (Idade "
		// + idadeFaseAtual + ")");

		rme = new ArrayList<>();
		rmeTemp = new ArrayList<>();
		rmeErros = new ArrayList<>();
		mortos = new ArrayList<>();
		mortosTemp = new ArrayList<>();
		mortosErros = new ArrayList<>();
		eliminados = new ArrayList<>();
		eliminadosTemp = new ArrayList<>();
		eliminadosErros = new ArrayList<>();
		erros = new ArrayList<>();
		errosTemp = new ArrayList<>();
		errosErros = new ArrayList<>();
		amostrados = new ArrayList<>();
		amostradosTemp = new ArrayList<>();
		amostradosErros = new ArrayList<>();
		pesados = new ArrayList<>();
		pesadosTemp = new ArrayList<>();
		pesadosErros = new ArrayList<>();

		ordemRME = 1;
		ordemP = 1;
		viewDesempenho.getOrdemJFT().setText("1");
		TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
		viewDesempenho.getIdadeJFT().setText("000");
		viewDesempenho.getFornecidaJFT().setText("00000");
		viewDesempenho.getSobraJFT().setText("00000");
		viewDesempenho.getControleFornecidaJFT().setText("000000");
		viewDesempenho.getControleSobraJFT().setText("000000");

		List<Component> order = new ArrayList<>();
		order.add(viewDesempenho.getBaiaJFT());
		order.add(viewDesempenho.getLadoJFT());
		order.add(viewDesempenho.getSexoJFT());
		order.add(viewDesempenho.getLinhagemJFT());
		order.add(viewDesempenho.getTrataJFT());
		order.add(viewDesempenho.getAvesAlojadasJFT());
		order.add(viewDesempenho.getControleBaiaJFT());
		order.add(viewDesempenho.getIdadeJFT());
		order.add(viewDesempenho.getFornecidaJFT());
		order.add(viewDesempenho.getSobraJFT());
		order.add(viewDesempenho.getControleFornecidaJFT());
		order.add(viewDesempenho.getControleSobraJFT());
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewDesempenho.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
		desempenho = controller.getModel().getExperimentoVO().getDesempenho();
		loadHist();
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	public void loadHist() {
		int viewCounter = 5;
		int viewIndex = 0;
		List<JLabel> ordemHist = new ArrayList<>();

		ordemHist.add(viewDesempenho.getOrdemHist5Label());
		ordemHist.add(viewDesempenho.getIdadeHist5Label());
		ordemHist.add(viewDesempenho.getFornecidaHist5Label());
		ordemHist.add(viewDesempenho.getSobraHist5Label());
		ordemHist.add(viewDesempenho.getOrdemHist4Label());
		ordemHist.add(viewDesempenho.getIdadeHist4Label());
		ordemHist.add(viewDesempenho.getFornecidaHist4Label());
		ordemHist.add(viewDesempenho.getSobraHist4Label());
		ordemHist.add(viewDesempenho.getOrdemHist3Label());
		ordemHist.add(viewDesempenho.getIdadeHist3Label());
		ordemHist.add(viewDesempenho.getFornecidaHist3Label());
		ordemHist.add(viewDesempenho.getSobraHist3Label());
		ordemHist.add(viewDesempenho.getOrdemHist2Label());
		ordemHist.add(viewDesempenho.getIdadeHist2Label());
		ordemHist.add(viewDesempenho.getFornecidaHist2Label());
		ordemHist.add(viewDesempenho.getSobraHist2Label());
		ordemHist.add(viewDesempenho.getOrdemHist1Label());
		ordemHist.add(viewDesempenho.getIdadeHist1Label());
		ordemHist.add(viewDesempenho.getFornecidaHist1Label());
		ordemHist.add(viewDesempenho.getSobraHist1Label());

		if (controller.getModel().getExperimentoVO().getDesempenho() != null
				&& controller.getModel().getExperimentoVO().getDesempenho().size() > 0) {
			if (!controller.getModel().getExperimentoVO().getDesempenho()
					.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).isFinalizado()) {
				viewDesempenho.getBaiaJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getBaia()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getBaiaJFT(), viewDesempenho.getBaiaJFT().getText(), 3);
				viewDesempenho.getLadoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getLado()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getLadoJFT(), viewDesempenho.getLadoJFT().getText(), 1);
				viewDesempenho.getSexoJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getSexo()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getSexoJFT(), viewDesempenho.getSexoJFT().getText(), 1);
				viewDesempenho.getLinhagemJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getLinhagem()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getLinhagemJFT(), viewDesempenho.getLinhagemJFT().getText(), 2);
				viewDesempenho.getTrataJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getTrata()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getTrataJFT(), viewDesempenho.getTrataJFT().getText(), 1);
				viewDesempenho.getAvesAlojadasJFT().setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getNrAlojados()).trim());
				TextFormatter.formatStringJFT(viewDesempenho.getAvesAlojadasJFT(), viewDesempenho.getAvesAlojadasJFT().getText(), 3);

				for (int i = controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().size(); i > 0; i--) {
					JLabel ordem = (JLabel) ordemHist.get(viewIndex);
					ordem.setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
							.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().get(i - 1).getOrdem()));
					viewIndex++;
					JLabel idade = (JLabel) ordemHist.get(viewIndex);
					idade.setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
							.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().get(i - 1)
							.getIdadeRacao()));
					viewIndex++;
					JLabel fornecida = (JLabel) ordemHist.get(viewIndex);
					fornecida.setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
							.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().get(i - 1)
							.getFornecida()));
					viewIndex++;
					JLabel sobra = (JLabel) ordemHist.get(viewIndex);
					sobra.setText(String.valueOf(controller.getModel().getExperimentoVO().getDesempenho()
							.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().get(i - 1).getSobra()));
					viewIndex++;
					viewCounter--;
					if (viewCounter == 0) {
						break;
					}
				}

				ordemRME = controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo()
						.get(controller.getModel().getExperimentoVO().getDesempenho()
								.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().size() - 1)
						.getOrdem() + 1;
				faseAnterior = controller.getModel().getExperimentoVO().getDesempenho()
						.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo()
						.get(controller.getModel().getExperimentoVO().getDesempenho()
								.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().size() - 1)
						.getIdadeRacao();
				for (int j = 0; j < idades.size(); j++) {
					if (faseAnterior == (int) idades.get(j)) {
						idadeFaseAtual = idades.get(j + 1);
						countIdades = j + 1;
						countFase = j + 2;
						break;
					}
				}
				viewDesempenho.getFaseConsumoLabel().setText("Fase " + countFase + " (Idade " + idadeFaseAtual + ")");
				viewDesempenho.getOrdemJFT().setText(String.valueOf(ordemRME));
				viewDesempenho.getjLabel36().setVisible(false);
				viewDesempenho.getControleBaiaJFT().setVisible(false);
				viewDesempenho.getBaiaJFT().setEnabled(false);
				viewDesempenho.getIdadeJFT().setEnabled(true);
				viewDesempenho.getIdadeJFT().grabFocus();
			}
		}

//		System.out.println("O tamanho da Racao: " + histFornecida.size());
//		System.out.println("O tamanho da Sobra: " + histSobra.size());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewDesempenho.getIdadeJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeJFT())) {
			System.out.println("left");
			Component prev = viewDesempenho.getFocusTraversalPolicy().getComponentBefore(viewDesempenho, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(viewDesempenho, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				viewDesempenho.setVisible(false);
				controller.resumeEscolhaDig();
				System.out.println("Voltar");
			}
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == viewDesempenho.getBaiaJFT()) {
				viewDesempenho.getLabel().setEnabled(false);
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getLadoJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getLadoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getLadoJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				viewDesempenho.getSexoJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getSexoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getSexoJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				viewDesempenho.getLinhagemJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getLinhagemJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getLinhagemJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getTrataJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getTrataJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getTrataJFT()) {
				TextFormatter.formatStringJFT(src, text, 1);
				viewDesempenho.getAvesAlojadasJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getAvesAlojadasJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getAvesAlojadasJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getControleBaiaJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getControleBaiaJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleBaiaJFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				controleBaia = Integer.parseInt(viewDesempenho.getControleBaiaJFT().getText());
				int somaControle = Integer.parseInt(viewDesempenho.getAviarioJFT().getText())
						+ Integer.parseInt(viewDesempenho.getBaiaJFT().getText()) + Integer.parseInt(viewDesempenho.getSexoJFT().getText())
						+ Integer.parseInt(viewDesempenho.getLinhagemJFT().getText())
						+ Integer.parseInt(viewDesempenho.getLadoJFT().getText()) + Integer.parseInt(viewDesempenho.getTrataJFT().getText())
						+ Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText());
				if (controleBaia != somaControle) {
					fluxoProblemaCabecalho();
				} else {
					String msg = desempenhoBO.verificaCabecalho(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
							Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
							Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
							Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()));
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
						fluxoProblemaCabecalho();
					} else if (desempenhoBO.isBaiaDigitada(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()))) {
						int option = JOptionPane.showConfirmDialog(viewDesempenho, "Baia já digitada.\nDeseja digitar novamente?",
								"DIGEX - Aviso", JOptionPane.WARNING_MESSAGE);
						if (option == 0) {
							desempenhoBO.excluirBaia(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()));
							viewDesempenho.getOrdemJFT().setText("1");
							TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
							fluxoOkCabecalho();
						} else {
							fluxoProblemaCabecalho();
						}
					} else {
						viewDesempenho.getOrdemJFT().setText("1");
						TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
						fluxoOkCabecalho();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getFornecidaJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getFornecidaJFT().grabFocus();
				viewDesempenho.getLabel().setVisible(false);
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getFornecidaJFT()) {
				TextFormatter.formatStringJFT(src, text, 5);
				viewDesempenho.getSobraJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getSobraJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getSobraJFT()) {
				TextFormatter.formatStringJFT(src, text, 5);
				String msg = desempenhoBO.verificaRacao(Integer.parseInt(viewDesempenho.getIdadeJFT().getText()),
						Integer.parseInt(viewDesempenho.getFornecidaJFT().getText()),
						Integer.parseInt(viewDesempenho.getSobraJFT().getText()), faseAnterior, idadeFaseAtual);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoRacoes();
				} else if (Integer.parseInt(viewDesempenho.getIdadeJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getFornecidaJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getSobraJFT().getText()) == 0) {
					viewDesempenho.getControleFornecidaJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					viewDesempenho.getControleFornecidaJFT().grabFocus();
					viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 3);
				} else {
					rmeTemp.add(new RmeVOP(Integer.parseInt(viewDesempenho.getOrdemJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getIdadeJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getFornecidaJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getSobraJFT().getText().trim()), new MortalidadeVOP(), new EliminadosVOP(),
							new ErrosVOP(), new AmostradosVOP(), new PesadosVOP()));
					updateHistRME();
					if (Integer.parseInt(viewDesempenho.getIdadeJFT().getText()) == 0) {
						viewDesempenho.getOrdemJFT().setText("" + (++ordemRME));
					} else {
						ordemRME = Integer.parseInt(viewDesempenho.getOrdemJFT().getText().trim());
					}
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
					viewDesempenho.getIdadeJFT().setEnabled(true);
					viewDesempenho.getIdadeJFT().grabFocus();
					viewDesempenho.getFornecidaJFT().setEnabled(false);
					viewDesempenho.getSobraJFT().setEnabled(false);
					viewDesempenho.getControleFornecidaJFT().setEnabled(false);
					viewDesempenho.getControleSobraJFT().setEnabled(false);
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleFornecidaJFT()) {
				if (Integer.parseInt(viewDesempenho.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
					TextFormatter.formatStringJFT(src, text, 6);
					viewDesempenho.getControleFornecidaJFT().setEnabled(false);
					viewDesempenho.getControleSobraJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					viewDesempenho.getControleSobraJFT().grabFocus();
				} else {
					viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					rmeErros.addAll(rmeTemp);
					rmeTemp = new ArrayList<>();
					fluxoErroControleFornecida();
					ordemRME = rmeErros.get(0).getOrdem();
					recuperaHistRME(true, false);
//					viewDesempenho.getOrdemJFT().setText("1");
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleSobraJFT()) {
				if (Integer.parseInt(viewDesempenho.getControleSobraJFT().getText().trim()) == calculaControleSobra()) {
					TextFormatter.formatStringJFT(src, text, 6);
					if (rmeTemp.get(rmeTemp.size() - 1).getIdadeRacao() == idades.get(idades.size() - 1)) {
						// IDADE DA LISTA É A ÚLTIMA, ADICIONA TODOS OS CONSUMOS NA LISTA E SEGUE PARA
						// DIGITAR AS MORTALIDADES
						rme.addAll(rmeTemp);
						rmeTemp = new ArrayList<>();
						clearHistRME();
						ordemRME = 1;
						// ZERA OS CONTADORES DAS IDADES DAS FASES
						countIdades = 0;
						countFase = 1;
						faseAnterior = 0;
						idadeFaseAtual = idades.get(countIdades);
						viewDesempenho.getOrdemJFT().setText("1");
						TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
						viewDesempenho.getIdadeJFT().setEnabled(false);
						viewDesempenho.getIdadeJFT().setText("000");
						viewDesempenho.getFornecidaJFT().setEnabled(false);
						viewDesempenho.getFornecidaJFT().setText("00000");
						viewDesempenho.getSobraJFT().setEnabled(false);
						viewDesempenho.getSobraJFT().setText("00000");
						viewDesempenho.getControleFornecidaJFT().setEnabled(false);
						viewDesempenho.getControleFornecidaJFT().setText("000000");
						viewDesempenho.getControleSobraJFT().setEnabled(false);
						viewDesempenho.getControleSobraJFT().setText("000000");
						((JFormattedTextField) e.getSource()).transferFocus();
						viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
//						SETA OS DADOS NO OBJETO EM MEMORIA, INDICA QUE ESSA PARTE ESTÁ FINALIZADA E SEGUE PARA DIGITAR O VERSO DA FOLHA 
//						NA PROXIMA TELA 
						controller.getModel().getExperimentoVO().getDesempenho()
								.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().addAll(rme);
						controller.getModel().getExperimentoVO().getDesempenho()
								.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).setFinalizado(true);
						controller.getModel().getModelStateDAO().saveModelState(false);
						rme = new ArrayList<>();
						controller.startDesempenhoVerso(idades);
						viewDesempenho.setVisible(false);
					} else {
//						ADICIONA OS DADOS DE RAÇÃO FORNECIDA E SOBRA NA LISTA DE RME E CONTINUA DIGITANDO A PROXIMA FASE
						rme.addAll(rmeTemp);
						rmeTemp = new ArrayList<>();
						if (controller.getModel().getExperimentoVO().getDesempenho() != null
								&& controller.getModel().getExperimentoVO().getDesempenho().size() > 0) {
							if (controller.getModel().getExperimentoVO().getDesempenho()
									.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1)
									.getBaia() == Integer.parseInt(viewDesempenho.getBaiaJFT().getText())) {
								controller.getModel().getExperimentoVO().getDesempenho()
										.get(controller.getModel().getExperimentoVO().getDesempenho().size() - 1).getConsumo().addAll(rme);
								rme = new ArrayList<>();
							}else {
								controller.getModel().getExperimentoVO().getDesempenho()
								.add(new DesempenhoVOP(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
										Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
										Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
										Integer.parseInt(viewDesempenho.getLinhagemJFT().getText()),
										Integer.parseInt(viewDesempenho.getTrataJFT().getText()),
										Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()), rme, false));
						rme = new ArrayList<>();
							}
						} else {
							controller.getModel().getExperimentoVO().getDesempenho()
									.add(new DesempenhoVOP(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
											Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
											Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
											Integer.parseInt(viewDesempenho.getLinhagemJFT().getText()),
											Integer.parseInt(viewDesempenho.getTrataJFT().getText()),
											Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()), rme, false));
							rme = new ArrayList<>();
						}
						controller.getModel().getModelStateDAO().saveModelState(false);
						atualizaFaseRacao();
						continuarDigitacaoRacoes();
						TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
						viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
						System.out.println("continua digitação dos consumos");
					}
				} else {
//					FLUXO DE ERRO, ADICIONA NA LISTA DE ERROS E SEGUE PARA DIGITAR NOVAMENTE OS FORNECIMENTOS DE RACAO DA FASE
					rmeErros.addAll(rmeTemp);
					rmeTemp = new ArrayList<>();
					fluxoErroControleSobra();
					ordemRME = rmeErros.get(0).getOrdem();
					recuperaHistRME(false, true);
//					viewDesempenho.getOrdemJFT().setText("1");
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 2);
					viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
				}
			}
		}

	}

	public void atualizaFaseRacao() {
		if (faseAnterior != idadeFaseAtual) {
			faseAnterior = idadeFaseAtual;
		}
		countIdades++;
		countFase++;
		somaValoresRacao = 0;
		if (countIdades < idades.size()) {
			idadeFaseAtual = idades.get(countIdades);
			viewDesempenho.getFaseConsumoLabel().setText("Fase " + countFase + " (Idade " + idadeFaseAtual + ")");
		}
	}

	public void continuarDigitacaoRacoes() {
		viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().setText("000");
		viewDesempenho.getIdadeJFT().grabFocus();
		viewDesempenho.getFornecidaJFT().setEnabled(false);
		viewDesempenho.getFornecidaJFT().setText("00000");
		viewDesempenho.getSobraJFT().setEnabled(false);
		viewDesempenho.getSobraJFT().setText("00000");
		viewDesempenho.getControleFornecidaJFT().setEnabled(false);
		viewDesempenho.getControleFornecidaJFT().setText("000000");
		viewDesempenho.getControleSobraJFT().setEnabled(false);
		viewDesempenho.getControleSobraJFT().setText("000000");
	}

	public void fluxoProblemaDigitacaoRacoes() {
		viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().grabFocus();
		viewDesempenho.getFornecidaJFT().setEnabled(false);
		viewDesempenho.getSobraJFT().setEnabled(false);
	}

	public Integer calculaControleRacaoFornecida() {
		Integer soma = 0;
		for (RmeVOP rme : rmeTemp) {
			soma += rme.getFornecida();
		}
		return soma;
	}

	public Integer calculaControleSobra() {
		Integer soma = 0;
		for (RmeVOP rme : rmeTemp) {
			soma += rme.getSobra();
		}
		return soma;
	}

	public Integer calculaControleMortalidade() {
		Integer soma = 0;
		for (MortalidadeVOP morto : mortosTemp) {
			soma += morto.getIdade();
			soma += morto.getPeso();
			soma += morto.getQuantidade();
		}
		return soma;
	}

	public Integer calculaControleEliminados() {
		Integer soma = 0;
		for (EliminadosVOP eliminado : eliminadosTemp) {
			soma += eliminado.getIdade();
			soma += eliminado.getPeso();
			soma += eliminado.getQuantidade();
		}
		return soma;
	}

	public Integer calculaControleErros() {
		Integer soma = 0;
		for (ErrosVOP erros : errosTemp) {
			soma += erros.getIdade();
			soma += erros.getPeso();
			soma += erros.getQuantidade();
		}
		return soma;
	}

	public Integer calculaControleAmostrados() {
		Integer soma = 0;
		for (AmostradosVOP amostrado : amostradosTemp) {
			soma += amostrado.getIdade();
			soma += amostrado.getPeso();
			soma += amostrado.getQuantidade();
		}
		return soma;
	}

	public Integer calculaControlePesados() {
		Integer soma = 0;
		for (PesadosVOP pesado : pesadosTemp) {
			soma += pesado.getIdade();
			soma += pesado.getPeso();
			soma += pesado.getQuantidade();
		}
		return soma;
	}

	public void addListas() {
		mortos.addAll(mortosTemp);
		eliminados.addAll(eliminadosTemp);
		erros.addAll(errosTemp);
		amostrados.addAll(amostradosTemp);
		pesados.addAll(pesadosTemp);

		mortosTemp = new ArrayList<>();
		eliminadosTemp = new ArrayList<>();
		errosTemp = new ArrayList<>();
		amostradosTemp = new ArrayList<>();
		pesadosTemp = new ArrayList<>();
		mortosErros = new ArrayList<>();
		eliminadosErros = new ArrayList<>();
		errosErros = new ArrayList<>();
		amostradosErros = new ArrayList<>();
		pesadosErros = new ArrayList<>();
	}

	public Integer getMaiorLista() {
		int countMortos = 0;
		int countElim = 0;
		int countErros = 0;
		int countAm = 0;
		int countPesados = 0;
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < mortos.size(); i++) {
			countMortos++;
		}
		lista.add(countMortos);
		for (int i = 0; i < eliminados.size(); i++) {
			countElim++;
		}
		lista.add(countElim);
		for (int i = 0; i < erros.size(); i++) {
			countErros++;
		}
		lista.add(countErros);
		for (int i = 0; i < amostrados.size(); i++) {
			countAm++;
		}
		lista.add(countAm);
		for (int i = 0; i < pesados.size(); i++) {
			countPesados++;
		}
		lista.add(countPesados);

		Collections.sort(lista);
		return lista.get(lista.size() - 1);
	}

//	public void fluxoContRME() {
//		viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
//		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
//		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
//		viewDesempenho.getIdadeJFT().setEnabled(false);
//		viewDesempenho.getFornecidaJFT().setEnabled(false);
//		viewDesempenho.getSobraJFT().setEnabled(false);
//		// viewDesempenho.getControleRacaoJFT().setEnabled(false);
//
//	}

	public void updateHistRME() {
		viewDesempenho.getOrdemHist1Label().setText(viewDesempenho.getOrdemHist2Label().getText());
		viewDesempenho.getOrdemHist2Label().setText(viewDesempenho.getOrdemHist3Label().getText());
		viewDesempenho.getOrdemHist3Label().setText(viewDesempenho.getOrdemHist4Label().getText());
		viewDesempenho.getOrdemHist4Label().setText(viewDesempenho.getOrdemHist5Label().getText());
		viewDesempenho.getOrdemHist5Label().setText(viewDesempenho.getOrdemJFT().getText());
		viewDesempenho.getIdadeHist1Label().setText(viewDesempenho.getIdadeHist2Label().getText());
		viewDesempenho.getIdadeHist2Label().setText(viewDesempenho.getIdadeHist3Label().getText());
		viewDesempenho.getIdadeHist3Label().setText(viewDesempenho.getIdadeHist4Label().getText());
		viewDesempenho.getIdadeHist4Label().setText(viewDesempenho.getIdadeHist5Label().getText());
		viewDesempenho.getIdadeHist5Label().setText(viewDesempenho.getIdadeJFT().getText());
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
		if (!rmeErros.isEmpty()) {
			recuperaHistRME(false, false);
		} else {
			viewDesempenho.getIdadeJFT().setText("000");
			viewDesempenho.getFornecidaJFT().setText("00000");
			viewDesempenho.getSobraJFT().setText("00000");
			viewDesempenho.pack();
		}
	}

	public void recuperaHistRME(boolean zeraControleFornecida, boolean zeraControleSobra) {
		viewDesempenho.getOrdemJFT().setText("" + rmeErros.get(0).getOrdem());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeJFT(), viewDesempenho.getIdadeJFT().getText(), 2);
		viewDesempenho.getIdadeJFT().setText("" + rmeErros.get(0).getIdadeRacao());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeJFT(), viewDesempenho.getIdadeJFT().getText(), 3);
		viewDesempenho.getFornecidaJFT().setText("" + rmeErros.get(0).getFornecida());
		TextFormatter.formatStringJFT(viewDesempenho.getFornecidaJFT(), viewDesempenho.getFornecidaJFT().getText(), 5);
		viewDesempenho.getSobraJFT().setText("" + rmeErros.get(0).getSobra());
		TextFormatter.formatStringJFT(viewDesempenho.getSobraJFT(), viewDesempenho.getSobraJFT().getText(), 5);
		rmeErros.remove(0);

		if (zeraControleFornecida && zeraControleSobra) {
			// ZERA OS DOIS CONTROLES
			viewDesempenho.getIdadeJFT().setEnabled(true);
			viewDesempenho.getIdadeJFT().grabFocus();
			viewDesempenho.getControleFornecidaJFT().setEnabled(false);
			viewDesempenho.getControleFornecidaJFT().setText("000000");
			viewDesempenho.getControleSobraJFT().setEnabled(false);
			viewDesempenho.getControleSobraJFT().setText("000000");
		} else if (zeraControleFornecida && !zeraControleSobra) {
			// ZERA O CONTROLE DA RACAO FORNECIDA
			viewDesempenho.getIdadeJFT().setEnabled(true);
			viewDesempenho.getIdadeJFT().grabFocus();
			viewDesempenho.getControleFornecidaJFT().setEnabled(false);
			viewDesempenho.getControleFornecidaJFT().setText("000000");
		} else if (!zeraControleFornecida && zeraControleSobra) {
			// ZERA O CONTROLE DA RACAO SOBRA
			viewDesempenho.getIdadeJFT().setEnabled(true);
			viewDesempenho.getIdadeJFT().grabFocus();
			viewDesempenho.getControleSobraJFT().setEnabled(false);
			viewDesempenho.getControleSobraJFT().setText("000000");
		} else {
			// NAO ZERA nada
			viewDesempenho.getIdadeJFT().setEnabled(true);
			viewDesempenho.getIdadeJFT().grabFocus();
		}

	}

	public void clearHistRME() {
		viewDesempenho.getIdadeJFT().setText("");
		viewDesempenho.getFornecidaJFT().setText("");
		viewDesempenho.getSobraJFT().setText("");
		viewDesempenho.getControleFornecidaJFT().setText("");
		viewDesempenho.getControleSobraJFT().setText("");
		viewDesempenho.getOrdemHist5Label().setText("");
		viewDesempenho.getOrdemHist4Label().setText("");
		viewDesempenho.getOrdemHist3Label().setText("");
		viewDesempenho.getOrdemHist2Label().setText("");
		viewDesempenho.getOrdemHist1Label().setText("");
		viewDesempenho.getIdadeHist5Label().setText("");
		viewDesempenho.getIdadeHist1Label().setText("");
		viewDesempenho.getIdadeHist2Label().setText("");
		viewDesempenho.getIdadeHist3Label().setText("");
		viewDesempenho.getIdadeHist4Label().setText("");
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
		ordemRME = 1;
	}

	public void fluxoErroControleFornecida() {
		viewDesempenho.getIdadeJFT().setText("");
		viewDesempenho.getFornecidaJFT().setText("");
		viewDesempenho.getSobraJFT().setText("");
		viewDesempenho.getControleFornecidaJFT().setText("");
		viewDesempenho.getOrdemHist5Label().setText("");
		viewDesempenho.getOrdemHist4Label().setText("");
		viewDesempenho.getOrdemHist3Label().setText("");
		viewDesempenho.getOrdemHist2Label().setText("");
		viewDesempenho.getOrdemHist1Label().setText("");
		viewDesempenho.getIdadeHist5Label().setText("");
		viewDesempenho.getIdadeHist1Label().setText("");
		viewDesempenho.getIdadeHist2Label().setText("");
		viewDesempenho.getIdadeHist3Label().setText("");
		viewDesempenho.getIdadeHist4Label().setText("");
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
	}

	public void fluxoErroControleSobra() {
		viewDesempenho.getIdadeJFT().setText("");
		viewDesempenho.getFornecidaJFT().setText("");
		viewDesempenho.getSobraJFT().setText("");
		viewDesempenho.getControleSobraJFT().setText("");
		viewDesempenho.getOrdemHist5Label().setText("");
		viewDesempenho.getOrdemHist4Label().setText("");
		viewDesempenho.getOrdemHist3Label().setText("");
		viewDesempenho.getOrdemHist2Label().setText("");
		viewDesempenho.getOrdemHist1Label().setText("");
		viewDesempenho.getIdadeHist5Label().setText("");
		viewDesempenho.getIdadeHist1Label().setText("");
		viewDesempenho.getIdadeHist2Label().setText("");
		viewDesempenho.getIdadeHist3Label().setText("");
		viewDesempenho.getIdadeHist4Label().setText("");
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
	}

	public void fluxoOkRME() {
		viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().grabFocus();
		viewDesempenho.getFornecidaJFT().setEnabled(false);
		viewDesempenho.getSobraJFT().setEnabled(false);
	}

	public void fluxoProblemaCabecalho() {
		viewDesempenho.getBaiaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getBaiaJFT().setEnabled(true);
		viewDesempenho.getBaiaJFT().grabFocus();
		viewDesempenho.getSexoJFT().setEnabled(false);
		viewDesempenho.getLadoJFT().setEnabled(false);
		viewDesempenho.getTrataJFT().setEnabled(false);
		viewDesempenho.getAvesAlojadasJFT().setEnabled(false);
		viewDesempenho.getControleBaiaJFT().setEnabled(false);
	}

	public void fluxoOkCabecalho() {
		viewDesempenho.getBaiaJP().setBorder(defaultBaiaJP);
		viewDesempenho.getBaiaJFT().setEnabled(false);
		viewDesempenho.getSexoJFT().setEnabled(false);
		viewDesempenho.getLadoJFT().setEnabled(false);
		viewDesempenho.getLinhagemJFT().setEnabled(false);
		viewDesempenho.getTrataJFT().setEnabled(false);
		viewDesempenho.getAvesAlojadasJFT().setEnabled(false);
		viewDesempenho.getControleBaiaJFT().setEnabled(false);
		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().grabFocus();
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

	public List<MortalidadeVOP> getMortos() {
		return mortos;
	}

	public void setMortos(List<MortalidadeVOP> mortos) {
		this.mortos = mortos;
	}

	public List<EliminadosVOP> getEliminados() {
		return eliminados;
	}

	public void setEliminados(List<EliminadosVOP> eliminados) {
		this.eliminados = eliminados;
	}

	public List<ErrosVOP> getErros() {
		return erros;
	}

	public void setAmostrados(List<AmostradosVOP> amostrados) {
		this.amostrados = amostrados;
	}

	public List<PesadosVOP> getPesoPesados() {
		return pesados;
	}

	public void setPesados(List<PesadosVOP> pesados) {
		this.pesados = pesados;
	}

	public int getControleBaia() {
		return controleBaia;
	}

	public void setControleBaia(int controleBaia) {
		this.controleBaia = controleBaia;
	}

	public int getOrdemRME() {
		return ordemRME;
	}

	public void setOrdemRME(int ordemRME) {
		this.ordemRME = ordemRME;
	}

	public int getOrdemP() {
		return ordemP;
	}

	public void setOrdemP(int ordemP) {
		this.ordemP = ordemP;
	}

	public ViewDesempenhoP getViewDesempenho() {
		return viewDesempenho;
	}

	public void setViewDesempenho(ViewDesempenhoP viewDesempenho) {
		this.viewDesempenho = viewDesempenho;
	}

	public Border getDefaultBaiaJP() {
		return defaultBaiaJP;
	}

	public void setDefaultBaiaJP(Border defaultBaiaJP) {
		this.defaultBaiaJP = defaultBaiaJP;
	}

	public Border getDefaultRmeJP() {
		return defaultRmeJP;
	}

	public void setDefaultRmeJP(Border defaultRmeJP) {
		this.defaultRmeJP = defaultRmeJP;
	}

	public Border getDefaultPesagemJP() {
		return defaultPesagemJP;
	}

	public void setDefaultPesagemJP(Border defaultPesagemJP) {
		this.defaultPesagemJP = defaultPesagemJP;
	}

	public List<DesempenhoVOP> getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(List<DesempenhoVOP> desempenho) {
		this.desempenho = desempenho;
	}

	public List<RmeVOP> getRme() {
		return rme;
	}

	public void setRme(List<RmeVOP> rme) {
		this.rme = rme;
	}

	public List<RmeVOP> getRmeTemp() {
		return rmeTemp;
	}

	public void setRmeTemp(List<RmeVOP> rmeTemp) {
		this.rmeTemp = rmeTemp;
	}

	public List<RmeVOP> getRmeErros() {
		return rmeErros;
	}

	public void setRmeErros(List<RmeVOP> rmeErros) {
		this.rmeErros = rmeErros;
	}

	public List<MortalidadeVOP> getMortosTemp() {
		return mortosTemp;
	}

	public void setMortosTemp(List<MortalidadeVOP> mortosTemp) {
		this.mortosTemp = mortosTemp;
	}

	public List<MortalidadeVOP> getMortosErros() {
		return mortosErros;
	}

	public void setMortosErros(List<MortalidadeVOP> mortosErros) {
		this.mortosErros = mortosErros;
	}

	public List<EliminadosVOP> getEliminadosTemp() {
		return eliminadosTemp;
	}

	public void setEliminadosTemp(List<EliminadosVOP> eliminadosTemp) {
		this.eliminadosTemp = eliminadosTemp;
	}

	public List<EliminadosVOP> getEliminadosErros() {
		return eliminadosErros;
	}

	public void setEliminadosErros(List<EliminadosVOP> eliminadosErros) {
		this.eliminadosErros = eliminadosErros;
	}

	public List<ErrosVOP> getErrosTemp() {
		return errosTemp;
	}

	public void setErrosTemp(List<ErrosVOP> errosTemp) {
		this.errosTemp = errosTemp;
	}

	public List<ErrosVOP> getErrosErros() {
		return errosErros;
	}

	public void setErrosErros(List<ErrosVOP> errosErros) {
		this.errosErros = errosErros;
	}

	public List<AmostradosVOP> getAmostradosTemp() {
		return amostradosTemp;
	}

	public void setAmostradosTemp(List<AmostradosVOP> amostradosTemp) {
		this.amostradosTemp = amostradosTemp;
	}

	public List<AmostradosVOP> getAmostradosErros() {
		return amostradosErros;
	}

	public void setAmostradosErros(List<AmostradosVOP> amostradosErros) {
		this.amostradosErros = amostradosErros;
	}

	public List<PesadosVOP> getPesadosTemp() {
		return pesadosTemp;
	}

	public void setPesadosTemp(List<PesadosVOP> pesadosTemp) {
		this.pesadosTemp = pesadosTemp;
	}

	public List<PesadosVOP> getPesadosErros() {
		return pesadosErros;
	}

	public void setPesadosErros(List<PesadosVOP> pesadosErros) {
		this.pesadosErros = pesadosErros;
	}

	public List<Integer> getIdades() {
		return idades;
	}

	public void setIdades(List<Integer> idades) {
		this.idades = idades;
	}

	public Integer getIdadeFaseAtual() {
		return idadeFaseAtual;
	}

	public void setIdadeFaseAtual(Integer idadeFaseAtual) {
		this.idadeFaseAtual = idadeFaseAtual;
	}

	public Integer getFaseAnterior() {
		return faseAnterior;
	}

	public void setFaseAnterior(Integer faseAnterior) {
		this.faseAnterior = faseAnterior;
	}

	public Integer getCountFase() {
		return countFase;
	}

	public void setCountFase(Integer countFase) {
		this.countFase = countFase;
	}

	public Integer getCountIdades() {
		return countIdades;
	}

	public void setCountIdades(Integer countIdades) {
		this.countIdades = countIdades;
	}

	public Integer getSomaValoresRacao() {
		return somaValoresRacao;
	}

	public void setSomaValoresRacao(Integer somaValoresRacao) {
		this.somaValoresRacao = somaValoresRacao;
	}

	public Integer getSomaControleRacoes() {
		return somaControleRacoes;
	}

	public void setSomaControleRacoes(Integer somaControleRacoes) {
		this.somaControleRacoes = somaControleRacoes;
	}

	public ControllerP getController() {
		return controller;
	}

	public DesempenhoBOP getDesempenhoBO() {
		return desempenhoBO;
	}

	public List<PesadosVOP> getPesados() {
		return pesados;
	}

	public void setErros(List<ErrosVOP> erros) {
		this.erros = erros;
	}

	public List<AmostradosVOP> getAmostrados() {
		return amostrados;
	}

}