package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class ViewDesempenhoP extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JFormattedTextField avesAlojadasJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JPanel consumoJP;
	private javax.swing.JFormattedTextField controleBaiaJFT;
	private javax.swing.JFormattedTextField controleRacaoJFT;
	private javax.swing.JLabel fornecidaHist1Label;
	private javax.swing.JLabel fornecidaHist2Label;
	private javax.swing.JLabel fornecidaHist3Label;
	private javax.swing.JLabel fornecidaHist4Label;
	private javax.swing.JLabel fornecidaHist5Label;
	private javax.swing.JFormattedTextField fornecidaJFT;
	private javax.swing.JLabel idadeHist1Label;
	private javax.swing.JLabel idadeHist2Label;
	private javax.swing.JLabel idadeHist3Label;
	private javax.swing.JLabel idadeHist4Label;
	private javax.swing.JLabel idadeHist5Label;
	private javax.swing.JFormattedTextField idadeJFT;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JFormattedTextField ladoJFT;
	private javax.swing.JFormattedTextField linhagemJFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JFormattedTextField ordemJFT;
	private javax.swing.JPanel pesagemJP;
	private javax.swing.JLabel registroLabel;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JLabel sobraHist1Label;
	private javax.swing.JLabel sobraHist2Label;
	private javax.swing.JLabel sobraHist3Label;
	private javax.swing.JLabel sobraHist4Label;
	private javax.swing.JLabel sobraHist5Label;
	private javax.swing.JFormattedTextField sobraJFT;
	private javax.swing.JFormattedTextField trataJFT;
	private JPanel panel_1;
	private JLabel label;
	private JLabel ordemMHist3Label;
	private JLabel ordemMHist4Label;
	private JLabel label_3;
	private JLabel ordemMHist1Label;
	private JLabel ordemMHist2Label;
	private JLabel ordemMHist5Label;
	private JFormattedTextField ordemMortalidade;
	private JLabel idadeMHist2Label;
	private JLabel idadeMHist3Label;
	private JLabel idadeMHist4Label;
	private JLabel idadeMHist1Label;
	private JLabel label_11;
	private JLabel idadeMHist5Label;
	private JFormattedTextField idadeMortalidade;
	private JLabel label_13;
	private JLabel nrMHist1Label;
	private JLabel nrMHist2Label;
	private JLabel nrMHist3Label;
	private JLabel nrMHist4Label;
	private JLabel nrMHist5Label;
	private JFormattedTextField nrMortalidade;
	private JLabel label_19;
	private JLabel pesoMHist4Label;
	private JLabel pesoMHist3Label;
	private JLabel pesoMHist2Label;
	private JLabel pesoMHist1Label;
	private JLabel pesoMHist5Label;
	private JFormattedTextField pesoMortalidade;
	private JPanel pnlMortalidade;
	private JFormattedTextField controleMortalidade;
	private JPanel pnlEliminados;
	private JPanel panel_3;
	private JLabel label_25;
	private JFormattedTextField controleEliminados;
	private JLabel label_26;
	private JFormattedTextField pesoEliminados;
	private JFormattedTextField NrEliminados;
	private JFormattedTextField idadeEliminados;
	private JFormattedTextField ordemEliminados;
	private JLabel ordemElHist5Label;
	private JLabel idadeELHist5Label;
	private JLabel nrElHist5Label;
	private JLabel pesoElHist5Label;
	private JLabel pesoElHist4Label;
	private JLabel nrElHist4Label;
	private JLabel idadeELHist4Label;
	private JLabel ordemElHist4Label;
	private JLabel ordemElHist3Label;
	private JLabel idadeELHist3Label;
	private JLabel nrElHist3Label;
	private JLabel pesoElHist3Label;
	private JLabel pesoElHist2Label;
	private JLabel nrElHist2Label;
	private JLabel idadeELHist2Label;
	private JLabel ordemElHist2Label;
	private JLabel ordemElHist1Label;
	private JLabel idadeELHist1Label;
	private JLabel nrElHist1Label;
	private JLabel pesoElHist1Label;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JPanel panel_7;
	private JLabel label_51;
	private JLabel label_127;
	private JFormattedTextField controleFornecida;
	private JLabel label_128;
	private JFormattedTextField controleSobra;
	private JLabel faseConsumoLabel;
	private JLabel faseMortalidadeLabel;
	private JLabel faseEliminadosLabel;
	private JPanel panel_4;
	private JLabel faseErrosLabel;
	private JPanel panel_8;
	private JLabel lblErros;
	private JFormattedTextField ordemErros;
	private JLabel ErrosHist5Label;
	private JLabel ErrosHist4Label;
	private JLabel ErrosHist3Label;
	private JLabel ErrosHist2Label;
	private JLabel ErrosHist1Label;
	private JLabel label_59;
	private JLabel idadeErrosHist5Label;
	private JLabel idadeErrosHist4Label;
	private JLabel idadeErrosHist3Label;
	private JLabel idadeErrosHist1Label;
	private JLabel label_64;
	private JLabel idadeErrosHist2Label;
	private JFormattedTextField idadeErros;
	private JLabel label_66;
	private JLabel nrErrosHist1Label;
	private JLabel nrErrosHist2Label;
	private JLabel nrErrosHist3Label;
	private JLabel nrErrosHist4Label;
	private JLabel nrErrosHist5Label;
	private JFormattedTextField nrErros;
	private JFormattedTextField pesoErros;
	private JLabel pesoErrosHist5Label;
	private JLabel pesoErrosHist4Label;
	private JLabel pesoErrosHist3Label;
	private JLabel pesoErrosHist2Label;
	private JLabel pesoErrosHist1Label;
	private JLabel label_132;
	private JLabel label_133;
	private JFormattedTextField controleErros;
	private JPanel panel_5;
	private JLabel faseEmostradosLabel;
	private JPanel panel_9;
	private JLabel lblAmostrados;
	private JFormattedTextField ordemAmostrados;
	private JLabel ordemAmHist5Label;
	private JLabel ordemAmHist4Label;
	private JLabel ordemAmHist3Label;
	private JLabel ordemAmHist2Label;
	private JLabel ordemAmHist1Label;
	private JLabel label_83;
	private JLabel label_84;
	private JLabel idadeAmHist4Label;
	private JLabel idadeAmHist3Label;
	private JLabel idadeAmHist1Label;
	private JLabel label_88;
	private JLabel idadeAmHist2Label;
	private JFormattedTextField idadeAmostrados;
	private JLabel label_90;
	private JLabel label_91;
	private JLabel label_92;
	private JLabel label_93;
	private JLabel label_94;
	private JLabel idadeAmHist5Label;
	private JFormattedTextField nrAmostrados;
	private JFormattedTextField pesoAmostrados;
	private JLabel pesoAmHist5Label;
	private JLabel pesoAmHist4Label;
	private JLabel pesoAmHist3Label;
	private JLabel pesoAmHist2Label;
	private JLabel pesoAmHist1Label;
	private JLabel label_101;
	private JLabel label_134;
	private JFormattedTextField controleAmostrados;
	private JPanel panel_6;
	private JLabel fasePesadosLabel;
	private JPanel panel_10;
	private JLabel lblPesados;
	private JFormattedTextField ordemPesados;
	private JLabel ordemPesadosHist5Label;
	private JLabel ordemPesadosHist4Label;
	private JLabel ordemPesadosHist3Label;
	private JLabel ordemPesadosHist2Label;
	private JLabel ordemPesadosHist1Label;
	private JLabel label_108;
	private JLabel idadePesadosHist5Label;
	private JLabel idadePesadosHist4Label;
	private JLabel idadePesadosHist3Label;
	private JLabel idadePesadosHist1Label;
	private JLabel label_113;
	private JLabel idadePesadosHist2Label;
	private JFormattedTextField idadePesados;
	private JLabel label_115;
	private JLabel nrPesadosHist1Label;
	private JLabel nrPesadosHist2Label;
	private JLabel nrPesadosHist3Label;
	private JLabel nrPesadosHist4Label;
	private JLabel nrPesadosHist5Label;
	private JFormattedTextField nrPesados;
	private JFormattedTextField pesoPesados;
	private JLabel pesoPesadosHist5Label;
	private JLabel pesoPesadosHist4Label;
	private JLabel pesoPesadosHist3Label;
	private JLabel pesoPesadosHist2Label;
	private JLabel pesoPesadosHist1Label;
	private JLabel label_126;
	private JLabel label_135;
	private JFormattedTextField controlePesados;

	public ViewDesempenhoP() {
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
		pesagemJP = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		baiaJP = new javax.swing.JPanel();
		avesAlojadasJFT = new javax.swing.JFormattedTextField();
		jLabel36 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		controleBaiaJFT = new javax.swing.JFormattedTextField();
		baiaJFT = new javax.swing.JFormattedTextField();
		jLabel32 = new javax.swing.JLabel();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel33 = new javax.swing.JLabel();
		ladoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new javax.swing.JLabel();
		linhagemJFT = new javax.swing.JFormattedTextField();
		jLabel35 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		registroLabel = new javax.swing.JLabel();
		consumoJP = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		controleRacaoJFT = new javax.swing.JFormattedTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setFont(new Font("Tahoma", Font.BOLD, 11));
		fornecidaHist4Label = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		sobraHist4Label = new javax.swing.JLabel();
		fornecidaJFT = new javax.swing.JFormattedTextField();
		fornecidaHist5Label = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		sobraHist5Label = new javax.swing.JLabel();
		sobraJFT = new javax.swing.JFormattedTextField();
		fornecidaHist1Label = new javax.swing.JLabel();
		sobraHist1Label = new javax.swing.JLabel();
		fornecidaHist2Label = new javax.swing.JLabel();
		sobraHist2Label = new javax.swing.JLabel();
		fornecidaHist3Label = new javax.swing.JLabel();
		sobraHist3Label = new javax.swing.JLabel();
		idadeHist1Label = new javax.swing.JLabel();
		idadeHist2Label = new javax.swing.JLabel();
		idadeHist3Label = new javax.swing.JLabel();
		idadeHist4Label = new javax.swing.JLabel();
		idadeHist5Label = new javax.swing.JLabel();
		idadeJFT = new javax.swing.JFormattedTextField();
		jLabel13 = new javax.swing.JLabel();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		ordemJFT = new javax.swing.JFormattedTextField();
		jLabel14 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		pesagemJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));


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
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel39).addGap(36, 36, 36)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel40).addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		
		panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		faseErrosLabel = new JLabel();
		faseErrosLabel.setText("Fase 1 (Idade 28)");
		faseErrosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faseErrosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		panel_8 = new JPanel();
		panel_8.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		lblErros = new JLabel();
		lblErros.setText("Erros");
		lblErros.setHorizontalAlignment(SwingConstants.CENTER);
		lblErros.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		ordemErros = new JFormattedTextField();
		ordemErros.setHorizontalAlignment(SwingConstants.CENTER);
		ordemErros.setEnabled(false);
		
		ErrosHist5Label = new JLabel();
		ErrosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ErrosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ErrosHist4Label = new JLabel();
		ErrosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ErrosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ErrosHist3Label = new JLabel();
		ErrosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ErrosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ErrosHist2Label = new JLabel();
		ErrosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ErrosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ErrosHist1Label = new JLabel();
		ErrosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ErrosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_59 = new JLabel();
		label_59.setText("Ordem");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadeErrosHist5Label = new JLabel();
		idadeErrosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErrosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeErrosHist4Label = new JLabel();
		idadeErrosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErrosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeErrosHist3Label = new JLabel();
		idadeErrosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErrosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeErrosHist1Label = new JLabel();
		idadeErrosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErrosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_64 = new JLabel();
		label_64.setText("Idade");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadeErrosHist2Label = new JLabel();
		idadeErrosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErrosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeErros = new JFormattedTextField();
		idadeErros.setHorizontalAlignment(SwingConstants.CENTER);
		idadeErros.setEnabled(false);
		
		label_66 = new JLabel();
		label_66.setText("Nr.");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		
		nrErrosHist1Label = new JLabel();
		nrErrosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrErrosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrErrosHist2Label = new JLabel();
		nrErrosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrErrosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrErrosHist3Label = new JLabel();
		nrErrosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrErrosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrErrosHist4Label = new JLabel();
		nrErrosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrErrosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrErrosHist5Label = new JLabel();
		nrErrosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrErrosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrErros = new JFormattedTextField();
		nrErros.setHorizontalAlignment(SwingConstants.CENTER);
		nrErros.setEnabled(false);
		
		pesoErros = new JFormattedTextField();
		pesoErros.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErros.setEnabled(false);
		
		pesoErrosHist5Label = new JLabel();
		pesoErrosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErrosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoErrosHist4Label = new JLabel();
		pesoErrosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErrosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoErrosHist3Label = new JLabel();
		pesoErrosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErrosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoErrosHist2Label = new JLabel();
		pesoErrosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErrosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoErrosHist1Label = new JLabel();
		pesoErrosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoErrosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_132 = new JLabel();
		label_132.setText("Peso");
		label_132.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_133 = new JLabel();
		label_133.setText("Controle");
		label_133.setHorizontalAlignment(SwingConstants.CENTER);
		
		controleErros = new JFormattedTextField();
		controleErros.setHorizontalAlignment(SwingConstants.CENTER);
		controleErros.setEnabled(false);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGap(0, 263, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addComponent(lblErros, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(ordemErros, Alignment.LEADING)
								.addComponent(ErrosHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ErrosHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ErrosHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ErrosHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ErrosHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_59, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
									.addComponent(idadeErrosHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErrosHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErrosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErrosHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_64, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeErrosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(idadeErros, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(nrErrosHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrErrosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrErrosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrErrosHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrErrosHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(nrErros, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pesoErros)
								.addComponent(pesoErrosHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErrosHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErrosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErrosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoErrosHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_132, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_133, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(controleErros, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
					.addGap(86))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 218, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblErros)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_8.createSequentialGroup()
									.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_59)
										.addComponent(label_64))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addComponent(ErrosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeErrosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addComponent(ErrosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeErrosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_8.createSequentialGroup()
											.addComponent(ErrosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ErrosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ErrosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_8.createSequentialGroup()
											.addComponent(idadeErrosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadeErrosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadeErrosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_8.createSequentialGroup()
									.addComponent(pesoErrosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoErrosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoErrosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoErrosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_133, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoErrosHist5Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemErros, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_66)
								.addComponent(label_132))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrErrosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrErrosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrErrosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrErrosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrErrosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrErros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(idadeErros, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoErros, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleErros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16))
		);
		panel_8.setLayout(gl_panel_8);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(faseErrosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(panel_8, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addComponent(faseErrosLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		panel_4.setLayout(gl_panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		faseEmostradosLabel = new JLabel();
		faseEmostradosLabel.setText("Fase 1 (Idade 28)");
		faseEmostradosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faseEmostradosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		panel_9 = new JPanel();
		panel_9.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		lblAmostrados = new JLabel();
		lblAmostrados.setText("Amostrados");
		lblAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmostrados.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		ordemAmostrados = new JFormattedTextField();
		ordemAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmostrados.setEnabled(false);
		
		ordemAmHist5Label = new JLabel();
		ordemAmHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemAmHist4Label = new JLabel();
		ordemAmHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemAmHist3Label = new JLabel();
		ordemAmHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemAmHist2Label = new JLabel();
		ordemAmHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemAmHist1Label = new JLabel();
		ordemAmHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemAmHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_83 = new JLabel();
		label_83.setText("Ordem");
		label_83.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_84 = new JLabel();
		label_84.setHorizontalAlignment(SwingConstants.CENTER);
		label_84.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeAmHist4Label = new JLabel();
		idadeAmHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeAmHist3Label = new JLabel();
		idadeAmHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeAmHist1Label = new JLabel();
		idadeAmHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_88 = new JLabel();
		label_88.setText("Idade");
		label_88.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadeAmHist2Label = new JLabel();
		idadeAmHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeAmostrados = new JFormattedTextField();
		idadeAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmostrados.setEnabled(false);
		
		label_90 = new JLabel();
		label_90.setText("Nr.");
		label_90.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_91 = new JLabel();
		label_91.setHorizontalAlignment(SwingConstants.CENTER);
		label_91.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_92 = new JLabel();
		label_92.setHorizontalAlignment(SwingConstants.CENTER);
		label_92.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_93 = new JLabel();
		label_93.setHorizontalAlignment(SwingConstants.CENTER);
		label_93.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_94 = new JLabel();
		label_94.setHorizontalAlignment(SwingConstants.CENTER);
		label_94.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeAmHist5Label = new JLabel();
		idadeAmHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeAmHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrAmostrados = new JFormattedTextField();
		nrAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		nrAmostrados.setEnabled(false);
		
		pesoAmostrados = new JFormattedTextField();
		pesoAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmostrados.setEnabled(false);
		
		pesoAmHist5Label = new JLabel();
		pesoAmHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoAmHist4Label = new JLabel();
		pesoAmHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoAmHist3Label = new JLabel();
		pesoAmHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoAmHist2Label = new JLabel();
		pesoAmHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoAmHist1Label = new JLabel();
		pesoAmHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoAmHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_101 = new JLabel();
		label_101.setText("Peso");
		label_101.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_134 = new JLabel();
		label_134.setText("Controle");
		label_134.setHorizontalAlignment(SwingConstants.CENTER);
		
		controleAmostrados = new JFormattedTextField();
		controleAmostrados.setHorizontalAlignment(SwingConstants.CENTER);
		controleAmostrados.setEnabled(false);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 263, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAmostrados, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(ordemAmostrados, Alignment.LEADING)
								.addComponent(ordemAmHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemAmHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_83, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
									.addComponent(label_84, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeAmHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeAmHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeAmHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_88, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeAmHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(idadeAmostrados, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(label_91, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_92, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_93, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_94, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeAmHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(nrAmostrados, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pesoAmostrados)
								.addComponent(pesoAmHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoAmHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoAmHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoAmHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoAmHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_101, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_134, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(controleAmostrados, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
					.addGap(86))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 218, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAmostrados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_9.createSequentialGroup()
									.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_83)
										.addComponent(label_88))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_9.createSequentialGroup()
											.addComponent(ordemAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_9.createSequentialGroup()
											.addComponent(idadeAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadeAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_9.createSequentialGroup()
									.addComponent(pesoAmHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoAmHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoAmHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoAmHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_134, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoAmHist5Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemAmostrados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_90)
								.addComponent(label_101))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_93, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_94, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeAmHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrAmostrados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(idadeAmostrados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoAmostrados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleAmostrados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16))
		);
		panel_9.setLayout(gl_panel_9);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGap(0, 287, Short.MAX_VALUE)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addComponent(faseEmostradosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(panel_9, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(faseEmostradosLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		panel_5.setLayout(gl_panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		fasePesadosLabel = new JLabel();
		fasePesadosLabel.setText("Fase 1 (Idade 28)");
		fasePesadosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fasePesadosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		panel_10 = new JPanel();
		panel_10.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		lblPesados = new JLabel();
		lblPesados.setText("Pesados");
		lblPesados.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesados.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		ordemPesados = new JFormattedTextField();
		ordemPesados.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesados.setEnabled(false);
		
		ordemPesadosHist5Label = new JLabel();
		ordemPesadosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesadosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemPesadosHist4Label = new JLabel();
		ordemPesadosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesadosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemPesadosHist3Label = new JLabel();
		ordemPesadosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesadosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemPesadosHist2Label = new JLabel();
		ordemPesadosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesadosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemPesadosHist1Label = new JLabel();
		ordemPesadosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemPesadosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_108 = new JLabel();
		label_108.setText("Ordem");
		label_108.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadePesadosHist5Label = new JLabel();
		idadePesadosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesadosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadePesadosHist4Label = new JLabel();
		idadePesadosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesadosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadePesadosHist3Label = new JLabel();
		idadePesadosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesadosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadePesadosHist1Label = new JLabel();
		idadePesadosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesadosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_113 = new JLabel();
		label_113.setText("Idade");
		label_113.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadePesadosHist2Label = new JLabel();
		idadePesadosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesadosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadePesados = new JFormattedTextField();
		idadePesados.setHorizontalAlignment(SwingConstants.CENTER);
		idadePesados.setEnabled(false);
		
		label_115 = new JLabel();
		label_115.setText("Nr.");
		label_115.setHorizontalAlignment(SwingConstants.CENTER);
		
		nrPesadosHist1Label = new JLabel();
		nrPesadosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesadosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrPesadosHist2Label = new JLabel();
		nrPesadosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesadosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrPesadosHist3Label = new JLabel();
		nrPesadosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesadosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrPesadosHist4Label = new JLabel();
		nrPesadosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesadosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrPesadosHist5Label = new JLabel();
		nrPesadosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesadosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrPesados = new JFormattedTextField();
		nrPesados.setHorizontalAlignment(SwingConstants.CENTER);
		nrPesados.setEnabled(false);
		
		pesoPesados = new JFormattedTextField();
		pesoPesados.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesados.setEnabled(false);
		
		pesoPesadosHist5Label = new JLabel();
		pesoPesadosHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesadosHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoPesadosHist4Label = new JLabel();
		pesoPesadosHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesadosHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoPesadosHist3Label = new JLabel();
		pesoPesadosHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesadosHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoPesadosHist2Label = new JLabel();
		pesoPesadosHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesadosHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoPesadosHist1Label = new JLabel();
		pesoPesadosHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoPesadosHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_126 = new JLabel();
		label_126.setText("Peso");
		label_126.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_135 = new JLabel();
		label_135.setText("Controle");
		label_135.setHorizontalAlignment(SwingConstants.CENTER);
		
		controlePesados = new JFormattedTextField();
		controlePesados.setHorizontalAlignment(SwingConstants.CENTER);
		controlePesados.setEnabled(false);
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGap(0, 263, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPesados, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(ordemPesados, Alignment.LEADING)
								.addComponent(ordemPesadosHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemPesadosHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemPesadosHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemPesadosHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemPesadosHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_108, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING, false)
									.addComponent(idadePesadosHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadePesadosHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadePesadosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadePesadosHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_113, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadePesadosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(idadePesados, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
								.addComponent(label_115, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(nrPesadosHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrPesadosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrPesadosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrPesadosHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrPesadosHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(nrPesados, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pesoPesados)
								.addComponent(pesoPesadosHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoPesadosHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoPesadosHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoPesadosHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoPesadosHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_126, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_135, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(controlePesados, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
					.addGap(86))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 218, Short.MAX_VALUE)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPesados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_10.createSequentialGroup()
									.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_108)
										.addComponent(label_113))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemPesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadePesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemPesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadePesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_10.createSequentialGroup()
											.addComponent(ordemPesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemPesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemPesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_10.createSequentialGroup()
											.addComponent(idadePesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadePesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadePesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_10.createSequentialGroup()
									.addComponent(pesoPesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoPesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoPesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoPesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_135, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoPesadosHist5Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemPesados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_10.createSequentialGroup()
							.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_115)
								.addComponent(label_126))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrPesadosHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrPesadosHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrPesadosHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrPesadosHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrPesadosHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrPesados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(idadePesados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoPesados, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controlePesados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16))
		);
		panel_10.setLayout(gl_panel_10);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 287, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
						.addComponent(fasePesadosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(panel_10, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(fasePesadosLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		panel_6.setLayout(gl_panel_6);

		javax.swing.GroupLayout pesagemJPLayout = new javax.swing.GroupLayout(pesagemJP);
		pesagemJPLayout.setHorizontalGroup(
			pesagemJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pesagemJPLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
		);
		pesagemJPLayout.setVerticalGroup(
			pesagemJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pesagemJPLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(pesagemJPLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jPanel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_6, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_5, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		pesagemJP.setLayout(pesagemJPLayout);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		try {
			avesAlojadasJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		avesAlojadasJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		avesAlojadasJFT.setEnabled(false);

		jLabel36.setText("Controle");

		jLabel31.setText("Baia");

		try {
			controleBaiaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleBaiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleBaiaJFT.setEnabled(false);

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

		jLabel33.setText("Lado");

		try {
			ladoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ladoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ladoJFT.setEnabled(false);

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
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trataJFT.setEnabled(false);

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap().addComponent(jLabel44)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel31)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel33).addGap(11)
						.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel32)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel34)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel45)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel35)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel36)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(57)));
		baiaJPLayout
				.setVerticalGroup(
						baiaJPLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
										.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel31)
												.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel44)
												.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel33).addComponent(jLabel32)
												.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel34)
												.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel45)
												.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel35)
												.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel36).addComponent(controleBaiaJFT,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		baiaJP.setLayout(baiaJPLayout);

		registroLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registroLabel.setForeground(new java.awt.Color(0, 153, 255));
		registroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registroLabel.setText("Registro salvo com sucesso!!");

		consumoJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel1.setText("Controle");

		try {
			controleRacaoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleRacaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleRacaoJFT.setEnabled(false);

		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("Consumo de Ração");

		fornecidaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist4Label.setEnabled(false);

		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("Fornecida");

		sobraHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist4Label.setEnabled(false);

		try {
			fornecidaJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		fornecidaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		fornecidaJFT.setEnabled(false);

		fornecidaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist5Label.setEnabled(false);

		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("Sobra");

		sobraHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist5Label.setEnabled(false);

		try {
			sobraJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		sobraJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		sobraJFT.setEnabled(false);

		fornecidaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist1Label.setEnabled(false);

		sobraHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist1Label.setEnabled(false);

		fornecidaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist2Label.setEnabled(false);

		sobraHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist2Label.setEnabled(false);

		fornecidaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist3Label.setEnabled(false);

		sobraHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist3Label.setEnabled(false);

		idadeHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		idadeHist1Label.setEnabled(false);

		idadeHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		idadeHist2Label.setEnabled(false);

		idadeHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		idadeHist3Label.setEnabled(false);

		idadeHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		idadeHist4Label.setEnabled(false);

		idadeHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idadeHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		idadeHist5Label.setEnabled(false);

		try {
			idadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeJFT.setEnabled(false);

		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Idade");

		ordemHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		ordemHist1Label.setEnabled(false);

		ordemHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		ordemHist2Label.setEnabled(false);

		ordemHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		ordemHist3Label.setEnabled(false);

		ordemHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		ordemHist4Label.setEnabled(false);

		ordemHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		ordemHist5Label.setEnabled(false);

		try {
			ordemJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemJFT.setEnabled(false);

		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Ordem");
		
		panel_7 = new JPanel();
		panel_7.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		label_51 = new JLabel();
		label_51.setText("Controles");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Dialog", Font.BOLD, 12));
		
		label_127 = new JLabel();
		label_127.setText("Fornecida");
		label_127.setHorizontalAlignment(SwingConstants.CENTER);
		
		controleFornecida = new JFormattedTextField();
		controleFornecida.setHorizontalAlignment(SwingConstants.CENTER);
		controleFornecida.setEnabled(false);
		
		label_128 = new JLabel();
		label_128.setText("Sobra");
		label_128.setHorizontalAlignment(SwingConstants.CENTER);
		
		controleSobra = new JFormattedTextField();
		controleSobra.setHorizontalAlignment(SwingConstants.CENTER);
		controleSobra.setEnabled(false);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(label_51, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(label_127, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(controleFornecida, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(controleSobra)
								.addComponent(label_128, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_51)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_127)
						.addComponent(label_128))
					.addGap(4)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(controleFornecida, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(controleSobra, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(14))
		);
		panel_7.setLayout(gl_panel_7);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(18)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(ordemHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ordemHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ordemHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ordemHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ordemHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel14, Alignment.LEADING))
											.addGap(12))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)))
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addComponent(idadeHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist1Label, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(fornecidaHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(sobraJFT, Alignment.TRAILING)
										.addComponent(sobraHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(controleRacaoJFT, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel6)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel9)
								.addComponent(jLabel10))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(fornecidaHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel13)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idadeHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(idadeHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(fornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleRacaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel14)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		jPanel2.setLayout(jPanel2Layout);
		
		faseConsumoLabel = new JLabel();
		faseConsumoLabel.setText("Fase 1 (Idade 28)");
		faseConsumoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faseConsumoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

		javax.swing.GroupLayout consumoJPLayout = new javax.swing.GroupLayout(consumoJP);
		consumoJPLayout.setHorizontalGroup(
			consumoJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(consumoJPLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(consumoJPLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(faseConsumoLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
						.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
					.addContainerGap())
		);
		consumoJPLayout.setVerticalGroup(
			consumoJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, consumoJPLayout.createSequentialGroup()
					.addComponent(faseConsumoLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		consumoJP.setLayout(consumoJPLayout);
		
		pnlMortalidade = new JPanel();
		pnlMortalidade.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setText("Mortalidade");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		ordemMHist3Label = new JLabel();
		ordemMHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemMHist4Label = new JLabel();
		ordemMHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_3 = new JLabel();
		label_3.setText("Ordem");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		ordemMHist1Label = new JLabel();
		ordemMHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemMHist2Label = new JLabel();
		ordemMHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemMHist5Label = new JLabel();
		ordemMHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemMortalidade = new JFormattedTextField();
		ordemMortalidade.setHorizontalAlignment(SwingConstants.CENTER);
		ordemMortalidade.setEnabled(false);
		
		idadeMHist2Label = new JLabel();
		idadeMHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeMHist3Label = new JLabel();
		idadeMHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeMHist4Label = new JLabel();
		idadeMHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeMHist1Label = new JLabel();
		idadeMHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_11 = new JLabel();
		label_11.setText("Idade");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		
		idadeMHist5Label = new JLabel();
		idadeMHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeMortalidade = new JFormattedTextField();
		idadeMortalidade.setHorizontalAlignment(SwingConstants.CENTER);
		idadeMortalidade.setEnabled(false);
		
		label_13 = new JLabel();
		label_13.setText("Nr.");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		
		nrMHist1Label = new JLabel();
		nrMHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrMHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrMHist2Label = new JLabel();
		nrMHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrMHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrMHist3Label = new JLabel();
		nrMHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrMHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrMHist4Label = new JLabel();
		nrMHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrMHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrMHist5Label = new JLabel();
		nrMHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrMHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrMortalidade = new JFormattedTextField();
		nrMortalidade.setHorizontalAlignment(SwingConstants.CENTER);
		nrMortalidade.setEnabled(false);
		
		label_19 = new JLabel();
		label_19.setText("Peso");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		
		pesoMHist4Label = new JLabel();
		pesoMHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoMHist3Label = new JLabel();
		pesoMHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoMHist2Label = new JLabel();
		pesoMHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoMHist1Label = new JLabel();
		pesoMHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoMHist5Label = new JLabel();
		pesoMHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoMortalidade = new JFormattedTextField();
		pesoMortalidade.setHorizontalAlignment(SwingConstants.CENTER);
		pesoMortalidade.setEnabled(false);
		
		controleMortalidade = new JFormattedTextField();
		controleMortalidade.setHorizontalAlignment(SwingConstants.CENTER);
		controleMortalidade.setEnabled(false);
		
		JLabel lblControle = new JLabel();
		lblControle.setText("Controle");
		lblControle.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(ordemMortalidade, Alignment.LEADING)
								.addComponent(ordemMHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemMHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemMHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemMHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemMHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(idadeMHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeMHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeMHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeMHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(idadeMHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(idadeMortalidade, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(nrMHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrMHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrMHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrMHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nrMHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(nrMortalidade, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(pesoMortalidade)
								.addComponent(pesoMHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoMHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoMHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoMHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoMHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_19, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblControle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(controleMortalidade, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
					.addGap(86))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_3)
										.addComponent(label_11))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(ordemMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addComponent(idadeMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(ordemMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(ordemMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(idadeMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadeMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(idadeMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(pesoMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(pesoMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblControle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(pesoMHist5Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemMortalidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_13)
								.addComponent(label_19))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrMHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrMHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrMHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrMHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nrMHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(nrMortalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(idadeMortalidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoMortalidade, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleMortalidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(16))
		);
		panel_1.setLayout(gl_panel_1);
		
		faseMortalidadeLabel = new JLabel();
		faseMortalidadeLabel.setText("Fase 1 (Idade 28)");
		faseMortalidadeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faseMortalidadeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_pnlMortalidade = new GroupLayout(pnlMortalidade);
		gl_pnlMortalidade.setHorizontalGroup(
			gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMortalidade.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(faseMortalidadeLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE))
					.addContainerGap(8, Short.MAX_VALUE))
		);
		gl_pnlMortalidade.setVerticalGroup(
			gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlMortalidade.createSequentialGroup()
					.addComponent(faseMortalidadeLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlMortalidade.setLayout(gl_pnlMortalidade);
		
		pnlEliminados = new JPanel();
		pnlEliminados.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		label_25 = new JLabel();
		label_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_25.setText("Eliminados");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		
		controleEliminados = new JFormattedTextField();
		controleEliminados.setHorizontalAlignment(SwingConstants.CENTER);
		controleEliminados.setEnabled(false);
		
		label_26 = new JLabel();
		label_26.setText("Controle");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		
		pesoEliminados = new JFormattedTextField();
		pesoEliminados.setHorizontalAlignment(SwingConstants.CENTER);
		pesoEliminados.setEnabled(false);
		
		NrEliminados = new JFormattedTextField();
		NrEliminados.setHorizontalAlignment(SwingConstants.CENTER);
		NrEliminados.setEnabled(false);
		
		idadeEliminados = new JFormattedTextField();
		idadeEliminados.setHorizontalAlignment(SwingConstants.CENTER);
		idadeEliminados.setEnabled(false);
		
		ordemEliminados = new JFormattedTextField();
		ordemEliminados.setHorizontalAlignment(SwingConstants.CENTER);
		ordemEliminados.setEnabled(false);
		
		ordemElHist5Label = new JLabel();
		ordemElHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemElHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeELHist5Label = new JLabel();
		idadeELHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeELHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrElHist5Label = new JLabel();
		nrElHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrElHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoElHist5Label = new JLabel();
		pesoElHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoElHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoElHist4Label = new JLabel();
		pesoElHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoElHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrElHist4Label = new JLabel();
		nrElHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrElHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeELHist4Label = new JLabel();
		idadeELHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeELHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemElHist4Label = new JLabel();
		ordemElHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemElHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemElHist3Label = new JLabel();
		ordemElHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemElHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeELHist3Label = new JLabel();
		idadeELHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeELHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrElHist3Label = new JLabel();
		nrElHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrElHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoElHist3Label = new JLabel();
		pesoElHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoElHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoElHist2Label = new JLabel();
		pesoElHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoElHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrElHist2Label = new JLabel();
		nrElHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrElHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeELHist2Label = new JLabel();
		idadeELHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeELHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemElHist2Label = new JLabel();
		ordemElHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemElHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		ordemElHist1Label = new JLabel();
		ordemElHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		ordemElHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		idadeELHist1Label = new JLabel();
		idadeELHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		idadeELHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		nrElHist1Label = new JLabel();
		nrElHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		nrElHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pesoElHist1Label = new JLabel();
		pesoElHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoElHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		label_47 = new JLabel();
		label_47.setText("Peso");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_48 = new JLabel();
		label_48.setText("Nr.");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_49 = new JLabel();
		label_49.setText("Idade");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_50 = new JLabel();
		label_50.setText("Ordem");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(ordemElHist4Label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idadeELHist4Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nrElHist4Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pesoElHist4Label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(38)
									.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(11)
									.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(ordemElHist1Label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(idadeELHist1Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nrElHist1Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pesoElHist1Label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
									.addComponent(ordemElHist2Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(idadeELHist2Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nrElHist2Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pesoElHist2Label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
							.addGap(95))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(219, Short.MAX_VALUE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(ordemElHist3Label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idadeELHist3Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nrElHist3Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pesoElHist3Label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label_25, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addComponent(ordemEliminados, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(idadeEliminados, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(NrEliminados, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(pesoEliminados, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_3.createSequentialGroup()
											.addComponent(ordemElHist5Label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(idadeELHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(nrElHist5Label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(pesoElHist5Label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(controleEliminados, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(31, Short.MAX_VALUE))))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_25)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(label_49)
						.addComponent(label_48)
						.addComponent(label_47)
						.addComponent(label_50))
					.addGap(11)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(ordemElHist1Label, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(idadeELHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nrElHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pesoElHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(pesoElHist2Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(nrElHist2Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(idadeELHist2Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(ordemElHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(idadeELHist3Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(ordemElHist3Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(nrElHist3Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(pesoElHist3Label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(pesoElHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nrElHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(idadeELHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(ordemElHist4Label, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(pesoElHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nrElHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(idadeELHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(ordemElHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_26, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(9)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(idadeEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NrEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pesoEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(controleEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ordemEliminados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		panel_3.setLayout(gl_panel_3);
		
		faseEliminadosLabel = new JLabel();
		faseEliminadosLabel.setText("Fase 1 (Idade 28)");
		faseEliminadosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		faseEliminadosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_pnlEliminados = new GroupLayout(pnlEliminados);
		gl_pnlEliminados.setHorizontalGroup(
			gl_pnlEliminados.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlEliminados.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlEliminados.createParallelGroup(Alignment.TRAILING)
						.addComponent(faseEliminadosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlEliminados.setVerticalGroup(
			gl_pnlEliminados.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlEliminados.createSequentialGroup()
					.addComponent(faseEliminadosLabel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlEliminados.setLayout(gl_pnlEliminados);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(pesagemJP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlMortalidade, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlEliminados, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
						.addComponent(registroLabel, GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
					.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlMortalidade, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlEliminados, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pesagemJP, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registroLabel)
					.addContainerGap(179, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
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

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewDesempenhoP().setVisible(true);
			}
		});
	}




}