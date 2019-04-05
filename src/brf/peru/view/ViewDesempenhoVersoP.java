package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class ViewDesempenhoVersoP extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JFormattedTextField avesAlojadasJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JLabel eliminadosJP1;
	private javax.swing.JLabel faseMortalidadeLabel;
	private javax.swing.JLabel faseEliminadosLabel;
	private javax.swing.JLabel faseErrosLabel;
	private javax.swing.JLabel faseAmostradosLabel;
	private javax.swing.JLabel fasePesagemLabel;
	private javax.swing.JLabel idadeAmHist1Label;
	private javax.swing.JLabel idadeAmHist2Label;
	private javax.swing.JLabel idadeAmHist3Label;
	private javax.swing.JLabel idadeAmHist4Label;
	private javax.swing.JLabel idadeAmHist5Label;
	private javax.swing.JFormattedTextField idadeAmostradosJFT;
	private javax.swing.JLabel idadeElHist1Label;
	private javax.swing.JLabel idadeElHist2Label;
	private javax.swing.JLabel idadeElHist3Label;
	private javax.swing.JLabel idadeElHist4Label;
	private javax.swing.JLabel idadeElHist5Label;
	private javax.swing.JFormattedTextField idadeEliminadosJFT;
	private javax.swing.JLabel idadeErHist1Label;
	private javax.swing.JLabel idadeErHist2Label;
	private javax.swing.JLabel idadeErHist3Label;
	private javax.swing.JLabel idadeErHist4Label;
	private javax.swing.JLabel idadeErHist5Label;
	private javax.swing.JFormattedTextField idadeErrosJFT;
	private javax.swing.JLabel idadeMHist1Label;
	private javax.swing.JLabel idadeMHist2Label;
	private javax.swing.JLabel idadeMHist3Label;
	private javax.swing.JLabel idadeMHist4Label;
	private javax.swing.JLabel idadeMHist5Label;
	private javax.swing.JFormattedTextField idadeMortalidadeJFT;
	private javax.swing.JLabel idadePesadosHist1Label;
	private javax.swing.JLabel idadePesadosHist2Label;
	private javax.swing.JLabel idadePesadosHist3Label;
	private javax.swing.JLabel idadePesadosHist4Label;
	private javax.swing.JLabel idadePesadosHist5Label;
	private javax.swing.JFormattedTextField idadePesadosJFT;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel pnlAmostrados;
	private javax.swing.JPanel pnlPesagem;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel pnlEliminados;
	private javax.swing.JPanel pnlMortalidade;
	private javax.swing.JPanel pnlErros;
	private javax.swing.JPanel jPanel43;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JFormattedTextField ladoJFT;
	private javax.swing.JFormattedTextField linhagemJFT;
	private javax.swing.JLabel nrAmHist1Label;
	private javax.swing.JLabel nrAmHist2Label;
	private javax.swing.JLabel nrAmHist3Label;
	private javax.swing.JLabel nrAmHist4Label;
	private javax.swing.JLabel nrAmHist5Label;
	private javax.swing.JFormattedTextField nrAmostradosJFT;
	private javax.swing.JLabel nrElHist1Label;
	private javax.swing.JLabel nrElHist2Label;
	private javax.swing.JLabel nrElHist3Label;
	private javax.swing.JLabel nrElHist4Label;
	private javax.swing.JLabel nrElHist5Label;
	private javax.swing.JFormattedTextField nrEliminadosJFT;
	private javax.swing.JLabel nrErHist1Label;
	private javax.swing.JLabel nrErHist2Label;
	private javax.swing.JLabel nrErHist3Label;
	private javax.swing.JLabel nrErHist4Label;
	private javax.swing.JLabel nrErHist5Label;
	private javax.swing.JFormattedTextField nrErrosJFT;
	private javax.swing.JLabel nrMHist1Label;
	private javax.swing.JLabel nrMHist2Label;
	private javax.swing.JLabel nrMHist3Label;
	private javax.swing.JLabel nrMHist4Label;
	private javax.swing.JLabel nrMHist5Label;
	private javax.swing.JFormattedTextField nrMortalidadeJFT;
	private javax.swing.JLabel nrPesadosHist1Label;
	private javax.swing.JLabel nrPesadosHist2Label;
	private javax.swing.JLabel nrPesadosHist3Label;
	private javax.swing.JLabel nrPesadosHist4Label;
	private javax.swing.JLabel nrPesadosHist5Label;
	private javax.swing.JFormattedTextField nrPesadosJFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel ordemAmHist1Label;
	private javax.swing.JLabel ordemAmHist2Label;
	private javax.swing.JLabel ordemAmHist3Label;
	private javax.swing.JLabel ordemAmHist5Label;
	private javax.swing.JLabel ordemElHist1Label;
	private javax.swing.JLabel ordemElHist2Label;
	private javax.swing.JLabel ordemElHist3Label;
	private javax.swing.JLabel ordemElHist4Label;
	private javax.swing.JLabel ordemElHist5Label;
	private javax.swing.JLabel ordemErHist1Label;
	private javax.swing.JLabel ordemErHist2Label;
	private javax.swing.JLabel ordemErHist3Label;
	private javax.swing.JLabel ordemErHist5Label;
	private javax.swing.JLabel ordemMortalidadeHist1Label;
	private javax.swing.JLabel ordemMortalidadeHist2Label;
	private javax.swing.JLabel ordemMortalidadeHist3Label;
	private javax.swing.JLabel ordemMortalidadeHist5Label;
	private javax.swing.JFormattedTextField ordemMortalidadeJFT;
	private javax.swing.JFormattedTextField ordemErrosJFT;
	private javax.swing.JFormattedTextField ordemAmostradosJFT;
	private javax.swing.JFormattedTextField ordemPesagemJFT;
	private javax.swing.JFormattedTextField ordemEliminadosJFT;
	private javax.swing.JLabel ordemPesagemHist1Label;
	private javax.swing.JLabel ordemPesagemHist2Label;
	private javax.swing.JLabel ordemPesagemHist3Label;
	private javax.swing.JLabel ordemPesagemHist5Label;
	private javax.swing.JLabel ordemAmHist4Label;
	private javax.swing.JLabel ordemErHist4Label;
	private javax.swing.JLabel ordemMortalidadeHist4Label;
	private javax.swing.JLabel ordemPesagemHist4Label;
	private javax.swing.JLabel pesadosHist1Label;
	private javax.swing.JLabel pesadosHist2Label;
	private javax.swing.JLabel pesadosHist3Label;
	private javax.swing.JLabel pesadosHist4Label;
	private javax.swing.JLabel pesadosHist5Label;
	private javax.swing.JFormattedTextField pesadosJFT;
	private javax.swing.JPanel pesagemJP;
	private javax.swing.JLabel pesoAmHist1Label;
	private javax.swing.JLabel pesoAmHist2Label;
	private javax.swing.JLabel pesoAmHist3Label;
	private javax.swing.JLabel pesoAmHist4Label;
	private javax.swing.JLabel pesoAmHist5Label;
	private javax.swing.JFormattedTextField pesoAmostradosJFT;
	private javax.swing.JLabel pesoElHist1Label;
	private javax.swing.JLabel pesoElHist2Label;
	private javax.swing.JLabel pesoElHist3Label;
	private javax.swing.JLabel pesoElHist4Label;
	private javax.swing.JLabel pesoElHist5Label;
	private javax.swing.JFormattedTextField pesoEliminadosJFT;
	private javax.swing.JLabel pesoErHist1Label;
	private javax.swing.JLabel pesoErHist2Label;
	private javax.swing.JLabel pesoErHist3Label;
	private javax.swing.JLabel pesoErHist4Label;
	private javax.swing.JLabel pesoErHist5Label;
	private javax.swing.JFormattedTextField pesoErrosJFT;
	private javax.swing.JLabel pesoMHist1Label;
	private javax.swing.JLabel pesoMHist2Label;
	private javax.swing.JLabel pesoMHist3Label;
	private javax.swing.JLabel pesoMHist4Label;
	private javax.swing.JLabel pesoMHist5Label;
	private javax.swing.JFormattedTextField pesoMortalidadeJFT;
	private javax.swing.JLabel registroLabel;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JFormattedTextField trataJFT;
//	private javax.swing.JFormattedTextField controleMortalidadeJFT;
//	private javax.swing.JFormattedTextField controleEliminadosJFT;
//	private javax.swing.JFormattedTextField controleErrosJFT;
//	private javax.swing.JFormattedTextField controleAmostradosJFT;
//	private javax.swing.JFormattedTextField controlePesagemJFT;
	private JFormattedTextField controleMortalidadeJFT;
	private JFormattedTextField controleEliminadosJFT;
	private JFormattedTextField controleErrosJFT;
	private JFormattedTextField controleAmostradosJFT;
	private JFormattedTextField controlePesagemJFT;

	/**
	 * Creates new form ViewDesempenhoP
	 */
	public ViewDesempenhoVersoP() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		avesAlojadasJFT = new javax.swing.JFormattedTextField();
		jLabel31 = new javax.swing.JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		baiaJFT.setEnabled(false);
		jLabel32 = new javax.swing.JLabel();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new javax.swing.JLabel();
		linhagemJFT = new javax.swing.JFormattedTextField();
		jLabel35 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		jLabel33 = new javax.swing.JLabel();
		ladoJFT = new javax.swing.JFormattedTextField();
		pesagemJP = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		pnlAmostrados = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jLabel21 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		nrAmostradosJFT = new javax.swing.JFormattedTextField();
		jLabel25 = new javax.swing.JLabel();
		pesoAmostradosJFT = new javax.swing.JFormattedTextField();
		nrAmHist5Label = new javax.swing.JLabel();
		pesoAmHist5Label = new javax.swing.JLabel();
		nrAmHist1Label = new javax.swing.JLabel();
		pesoAmHist1Label = new javax.swing.JLabel();
		nrAmHist2Label = new javax.swing.JLabel();
		pesoAmHist2Label = new javax.swing.JLabel();
		nrAmHist3Label = new javax.swing.JLabel();
		pesoAmHist3Label = new javax.swing.JLabel();
		nrAmHist4Label = new javax.swing.JLabel();
		pesoAmHist4Label = new javax.swing.JLabel();
		idadeAmostradosJFT = new javax.swing.JFormattedTextField();
		idadeAmHist5Label = new javax.swing.JLabel();
		idadeAmHist4Label = new javax.swing.JLabel();
		idadeAmHist3Label = new javax.swing.JLabel();
		idadeAmHist2Label = new javax.swing.JLabel();
		idadeAmHist1Label = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		ordemAmHist1Label = new javax.swing.JLabel();
		ordemAmHist2Label = new javax.swing.JLabel();
		ordemAmHist3Label = new javax.swing.JLabel();
		ordemAmHist4Label = new javax.swing.JLabel();
		ordemAmHist5Label = new javax.swing.JLabel();
		ordemAmostradosJFT = new javax.swing.JFormattedTextField();
		jLabel54 = new javax.swing.JLabel();
		faseAmostradosLabel = new javax.swing.JLabel();
		pnlPesagem = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jLabel20 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		nrPesadosJFT = new javax.swing.JFormattedTextField();
		jLabel23 = new javax.swing.JLabel();
		pesadosJFT = new javax.swing.JFormattedTextField();
		nrPesadosHist5Label = new javax.swing.JLabel();
		pesadosHist5Label = new javax.swing.JLabel();
		nrPesadosHist4Label = new javax.swing.JLabel();
		pesadosHist4Label = new javax.swing.JLabel();
		nrPesadosHist1Label = new javax.swing.JLabel();
		pesadosHist1Label = new javax.swing.JLabel();
		nrPesadosHist2Label = new javax.swing.JLabel();
		pesadosHist2Label = new javax.swing.JLabel();
		nrPesadosHist3Label = new javax.swing.JLabel();
		pesadosHist3Label = new javax.swing.JLabel();
		idadePesadosHist1Label = new javax.swing.JLabel();
		idadePesadosHist2Label = new javax.swing.JLabel();
		idadePesadosHist4Label = new javax.swing.JLabel();
		idadePesadosHist3Label = new javax.swing.JLabel();
		idadePesadosJFT = new javax.swing.JFormattedTextField();
		jLabel30 = new javax.swing.JLabel();
		idadePesadosHist5Label = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		ordemPesagemHist1Label = new javax.swing.JLabel();
		ordemPesagemHist2Label = new javax.swing.JLabel();
		ordemPesagemHist3Label = new javax.swing.JLabel();
		ordemPesagemHist4Label = new javax.swing.JLabel();
		ordemPesagemHist5Label = new javax.swing.JLabel();
		ordemPesagemJFT = new javax.swing.JFormattedTextField();
		jLabel56 = new javax.swing.JLabel();
		fasePesagemLabel = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		pnlErros = new javax.swing.JPanel();
		jPanel9 = new javax.swing.JPanel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		nrErrosJFT = new javax.swing.JFormattedTextField();
		jLabel28 = new javax.swing.JLabel();
		pesoErrosJFT = new javax.swing.JFormattedTextField();
		nrErHist1Label = new javax.swing.JLabel();
		pesoErHist1Label = new javax.swing.JLabel();
		nrErHist2Label = new javax.swing.JLabel();
		pesoErHist2Label = new javax.swing.JLabel();
		nrErHist3Label = new javax.swing.JLabel();
		pesoErHist3Label = new javax.swing.JLabel();
		nrErHist4Label = new javax.swing.JLabel();
		pesoErHist4Label = new javax.swing.JLabel();
		nrErHist5Label = new javax.swing.JLabel();
		pesoErHist5Label = new javax.swing.JLabel();
		idadeErrosJFT = new javax.swing.JFormattedTextField();
		idadeErHist5Label = new javax.swing.JLabel();
		idadeErHist4Label = new javax.swing.JLabel();
		idadeErHist3Label = new javax.swing.JLabel();
		idadeErHist2Label = new javax.swing.JLabel();
		idadeErHist1Label = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		ordemErHist1Label = new javax.swing.JLabel();
		ordemErHist2Label = new javax.swing.JLabel();
		ordemErHist3Label = new javax.swing.JLabel();
		ordemErHist4Label = new javax.swing.JLabel();
		ordemErHist5Label = new javax.swing.JLabel();
		ordemErrosJFT = new javax.swing.JFormattedTextField();
		jLabel52 = new javax.swing.JLabel();
		faseErrosLabel = new javax.swing.JLabel();
		pnlMortalidade = new javax.swing.JPanel();
		jPanel43 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		nrMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel8 = new javax.swing.JLabel();
		pesoMortalidadeJFT = new javax.swing.JFormattedTextField();
		nrMHist1Label = new javax.swing.JLabel();
		pesoMHist1Label = new javax.swing.JLabel();
		nrMHist2Label = new javax.swing.JLabel();
		pesoMHist2Label = new javax.swing.JLabel();
		nrMHist3Label = new javax.swing.JLabel();
		pesoMHist3Label = new javax.swing.JLabel();
		nrMHist4Label = new javax.swing.JLabel();
		pesoMHist4Label = new javax.swing.JLabel();
		nrMHist5Label = new javax.swing.JLabel();
		pesoMHist5Label = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		idadeMHist1Label = new javax.swing.JLabel();
		idadeMHist2Label = new javax.swing.JLabel();
		idadeMHist3Label = new javax.swing.JLabel();
		idadeMHist4Label = new javax.swing.JLabel();
		idadeMHist5Label = new javax.swing.JLabel();
		idadeMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel41 = new javax.swing.JLabel();
		ordemMortalidadeHist1Label = new javax.swing.JLabel();
		ordemMortalidadeHist2Label = new javax.swing.JLabel();
		ordemMortalidadeHist3Label = new javax.swing.JLabel();
		ordemMortalidadeHist4Label = new javax.swing.JLabel();
		ordemMortalidadeHist5Label = new javax.swing.JLabel();
		ordemMortalidadeJFT = new javax.swing.JFormattedTextField();
		jLabel48 = new javax.swing.JLabel();
		faseMortalidadeLabel = new javax.swing.JLabel();
		pnlEliminados = new javax.swing.JPanel();
		jPanel13 = new javax.swing.JPanel();
		eliminadosJP1 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		nrEliminadosJFT = new javax.swing.JFormattedTextField();
		jLabel57 = new javax.swing.JLabel();
		pesoEliminadosJFT = new javax.swing.JFormattedTextField();
		nrElHist2Label = new javax.swing.JLabel();
		pesoElHist2Label = new javax.swing.JLabel();
		nrElHist1Label = new javax.swing.JLabel();
		pesoElHist1Label = new javax.swing.JLabel();
		nrElHist3Label = new javax.swing.JLabel();
		pesoElHist3Label = new javax.swing.JLabel();
		nrElHist4Label = new javax.swing.JLabel();
		pesoElHist4Label = new javax.swing.JLabel();
		nrElHist5Label = new javax.swing.JLabel();
		pesoElHist5Label = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		idadeElHist1Label = new javax.swing.JLabel();
		idadeElHist2Label = new javax.swing.JLabel();
		idadeElHist3Label = new javax.swing.JLabel();
		idadeElHist4Label = new javax.swing.JLabel();
		idadeElHist5Label = new javax.swing.JLabel();
		idadeEliminadosJFT = new javax.swing.JFormattedTextField();
		jLabel59 = new javax.swing.JLabel();
		jLabel60 = new javax.swing.JLabel();
		ordemElHist1Label = new javax.swing.JLabel();
		ordemElHist2Label = new javax.swing.JLabel();
		ordemElHist3Label = new javax.swing.JLabel();
		ordemElHist4Label = new javax.swing.JLabel();
		ordemElHist5Label = new javax.swing.JLabel();
		ordemEliminadosJFT = new javax.swing.JFormattedTextField();
		faseEliminadosLabel = new javax.swing.JLabel();
		registroLabel = new javax.swing.JLabel();
		controleMortalidadeJFT = new javax.swing.JFormattedTextField();
		controleEliminadosJFT = new javax.swing.JFormattedTextField();
		controleErrosJFT = new javax.swing.JFormattedTextField();
		controleAmostradosJFT = new javax.swing.JFormattedTextField();
		controlePesagemJFT = new javax.swing.JFormattedTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		try {
			avesAlojadasJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		avesAlojadasJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		avesAlojadasJFT.setEnabled(false);

		try {
			controleMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleMortalidadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleMortalidadeJFT.setEnabled(false);

		try {
			controleEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleEliminadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleEliminadosJFT.setEnabled(false);

		try {
			controleErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleErrosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleErrosJFT.setEnabled(false);

		try {
			controleAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleAmostradosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleAmostradosJFT.setEnabled(false);

		try {
			controlePesagemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controlePesagemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controlePesagemJFT.setEnabled(false);

		jLabel31.setText("Baia");

		try {
			baiaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel32.setText("Sexo");

		try {
			sexoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		sexoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		sexoJFT.setEnabled(false);

		jLabel34.setText("Linhagem");

		try {
			linhagemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		linhagemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
		aviarioJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel45.setText("Trat.");

		try {
			trataJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trataJFT.setEnabled(false);

		jLabel33.setText("Lado");

		try {
			ladoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ladoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ladoJFT.setEnabled(false);

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
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
						.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)));
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
												.addComponent(jLabel44)
												.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel45)
												.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel33).addComponent(ladoJFT,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		baiaJP.setLayout(baiaJPLayout);

		pesagemJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		pnlAmostrados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel21.setText("Amostrados");

		jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel24.setText("Nr.");

		try {
			nrAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrAmostradosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrAmostradosJFT.setEnabled(false);

		jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel25.setText("Peso");

		try {
			pesoAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoAmostradosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoAmostradosJFT.setEnabled(false);

		nrAmHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoAmHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrAmHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoAmHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrAmHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoAmHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrAmHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoAmHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrAmHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoAmHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			idadeAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeAmostradosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeAmostradosJFT.setEnabled(false);

		idadeAmHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeAmHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeAmHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeAmHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeAmHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel37.setText("Idade");

		jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel53.setText("Ordem");

		ordemAmHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemAmHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemAmHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemAmHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemAmHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemAmHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemAmHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemAmHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemAmHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemAmHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			ordemAmostradosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemAmostradosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemAmostradosJFT.setEnabled(false);

		jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel54.setText("Controle");
		
		controleAmostradosJFT = new JFormattedTextField();
		controleAmostradosJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleAmostradosJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8Layout.setHorizontalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel8Layout.createSequentialGroup()
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel53, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmostradosJFT, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel37, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idadeAmostradosJFT, 36, 36, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrAmostradosJFT, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel25, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmHist1Label, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmHist2Label, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmHist3Label, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmHist4Label, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmHist5Label, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
								.addComponent(pesoAmostradosJFT, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel54, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
								.addComponent(controleAmostradosJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addComponent(jLabel21, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
		);
		jPanel8Layout.setVerticalGroup(
			jPanel8Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel21)
					.addGap(12)
					.addGroup(jPanel8Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(jPanel8Layout.createSequentialGroup()
								.addComponent(jLabel53)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ordemAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(ordemAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(ordemAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(ordemAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(ordemAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(ordemAmostradosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel8Layout.createSequentialGroup()
								.addComponent(jLabel37)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(idadeAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeAmostradosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel8Layout.createSequentialGroup()
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel24)
								.addComponent(jLabel25))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, jPanel8Layout.createParallelGroup(Alignment.TRAILING)
									.addGroup(jPanel8Layout.createSequentialGroup()
										.addComponent(jLabel54, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addGap(26))
									.addComponent(controleAmostradosJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel8Layout.createSequentialGroup()
									.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(nrAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(pesoAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel8Layout.createSequentialGroup()
											.addComponent(nrAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(nrAmostradosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(pesoAmostradosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))))))
					.addContainerGap())
		);
		jPanel8.setLayout(jPanel8Layout);

		faseAmostradosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		faseAmostradosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseAmostradosLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlAmostrados = new javax.swing.GroupLayout(pnlAmostrados);
		gl_pnlAmostrados.setHorizontalGroup(
			gl_pnlAmostrados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlAmostrados.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlAmostrados.createParallelGroup(Alignment.LEADING)
						.addComponent(faseAmostradosLabel, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
						.addGroup(gl_pnlAmostrados.createSequentialGroup()
							.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_pnlAmostrados.setVerticalGroup(
			gl_pnlAmostrados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlAmostrados.createSequentialGroup()
					.addContainerGap()
					.addComponent(faseAmostradosLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		pnlAmostrados.setLayout(gl_pnlAmostrados);

		pnlPesagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel20.setText("Pesagem");

		jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel22.setText("Nr.");

		try {
			nrPesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrPesadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrPesadosJFT.setEnabled(false);

		jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel23.setText("Peso");

		try {
			pesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesadosJFT.setEnabled(false);

		nrPesadosHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrPesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesadosHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesadosHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrPesadosHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrPesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesadosHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesadosHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrPesadosHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrPesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesadosHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesadosHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrPesadosHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrPesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesadosHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesadosHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrPesadosHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrPesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesadosHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesadosHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadePesadosHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadePesadosHist1Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadePesadosHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadePesadosHist2Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadePesadosHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadePesadosHist4Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadePesadosHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadePesadosHist3Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			idadePesadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadePesadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadePesadosJFT.setEnabled(false);

		jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel30.setText("Idade");

		idadePesadosHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadePesadosHist5Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel55.setText("Ordem");

		ordemPesagemHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemPesagemHist1Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemPesagemHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemPesagemHist2Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemPesagemHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemPesagemHist3Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemPesagemHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemPesagemHist4Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemPesagemHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemPesagemHist5Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			ordemPesagemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemPesagemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemPesagemJFT.setEnabled(false);

		jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel56.setText("Controle");
		
		controlePesagemJFT = new JFormattedTextField();
		controlePesagemJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controlePesagemJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout.setHorizontalGroup(
			jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel55, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemPesagemHist3Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemPesagemHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemPesagemHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemPesagemHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemPesagemHist5Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemPesagemJFT, Alignment.LEADING, 32, 32, 32))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(idadePesadosHist3Label, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addComponent(idadePesadosHist2Label, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addComponent(jLabel30, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addComponent(idadePesadosJFT, 29, 29, 29)
								.addComponent(idadePesadosHist1Label, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addComponent(idadePesadosHist4Label, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
								.addComponent(idadePesadosHist5Label, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(nrPesadosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrPesadosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel22, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrPesadosHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrPesadosHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrPesadosHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrPesadosJFT, Alignment.LEADING))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(pesadosHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(pesadosHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(pesadosHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(jLabel23, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(pesadosHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(pesadosJFT, 51, 51, 51)
								.addComponent(pesadosHist1Label, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(controlePesagemJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel56, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jLabel20, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel7Layout.setVerticalGroup(
			jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel20)
					.addGap(12)
					.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addComponent(jLabel56, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(26))
						.addGroup(jPanel7Layout.createSequentialGroup()
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
									.addComponent(jLabel30)
									.addComponent(jLabel23)
									.addComponent(jLabel22))
								.addComponent(jLabel55))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel7Layout.createSequentialGroup()
									.addComponent(idadePesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idadePesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idadePesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idadePesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idadePesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idadePesadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel7Layout.createSequentialGroup()
									.addComponent(pesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(pesadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(controlePesagemJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel7Layout.createSequentialGroup()
									.addComponent(nrPesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nrPesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nrPesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nrPesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nrPesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(nrPesadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel7Layout.createSequentialGroup()
									.addComponent(ordemPesagemHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ordemPesagemHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ordemPesagemHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ordemPesagemHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ordemPesagemHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ordemPesagemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		jPanel7.setLayout(jPanel7Layout);

		fasePesagemLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		fasePesagemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fasePesagemLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlPesagem = new javax.swing.GroupLayout(pnlPesagem);
		gl_pnlPesagem.setHorizontalGroup(
			gl_pnlPesagem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPesagem.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlPesagem.createParallelGroup(Alignment.LEADING)
						.addComponent(fasePesagemLabel, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlPesagem.setVerticalGroup(
			gl_pnlPesagem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPesagem.createSequentialGroup()
					.addContainerGap()
					.addComponent(fasePesagemLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		pnlPesagem.setLayout(gl_pnlPesagem);

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel17.setText("Escolha uma opção:");

		jLabel18.setText("[1] - Digitar Próxima Baia");

		jLabel19.setText("[2] - Finalizar Desempenho / Voltar");

		jLabel39.setText("[0] - Sair");

		jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel40.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(8, 8, 8).addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel17)
						.addGap(18, 18, 18).addComponent(jLabel18)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
						.addComponent(jLabel39).addGap(36, 36, 36)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel40).addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		pnlErros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel26.setText("Erros");

		jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel27.setText("Nr.");

		try {
			nrErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrErrosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrErrosJFT.setEnabled(false);

		jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel28.setText("Peso");

		try {
			pesoErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoErrosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoErrosJFT.setEnabled(false);

		nrErHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoErHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrErHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoErHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrErHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoErHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrErHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoErHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrErHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoErHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			idadeErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeErrosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeErrosJFT.setEnabled(false);

		idadeErHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeErHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeErHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeErHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeErHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel38.setText("Idade");

		jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel51.setText("Ordem");

		ordemErHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemErHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemErHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemErHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemErHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemErHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemErHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemErHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemErHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemErHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			ordemErrosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemErrosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemErrosJFT.setEnabled(false);

		jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel52.setText("Controle");
		
		controleErrosJFT = new JFormattedTextField();
		controleErrosJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleErrosJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9Layout.setHorizontalGroup(
			jPanel9Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel26, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
						.addGroup(jPanel9Layout.createSequentialGroup()
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel51, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemErHist3Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemErHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemErHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemErHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemErrosJFT, Alignment.LEADING, 32, 32, Short.MAX_VALUE)
								.addComponent(ordemErHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(idadeErHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErrosJFT, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
								.addComponent(jLabel38, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel27, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrErrosJFT, Alignment.TRAILING)
								.addComponent(nrErHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrErHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrErHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrErHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nrErHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pesoErHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErrosJFT)
								.addComponent(jLabel28, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel9Layout.createSequentialGroup()
									.addComponent(jLabel52, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
									.addGap(13))
								.addGroup(jPanel9Layout.createSequentialGroup()
									.addComponent(controleErrosJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))))
		);
		jPanel9Layout.setVerticalGroup(
			jPanel9Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel26)
					.addGap(12)
					.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel27)
							.addComponent(jLabel28))
						.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel51)
							.addComponent(jLabel38)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel9Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel9Layout.createSequentialGroup()
							.addComponent(ordemErHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemErHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemErHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemErHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemErHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemErrosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel9Layout.createSequentialGroup()
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrErHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrErHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrErHist3Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErHist3Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrErHist4Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErHist4Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(nrErHist5Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErHist5Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrErrosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErrosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleErrosJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel9Layout.createSequentialGroup()
							.addComponent(idadeErHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeErHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeErHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeErHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeErHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeErrosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel9Layout.createSequentialGroup()
							.addComponent(jLabel52, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(26)))
					.addContainerGap())
		);
		jPanel9.setLayout(jPanel9Layout);

		faseErrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		faseErrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseErrosLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlErros = new javax.swing.GroupLayout(pnlErros);
		gl_pnlErros.setHorizontalGroup(
			gl_pnlErros.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlErros.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlErros.createParallelGroup(Alignment.LEADING)
						.addComponent(faseErrosLabel, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pnlErros.setVerticalGroup(
			gl_pnlErros.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlErros.createSequentialGroup()
					.addContainerGap()
					.addComponent(faseErrosLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		pnlErros.setLayout(gl_pnlErros);

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10Layout.setHorizontalGroup(
			jPanel10Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
					.addComponent(pnlErros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlAmostrados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlPesagem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		jPanel10Layout.setVerticalGroup(
			jPanel10Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
					.addGroup(jPanel10Layout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(jPanel10Layout.createSequentialGroup()
							.addGap(11)
							.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(pnlPesagem, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(pnlAmostrados, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(pnlErros, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel10.setLayout(jPanel10Layout);

		javax.swing.GroupLayout pesagemJPLayout = new javax.swing.GroupLayout(pesagemJP);
		pesagemJPLayout.setHorizontalGroup(
			pesagemJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pesagemJPLayout.createSequentialGroup()
					.addComponent(jPanel10, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
					.addContainerGap())
		);
		pesagemJPLayout.setVerticalGroup(
			pesagemJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pesagemJPLayout.createSequentialGroup()
					.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		pesagemJP.setLayout(pesagemJPLayout);

		pnlMortalidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("Mortalidade");

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Nr.");

		try {
			nrMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrMortalidadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrMortalidadeJFT.setEnabled(false);

		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("Peso");

		try {
			pesoMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoMortalidadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoMortalidadeJFT.setEnabled(false);

		nrMHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoMHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrMHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoMHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrMHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoMHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrMHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoMHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrMHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoMHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Idade");

		idadeMHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeMHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeMHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeMHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeMHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeMHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeMHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeMHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeMHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeMHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			idadeMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeMortalidadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeMortalidadeJFT.setEnabled(false);

		jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel41.setText("Ordem");

		ordemMortalidadeHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemMortalidadeHist1Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemMortalidadeHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemMortalidadeHist2Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemMortalidadeHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemMortalidadeHist3Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemMortalidadeHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemMortalidadeHist4Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemMortalidadeHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemMortalidadeHist5Label
				.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			ordemMortalidadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemMortalidadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemMortalidadeJFT.setEnabled(false);

		jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel48.setText("Controle");
		
		controleMortalidadeJFT = new JFormattedTextField();
		controleMortalidadeJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleMortalidadeJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
		jPanel43Layout.setHorizontalGroup(
			jPanel43Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel43Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addGroup(jPanel43Layout.createSequentialGroup()
							.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(ordemMortalidadeHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(ordemMortalidadeJFT, Alignment.LEADING, 32, 32, Short.MAX_VALUE))
								.addGroup(jPanel43Layout.createSequentialGroup()
									.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jLabel41, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(ordemMortalidadeHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(ordemMortalidadeHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(ordemMortalidadeHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(ordemMortalidadeHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGap(6)
							.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel43Layout.createSequentialGroup()
									.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(idadeMortalidadeJFT, 35, 35, 35)
										.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(idadeMHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
											.addComponent(idadeMHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(idadeMHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(idadeMHist2Label, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeMHist1Label, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(nrMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(nrMHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(nrMHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(nrMHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(nrMHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(nrMHist5Label, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(pesoMHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMortalidadeJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel48, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(controleMortalidadeJFT, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
								.addGroup(jPanel43Layout.createSequentialGroup()
									.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(24, Short.MAX_VALUE))))
		);
		jPanel43Layout.setVerticalGroup(
			jPanel43Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel43Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel43Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel41)
						.addComponent(jLabel16)
						.addComponent(jLabel7)
						.addComponent(jLabel8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING)
							.addGroup(jPanel43Layout.createSequentialGroup()
								.addComponent(nrMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel43Layout.createSequentialGroup()
								.addComponent(idadeMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idadeMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel43Layout.createSequentialGroup()
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.TRAILING)
									.addGroup(jPanel43Layout.createSequentialGroup()
										.addComponent(jLabel48, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(jPanel43Layout.createSequentialGroup()
										.addGroup(jPanel43Layout.createParallelGroup(Alignment.LEADING)
											.addComponent(ordemMortalidadeHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addGroup(jPanel43Layout.createSequentialGroup()
												.addComponent(pesoMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(pesoMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(pesoMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(pesoMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(pesoMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
										.addGap(12)))
								.addGroup(jPanel43Layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(pesoMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addComponent(controleMortalidadeJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel43Layout.createSequentialGroup()
							.addGap(25)
							.addComponent(ordemMortalidadeHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemMortalidadeHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemMortalidadeHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemMortalidadeHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemMortalidadeJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel43.setLayout(jPanel43Layout);

		faseMortalidadeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		faseMortalidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseMortalidadeLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlMortalidade = new javax.swing.GroupLayout(pnlMortalidade);
		gl_pnlMortalidade.setHorizontalGroup(
			gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlMortalidade.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel43, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
						.addComponent(faseMortalidadeLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlMortalidade.setVerticalGroup(
			gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMortalidade.createSequentialGroup()
					.addContainerGap()
					.addComponent(faseMortalidadeLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlMortalidade.setLayout(gl_pnlMortalidade);

		pnlEliminados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		eliminadosJP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		eliminadosJP1.setText("Eliminados");

		jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel29.setText("Nr.");

		try {
			nrEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrEliminadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrEliminadosJFT.setEnabled(false);

		jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel57.setText("Peso");

		try {
			pesoEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoEliminadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoEliminadosJFT.setEnabled(false);

		nrElHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoElHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrElHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoElHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrElHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoElHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrElHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoElHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nrElHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nrElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pesoElHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel58.setText("Idade");

		idadeElHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeElHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeElHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeElHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		idadeElHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			idadeEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeEliminadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeEliminadosJFT.setEnabled(false);

		jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel59.setText("Controle");

		jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel60.setText("Ordem");

		ordemElHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemElHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemElHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemElHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemElHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemElHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemElHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemElHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemElHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemElHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			ordemEliminadosJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemEliminadosJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemEliminadosJFT.setEnabled(false);
		
		controleEliminadosJFT = new JFormattedTextField();
		controleEliminadosJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleEliminadosJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13Layout.setHorizontalGroup(
			jPanel13Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(eliminadosJP1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
						.addGroup(jPanel13Layout.createSequentialGroup()
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemElHist3Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemElHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemElHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemElHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemElHist5Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemEliminadosJFT, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(idadeElHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
										.addComponent(idadeElHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
										.addComponent(idadeElHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
										.addComponent(idadeEliminadosJFT, Alignment.LEADING, 32, 32, 32)))
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addGap(10)
									.addComponent(jLabel58, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(idadeElHist1Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
										.addComponent(idadeElHist2Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrElHist5Label, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrElHist4Label, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrElHist3Label, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrElHist2Label, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrElHist1Label, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
								.addComponent(nrEliminadosJFT, 23, 23, 23))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(pesoElHist2Label, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
										.addComponent(pesoElHist3Label, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
										.addComponent(pesoElHist4Label, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
										.addComponent(pesoElHist5Label, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
										.addComponent(pesoEliminadosJFT, 48, 48, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(controleEliminadosJFT, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel59, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)))
								.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(pesoElHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jLabel57, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())))
		);
		jPanel13Layout.setVerticalGroup(
			jPanel13Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eliminadosJP1)
					.addGap(12)
					.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel13Layout.createSequentialGroup()
							.addComponent(jLabel57)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pesoElHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel13Layout.createSequentialGroup()
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel60)
								.addComponent(jLabel58)
								.addComponent(jLabel29))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addComponent(jLabel59, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addGap(26))
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(nrElHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeElHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(ordemElHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(idadeElHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(ordemElHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(nrElHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoElHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(ordemElHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeElHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(nrElHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoElHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(ordemElHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeElHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(nrElHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoElHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(ordemElHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeElHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(nrElHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoElHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nrEliminadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(pesoEliminadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeEliminadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(ordemEliminadosJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(controleEliminadosJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel13.setLayout(jPanel13Layout);

		faseEliminadosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		faseEliminadosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseEliminadosLabel.setText("Fase 1 (Idade 28)");

		javax.swing.GroupLayout gl_pnlEliminados = new javax.swing.GroupLayout(pnlEliminados);
		pnlEliminados.setLayout(gl_pnlEliminados);
		gl_pnlEliminados.setHorizontalGroup(gl_pnlEliminados
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_pnlEliminados.createSequentialGroup().addContainerGap().addGroup(gl_pnlEliminados
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnlEliminados.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
								jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(faseEliminadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		gl_pnlEliminados.setVerticalGroup(
				gl_pnlEliminados.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						gl_pnlEliminados.createSequentialGroup().addContainerGap().addComponent(faseEliminadosLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		registroLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registroLabel.setForeground(new java.awt.Color(0, 153, 255));
		registroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registroLabel.setText("Registro salvo com sucesso!!");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pesagemJP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
							.addComponent(pnlMortalidade, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(baiaJP, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
						.addComponent(registroLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlMortalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pesagemJP, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registroLabel)
					.addGap(35))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(20))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void controleSobraJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFT1ActionPerformed

	private void controleSobraJFT3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFT3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFT3ActionPerformed

	private void controleSobraJFT4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFT4ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFT4ActionPerformed

	private void controleSobraJFT5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFT5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFT5ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoVersoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoVersoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoVersoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewDesempenhoVersoP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewDesempenhoVersoP().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables

	// End of variables declaration//GEN-END:variables

	public javax.swing.JLabel getEliminadosJP1() {
		return eliminadosJP1;
	}

	public void setEliminadosJP1(javax.swing.JLabel eliminadosJP1) {
		this.eliminadosJP1 = eliminadosJP1;
	}

	public javax.swing.JLabel getFasePesagemLabel1() {
		return faseMortalidadeLabel;
	}

	public void setFasePesagemLabel1(javax.swing.JLabel fasePesagemLabel1) {
		this.faseMortalidadeLabel = fasePesagemLabel1;
	}

	public javax.swing.JLabel getFasePesagemLabel2() {
		return faseEliminadosLabel;
	}

	public void setFasePesagemLabel2(javax.swing.JLabel fasePesagemLabel2) {
		this.faseEliminadosLabel = fasePesagemLabel2;
	}

	public javax.swing.JLabel getFasePesagemLabel3() {
		return faseErrosLabel;
	}

	public void setFasePesagemLabel3(javax.swing.JLabel fasePesagemLabel3) {
		this.faseErrosLabel = fasePesagemLabel3;
	}

	public javax.swing.JLabel getFasePesagemLabel4() {
		return faseAmostradosLabel;
	}

	public void setFasePesagemLabel4(javax.swing.JLabel fasePesagemLabel4) {
		this.faseAmostradosLabel = fasePesagemLabel4;
	}

	public javax.swing.JLabel getFasePesagemLabel5() {
		return fasePesagemLabel;
	}

	public void setFasePesagemLabel5(javax.swing.JLabel fasePesagemLabel5) {
		this.fasePesagemLabel = fasePesagemLabel5;
	}

	public javax.swing.JLabel getIdadeAmHist1Label() {
		return idadeAmHist1Label;
	}

	public void setIdadeAmHist1Label(javax.swing.JLabel idadeAmHist1Label) {
		this.idadeAmHist1Label = idadeAmHist1Label;
	}

	public javax.swing.JLabel getIdadeAmHist2Label() {
		return idadeAmHist2Label;
	}

	public void setIdadeAmHist2Label(javax.swing.JLabel idadeAmHist2Label) {
		this.idadeAmHist2Label = idadeAmHist2Label;
	}

	public javax.swing.JLabel getIdadeAmHist3Label() {
		return idadeAmHist3Label;
	}

	public void setIdadeAmHist3Label(javax.swing.JLabel idadeAmHist3Label) {
		this.idadeAmHist3Label = idadeAmHist3Label;
	}

	public javax.swing.JLabel getIdadeAmHist4Label() {
		return idadeAmHist4Label;
	}

	public void setIdadeAmHist4Label(javax.swing.JLabel idadeAmHist4Label) {
		this.idadeAmHist4Label = idadeAmHist4Label;
	}

	public javax.swing.JLabel getIdadeAmHist5Label() {
		return idadeAmHist5Label;
	}

	public void setIdadeAmHist5Label(javax.swing.JLabel idadeAmHist5Label) {
		this.idadeAmHist5Label = idadeAmHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeAmostradosJFT() {
		return idadeAmostradosJFT;
	}

	public void setIdadeAmostradosJFT(javax.swing.JFormattedTextField idadeAmostradosJFT) {
		this.idadeAmostradosJFT = idadeAmostradosJFT;
	}

	public javax.swing.JLabel getIdadeElHist1Label() {
		return idadeElHist1Label;
	}

	public void setIdadeElHist1Label(javax.swing.JLabel idadeElHist1Label) {
		this.idadeElHist1Label = idadeElHist1Label;
	}

	public javax.swing.JLabel getIdadeElHist2Label() {
		return idadeElHist2Label;
	}

	public void setIdadeElHist2Label(javax.swing.JLabel idadeElHist2Label) {
		this.idadeElHist2Label = idadeElHist2Label;
	}

	public javax.swing.JLabel getIdadeElHist3Label() {
		return idadeElHist3Label;
	}

	public void setIdadeElHist3Label(javax.swing.JLabel idadeElHist3Label) {
		this.idadeElHist3Label = idadeElHist3Label;
	}

	public javax.swing.JLabel getIdadeElHist4Label() {
		return idadeElHist4Label;
	}

	public void setIdadeElHist4Label(javax.swing.JLabel idadeElHist4Label) {
		this.idadeElHist4Label = idadeElHist4Label;
	}

	public javax.swing.JLabel getIdadeElHist5Label() {
		return idadeElHist5Label;
	}

	public void setIdadeElHist5Label(javax.swing.JLabel idadeElHist5Label) {
		this.idadeElHist5Label = idadeElHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeEliminadosJFT() {
		return idadeEliminadosJFT;
	}

	public void setIdadeEliminadosJFT(javax.swing.JFormattedTextField idadeEliminadosJFT) {
		this.idadeEliminadosJFT = idadeEliminadosJFT;
	}

	public javax.swing.JLabel getIdadeErHist1Label() {
		return idadeErHist1Label;
	}

	public void setIdadeErHist1Label(javax.swing.JLabel idadeErHist1Label) {
		this.idadeErHist1Label = idadeErHist1Label;
	}

	public javax.swing.JLabel getIdadeErHist2Label() {
		return idadeErHist2Label;
	}

	public void setIdadeErHist2Label(javax.swing.JLabel idadeErHist2Label) {
		this.idadeErHist2Label = idadeErHist2Label;
	}

	public javax.swing.JLabel getIdadeErHist3Label() {
		return idadeErHist3Label;
	}

	public void setIdadeErHist3Label(javax.swing.JLabel idadeErHist3Label) {
		this.idadeErHist3Label = idadeErHist3Label;
	}

	public javax.swing.JLabel getIdadeErHist4Label() {
		return idadeErHist4Label;
	}

	public void setIdadeErHist4Label(javax.swing.JLabel idadeErHist4Label) {
		this.idadeErHist4Label = idadeErHist4Label;
	}

	public javax.swing.JLabel getIdadeErHist5Label() {
		return idadeErHist5Label;
	}

	public void setIdadeErHist5Label(javax.swing.JLabel idadeErHist5Label) {
		this.idadeErHist5Label = idadeErHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeErrosJFT() {
		return idadeErrosJFT;
	}

	public void setIdadeErrosJFT(javax.swing.JFormattedTextField idadeErrosJFT) {
		this.idadeErrosJFT = idadeErrosJFT;
	}

	public javax.swing.JLabel getIdadeMHist1Label() {
		return idadeMHist1Label;
	}

	public void setIdadeMHist1Label(javax.swing.JLabel idadeMHist1Label) {
		this.idadeMHist1Label = idadeMHist1Label;
	}

	public javax.swing.JLabel getIdadeMHist2Label() {
		return idadeMHist2Label;
	}

	public void setIdadeMHist2Label(javax.swing.JLabel idadeMHist2Label) {
		this.idadeMHist2Label = idadeMHist2Label;
	}

	public javax.swing.JLabel getIdadeMHist3Label() {
		return idadeMHist3Label;
	}

	public void setIdadeMHist3Label(javax.swing.JLabel idadeMHist3Label) {
		this.idadeMHist3Label = idadeMHist3Label;
	}

	public javax.swing.JLabel getIdadeMHist4Label() {
		return idadeMHist4Label;
	}

	public void setIdadeMHist4Label(javax.swing.JLabel idadeMHist4Label) {
		this.idadeMHist4Label = idadeMHist4Label;
	}

	public javax.swing.JLabel getIdadeMHist5Label() {
		return idadeMHist5Label;
	}

	public void setIdadeMHist5Label(javax.swing.JLabel idadeMHist5Label) {
		this.idadeMHist5Label = idadeMHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeMortalidadeJFT() {
		return idadeMortalidadeJFT;
	}

	public void setIdadeMortalidadeJFT(javax.swing.JFormattedTextField idadeMortalidadeJFT) {
		this.idadeMortalidadeJFT = idadeMortalidadeJFT;
	}

	public javax.swing.JLabel getIdadePesadosHist1Label() {
		return idadePesadosHist1Label;
	}

	public void setIdadePesadosHist1Label(javax.swing.JLabel idadePesadosHist1Label) {
		this.idadePesadosHist1Label = idadePesadosHist1Label;
	}

	public javax.swing.JLabel getIdadePesadosHist2Label() {
		return idadePesadosHist2Label;
	}

	public void setIdadePesadosHist2Label(javax.swing.JLabel idadePesadosHist2Label) {
		this.idadePesadosHist2Label = idadePesadosHist2Label;
	}

	public javax.swing.JLabel getIdadePesadosHist3Label() {
		return idadePesadosHist3Label;
	}

	public void setIdadePesadosHist3Label(javax.swing.JLabel idadePesadosHist3Label) {
		this.idadePesadosHist3Label = idadePesadosHist3Label;
	}

	public javax.swing.JLabel getIdadePesadosHist4Label() {
		return idadePesadosHist4Label;
	}

	public void setIdadePesadosHist4Label(javax.swing.JLabel idadePesadosHist4Label) {
		this.idadePesadosHist4Label = idadePesadosHist4Label;
	}

	public javax.swing.JLabel getIdadePesadosHist5Label() {
		return idadePesadosHist5Label;
	}

	public void setIdadePesadosHist5Label(javax.swing.JLabel idadePesadosHist5Label) {
		this.idadePesadosHist5Label = idadePesadosHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadePesadosJFT() {
		return idadePesadosJFT;
	}

	public void setIdadePesadosJFT(javax.swing.JFormattedTextField idadePesadosJFT) {
		this.idadePesadosJFT = idadePesadosJFT;
	}

	public javax.swing.JLabel getjLabel16() {
		return jLabel16;
	}

	public void setjLabel16(javax.swing.JLabel jLabel16) {
		this.jLabel16 = jLabel16;
	}

	public javax.swing.JLabel getjLabel17() {
		return jLabel17;
	}

	public void setjLabel17(javax.swing.JLabel jLabel17) {
		this.jLabel17 = jLabel17;
	}

	public javax.swing.JLabel getjLabel18() {
		return jLabel18;
	}

	public void setjLabel18(javax.swing.JLabel jLabel18) {
		this.jLabel18 = jLabel18;
	}

	public javax.swing.JLabel getjLabel19() {
		return jLabel19;
	}

	public void setjLabel19(javax.swing.JLabel jLabel19) {
		this.jLabel19 = jLabel19;
	}

	public javax.swing.JLabel getjLabel20() {
		return jLabel20;
	}

	public void setjLabel20(javax.swing.JLabel jLabel20) {
		this.jLabel20 = jLabel20;
	}

	public javax.swing.JLabel getjLabel21() {
		return jLabel21;
	}

	public void setjLabel21(javax.swing.JLabel jLabel21) {
		this.jLabel21 = jLabel21;
	}

	public javax.swing.JLabel getjLabel22() {
		return jLabel22;
	}

	public void setjLabel22(javax.swing.JLabel jLabel22) {
		this.jLabel22 = jLabel22;
	}

	public javax.swing.JLabel getjLabel23() {
		return jLabel23;
	}

	public void setjLabel23(javax.swing.JLabel jLabel23) {
		this.jLabel23 = jLabel23;
	}

	public javax.swing.JLabel getjLabel24() {
		return jLabel24;
	}

	public void setjLabel24(javax.swing.JLabel jLabel24) {
		this.jLabel24 = jLabel24;
	}

	public javax.swing.JLabel getjLabel25() {
		return jLabel25;
	}

	public void setjLabel25(javax.swing.JLabel jLabel25) {
		this.jLabel25 = jLabel25;
	}

	public javax.swing.JLabel getjLabel26() {
		return jLabel26;
	}

	public void setjLabel26(javax.swing.JLabel jLabel26) {
		this.jLabel26 = jLabel26;
	}

	public javax.swing.JLabel getjLabel27() {
		return jLabel27;
	}

	public void setjLabel27(javax.swing.JLabel jLabel27) {
		this.jLabel27 = jLabel27;
	}

	public javax.swing.JLabel getjLabel28() {
		return jLabel28;
	}

	public void setjLabel28(javax.swing.JLabel jLabel28) {
		this.jLabel28 = jLabel28;
	}

	public javax.swing.JLabel getjLabel29() {
		return jLabel29;
	}

	public void setjLabel29(javax.swing.JLabel jLabel29) {
		this.jLabel29 = jLabel29;
	}

	public javax.swing.JLabel getjLabel30() {
		return jLabel30;
	}

	public void setjLabel30(javax.swing.JLabel jLabel30) {
		this.jLabel30 = jLabel30;
	}

	public javax.swing.JLabel getjLabel31() {
		return jLabel31;
	}

	public void setjLabel31(javax.swing.JLabel jLabel31) {
		this.jLabel31 = jLabel31;
	}

	public javax.swing.JLabel getjLabel32() {
		return jLabel32;
	}

	public void setjLabel32(javax.swing.JLabel jLabel32) {
		this.jLabel32 = jLabel32;
	}

	public javax.swing.JLabel getjLabel33() {
		return jLabel33;
	}

	public void setjLabel33(javax.swing.JLabel jLabel33) {
		this.jLabel33 = jLabel33;
	}

	public javax.swing.JLabel getjLabel34() {
		return jLabel34;
	}

	public void setjLabel34(javax.swing.JLabel jLabel34) {
		this.jLabel34 = jLabel34;
	}

	public javax.swing.JLabel getjLabel35() {
		return jLabel35;
	}

	public void setjLabel35(javax.swing.JLabel jLabel35) {
		this.jLabel35 = jLabel35;
	}

	public javax.swing.JLabel getjLabel37() {
		return jLabel37;
	}

	public void setjLabel37(javax.swing.JLabel jLabel37) {
		this.jLabel37 = jLabel37;
	}

	public javax.swing.JLabel getjLabel38() {
		return jLabel38;
	}

	public void setjLabel38(javax.swing.JLabel jLabel38) {
		this.jLabel38 = jLabel38;
	}

	public javax.swing.JLabel getjLabel39() {
		return jLabel39;
	}

	public void setjLabel39(javax.swing.JLabel jLabel39) {
		this.jLabel39 = jLabel39;
	}

	public javax.swing.JLabel getjLabel40() {
		return jLabel40;
	}

	public void setjLabel40(javax.swing.JLabel jLabel40) {
		this.jLabel40 = jLabel40;
	}

	public javax.swing.JLabel getjLabel41() {
		return jLabel41;
	}

	public void setjLabel41(javax.swing.JLabel jLabel41) {
		this.jLabel41 = jLabel41;
	}

	public javax.swing.JLabel getjLabel44() {
		return jLabel44;
	}

	public void setjLabel44(javax.swing.JLabel jLabel44) {
		this.jLabel44 = jLabel44;
	}

	public javax.swing.JLabel getjLabel45() {
		return jLabel45;
	}

	public void setjLabel45(javax.swing.JLabel jLabel45) {
		this.jLabel45 = jLabel45;
	}

	public javax.swing.JLabel getjLabel48() {
		return jLabel48;
	}

	public void setjLabel48(javax.swing.JLabel jLabel48) {
		this.jLabel48 = jLabel48;
	}

	public javax.swing.JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(javax.swing.JLabel jLabel5) {
		this.jLabel5 = jLabel5;
	}

	public javax.swing.JLabel getjLabel51() {
		return jLabel51;
	}

	public void setjLabel51(javax.swing.JLabel jLabel51) {
		this.jLabel51 = jLabel51;
	}

	public javax.swing.JLabel getjLabel52() {
		return jLabel52;
	}

	public void setjLabel52(javax.swing.JLabel jLabel52) {
		this.jLabel52 = jLabel52;
	}

	public javax.swing.JLabel getjLabel53() {
		return jLabel53;
	}

	public void setjLabel53(javax.swing.JLabel jLabel53) {
		this.jLabel53 = jLabel53;
	}

	public javax.swing.JLabel getjLabel54() {
		return jLabel54;
	}

	public void setjLabel54(javax.swing.JLabel jLabel54) {
		this.jLabel54 = jLabel54;
	}

	public javax.swing.JLabel getjLabel55() {
		return jLabel55;
	}

	public void setjLabel55(javax.swing.JLabel jLabel55) {
		this.jLabel55 = jLabel55;
	}

	public javax.swing.JLabel getjLabel56() {
		return jLabel56;
	}

	public void setjLabel56(javax.swing.JLabel jLabel56) {
		this.jLabel56 = jLabel56;
	}

	public javax.swing.JLabel getjLabel57() {
		return jLabel57;
	}

	public void setjLabel57(javax.swing.JLabel jLabel57) {
		this.jLabel57 = jLabel57;
	}

	public javax.swing.JLabel getjLabel58() {
		return jLabel58;
	}

	public void setjLabel58(javax.swing.JLabel jLabel58) {
		this.jLabel58 = jLabel58;
	}

	public javax.swing.JLabel getjLabel59() {
		return jLabel59;
	}

	public void setjLabel59(javax.swing.JLabel jLabel59) {
		this.jLabel59 = jLabel59;
	}

	public javax.swing.JLabel getjLabel60() {
		return jLabel60;
	}

	public void setjLabel60(javax.swing.JLabel jLabel60) {
		this.jLabel60 = jLabel60;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(javax.swing.JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public javax.swing.JLabel getjLabel8() {
		return jLabel8;
	}

	public void setjLabel8(javax.swing.JLabel jLabel8) {
		this.jLabel8 = jLabel8;
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

	public javax.swing.JLabel getOrdemAmHist1Label() {
		return ordemAmHist1Label;
	}

	public void setOrdemAmHist1Label(javax.swing.JLabel ordemAmHist1Label) {
		this.ordemAmHist1Label = ordemAmHist1Label;
	}

	public javax.swing.JLabel getOrdemAmHist2Label() {
		return ordemAmHist2Label;
	}

	public void setOrdemAmHist2Label(javax.swing.JLabel ordemAmHist2Label) {
		this.ordemAmHist2Label = ordemAmHist2Label;
	}

	public javax.swing.JLabel getOrdemAmHist3Label() {
		return ordemAmHist3Label;
	}

	public void setOrdemAmHist3Label(javax.swing.JLabel ordemAmHist3Label) {
		this.ordemAmHist3Label = ordemAmHist3Label;
	}

	public javax.swing.JLabel getOrdemAmHist5Label() {
		return ordemAmHist5Label;
	}

	public void setOrdemAmHist5Label(javax.swing.JLabel ordemAmHist5Label) {
		this.ordemAmHist5Label = ordemAmHist5Label;
	}

	public javax.swing.JLabel getOrdemElHist1Label() {
		return ordemElHist1Label;
	}

	public void setOrdemElHist1Label(javax.swing.JLabel ordemElHist1Label) {
		this.ordemElHist1Label = ordemElHist1Label;
	}

	public javax.swing.JLabel getOrdemElHist2Label() {
		return ordemElHist2Label;
	}

	public void setOrdemElHist2Label(javax.swing.JLabel ordemElHist2Label) {
		this.ordemElHist2Label = ordemElHist2Label;
	}

	public javax.swing.JLabel getOrdemElHist3Label() {
		return ordemElHist3Label;
	}

	public void setOrdemElHist3Label(javax.swing.JLabel ordemElHist3Label) {
		this.ordemElHist3Label = ordemElHist3Label;
	}

	public javax.swing.JLabel getOrdemElHist4Label() {
		return ordemElHist4Label;
	}

	public void setOrdemElHist4Label(javax.swing.JLabel ordemElHist4Label) {
		this.ordemElHist4Label = ordemElHist4Label;
	}

	public javax.swing.JLabel getOrdemElHist5Label() {
		return ordemElHist5Label;
	}

	public void setOrdemElHist5Label(javax.swing.JLabel ordemElHist5Label) {
		this.ordemElHist5Label = ordemElHist5Label;
	}

	public javax.swing.JLabel getOrdemErHist1Label() {
		return ordemErHist1Label;
	}

	public void setOrdemErHist1Label(javax.swing.JLabel ordemErHist1Label) {
		this.ordemErHist1Label = ordemErHist1Label;
	}

	public javax.swing.JLabel getOrdemErHist2Label() {
		return ordemErHist2Label;
	}

	public void setOrdemErHist2Label(javax.swing.JLabel ordemErHist2Label) {
		this.ordemErHist2Label = ordemErHist2Label;
	}

	public javax.swing.JLabel getOrdemErHist3Label() {
		return ordemErHist3Label;
	}

	public void setOrdemErHist3Label(javax.swing.JLabel ordemErHist3Label) {
		this.ordemErHist3Label = ordemErHist3Label;
	}

	public javax.swing.JLabel getOrdemErHist5Label() {
		return ordemErHist5Label;
	}

	public void setOrdemErHist5Label(javax.swing.JLabel ordemErHist5Label) {
		this.ordemErHist5Label = ordemErHist5Label;
	}

	public javax.swing.JLabel getOrdemPHist1Label() {
		return ordemMortalidadeHist1Label;
	}

	public void setOrdemPHist1Label(javax.swing.JLabel ordemPHist1Label) {
		this.ordemMortalidadeHist1Label = ordemPHist1Label;
	}

	public javax.swing.JLabel getOrdemPHist2Label() {
		return ordemMortalidadeHist2Label;
	}

	public void setOrdemPHist2Label(javax.swing.JLabel ordemPHist2Label) {
		this.ordemMortalidadeHist2Label = ordemPHist2Label;
	}

	public javax.swing.JLabel getOrdemPHist3Label() {
		return ordemMortalidadeHist3Label;
	}

	public void setOrdemPHist3Label(javax.swing.JLabel ordemPHist3Label) {
		this.ordemMortalidadeHist3Label = ordemPHist3Label;
	}

	public javax.swing.JLabel getOrdemPHist5Label() {
		return ordemMortalidadeHist5Label;
	}

	public void setOrdemPHist5Label(javax.swing.JLabel ordemPHist5Label) {
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
		return ordemPesagemJFT;
	}

	public void setOrdemPJFT4(javax.swing.JFormattedTextField ordemPJFT4) {
		this.ordemPesagemJFT = ordemPJFT4;
	}

	public javax.swing.JFormattedTextField getOrdemPJFT5() {
		return ordemEliminadosJFT;
	}

	public void setOrdemPJFT5(javax.swing.JFormattedTextField ordemPJFT5) {
		this.ordemEliminadosJFT = ordemPJFT5;
	}

	public javax.swing.JLabel getOrdemPesagemHist1Label() {
		return ordemPesagemHist1Label;
	}

	public void setOrdemPesagemHist1Label(javax.swing.JLabel ordemPesagemHist1Label) {
		this.ordemPesagemHist1Label = ordemPesagemHist1Label;
	}

	public javax.swing.JLabel getOrdemPesagemHist2Label() {
		return ordemPesagemHist2Label;
	}

	public void setOrdemPesagemHist2Label(javax.swing.JLabel ordemPesagemHist2Label) {
		this.ordemPesagemHist2Label = ordemPesagemHist2Label;
	}

	public javax.swing.JLabel getOrdemPesagemHist3Label() {
		return ordemPesagemHist3Label;
	}

	public void setOrdemPesagemHist3Label(javax.swing.JLabel ordemPesagemHist3Label) {
		this.ordemPesagemHist3Label = ordemPesagemHist3Label;
	}

	public javax.swing.JLabel getOrdemPesagemHist5Label() {
		return ordemPesagemHist5Label;
	}

	public void setOrdemPesagemHist5Label(javax.swing.JLabel ordemPesagemHist5Label) {
		this.ordemPesagemHist5Label = ordemPesagemHist5Label;
	}

	public javax.swing.JLabel getOredmAmHist4Label() {
		return ordemAmHist4Label;
	}

	public void setOredmAmHist4Label(javax.swing.JLabel oredmAmHist4Label) {
		this.ordemAmHist4Label = oredmAmHist4Label;
	}

	public javax.swing.JLabel getOredmErHist4Label() {
		return ordemErHist4Label;
	}

	public void setOredmErHist4Label(javax.swing.JLabel oredmErHist4Label) {
		this.ordemErHist4Label = oredmErHist4Label;
	}

	public javax.swing.JLabel getOredmPHist4Label() {
		return ordemMortalidadeHist4Label;
	}

	public void setOredmPHist4Label(javax.swing.JLabel oredmPHist4Label) {
		this.ordemMortalidadeHist4Label = oredmPHist4Label;
	}

	public javax.swing.JLabel getOredmPesagemHist4Label() {
		return ordemPesagemHist4Label;
	}

	public void setOredmPesagemHist4Label(javax.swing.JLabel oredmPesagemHist4Label) {
		this.ordemPesagemHist4Label = oredmPesagemHist4Label;
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

	public void setLadoJFT(javax.swing.JFormattedTextField ladoJFT) {
		this.ladoJFT = ladoJFT;
	}

	public void setLinhagemJFT(javax.swing.JFormattedTextField linhagemJFT) {
		this.linhagemJFT = linhagemJFT;
	}

	public void setNrAmHist1Label(javax.swing.JLabel nrAmHist1Label) {
		this.nrAmHist1Label = nrAmHist1Label;
	}

	public void setNrAmHist2Label(javax.swing.JLabel nrAmHist2Label) {
		this.nrAmHist2Label = nrAmHist2Label;
	}

	public void setNrAmHist3Label(javax.swing.JLabel nrAmHist3Label) {
		this.nrAmHist3Label = nrAmHist3Label;
	}

	public void setNrAmHist4Label(javax.swing.JLabel nrAmHist4Label) {
		this.nrAmHist4Label = nrAmHist4Label;
	}

	public void setNrAmHist5Label(javax.swing.JLabel nrAmHist5Label) {
		this.nrAmHist5Label = nrAmHist5Label;
	}

	public void setNrAmostradosJFT(javax.swing.JFormattedTextField nrAmostradosJFT) {
		this.nrAmostradosJFT = nrAmostradosJFT;
	}

	public void setNrElHist1Label(javax.swing.JLabel nrElHist1Label) {
		this.nrElHist1Label = nrElHist1Label;
	}

	public void setNrElHist2Label(javax.swing.JLabel nrElHist2Label) {
		this.nrElHist2Label = nrElHist2Label;
	}

	public void setNrElHist3Label(javax.swing.JLabel nrElHist3Label) {
		this.nrElHist3Label = nrElHist3Label;
	}

	public void setNrElHist4Label(javax.swing.JLabel nrElHist4Label) {
		this.nrElHist4Label = nrElHist4Label;
	}

	public void setNrElHist5Label(javax.swing.JLabel nrElHist5Label) {
		this.nrElHist5Label = nrElHist5Label;
	}

	public void setNrEliminadosJFT(javax.swing.JFormattedTextField nrEliminadosJFT) {
		this.nrEliminadosJFT = nrEliminadosJFT;
	}

	public void setNrErHist1Label(javax.swing.JLabel nrErHist1Label) {
		this.nrErHist1Label = nrErHist1Label;
	}

	public void setNrErHist2Label(javax.swing.JLabel nrErHist2Label) {
		this.nrErHist2Label = nrErHist2Label;
	}

	public void setNrErHist3Label(javax.swing.JLabel nrErHist3Label) {
		this.nrErHist3Label = nrErHist3Label;
	}

	public void setNrErHist4Label(javax.swing.JLabel nrErHist4Label) {
		this.nrErHist4Label = nrErHist4Label;
	}

	public void setNrErHist5Label(javax.swing.JLabel nrErHist5Label) {
		this.nrErHist5Label = nrErHist5Label;
	}

	public void setNrErrosJFT(javax.swing.JFormattedTextField nrErrosJFT) {
		this.nrErrosJFT = nrErrosJFT;
	}

	public void setNrMHist1Label(javax.swing.JLabel nrMHist1Label) {
		this.nrMHist1Label = nrMHist1Label;
	}

	public void setNrMHist2Label(javax.swing.JLabel nrMHist2Label) {
		this.nrMHist2Label = nrMHist2Label;
	}

	public void setNrMHist3Label(javax.swing.JLabel nrMHist3Label) {
		this.nrMHist3Label = nrMHist3Label;
	}

	public void setNrMHist4Label(javax.swing.JLabel nrMHist4Label) {
		this.nrMHist4Label = nrMHist4Label;
	}

	public void setNrMHist5Label(javax.swing.JLabel nrMHist5Label) {
		this.nrMHist5Label = nrMHist5Label;
	}

	public void setNrMortalidadeJFT(javax.swing.JFormattedTextField nrMortalidadeJFT) {
		this.nrMortalidadeJFT = nrMortalidadeJFT;
	}

	public void setNrPesadosHist1Label(javax.swing.JLabel nrPesadosHist1Label) {
		this.nrPesadosHist1Label = nrPesadosHist1Label;
	}

	public void setNrPesadosHist2Label(javax.swing.JLabel nrPesadosHist2Label) {
		this.nrPesadosHist2Label = nrPesadosHist2Label;
	}

	public void setNrPesadosHist3Label(javax.swing.JLabel nrPesadosHist3Label) {
		this.nrPesadosHist3Label = nrPesadosHist3Label;
	}

	public void setNrPesadosHist4Label(javax.swing.JLabel nrPesadosHist4Label) {
		this.nrPesadosHist4Label = nrPesadosHist4Label;
	}

	public void setNrPesadosHist5Label(javax.swing.JLabel nrPesadosHist5Label) {
		this.nrPesadosHist5Label = nrPesadosHist5Label;
	}

	public void setNrPesadosJFT(javax.swing.JFormattedTextField nrPesadosJFT) {
		this.nrPesadosJFT = nrPesadosJFT;
	}

	public void setPesadosHist1Label(javax.swing.JLabel pesadosHist1Label) {
		this.pesadosHist1Label = pesadosHist1Label;
	}

	public void setPesadosHist2Label(javax.swing.JLabel pesadosHist2Label) {
		this.pesadosHist2Label = pesadosHist2Label;
	}

	public void setPesadosHist3Label(javax.swing.JLabel pesadosHist3Label) {
		this.pesadosHist3Label = pesadosHist3Label;
	}

	public void setPesadosHist4Label(javax.swing.JLabel pesadosHist4Label) {
		this.pesadosHist4Label = pesadosHist4Label;
	}

	public void setPesadosHist5Label(javax.swing.JLabel pesadosHist5Label) {
		this.pesadosHist5Label = pesadosHist5Label;
	}

	public void setPesadosJFT(javax.swing.JFormattedTextField pesadosJFT) {
		this.pesadosJFT = pesadosJFT;
	}

	public void setPesagemJP(javax.swing.JPanel pesagemJP) {
		this.pesagemJP = pesagemJP;
	}

	public void setPesoAmHist1Label(javax.swing.JLabel pesoAmHist1Label) {
		this.pesoAmHist1Label = pesoAmHist1Label;
	}

	public void setPesoAmHist2Label(javax.swing.JLabel pesoAmHist2Label) {
		this.pesoAmHist2Label = pesoAmHist2Label;
	}

	public void setPesoAmHist3Label(javax.swing.JLabel pesoAmHist3Label) {
		this.pesoAmHist3Label = pesoAmHist3Label;
	}

	public void setPesoAmHist4Label(javax.swing.JLabel pesoAmHist4Label) {
		this.pesoAmHist4Label = pesoAmHist4Label;
	}

	public void setPesoAmHist5Label(javax.swing.JLabel pesoAmHist5Label) {
		this.pesoAmHist5Label = pesoAmHist5Label;
	}

	public void setPesoAmostradosJFT(javax.swing.JFormattedTextField pesoAmostradosJFT) {
		this.pesoAmostradosJFT = pesoAmostradosJFT;
	}

	public void setPesoElHist1Label(javax.swing.JLabel pesoElHist1Label) {
		this.pesoElHist1Label = pesoElHist1Label;
	}

	public void setPesoElHist2Label(javax.swing.JLabel pesoElHist2Label) {
		this.pesoElHist2Label = pesoElHist2Label;
	}

	public void setPesoElHist3Label(javax.swing.JLabel pesoElHist3Label) {
		this.pesoElHist3Label = pesoElHist3Label;
	}

	public void setPesoElHist4Label(javax.swing.JLabel pesoElHist4Label) {
		this.pesoElHist4Label = pesoElHist4Label;
	}

	public void setPesoElHist5Label(javax.swing.JLabel pesoElHist5Label) {
		this.pesoElHist5Label = pesoElHist5Label;
	}

	public void setPesoEliminadosJFT(javax.swing.JFormattedTextField pesoEliminadosJFT) {
		this.pesoEliminadosJFT = pesoEliminadosJFT;
	}

	public void setPesoErHist1Label(javax.swing.JLabel pesoErHist1Label) {
		this.pesoErHist1Label = pesoErHist1Label;
	}

	public void setPesoErHist2Label(javax.swing.JLabel pesoErHist2Label) {
		this.pesoErHist2Label = pesoErHist2Label;
	}

	public void setPesoErHist3Label(javax.swing.JLabel pesoErHist3Label) {
		this.pesoErHist3Label = pesoErHist3Label;
	}

	public void setPesoErHist4Label(javax.swing.JLabel pesoErHist4Label) {
		this.pesoErHist4Label = pesoErHist4Label;
	}

	public void setPesoErHist5Label(javax.swing.JLabel pesoErHist5Label) {
		this.pesoErHist5Label = pesoErHist5Label;
	}

	public void setPesoErrosJFT(javax.swing.JFormattedTextField pesoErrosJFT) {
		this.pesoErrosJFT = pesoErrosJFT;
	}

	public void setPesoMHist1Label(javax.swing.JLabel pesoMHist1Label) {
		this.pesoMHist1Label = pesoMHist1Label;
	}

	public void setPesoMHist2Label(javax.swing.JLabel pesoMHist2Label) {
		this.pesoMHist2Label = pesoMHist2Label;
	}

	public void setPesoMHist3Label(javax.swing.JLabel pesoMHist3Label) {
		this.pesoMHist3Label = pesoMHist3Label;
	}

	public void setPesoMHist4Label(javax.swing.JLabel pesoMHist4Label) {
		this.pesoMHist4Label = pesoMHist4Label;
	}

	public void setPesoMHist5Label(javax.swing.JLabel pesoMHist5Label) {
		this.pesoMHist5Label = pesoMHist5Label;
	}

	public void setPesoMortalidadeJFT(javax.swing.JFormattedTextField pesoMortalidadeJFT) {
		this.pesoMortalidadeJFT = pesoMortalidadeJFT;
	}

	public void setRegistroLabel(javax.swing.JLabel registroLabel) {
		this.registroLabel = registroLabel;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public void setTrataJFT(javax.swing.JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}

	public JFormattedTextField getAvesAlojadasJFT() {
		return avesAlojadasJFT;
	}

	public JFormattedTextField getAviarioJFT() {
		return aviarioJFT;
	}

	public JFormattedTextField getBaiaJFT() {
		return baiaJFT;
	}

	public JPanel getBaiaJP() {
		return baiaJP;
	}

	public JFormattedTextField getLadoJFT() {
		return ladoJFT;
	}

	public JFormattedTextField getLinhagemJFT() {
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

	public JFormattedTextField getNrAmostradosJFT() {
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

	public JFormattedTextField getNrEliminadosJFT() {
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

	public JFormattedTextField getNrErrosJFT() {
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

	public JFormattedTextField getNrMortalidadeJFT() {
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

	public JFormattedTextField getNrPesadosJFT() {
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

	public JFormattedTextField getPesadosJFT() {
		return pesadosJFT;
	}

	public JPanel getPesagemJP() {
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

	public JFormattedTextField getPesoAmostradosJFT() {
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

	public JFormattedTextField getPesoEliminadosJFT() {
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

	public JFormattedTextField getPesoErrosJFT() {
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

	public JFormattedTextField getPesoMortalidadeJFT() {
		return pesoMortalidadeJFT;
	}

	public JLabel getRegistroLabel() {
		return registroLabel;
	}

	public JFormattedTextField getSexoJFT() {
		return sexoJFT;
	}

	public JFormattedTextField getTrataJFT() {
		return trataJFT;
	}

	public javax.swing.JFormattedTextField getControleMortalidadeJFT() {
		return controleMortalidadeJFT;
	}

	public void setControleMortalidadeJFT(javax.swing.JFormattedTextField controleMortalidadeJFT) {
		this.controleMortalidadeJFT = controleMortalidadeJFT;
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

	public javax.swing.JFormattedTextField getControleAmostradosJFT() {
		return controleAmostradosJFT;
	}

	public void setControleAmostradosJFT(javax.swing.JFormattedTextField controleAmostradosJFT) {
		this.controleAmostradosJFT = controleAmostradosJFT;
	}

	public javax.swing.JFormattedTextField getControlePesagemJFT() {
		return controlePesagemJFT;
	}

	public void setControlePesagemJFT(javax.swing.JFormattedTextField controlePesagemJFT) {
		this.controlePesagemJFT = controlePesagemJFT;
	}

	public javax.swing.JPanel getPnlMortalidade() {
		return pnlMortalidade;
	}

	public void setPnlMortalidade(javax.swing.JPanel pnlMortalidade) {
		this.pnlMortalidade = pnlMortalidade;
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
		return ordemPesagemJFT;
	}

	public void setOrdemPesagemJFT(javax.swing.JFormattedTextField ordemPesagemJFT) {
		this.ordemPesagemJFT = ordemPesagemJFT;
	}

	public javax.swing.JFormattedTextField getOrdemEliminadosJFT() {
		return ordemEliminadosJFT;
	}

	public void setOrdemEliminadosJFT(javax.swing.JFormattedTextField ordemEliminadosJFT) {
		this.ordemEliminadosJFT = ordemEliminadosJFT;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public javax.swing.JPanel getPnlErros() {
		return pnlErros;
	}

	public void setPnlErros(javax.swing.JPanel pnlErros) {
		this.pnlErros = pnlErros;
	}

	public javax.swing.JLabel getOrdemPesagemHist4Label() {
		return ordemPesagemHist4Label;
	}

	public void setOrdemPesagemHist4Label(javax.swing.JLabel ordemPesagemHist4Label) {
		this.ordemPesagemHist4Label = ordemPesagemHist4Label;
	}

	public javax.swing.JLabel getFaseMortalidadeLabel() {
		return faseMortalidadeLabel;
	}

	public void setFaseMortalidadeLabel(javax.swing.JLabel faseMortalidadeLabel) {
		this.faseMortalidadeLabel = faseMortalidadeLabel;
	}

	public javax.swing.JLabel getFaseEliminadosLabel() {
		return faseEliminadosLabel;
	}

	public void setFaseEliminadosLabel(javax.swing.JLabel faseEliminadosLabel) {
		this.faseEliminadosLabel = faseEliminadosLabel;
	}

	public javax.swing.JLabel getFaseErrosLabel() {
		return faseErrosLabel;
	}

	public void setFaseErrosLabel(javax.swing.JLabel faseErrosLabel) {
		this.faseErrosLabel = faseErrosLabel;
	}

	public javax.swing.JLabel getFaseAmostradosLabel() {
		return faseAmostradosLabel;
	}

	public void setFaseAmostradosLabel(javax.swing.JLabel faseAmostradosLabel) {
		this.faseAmostradosLabel = faseAmostradosLabel;
	}

	public javax.swing.JLabel getFasePesagemLabel() {
		return fasePesagemLabel;
	}

	public void setFasePesagemLabel(javax.swing.JLabel fasePesagemLabel) {
		this.fasePesagemLabel = fasePesagemLabel;
	}

	public javax.swing.JLabel getOrdemMortalidadeHist1Label() {
		return ordemMortalidadeHist1Label;
	}

	public void setOrdemMortalidadeHist1Label(javax.swing.JLabel ordemMortalidadeHist1Label) {
		this.ordemMortalidadeHist1Label = ordemMortalidadeHist1Label;
	}

	public javax.swing.JLabel getOrdemMortalidadeHist2Label() {
		return ordemMortalidadeHist2Label;
	}

	public void setOrdemMortalidadeHist2Label(javax.swing.JLabel ordemMortalidadeHist2Label) {
		this.ordemMortalidadeHist2Label = ordemMortalidadeHist2Label;
	}

	public javax.swing.JLabel getOrdemMortalidadeHist3Label() {
		return ordemMortalidadeHist3Label;
	}

	public void setOrdemMortalidadeHist3Label(javax.swing.JLabel ordemMortalidadeHist3Label) {
		this.ordemMortalidadeHist3Label = ordemMortalidadeHist3Label;
	}

	public javax.swing.JLabel getOrdemMortalidadeHist5Label() {
		return ordemMortalidadeHist5Label;
	}

	public void setOrdemMortalidadeHist5Label(javax.swing.JLabel ordemMortalidadeHist5Label) {
		this.ordemMortalidadeHist5Label = ordemMortalidadeHist5Label;
	}

	public javax.swing.JLabel getOrdemMortalidadeHist4Label() {
		return ordemMortalidadeHist4Label;
	}

	public void setOrdemMortalidadeHist4Label(javax.swing.JLabel ordemMortalidadeHist4Label) {
		this.ordemMortalidadeHist4Label = ordemMortalidadeHist4Label;
	}

	public javax.swing.JLabel getOrdemErHist4Label() {
		return ordemErHist4Label;
	}

	public void setOrdemErHist4Label(javax.swing.JLabel ordemErHist4Label) {
		this.ordemErHist4Label = ordemErHist4Label;
	}

	public javax.swing.JLabel getOrdemAmHist4Label() {
		return ordemAmHist4Label;
	}

	public void setOrdemAmHist4Label(javax.swing.JLabel ordemAmHist4Label) {
		this.ordemAmHist4Label = ordemAmHist4Label;
	}
}
