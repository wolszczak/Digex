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
import brf.util.SaveUpdater;
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
	private Integer somaControleMortalidade, somaValoresMortalidade, idadeFaseAtualMortalidade, faseAnteriorMortalidade,
			countFaseMortalidade, countIdadesMortalidade;
	private Integer somaControleEliminados, somaValoresEliminados, idadeFaseAtualEliminados, faseAnteriorEliminados,
			countFaseEliminados, countIdadesEliminados;
	private Integer somaControleErros, somaValoresErros, idadeFaseAtualErros, faseAnteriorErros, countFaseErros,
			countIdadesErros;
	private Integer somaControleAmostrados, somaValoresAmostrados, idadeFaseAtualAmostrados, faseAnteriorAmostrados,
			countFaseAmostrados, countIdadesAmostrados;
	private Integer somaControlePesados, somaValoresPesados, idadeFaseAtualPesados, faseAnteriorPesados,
			countFasePesados, countIdadesPesados;

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
		viewDesempenho.getRegistroLabel().setVisible(false);
		viewDesempenho.getAviarioJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getAviario());
		defaultBaiaJP = viewDesempenho.getBaiaJP().getBorder();
		defaultRmeJP = viewDesempenho.getConsumoJP().getBorder();
		defaultPesagemJP = viewDesempenho.getPesagemJP().getBorder();
		idades = idadesFases;
		countIdades = 0;
		countIdadesMortalidade = 0;
		countIdadesEliminados = 0;
		countIdadesErros = 0;
		countIdadesAmostrados = 0;
		countIdadesPesados = 0;
		faseAnterior = 0;
		faseAnteriorMortalidade = 0;
		faseAnteriorEliminados = 0;
		faseAnteriorErros = 0;
		faseAnteriorAmostrados = 0;
		faseAnteriorPesados = 0;
		countFase = 1;
		countFaseMortalidade = 1;
		countFaseEliminados = 1;
		countFaseErros = 1;
		countFaseAmostrados = 1;
		countFasePesados = 1;
		somaValoresRacao = 0;
		somaValoresMortalidade = 0;
		somaValoresEliminados = 0;
		somaValoresErros = 0;
		somaValoresAmostrados = 0;
		somaValoresPesados = 0;
		idadeFaseAtual = idades.get(countIdades);
		idadeFaseAtualMortalidade = idades.get(countIdades);
		idadeFaseAtualEliminados = idades.get(countIdades);
		idadeFaseAtualErros = idades.get(countIdades);
		idadeFaseAtualAmostrados = idades.get(countIdades);
		idadeFaseAtualPesados = idades.get(countIdades);
		somaControleRacoes = 0;
		somaControleMortalidade = 0;
		somaControleEliminados = 0;
		somaControleErros = 0;
		somaControleAmostrados = 0;
		somaControlePesados = 0;
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
		viewDesempenho.getOrdemMortalidadeJFT().setText("1");
		viewDesempenho.getOrdemEliminadosJFT().setText("1");
		viewDesempenho.getOrdemErrosJFT().setText("1");
		viewDesempenho.getOrdemAmostradosJFT().setText("1");
		viewDesempenho.getOrdemPesagemJFT().setText("1");
		viewDesempenho.getIdadeJFT().setText("000");
		viewDesempenho.getFornecidaJFT().setText("00000");
		viewDesempenho.getSobraJFT().setText("00000");
		viewDesempenho.getControleFornecidaJFT().setText("000000");
		viewDesempenho.getControleSobraJFT().setText("000000");
		viewDesempenho.getIdadeMortalidadeJFT().setText("000");
		viewDesempenho.getNrMortalidadeJFT().setText("000");
		viewDesempenho.getPesoMortalidadeJFT().setText("000000");
		viewDesempenho.getControleMortalidadeJFT().setText("000000");
		viewDesempenho.getIdadeEliminadosJFT().setText("000");
		viewDesempenho.getNrEliminadosJFT().setText("000");
		viewDesempenho.getPesoEliminadosJFT().setText("000000");
		viewDesempenho.getControleEliminadosJFT().setText("000000");
		viewDesempenho.getIdadeErrosJFT().setText("000");
		viewDesempenho.getNrErrosJFT().setText("000");
		viewDesempenho.getPesoErrosJFT().setText("000000");
		viewDesempenho.getControleErrosJFT().setText("000000");
		viewDesempenho.getIdadeAmostradosJFT().setText("000");
		viewDesempenho.getNrAmostradosJFT().setText("000");
		viewDesempenho.getPesoAmostradosJFT().setText("000000");
		viewDesempenho.getControleAmostradosJFT().setText("000000");
		viewDesempenho.getIdadePesadosJFT().setText("000");
		viewDesempenho.getNrPesadosJFT().setText("000");
		viewDesempenho.getPesadosJFT().setText("000000");
		viewDesempenho.getControlePesagemJFT().setText("000000");

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
		order.add(viewDesempenho.getIdadeMortalidadeJFT());
		order.add(viewDesempenho.getNrMortalidadeJFT());
		order.add(viewDesempenho.getPesoMortalidadeJFT());
		order.add(viewDesempenho.getControleMortalidadeJFT());
		order.add(viewDesempenho.getIdadeEliminadosJFT());
		order.add(viewDesempenho.getNrEliminadosJFT());
		order.add(viewDesempenho.getPesoEliminadosJFT());
		order.add(viewDesempenho.getControleEliminadosJFT());
		order.add(viewDesempenho.getIdadeErrosJFT());
		order.add(viewDesempenho.getNrErrosJFT());
		order.add(viewDesempenho.getPesoErrosJFT());
		order.add(viewDesempenho.getControleErrosJFT());
		order.add(viewDesempenho.getIdadeAmostradosJFT());
		order.add(viewDesempenho.getNrAmostradosJFT());
		order.add(viewDesempenho.getPesoAmostradosJFT());
		order.add(viewDesempenho.getControleAmostradosJFT());
		order.add(viewDesempenho.getIdadePesadosJFT());
		order.add(viewDesempenho.getNrPesadosJFT());
		order.add(viewDesempenho.getPesadosJFT());
		order.add(viewDesempenho.getControlePesagemJFT());
		order.add(viewDesempenho.getOpcaoJFT());
		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		viewDesempenho.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
		desempenho = controller.getModel().getExperimentoVO().getDesempenho();

	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	public void loadHist() {
		List<JLabel> histFornecida = new ArrayList<>();
		List<JLabel> histSobra = new ArrayList<>();
		List<JLabel> histNrMortos = new ArrayList<>();
		List<JLabel> histPesoMortos = new ArrayList<>();
		List<JLabel> histNrEliminados = new ArrayList<>();
		List<JLabel> histPesoEliminados = new ArrayList<>();
		List<JLabel> histNrErros = new ArrayList<>();
		List<JLabel> histPesoErros = new ArrayList<>();
		List<JLabel> histNrAmostrados = new ArrayList<>();
		List<JLabel> histPesoAmostrados = new ArrayList<>();
		List<JLabel> histNrPesados = new ArrayList<>();
		List<JLabel> histPesoPesados = new ArrayList<>();

		histFornecida.add(viewDesempenho.getFornecidaHist1Label());
		histSobra.add(viewDesempenho.getSobraHist1Label());
		histNrMortos.add(viewDesempenho.getNrMHist1Label());
		histPesoMortos.add(viewDesempenho.getPesoMHist1Label());
		histNrEliminados.add(viewDesempenho.getNrElHist1Label());
		histPesoEliminados.add(viewDesempenho.getPesoElHist1Label());
		histNrErros.add(viewDesempenho.getNrErHist1Label());
		histPesoErros.add(viewDesempenho.getPesoErHist1Label());
		histNrAmostrados.add(viewDesempenho.getNrAmHist1Label());
		histPesoAmostrados.add(viewDesempenho.getPesoAmHist1Label());
		histNrPesados.add(viewDesempenho.getNrPesadosHist1Label());
		histPesoPesados.add(viewDesempenho.getPesadosHist1Label());

		histFornecida.add(viewDesempenho.getFornecidaHist2Label());
		histSobra.add(viewDesempenho.getSobraHist2Label());
		histNrMortos.add(viewDesempenho.getNrMHist2Label());
		histPesoMortos.add(viewDesempenho.getPesoMHist2Label());
		histNrEliminados.add(viewDesempenho.getNrElHist2Label());
		histPesoEliminados.add(viewDesempenho.getPesoElHist2Label());
		histNrErros.add(viewDesempenho.getNrErHist2Label());
		histPesoErros.add(viewDesempenho.getPesoErHist2Label());
		histNrAmostrados.add(viewDesempenho.getNrAmHist2Label());
		histPesoAmostrados.add(viewDesempenho.getPesoAmHist2Label());
		histNrPesados.add(viewDesempenho.getNrPesadosHist2Label());
		histPesoPesados.add(viewDesempenho.getPesadosHist2Label());

		histFornecida.add(viewDesempenho.getFornecidaHist3Label());
		histSobra.add(viewDesempenho.getSobraHist3Label());
		histNrMortos.add(viewDesempenho.getNrMHist3Label());
		histPesoMortos.add(viewDesempenho.getPesoMHist3Label());
		histNrEliminados.add(viewDesempenho.getNrElHist3Label());
		histPesoEliminados.add(viewDesempenho.getPesoElHist3Label());
		histNrErros.add(viewDesempenho.getNrErHist3Label());
		histPesoErros.add(viewDesempenho.getPesoErHist3Label());
		histNrAmostrados.add(viewDesempenho.getNrAmHist3Label());
		histPesoAmostrados.add(viewDesempenho.getPesoAmHist3Label());
		histNrPesados.add(viewDesempenho.getNrPesadosHist3Label());
		histPesoPesados.add(viewDesempenho.getPesadosHist3Label());

		histFornecida.add(viewDesempenho.getFornecidaHist4Label());
		histSobra.add(viewDesempenho.getSobraHist4Label());
		histNrMortos.add(viewDesempenho.getNrMHist4Label());
		histPesoMortos.add(viewDesempenho.getPesoMHist4Label());
		histNrEliminados.add(viewDesempenho.getNrElHist4Label());
		histPesoEliminados.add(viewDesempenho.getPesoElHist4Label());
		histNrErros.add(viewDesempenho.getNrErHist4Label());
		histPesoErros.add(viewDesempenho.getPesoErHist4Label());
		histNrAmostrados.add(viewDesempenho.getNrAmHist4Label());
		histPesoAmostrados.add(viewDesempenho.getPesoAmHist4Label());
		histNrPesados.add(viewDesempenho.getNrPesadosHist4Label());
		histPesoPesados.add(viewDesempenho.getPesadosHist4Label());

		histFornecida.add(viewDesempenho.getFornecidaHist5Label());
		histSobra.add(viewDesempenho.getSobraHist5Label());
		histNrMortos.add(viewDesempenho.getNrMHist5Label());
		histPesoMortos.add(viewDesempenho.getPesoMHist5Label());
		histNrEliminados.add(viewDesempenho.getNrElHist5Label());
		histPesoEliminados.add(viewDesempenho.getPesoElHist5Label());
		histNrErros.add(viewDesempenho.getNrErHist5Label());
		histPesoErros.add(viewDesempenho.getPesoErHist5Label());
		histNrAmostrados.add(viewDesempenho.getNrAmHist5Label());
		histPesoAmostrados.add(viewDesempenho.getPesoAmHist5Label());
		histNrPesados.add(viewDesempenho.getNrPesadosHist5Label());
		histPesoPesados.add(viewDesempenho.getPesadosHist5Label());

		System.out.println("O tamanho da Racao: " + histFornecida.size());
		System.out.println("O tamanho da Sobra: " + histSobra.size());

		desempenho = controller.getModel().getExperimentoVO().getDesempenho();

		if (!desempenho.isEmpty()) {
			System.out.println("Nao Vazio");
			viewDesempenho.getBaiaJFT().setText("" + desempenho.get(desempenho.size() - 1).getBaia());
			viewDesempenho.getSexoJFT().setText("" + desempenho.get(desempenho.size() - 1).getSexo());
			viewDesempenho.getLadoJFT().setText("" + desempenho.get(desempenho.size() - 1).getLado());
			viewDesempenho.getLinhagemJFT().setText("" + desempenho.get(desempenho.size() - 1).getLinhagem());
			viewDesempenho.getTrataJFT().setText("" + desempenho.get(desempenho.size() - 1).getTrata());
			viewDesempenho.getAvesAlojadasJFT().setText("" + desempenho.get(desempenho.size() - 1).getNrAlojados());
			viewDesempenho.getBaiaJFT().setEnabled(false);
			viewDesempenho.getFornecidaJFT().setEnabled(true);
			viewDesempenho.getFornecidaJFT().grabFocus();

		}
		ordemRME++;
		ordemP++;
		viewDesempenho.getOrdemJFT().setText("" + ordemRME);
		viewDesempenho.getOrdemMortalidadeJFT().setText("" + ordemP);
		TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(), 3);
		TextFormatter.formatStringJFT(viewDesempenho.getOrdemMortalidadeJFT(),
				viewDesempenho.getOrdemMortalidadeJFT().getText(), 3);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewDesempenho.getIdadeJFT())
				&& !e.getSource().equals(viewDesempenho.getOpcaoJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeMortalidadeJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeEliminadosJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeErrosJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeAmostradosJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadePesadosJFT())
				&& !e.getSource().equals(viewDesempenho.getIdadeMortalidadeJFT())) {
			System.out.println("left");
			Component prev = viewDesempenho.getFocusTraversalPolicy().getComponentBefore(viewDesempenho,
					(JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			if (!e.getSource().equals(viewDesempenho.getOpcaoJFT())) {
				prev = viewDesempenho.getFocusTraversalPolicy().getComponentBefore(viewDesempenho,
						(JFormattedTextField) src);
			} else {
				prev = viewDesempenho.getIdadeJFT();
			}
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
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
				openWindow(idades);
				break;
			case KeyEvent.VK_2:
				int option = JOptionPane.showConfirmDialog(viewDesempenho,
						"Deseja realmente voltar para tela principal?", "SDDGE - Finalizar Desempenho",
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
			int option = JOptionPane.showConfirmDialog(viewDesempenho, "Deseja realmente voltar para tela anterior?",
					"SDDGE - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
				viewDesempenho.getRegistroLabel().setEnabled(false);
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
						+ Integer.parseInt(viewDesempenho.getBaiaJFT().getText())
						+ Integer.parseInt(viewDesempenho.getSexoJFT().getText())
						+ Integer.parseInt(viewDesempenho.getLinhagemJFT().getText())
						+ Integer.parseInt(viewDesempenho.getLadoJFT().getText())
						+ Integer.parseInt(viewDesempenho.getTrataJFT().getText())
						+ Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText());
				if (controleBaia != somaControle) {
					fluxoProblemaCabecalho();
				} else {
					String msg = desempenhoBO.verificaCabecalho(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
							Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
							Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
							Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()));
					if (msg.length() != 0) {
						JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
								JOptionPane.ERROR_MESSAGE);
						fluxoProblemaCabecalho();
					} else if (desempenhoBO.isBaiaDigitada(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()))) {
						int option = JOptionPane.showConfirmDialog(viewDesempenho,
								"Baia já digitada.\nDeseja digitar novamente?", "DIGEX - Aviso",
								JOptionPane.WARNING_MESSAGE);
						if (option == 0) {
							desempenhoBO.excluirBaia(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()));
							viewDesempenho.getOrdemJFT().setText("1");
							fluxoOkCabecalho();
						} else {
							fluxoProblemaCabecalho();
						}
					} else {
						viewDesempenho.getOrdemJFT().setText("1");
						fluxoOkCabecalho();
					}
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getFornecidaJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getFornecidaJFT().grabFocus();
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
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoRacoes();
				} else if (Integer.parseInt(viewDesempenho.getIdadeJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getFornecidaJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getSobraJFT().getText()) == 0) {
					viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
					viewDesempenho.getControleFornecidaJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					viewDesempenho.getControleFornecidaJFT().grabFocus();
					viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(),
							3);
				} else {
					rmeTemp.add(new RmeVOP(Integer.parseInt(viewDesempenho.getOrdemJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getIdadeJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getFornecidaJFT().getText().trim()),
							Integer.parseInt(viewDesempenho.getSobraJFT().getText().trim()), new MortalidadeVOP(),
							new EliminadosVOP(), new ErrosVOP(), new AmostradosVOP(), new PesadosVOP()));
					updateHistRME();
					viewDesempenho.getOrdemJFT().setText("" + (++ordemRME));
					TextFormatter.formatStringJFT(viewDesempenho.getOrdemJFT(), viewDesempenho.getOrdemJFT().getText(),
							3);
					viewDesempenho.getIdadeJFT().setEnabled(true);
					viewDesempenho.getIdadeJFT().grabFocus();
					viewDesempenho.getFornecidaJFT().setEnabled(false);
					viewDesempenho.getSobraJFT().setEnabled(false);
					viewDesempenho.getControleFornecidaJFT().setEnabled(false);
					viewDesempenho.getControleSobraJFT().setEnabled(false);
//					continuarDigitacaoRacoes();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleFornecidaJFT()) {
				if (Integer.parseInt(
						viewDesempenho.getControleFornecidaJFT().getText().trim()) == calculaControleRacaoFornecida()) {
					TextFormatter.formatStringJFT(src, text, 6);
					viewDesempenho.getControleFornecidaJFT().setEnabled(false);
					viewDesempenho.getControleSobraJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					viewDesempenho.getControleSobraJFT().grabFocus();
				} else {
					viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					rmeErros.addAll(rmeTemp);
					rmeTemp = new ArrayList<>();
					clearHistRME();
					recuperaHistRME();
					ordemRME = 1;
					viewDesempenho.getOrdemJFT().setText("1");
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
						viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
						((JFormattedTextField) e.getSource()).transferFocus();
						viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
						viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
					} else {
						rme.addAll(rmeTemp);
						rmeTemp = new ArrayList<>();
						clearHistRME();
						atualizaFaseRacao();
						continuarDigitacaoRacoes();
						ordemRME = 1;
						viewDesempenho.getOrdemJFT().setText("1");
						viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
						System.out.println("continua digitação dos consumos");
					}
				} else {
					rmeErros.addAll(rmeTemp);
					rmeTemp = new ArrayList<>();
					clearHistRME();
					recuperaHistRME();
					ordemRME = 1;
					viewDesempenho.getOrdemJFT().setText("1");
					viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeMortalidadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getNrMortalidadeJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getNrMortalidadeJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrMortalidadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getPesoMortalidadeJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getPesoMortalidadeJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoMortalidadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				String msg = desempenhoBO.verificaMortalidade(
						Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()),
						Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()),
						Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText()), faseAnteriorMortalidade,
						idadeFaseAtualMortalidade);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoMortalidade();
				} else if (Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText()) == 0) {
					viewDesempenho.getPnlMortalidade().setBorder(defaultRmeJP);
					viewDesempenho.getControleMortalidadeJFT().setEnabled(true);
					viewDesempenho.getControleMortalidadeJFT().grabFocus();
				} else {
					mortosTemp
							.add(new MortalidadeVOP(Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText())));
					updateHistMortalidade();
					viewDesempenho.getOrdemMortalidadeJFT().setText("" + (++ordemRME));
					continuarDigitacaoMortalidade();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleMortalidadeJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (calculaControleMortalidade() != 0) {
					if (Integer.parseInt(viewDesempenho.getControleMortalidadeJFT().getText()
							.trim()) == calculaControleMortalidade()) {
						mortos.addAll(mortosTemp);
						mortosTemp = new ArrayList<>();
						clearHistMortalidade();
						ordemRME = 1;
						atualizaFaseMortalidade();
						seguirDigitacaoEliminados(e);
					} else {
						mortosErros.addAll(mortosTemp);
						mortosTemp = new ArrayList<>();
						clearHistMortalidade();
						recuperaHistMortalidade();
						ordemRME = 1;
						viewDesempenho.getOrdemMortalidadeJFT().setText("1");
						viewDesempenho.getPnlMortalidade().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				} else {
					mortos.addAll(mortosTemp);
					mortosTemp = new ArrayList<>();
					clearHistMortalidade();
					atualizaFaseMortalidade();
					seguirDigitacaoEliminados(e);
					ordemRME = 1;
					System.out.println("continua digitação dos eliminados");
				}

			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeEliminadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getNrEliminadosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getNrEliminadosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrEliminadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getPesoEliminadosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getPesoEliminadosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoEliminadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				String msg = desempenhoBO.verificaEliminados(
						Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()),
						Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()),
						Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText()), faseAnteriorEliminados,
						idadeFaseAtualEliminados);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoEliminados();
				} else if (Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText()) == 0) {
					viewDesempenho.getPnlEliminados().setBorder(defaultRmeJP);
					viewDesempenho.getControleEliminadosJFT().setEnabled(true);
					viewDesempenho.getControleEliminadosJFT().grabFocus();
				} else {
					eliminadosTemp
							.add(new EliminadosVOP(Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText())));
					updateHistEliminados();
					viewDesempenho.getOrdemEliminadosJFT().setText("" + (++ordemRME));
					continuarDigitacaoEliminados();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleEliminadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (calculaControleEliminados() != 0) {
					if (Integer.parseInt(viewDesempenho.getControleEliminadosJFT().getText()
							.trim()) == calculaControleEliminados()) {
						eliminados.addAll(eliminadosTemp);
						eliminadosTemp = new ArrayList<>();
						clearHistEliminados();
						ordemRME = 1;
						atualizaFaseEliminados();
						seguirDigitacaoErros(e);
					} else {
						eliminadosErros.addAll(eliminadosTemp);
						eliminadosTemp = new ArrayList<>();
						clearHistEliminados();
						recuperaHistEliminados();
						ordemRME = 1;
						viewDesempenho.getOrdemEliminadosJFT().setText("1");
						viewDesempenho.getPnlEliminados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				} else {
					eliminados.addAll(eliminadosTemp);
					eliminadosTemp = new ArrayList<>();
					clearHistEliminados();
					atualizaFaseEliminados();
					seguirDigitacaoErros(e);
					ordemRME = 1;
					System.out.println("continua digitação dos erros");
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeErrosJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getNrErrosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getNrErrosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrErrosJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getPesoErrosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getPesoErrosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoErrosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				String msg = desempenhoBO.verificaErros(Integer.parseInt(viewDesempenho.getIdadeErrosJFT().getText()),
						Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()),
						Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText()), faseAnteriorErros,
						idadeFaseAtualErros);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoErros();
				} else if (Integer.parseInt(viewDesempenho.getIdadeErrosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText()) == 0) {
					viewDesempenho.getPnlErros().setBorder(defaultRmeJP);
					viewDesempenho.getControleErrosJFT().setEnabled(true);
					viewDesempenho.getControleErrosJFT().grabFocus();
				} else {
					errosTemp.add(new ErrosVOP(Integer.parseInt(viewDesempenho.getIdadeErrosJFT().getText()),
							Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()),
							Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText())));
					updateHistErros();
					viewDesempenho.getOrdemErrosJFT().setText("" + (++ordemRME));
					continuarDigitacaoErros();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleErrosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (calculaControleErros() != 0) {
					if (Integer.parseInt(
							viewDesempenho.getControleErrosJFT().getText().trim()) == calculaControleErros()) {
						erros.addAll(errosTemp);
						errosTemp = new ArrayList<>();
						clearHistErros();
						ordemRME = 1;
						atualizaFaseErros();
						seguirDigitacaoAmostrados(e);
					} else {
						errosErros.addAll(errosTemp);
						errosTemp = new ArrayList<>();
						clearHistErros();
						recuperaHistErros();
						ordemRME = 1;
						viewDesempenho.getOrdemErrosJFT().setText("1");
						viewDesempenho.getPnlErros().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				} else {
					erros.addAll(errosTemp);
					errosTemp = new ArrayList<>();
					clearHistErros();
					atualizaFaseErros();
					seguirDigitacaoAmostrados(e);
					ordemRME = 1;
					System.out.println("continua digitação das pesagens");
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadeAmostradosJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getNrAmostradosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getNrAmostradosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrAmostradosJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getPesoAmostradosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getPesoAmostradosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesoAmostradosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				String msg = desempenhoBO.verificaAmostrados(
						Integer.parseInt(viewDesempenho.getIdadeAmostradosJFT().getText()),
						Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()),
						Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText()), faseAnteriorAmostrados,
						idadeFaseAtualAmostrados);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoAmostrados();
				} else if (Integer.parseInt(viewDesempenho.getIdadeAmostradosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()) == 0
						&& Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText()) == 0) {
					viewDesempenho.getPnlAmostrados().setBorder(defaultRmeJP);
					viewDesempenho.getControleAmostradosJFT().setEnabled(true);
					viewDesempenho.getControleAmostradosJFT().grabFocus();
				} else {
					amostradosTemp
							.add(new AmostradosVOP(Integer.parseInt(viewDesempenho.getIdadeAmostradosJFT().getText()),
									Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()),
									Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText())));
					updateHistAmostrados();
					viewDesempenho.getOrdemAmostradosJFT().setText("" + (++ordemRME));
					continuarDigitacaoAmostrados();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControleAmostradosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (calculaControleAmostrados() != 0) {
					if (Integer.parseInt(viewDesempenho.getControleAmostradosJFT().getText()
							.trim()) == calculaControleAmostrados()) {
						amostrados.addAll(amostradosTemp);
						amostradosTemp = new ArrayList<>();
						clearHistAmostrados();
						ordemRME = 1;
						atualizaFaseAmostrados();
						seguirDigitacaoPesagens(e);
					} else {
						amostradosErros.addAll(amostradosTemp);
						amostradosTemp = new ArrayList<>();
						clearHistAmostrados();
						recuperaHistAmostrados();
						ordemRME = 1;
						viewDesempenho.getOrdemAmostradosJFT().setText("1");
						viewDesempenho.getPnlAmostrados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				} else {
					amostrados.addAll(amostradosTemp);
					amostradosTemp = new ArrayList<>();
					clearHistAmostrados();
					atualizaFaseAmostrados();
					seguirDigitacaoPesagens(e);
					ordemRME = 1;
					System.out.println("continua digitação dos Pesagens");
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getIdadePesadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				viewDesempenho.getNrPesadosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getNrPesadosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getNrPesadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				viewDesempenho.getPesadosJFT().setEnabled(true);
				((JFormattedTextField) e.getSource()).transferFocus();
				viewDesempenho.getPesadosJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getPesadosJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				String msg = desempenhoBO.verificaPesagem(pesadosTemp,
						Integer.parseInt(viewDesempenho.getIdadePesadosJFT().getText()),
						Integer.parseInt(viewDesempenho.getNrPesadosJFT().getText()),
						Integer.parseInt(viewDesempenho.getPesadosJFT().getText()), faseAnteriorPesados,
						idadeFaseAtualPesados);
				if (msg.length() != 0) {
					JOptionPane.showMessageDialog(viewDesempenho, "Problema(s):\n" + msg, "DIGEX - Erro",
							JOptionPane.ERROR_MESSAGE);
					fluxoProblemaDigitacaoPesados();
				} else if (Integer.parseInt(viewDesempenho.getIdadePesadosJFT().getText()) != 0
						&& Integer.parseInt(viewDesempenho.getNrPesadosJFT().getText()) != 0
						&& Integer.parseInt(viewDesempenho.getPesadosJFT().getText()) != 0) {
					pesadosTemp.add(new PesadosVOP(Integer.parseInt(viewDesempenho.getIdadePesadosJFT().getText()),
							Integer.parseInt(viewDesempenho.getNrPesadosJFT().getText()),
							Integer.parseInt(viewDesempenho.getPesadosJFT().getText())));
					updateHistPesados();
					viewDesempenho.getOrdemPesadosJFT().setText("" + (++ordemRME));
					continuarDigitacaoPesados();
				} else {
					viewDesempenho.getControlePesagemJFT().setEnabled(true);
					((JFormattedTextField) e.getSource()).transferFocus();
					viewDesempenho.getControlePesagemJFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == viewDesempenho.getControlePesagemJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
//				if (calculaControlePesados() != 0) {
					if (Integer
							.parseInt(viewDesempenho.getControlePesagemJFT().getText()) == calculaControlePesados()) {
						if (idadeFaseAtualPesados == idades.get(idades.size() - 1)) {
//							fluxo para finalizar a digitacao da baia
							addListas();
							addFinalPesagem();
							clearHistP();
							viewDesempenho.getRegistroLabel().setEnabled(true);
						} else {
//							fluxo para voltar pras mortalidades e digitar a proxima fase 
							pesados.addAll(pesadosTemp);
							pesadosTemp = new ArrayList<>();
							clearHistPesados();
							atualizaFasePesados();
							seguirDigitacaoMortalidade(e);
							ordemRME = 1;
							System.out.println("continua digitação das Mortalidades");
						}
					} else {
//						fluxo para redigitar as pesagens da fase
						pesadosErros.addAll(pesadosTemp);
						pesadosTemp = new ArrayList<>();
						clearHistPesados();
						recuperaHistPesados();
						ordemRME = 1;
						viewDesempenho.getOrdemPesadosJFT().setText("1");
						viewDesempenho.getPnlPesagem().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
//				} else {
////					fluxo para voltar pras mortalidades e digitar a proxima fase
//					pesados.addAll(pesadosTemp);
//					pesadosTemp = new ArrayList<>();
//					clearHistPesados();
//					atualizaFasePesados();
//					seguirDigitacaoMortalidade(e);
//					ordemRME = 1;
//					System.out.println("continua digitação das Mortalidades");
//				}
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

	public void atualizaFaseMortalidade() {
		if (faseAnteriorMortalidade != idadeFaseAtualMortalidade) {
			faseAnteriorMortalidade = idadeFaseAtualMortalidade;
		}
		countIdadesMortalidade++;
		countFaseMortalidade++;
		somaValoresMortalidade = 0;
		if (countIdadesMortalidade < idades.size()) {
			idadeFaseAtualMortalidade = idades.get(countIdadesMortalidade);
			viewDesempenho.getFaseMortalidadeLabel()
					.setText("Fase " + countFaseMortalidade + " (Idade " + idadeFaseAtualMortalidade + ")");
		}
	}

	public void atualizaFaseEliminados() {
		if (faseAnteriorEliminados != idadeFaseAtualEliminados) {
			faseAnteriorEliminados = idadeFaseAtualEliminados;
		}
		countIdadesEliminados++;
		countFaseEliminados++;
		somaValoresEliminados = 0;
		if (countIdadesEliminados < idades.size()) {
			idadeFaseAtualEliminados = idades.get(countIdadesEliminados);
			viewDesempenho.getFaseEliminadosLabel()
					.setText("Fase " + countFaseEliminados + " (Idade " + idadeFaseAtualEliminados + ")");
		}
	}

	public void atualizaFaseErros() {
		if (faseAnteriorErros != idadeFaseAtualErros) {
			faseAnteriorErros = idadeFaseAtualErros;
		}
		countIdadesErros++;
		countFaseErros++;
		somaValoresErros = 0;
		if (countIdadesErros < idades.size()) {
			idadeFaseAtualErros = idades.get(countIdadesErros);
			viewDesempenho.getFaseErrosLabel()
					.setText("Fase " + countFaseErros + " (Idade " + idadeFaseAtualErros + ")");
		}
	}

	public void atualizaFaseAmostrados() {
		if (faseAnteriorAmostrados != idadeFaseAtualAmostrados) {
			faseAnteriorAmostrados = idadeFaseAtualAmostrados;
		}
		countIdadesAmostrados++;
		countFaseAmostrados++;
		somaValoresAmostrados = 0;
		if (countIdadesAmostrados < idades.size()) {
			idadeFaseAtualAmostrados = idades.get(countIdadesAmostrados);
			viewDesempenho.getFaseAmostradosLabel()
					.setText("Fase " + countFaseAmostrados + " (Idade " + idadeFaseAtualAmostrados + ")");
		}
	}

	public void atualizaFasePesados() {
		if (faseAnteriorPesados != idadeFaseAtualPesados) {
			faseAnteriorPesados = idadeFaseAtualPesados;
		}
		countIdadesPesados++;
		countFasePesados++;
		somaValoresPesados = 0;
		if (countIdadesPesados < idades.size()) {
			idadeFaseAtualPesados = idades.get(countIdadesPesados);
			viewDesempenho.getFasePesagemLabel()
					.setText("Fase " + countFasePesados + " (Idade " + idadeFaseAtualPesados + ")");
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

	public void continuarDigitacaoMortalidade() {
		viewDesempenho.getPnlMortalidade().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
	}

	public void continuarDigitacaoEliminados() {
		viewDesempenho.getPnlEliminados().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(true);
		viewDesempenho.getIdadeEliminadosJFT().grabFocus();
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
	}

	public void continuarDigitacaoErros() {
		viewDesempenho.getPnlErros().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeErrosJFT().setEnabled(true);
		viewDesempenho.getIdadeErrosJFT().grabFocus();
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
	}

	public void continuarDigitacaoAmostrados() {
		viewDesempenho.getPnlAmostrados().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(true);
		viewDesempenho.getIdadeAmostradosJFT().grabFocus();
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
	}

	public void continuarDigitacaoPesados() {
		viewDesempenho.getPnlPesagem().setBorder(defaultRmeJP);
		viewDesempenho.getIdadePesadosJFT().setEnabled(true);
		viewDesempenho.getIdadePesadosJFT().grabFocus();
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoRacoes() {
		viewDesempenho.getConsumoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().grabFocus();
		viewDesempenho.getFornecidaJFT().setEnabled(false);
		viewDesempenho.getSobraJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoMortalidade() {
		viewDesempenho.getPnlMortalidade().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoEliminados() {
		viewDesempenho.getPnlEliminados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(true);
		viewDesempenho.getIdadeEliminadosJFT().grabFocus();
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoErros() {
		viewDesempenho.getPnlErros().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeErrosJFT().setEnabled(true);
		viewDesempenho.getIdadeErrosJFT().grabFocus();
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoAmostrados() {
		viewDesempenho.getPnlAmostrados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(true);
		viewDesempenho.getIdadeAmostradosJFT().grabFocus();
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
	}

	public void fluxoProblemaDigitacaoPesados() {
		viewDesempenho.getPnlPesagem().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadePesadosJFT().setEnabled(true);
		viewDesempenho.getIdadePesadosJFT().grabFocus();
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
	}

	public void seguirDigitacaoEliminados(KeyEvent e) {
		viewDesempenho.getOrdemMortalidadeJFT().setText("1");
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(false);
		viewDesempenho.getIdadeMortalidadeJFT().setText("000");
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getNrMortalidadeJFT().setText("00");
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setText("000000");
		viewDesempenho.getControleMortalidadeJFT().setEnabled(false);
		viewDesempenho.getControleMortalidadeJFT().setText("000000");
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(true);
		((JFormattedTextField) e.getSource()).transferFocus();
		viewDesempenho.getIdadeEliminadosJFT().grabFocus();
		viewDesempenho.getPnlMortalidade().setBorder(defaultRmeJP);
	}

	public void seguirDigitacaoErros(KeyEvent e) {
		viewDesempenho.getOrdemEliminadosJFT().setText("1");
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
		viewDesempenho.getIdadeEliminadosJFT().setText("000");
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getNrEliminadosJFT().setText("00");
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setText("000000");
		viewDesempenho.getControleEliminadosJFT().setEnabled(false);
		viewDesempenho.getControleEliminadosJFT().setText("000000");
		viewDesempenho.getIdadeErrosJFT().setEnabled(true);
		((JFormattedTextField) e.getSource()).transferFocus();
		viewDesempenho.getIdadeErrosJFT().grabFocus();
		viewDesempenho.getPnlEliminados().setBorder(defaultRmeJP);
	}

	public void seguirDigitacaoAmostrados(KeyEvent e) {
		viewDesempenho.getOrdemErrosJFT().setText("1");
		viewDesempenho.getIdadeErrosJFT().setEnabled(false);
		viewDesempenho.getIdadeErrosJFT().setText("000");
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getNrErrosJFT().setText("00");
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setText("000000");
		viewDesempenho.getControleErrosJFT().setEnabled(false);
		viewDesempenho.getControleErrosJFT().setText("000000");
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(true);
		((JFormattedTextField) e.getSource()).transferFocus();
		viewDesempenho.getIdadeAmostradosJFT().grabFocus();
		viewDesempenho.getPnlErros().setBorder(defaultRmeJP);
	}

	public void seguirDigitacaoPesagens(KeyEvent e) {
		viewDesempenho.getOrdemAmostradosJFT().setText("1");
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(false);
		viewDesempenho.getIdadeAmostradosJFT().setText("000");
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getNrAmostradosJFT().setText("00");
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setText("000000");
		viewDesempenho.getControleAmostradosJFT().setEnabled(false);
		viewDesempenho.getControleAmostradosJFT().setText("000000");
		viewDesempenho.getIdadePesadosJFT().setEnabled(true);
		((JFormattedTextField) e.getSource()).transferFocus();
		viewDesempenho.getIdadePesadosJFT().grabFocus();
		viewDesempenho.getPnlAmostrados().setBorder(defaultRmeJP);
	}

	public void seguirDigitacaoMortalidade(KeyEvent e) {
		viewDesempenho.getOrdemPesadosJFT().setText("1");
		viewDesempenho.getIdadePesadosJFT().setEnabled(false);
		viewDesempenho.getIdadePesadosJFT().setText("000");
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getNrPesadosJFT().setText("00");
		viewDesempenho.getPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setText("000000");
		viewDesempenho.getControlePesagemJFT().setEnabled(false);
		viewDesempenho.getControlePesagemJFT().setText("000000");
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		((JFormattedTextField) e.getSource()).transferFocus();
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getPnlPesagem().setBorder(defaultRmeJP);
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

	public void removeListaPesagem() {
		if (Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText()) != 0) {
			mortosTemp.remove(mortos.size() - 1);
		}
		if (Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText()) != 0) {
			eliminadosTemp.remove(eliminados.size() - 1);
		}
		if (Integer.parseInt(viewDesempenho.getIdadeErrosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText()) != 0) {
			errosTemp.remove(erros.size() - 1);
		}
		if (Integer.parseInt(viewDesempenho.getIdadeAmostradosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText()) != 0) {
			amostradosTemp.remove(amostrados.size() - 1);
		}
		if (Integer.parseInt(viewDesempenho.getIdadePesadosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getNrPesadosJFT().getText()) != 0
				&& Integer.parseInt(viewDesempenho.getPesadosJFT().getText()) != 0) {
			pesadosTemp.remove(pesados.size() - 1);
		}

	}

	public void continuaProximaFase() {
		clearHistP();
		viewDesempenho.getOrdemMortalidadeJFT().setText("" + (++ordemP));
		TextFormatter.formatStringJFT(viewDesempenho.getOrdemMortalidadeJFT(),
				viewDesempenho.getOrdemMortalidadeJFT().getText(), 3);
		if (faseAnterior != idadeFaseAtual) {
			faseAnterior = idadeFaseAtual;
		}
		countIdades++;
		countFase++;
		somaValoresRacao = 0;
		if (countIdades < idades.size()) {
			idadeFaseAtual = idades.get(countIdades);
			viewDesempenho.getFaseConsumoLabel().setText("Fase " + countFase + " (Idade " + idadeFaseAtual + ")");
			ordemP = 1;
			viewDesempenho.getOrdemMortalidadeJFT().setText("1");
		}
		fluxoContinuaDigitacao();
		System.out.println("próx informação Pesagem");
	}

	public void addFinalPesagem() {
		addInfoRME();
		updateHistP();
	}

	public void addListaPesagem() {
		if (viewDesempenho.getIdadeMortalidadeJFT().getText() != null
				&& !viewDesempenho.getIdadeMortalidadeJFT().getText().equals("000")
				&& viewDesempenho.getNrMortalidadeJFT().getText() != null
				&& !viewDesempenho.getNrMortalidadeJFT().getText().equals("00")
				&& viewDesempenho.getPesoMortalidadeJFT().getText() != null
				&& !viewDesempenho.getPesoMortalidadeJFT().getText().equals("000000")) {
			mortosTemp.add(new MortalidadeVOP(Integer.parseInt(viewDesempenho.getIdadeMortalidadeJFT().getText()),
					Integer.parseInt(viewDesempenho.getNrMortalidadeJFT().getText()),
					Integer.parseInt(viewDesempenho.getPesoMortalidadeJFT().getText())));
		}
		if (viewDesempenho.getIdadeEliminadosJFT().getText() != null
				&& !viewDesempenho.getIdadeEliminadosJFT().getText().equals("000")
				&& viewDesempenho.getNrEliminadosJFT().getText() != null
				&& !viewDesempenho.getNrEliminadosJFT().getText().equals("00")
				&& viewDesempenho.getPesoEliminadosJFT().getText() != null
				&& !viewDesempenho.getPesoEliminadosJFT().getText().equals("000000")) {
			eliminadosTemp.add(new EliminadosVOP(Integer.parseInt(viewDesempenho.getIdadeEliminadosJFT().getText()),
					Integer.parseInt(viewDesempenho.getNrEliminadosJFT().getText()),
					Integer.parseInt(viewDesempenho.getPesoEliminadosJFT().getText())));
		}
		if (viewDesempenho.getIdadeErrosJFT().getText() != null
				&& !viewDesempenho.getIdadeErrosJFT().getText().equals("000")
				&& viewDesempenho.getNrErrosJFT().getText() != null
				&& !viewDesempenho.getNrErrosJFT().getText().equals("000")
				&& viewDesempenho.getPesoErrosJFT().getText() != null
				&& !viewDesempenho.getPesoErrosJFT().getText().equals("000000")) {
			errosTemp.add(new ErrosVOP(Integer.parseInt(viewDesempenho.getIdadeErrosJFT().getText()),
					Integer.parseInt(viewDesempenho.getNrErrosJFT().getText()),
					Integer.parseInt(viewDesempenho.getPesoErrosJFT().getText())));
		}
		if (viewDesempenho.getIdadeAmostradosJFT().getText() != null
				&& !viewDesempenho.getIdadeAmostradosJFT().getText().equals("000")
				&& viewDesempenho.getNrAmostradosJFT().getText() != null
				&& !viewDesempenho.getNrAmostradosJFT().getText().equals("00")
				&& viewDesempenho.getPesoAmostradosJFT().getText() != null
				&& !viewDesempenho.getPesoAmostradosJFT().getText().equals("000000")) {
			amostradosTemp.add(new AmostradosVOP(Integer.parseInt(viewDesempenho.getIdadeAmostradosJFT().getText()),
					Integer.parseInt(viewDesempenho.getNrAmostradosJFT().getText()),
					Integer.parseInt(viewDesempenho.getPesoAmostradosJFT().getText())));
		}
		if (viewDesempenho.getIdadePesadosJFT().getText() != null
				&& !viewDesempenho.getIdadePesadosJFT().getText().equals("000")
				&& viewDesempenho.getNrPesadosJFT().getText() != null
				&& !viewDesempenho.getNrPesadosJFT().getText().equals("00")
				&& viewDesempenho.getPesadosJFT().getText() != null
				&& !viewDesempenho.getPesadosJFT().getText().equals("000000")) {
			pesadosTemp.add(new PesadosVOP(Integer.parseInt(viewDesempenho.getIdadePesadosJFT().getText()),
					Integer.parseInt(viewDesempenho.getNrPesadosJFT().getText()),
					Integer.parseInt(viewDesempenho.getPesadosJFT().getText())));
		}
	}

	public void addInfoRME() {
		SaveUpdater.startCountdown(3, viewDesempenho.getRegistroLabel());
		// Associação das listas de consumo e pesagens por fase

		int countIdade = 0;
		int idadeFaseAnterior = 0;
		int idadeFase = idades.get(countIdade);

		for (int i = 0; i < mortos.size(); i++) {
			if (mortos.get(i).getIdade() <= idadeFase) {
				for (RmeVOP rme : rme) {
					if (rme.getIdadeRacao() <= idadeFase && rme.getMortos().getIdade() == 0) {
						if (idadeFaseAnterior == 0) {
							rme.setMortos(mortos.get(i));
							break;
						} else if (rme.getIdadeRacao() >= idadeFaseAnterior) {
							rme.setMortos(mortos.get(i));
							break;
						}
					}
				}
			} else {
				countIdade++;
				idadeFaseAnterior = idadeFase;
				if (countIdade <= idades.size()) {
					idadeFase = idades.get(countIdade);
					if (mortos.get(i).getIdade() <= idadeFase) {
						for (RmeVOP rme : rme) {
							if (rme.getIdadeRacao() <= idadeFase && rme.getIdadeRacao() >= idadeFaseAnterior
									&& rme.getMortos().getIdade() == 0) {
								rme.setMortos(mortos.get(i));
								break;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < getMaiorLista(); i++) {
			rme.add(new RmeVOP(0, 0, 0, 0, new MortalidadeVOP(0, 0, 0), new EliminadosVOP(0, 0, 0),
					new ErrosVOP(0, 0, 0), new AmostradosVOP(0, 0, 0), new PesadosVOP(0, 0, 0)));
		}

		for (EliminadosVOP eliminado : eliminados) {
			for (int i = 0; i < rme.size(); i++) {
				if (rme.get(i).getIdadeRacao() == 0 && rme.get(i).getEliminados().getIdade() == 0) {
					rme.get(i).setEliminados(eliminado);
					break;
				}
			}
		}
		for (ErrosVOP erro : erros) {
			for (int i = 0; i < rme.size(); i++) {
				if (rme.get(i).getIdadeRacao() == 0 && rme.get(i).getErros().getIdade() == 0) {
					rme.get(i).setErros(erro);
					break;
				}
			}
		}
		for (AmostradosVOP amostrado : amostrados) {
			for (int i = 0; i < rme.size(); i++) {
				if (rme.get(i).getIdadeRacao() == 0 && rme.get(i).getAmostrados().getIdade() == 0) {
					rme.get(i).setAmostrados(amostrado);
					break;
				}
			}
		}
		for (PesadosVOP pesado : pesados) {
			for (int i = 0; i < rme.size(); i++) {
				if (rme.get(i).getIdadeRacao() == 0 && rme.get(i).getPesados().getIdade() == 0) {
					rme.get(i).setPesados(pesado);
					break;
				}
			}
		}

		desempenho.add(new DesempenhoVOP(Integer.parseInt(viewDesempenho.getBaiaJFT().getText()),
				Integer.parseInt(viewDesempenho.getSexoJFT().getText()),
				Integer.parseInt(viewDesempenho.getLadoJFT().getText()),
				Integer.parseInt(viewDesempenho.getLinhagemJFT().getText()),
				Integer.parseInt(viewDesempenho.getTrataJFT().getText()),
				Integer.parseInt(viewDesempenho.getAvesAlojadasJFT().getText()), rme));
		controller.getModel().getModelStateDAO().saveModelState(false);
		fluxoTerminaPesagem();
	}

//	public Integer somarTotalControlePesagem() {
//		somaControleRacoes = 0;
//		for (MortalidadeVOP morto : mortosTemp) {
//			if (morto.getIdade() >= faseAnterior && morto.getIdade() <= idadeFaseAtual) {
//				somaControleRacoes += morto.getIdade();
//				somaControleRacoes += morto.getPeso();
//				somaControleRacoes += morto.getQuantidade();
//			}
//		}
//		for (EliminadosVOP eliminado : eliminadosTemp) {
//			if (eliminado.getIdade() >= faseAnterior && eliminado.getIdade() <= idadeFaseAtual) {
//				somaControleRacoes += eliminado.getIdade();
//				somaControleRacoes += eliminado.getPeso();
//				somaControleRacoes += eliminado.getQuantidade();
//			}
//		}
//		for (ErrosVOP erro : errosTemp) {
//			if (erro.getIdade() >= faseAnterior && erro.getIdade() <= idadeFaseAtual) {
//				somaControleRacoes += erro.getIdade();
//				somaControleRacoes += erro.getPeso();
//				somaControleRacoes += erro.getQuantidade();
//			}
//		}
//		for (AmostradosVOP amostrado : amostradosTemp) {
//			if (amostrado.getIdade() > faseAnterior && amostrado.getIdade() <= idadeFaseAtual) {
//				somaControleRacoes += amostrado.getIdade();
//				somaControleRacoes += amostrado.getPeso();
//				somaControleRacoes += amostrado.getQuantidade();
//			}
//		}
//		for (PesadosVOP pesado : pesadosTemp) {
//			if (pesado.getIdade() > faseAnterior && pesado.getIdade() <= idadeFaseAtual) {
//				somaControleRacoes += pesado.getIdade();
//				somaControleRacoes += pesado.getPeso();
//				somaControleRacoes += pesado.getQuantidade();
//			}
//		}
//		return somaControleRacoes;
//	}

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

	public void fluxoContinuaDigitacao() {
		viewDesempenho.getPesagemJP().setBorder(defaultPesagemJP);
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
		viewDesempenho.getIdadeErrosJFT().setEnabled(false);
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(false);
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
		viewDesempenho.getIdadePesadosJFT().setEnabled(false);
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
	}

	public void fluxoTerminaPesagem() {
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(false);
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
		viewDesempenho.getIdadeErrosJFT().setEnabled(false);
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(false);
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
		viewDesempenho.getIdadePesadosJFT().setEnabled(false);
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
		viewDesempenho.getControlePesagemJFT().setEnabled(false);
		viewDesempenho.getOpcaoJFT().setEnabled(true);
		viewDesempenho.getOpcaoJFT().grabFocus();
	}

	public void updateHistP() {
		viewDesempenho.getOrdemPesagemHist1Label().setText(viewDesempenho.getOrdemPesagemHist2Label().getText());
		viewDesempenho.getOrdemPesagemHist2Label().setText(viewDesempenho.getOrdemPesagemHist3Label().getText());
		viewDesempenho.getOrdemPesagemHist3Label().setText(viewDesempenho.getOrdemPesagemHist4Label().getText());
		viewDesempenho.getOrdemPesagemHist4Label().setText(viewDesempenho.getOrdemPesagemHist5Label().getText());
		viewDesempenho.getOrdemPesagemHist5Label().setText(viewDesempenho.getOrdemMortalidadeJFT().getText());
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
		viewDesempenho.getIdadeErHist1Label().setText(viewDesempenho.getIdadeErHist2Label().getText());
		viewDesempenho.getIdadeErHist2Label().setText(viewDesempenho.getIdadeErHist3Label().getText());
		viewDesempenho.getIdadeErHist3Label().setText(viewDesempenho.getIdadeErHist4Label().getText());
		viewDesempenho.getIdadeErHist4Label().setText(viewDesempenho.getIdadeErHist5Label().getText());
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
		viewDesempenho.getIdadeAmHist1Label().setText(viewDesempenho.getIdadeAmHist2Label().getText());
		viewDesempenho.getIdadeAmHist2Label().setText(viewDesempenho.getIdadeAmHist3Label().getText());
		viewDesempenho.getIdadeAmHist3Label().setText(viewDesempenho.getIdadeAmHist4Label().getText());
		viewDesempenho.getIdadeAmHist4Label().setText(viewDesempenho.getIdadeAmHist5Label().getText());
		viewDesempenho.getIdadeAmHist5Label().setText(viewDesempenho.getIdadeAmostradosJFT().getText());
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
		viewDesempenho.getIdadePesadosHist1Label().setText(viewDesempenho.getIdadePesadosHist2Label().getText());
		viewDesempenho.getIdadePesadosHist2Label().setText(viewDesempenho.getIdadePesadosHist3Label().getText());
		viewDesempenho.getIdadePesadosHist3Label().setText(viewDesempenho.getIdadePesadosHist4Label().getText());
		viewDesempenho.getIdadePesadosHist4Label().setText(viewDesempenho.getIdadePesadosHist5Label().getText());
		viewDesempenho.getIdadePesadosHist5Label().setText(viewDesempenho.getIdadePesadosJFT().getText());
		viewDesempenho.getNrPesadosHist1Label().setText(viewDesempenho.getNrPesadosHist2Label().getText());
		viewDesempenho.getNrPesadosHist2Label().setText(viewDesempenho.getNrPesadosHist3Label().getText());
		viewDesempenho.getNrPesadosHist3Label().setText(viewDesempenho.getNrPesadosHist4Label().getText());
		viewDesempenho.getNrPesadosHist4Label().setText(viewDesempenho.getNrPesadosHist5Label().getText());
		viewDesempenho.getNrPesadosHist5Label().setText(viewDesempenho.getNrPesadosJFT().getText());
		viewDesempenho.getPesadosHist1Label().setText(viewDesempenho.getPesadosHist2Label().getText());
		viewDesempenho.getPesadosHist2Label().setText(viewDesempenho.getPesadosHist3Label().getText());
		viewDesempenho.getPesadosHist3Label().setText(viewDesempenho.getPesadosHist4Label().getText());
		viewDesempenho.getPesadosHist4Label().setText(viewDesempenho.getPesadosHist5Label().getText());
		viewDesempenho.getPesadosHist5Label().setText(viewDesempenho.getPesadosJFT().getText());
		if (!mortosErros.isEmpty() || !eliminadosErros.isEmpty() || !errosErros.isEmpty() || !amostradosErros.isEmpty()
				|| !pesadosErros.isEmpty()) {
			recuperaHistP();
		} else {
			viewDesempenho.getIdadeMortalidadeJFT().setText("");
			viewDesempenho.getNrMortalidadeJFT().setText("");
			viewDesempenho.getPesoMortalidadeJFT().setText("");
			viewDesempenho.getIdadeEliminadosJFT().setText("");
			viewDesempenho.getNrEliminadosJFT().setText("");
			viewDesempenho.getPesoEliminadosJFT().setText("");
			viewDesempenho.getIdadeErrosJFT().setText("");
			viewDesempenho.getNrErrosJFT().setText("");
			viewDesempenho.getPesoErrosJFT().setText("");
			viewDesempenho.getIdadeAmostradosJFT().setText("");
			viewDesempenho.getNrAmostradosJFT().setText("");
			viewDesempenho.getPesoAmostradosJFT().setText("");
			viewDesempenho.getIdadePesadosJFT().setText("");
			viewDesempenho.getNrPesadosJFT().setText("");
			viewDesempenho.getPesadosJFT().setText("");
		}
	}

	public void recuperaHistP() {
		if (mortosErros.size() >= 1) {
			viewDesempenho.getIdadeMortalidadeJFT().setText("" + mortosErros.get(0).getIdade());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeMortalidadeJFT(),
					viewDesempenho.getIdadeMortalidadeJFT().getText(), 3);
			viewDesempenho.getNrMortalidadeJFT().setText("" + mortosErros.get(0).getQuantidade());
			TextFormatter.formatStringJFT(viewDesempenho.getNrMortalidadeJFT(),
					viewDesempenho.getNrMortalidadeJFT().getText(), 3);
			viewDesempenho.getPesoMortalidadeJFT().setText("" + mortosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoMortalidadeJFT(),
					viewDesempenho.getPesoMortalidadeJFT().getText(), 5);
			mortosErros.remove(0);
		} else {
			viewDesempenho.getIdadeMortalidadeJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeMortalidadeJFT(),
					viewDesempenho.getIdadeMortalidadeJFT().getText(), 3);
			viewDesempenho.getNrMortalidadeJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getNrMortalidadeJFT(),
					viewDesempenho.getNrMortalidadeJFT().getText(), 3);
			viewDesempenho.getPesoMortalidadeJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getPesoMortalidadeJFT(),
					viewDesempenho.getPesoMortalidadeJFT().getText(), 5);
		}

		if (eliminadosErros.size() >= 1) {
			viewDesempenho.getIdadeEliminadosJFT().setText("" + eliminadosErros.get(0).getIdade());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeEliminadosJFT(),
					viewDesempenho.getIdadeEliminadosJFT().getText(), 3);
			viewDesempenho.getNrEliminadosJFT().setText("" + eliminadosErros.get(0).getQuantidade());
			TextFormatter.formatStringJFT(viewDesempenho.getNrEliminadosJFT(),
					viewDesempenho.getNrEliminadosJFT().getText(), 3);
			viewDesempenho.getPesoEliminadosJFT().setText("" + eliminadosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoEliminadosJFT(),
					viewDesempenho.getPesoEliminadosJFT().getText(), 5);
			eliminadosErros.remove(0);
		} else {
			viewDesempenho.getIdadeEliminadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeEliminadosJFT(),
					viewDesempenho.getIdadeEliminadosJFT().getText(), 3);
			viewDesempenho.getNrEliminadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getNrEliminadosJFT(),
					viewDesempenho.getNrEliminadosJFT().getText(), 3);
			viewDesempenho.getPesoEliminadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getPesoEliminadosJFT(),
					viewDesempenho.getPesoEliminadosJFT().getText(), 5);
		}

		if (errosErros.size() >= 1) {
			viewDesempenho.getIdadeErrosJFT().setText("" + errosErros.get(0).getIdade());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeErrosJFT(),
					viewDesempenho.getIdadeErrosJFT().getText(), 3);
			viewDesempenho.getNrErrosJFT().setText("" + errosErros.get(0).getQuantidade());
			TextFormatter.formatStringJFT(viewDesempenho.getNrErrosJFT(), viewDesempenho.getNrErrosJFT().getText(), 3);
			viewDesempenho.getPesoErrosJFT().setText("" + errosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoErrosJFT(), viewDesempenho.getPesoErrosJFT().getText(),
					5);
			errosErros.remove(0);
		} else {
			viewDesempenho.getIdadeErrosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeErrosJFT(),
					viewDesempenho.getIdadeErrosJFT().getText(), 3);
			viewDesempenho.getNrErrosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getNrErrosJFT(), viewDesempenho.getNrErrosJFT().getText(), 3);
			viewDesempenho.getPesoErrosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getPesoErrosJFT(), viewDesempenho.getPesoErrosJFT().getText(),
					5);
		}

		if (amostradosErros.size() >= 1) {
			viewDesempenho.getIdadeAmostradosJFT().setText("" + amostradosErros.get(0).getIdade());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeAmostradosJFT(),
					viewDesempenho.getIdadeAmostradosJFT().getText(), 3);
			viewDesempenho.getNrAmostradosJFT().setText("" + amostradosErros.get(0).getQuantidade());
			TextFormatter.formatStringJFT(viewDesempenho.getNrAmostradosJFT(),
					viewDesempenho.getNrAmostradosJFT().getText(), 3);
			viewDesempenho.getPesoAmostradosJFT().setText("" + amostradosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewDesempenho.getPesoAmostradosJFT(),
					viewDesempenho.getPesoAmostradosJFT().getText(), 5);
			amostradosErros.remove(0);
		} else {
			viewDesempenho.getIdadeAmostradosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getIdadeAmostradosJFT(),
					viewDesempenho.getIdadeAmostradosJFT().getText(), 3);
			viewDesempenho.getNrAmostradosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getNrAmostradosJFT(),
					viewDesempenho.getNrAmostradosJFT().getText(), 3);
			viewDesempenho.getPesoAmostradosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getPesoAmostradosJFT(),
					viewDesempenho.getPesoAmostradosJFT().getText(), 5);
		}

		if (pesadosErros.size() >= 1) {
			viewDesempenho.getIdadePesadosJFT().setText("" + pesadosErros.get(0).getIdade());
			TextFormatter.formatStringJFT(viewDesempenho.getIdadePesadosJFT(),
					viewDesempenho.getIdadePesadosJFT().getText(), 3);
			viewDesempenho.getNrPesadosJFT().setText("" + pesadosErros.get(0).getQuantidade());
			TextFormatter.formatStringJFT(viewDesempenho.getNrPesadosJFT(), viewDesempenho.getNrPesadosJFT().getText(),
					3);
			viewDesempenho.getPesadosJFT().setText("" + pesadosErros.get(0).getPeso());
			TextFormatter.formatStringJFT(viewDesempenho.getPesadosJFT(), viewDesempenho.getPesadosJFT().getText(), 6);
			pesadosErros.remove(0);
		} else {
			viewDesempenho.getIdadePesadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getIdadePesadosJFT(),
					viewDesempenho.getIdadePesadosJFT().getText(), 3);
			viewDesempenho.getNrPesadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getNrPesadosJFT(), viewDesempenho.getNrPesadosJFT().getText(),
					3);
			viewDesempenho.getPesadosJFT().setText("" + 0);
			TextFormatter.formatStringJFT(viewDesempenho.getPesadosJFT(), viewDesempenho.getPesadosJFT().getText(), 6);
		}

	}

	public void clearHistP() {
		viewDesempenho.getIdadeMortalidadeJFT().setText("");
		viewDesempenho.getNrMortalidadeJFT().setText("");
		viewDesempenho.getPesoMortalidadeJFT().setText("");
		viewDesempenho.getIdadeEliminadosJFT().setText("");
		viewDesempenho.getNrEliminadosJFT().setText("");
		viewDesempenho.getPesoEliminadosJFT().setText("");
		viewDesempenho.getIdadeErrosJFT().setText("");
		viewDesempenho.getNrErrosJFT().setText("");
		viewDesempenho.getPesoErrosJFT().setText("");
		viewDesempenho.getIdadeAmostradosJFT().setText("");
		viewDesempenho.getNrAmostradosJFT().setText("");
		viewDesempenho.getPesoAmostradosJFT().setText("");
		viewDesempenho.getIdadePesadosJFT().setText("");
		viewDesempenho.getNrPesadosJFT().setText("");
		viewDesempenho.getPesadosJFT().setText("");
//		viewDesempenho.getControlePesagemJFT().setText("");
		viewDesempenho.getOrdemPesagemHist1Label().setText("");
		viewDesempenho.getOrdemPesagemHist2Label().setText("");
		viewDesempenho.getOrdemPesagemHist3Label().setText("");
		viewDesempenho.getOrdemPesagemHist4Label().setText("");
		viewDesempenho.getOrdemPesagemHist5Label().setText("");
		viewDesempenho.getIdadeMHist1Label().setText("");
		viewDesempenho.getIdadeMHist2Label().setText("");
		viewDesempenho.getIdadeMHist3Label().setText("");
		viewDesempenho.getIdadeMHist4Label().setText("");
		viewDesempenho.getIdadeMHist5Label().setText("");
		viewDesempenho.getNrMHist1Label().setText("");
		viewDesempenho.getNrMHist2Label().setText("");
		viewDesempenho.getNrMHist3Label().setText("");
		viewDesempenho.getNrMHist4Label().setText("");
		viewDesempenho.getNrMHist5Label().setText("");
		viewDesempenho.getPesoMHist1Label().setText("");
		viewDesempenho.getPesoMHist2Label().setText("");
		viewDesempenho.getPesoMHist3Label().setText("");
		viewDesempenho.getPesoMHist4Label().setText("");
		viewDesempenho.getPesoMHist5Label().setText("");
		viewDesempenho.getIdadeElHist1Label().setText("");
		viewDesempenho.getIdadeElHist2Label().setText("");
		viewDesempenho.getIdadeElHist3Label().setText("");
		viewDesempenho.getIdadeElHist4Label().setText("");
		viewDesempenho.getIdadeElHist5Label().setText("");
		viewDesempenho.getNrElHist1Label().setText("");
		viewDesempenho.getNrElHist2Label().setText("");
		viewDesempenho.getNrElHist3Label().setText("");
		viewDesempenho.getNrElHist4Label().setText("");
		viewDesempenho.getNrElHist5Label().setText("");
		viewDesempenho.getPesoElHist1Label().setText("");
		viewDesempenho.getPesoElHist2Label().setText("");
		viewDesempenho.getPesoElHist3Label().setText("");
		viewDesempenho.getPesoElHist4Label().setText("");
		viewDesempenho.getPesoElHist5Label().setText("");
		viewDesempenho.getIdadeErHist1Label().setText("");
		viewDesempenho.getIdadeErHist2Label().setText("");
		viewDesempenho.getIdadeErHist3Label().setText("");
		viewDesempenho.getIdadeErHist4Label().setText("");
		viewDesempenho.getIdadeErHist5Label().setText("");
		viewDesempenho.getNrErHist1Label().setText("");
		viewDesempenho.getNrErHist2Label().setText("");
		viewDesempenho.getNrErHist3Label().setText("");
		viewDesempenho.getNrErHist4Label().setText("");
		viewDesempenho.getNrErHist5Label().setText("");
		viewDesempenho.getPesoErHist1Label().setText("");
		viewDesempenho.getPesoErHist2Label().setText("");
		viewDesempenho.getPesoErHist3Label().setText("");
		viewDesempenho.getPesoErHist4Label().setText("");
		viewDesempenho.getPesoErHist5Label().setText("");
		viewDesempenho.getIdadeAmHist1Label().setText("");
		viewDesempenho.getIdadeAmHist2Label().setText("");
		viewDesempenho.getIdadeAmHist3Label().setText("");
		viewDesempenho.getIdadeAmHist4Label().setText("");
		viewDesempenho.getIdadeAmHist5Label().setText("");
		viewDesempenho.getNrAmHist1Label().setText("");
		viewDesempenho.getNrAmHist2Label().setText("");
		viewDesempenho.getNrAmHist3Label().setText("");
		viewDesempenho.getNrAmHist4Label().setText("");
		viewDesempenho.getNrAmHist5Label().setText("");
		viewDesempenho.getPesoAmHist1Label().setText("");
		viewDesempenho.getPesoAmHist2Label().setText("");
		viewDesempenho.getPesoAmHist3Label().setText("");
		viewDesempenho.getPesoAmHist4Label().setText("");
		viewDesempenho.getPesoAmHist5Label().setText("");
		viewDesempenho.getIdadePesadosHist1Label().setText("");
		viewDesempenho.getIdadePesadosHist2Label().setText("");
		viewDesempenho.getIdadePesadosHist3Label().setText("");
		viewDesempenho.getIdadePesadosHist4Label().setText("");
		viewDesempenho.getIdadePesadosHist5Label().setText("");
		viewDesempenho.getNrPesadosHist1Label().setText("");
		viewDesempenho.getNrPesadosHist2Label().setText("");
		viewDesempenho.getNrPesadosHist3Label().setText("");
		viewDesempenho.getNrPesadosHist4Label().setText("");
		viewDesempenho.getNrPesadosHist5Label().setText("");
		viewDesempenho.getPesadosHist1Label().setText("");
		viewDesempenho.getPesadosHist2Label().setText("");
		viewDesempenho.getPesadosHist3Label().setText("");
		viewDesempenho.getPesadosHist4Label().setText("");
		viewDesempenho.getPesadosHist5Label().setText("");
	}

	public void fluxoProblemaPesagem() {
		viewDesempenho.getPesagemJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
		viewDesempenho.getIdadeEliminadosJFT().setEnabled(false);
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
		viewDesempenho.getIdadeErrosJFT().setEnabled(false);
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
		viewDesempenho.getIdadeAmostradosJFT().setEnabled(false);
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
		viewDesempenho.getIdadePesadosJFT().setEnabled(false);
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
		// viewDesempenho.getControlePesadosJFT().setText("000000");
	}

	public void fluxoContRME() {
		viewDesempenho.getConsumoJP().setBorder(defaultRmeJP);
		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getIdadeJFT().setEnabled(false);
		viewDesempenho.getFornecidaJFT().setEnabled(false);
		viewDesempenho.getSobraJFT().setEnabled(false);
		// viewDesempenho.getControleRacaoJFT().setEnabled(false);

	}

	public void updateHistMortalidade() {
		viewDesempenho.getOrdemMortalidadeHist1Label()
				.setText(viewDesempenho.getOrdemMortalidadeHist2Label().getText());
		viewDesempenho.getOrdemMortalidadeHist2Label()
				.setText(viewDesempenho.getOrdemMortalidadeHist3Label().getText());
		viewDesempenho.getOrdemMortalidadeHist3Label()
				.setText(viewDesempenho.getOrdemMortalidadeHist4Label().getText());
		viewDesempenho.getOrdemMortalidadeHist4Label()
				.setText(viewDesempenho.getOrdemMortalidadeHist5Label().getText());
		viewDesempenho.getOrdemMortalidadeHist5Label().setText(viewDesempenho.getOrdemMortalidadeJFT().getText());
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
		if (!mortosErros.isEmpty()) {
			recuperaHistMortalidade();
		} else {
			viewDesempenho.getIdadeMortalidadeJFT().setText("000");
			viewDesempenho.getNrMortalidadeJFT().setText("00");
			viewDesempenho.getPesoMortalidadeJFT().setText("000000");
			viewDesempenho.pack();
		}
	}

	public void updateHistEliminados() {
		viewDesempenho.getOrdemElHist1Label().setText(viewDesempenho.getOrdemElHist2Label().getText());
		viewDesempenho.getOrdemElHist2Label().setText(viewDesempenho.getOrdemElHist3Label().getText());
		viewDesempenho.getOrdemElHist3Label().setText(viewDesempenho.getOrdemElHist4Label().getText());
		viewDesempenho.getOrdemElHist4Label().setText(viewDesempenho.getOrdemElHist5Label().getText());
		viewDesempenho.getOrdemElHist5Label().setText(viewDesempenho.getOrdemEliminadosJFT().getText());
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
		if (!eliminadosErros.isEmpty()) {
			recuperaHistEliminados();
		} else {
			viewDesempenho.getIdadeEliminadosJFT().setText("000");
			viewDesempenho.getNrEliminadosJFT().setText("00");
			viewDesempenho.getPesoEliminadosJFT().setText("000000");
			viewDesempenho.pack();
		}
	}

	public void updateHistErros() {
		viewDesempenho.getOrdemErHist1Label().setText(viewDesempenho.getOrdemErHist2Label().getText());
		viewDesempenho.getOrdemErHist2Label().setText(viewDesempenho.getOrdemErHist3Label().getText());
		viewDesempenho.getOrdemErHist3Label().setText(viewDesempenho.getOrdemErHist4Label().getText());
		viewDesempenho.getOrdemErHist4Label().setText(viewDesempenho.getOrdemErHist5Label().getText());
		viewDesempenho.getOrdemErHist5Label().setText(viewDesempenho.getOrdemErrosJFT().getText());
		viewDesempenho.getIdadeErHist1Label().setText(viewDesempenho.getIdadeErHist2Label().getText());
		viewDesempenho.getIdadeErHist2Label().setText(viewDesempenho.getIdadeErHist3Label().getText());
		viewDesempenho.getIdadeErHist3Label().setText(viewDesempenho.getIdadeErHist4Label().getText());
		viewDesempenho.getIdadeErHist4Label().setText(viewDesempenho.getIdadeErHist5Label().getText());
		viewDesempenho.getIdadeErHist5Label().setText(viewDesempenho.getIdadeErrosJFT().getText());
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
		if (!errosErros.isEmpty()) {
			recuperaHistErros();
		} else {
			viewDesempenho.getIdadeErrosJFT().setText("000");
			viewDesempenho.getNrErrosJFT().setText("00");
			viewDesempenho.getPesoErrosJFT().setText("000000");
			viewDesempenho.pack();
		}
	}

	public void updateHistAmostrados() {
		viewDesempenho.getOrdemAmHist1Label().setText(viewDesempenho.getOrdemAmHist2Label().getText());
		viewDesempenho.getOrdemAmHist2Label().setText(viewDesempenho.getOrdemAmHist3Label().getText());
		viewDesempenho.getOrdemAmHist3Label().setText(viewDesempenho.getOrdemAmHist4Label().getText());
		viewDesempenho.getOrdemAmHist4Label().setText(viewDesempenho.getOrdemAmHist5Label().getText());
		viewDesempenho.getOrdemAmHist5Label().setText(viewDesempenho.getOrdemAmostradosJFT().getText());
		viewDesempenho.getIdadeAmHist1Label().setText(viewDesempenho.getIdadeAmHist2Label().getText());
		viewDesempenho.getIdadeAmHist2Label().setText(viewDesempenho.getIdadeAmHist3Label().getText());
		viewDesempenho.getIdadeAmHist3Label().setText(viewDesempenho.getIdadeAmHist4Label().getText());
		viewDesempenho.getIdadeAmHist4Label().setText(viewDesempenho.getIdadeAmHist5Label().getText());
		viewDesempenho.getIdadeAmHist5Label().setText(viewDesempenho.getIdadeAmostradosJFT().getText());
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
		if (!amostradosErros.isEmpty()) {
			recuperaHistAmostrados();
		} else {
			viewDesempenho.getIdadeAmostradosJFT().setText("000");
			viewDesempenho.getNrAmostradosJFT().setText("00");
			viewDesempenho.getPesoAmostradosJFT().setText("000000");
			viewDesempenho.pack();
		}
	}

	public void updateHistPesados() {
		viewDesempenho.getOrdemPesadosHist1Label().setText(viewDesempenho.getOrdemPesadosHist2Label().getText());
		viewDesempenho.getOrdemPesadosHist2Label().setText(viewDesempenho.getOrdemPesadosHist3Label().getText());
		viewDesempenho.getOrdemPesadosHist3Label().setText(viewDesempenho.getOrdemPesadosHist4Label().getText());
		viewDesempenho.getOrdemPesadosHist4Label().setText(viewDesempenho.getOrdemPesadosHist5Label().getText());
		viewDesempenho.getOrdemPesadosHist5Label().setText(viewDesempenho.getOrdemPesadosJFT().getText());
		viewDesempenho.getIdadePesadosHist1Label().setText(viewDesempenho.getIdadePesadosHist2Label().getText());
		viewDesempenho.getIdadePesadosHist2Label().setText(viewDesempenho.getIdadePesadosHist3Label().getText());
		viewDesempenho.getIdadePesadosHist3Label().setText(viewDesempenho.getIdadePesadosHist4Label().getText());
		viewDesempenho.getIdadePesadosHist4Label().setText(viewDesempenho.getIdadePesadosHist5Label().getText());
		viewDesempenho.getIdadePesadosHist5Label().setText(viewDesempenho.getIdadePesadosJFT().getText());
		viewDesempenho.getNrPesadosHist1Label().setText(viewDesempenho.getNrPesadosHist2Label().getText());
		viewDesempenho.getNrPesadosHist2Label().setText(viewDesempenho.getNrPesadosHist3Label().getText());
		viewDesempenho.getNrPesadosHist3Label().setText(viewDesempenho.getNrPesadosHist4Label().getText());
		viewDesempenho.getNrPesadosHist4Label().setText(viewDesempenho.getNrPesadosHist5Label().getText());
		viewDesempenho.getNrPesadosHist5Label().setText(viewDesempenho.getNrPesadosJFT().getText());
		viewDesempenho.getPesadosHist1Label().setText(viewDesempenho.getPesadosHist2Label().getText());
		viewDesempenho.getPesadosHist2Label().setText(viewDesempenho.getPesadosHist3Label().getText());
		viewDesempenho.getPesadosHist3Label().setText(viewDesempenho.getPesadosHist4Label().getText());
		viewDesempenho.getPesadosHist4Label().setText(viewDesempenho.getPesadosHist5Label().getText());
		viewDesempenho.getPesadosHist5Label().setText(viewDesempenho.getPesadosJFT().getText());
		if (!pesadosErros.isEmpty()) {
			recuperaHistPesados();
		} else {
			viewDesempenho.getIdadePesadosJFT().setText("000");
			viewDesempenho.getNrPesadosJFT().setText("00");
			viewDesempenho.getPesadosJFT().setText("000000");
			viewDesempenho.pack();
		}
	}

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
			recuperaHistRME();
		} else {
			viewDesempenho.getIdadeJFT().setText("000");
			viewDesempenho.getFornecidaJFT().setText("00000");
			viewDesempenho.getSobraJFT().setText("00000");
			viewDesempenho.pack();
		}
	}

	public void recuperaHistRME() {
		viewDesempenho.getIdadeJFT().setText("" + rmeErros.get(0).getIdadeRacao());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeJFT(), viewDesempenho.getIdadeJFT().getText(), 3);
		viewDesempenho.getFornecidaJFT().setText("" + rmeErros.get(0).getFornecida());
		TextFormatter.formatStringJFT(viewDesempenho.getFornecidaJFT(), viewDesempenho.getFornecidaJFT().getText(), 5);
		viewDesempenho.getSobraJFT().setText("" + rmeErros.get(0).getSobra());
		TextFormatter.formatStringJFT(viewDesempenho.getSobraJFT(), viewDesempenho.getSobraJFT().getText(), 5);
		rmeErros.remove(0);

		viewDesempenho.getIdadeJFT().setEnabled(true);
		viewDesempenho.getIdadeJFT().grabFocus();
		viewDesempenho.getControleFornecidaJFT().setEnabled(false);
		viewDesempenho.getControleFornecidaJFT().setText("000000");
		viewDesempenho.getControleSobraJFT().setEnabled(false);
		viewDesempenho.getControleSobraJFT().setText("000000");
	}

	public void recuperaHistMortalidade() {
		viewDesempenho.getIdadeMortalidadeJFT().setText("" + mortosErros.get(0).getIdade());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeMortalidadeJFT(),
				viewDesempenho.getIdadeMortalidadeJFT().getText(), 3);
		viewDesempenho.getNrMortalidadeJFT().setText("" + mortosErros.get(0).getQuantidade());
		TextFormatter.formatStringJFT(viewDesempenho.getNrMortalidadeJFT(),
				viewDesempenho.getNrMortalidadeJFT().getText(), 2);
		viewDesempenho.getPesoMortalidadeJFT().setText("" + mortosErros.get(0).getPeso());
		TextFormatter.formatStringJFT(viewDesempenho.getPesoMortalidadeJFT(),
				viewDesempenho.getPesoMortalidadeJFT().getText(), 5);
		mortosErros.remove(0);

		viewDesempenho.getIdadeMortalidadeJFT().setEnabled(true);
		viewDesempenho.getIdadeMortalidadeJFT().grabFocus();
		viewDesempenho.getNrMortalidadeJFT().setEnabled(false);
		viewDesempenho.getPesoMortalidadeJFT().setEnabled(false);
		viewDesempenho.getControleMortalidadeJFT().setEnabled(false);
		viewDesempenho.getControleMortalidadeJFT().setText("000000");
	}

	public void recuperaHistEliminados() {
		viewDesempenho.getIdadeEliminadosJFT().setText("" + eliminadosErros.get(0).getIdade());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeEliminadosJFT(),
				viewDesempenho.getIdadeEliminadosJFT().getText(), 3);
		viewDesempenho.getNrEliminadosJFT().setText("" + eliminadosErros.get(0).getQuantidade());
		TextFormatter.formatStringJFT(viewDesempenho.getNrEliminadosJFT(),
				viewDesempenho.getNrEliminadosJFT().getText(), 2);
		viewDesempenho.getPesoEliminadosJFT().setText("" + eliminadosErros.get(0).getPeso());
		TextFormatter.formatStringJFT(viewDesempenho.getPesoEliminadosJFT(),
				viewDesempenho.getPesoEliminadosJFT().getText(), 5);
		eliminadosErros.remove(0);

		viewDesempenho.getIdadeEliminadosJFT().setEnabled(true);
		viewDesempenho.getIdadeEliminadosJFT().grabFocus();
		viewDesempenho.getNrEliminadosJFT().setEnabled(false);
		viewDesempenho.getPesoEliminadosJFT().setEnabled(false);
		viewDesempenho.getControleEliminadosJFT().setEnabled(false);
		viewDesempenho.getControleEliminadosJFT().setText("000000");
	}

	public void recuperaHistErros() {
		viewDesempenho.getIdadeErrosJFT().setText("" + errosErros.get(0).getIdade());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeErrosJFT(), viewDesempenho.getIdadeErrosJFT().getText(),
				3);
		viewDesempenho.getNrErrosJFT().setText("" + errosErros.get(0).getQuantidade());
		TextFormatter.formatStringJFT(viewDesempenho.getNrErrosJFT(), viewDesempenho.getNrErrosJFT().getText(), 2);
		viewDesempenho.getPesoErrosJFT().setText("" + errosErros.get(0).getPeso());
		TextFormatter.formatStringJFT(viewDesempenho.getPesoErrosJFT(), viewDesempenho.getPesoErrosJFT().getText(), 5);
		errosErros.remove(0);

		viewDesempenho.getIdadeErrosJFT().setEnabled(true);
		viewDesempenho.getIdadeErrosJFT().grabFocus();
		viewDesempenho.getNrErrosJFT().setEnabled(false);
		viewDesempenho.getPesoErrosJFT().setEnabled(false);
		viewDesempenho.getControleErrosJFT().setEnabled(false);
		viewDesempenho.getControleErrosJFT().setText("000000");
	}

	public void recuperaHistAmostrados() {
		viewDesempenho.getIdadeAmostradosJFT().setText("" + amostradosErros.get(0).getIdade());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadeAmostradosJFT(),
				viewDesempenho.getIdadeAmostradosJFT().getText(), 3);
		viewDesempenho.getNrAmostradosJFT().setText("" + amostradosErros.get(0).getQuantidade());
		TextFormatter.formatStringJFT(viewDesempenho.getNrAmostradosJFT(),
				viewDesempenho.getNrAmostradosJFT().getText(), 2);
		viewDesempenho.getPesoAmostradosJFT().setText("" + amostradosErros.get(0).getPeso());
		TextFormatter.formatStringJFT(viewDesempenho.getPesoAmostradosJFT(),
				viewDesempenho.getPesoAmostradosJFT().getText(), 5);
		amostradosErros.remove(0);

		viewDesempenho.getIdadeAmostradosJFT().setEnabled(true);
		viewDesempenho.getIdadeAmostradosJFT().grabFocus();
		viewDesempenho.getNrAmostradosJFT().setEnabled(false);
		viewDesempenho.getPesoAmostradosJFT().setEnabled(false);
		viewDesempenho.getControleAmostradosJFT().setEnabled(false);
		viewDesempenho.getControleAmostradosJFT().setText("000000");
	}

	public void recuperaHistPesados() {
		viewDesempenho.getIdadePesadosJFT().setText("" + pesadosErros.get(0).getIdade());
		TextFormatter.formatStringJFT(viewDesempenho.getIdadePesadosJFT(),
				viewDesempenho.getIdadePesadosJFT().getText(), 3);
		viewDesempenho.getNrPesadosJFT().setText("" + pesadosErros.get(0).getQuantidade());
		TextFormatter.formatStringJFT(viewDesempenho.getNrPesadosJFT(), viewDesempenho.getNrPesadosJFT().getText(), 2);
		viewDesempenho.getPesadosJFT().setText("" + pesadosErros.get(0).getPeso());
		TextFormatter.formatStringJFT(viewDesempenho.getPesadosJFT(), viewDesempenho.getPesadosJFT().getText(), 5);
		pesadosErros.remove(0);

		viewDesempenho.getIdadePesadosJFT().setEnabled(true);
		viewDesempenho.getIdadePesadosJFT().grabFocus();
		viewDesempenho.getNrPesadosJFT().setEnabled(false);
		viewDesempenho.getPesadosJFT().setEnabled(false);
		viewDesempenho.getControlePesagemJFT().setEnabled(false);
		viewDesempenho.getControlePesagemJFT().setText("000000");
	}

	public void clearHistMortalidade() {
		viewDesempenho.getOrdemMortalidadeJFT().setText("");
		viewDesempenho.getIdadeMortalidadeJFT().setText("");
		viewDesempenho.getNrMortalidadeJFT().setText("");
		viewDesempenho.getPesoMortalidadeJFT().setText("");
		viewDesempenho.getControleMortalidadeJFT().setText("");
		viewDesempenho.getOrdemMortalidadeHist1Label().setText("");
		viewDesempenho.getOrdemMortalidadeHist2Label().setText("");
		viewDesempenho.getOrdemMortalidadeHist3Label().setText("");
		viewDesempenho.getOrdemMortalidadeHist4Label().setText("");
		viewDesempenho.getOrdemMortalidadeHist5Label().setText("");
		viewDesempenho.getIdadeMHist1Label().setText("");
		viewDesempenho.getIdadeMHist2Label().setText("");
		viewDesempenho.getIdadeMHist3Label().setText("");
		viewDesempenho.getIdadeMHist4Label().setText("");
		viewDesempenho.getIdadeMHist5Label().setText("");
		viewDesempenho.getNrMHist1Label().setText("");
		viewDesempenho.getNrMHist2Label().setText("");
		viewDesempenho.getNrMHist3Label().setText("");
		viewDesempenho.getNrMHist4Label().setText("");
		viewDesempenho.getNrMHist5Label().setText("");
		viewDesempenho.getPesoMHist1Label().setText("");
		viewDesempenho.getPesoMHist2Label().setText("");
		viewDesempenho.getPesoMHist3Label().setText("");
		viewDesempenho.getPesoMHist4Label().setText("");
		viewDesempenho.getPesoMHist5Label().setText("");
	}

	public void clearHistEliminados() {
		viewDesempenho.getOrdemEliminadosJFT().setText("");
		viewDesempenho.getIdadeEliminadosJFT().setText("");
		viewDesempenho.getNrEliminadosJFT().setText("");
		viewDesempenho.getPesoEliminadosJFT().setText("");
		viewDesempenho.getControleEliminadosJFT().setText("");
		viewDesempenho.getOrdemElHist1Label().setText("");
		viewDesempenho.getOrdemElHist2Label().setText("");
		viewDesempenho.getOrdemElHist3Label().setText("");
		viewDesempenho.getOrdemElHist4Label().setText("");
		viewDesempenho.getOrdemElHist5Label().setText("");
		viewDesempenho.getIdadeElHist1Label().setText("");
		viewDesempenho.getIdadeElHist2Label().setText("");
		viewDesempenho.getIdadeElHist3Label().setText("");
		viewDesempenho.getIdadeElHist4Label().setText("");
		viewDesempenho.getIdadeElHist5Label().setText("");
		viewDesempenho.getNrElHist1Label().setText("");
		viewDesempenho.getNrElHist2Label().setText("");
		viewDesempenho.getNrElHist3Label().setText("");
		viewDesempenho.getNrElHist4Label().setText("");
		viewDesempenho.getNrElHist5Label().setText("");
		viewDesempenho.getPesoElHist1Label().setText("");
		viewDesempenho.getPesoElHist2Label().setText("");
		viewDesempenho.getPesoElHist3Label().setText("");
		viewDesempenho.getPesoElHist4Label().setText("");
		viewDesempenho.getPesoElHist5Label().setText("");
	}

	public void clearHistErros() {
		viewDesempenho.getOrdemErrosJFT().setText("");
		viewDesempenho.getIdadeErrosJFT().setText("");
		viewDesempenho.getNrErrosJFT().setText("");
		viewDesempenho.getPesoErrosJFT().setText("");
		viewDesempenho.getControleErrosJFT().setText("");
		viewDesempenho.getOrdemErHist1Label().setText("");
		viewDesempenho.getOrdemErHist2Label().setText("");
		viewDesempenho.getOrdemErHist3Label().setText("");
		viewDesempenho.getOrdemErHist4Label().setText("");
		viewDesempenho.getOrdemErHist5Label().setText("");
		viewDesempenho.getIdadeErHist1Label().setText("");
		viewDesempenho.getIdadeErHist2Label().setText("");
		viewDesempenho.getIdadeErHist3Label().setText("");
		viewDesempenho.getIdadeErHist4Label().setText("");
		viewDesempenho.getIdadeErHist5Label().setText("");
		viewDesempenho.getNrErHist1Label().setText("");
		viewDesempenho.getNrErHist2Label().setText("");
		viewDesempenho.getNrErHist3Label().setText("");
		viewDesempenho.getNrErHist4Label().setText("");
		viewDesempenho.getNrErHist5Label().setText("");
		viewDesempenho.getPesoErHist1Label().setText("");
		viewDesempenho.getPesoErHist2Label().setText("");
		viewDesempenho.getPesoErHist3Label().setText("");
		viewDesempenho.getPesoErHist4Label().setText("");
		viewDesempenho.getPesoErHist5Label().setText("");
	}

	public void clearHistAmostrados() {
		viewDesempenho.getOrdemAmostradosJFT().setText("");
		viewDesempenho.getIdadeAmostradosJFT().setText("");
		viewDesempenho.getNrAmostradosJFT().setText("");
		viewDesempenho.getPesoAmostradosJFT().setText("");
		viewDesempenho.getControleAmostradosJFT().setText("");
		viewDesempenho.getOrdemAmHist1Label().setText("");
		viewDesempenho.getOrdemAmHist2Label().setText("");
		viewDesempenho.getOrdemAmHist3Label().setText("");
		viewDesempenho.getOrdemAmHist4Label().setText("");
		viewDesempenho.getOrdemAmHist5Label().setText("");
		viewDesempenho.getIdadeAmHist1Label().setText("");
		viewDesempenho.getIdadeAmHist2Label().setText("");
		viewDesempenho.getIdadeAmHist3Label().setText("");
		viewDesempenho.getIdadeAmHist4Label().setText("");
		viewDesempenho.getIdadeAmHist5Label().setText("");
		viewDesempenho.getNrAmHist1Label().setText("");
		viewDesempenho.getNrAmHist2Label().setText("");
		viewDesempenho.getNrAmHist3Label().setText("");
		viewDesempenho.getNrAmHist4Label().setText("");
		viewDesempenho.getNrAmHist5Label().setText("");
		viewDesempenho.getPesoAmHist1Label().setText("");
		viewDesempenho.getPesoAmHist2Label().setText("");
		viewDesempenho.getPesoAmHist3Label().setText("");
		viewDesempenho.getPesoAmHist4Label().setText("");
		viewDesempenho.getPesoAmHist5Label().setText("");
	}

	public void clearHistPesados() {
		viewDesempenho.getOrdemPesadosJFT().setText("");
		viewDesempenho.getIdadePesadosJFT().setText("");
		viewDesempenho.getNrPesadosJFT().setText("");
		viewDesempenho.getPesadosJFT().setText("");
		viewDesempenho.getControlePesagemJFT().setText("");
		viewDesempenho.getOrdemPesadosHist1Label().setText("");
		viewDesempenho.getOrdemPesadosHist2Label().setText("");
		viewDesempenho.getOrdemPesadosHist3Label().setText("");
		viewDesempenho.getOrdemPesadosHist4Label().setText("");
		viewDesempenho.getOrdemPesadosHist5Label().setText("");
		viewDesempenho.getIdadePesadosHist1Label().setText("");
		viewDesempenho.getIdadePesadosHist2Label().setText("");
		viewDesempenho.getIdadePesadosHist3Label().setText("");
		viewDesempenho.getIdadePesadosHist4Label().setText("");
		viewDesempenho.getIdadePesadosHist5Label().setText("");
		viewDesempenho.getNrPesadosHist1Label().setText("");
		viewDesempenho.getNrPesadosHist2Label().setText("");
		viewDesempenho.getNrPesadosHist3Label().setText("");
		viewDesempenho.getNrPesadosHist4Label().setText("");
		viewDesempenho.getNrPesadosHist5Label().setText("");
		viewDesempenho.getPesadosHist1Label().setText("");
		viewDesempenho.getPesadosHist2Label().setText("");
		viewDesempenho.getPesadosHist3Label().setText("");
		viewDesempenho.getPesadosHist4Label().setText("");
		viewDesempenho.getPesadosHist5Label().setText("");
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
		ordemRME = 1;
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

	public Integer getSomaControleMortalidade() {
		return somaControleMortalidade;
	}

	public void setSomaControleMortalidade(Integer somaControleMortalidade) {
		this.somaControleMortalidade = somaControleMortalidade;
	}

	public Integer getSomaValoresMortalidade() {
		return somaValoresMortalidade;
	}

	public void setSomaValoresMortalidade(Integer somaValoresMortalidade) {
		this.somaValoresMortalidade = somaValoresMortalidade;
	}

	public Integer getIdadeFaseAtualMortalidade() {
		return idadeFaseAtualMortalidade;
	}

	public void setIdadeFaseAtualMortalidade(Integer idadeFaseAtualMortalidade) {
		this.idadeFaseAtualMortalidade = idadeFaseAtualMortalidade;
	}

	public Integer getFaseAnteriorMortalidade() {
		return faseAnteriorMortalidade;
	}

	public void setFaseAnteriorMortalidade(Integer faseAnteriorMortalidade) {
		this.faseAnteriorMortalidade = faseAnteriorMortalidade;
	}

	public Integer getCountFaseMortalidade() {
		return countFaseMortalidade;
	}

	public void setCountFaseMortalidade(Integer countFaseMortalidade) {
		this.countFaseMortalidade = countFaseMortalidade;
	}

	public Integer getCountIdadesMortalidade() {
		return countIdadesMortalidade;
	}

	public void setCountIdadesMortalidade(Integer countIdadesMortalidade) {
		this.countIdadesMortalidade = countIdadesMortalidade;
	}

	public Integer getSomaControleEliminados() {
		return somaControleEliminados;
	}

	public void setSomaControleEliminados(Integer somaControleEliminados) {
		this.somaControleEliminados = somaControleEliminados;
	}

	public Integer getSomaValoresEliminados() {
		return somaValoresEliminados;
	}

	public void setSomaValoresEliminados(Integer somaValoresEliminados) {
		this.somaValoresEliminados = somaValoresEliminados;
	}

	public Integer getIdadeFaseAtualEliminados() {
		return idadeFaseAtualEliminados;
	}

	public void setIdadeFaseAtualEliminados(Integer idadeFaseAtualEliminados) {
		this.idadeFaseAtualEliminados = idadeFaseAtualEliminados;
	}

	public Integer getFaseAnteriorEliminados() {
		return faseAnteriorEliminados;
	}

	public void setFaseAnteriorEliminados(Integer faseAnteriorEliminados) {
		this.faseAnteriorEliminados = faseAnteriorEliminados;
	}

	public Integer getCountFaseEliminados() {
		return countFaseEliminados;
	}

	public void setCountFaseEliminados(Integer countFaseEliminados) {
		this.countFaseEliminados = countFaseEliminados;
	}

	public Integer getCountIdadesEliminados() {
		return countIdadesEliminados;
	}

	public void setCountIdadesEliminados(Integer countIdadesEliminados) {
		this.countIdadesEliminados = countIdadesEliminados;
	}

	public Integer getSomaControleErros() {
		return somaControleErros;
	}

	public void setSomaControleErros(Integer somaControleErros) {
		this.somaControleErros = somaControleErros;
	}

	public Integer getSomaValoresErros() {
		return somaValoresErros;
	}

	public void setSomaValoresErros(Integer somaValoresErros) {
		this.somaValoresErros = somaValoresErros;
	}

	public Integer getIdadeFaseAtualErros() {
		return idadeFaseAtualErros;
	}

	public void setIdadeFaseAtualErros(Integer idadeFaseAtualErros) {
		this.idadeFaseAtualErros = idadeFaseAtualErros;
	}

	public Integer getFaseAnteriorErros() {
		return faseAnteriorErros;
	}

	public void setFaseAnteriorErros(Integer faseAnteriorErros) {
		this.faseAnteriorErros = faseAnteriorErros;
	}

	public Integer getCountFaseErros() {
		return countFaseErros;
	}

	public void setCountFaseErros(Integer countFaseErros) {
		this.countFaseErros = countFaseErros;
	}

	public Integer getCountIdadesErros() {
		return countIdadesErros;
	}

	public void setCountIdadesErros(Integer countIdadesErros) {
		this.countIdadesErros = countIdadesErros;
	}

	public Integer getSomaControleAmostrados() {
		return somaControleAmostrados;
	}

	public void setSomaControleAmostrados(Integer somaControleAmostrados) {
		this.somaControleAmostrados = somaControleAmostrados;
	}

	public Integer getSomaValoresAmostrados() {
		return somaValoresAmostrados;
	}

	public void setSomaValoresAmostrados(Integer somaValoresAmostrados) {
		this.somaValoresAmostrados = somaValoresAmostrados;
	}

	public Integer getIdadeFaseAtualAmostrados() {
		return idadeFaseAtualAmostrados;
	}

	public void setIdadeFaseAtualAmostrados(Integer idadeFaseAtualAmostrados) {
		this.idadeFaseAtualAmostrados = idadeFaseAtualAmostrados;
	}

	public Integer getFaseAnteriorAmostrados() {
		return faseAnteriorAmostrados;
	}

	public void setFaseAnteriorAmostrados(Integer faseAnteriorAmostrados) {
		this.faseAnteriorAmostrados = faseAnteriorAmostrados;
	}

	public Integer getCountFaseAmostrados() {
		return countFaseAmostrados;
	}

	public void setCountFaseAmostrados(Integer countFaseAmostrados) {
		this.countFaseAmostrados = countFaseAmostrados;
	}

	public Integer getCountIdadesAmostrados() {
		return countIdadesAmostrados;
	}

	public void setCountIdadesAmostrados(Integer countIdadesAmostrados) {
		this.countIdadesAmostrados = countIdadesAmostrados;
	}

	public Integer getSomaControlePesados() {
		return somaControlePesados;
	}

	public void setSomaControlePesados(Integer somaControlePesados) {
		this.somaControlePesados = somaControlePesados;
	}

	public Integer getSomaValoresPesados() {
		return somaValoresPesados;
	}

	public void setSomaValoresPesados(Integer somaValoresPesados) {
		this.somaValoresPesados = somaValoresPesados;
	}

	public Integer getIdadeFaseAtualPesados() {
		return idadeFaseAtualPesados;
	}

	public void setIdadeFaseAtualPesados(Integer idadeFaseAtualPesados) {
		this.idadeFaseAtualPesados = idadeFaseAtualPesados;
	}

	public Integer getFaseAnteriorPesados() {
		return faseAnteriorPesados;
	}

	public void setFaseAnteriorPesados(Integer faseAnteriorPesados) {
		this.faseAnteriorPesados = faseAnteriorPesados;
	}

	public Integer getCountFasePesados() {
		return countFasePesados;
	}

	public void setCountFasePesados(Integer countFasePesados) {
		this.countFasePesados = countFasePesados;
	}

	public Integer getCountIdadesPesados() {
		return countIdadesPesados;
	}

	public void setCountIdadesPesados(Integer countIdadesPesados) {
		this.countIdadesPesados = countIdadesPesados;
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