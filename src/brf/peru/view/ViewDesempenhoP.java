package brf.peru.view;

import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class ViewDesempenhoP extends javax.swing.JFrame {

	public ViewDesempenhoP() {
		initComponents();
	}

	private javax.swing.JFormattedTextField controleEliminadosJFT;
	private javax.swing.JFormattedTextField controleErrosJFT;
	private javax.swing.JFormattedTextField controleFornecidaJFT;
	private javax.swing.JFormattedTextField controlePesagemJFT;
	private javax.swing.JPanel controleRMEJP1;
	private javax.swing.JFormattedTextField controleSobraJFT;
	private JLabel eliminadosJP1;
	private JLabel faseConsumoLabel;
	private JLabel faseMortalidadeLabel;
	private JLabel faseEliminadosLabel;
	private JLabel faseErrosLabel;
	private JLabel faseAmostradosLabel;
	private JLabel fasePesagemLabel;
	private JLabel fornecidaHist1Label;
	private JLabel fornecidaHist2Label;
	private JLabel fornecidaHist3Label;
	private JLabel fornecidaHist4Label;
	private JLabel fornecidaHist5Label;
	private javax.swing.JFormattedTextField fornecidaJFT;
	private JLabel idadeAmHist1Label;
	private JLabel idadeAmHist2Label;
	private JLabel idadeAmHist3Label;
	private JLabel idadeAmHist4Label;
	private JLabel idadeAmHist5Label;
	private javax.swing.JFormattedTextField idadeAmostradosJFT;
	private JLabel idadeElHist1Label;
	private JLabel idadeElHist2Label;
	private JLabel idadeElHist3Label;
	private JLabel idadeElHist4Label;
	private JLabel idadeElHist5Label;
	private javax.swing.JFormattedTextField idadeEliminadosJFT;
	private JLabel idadeErHist1Label;
	private JLabel idadeErHist2Label;
	private JLabel idadeErHist3Label;
	private JLabel idadeErHist4Label;
	private JLabel idadeErHist5Label;
	private javax.swing.JFormattedTextField idadeErrosJFT;
	private JLabel idadeHist1Label;
	private JLabel idadeHist2Label;
	private JLabel idadeHist3Label;
	private JLabel idadeHist4Label;
	private JLabel idadeHist5Label;
	private JLabel idadeMHist1Label;
	private JLabel idadeMHist2Label;
	private JLabel idadeMHist3Label;
	private JLabel idadeMHist4Label;
	private JLabel idadeMHist5Label;
	private javax.swing.JFormattedTextField idadeMortalidadeJFT;
	private JLabel idadePesadosHist1Label;
	private JLabel idadePesadosHist2Label;
	private JLabel idadePesadosHist3Label;
	private JLabel idadePesadosHist4Label;
	private JLabel idadePesadosHist5Label;
	private javax.swing.JFormattedTextField idadePesadosJFT;
	private JLabel jLabel10;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel jLabel22;
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel jLabel30;
	private JLabel jLabel31;
	private JLabel jLabel32;
	private JLabel jLabel33;
	private JLabel jLabel34;
	private JLabel jLabel35;
	private JLabel jLabel36;
	private JLabel jLabel37;
	private JLabel jLabel38;
	private JLabel jLabel39;
	private JLabel jLabel40;
	private JLabel jLabel41;
	private JLabel jLabel42;
	private JLabel jLabel44;
	private JLabel jLabel45;
	private JLabel jLabel46;
	private JLabel jLabel47;
	private JLabel jLabel48;
	private JLabel jLabel5;
	private JLabel jLabel51;
	private JLabel jLabel52;
	private JLabel jLabel53;
	private JLabel jLabel54;
	private JLabel jLabel55;
	private JLabel jLabel56;
	private JLabel jLabel57;
	private JLabel jLabel58;
	private JLabel jLabel59;
	private JLabel jLabel6;
	private JLabel jLabel60;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel pnlAmostrados;
	private javax.swing.JPanel pnlPesagem;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel pnlEliminados;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel pnlMortalidade;
	private javax.swing.JPanel pnlErros;
	private javax.swing.JPanel jPanel43;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JFormattedTextField ladoJFT;
	private javax.swing.JFormattedTextField linhagemJFT;
	private JLabel nrAmHist1Label;
	private JLabel nrAmHist2Label;
	private JLabel nrAmHist3Label;
	private JLabel nrAmHist4Label;
	private JLabel nrAmHist5Label;
	private javax.swing.JFormattedTextField nrAmostradosJFT;
	private JLabel nrElHist1Label;
	private JLabel nrElHist2Label;
	private JLabel nrElHist3Label;
	private JLabel nrElHist4Label;
	private JLabel nrElHist5Label;
	private javax.swing.JFormattedTextField nrEliminadosJFT;
	private JLabel nrErHist1Label;
	private JLabel nrErHist2Label;
	private JLabel nrErHist3Label;
	private JLabel nrErHist4Label;
	private JLabel nrErHist5Label;
	private javax.swing.JFormattedTextField nrErrosJFT;
	private JLabel nrMHist1Label;
	private JLabel nrMHist2Label;
	private JLabel nrMHist3Label;
	private JLabel nrMHist4Label;
	private JLabel nrMHist5Label;
	private javax.swing.JFormattedTextField nrMortalidadeJFT;
	private JLabel nrPesadosHist1Label;
	private JLabel nrPesadosHist2Label;
	private JLabel nrPesadosHist3Label;
	private JLabel nrPesadosHist4Label;
	private JLabel nrPesadosHist5Label;
	private javax.swing.JFormattedTextField nrPesadosJFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private JLabel ordemAmHist1Label;
	private JLabel ordemAmHist2Label;
	private JLabel ordemAmHist3Label;
	private JLabel ordemAmHist5Label;
	private JLabel ordemElHist1Label;
	private JLabel ordemElHist2Label;
	private JLabel ordemElHist3Label;
	private JLabel ordemElHist4Label;
	private JLabel ordemElHist5Label;
	private JLabel ordemErHist1Label;
	private JLabel ordemErHist2Label;
	private JLabel ordemErHist3Label;
	private JLabel ordemErHist5Label;
	private JLabel ordemHist1Label;
	private JLabel ordemHist2Label;
	private JLabel ordemHist3Label;
	private JLabel ordemHist4Label;
	private JLabel ordemHist5Label;
	private JLabel ordemMortalidadeHist1Label;
	private JLabel ordemMortalidadeHist2Label;
	private JLabel ordemMortalidadeHist3Label;
	private JLabel ordemMortalidadeHist5Label;
	private javax.swing.JFormattedTextField ordemMortalidadeJFT;
	private javax.swing.JFormattedTextField ordemErrosJFT;
	private javax.swing.JFormattedTextField ordemAmostradosJFT;
	private javax.swing.JFormattedTextField ordemPesadosJFT;
	private javax.swing.JFormattedTextField ordemEliminadosJFT;
	private JLabel ordemPesadosHist1Label;
	private JLabel ordemPesadosHist2Label;
	private JLabel ordemPesadosHist3Label;
	private JLabel ordemPesadosHist5Label;
	private JLabel ordemAmHist4Label;
	private JLabel ordemErHist4Label;
	private JLabel ordemMortalidadeHist4Label;
	private JLabel ordemPesadosHist4Label;
	private JLabel pesadosHist1Label;
	private JLabel pesadosHist2Label;
	private JLabel pesadosHist3Label;
	private JLabel pesadosHist4Label;
	private JLabel pesadosHist5Label;
	private javax.swing.JFormattedTextField pesadosJFT;
	private javax.swing.JPanel pesagemJP;
	private JLabel pesoAmHist1Label;
	private JLabel pesoAmHist2Label;
	private JLabel pesoAmHist3Label;
	private JLabel pesoAmHist4Label;
	private JLabel pesoAmHist5Label;
	private javax.swing.JFormattedTextField pesoAmostradosJFT;
	private JLabel pesoElHist1Label;
	private JLabel pesoElHist2Label;
	private JLabel pesoElHist3Label;
	private JLabel pesoElHist4Label;
	private JLabel pesoElHist5Label;
	private javax.swing.JFormattedTextField pesoEliminadosJFT;
	private JLabel pesoErHist1Label;
	private JLabel pesoErHist2Label;
	private JLabel pesoErHist3Label;
	private JLabel pesoErHist4Label;
	private JLabel pesoErHist5Label;
	private javax.swing.JFormattedTextField pesoErrosJFT;
	private JLabel pesoMHist1Label;
	private JLabel pesoMHist2Label;
	private JLabel pesoMHist3Label;
	private JLabel pesoMHist4Label;
	private JLabel pesoMHist5Label;
	private JLabel registroLabel;
	private javax.swing.JFormattedTextField sexoJFT;
	private JLabel sobraHist1Label;
	private JLabel sobraHist2Label;
	private JLabel sobraHist3Label;
	private JLabel sobraHist4Label;
	private JLabel sobraHist5Label;
	private javax.swing.JFormattedTextField trataJFT;
	private JFormattedTextField controleBaiaJFT;
	private JFormattedTextField idadeJFT;
	private JFormattedTextField idadeJFT_2;
	private JFormattedTextField sobraJFT;
	private javax.swing.JFormattedTextField avesAlojadasJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JPanel consumoJP;
	private javax.swing.JFormattedTextField controleAmostradosJFT;
	private JFormattedTextField ordemJFT;
	private JFormattedTextField ordemJFT_1;
	private JFormattedTextField pesoMortalidadeJFT;
	private JFormattedTextField controleMortalidadeJFT;

	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		avesAlojadasJFT = new javax.swing.JFormattedTextField();
		jLabel36 = new JLabel();
		jLabel31 = new JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		jLabel32 = new JLabel();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new JLabel();
		linhagemJFT = new javax.swing.JFormattedTextField();
		jLabel35 = new JLabel();
		jLabel44 = new JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		jLabel33 = new JLabel();
		ladoJFT = new javax.swing.JFormattedTextField();
		consumoJP = new javax.swing.JPanel();
		faseConsumoLabel = new JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel6 = new JLabel();
		fornecidaHist4Label = new JLabel();
		jLabel9 = new JLabel();
		sobraHist4Label = new JLabel();
		fornecidaJFT = new javax.swing.JFormattedTextField();
		fornecidaHist5Label = new JLabel();
		jLabel10 = new JLabel();
		sobraHist5Label = new JLabel();
		fornecidaHist1Label = new JLabel();
		sobraHist1Label = new JLabel();
		fornecidaHist2Label = new JLabel();
		sobraHist2Label = new JLabel();
		fornecidaHist3Label = new JLabel();
		sobraHist3Label = new JLabel();
		idadeHist1Label = new JLabel();
		idadeHist2Label = new JLabel();
		idadeHist3Label = new JLabel();
		idadeHist4Label = new JLabel();
		idadeHist5Label = new JLabel();
		jLabel13 = new JLabel();
		ordemHist1Label = new JLabel();
		ordemHist2Label = new JLabel();
		ordemHist3Label = new JLabel();
		ordemHist4Label = new JLabel();
		ordemHist5Label = new JLabel();
		jLabel14 = new JLabel();
		controleRMEJP1 = new javax.swing.JPanel();
		controleFornecidaJFT = new javax.swing.JFormattedTextField();
		controleSobraJFT = new javax.swing.JFormattedTextField();
		jLabel42 = new JLabel();
		jLabel46 = new JLabel();
		jLabel47 = new JLabel();
		pesagemJP = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		pnlAmostrados = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jLabel21 = new JLabel();
		jLabel24 = new JLabel();
		nrAmostradosJFT = new javax.swing.JFormattedTextField();
		jLabel25 = new JLabel();
		pesoAmostradosJFT = new javax.swing.JFormattedTextField();
		nrAmHist5Label = new JLabel();
		pesoAmHist5Label = new JLabel();
		nrAmHist1Label = new JLabel();
		pesoAmHist1Label = new JLabel();
		nrAmHist2Label = new JLabel();
		pesoAmHist2Label = new JLabel();
		nrAmHist3Label = new JLabel();
		pesoAmHist3Label = new JLabel();
		nrAmHist4Label = new JLabel();
		pesoAmHist4Label = new JLabel();
		idadeAmostradosJFT = new javax.swing.JFormattedTextField();
		idadeAmHist5Label = new JLabel();
		idadeAmHist4Label = new JLabel();
		idadeAmHist3Label = new JLabel();
		idadeAmHist2Label = new JLabel();
		idadeAmHist1Label = new JLabel();
		jLabel37 = new JLabel();
		jLabel53 = new JLabel();
		ordemAmHist1Label = new JLabel();
		ordemAmHist2Label = new JLabel();
		ordemAmHist3Label = new JLabel();
		ordemAmHist4Label = new JLabel();
		ordemAmHist5Label = new JLabel();
		ordemAmostradosJFT = new javax.swing.JFormattedTextField();
		controleAmostradosJFT = new javax.swing.JFormattedTextField();
		jLabel54 = new JLabel();
		faseAmostradosLabel = new JLabel();
		pnlPesagem = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jLabel20 = new JLabel();
		jLabel22 = new JLabel();
		nrPesadosJFT = new javax.swing.JFormattedTextField();
		jLabel23 = new JLabel();
		pesadosJFT = new javax.swing.JFormattedTextField();
		nrPesadosHist5Label = new JLabel();
		pesadosHist5Label = new JLabel();
		nrPesadosHist4Label = new JLabel();
		pesadosHist4Label = new JLabel();
		nrPesadosHist1Label = new JLabel();
		pesadosHist1Label = new JLabel();
		nrPesadosHist2Label = new JLabel();
		pesadosHist2Label = new JLabel();
		nrPesadosHist3Label = new JLabel();
		pesadosHist3Label = new JLabel();
		idadePesadosHist1Label = new JLabel();
		idadePesadosHist2Label = new JLabel();
		idadePesadosHist4Label = new JLabel();
		idadePesadosHist3Label = new JLabel();
		idadePesadosJFT = new javax.swing.JFormattedTextField();
		jLabel30 = new JLabel();
		idadePesadosHist5Label = new JLabel();
		jLabel55 = new JLabel();
		ordemPesadosHist1Label = new JLabel();
		ordemPesadosHist2Label = new JLabel();
		ordemPesadosHist3Label = new JLabel();
		ordemPesadosHist4Label = new JLabel();
		ordemPesadosHist5Label = new JLabel();
		ordemPesadosJFT = new javax.swing.JFormattedTextField();
		controlePesagemJFT = new javax.swing.JFormattedTextField();
		jLabel56 = new JLabel();
		fasePesagemLabel = new JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel17 = new JLabel();
		jLabel18 = new JLabel();
		jLabel19 = new JLabel();
		jLabel39 = new JLabel();
		jLabel40 = new JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		pnlErros = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jLabel26 = new JLabel();
		jLabel27 = new JLabel();
		nrErrosJFT = new javax.swing.JFormattedTextField();
		jLabel28 = new JLabel();
		pesoErrosJFT = new javax.swing.JFormattedTextField();
		nrErHist1Label = new JLabel();
		pesoErHist1Label = new JLabel();
		nrErHist2Label = new JLabel();
		pesoErHist2Label = new JLabel();
		nrErHist3Label = new JLabel();
		pesoErHist3Label = new JLabel();
		nrErHist4Label = new JLabel();
		pesoErHist4Label = new JLabel();
		nrErHist5Label = new JLabel();
		pesoErHist5Label = new JLabel();
		idadeErrosJFT = new javax.swing.JFormattedTextField();
		idadeErHist5Label = new JLabel();
		idadeErHist4Label = new JLabel();
		idadeErHist3Label = new JLabel();
		idadeErHist2Label = new JLabel();
		idadeErHist1Label = new JLabel();
		jLabel38 = new JLabel();
		jLabel51 = new JLabel();
		ordemErHist1Label = new JLabel();
		ordemErHist2Label = new JLabel();
		ordemErHist3Label = new JLabel();
		ordemErHist4Label = new JLabel();
		ordemErHist5Label = new JLabel();
		ordemErrosJFT = new javax.swing.JFormattedTextField();
		jLabel52 = new JLabel();
		controleErrosJFT = new javax.swing.JFormattedTextField();
		faseErrosLabel = new JLabel();
		pnlMortalidade = new javax.swing.JPanel();
		jPanel43 = new javax.swing.JPanel();
		jLabel5 = new JLabel();
		jLabel7 = new JLabel();
		nrMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel8 = new JLabel();
		nrMHist1Label = new JLabel();
		pesoMHist1Label = new JLabel();
		nrMHist2Label = new JLabel();
		pesoMHist2Label = new JLabel();
		nrMHist3Label = new JLabel();
		pesoMHist3Label = new JLabel();
		nrMHist4Label = new JLabel();
		pesoMHist4Label = new JLabel();
		nrMHist5Label = new JLabel();
		pesoMHist5Label = new JLabel();
		jLabel16 = new JLabel();
		idadeMHist1Label = new JLabel();
		idadeMHist2Label = new JLabel();
		idadeMHist3Label = new JLabel();
		idadeMHist4Label = new JLabel();
		idadeMHist5Label = new JLabel();
		idadeMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel41 = new JLabel();
		ordemMortalidadeHist1Label = new JLabel();
		ordemMortalidadeHist2Label = new JLabel();
		ordemMortalidadeHist3Label = new JLabel();
		ordemMortalidadeHist4Label = new JLabel();
		ordemMortalidadeHist5Label = new JLabel();
		ordemMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel48 = new JLabel();
		faseMortalidadeLabel = new JLabel();
		pnlEliminados = new javax.swing.JPanel();
		jPanel13 = new javax.swing.JPanel();
		eliminadosJP1 = new JLabel();
		jLabel29 = new JLabel();
		nrEliminadosJFT = new javax.swing.JFormattedTextField();
		jLabel57 = new JLabel();
		pesoEliminadosJFT = new javax.swing.JFormattedTextField();
		nrElHist2Label = new JLabel();
		pesoElHist2Label = new JLabel();
		nrElHist1Label = new JLabel();
		pesoElHist1Label = new JLabel();
		nrElHist3Label = new JLabel();
		pesoElHist3Label = new JLabel();
		nrElHist4Label = new JLabel();
		pesoElHist4Label = new JLabel();
		nrElHist5Label = new JLabel();
		pesoElHist5Label = new JLabel();
		jLabel58 = new JLabel();
		idadeElHist1Label = new JLabel();
		idadeElHist2Label = new JLabel();
		idadeElHist3Label = new JLabel();
		idadeElHist4Label = new JLabel();
		idadeElHist5Label = new JLabel();
		idadeEliminadosJFT = new javax.swing.JFormattedTextField();
		controleEliminadosJFT = new javax.swing.JFormattedTextField();
		jLabel59 = new JLabel();
		jLabel60 = new JLabel();
		ordemElHist1Label = new JLabel();
		ordemElHist2Label = new JLabel();
		ordemElHist3Label = new JLabel();
		ordemElHist4Label = new JLabel();
		ordemElHist5Label = new JLabel();
		ordemEliminadosJFT = new javax.swing.JFormattedTextField();
		faseEliminadosLabel = new JLabel();
		registroLabel = new JLabel();
		controleBaiaJFT = new javax.swing.JFormattedTextField();
		sobraJFT = new javax.swing.JFormattedTextField();
		idadeJFT = new javax.swing.JFormattedTextField();
		ordemJFT = new javax.swing.JFormattedTextField();
		pesoMortalidadeJFT = new JFormattedTextField();
		setDefaultCloseOperation(3);

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		javax.swing.GroupLayout controleRMEJP1Layout = new javax.swing.GroupLayout(controleRMEJP1);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		if (d.getHeight() < 900) {
			baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap().addComponent(jLabel44)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel31)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE).addGap(18)
							.addComponent(jLabel33).addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addGap(18)
							.addComponent(jLabel32).addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel34)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(10).addComponent(jLabel45).addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE).addGap(10)
							.addComponent(jLabel35).addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel36)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(22)));
			baiaJPLayout
					.setVerticalGroup(
							baiaJPLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
											.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
													.addComponent(jLabel31)
													.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel32)
													.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel34)
													.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel35)
													.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel36).addComponent(jLabel44)
													.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel45)
													.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel33)
													.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addContainerGap()));
			baiaJP.setLayout(baiaJPLayout);
			
			controleRMEJP1Layout.setHorizontalGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addGroup(controleRMEJP1Layout
							.createParallelGroup(Alignment.LEADING, false)
							.addComponent(jLabel42, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(controleRMEJP1Layout.createSequentialGroup()
									.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(jLabel46, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
													Short.MAX_VALUE)
											.addComponent(controleFornecidaJFT, GroupLayout.DEFAULT_SIZE, 88,
													Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
											.addComponent(jLabel47, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
											.addComponent(controleSobraJFT, GroupLayout.DEFAULT_SIZE, 92,
													Short.MAX_VALUE))))
							.addContainerGap()));
			controleRMEJP1Layout.setVerticalGroup(controleRMEJP1Layout.createParallelGroup(Alignment.TRAILING)
					.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel42)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(controleRMEJP1Layout
									.createParallelGroup(Alignment.BASELINE).addComponent(jLabel46).addComponent(jLabel47))
							.addGap(4)
							.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
							.addGap(14)));

			controleRMEJP1.setLayout(controleRMEJP1Layout);
		} else {
			baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap().addComponent(jLabel44)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel31)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE).addGap(18)
							.addComponent(jLabel33).addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addGap(18)
							.addComponent(jLabel32).addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel34)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(10).addComponent(jLabel45).addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE).addGap(10)
							.addComponent(jLabel35).addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel36)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(22)));
			baiaJPLayout
					.setVerticalGroup(
							baiaJPLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
											.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
													.addComponent(jLabel31)
													.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel32)
													.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel34)
													.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel35)
													.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel36).addComponent(jLabel44)
													.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel45)
													.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel33)
													.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE,
															GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addContainerGap()));
			baiaJP.setLayout(baiaJPLayout);
			
			controleRMEJP1Layout.setHorizontalGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addGroup(controleRMEJP1Layout
							.createParallelGroup(Alignment.LEADING, false)
							.addComponent(jLabel42, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(controleRMEJP1Layout.createSequentialGroup()
									.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(jLabel46, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
													Short.MAX_VALUE)
											.addComponent(controleFornecidaJFT, GroupLayout.DEFAULT_SIZE, 88,
													Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
											.addComponent(jLabel47, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
											.addComponent(controleSobraJFT, GroupLayout.DEFAULT_SIZE, 92,
													Short.MAX_VALUE))))
							.addContainerGap()));
			controleRMEJP1Layout.setVerticalGroup(controleRMEJP1Layout.createParallelGroup(Alignment.TRAILING)
					.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel42)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(controleRMEJP1Layout
									.createParallelGroup(Alignment.BASELINE).addComponent(jLabel46).addComponent(jLabel47))
							.addGap(4)
							.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 20,
											GroupLayout.PREFERRED_SIZE))
							.addGap(14)));

			controleRMEJP1.setLayout(controleRMEJP1Layout);
			
			pack();
		}
		

		
		
		
		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(0));
		
		try {
			avesAlojadasJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		avesAlojadasJFT.setHorizontalAlignment(0);
		avesAlojadasJFT.setEnabled(false);

		jLabel36.setText("Controle");

		jLabel31.setText("Baia");
		try {
			controleBaiaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		try {
			baiaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baiaJFT.setHorizontalAlignment(0);

		jLabel32.setText("Sexo");
		try {
			sexoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		sexoJFT.setHorizontalAlignment(0);
		sexoJFT.setEnabled(false);

		jLabel34.setText("Linhagem");
		try {
			linhagemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		linhagemJFT.setHorizontalAlignment(0);
		linhagemJFT.setEnabled(false);

		jLabel35.setText("Aves Alojadas");

		jLabel44.setText("Aviário");

		aviarioJFT.setEditable(false);
		try {
			aviarioJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		aviarioJFT.setHorizontalAlignment(0);

		jLabel45.setText("Trat.");
		try {
			trataJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(0);
		trataJFT.setEnabled(false);

		jLabel33.setText("Lado");
		try {
			ladoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ladoJFT.setHorizontalAlignment(0);
		ladoJFT.setEnabled(false);

		controleBaiaJFT = new JFormattedTextField();
		controleBaiaJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleBaiaJFT.setEnabled(false);

		consumoJP.setBorder(new javax.swing.border.SoftBevelBorder(0));

		faseConsumoLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		faseConsumoLabel.setHorizontalAlignment(0);
		faseConsumoLabel.setText("Fase 1 (Idade 28)");

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jLabel6.setHorizontalAlignment(0);
		jLabel6.setText("Consumo de Ração");

		fornecidaHist4Label.setHorizontalAlignment(0);
		fornecidaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		fornecidaHist4Label.setEnabled(false);

		jLabel9.setHorizontalAlignment(0);
		jLabel9.setText("Fornecida");

		sobraHist4Label.setHorizontalAlignment(0);
		sobraHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		sobraHist4Label.setEnabled(false);
		try {
			fornecidaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		fornecidaJFT.setHorizontalAlignment(0);
		fornecidaJFT.setEnabled(false);

		fornecidaHist5Label.setHorizontalAlignment(0);
		fornecidaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		fornecidaHist5Label.setEnabled(false);

		jLabel10.setHorizontalAlignment(0);
		jLabel10.setText("Sobra");

		sobraHist5Label.setHorizontalAlignment(0);
		sobraHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		sobraHist5Label.setEnabled(false);
		try {
			sobraJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		sobraJFT.setHorizontalAlignment(0);
		sobraJFT.setEnabled(false);

		fornecidaHist1Label.setHorizontalAlignment(0);
		fornecidaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		fornecidaHist1Label.setEnabled(false);

		sobraHist1Label.setHorizontalAlignment(0);
		sobraHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		sobraHist1Label.setEnabled(false);

		fornecidaHist2Label.setHorizontalAlignment(0);
		fornecidaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		fornecidaHist2Label.setEnabled(false);

		sobraHist2Label.setHorizontalAlignment(0);
		sobraHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		sobraHist2Label.setEnabled(false);

		fornecidaHist3Label.setHorizontalAlignment(0);
		fornecidaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		fornecidaHist3Label.setEnabled(false);

		sobraHist3Label.setHorizontalAlignment(0);
		sobraHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		sobraHist3Label.setEnabled(false);

		idadeHist1Label.setHorizontalAlignment(0);
		idadeHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		idadeHist1Label.setEnabled(false);

		idadeHist2Label.setHorizontalAlignment(0);
		idadeHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		idadeHist2Label.setEnabled(false);

		idadeHist3Label.setHorizontalAlignment(0);
		idadeHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		idadeHist3Label.setEnabled(false);

		idadeHist4Label.setHorizontalAlignment(0);
		idadeHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		idadeHist4Label.setEnabled(false);

		idadeHist5Label.setHorizontalAlignment(0);
		idadeHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		idadeHist5Label.setEnabled(false);
		try {
			idadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		jLabel13.setHorizontalAlignment(0);
		jLabel13.setText("Idade");

		ordemHist1Label.setHorizontalAlignment(0);
		ordemHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		ordemHist1Label.setEnabled(false);

		ordemHist2Label.setHorizontalAlignment(0);
		ordemHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		ordemHist2Label.setEnabled(false);

		ordemHist3Label.setHorizontalAlignment(0);
		ordemHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		ordemHist3Label.setEnabled(false);

		ordemHist4Label.setHorizontalAlignment(0);
		ordemHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		ordemHist4Label.setEnabled(false);

		ordemHist5Label.setHorizontalAlignment(0);
		ordemHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		ordemHist5Label.setEnabled(false);

		try {
			ordemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		ordemJFT_1 = new JFormattedTextField();
		ordemJFT_1.setHorizontalAlignment(SwingConstants.CENTER);
		ordemJFT_1.setEnabled(false);

		jLabel14.setHorizontalAlignment(0);
		jLabel14.setText("Ordem");

		controleRMEJP1.setBorder(new javax.swing.border.SoftBevelBorder(0));
		try {
			controleFornecidaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleFornecidaJFT.setHorizontalAlignment(0);
		controleFornecidaJFT.setEnabled(false);

		try {
			controleSobraJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleSobraJFT.setHorizontalAlignment(0);
		controleSobraJFT.setEnabled(false);

		jLabel42.setFont(new java.awt.Font("Dialog", 1, 12));
		jLabel42.setHorizontalAlignment(0);
		jLabel42.setText("Controles");

		jLabel46.setHorizontalAlignment(0);
		jLabel46.setText("Fornecida");

		jLabel47.setHorizontalAlignment(0);
		jLabel47.setText("Sobra");

		idadeJFT_2 = new JFormattedTextField();
		idadeJFT_2.setHorizontalAlignment(SwingConstants.CENTER);
		idadeJFT_2.setEnabled(false);

		

		jLabel21.setHorizontalAlignment(0);
		jLabel21.setText("Amostrados");

		jLabel24.setHorizontalAlignment(0);
		jLabel24.setText("Nr.");
		try {
			nrAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrAmostradosJFT.setHorizontalAlignment(0);
		nrAmostradosJFT.setEnabled(false);

		jLabel25.setHorizontalAlignment(0);
		jLabel25.setText("Peso");
		try {
			pesoAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoAmostradosJFT.setHorizontalAlignment(0);
		pesoAmostradosJFT.setEnabled(false);

		nrAmHist5Label.setHorizontalAlignment(0);
		nrAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoAmHist5Label.setHorizontalAlignment(0);
		pesoAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrAmHist1Label.setHorizontalAlignment(0);
		nrAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoAmHist1Label.setHorizontalAlignment(0);
		pesoAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrAmHist2Label.setHorizontalAlignment(0);
		nrAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoAmHist2Label.setHorizontalAlignment(0);
		pesoAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrAmHist3Label.setHorizontalAlignment(0);
		nrAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoAmHist3Label.setHorizontalAlignment(0);
		pesoAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrAmHist4Label.setHorizontalAlignment(0);
		nrAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoAmHist4Label.setHorizontalAlignment(0);
		pesoAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			idadeAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeAmostradosJFT.setHorizontalAlignment(0);
		idadeAmostradosJFT.setEnabled(false);

		idadeAmHist5Label.setHorizontalAlignment(0);
		idadeAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeAmHist4Label.setHorizontalAlignment(0);
		idadeAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeAmHist3Label.setHorizontalAlignment(0);
		idadeAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeAmHist2Label.setHorizontalAlignment(0);
		idadeAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeAmHist1Label.setHorizontalAlignment(0);
		idadeAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		jLabel37.setHorizontalAlignment(0);
		jLabel37.setText("Idade");

		jLabel53.setHorizontalAlignment(0);
		jLabel53.setText("Ordem");

		ordemAmHist1Label.setHorizontalAlignment(0);
		ordemAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemAmHist2Label.setHorizontalAlignment(0);
		ordemAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemAmHist3Label.setHorizontalAlignment(0);
		ordemAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemAmHist4Label.setHorizontalAlignment(0);
		ordemAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemAmHist5Label.setHorizontalAlignment(0);
		ordemAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			ordemAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemAmostradosJFT.setHorizontalAlignment(0);
		ordemAmostradosJFT.setEnabled(false);
		try {
			controleAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleAmostradosJFT.setHorizontalAlignment(0);
		controleAmostradosJFT.setEnabled(false);

		jLabel54.setHorizontalAlignment(0);
		jLabel54.setText("Controle");
		
		faseAmostradosLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		faseAmostradosLabel.setHorizontalAlignment(0);
		faseAmostradosLabel.setText("Fase 1 (Idade 28)");
		
		jLabel20.setHorizontalAlignment(0);
		jLabel20.setText("Pesagem");

		jLabel22.setHorizontalAlignment(0);
		jLabel22.setText("Nr.");
		try {
			nrPesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrPesadosJFT.setHorizontalAlignment(0);
		nrPesadosJFT.setEnabled(false);

		jLabel23.setHorizontalAlignment(0);
		jLabel23.setText("Peso");
		try {
			pesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesadosJFT.setHorizontalAlignment(0);
		pesadosJFT.setEnabled(false);

		nrPesadosHist5Label.setHorizontalAlignment(0);
		nrPesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesadosHist5Label.setHorizontalAlignment(0);
		pesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrPesadosHist4Label.setHorizontalAlignment(0);
		nrPesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesadosHist4Label.setHorizontalAlignment(0);
		pesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrPesadosHist1Label.setHorizontalAlignment(0);
		nrPesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesadosHist1Label.setHorizontalAlignment(0);
		pesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrPesadosHist2Label.setHorizontalAlignment(0);
		nrPesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesadosHist2Label.setHorizontalAlignment(0);
		pesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrPesadosHist3Label.setHorizontalAlignment(0);
		nrPesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesadosHist3Label.setHorizontalAlignment(0);
		pesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadePesadosHist1Label.setHorizontalAlignment(0);
		idadePesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadePesadosHist2Label.setHorizontalAlignment(0);
		idadePesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadePesadosHist4Label.setHorizontalAlignment(0);
		idadePesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadePesadosHist3Label.setHorizontalAlignment(0);
		idadePesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			idadePesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadePesadosJFT.setHorizontalAlignment(0);
		idadePesadosJFT.setEnabled(false);

		jLabel30.setHorizontalAlignment(0);
		jLabel30.setText("Idade");

		idadePesadosHist5Label.setHorizontalAlignment(0);
		idadePesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		jLabel55.setHorizontalAlignment(0);
		jLabel55.setText("Ordem");

		ordemPesadosHist1Label.setHorizontalAlignment(0);
		ordemPesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemPesadosHist2Label.setHorizontalAlignment(0);
		ordemPesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemPesadosHist3Label.setHorizontalAlignment(0);
		ordemPesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemPesadosHist4Label.setHorizontalAlignment(0);
		ordemPesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemPesadosHist5Label.setHorizontalAlignment(0);
		ordemPesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			ordemPesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemPesadosJFT.setHorizontalAlignment(0);
		ordemPesadosJFT.setEnabled(false);
		try {
			controlePesagemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controlePesagemJFT.setHorizontalAlignment(0);
		controlePesagemJFT.setEnabled(false);

		jLabel56.setHorizontalAlignment(0);
		jLabel56.setText("Controle");
		
		jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jLabel26.setHorizontalAlignment(0);
		jLabel26.setText("Erros");

		jLabel27.setHorizontalAlignment(0);
		jLabel27.setText("Nr.");
		try {
			nrErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrErrosJFT.setHorizontalAlignment(0);
		nrErrosJFT.setEnabled(false);

		jLabel28.setHorizontalAlignment(0);
		jLabel28.setText("Peso");
		try {
			pesoErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoErrosJFT.setHorizontalAlignment(0);
		pesoErrosJFT.setEnabled(false);

		nrErHist1Label.setHorizontalAlignment(0);
		nrErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoErHist1Label.setHorizontalAlignment(0);
		pesoErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrErHist2Label.setHorizontalAlignment(0);
		nrErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoErHist2Label.setHorizontalAlignment(0);
		pesoErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrErHist3Label.setHorizontalAlignment(0);
		nrErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoErHist3Label.setHorizontalAlignment(0);
		pesoErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrErHist4Label.setHorizontalAlignment(0);
		nrErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoErHist4Label.setHorizontalAlignment(0);
		pesoErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrErHist5Label.setHorizontalAlignment(0);
		nrErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoErHist5Label.setHorizontalAlignment(0);
		pesoErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			idadeErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeErrosJFT.setHorizontalAlignment(0);
		idadeErrosJFT.setEnabled(false);

		idadeErHist5Label.setHorizontalAlignment(0);
		idadeErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeErHist4Label.setHorizontalAlignment(0);
		idadeErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeErHist3Label.setHorizontalAlignment(0);
		idadeErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeErHist2Label.setHorizontalAlignment(0);
		idadeErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeErHist1Label.setHorizontalAlignment(0);
		idadeErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		jLabel38.setHorizontalAlignment(0);
		jLabel38.setText("Idade");

		jLabel51.setHorizontalAlignment(0);
		jLabel51.setText("Ordem");

		ordemErHist1Label.setHorizontalAlignment(0);
		ordemErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemErHist2Label.setHorizontalAlignment(0);
		ordemErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemErHist3Label.setHorizontalAlignment(0);
		ordemErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemErHist4Label.setHorizontalAlignment(0);
		ordemErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemErHist5Label.setHorizontalAlignment(0);
		ordemErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			ordemErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemErrosJFT.setHorizontalAlignment(0);
		ordemErrosJFT.setEnabled(false);

		jLabel52.setHorizontalAlignment(0);
		jLabel52.setText("Controle");
		try {
			controleErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleErrosJFT.setHorizontalAlignment(0);
		controleErrosJFT.setEnabled(false);
		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
						.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(ordemHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ordemHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ordemHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ordemHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ordemHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(ordemJFT_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGap(9)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(idadeHist5Label, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist4Label, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist3Label, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist2Label, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist1Label, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel13, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 35,
												Short.MAX_VALUE))
								.addComponent(idadeJFT_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(fornecidaJFT)
								.addComponent(fornecidaHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(fornecidaHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(fornecidaHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(fornecidaHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(sobraHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 56,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGap(192))
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(
								Alignment.LEADING,
								jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(controleRMEJP1,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(jLabel6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 236,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
				.createSequentialGroup().addContainerGap().addComponent(jLabel6)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
						.createSequentialGroup().addComponent(jLabel13).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(idadeHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel2Layout.createSequentialGroup().addComponent(jLabel14)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(ordemHist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(ordemHist2Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(ordemHist3Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(ordemHist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(ordemHist5Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(fornecidaJFT, GroupLayout.PREFERRED_SIZE, 20,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(idadeJFT_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(ordemJFT_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(
								jPanel2Layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(fornecidaHist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(fornecidaHist2Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(fornecidaHist3Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(fornecidaHist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(fornecidaHist5Label,
												GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel2Layout.createSequentialGroup().addComponent(jLabel10)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(sobraHist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(sobraHist2Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(sobraHist3Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(sobraHist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(sobraHist5Label,
												GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
				.addGap(18).addComponent(controleRMEJP1, GroupLayout.PREFERRED_SIZE, 84, Short.MAX_VALUE)
				.addContainerGap()));
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout consumoJPLayout = new javax.swing.GroupLayout(consumoJP);
		consumoJPLayout.setHorizontalGroup(consumoJPLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(faseConsumoLabel, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
				.addGroup(consumoJPLayout.createSequentialGroup().addGap(10)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 259, Short.MAX_VALUE).addContainerGap()));
		consumoJPLayout
				.setVerticalGroup(consumoJPLayout.createParallelGroup(Alignment.LEADING).addGroup(
						consumoJPLayout.createSequentialGroup().addContainerGap().addComponent(faseConsumoLabel)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jPanel2,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));

		consumoJP.setLayout(consumoJPLayout);

		pesagemJP.setBorder(new javax.swing.border.SoftBevelBorder(0));

		pnlAmostrados.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(0));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addGroup(jPanel8Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel8Layout.createSequentialGroup()
								.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel53, -1, -1, 32767)
										.addComponent(ordemAmHist3Label, -1, -1, 32767)
										.addComponent(ordemAmHist4Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemAmHist1Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemAmHist2Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemAmHist5Label, -1, -1, 32767)
										.addComponent(ordemAmostradosJFT, javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel37, -1, -1, 32767)
										.addComponent(idadeAmHist1Label, -1, -1, 32767)
										.addComponent(idadeAmHist2Label, -1, -1, 32767)
										.addComponent(idadeAmHist3Label, -1, -1, 32767)
										.addComponent(idadeAmHist4Label, -1, -1, 32767)
										.addComponent(idadeAmHist5Label, -1, -1, 32767)
										.addComponent(idadeAmostradosJFT))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel8Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel24, -1, -1, 32767)
										.addComponent(nrAmHist1Label, -1, -1, 32767)
										.addComponent(nrAmHist2Label, -1, -1, 32767)
										.addComponent(nrAmHist3Label, -1, -1, 32767)
										.addComponent(nrAmHist4Label, -1, -1, 32767)
										.addComponent(nrAmHist5Label, -1, -1, 32767)
										.addComponent(nrAmostradosJFT, -2, 23, -2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel25, -1, 50, 32767)
										.addComponent(pesoAmHist2Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoAmHist3Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoAmHist5Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoAmHist4Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoAmostradosJFT, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(pesoAmHist1Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel8Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel54, -1, 61, 32767).addComponent(controleAmostradosJFT)))
						.addComponent(jLabel21, -1, -1, 32767)).addContainerGap()));

		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(jLabel21)
						.addGap(12, 12, 12)
						.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel8Layout.createSequentialGroup().addComponent(jLabel54, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(controleAmostradosJFT, -2, 20, -2))
								.addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(jPanel8Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel24).addComponent(jLabel25))
												.addComponent(jLabel37))
										.addComponent(jLabel53))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel8Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel8Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel8Layout.createSequentialGroup()
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(nrAmHist1Label, -2, 14, -2)
																		.addComponent(pesoAmHist1Label, -2, 14, -2))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(nrAmHist2Label, -2, 14, -2)
																		.addComponent(pesoAmHist2Label, -2, 14, -2))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(nrAmHist3Label, -2, 14, -2)
																		.addComponent(pesoAmHist3Label, -2, 14, -2))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																		.addComponent(pesoAmHist4Label, -2, 14, -2)
																		.addComponent(nrAmHist4Label, -2, 14, -2))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(nrAmHist5Label, -2, 14, -2)
																		.addComponent(pesoAmHist5Label, -2, 14, -2))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel8Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(pesoAmostradosJFT, -2, 20, -2)
																		.addComponent(nrAmostradosJFT, -2, 20, -2)))
														.addGroup(jPanel8Layout.createSequentialGroup()
																.addComponent(idadeAmHist1Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadeAmHist2Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadeAmHist3Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadeAmHist4Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadeAmHist5Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadeAmostradosJFT, -2, 20, -2)))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout
														.createSequentialGroup()
														.addComponent(ordemAmHist1Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemAmHist2Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemAmHist3Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemAmHist4Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemAmHist5Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemAmostradosJFT, -2, 20, -2)))))
						.addContainerGap()));

		

		javax.swing.GroupLayout gl_pnlAmostrados = new javax.swing.GroupLayout(pnlAmostrados);
		pnlAmostrados.setLayout(gl_pnlAmostrados);
		gl_pnlAmostrados
				.setHorizontalGroup(gl_pnlAmostrados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnlAmostrados.createSequentialGroup().addContainerGap()
								.addComponent(faseAmostradosLabel, -1, 251, 32767))
						.addGroup(gl_pnlAmostrados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(gl_pnlAmostrados.createSequentialGroup().addContainerGap()
										.addComponent(jPanel8, -2, -1, -2).addContainerGap(-1, 32767))));

		gl_pnlAmostrados.setVerticalGroup(gl_pnlAmostrados
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_pnlAmostrados.createSequentialGroup().addContainerGap().addComponent(faseAmostradosLabel)
						.addContainerGap(-1, 32767))
				.addGroup(gl_pnlAmostrados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlAmostrados.createSequentialGroup()
								.addContainerGap(26, 32767).addComponent(jPanel8, -2, -1, -2).addContainerGap())));

		pnlPesagem.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(0));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup()
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel55, -1, -1, 32767)
										.addComponent(ordemPesadosHist3Label, -1, -1, 32767)
										.addComponent(ordemPesadosHist4Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(ordemPesadosHist1Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(ordemPesadosHist2Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(ordemPesadosHist5Label, -1, -1, 32767)
										.addComponent(ordemPesadosJFT, javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idadePesadosHist3Label, -1, -1, 32767)
										.addComponent(idadePesadosHist2Label, -1, -1, 32767)
										.addComponent(jLabel30, -1, -1, 32767).addComponent(idadePesadosJFT)
										.addComponent(idadePesadosHist1Label, -1, -1, 32767)
										.addComponent(idadePesadosHist4Label, -1, -1, 32767)
										.addComponent(idadePesadosHist5Label, -1, -1, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(nrPesadosHist3Label, -1, -1, 32767)
										.addComponent(nrPesadosHist2Label, -1, -1, 32767)
										.addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, -1, 23,
												32767)
										.addComponent(nrPesadosHist1Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(nrPesadosHist4Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(nrPesadosHist5Label, javax.swing.GroupLayout.Alignment.LEADING,
												-1, -1, 32767)
										.addComponent(nrPesadosJFT, javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(pesadosHist3Label,
														javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)
												.addComponent(pesadosHist4Label,
														javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)
												.addComponent(pesadosHist5Label,
														javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)
												.addComponent(jLabel23, -1, 51, 32767)
												.addComponent(pesadosHist2Label,
														javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767)
												.addComponent(pesadosJFT)
												.addComponent(pesadosHist1Label, -1, -1, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel56, -1, 61, 32767)
										.addComponent(controlePesagemJFT, -1, 61, 32767)))
						.addComponent(jLabel20, -1, -1, 32767)).addContainerGap()));

		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel20)
						.addGap(12, 12, 12)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel56, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(controlePesagemJFT, -2, 20, -2))
								.addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel7Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel30).addComponent(jLabel23).addComponent(jLabel22))
										.addComponent(jLabel55))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel7Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel7Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel7Layout.createSequentialGroup()
																.addComponent(idadePesadosHist1Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadePesadosHist2Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadePesadosHist3Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadePesadosHist4Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadePesadosHist5Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(idadePesadosJFT, -2, 20, -2))
														.addGroup(jPanel7Layout.createSequentialGroup()
																.addComponent(pesadosHist1Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(pesadosHist2Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(pesadosHist3Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(pesadosHist4Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(pesadosHist5Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(pesadosJFT, -2, 20, -2))
														.addGroup(jPanel7Layout.createSequentialGroup()
																.addComponent(nrPesadosHist1Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(nrPesadosHist2Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(nrPesadosHist3Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(nrPesadosHist4Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(nrPesadosHist5Label, -2, 14, -2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(nrPesadosJFT, -2, 20, -2)))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
														.createSequentialGroup()
														.addComponent(ordemPesadosHist1Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemPesadosHist2Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemPesadosHist3Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemPesadosHist4Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemPesadosHist5Label, -2, 14, -2)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(ordemPesadosJFT, -2, 20, -2)))))
						.addContainerGap()));

		fasePesagemLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		fasePesagemLabel.setHorizontalAlignment(0);
		fasePesagemLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlPesagem = new javax.swing.GroupLayout(pnlPesagem);
		pnlPesagem.setLayout(gl_pnlPesagem);
		gl_pnlPesagem.setHorizontalGroup(gl_pnlPesagem.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_pnlPesagem.createSequentialGroup().addContainerGap()
						.addComponent(fasePesagemLabel, -1, 246, 32767).addContainerGap())
				.addGroup(gl_pnlPesagem.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnlPesagem.createSequentialGroup().addContainerGap()
								.addComponent(jPanel7, -1, -1, 32767).addContainerGap())));

		gl_pnlPesagem.setVerticalGroup(gl_pnlPesagem.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_pnlPesagem.createSequentialGroup().addContainerGap().addComponent(fasePesagemLabel)
						.addContainerGap(-1, 32767))
				.addGroup(gl_pnlPesagem.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlPesagem.createSequentialGroup()
								.addContainerGap(26, 32767).addComponent(jPanel7, -2, -1, -2).addContainerGap())));

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel17.setText("Escolha uma opção:");

		jLabel18.setText("[1] - Digitar Próxima Baia");

		jLabel19.setText("[2] - Finalizar Desempenho / Voltar");

		jLabel39.setText("[0] - Sair");

		jLabel40.setHorizontalAlignment(4);
		jLabel40.setText("Opção");
		try {
			opcaoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(0);
		opcaoJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel39).addComponent(jLabel19).addComponent(jLabel18)
										.addComponent(jLabel17))
								.addGap(0, 0, 32767))
						.addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel40, -1, -1, 32767)
								.addGap(8, 8, 8).addComponent(opcaoJFT, -2, 20, -2)))
						.addContainerGap()));

		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel17)
						.addGap(18, 18, 18).addComponent(jLabel18)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, 32767)
						.addComponent(jLabel39).addGap(36, 36, 36)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel40).addComponent(opcaoJFT, -2, -1, -2))
						.addContainerGap()));

		pnlErros.setBorder(new javax.swing.border.SoftBevelBorder(0));

		

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addGroup(jPanel9Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel26, -1, -1, 32767)
						.addGroup(jPanel9Layout.createSequentialGroup()
								.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel51, -1, -1, 32767)
										.addComponent(ordemErHist3Label, -1, -1, 32767)
										.addComponent(ordemErHist4Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemErHist1Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemErHist2Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemErHist5Label, -1, -1, 32767)
										.addComponent(ordemErrosJFT, javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel38, -1, -1, 32767)
										.addComponent(idadeErrosJFT, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(idadeErHist4Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(idadeErHist3Label, -1, -1, 32767)
										.addComponent(idadeErHist2Label, -1, -1, 32767)
										.addComponent(idadeErHist1Label, -1, -1, 32767)
										.addComponent(idadeErHist5Label, -1, -1, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel27, -1, 23, 32767)
										.addComponent(nrErrosJFT, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(nrErHist4Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(nrErHist3Label, -1, -1, 32767)
										.addComponent(nrErHist2Label, -1, -1, 32767)
										.addComponent(nrErHist1Label, -1, -1, 32767)
										.addComponent(nrErHist5Label, -1, -1, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(pesoErHist5Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoErHist4Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoErHist3Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoErHist2Label, javax.swing.GroupLayout.Alignment.TRAILING, -1,
												-1, 32767)
										.addComponent(pesoErHist1Label, -1, -1, 32767).addComponent(pesoErrosJFT)
										.addComponent(jLabel28, -1, 48, 32767))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel52, -1, -1, 32767)
										.addComponent(controleErrosJFT, -2, 61, -2))))
						.addContainerGap()));

		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap().addComponent(jLabel26)
						.addGap(12, 12, 12)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel38).addComponent(jLabel27).addComponent(jLabel28))
								.addComponent(jLabel51))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel9Layout.createSequentialGroup().addComponent(ordemErHist1Label, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(ordemErHist2Label, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(ordemErHist3Label, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(ordemErHist4Label, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(ordemErHist5Label, -2, 14, -2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(ordemErrosJFT, -2, 20, -2))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel9Layout.createSequentialGroup()
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nrErHist1Label, -2, 14, -2)
														.addComponent(pesoErHist1Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nrErHist2Label, -2, 14, -2)
														.addComponent(pesoErHist2Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(nrErHist3Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2)
														.addComponent(pesoErHist3Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(nrErHist4Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2)
														.addComponent(pesoErHist4Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(nrErHist5Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2)
														.addComponent(pesoErHist5Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel9Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nrErrosJFT, -2, 20, -2)
														.addComponent(pesoErrosJFT, -2, 20, -2)))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel9Layout.createSequentialGroup()
												.addComponent(idadeErHist1Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeErHist2Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeErHist3Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeErHist4Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeErHist5Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeErrosJFT, -2, 20, -2))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel9Layout.createSequentialGroup().addComponent(jLabel52, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(controleErrosJFT, -2, 20, -2)))
						.addContainerGap()));

		faseErrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		faseErrosLabel.setHorizontalAlignment(0);
		faseErrosLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlErros = new javax.swing.GroupLayout(pnlErros);
		pnlErros.setLayout(gl_pnlErros);
		gl_pnlErros.setHorizontalGroup(
				gl_pnlErros.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 255, 32767)
						.addGroup(gl_pnlErros.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(gl_pnlErros.createSequentialGroup().addContainerGap().addGroup(gl_pnlErros
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(faseErrosLabel, -1, -1, 32767).addComponent(jPanel9, -2, -1, -2))
										.addContainerGap(-1, 32767))));

		gl_pnlErros.setVerticalGroup(gl_pnlErros.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 250, 32767)
				.addGroup(gl_pnlErros.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnlErros.createSequentialGroup().addContainerGap().addComponent(faseErrosLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel9, -2, -1, -2).addContainerGap(-1, 32767))));

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(jPanel10Layout.createSequentialGroup().addComponent(pnlErros, -2, -1, -2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
						.addComponent(pnlAmostrados, -2, -1, -2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(pnlPesagem, -2, -1, -2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel5, -2, 240, -2).addContainerGap()));

		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(jPanel10Layout.createSequentialGroup()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap().addComponent(jPanel5,
										-2, -1, -2))
								.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(pnlErros, -2, -1, -2).addComponent(pnlAmostrados, -1, 267, 32767)
										.addComponent(pnlPesagem, -1, 267, 32767)))
						.addContainerGap()));

		jPanel10.setLayout(jPanel10Layout);

		javax.swing.GroupLayout pesagemJPLayout = new javax.swing.GroupLayout(pesagemJP);
		pesagemJPLayout.setHorizontalGroup(
				pesagemJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(pesagemJPLayout
						.createSequentialGroup().addContainerGap().addComponent(jPanel10, -1, 1092, 32767)));

		pesagemJPLayout.setVerticalGroup(pesagemJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(javax.swing.GroupLayout.Alignment.LEADING, pesagemJPLayout.createSequentialGroup()
						.addContainerGap(-1, 32767).addComponent(jPanel10, -2, -1, -2)));

		pesagemJP.setLayout(pesagemJPLayout);

		pnlMortalidade.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jPanel43.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jLabel5.setHorizontalAlignment(0);
		jLabel5.setText("Mortalidade");

		jLabel7.setHorizontalAlignment(0);
		jLabel7.setText("Nr.");
		try {
			nrMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrMortalidadeJFT.setHorizontalAlignment(0);
		nrMortalidadeJFT.setEnabled(false);

		jLabel8.setHorizontalAlignment(0);
		jLabel8.setText("Peso");

		nrMHist1Label.setHorizontalAlignment(0);
		nrMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoMHist1Label.setHorizontalAlignment(0);
		pesoMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrMHist2Label.setHorizontalAlignment(0);
		nrMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoMHist2Label.setHorizontalAlignment(0);
		pesoMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrMHist3Label.setHorizontalAlignment(0);
		nrMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoMHist3Label.setHorizontalAlignment(0);
		pesoMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrMHist4Label.setHorizontalAlignment(0);
		nrMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoMHist4Label.setHorizontalAlignment(0);
		pesoMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrMHist5Label.setHorizontalAlignment(0);
		nrMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoMHist5Label.setHorizontalAlignment(0);
		pesoMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		jLabel16.setHorizontalAlignment(0);
		jLabel16.setText("Idade");

		idadeMHist1Label.setHorizontalAlignment(0);
		idadeMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeMHist2Label.setHorizontalAlignment(0);
		idadeMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeMHist3Label.setHorizontalAlignment(0);
		idadeMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeMHist4Label.setHorizontalAlignment(0);
		idadeMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeMHist5Label.setHorizontalAlignment(0);
		idadeMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			idadeMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeMortalidadeJFT.setHorizontalAlignment(0);
		idadeMortalidadeJFT.setEnabled(false);

		jLabel41.setHorizontalAlignment(0);
		jLabel41.setText("Ordem");

		ordemMortalidadeHist1Label.setHorizontalAlignment(0);
		ordemMortalidadeHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemMortalidadeHist2Label.setHorizontalAlignment(0);
		ordemMortalidadeHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemMortalidadeHist3Label.setHorizontalAlignment(0);
		ordemMortalidadeHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemMortalidadeHist4Label.setHorizontalAlignment(0);
		ordemMortalidadeHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemMortalidadeHist5Label.setHorizontalAlignment(0);
		ordemMortalidadeHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			ordemMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemMortalidadeJFT.setHorizontalAlignment(0);
		ordemMortalidadeJFT.setEnabled(false);

		jLabel48.setHorizontalAlignment(0);
		jLabel48.setText("Controle");

		try {
			pesoMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoMortalidadeJFT.setHorizontalAlignment(0);
		pesoMortalidadeJFT.setEnabled(false);

		controleMortalidadeJFT = new JFormattedTextField();
		controleMortalidadeJFT.setHorizontalAlignment(0);
		controleMortalidadeJFT.setEnabled(false);

//		try {
//			controleMortalidadeJFT.setFormatterFactory(
//					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
//		} catch (java.text.ParseException ex) {
//			ex.printStackTrace();
//		}

		javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
		jPanel43Layout.setHorizontalGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel43Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
						.addGroup(jPanel43Layout.createSequentialGroup().addGroup(jPanel43Layout
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel41, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeHist3Label, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeHist5Label, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(ordemMortalidadeJFT, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 41,
										Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel43Layout
										.createSequentialGroup()
										.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(idadeMortalidadeJFT, 35, 35, 35)
												.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(idadeMHist3Label, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
														.addComponent(idadeMHist5Label, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(idadeMHist4Label, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
												.addComponent(idadeMHist2Label, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(idadeMHist1Label, GroupLayout.PREFERRED_SIZE, 35,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(nrMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(nrMHist1Label, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(nrMHist2Label, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(nrMHist3Label, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(nrMHist4Label, Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(nrMHist5Label, GroupLayout.PREFERRED_SIZE, 23,
																GroupLayout.PREFERRED_SIZE))))
										.addGroup(jPanel43Layout.createSequentialGroup()
												.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 37,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel7,
														GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(pesoMHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
										.addComponent(pesoMortalidadeJFT).addComponent(pesoMHist5Label,
												Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(jPanel43Layout.createSequentialGroup().addGap(7).addComponent(
												jLabel48, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel43Layout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(controleMortalidadeJFT)))
								.addGap(29)))));
		jPanel43Layout
				.setVerticalGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel43Layout.createSequentialGroup().addContainerGap().addComponent(jLabel5)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(jPanel43Layout
										.createParallelGroup(Alignment.LEADING).addGroup(jPanel43Layout
												.createSequentialGroup().addComponent(jLabel8).addPreferredGap(
														ComponentPlacement.RELATED)
												.addComponent(pesoMHist1Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(
														pesoMHist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(
														pesoMHist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(pesoMHist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(
														pesoMHist5Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel43Layout.createSequentialGroup()
												.addGroup(jPanel43Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(jLabel41).addComponent(jLabel16)
														.addComponent(jLabel7))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
														.addGroup(jPanel43Layout.createSequentialGroup().addGap(1)
																.addGroup(jPanel43Layout
																		.createParallelGroup(Alignment.TRAILING)
																		.addGroup(jPanel43Layout.createSequentialGroup()
																				.addComponent(nrMHist1Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(nrMHist2Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(nrMHist3Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(nrMHist4Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(nrMHist5Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(nrMortalidadeJFT,
																						GroupLayout.PREFERRED_SIZE, 20,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(jPanel43Layout.createSequentialGroup()
																				.addComponent(idadeMHist1Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(idadeMHist2Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(idadeMHist3Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(idadeMHist4Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(idadeMHist5Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(idadeMortalidadeJFT,
																						GroupLayout.PREFERRED_SIZE, 20,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(jPanel43Layout.createSequentialGroup()
																				.addComponent(jLabel48,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addGroup(jPanel43Layout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								pesoMortalidadeJFT,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								controleMortalidadeJFT,
																								GroupLayout.PREFERRED_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.PREFERRED_SIZE)))))
														.addGroup(jPanel43Layout.createSequentialGroup()
																.addComponent(ordemMortalidadeHist1Label,
																		GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(ordemMortalidadeHist2Label,
																		GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(ordemMortalidadeHist3Label,
																		GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(ordemMortalidadeHist4Label,
																		GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(ordemMortalidadeHist5Label,
																		GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(ordemMortalidadeJFT,
																		GroupLayout.PREFERRED_SIZE, 20,
																		GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel43.setLayout(jPanel43Layout);

		faseMortalidadeLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		faseMortalidadeLabel.setHorizontalAlignment(0);
		faseMortalidadeLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlMortalidade = new javax.swing.GroupLayout(pnlMortalidade);
		gl_pnlMortalidade.setHorizontalGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnlMortalidade.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel43, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
								.addComponent(faseMortalidadeLabel, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
						.addContainerGap()));
		gl_pnlMortalidade.setVerticalGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMortalidade.createSequentialGroup().addContainerGap().addComponent(faseMortalidadeLabel)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pnlMortalidade.setLayout(gl_pnlMortalidade);

		pnlEliminados.setBorder(new javax.swing.border.SoftBevelBorder(0));

		jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(0));

		eliminadosJP1.setHorizontalAlignment(0);
		eliminadosJP1.setText("Eliminados");

		jLabel29.setHorizontalAlignment(0);
		jLabel29.setText("Nr.");

		try {
			nrEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrEliminadosJFT.setHorizontalAlignment(0);
		nrEliminadosJFT.setEnabled(false);

		jLabel57.setHorizontalAlignment(0);
		jLabel57.setText("Peso");
		try {
			pesoEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoEliminadosJFT.setHorizontalAlignment(0);
		pesoEliminadosJFT.setEnabled(false);

		nrElHist2Label.setHorizontalAlignment(0);
		nrElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoElHist2Label.setHorizontalAlignment(0);
		pesoElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrElHist1Label.setHorizontalAlignment(0);
		nrElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoElHist1Label.setHorizontalAlignment(0);
		pesoElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrElHist3Label.setHorizontalAlignment(0);
		nrElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoElHist3Label.setHorizontalAlignment(0);
		pesoElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrElHist4Label.setHorizontalAlignment(0);
		nrElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoElHist4Label.setHorizontalAlignment(0);
		pesoElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		nrElHist5Label.setHorizontalAlignment(0);
		nrElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		pesoElHist5Label.setHorizontalAlignment(0);
		pesoElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		jLabel58.setHorizontalAlignment(0);
		jLabel58.setText("Idade");

		idadeElHist1Label.setHorizontalAlignment(0);
		idadeElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeElHist2Label.setHorizontalAlignment(0);
		idadeElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeElHist3Label.setHorizontalAlignment(0);
		idadeElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeElHist4Label.setHorizontalAlignment(0);
		idadeElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		idadeElHist5Label.setHorizontalAlignment(0);
		idadeElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			idadeEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeEliminadosJFT.setHorizontalAlignment(0);
		idadeEliminadosJFT.setEnabled(false);
		try {
			controleEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleEliminadosJFT.setHorizontalAlignment(0);
		controleEliminadosJFT.setEnabled(false);

		jLabel59.setHorizontalAlignment(0);
		jLabel59.setText("Controle");

		jLabel60.setHorizontalAlignment(0);
		jLabel60.setText("Ordem");

		ordemElHist1Label.setHorizontalAlignment(0);
		ordemElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemElHist2Label.setHorizontalAlignment(0);
		ordemElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemElHist3Label.setHorizontalAlignment(0);
		ordemElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemElHist4Label.setHorizontalAlignment(0);
		ordemElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(1));

		ordemElHist5Label.setHorizontalAlignment(0);
		ordemElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(1));
		try {
			ordemEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemEliminadosJFT.setHorizontalAlignment(0);
		ordemEliminadosJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addGroup(jPanel13Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(eliminadosJP1, -1, -1, 32767)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
								.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel60, -1, -1, 32767)
										.addComponent(ordemElHist3Label, -1, -1, 32767)
										.addComponent(ordemElHist4Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemElHist1Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemElHist2Label, javax.swing.GroupLayout.Alignment.LEADING, -1,
												-1, 32767)
										.addComponent(ordemElHist5Label, -1, -1, 32767)
										.addComponent(ordemEliminadosJFT, javax.swing.GroupLayout.Alignment.LEADING))
								.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel13Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(idadeElHist5Label,
																javax.swing.GroupLayout.Alignment.LEADING, -1, -1,
																32767)
														.addComponent(idadeElHist2Label,
																javax.swing.GroupLayout.Alignment.LEADING, -1, -1,
																32767)
														.addComponent(idadeElHist3Label,
																javax.swing.GroupLayout.Alignment.LEADING, -1, -1,
																32767)
														.addComponent(idadeElHist4Label,
																javax.swing.GroupLayout.Alignment.LEADING, -1, -1,
																32767)
														.addComponent(idadeEliminadosJFT,
																javax.swing.GroupLayout.Alignment.LEADING)))
										.addGroup(jPanel13Layout.createSequentialGroup().addGap(10, 10, 10)
												.addComponent(jLabel58, -1, -1, 32767))
										.addGroup(jPanel13Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(idadeElHist1Label, -1, -1, 32767)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel13Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel29, -1, 23, 32767)
										.addComponent(nrElHist5Label, -1, -1, 32767)
										.addComponent(nrElHist2Label, -1, -1, 32767)
										.addComponent(nrElHist1Label, -1, -1, 32767)
										.addComponent(nrElHist3Label, -1, -1, 32767)
										.addComponent(nrElHist4Label, -1, -1, 32767).addComponent(nrEliminadosJFT,
												GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel57, -2, 48, -2)
										.addGroup(jPanel13Layout.createSequentialGroup().addGroup(jPanel13Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(pesoElHist1Label, -2, 48, -2)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(pesoElHist3Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -1, -1,
																32767)
														.addComponent(pesoElHist4Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -1, -1,
																32767)
														.addComponent(pesoElHist5Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -1, -1,
																32767)
														.addComponent(pesoEliminadosJFT,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(pesoElHist2Label, -2, 48, -2)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(controleEliminadosJFT)
														.addComponent(jLabel59, -1, 61, 32767))))
								.addContainerGap()))));

		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addContainerGap().addComponent(eliminadosJP1)
						.addGap(12, 12, 12)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel60).addComponent(jLabel58).addComponent(jLabel29)
								.addComponent(jLabel57))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel13Layout.createSequentialGroup()
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(pesoElHist1Label, -2, 14, -2)
														.addComponent(nrElHist1Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(pesoElHist2Label, -2, 14, -2)
														.addComponent(nrElHist2Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(nrElHist3Label, -2, 14, -2)
														.addComponent(pesoElHist3Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(pesoElHist4Label, -2, 14, -2)
														.addComponent(nrElHist4Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(nrElHist5Label,
																javax.swing.GroupLayout.Alignment.TRAILING, -2, 14, -2)
														.addComponent(pesoElHist5Label, -2, 14, -2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel13Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(nrEliminadosJFT, GroupLayout.PREFERRED_SIZE, 20,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(pesoEliminadosJFT, -2, 20, -2)))
										.addGroup(jPanel13Layout.createSequentialGroup()
												.addComponent(idadeElHist1Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeElHist2Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeElHist3Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeElHist4Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeElHist5Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeEliminadosJFT, -2, 20, -2))
										.addGroup(jPanel13Layout.createSequentialGroup()
												.addComponent(jLabel59, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(controleEliminadosJFT, -2, 20, -2)))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel13Layout.createSequentialGroup()
												.addComponent(ordemElHist1Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ordemElHist2Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ordemElHist3Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ordemElHist4Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ordemElHist5Label, -2, 14, -2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(ordemEliminadosJFT, -2, 20, -2)))
						.addContainerGap(-1, 32767)));

		faseEliminadosLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		faseEliminadosLabel.setHorizontalAlignment(0);
		faseEliminadosLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlEliminados = new javax.swing.GroupLayout(pnlEliminados);
		pnlEliminados.setLayout(gl_pnlEliminados);
		gl_pnlEliminados.setHorizontalGroup(gl_pnlEliminados
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_pnlEliminados.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlEliminados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(gl_pnlEliminados.createSequentialGroup().addGap(0, 0, 32767)
										.addComponent(jPanel13, -2, -1, -2))
								.addComponent(faseEliminadosLabel, -1, -1, 32767))
						.addContainerGap()));

		gl_pnlEliminados.setVerticalGroup(
				gl_pnlEliminados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						gl_pnlEliminados.createSequentialGroup().addContainerGap().addComponent(faseEliminadosLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
								.addComponent(jPanel13, -2, -1, -2).addContainerGap()));

		registroLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
		registroLabel.setForeground(new java.awt.Color(0, 153, 255));
		registroLabel.setHorizontalAlignment(0);
		registroLabel.setText("Registro salvo com sucesso!!");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(pnlMortalidade, GroupLayout.PREFERRED_SIZE, 317,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(pnlEliminados,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(229, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(registroLabel, GroupLayout.PREFERRED_SIZE, 1000,
										GroupLayout.PREFERRED_SIZE)
								.addGap(0, 125, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addComponent(pesagemJP, GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
								.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pnlMortalidade, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlEliminados, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(pesagemJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(registroLabel)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, -1, 1000, 32767));

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jPanel1, -1, -1, 32767).addContainerGap()));

		getContentPane().setLayout(layout);

		
		pack();
	}

	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewDesempenhoP().setVisible(true);
			}
		});
	}

	public javax.swing.JFormattedTextField getControleAmostradosJFT() {
		return controleAmostradosJFT;
	}

	public void setControleAmostradosJFT(javax.swing.JFormattedTextField controleAmostradosJFT) {
		this.controleAmostradosJFT = controleAmostradosJFT;
	}

	public javax.swing.JFormattedTextField getControleEliminadosJFT() {
		return controleEliminadosJFT;
	}

	public void setControleEliminadosJFT(javax.swing.JFormattedTextField controleEliminadosJFT) {
		this.controleEliminadosJFT = controleEliminadosJFT;
	}

	public javax.swing.JFormattedTextField getControleErrosJFT() {
		return controleErrosJFT;
	}

	public void setControleErrosJFT(javax.swing.JFormattedTextField controleErrosJFT) {
		this.controleErrosJFT = controleErrosJFT;
	}

	public javax.swing.JFormattedTextField getControleFornecidaJFT() {
		return controleFornecidaJFT;
	}

	public void setControleFornecidaJFT(javax.swing.JFormattedTextField controleFornecidaJFT) {
		this.controleFornecidaJFT = controleFornecidaJFT;
	}

	public javax.swing.JFormattedTextField getControlePesagemJFT() {
		return controlePesagemJFT;
	}

	public void setControlePesagemJFT(javax.swing.JFormattedTextField controlePesagemJFT) {
		this.controlePesagemJFT = controlePesagemJFT;
	}

	public javax.swing.JPanel getControleRMEJP1() {
		return controleRMEJP1;
	}

	public void setControleRMEJP1(javax.swing.JPanel controleRMEJP1) {
		this.controleRMEJP1 = controleRMEJP1;
	}

	public javax.swing.JFormattedTextField getControleSobraJFT() {
		return controleSobraJFT;
	}

	public void setControleSobraJFT(javax.swing.JFormattedTextField controleSobraJFT) {
		this.controleSobraJFT = controleSobraJFT;
	}

	public JLabel getEliminadosJP1() {
		return eliminadosJP1;
	}

	public void setEliminadosJP1(JLabel eliminadosJP1) {
		this.eliminadosJP1 = eliminadosJP1;
	}

	public JLabel getFasePesagemLabel1() {
		return faseMortalidadeLabel;
	}

	public void setFasePesagemLabel1(JLabel fasePesagemLabel1) {
		this.faseMortalidadeLabel = fasePesagemLabel1;
	}

	public JLabel getFasePesagemLabel2() {
		return faseEliminadosLabel;
	}

	public void setFasePesagemLabel2(JLabel fasePesagemLabel2) {
		this.faseEliminadosLabel = fasePesagemLabel2;
	}

	public JLabel getFasePesagemLabel3() {
		return faseErrosLabel;
	}

	public void setFasePesagemLabel3(JLabel fasePesagemLabel3) {
		this.faseErrosLabel = fasePesagemLabel3;
	}

	public JLabel getFasePesagemLabel4() {
		return faseAmostradosLabel;
	}

	public void setFasePesagemLabel4(JLabel fasePesagemLabel4) {
		this.faseAmostradosLabel = fasePesagemLabel4;
	}

	public JLabel getFasePesagemLabel5() {
		return fasePesagemLabel;
	}

	public void setFasePesagemLabel5(JLabel fasePesagemLabel5) {
		this.fasePesagemLabel = fasePesagemLabel5;
	}

	public JLabel getIdadeAmHist1Label() {
		return idadeAmHist1Label;
	}

	public void setIdadeAmHist1Label(JLabel idadeAmHist1Label) {
		this.idadeAmHist1Label = idadeAmHist1Label;
	}

	public JLabel getIdadeAmHist2Label() {
		return idadeAmHist2Label;
	}

	public void setIdadeAmHist2Label(JLabel idadeAmHist2Label) {
		this.idadeAmHist2Label = idadeAmHist2Label;
	}

	public JLabel getIdadeAmHist3Label() {
		return idadeAmHist3Label;
	}

	public void setIdadeAmHist3Label(JLabel idadeAmHist3Label) {
		this.idadeAmHist3Label = idadeAmHist3Label;
	}

	public JLabel getIdadeAmHist4Label() {
		return idadeAmHist4Label;
	}

	public void setIdadeAmHist4Label(JLabel idadeAmHist4Label) {
		this.idadeAmHist4Label = idadeAmHist4Label;
	}

	public JLabel getIdadeAmHist5Label() {
		return idadeAmHist5Label;
	}

	public void setIdadeAmHist5Label(JLabel idadeAmHist5Label) {
		this.idadeAmHist5Label = idadeAmHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeAmostradosJFT() {
		return idadeAmostradosJFT;
	}

	public void setIdadeAmostradosJFT(javax.swing.JFormattedTextField idadeAmostradosJFT) {
		this.idadeAmostradosJFT = idadeAmostradosJFT;
	}

	public JLabel getIdadeElHist1Label() {
		return idadeElHist1Label;
	}

	public void setIdadeElHist1Label(JLabel idadeElHist1Label) {
		this.idadeElHist1Label = idadeElHist1Label;
	}

	public JLabel getIdadeElHist2Label() {
		return idadeElHist2Label;
	}

	public void setIdadeElHist2Label(JLabel idadeElHist2Label) {
		this.idadeElHist2Label = idadeElHist2Label;
	}

	public JLabel getIdadeElHist3Label() {
		return idadeElHist3Label;
	}

	public void setIdadeElHist3Label(JLabel idadeElHist3Label) {
		this.idadeElHist3Label = idadeElHist3Label;
	}

	public JLabel getIdadeElHist4Label() {
		return idadeElHist4Label;
	}

	public void setIdadeElHist4Label(JLabel idadeElHist4Label) {
		this.idadeElHist4Label = idadeElHist4Label;
	}

	public JLabel getIdadeElHist5Label() {
		return idadeElHist5Label;
	}

	public void setIdadeElHist5Label(JLabel idadeElHist5Label) {
		this.idadeElHist5Label = idadeElHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeEliminadosJFT() {
		return idadeEliminadosJFT;
	}

	public void setIdadeEliminadosJFT(javax.swing.JFormattedTextField idadeEliminadosJFT) {
		this.idadeEliminadosJFT = idadeEliminadosJFT;
	}

	public JLabel getIdadeErHist1Label() {
		return idadeErHist1Label;
	}

	public void setIdadeErHist1Label(JLabel idadeErHist1Label) {
		this.idadeErHist1Label = idadeErHist1Label;
	}

	public JLabel getIdadeErHist2Label() {
		return idadeErHist2Label;
	}

	public void setIdadeErHist2Label(JLabel idadeErHist2Label) {
		this.idadeErHist2Label = idadeErHist2Label;
	}

	public JLabel getIdadeErHist3Label() {
		return idadeErHist3Label;
	}

	public void setIdadeErHist3Label(JLabel idadeErHist3Label) {
		this.idadeErHist3Label = idadeErHist3Label;
	}

	public JLabel getIdadeErHist4Label() {
		return idadeErHist4Label;
	}

	public void setIdadeErHist4Label(JLabel idadeErHist4Label) {
		this.idadeErHist4Label = idadeErHist4Label;
	}

	public JLabel getIdadeErHist5Label() {
		return idadeErHist5Label;
	}

	public void setIdadeErHist5Label(JLabel idadeErHist5Label) {
		this.idadeErHist5Label = idadeErHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeErrosJFT() {
		return idadeErrosJFT;
	}

	public void setIdadeErrosJFT(javax.swing.JFormattedTextField idadeErrosJFT) {
		this.idadeErrosJFT = idadeErrosJFT;
	}

	public JLabel getIdadeHist1Label() {
		return idadeHist1Label;
	}

	public void setIdadeHist1Label(JLabel idadeHist1Label) {
		this.idadeHist1Label = idadeHist1Label;
	}

	public JLabel getIdadeHist2Label() {
		return idadeHist2Label;
	}

	public void setIdadeHist2Label(JLabel idadeHist2Label) {
		this.idadeHist2Label = idadeHist2Label;
	}

	public JLabel getIdadeHist3Label() {
		return idadeHist3Label;
	}

	public void setIdadeHist3Label(JLabel idadeHist3Label) {
		this.idadeHist3Label = idadeHist3Label;
	}

	public JLabel getIdadeHist4Label() {
		return idadeHist4Label;
	}

	public void setIdadeHist4Label(JLabel idadeHist4Label) {
		this.idadeHist4Label = idadeHist4Label;
	}

	public JLabel getIdadeHist5Label() {
		return idadeHist5Label;
	}

	public void setIdadeHist5Label(JLabel idadeHist5Label) {
		this.idadeHist5Label = idadeHist5Label;
	}

	public JLabel getIdadeMHist1Label() {
		return idadeMHist1Label;
	}

	public void setIdadeMHist1Label(JLabel idadeMHist1Label) {
		this.idadeMHist1Label = idadeMHist1Label;
	}

	public JLabel getIdadeMHist2Label() {
		return idadeMHist2Label;
	}

	public void setIdadeMHist2Label(JLabel idadeMHist2Label) {
		this.idadeMHist2Label = idadeMHist2Label;
	}

	public JLabel getIdadeMHist3Label() {
		return idadeMHist3Label;
	}

	public void setIdadeMHist3Label(JLabel idadeMHist3Label) {
		this.idadeMHist3Label = idadeMHist3Label;
	}

	public JLabel getIdadeMHist4Label() {
		return idadeMHist4Label;
	}

	public void setIdadeMHist4Label(JLabel idadeMHist4Label) {
		this.idadeMHist4Label = idadeMHist4Label;
	}

	public JLabel getIdadeMHist5Label() {
		return idadeMHist5Label;
	}

	public void setIdadeMHist5Label(JLabel idadeMHist5Label) {
		this.idadeMHist5Label = idadeMHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeMortalidadeJFT() {
		return idadeMortalidadeJFT;
	}

	public void setIdadeMortalidadeJFT(javax.swing.JFormattedTextField idadeMortalidadeJFT) {
		this.idadeMortalidadeJFT = idadeMortalidadeJFT;
	}

	public JLabel getIdadePesadosHist1Label() {
		return idadePesadosHist1Label;
	}

	public void setIdadePesadosHist1Label(JLabel idadePesadosHist1Label) {
		this.idadePesadosHist1Label = idadePesadosHist1Label;
	}

	public JLabel getIdadePesadosHist2Label() {
		return idadePesadosHist2Label;
	}

	public void setIdadePesadosHist2Label(JLabel idadePesadosHist2Label) {
		this.idadePesadosHist2Label = idadePesadosHist2Label;
	}

	public JLabel getIdadePesadosHist3Label() {
		return idadePesadosHist3Label;
	}

	public void setIdadePesadosHist3Label(JLabel idadePesadosHist3Label) {
		this.idadePesadosHist3Label = idadePesadosHist3Label;
	}

	public JLabel getIdadePesadosHist4Label() {
		return idadePesadosHist4Label;
	}

	public void setIdadePesadosHist4Label(JLabel idadePesadosHist4Label) {
		this.idadePesadosHist4Label = idadePesadosHist4Label;
	}

	public JLabel getIdadePesadosHist5Label() {
		return idadePesadosHist5Label;
	}

	public void setIdadePesadosHist5Label(JLabel idadePesadosHist5Label) {
		this.idadePesadosHist5Label = idadePesadosHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadePesadosJFT() {
		return idadePesadosJFT;
	}

	public void setIdadePesadosJFT(javax.swing.JFormattedTextField idadePesadosJFT) {
		this.idadePesadosJFT = idadePesadosJFT;
	}

	public JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(JLabel jLabel10) {
		this.jLabel10 = jLabel10;
	}

	public JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(JLabel jLabel14) {
		this.jLabel14 = jLabel14;
	}

	public JLabel getjLabel16() {
		return jLabel16;
	}

	public void setjLabel16(JLabel jLabel16) {
		this.jLabel16 = jLabel16;
	}

	public JLabel getjLabel17() {
		return jLabel17;
	}

	public void setjLabel17(JLabel jLabel17) {
		this.jLabel17 = jLabel17;
	}

	public JLabel getjLabel18() {
		return jLabel18;
	}

	public void setjLabel18(JLabel jLabel18) {
		this.jLabel18 = jLabel18;
	}

	public JLabel getjLabel19() {
		return jLabel19;
	}

	public void setjLabel19(JLabel jLabel19) {
		this.jLabel19 = jLabel19;
	}

	public JLabel getjLabel20() {
		return jLabel20;
	}

	public void setjLabel20(JLabel jLabel20) {
		this.jLabel20 = jLabel20;
	}

	public JLabel getjLabel21() {
		return jLabel21;
	}

	public void setjLabel21(JLabel jLabel21) {
		this.jLabel21 = jLabel21;
	}

	public JLabel getjLabel22() {
		return jLabel22;
	}

	public void setjLabel22(JLabel jLabel22) {
		this.jLabel22 = jLabel22;
	}

	public JLabel getjLabel23() {
		return jLabel23;
	}

	public void setjLabel23(JLabel jLabel23) {
		this.jLabel23 = jLabel23;
	}

	public JLabel getjLabel24() {
		return jLabel24;
	}

	public void setjLabel24(JLabel jLabel24) {
		this.jLabel24 = jLabel24;
	}

	public JLabel getjLabel25() {
		return jLabel25;
	}

	public void setjLabel25(JLabel jLabel25) {
		this.jLabel25 = jLabel25;
	}

	public JLabel getjLabel26() {
		return jLabel26;
	}

	public void setjLabel26(JLabel jLabel26) {
		this.jLabel26 = jLabel26;
	}

	public JLabel getjLabel27() {
		return jLabel27;
	}

	public void setjLabel27(JLabel jLabel27) {
		this.jLabel27 = jLabel27;
	}

	public JLabel getjLabel28() {
		return jLabel28;
	}

	public void setjLabel28(JLabel jLabel28) {
		this.jLabel28 = jLabel28;
	}

	public JLabel getjLabel29() {
		return jLabel29;
	}

	public void setjLabel29(JLabel jLabel29) {
		this.jLabel29 = jLabel29;
	}

	public JLabel getjLabel30() {
		return jLabel30;
	}

	public void setjLabel30(JLabel jLabel30) {
		this.jLabel30 = jLabel30;
	}

	public JLabel getjLabel31() {
		return jLabel31;
	}

	public void setjLabel31(JLabel jLabel31) {
		this.jLabel31 = jLabel31;
	}

	public JLabel getjLabel32() {
		return jLabel32;
	}

	public void setjLabel32(JLabel jLabel32) {
		this.jLabel32 = jLabel32;
	}

	public JLabel getjLabel33() {
		return jLabel33;
	}

	public void setjLabel33(JLabel jLabel33) {
		this.jLabel33 = jLabel33;
	}

	public JLabel getjLabel34() {
		return jLabel34;
	}

	public void setjLabel34(JLabel jLabel34) {
		this.jLabel34 = jLabel34;
	}

	public JLabel getjLabel35() {
		return jLabel35;
	}

	public void setjLabel35(JLabel jLabel35) {
		this.jLabel35 = jLabel35;
	}

	public JLabel getjLabel36() {
		return jLabel36;
	}

	public void setjLabel36(JLabel jLabel36) {
		this.jLabel36 = jLabel36;
	}

	public JLabel getjLabel37() {
		return jLabel37;
	}

	public void setjLabel37(JLabel jLabel37) {
		this.jLabel37 = jLabel37;
	}

	public JLabel getjLabel38() {
		return jLabel38;
	}

	public void setjLabel38(JLabel jLabel38) {
		this.jLabel38 = jLabel38;
	}

	public JLabel getjLabel39() {
		return jLabel39;
	}

	public void setjLabel39(JLabel jLabel39) {
		this.jLabel39 = jLabel39;
	}

	public JLabel getjLabel40() {
		return jLabel40;
	}

	public void setjLabel40(JLabel jLabel40) {
		this.jLabel40 = jLabel40;
	}

	public JLabel getjLabel41() {
		return jLabel41;
	}

	public void setjLabel41(JLabel jLabel41) {
		this.jLabel41 = jLabel41;
	}

	public JLabel getjLabel42() {
		return jLabel42;
	}

	public void setjLabel42(JLabel jLabel42) {
		this.jLabel42 = jLabel42;
	}

	public JLabel getjLabel44() {
		return jLabel44;
	}

	public void setjLabel44(JLabel jLabel44) {
		this.jLabel44 = jLabel44;
	}

	public JLabel getjLabel45() {
		return jLabel45;
	}

	public void setjLabel45(JLabel jLabel45) {
		this.jLabel45 = jLabel45;
	}

	public JLabel getjLabel46() {
		return jLabel46;
	}

	public void setjLabel46(JLabel jLabel46) {
		this.jLabel46 = jLabel46;
	}

	public JLabel getjLabel47() {
		return jLabel47;
	}

	public void setjLabel47(JLabel jLabel47) {
		this.jLabel47 = jLabel47;
	}

	public JLabel getjLabel48() {
		return jLabel48;
	}

	public void setjLabel48(JLabel jLabel48) {
		this.jLabel48 = jLabel48;
	}

	public JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(JLabel jLabel5) {
		this.jLabel5 = jLabel5;
	}

	public JLabel getjLabel51() {
		return jLabel51;
	}

	public void setjLabel51(JLabel jLabel51) {
		this.jLabel51 = jLabel51;
	}

	public JLabel getjLabel52() {
		return jLabel52;
	}

	public void setjLabel52(JLabel jLabel52) {
		this.jLabel52 = jLabel52;
	}

	public JLabel getjLabel53() {
		return jLabel53;
	}

	public void setjLabel53(JLabel jLabel53) {
		this.jLabel53 = jLabel53;
	}

	public JLabel getjLabel54() {
		return jLabel54;
	}

	public void setjLabel54(JLabel jLabel54) {
		this.jLabel54 = jLabel54;
	}

	public JLabel getjLabel55() {
		return jLabel55;
	}

	public void setjLabel55(JLabel jLabel55) {
		this.jLabel55 = jLabel55;
	}

	public JLabel getjLabel56() {
		return jLabel56;
	}

	public void setjLabel56(JLabel jLabel56) {
		this.jLabel56 = jLabel56;
	}

	public JLabel getjLabel57() {
		return jLabel57;
	}

	public void setjLabel57(JLabel jLabel57) {
		this.jLabel57 = jLabel57;
	}

	public JLabel getjLabel58() {
		return jLabel58;
	}

	public void setjLabel58(JLabel jLabel58) {
		this.jLabel58 = jLabel58;
	}

	public JLabel getjLabel59() {
		return jLabel59;
	}

	public void setjLabel59(JLabel jLabel59) {
		this.jLabel59 = jLabel59;
	}

	public JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public JLabel getjLabel60() {
		return jLabel60;
	}

	public void setjLabel60(JLabel jLabel60) {
		this.jLabel60 = jLabel60;
	}

	public JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public JLabel getjLabel8() {
		return jLabel8;
	}

	public void setjLabel8(JLabel jLabel8) {
		this.jLabel8 = jLabel8;
	}

	public JLabel getjLabel9() {
		return jLabel9;
	}

	public void setjLabel9(JLabel jLabel9) {
		this.jLabel9 = jLabel9;
	}

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JPanel getjPanel10() {
		return jPanel10;
	}

	public void setjPanel10(javax.swing.JPanel jPanel10) {
		this.jPanel10 = jPanel10;
	}

	public javax.swing.JPanel getjPanel11() {
		return pnlAmostrados;
	}

	public void setjPanel11(javax.swing.JPanel jPanel11) {
		this.pnlAmostrados = jPanel11;
	}

	public javax.swing.JPanel getjPanel12() {
		return pnlPesagem;
	}

	public void setjPanel12(javax.swing.JPanel jPanel12) {
		this.pnlPesagem = jPanel12;
	}

	public javax.swing.JPanel getjPanel13() {
		return jPanel13;
	}

	public void setjPanel13(javax.swing.JPanel jPanel13) {
		this.jPanel13 = jPanel13;
	}

	public javax.swing.JPanel getjPanel14() {
		return pnlEliminados;
	}

	public void setjPanel14(javax.swing.JPanel jPanel14) {
		this.pnlEliminados = jPanel14;
	}

	public javax.swing.JPanel getjPanel2() {
		return jPanel2;
	}

	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.jPanel2 = jPanel2;
	}

	public javax.swing.JPanel getjPanel3() {
		return pnlMortalidade;
	}

	public void setjPanel3(javax.swing.JPanel jPanel3) {
		this.pnlMortalidade = jPanel3;
	}

	public javax.swing.JPanel getjPanel4() {
		return pnlErros;
	}

	public void setjPanel4(javax.swing.JPanel jPanel4) {
		this.pnlErros = jPanel4;
	}

	public javax.swing.JPanel getjPanel43() {
		return jPanel43;
	}

	public void setjPanel43(javax.swing.JPanel jPanel43) {
		this.jPanel43 = jPanel43;
	}

	public javax.swing.JPanel getjPanel5() {
		return jPanel5;
	}

	public void setjPanel5(javax.swing.JPanel jPanel5) {
		this.jPanel5 = jPanel5;
	}

	public javax.swing.JPanel getjPanel7() {
		return jPanel7;
	}

	public void setjPanel7(javax.swing.JPanel jPanel7) {
		this.jPanel7 = jPanel7;
	}

	public javax.swing.JPanel getjPanel8() {
		return jPanel8;
	}

	public void setjPanel8(javax.swing.JPanel jPanel8) {
		this.jPanel8 = jPanel8;
	}

	public javax.swing.JPanel getjPanel9() {
		return jPanel9;
	}

	public void setjPanel9(javax.swing.JPanel jPanel9) {
		this.jPanel9 = jPanel9;
	}

	public javax.swing.JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public JLabel getOrdemAmHist1Label() {
		return ordemAmHist1Label;
	}

	public void setOrdemAmHist1Label(JLabel ordemAmHist1Label) {
		this.ordemAmHist1Label = ordemAmHist1Label;
	}

	public JLabel getOrdemAmHist2Label() {
		return ordemAmHist2Label;
	}

	public void setOrdemAmHist2Label(JLabel ordemAmHist2Label) {
		this.ordemAmHist2Label = ordemAmHist2Label;
	}

	public JLabel getOrdemAmHist3Label() {
		return ordemAmHist3Label;
	}

	public void setOrdemAmHist3Label(JLabel ordemAmHist3Label) {
		this.ordemAmHist3Label = ordemAmHist3Label;
	}

	public JLabel getOrdemAmHist5Label() {
		return ordemAmHist5Label;
	}

	public void setOrdemAmHist5Label(JLabel ordemAmHist5Label) {
		this.ordemAmHist5Label = ordemAmHist5Label;
	}

	public JLabel getOrdemElHist1Label() {
		return ordemElHist1Label;
	}

	public void setOrdemElHist1Label(JLabel ordemElHist1Label) {
		this.ordemElHist1Label = ordemElHist1Label;
	}

	public JLabel getOrdemElHist2Label() {
		return ordemElHist2Label;
	}

	public void setOrdemElHist2Label(JLabel ordemElHist2Label) {
		this.ordemElHist2Label = ordemElHist2Label;
	}

	public JLabel getOrdemElHist3Label() {
		return ordemElHist3Label;
	}

	public void setOrdemElHist3Label(JLabel ordemElHist3Label) {
		this.ordemElHist3Label = ordemElHist3Label;
	}

	public JLabel getOrdemElHist4Label() {
		return ordemElHist4Label;
	}

	public void setOrdemElHist4Label(JLabel ordemElHist4Label) {
		this.ordemElHist4Label = ordemElHist4Label;
	}

	public JLabel getOrdemElHist5Label() {
		return ordemElHist5Label;
	}

	public void setOrdemElHist5Label(JLabel ordemElHist5Label) {
		this.ordemElHist5Label = ordemElHist5Label;
	}

	public JLabel getOrdemErHist1Label() {
		return ordemErHist1Label;
	}

	public void setOrdemErHist1Label(JLabel ordemErHist1Label) {
		this.ordemErHist1Label = ordemErHist1Label;
	}

	public JLabel getOrdemErHist2Label() {
		return ordemErHist2Label;
	}

	public void setOrdemErHist2Label(JLabel ordemErHist2Label) {
		this.ordemErHist2Label = ordemErHist2Label;
	}

	public JLabel getOrdemErHist3Label() {
		return ordemErHist3Label;
	}

	public void setOrdemErHist3Label(JLabel ordemErHist3Label) {
		this.ordemErHist3Label = ordemErHist3Label;
	}

	public JLabel getOrdemErHist5Label() {
		return ordemErHist5Label;
	}

	public void setOrdemErHist5Label(JLabel ordemErHist5Label) {
		this.ordemErHist5Label = ordemErHist5Label;
	}

	public JLabel getOrdemHist1Label() {
		return ordemHist1Label;
	}

	public void setOrdemHist1Label(JLabel ordemHist1Label) {
		this.ordemHist1Label = ordemHist1Label;
	}

	public JLabel getOrdemHist2Label() {
		return ordemHist2Label;
	}

	public void setOrdemHist2Label(JLabel ordemHist2Label) {
		this.ordemHist2Label = ordemHist2Label;
	}

	public JLabel getOrdemHist3Label() {
		return ordemHist3Label;
	}

	public void setOrdemHist3Label(JLabel ordemHist3Label) {
		this.ordemHist3Label = ordemHist3Label;
	}

	public JLabel getOrdemHist4Label() {
		return ordemHist4Label;
	}

	public void setOrdemHist4Label(JLabel ordemHist4Label) {
		this.ordemHist4Label = ordemHist4Label;
	}

	public JLabel getOrdemHist5Label() {
		return ordemHist5Label;
	}

	public void setOrdemHist5Label(JLabel ordemHist5Label) {
		this.ordemHist5Label = ordemHist5Label;
	}

	public JLabel getOrdemPHist1Label() {
		return ordemMortalidadeHist1Label;
	}

	public void setOrdemPHist1Label(JLabel ordemPHist1Label) {
		this.ordemMortalidadeHist1Label = ordemPHist1Label;
	}

	public JLabel getOrdemPHist2Label() {
		return ordemMortalidadeHist2Label;
	}

	public void setOrdemPHist2Label(JLabel ordemPHist2Label) {
		this.ordemMortalidadeHist2Label = ordemPHist2Label;
	}

	public JLabel getOrdemPHist3Label() {
		return ordemMortalidadeHist3Label;
	}

	public void setOrdemPHist3Label(JLabel ordemPHist3Label) {
		this.ordemMortalidadeHist3Label = ordemPHist3Label;
	}

	public JLabel getOrdemPHist5Label() {
		return ordemMortalidadeHist5Label;
	}

	public void setOrdemPHist5Label(JLabel ordemPHist5Label) {
		this.ordemMortalidadeHist5Label = ordemPHist5Label;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT() {
		return ordemMortalidadeJFT;
	}

	public void setOrdemPJFT(javax.swing.JFormattedTextField ordemPJFT) {
		this.ordemMortalidadeJFT = ordemPJFT;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT2() {
		return ordemErrosJFT;
	}

	public void setOrdemPJFT2(javax.swing.JFormattedTextField ordemPJFT2) {
		this.ordemErrosJFT = ordemPJFT2;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT3() {
		return ordemAmostradosJFT;
	}

	public void setOrdemPJFT3(javax.swing.JFormattedTextField ordemPJFT3) {
		this.ordemAmostradosJFT = ordemPJFT3;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT4() {
		return ordemPesadosJFT;
	}

	public void setOrdemPJFT4(javax.swing.JFormattedTextField ordemPJFT4) {
		this.ordemPesadosJFT = ordemPJFT4;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT5() {
		return ordemEliminadosJFT;
	}

	public void setOrdemPJFT5(javax.swing.JFormattedTextField ordemPJFT5) {
		this.ordemEliminadosJFT = ordemPJFT5;
	}

	public JLabel getOrdemPesagemHist1Label() {
		return ordemPesadosHist1Label;
	}

	public void setOrdemPesagemHist1Label(JLabel ordemPesagemHist1Label) {
		this.ordemPesadosHist1Label = ordemPesagemHist1Label;
	}

	public JLabel getOrdemPesagemHist2Label() {
		return ordemPesadosHist2Label;
	}

	public void setOrdemPesagemHist2Label(JLabel ordemPesagemHist2Label) {
		this.ordemPesadosHist2Label = ordemPesagemHist2Label;
	}

	public JLabel getOrdemPesagemHist3Label() {
		return ordemPesadosHist3Label;
	}

	public void setOrdemPesagemHist3Label(JLabel ordemPesagemHist3Label) {
		this.ordemPesadosHist3Label = ordemPesagemHist3Label;
	}

	public JLabel getOrdemPesagemHist5Label() {
		return ordemPesadosHist5Label;
	}

	public void setOrdemPesagemHist5Label(JLabel ordemPesagemHist5Label) {
		this.ordemPesadosHist5Label = ordemPesagemHist5Label;
	}

	public JLabel getOredmAmHist4Label() {
		return ordemAmHist4Label;
	}

	public void setOredmAmHist4Label(JLabel oredmAmHist4Label) {
		this.ordemAmHist4Label = oredmAmHist4Label;
	}

	public JLabel getOredmErHist4Label() {
		return ordemErHist4Label;
	}

	public void setOredmErHist4Label(JLabel oredmErHist4Label) {
		this.ordemErHist4Label = oredmErHist4Label;
	}

	public JLabel getOredmPHist4Label() {
		return ordemMortalidadeHist4Label;
	}

	public void setOredmPHist4Label(JLabel oredmPHist4Label) {
		this.ordemMortalidadeHist4Label = oredmPHist4Label;
	}

	public JLabel getOredmPesagemHist4Label() {
		return ordemPesadosHist4Label;
	}

	public void setOredmPesagemHist4Label(JLabel oredmPesagemHist4Label) {
		this.ordemPesadosHist4Label = oredmPesagemHist4Label;
	}

	public void setAvesAlojadasJFT(javax.swing.JFormattedTextField avesAlojadasJFT) {
		this.avesAlojadasJFT = avesAlojadasJFT;
	}

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.aviarioJFT = aviarioJFT;
	}

	public void setBaiaJFT(javax.swing.JFormattedTextField baiaJFT) {
		this.baiaJFT = baiaJFT;
	}

	public void setBaiaJP(javax.swing.JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	public void setConsumoJP(javax.swing.JPanel consumoJP) {
		this.consumoJP = consumoJP;
	}

	public void setControleBaiaJFT(javax.swing.JFormattedTextField controleBaiaJFT) {
		this.controleBaiaJFT = controleBaiaJFT;
	}

	public void setFaseConsumoLabel(JLabel faseConsumoLabel) {
		this.faseConsumoLabel = faseConsumoLabel;
	}

	public void setFornecidaHist1Label(JLabel fornecidaHist1Label) {
		this.fornecidaHist1Label = fornecidaHist1Label;
	}

	public void setFornecidaHist2Label(JLabel fornecidaHist2Label) {
		this.fornecidaHist2Label = fornecidaHist2Label;
	}

	public void setFornecidaHist3Label(JLabel fornecidaHist3Label) {
		this.fornecidaHist3Label = fornecidaHist3Label;
	}

	public void setFornecidaHist4Label(JLabel fornecidaHist4Label) {
		this.fornecidaHist4Label = fornecidaHist4Label;
	}

	public void setFornecidaHist5Label(JLabel fornecidaHist5Label) {
		this.fornecidaHist5Label = fornecidaHist5Label;
	}

	public void setFornecidaJFT(javax.swing.JFormattedTextField fornecidaJFT) {
		this.fornecidaJFT = fornecidaJFT;
	}

	public void setLadoJFT(javax.swing.JFormattedTextField ladoJFT) {
		this.ladoJFT = ladoJFT;
	}

	public void setLinhagemJFT(javax.swing.JFormattedTextField linhagemJFT) {
		this.linhagemJFT = linhagemJFT;
	}

	public void setNrAmHist1Label(JLabel nrAmHist1Label) {
		this.nrAmHist1Label = nrAmHist1Label;
	}

	public void setNrAmHist2Label(JLabel nrAmHist2Label) {
		this.nrAmHist2Label = nrAmHist2Label;
	}

	public void setNrAmHist3Label(JLabel nrAmHist3Label) {
		this.nrAmHist3Label = nrAmHist3Label;
	}

	public void setNrAmHist4Label(JLabel nrAmHist4Label) {
		this.nrAmHist4Label = nrAmHist4Label;
	}

	public void setNrAmHist5Label(JLabel nrAmHist5Label) {
		this.nrAmHist5Label = nrAmHist5Label;
	}

	public void setNrAmostradosJFT(javax.swing.JFormattedTextField nrAmostradosJFT) {
		this.nrAmostradosJFT = nrAmostradosJFT;
	}

	public void setNrElHist1Label(JLabel nrElHist1Label) {
		this.nrElHist1Label = nrElHist1Label;
	}

	public void setNrElHist2Label(JLabel nrElHist2Label) {
		this.nrElHist2Label = nrElHist2Label;
	}

	public void setNrElHist3Label(JLabel nrElHist3Label) {
		this.nrElHist3Label = nrElHist3Label;
	}

	public void setNrElHist4Label(JLabel nrElHist4Label) {
		this.nrElHist4Label = nrElHist4Label;
	}

	public void setNrElHist5Label(JLabel nrElHist5Label) {
		this.nrElHist5Label = nrElHist5Label;
	}

	public void setNrEliminadosJFT(javax.swing.JFormattedTextField nrEliminadosJFT) {
		this.nrEliminadosJFT = nrEliminadosJFT;
	}

	public void setNrErHist1Label(JLabel nrErHist1Label) {
		this.nrErHist1Label = nrErHist1Label;
	}

	public void setNrErHist2Label(JLabel nrErHist2Label) {
		this.nrErHist2Label = nrErHist2Label;
	}

	public void setNrErHist3Label(JLabel nrErHist3Label) {
		this.nrErHist3Label = nrErHist3Label;
	}

	public void setNrErHist4Label(JLabel nrErHist4Label) {
		this.nrErHist4Label = nrErHist4Label;
	}

	public void setNrErHist5Label(JLabel nrErHist5Label) {
		this.nrErHist5Label = nrErHist5Label;
	}

	public void setNrErrosJFT(javax.swing.JFormattedTextField nrErrosJFT) {
		this.nrErrosJFT = nrErrosJFT;
	}

	public void setNrMHist1Label(JLabel nrMHist1Label) {
		this.nrMHist1Label = nrMHist1Label;
	}

	public void setNrMHist2Label(JLabel nrMHist2Label) {
		this.nrMHist2Label = nrMHist2Label;
	}

	public void setNrMHist3Label(JLabel nrMHist3Label) {
		this.nrMHist3Label = nrMHist3Label;
	}

	public void setNrMHist4Label(JLabel nrMHist4Label) {
		this.nrMHist4Label = nrMHist4Label;
	}

	public void setNrMHist5Label(JLabel nrMHist5Label) {
		this.nrMHist5Label = nrMHist5Label;
	}

	public void setNrMortalidadeJFT(javax.swing.JFormattedTextField nrMortalidadeJFT) {
		this.nrMortalidadeJFT = nrMortalidadeJFT;
	}

	public void setNrPesadosHist1Label(JLabel nrPesadosHist1Label) {
		this.nrPesadosHist1Label = nrPesadosHist1Label;
	}

	public void setNrPesadosHist2Label(JLabel nrPesadosHist2Label) {
		this.nrPesadosHist2Label = nrPesadosHist2Label;
	}

	public void setNrPesadosHist3Label(JLabel nrPesadosHist3Label) {
		this.nrPesadosHist3Label = nrPesadosHist3Label;
	}

	public void setNrPesadosHist4Label(JLabel nrPesadosHist4Label) {
		this.nrPesadosHist4Label = nrPesadosHist4Label;
	}

	public void setNrPesadosHist5Label(JLabel nrPesadosHist5Label) {
		this.nrPesadosHist5Label = nrPesadosHist5Label;
	}

	public void setNrPesadosJFT(javax.swing.JFormattedTextField nrPesadosJFT) {
		this.nrPesadosJFT = nrPesadosJFT;
	}

	public void setPesadosHist1Label(JLabel pesadosHist1Label) {
		this.pesadosHist1Label = pesadosHist1Label;
	}

	public void setPesadosHist2Label(JLabel pesadosHist2Label) {
		this.pesadosHist2Label = pesadosHist2Label;
	}

	public void setPesadosHist3Label(JLabel pesadosHist3Label) {
		this.pesadosHist3Label = pesadosHist3Label;
	}

	public void setPesadosHist4Label(JLabel pesadosHist4Label) {
		this.pesadosHist4Label = pesadosHist4Label;
	}

	public void setPesadosHist5Label(JLabel pesadosHist5Label) {
		this.pesadosHist5Label = pesadosHist5Label;
	}

	public void setPesadosJFT(javax.swing.JFormattedTextField pesadosJFT) {
		this.pesadosJFT = pesadosJFT;
	}

	public void setPesagemJP(javax.swing.JPanel pesagemJP) {
		this.pesagemJP = pesagemJP;
	}

	public void setPesoAmHist1Label(JLabel pesoAmHist1Label) {
		this.pesoAmHist1Label = pesoAmHist1Label;
	}

	public void setPesoAmHist2Label(JLabel pesoAmHist2Label) {
		this.pesoAmHist2Label = pesoAmHist2Label;
	}

	public void setPesoAmHist3Label(JLabel pesoAmHist3Label) {
		this.pesoAmHist3Label = pesoAmHist3Label;
	}

	public void setPesoAmHist4Label(JLabel pesoAmHist4Label) {
		this.pesoAmHist4Label = pesoAmHist4Label;
	}

	public void setPesoAmHist5Label(JLabel pesoAmHist5Label) {
		this.pesoAmHist5Label = pesoAmHist5Label;
	}

	public void setPesoAmostradosJFT(javax.swing.JFormattedTextField pesoAmostradosJFT) {
		this.pesoAmostradosJFT = pesoAmostradosJFT;
	}

	public void setPesoElHist1Label(JLabel pesoElHist1Label) {
		this.pesoElHist1Label = pesoElHist1Label;
	}

	public void setPesoElHist2Label(JLabel pesoElHist2Label) {
		this.pesoElHist2Label = pesoElHist2Label;
	}

	public void setPesoElHist3Label(JLabel pesoElHist3Label) {
		this.pesoElHist3Label = pesoElHist3Label;
	}

	public void setPesoElHist4Label(JLabel pesoElHist4Label) {
		this.pesoElHist4Label = pesoElHist4Label;
	}

	public void setPesoElHist5Label(JLabel pesoElHist5Label) {
		this.pesoElHist5Label = pesoElHist5Label;
	}

	public void setPesoEliminadosJFT(javax.swing.JFormattedTextField pesoEliminadosJFT) {
		this.pesoEliminadosJFT = pesoEliminadosJFT;
	}

	public void setPesoErHist1Label(JLabel pesoErHist1Label) {
		this.pesoErHist1Label = pesoErHist1Label;
	}

	public void setPesoErHist2Label(JLabel pesoErHist2Label) {
		this.pesoErHist2Label = pesoErHist2Label;
	}

	public void setPesoErHist3Label(JLabel pesoErHist3Label) {
		this.pesoErHist3Label = pesoErHist3Label;
	}

	public void setPesoErHist4Label(JLabel pesoErHist4Label) {
		this.pesoErHist4Label = pesoErHist4Label;
	}

	public void setPesoErHist5Label(JLabel pesoErHist5Label) {
		this.pesoErHist5Label = pesoErHist5Label;
	}

	public void setPesoErrosJFT(javax.swing.JFormattedTextField pesoErrosJFT) {
		this.pesoErrosJFT = pesoErrosJFT;
	}

	public void setPesoMHist1Label(JLabel pesoMHist1Label) {
		this.pesoMHist1Label = pesoMHist1Label;
	}

	public void setPesoMHist2Label(JLabel pesoMHist2Label) {
		this.pesoMHist2Label = pesoMHist2Label;
	}

	public void setPesoMHist3Label(JLabel pesoMHist3Label) {
		this.pesoMHist3Label = pesoMHist3Label;
	}

	public void setPesoMHist4Label(JLabel pesoMHist4Label) {
		this.pesoMHist4Label = pesoMHist4Label;
	}

	public void setPesoMHist5Label(JLabel pesoMHist5Label) {
		this.pesoMHist5Label = pesoMHist5Label;
	}

	public void setRegistroLabel(JLabel registroLabel) {
		this.registroLabel = registroLabel;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public void setSobraHist1Label(JLabel sobraHist1Label) {
		this.sobraHist1Label = sobraHist1Label;
	}

	public void setSobraHist2Label(JLabel sobraHist2Label) {
		this.sobraHist2Label = sobraHist2Label;
	}

	public void setSobraHist3Label(JLabel sobraHist3Label) {
		this.sobraHist3Label = sobraHist3Label;
	}

	public void setSobraHist4Label(JLabel sobraHist4Label) {
		this.sobraHist4Label = sobraHist4Label;
	}

	public void setSobraHist5Label(JLabel sobraHist5Label) {
		this.sobraHist5Label = sobraHist5Label;
	}

	public void setSobraJFT(javax.swing.JFormattedTextField sobraJFT) {
		this.sobraJFT = sobraJFT;
	}

	public void setTrataJFT(javax.swing.JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}

	public javax.swing.JPanel getPnlAmostrados() {
		return pnlAmostrados;
	}

	public void setPnlAmostrados(javax.swing.JPanel pnlAmostrados) {
		this.pnlAmostrados = pnlAmostrados;
	}

	public javax.swing.JPanel getPnlPesagem() {
		return pnlPesagem;
	}

	public void setPnlPesagem(javax.swing.JPanel pnlPesagem) {
		this.pnlPesagem = pnlPesagem;
	}

	public javax.swing.JPanel getPnlEliminados() {
		return pnlEliminados;
	}

	public void setPnlEliminados(javax.swing.JPanel pnlEliminados) {
		this.pnlEliminados = pnlEliminados;
	}

	public javax.swing.JPanel getPnlMortalidade() {
		return pnlMortalidade;
	}

	public void setPnlMortalidade(javax.swing.JPanel pnlMortalidade) {
		this.pnlMortalidade = pnlMortalidade;
	}

	public javax.swing.JPanel getPnlErros() {
		return pnlErros;
	}

	public void setPnlErros(javax.swing.JPanel pnlErros) {
		this.pnlErros = pnlErros;
	}

	public JLabel getOrdemPHist4Label() {
		return ordemMortalidadeHist4Label;
	}

	public void setOrdemPHist4Label(JLabel ordemPHist4Label) {
		this.ordemMortalidadeHist4Label = ordemPHist4Label;
	}

	public JFormattedTextField getIdadeJFT() {
		return idadeJFT_2;
	}

	public void setIdadeJFT(JFormattedTextField idadeJFT) {
		this.idadeJFT_2 = idadeJFT;
	}

	public JFormattedTextField getOrdemJFT() {
		return ordemJFT_1;
	}

	public void setOrdemJFT(JFormattedTextField ordemJFT) {
		this.ordemJFT_1 = ordemJFT;
	}

	public JFormattedTextField getIdadeJFT_1() {
		return idadeJFT_2;
	}

	public void setIdadeJFT_1(JFormattedTextField idadeJFT_1) {
		this.idadeJFT_2 = idadeJFT_1;
	}

	public javax.swing.JFormattedTextField getControleBaiaJFT() {
		return controleBaiaJFT;
	}

	public JLabel getFaseConsumoLabel() {
		return faseConsumoLabel;
	}

	public JLabel getFornecidaHist1Label() {
		return fornecidaHist1Label;
	}

	public JLabel getFornecidaHist2Label() {
		return fornecidaHist2Label;
	}

	public JLabel getFornecidaHist3Label() {
		return fornecidaHist3Label;
	}

	public JLabel getFornecidaHist4Label() {
		return fornecidaHist4Label;
	}

	public JLabel getFornecidaHist5Label() {
		return fornecidaHist5Label;
	}

	public javax.swing.JFormattedTextField getFornecidaJFT() {
		return fornecidaJFT;
	}

	public javax.swing.JFormattedTextField getLadoJFT() {
		return ladoJFT;
	}

	public javax.swing.JFormattedTextField getLinhagemJFT() {
		return linhagemJFT;
	}

	public JLabel getNrAmHist1Label() {
		return nrAmHist1Label;
	}

	public JLabel getNrAmHist2Label() {
		return nrAmHist2Label;
	}

	public JLabel getNrAmHist3Label() {
		return nrAmHist3Label;
	}

	public JLabel getNrAmHist4Label() {
		return nrAmHist4Label;
	}

	public JLabel getNrAmHist5Label() {
		return nrAmHist5Label;
	}

	public javax.swing.JFormattedTextField getNrAmostradosJFT() {
		return nrAmostradosJFT;
	}

	public JLabel getNrElHist1Label() {
		return nrElHist1Label;
	}

	public JLabel getNrElHist2Label() {
		return nrElHist2Label;
	}

	public JLabel getNrElHist3Label() {
		return nrElHist3Label;
	}

	public JLabel getNrElHist4Label() {
		return nrElHist4Label;
	}

	public JLabel getNrElHist5Label() {
		return nrElHist5Label;
	}

	public javax.swing.JFormattedTextField getNrEliminadosJFT() {
		return nrEliminadosJFT;
	}

	public JLabel getNrErHist1Label() {
		return nrErHist1Label;
	}

	public JLabel getNrErHist2Label() {
		return nrErHist2Label;
	}

	public JLabel getNrErHist3Label() {
		return nrErHist3Label;
	}

	public JLabel getNrErHist4Label() {
		return nrErHist4Label;
	}

	public JLabel getNrErHist5Label() {
		return nrErHist5Label;
	}

	public javax.swing.JFormattedTextField getNrErrosJFT() {
		return nrErrosJFT;
	}

	public JLabel getNrMHist1Label() {
		return nrMHist1Label;
	}

	public JLabel getNrMHist2Label() {
		return nrMHist2Label;
	}

	public JLabel getNrMHist3Label() {
		return nrMHist3Label;
	}

	public JLabel getNrMHist4Label() {
		return nrMHist4Label;
	}

	public JLabel getNrMHist5Label() {
		return nrMHist5Label;
	}

	public javax.swing.JFormattedTextField getNrMortalidadeJFT() {
		return nrMortalidadeJFT;
	}

	public JLabel getNrPesadosHist1Label() {
		return nrPesadosHist1Label;
	}

	public JLabel getNrPesadosHist2Label() {
		return nrPesadosHist2Label;
	}

	public JLabel getNrPesadosHist3Label() {
		return nrPesadosHist3Label;
	}

	public JLabel getNrPesadosHist4Label() {
		return nrPesadosHist4Label;
	}

	public JLabel getNrPesadosHist5Label() {
		return nrPesadosHist5Label;
	}

	public javax.swing.JFormattedTextField getNrPesadosJFT() {
		return nrPesadosJFT;
	}

	public JLabel getPesadosHist1Label() {
		return pesadosHist1Label;
	}

	public JLabel getPesadosHist2Label() {
		return pesadosHist2Label;
	}

	public JLabel getPesadosHist3Label() {
		return pesadosHist3Label;
	}

	public JLabel getPesadosHist4Label() {
		return pesadosHist4Label;
	}

	public JLabel getPesadosHist5Label() {
		return pesadosHist5Label;
	}

	public javax.swing.JFormattedTextField getPesadosJFT() {
		return pesadosJFT;
	}

	public javax.swing.JPanel getPesagemJP() {
		return pesagemJP;
	}

	public JLabel getPesoAmHist1Label() {
		return pesoAmHist1Label;
	}

	public JLabel getPesoAmHist2Label() {
		return pesoAmHist2Label;
	}

	public JLabel getPesoAmHist3Label() {
		return pesoAmHist3Label;
	}

	public JLabel getPesoAmHist4Label() {
		return pesoAmHist4Label;
	}

	public JLabel getPesoAmHist5Label() {
		return pesoAmHist5Label;
	}

	public javax.swing.JFormattedTextField getPesoAmostradosJFT() {
		return pesoAmostradosJFT;
	}

	public JLabel getPesoElHist1Label() {
		return pesoElHist1Label;
	}

	public JLabel getPesoElHist2Label() {
		return pesoElHist2Label;
	}

	public JLabel getPesoElHist3Label() {
		return pesoElHist3Label;
	}

	public JLabel getPesoElHist4Label() {
		return pesoElHist4Label;
	}

	public JLabel getPesoElHist5Label() {
		return pesoElHist5Label;
	}

	public javax.swing.JFormattedTextField JFT() {
		return pesoEliminadosJFT;
	}

	public JLabel getPesoErHist1Label() {
		return pesoErHist1Label;
	}

	public JLabel getPesoErHist2Label() {
		return pesoErHist2Label;
	}

	public JLabel getPesoErHist3Label() {
		return pesoErHist3Label;
	}

	public JLabel getPesoErHist4Label() {
		return pesoErHist4Label;
	}

	public JLabel getPesoErHist5Label() {
		return pesoErHist5Label;
	}

	public javax.swing.JFormattedTextField getPesoErrosJFT() {
		return pesoErrosJFT;
	}

	public JLabel getPesoMHist1Label() {
		return pesoMHist1Label;
	}

	public JLabel getPesoMHist2Label() {
		return pesoMHist2Label;
	}

	public JLabel getPesoMHist3Label() {
		return pesoMHist3Label;
	}

	public JLabel getPesoMHist4Label() {
		return pesoMHist4Label;
	}

	public JLabel getPesoMHist5Label() {
		return pesoMHist5Label;
	}

	public JLabel getRegistroLabel() {
		return registroLabel;
	}

	public javax.swing.JFormattedTextField getSexoJFT() {
		return sexoJFT;
	}

	public JLabel getSobraHist1Label() {
		return sobraHist1Label;
	}

	public JLabel getSobraHist2Label() {
		return sobraHist2Label;
	}

	public JLabel getSobraHist3Label() {
		return sobraHist3Label;
	}

	public JLabel getSobraHist4Label() {
		return sobraHist4Label;
	}

	public JLabel getSobraHist5Label() {
		return sobraHist5Label;
	}

	public javax.swing.JFormattedTextField getSobraJFT() {
		return sobraJFT;
	}

	public javax.swing.JFormattedTextField getTrataJFT() {
		return trataJFT;
	}

	public javax.swing.JFormattedTextField getAvesAlojadasJFT() {
		return avesAlojadasJFT;
	}

	public javax.swing.JFormattedTextField getAviarioJFT() {
		return aviarioJFT;
	}

	public javax.swing.JFormattedTextField getBaiaJFT() {
		return baiaJFT;
	}

	public javax.swing.JPanel getBaiaJP() {
		return baiaJP;
	}

	public javax.swing.JPanel getConsumoJP() {
		return consumoJP;
	}

	public JFormattedTextField getPesoMortalidadeJFT() {
		return pesoMortalidadeJFT;
	}

	public void setPesoMortalidadeJFT(JFormattedTextField pesoMortalidadeJFT) {
		this.pesoMortalidadeJFT = pesoMortalidadeJFT;
	}

	public JFormattedTextField getControleMort() {
		return controleMortalidadeJFT;
	}

	public void setControleMort(JFormattedTextField controleMort) {
		this.controleMortalidadeJFT = controleMort;
	}

	public JLabel getOrdemMortalidadeHist1Label() {
		return ordemMortalidadeHist1Label;
	}

	public void setOrdemMortalidadeHist1Label(JLabel ordemMortalidadeHist1Label) {
		this.ordemMortalidadeHist1Label = ordemMortalidadeHist1Label;
	}

	public JLabel getOrdemMortalidadeHist2Label() {
		return ordemMortalidadeHist2Label;
	}

	public void setOrdemMortalidadeHist2Label(JLabel ordemMortalidadeHist2Label) {
		this.ordemMortalidadeHist2Label = ordemMortalidadeHist2Label;
	}

	public JLabel getOrdemMortalidadeHist3Label() {
		return ordemMortalidadeHist3Label;
	}

	public void setOrdemMortalidadeHist3Label(JLabel ordemMortalidadeHist3Label) {
		this.ordemMortalidadeHist3Label = ordemMortalidadeHist3Label;
	}

	public JLabel getOrdemMortalidadeHist5Label() {
		return ordemMortalidadeHist5Label;
	}

	public void setOrdemMortalidadeHist5Label(JLabel ordemMortalidadeHist5Label) {
		this.ordemMortalidadeHist5Label = ordemMortalidadeHist5Label;
	}

	public javax.swing.JFormattedTextField getOrdemMortalidadeJFT() {
		return ordemMortalidadeJFT;
	}

	public void setOrdemMortalidadeJFT(javax.swing.JFormattedTextField ordemMortalidadeJFT) {
		this.ordemMortalidadeJFT = ordemMortalidadeJFT;
	}

	public javax.swing.JFormattedTextField getOrdemErrosJFT() {
		return ordemErrosJFT;
	}

	public void setOrdemErrosJFT(javax.swing.JFormattedTextField ordemErrosJFT) {
		this.ordemErrosJFT = ordemErrosJFT;
	}

	public javax.swing.JFormattedTextField getOrdemAmostradosJFT() {
		return ordemAmostradosJFT;
	}

	public void setOrdemAmostradosJFT(javax.swing.JFormattedTextField ordemAmostradosJFT) {
		this.ordemAmostradosJFT = ordemAmostradosJFT;
	}

	public javax.swing.JFormattedTextField getOrdemPesagemJFT() {
		return ordemPesadosJFT;
	}

	public void setOrdemPesagemJFT(javax.swing.JFormattedTextField ordemPesagemJFT) {
		this.ordemPesadosJFT = ordemPesagemJFT;
	}

	public javax.swing.JFormattedTextField getOrdemEliminadosJFT() {
		return ordemEliminadosJFT;
	}

	public void setOrdemEliminadosJFT(javax.swing.JFormattedTextField ordemEliminadosJFT) {
		this.ordemEliminadosJFT = ordemEliminadosJFT;
	}

	public JLabel getOrdemMortalidadeHist4Label() {
		return ordemMortalidadeHist4Label;
	}

	public void setOrdemMortalidadeHist4Label(JLabel ordemMortalidadeHist4Label) {
		this.ordemMortalidadeHist4Label = ordemMortalidadeHist4Label;
	}

	public JFormattedTextField getIdadeJFT_2() {
		return idadeJFT_2;
	}

	public void setIdadeJFT_2(JFormattedTextField idadeJFT_2) {
		this.idadeJFT_2 = idadeJFT_2;
	}

	public JFormattedTextField getOrdemJFT_1() {
		return ordemJFT_1;
	}

	public void setOrdemJFT_1(JFormattedTextField ordemJFT_1) {
		this.ordemJFT_1 = ordemJFT_1;
	}

	public JFormattedTextField getControleMortalidadeJFT() {
		return controleMortalidadeJFT;
	}

	public void setControleMortalidadeJFT(JFormattedTextField controleMortalidadeJFT) {
		this.controleMortalidadeJFT = controleMortalidadeJFT;
	}

	public JLabel getOrdemPesagemHist4Label() {
		return ordemPesadosHist4Label;
	}

	public void setOrdemPesagemHist4Label(JLabel ordemPesagemHist4Label) {
		this.ordemPesadosHist4Label = ordemPesagemHist4Label;
	}

	public javax.swing.JFormattedTextField getPesoEliminadosJFT() {
		return pesoEliminadosJFT;
	}

	public JLabel getFaseMortalidadeLabel() {
		return faseMortalidadeLabel;
	}

	public void setFaseMortalidadeLabel(JLabel faseMortalidadeLabel) {
		this.faseMortalidadeLabel = faseMortalidadeLabel;
	}

	public JLabel getFaseEliminadosLabel() {
		return faseEliminadosLabel;
	}

	public void setFaseEliminadosLabel(JLabel faseEliminadosLabel) {
		this.faseEliminadosLabel = faseEliminadosLabel;
	}

	public JLabel getFaseErrosLabel() {
		return faseErrosLabel;
	}

	public void setFaseErrosLabel(JLabel faseErrosLabel) {
		this.faseErrosLabel = faseErrosLabel;
	}

	public JLabel getFaseAmostradosLabel() {
		return faseAmostradosLabel;
	}

	public void setFaseAmostradosLabel(JLabel faseAmostradosLabel) {
		this.faseAmostradosLabel = faseAmostradosLabel;
	}

	public JLabel getFasePesagemLabel() {
		return fasePesagemLabel;
	}

	public void setFasePesagemLabel(JLabel fasePesagemLabel) {
		this.fasePesagemLabel = fasePesagemLabel;
	}

	public JLabel getOrdemErHist4Label() {
		return ordemErHist4Label;
	}

	public void setOrdemErHist4Label(JLabel ordemErHist4Label) {
		this.ordemErHist4Label = ordemErHist4Label;
	}

	public JLabel getOrdemAmHist4Label() {
		return ordemAmHist4Label;
	}

	public void setOrdemAmHist4Label(JLabel ordemAmHist4Label) {
		this.ordemAmHist4Label = ordemAmHist4Label;
	}

	public javax.swing.JFormattedTextField getOrdemPesadosJFT() {
		return ordemPesadosJFT;
	}

	public void setOrdemPesadosJFT(javax.swing.JFormattedTextField ordemPesadosJFT) {
		this.ordemPesadosJFT = ordemPesadosJFT;
	}

	public JLabel getOrdemPesadosHist1Label() {
		return ordemPesadosHist1Label;
	}

	public void setOrdemPesadosHist1Label(JLabel ordemPesadosHist1Label) {
		this.ordemPesadosHist1Label = ordemPesadosHist1Label;
	}

	public JLabel getOrdemPesadosHist2Label() {
		return ordemPesadosHist2Label;
	}

	public void setOrdemPesadosHist2Label(JLabel ordemPesadosHist2Label) {
		this.ordemPesadosHist2Label = ordemPesadosHist2Label;
	}

	public JLabel getOrdemPesadosHist3Label() {
		return ordemPesadosHist3Label;
	}

	public void setOrdemPesadosHist3Label(JLabel ordemPesadosHist3Label) {
		this.ordemPesadosHist3Label = ordemPesadosHist3Label;
	}

	public JLabel getOrdemPesadosHist5Label() {
		return ordemPesadosHist5Label;
	}

	public void setOrdemPesadosHist5Label(JLabel ordemPesadosHist5Label) {
		this.ordemPesadosHist5Label = ordemPesadosHist5Label;
	}

	public JLabel getOrdemPesadosHist4Label() {
		return ordemPesadosHist4Label;
	}

	public void setOrdemPesadosHist4Label(JLabel ordemPesadosHist4Label) {
		this.ordemPesadosHist4Label = ordemPesadosHist4Label;
	}

}
