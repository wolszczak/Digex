package brf.suino.view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class ViewConsumoSC extends javax.swing.JFrame {

	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JFormattedTextField controleAnimaisJFT;
	private javax.swing.JFormattedTextField controleBaiaJFT;
	private javax.swing.JFormattedTextField controleFornecidaJFT;
	private javax.swing.JFormattedTextField controlePesoJFT;
	private javax.swing.JPanel controleRMEJP1;
	private javax.swing.JPanel controleRMEJP2;
	private javax.swing.JFormattedTextField controleSobraJFT;
	private javax.swing.JLabel fornecidaHist1Label;
	private javax.swing.JLabel pesoHist1Label;
	private javax.swing.JLabel fornecidaHist2Label;
	private javax.swing.JLabel pesoHist2Label;
	private javax.swing.JLabel fornecidaHist3Label;
	private javax.swing.JLabel pesoHist3Label;
	private javax.swing.JLabel fornecidaHist4Label;
	private javax.swing.JLabel pesoHist4Label;
	private javax.swing.JLabel fornecidaHist5Label;
	private javax.swing.JLabel pesoHist5Label;
	private javax.swing.JFormattedTextField fornecidaJFT;
	private javax.swing.JFormattedTextField galpaoJFT;
	private javax.swing.JLabel idadeHist1Label;
	private javax.swing.JLabel data1HistLabel;
	private javax.swing.JLabel idadeHist2Label;
	private javax.swing.JLabel data2HistLabel;
	private javax.swing.JLabel idadeHist3Label;
	private javax.swing.JLabel data3HistLabel;
	private javax.swing.JLabel idadeHist4Label;
	private javax.swing.JLabel data4HistLabel;
	private javax.swing.JLabel idadeHist5Label;
	private javax.swing.JLabel data5HistLabel;
	private javax.swing.JFormattedTextField idadeJFT;
	private javax.swing.JFormattedTextField dataJFT;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
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
	private javax.swing.JLabel controleBaiaLabel;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel consumoJP;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JFormattedTextField nAnimaisJFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JFormattedTextField ordemJFT;
	private javax.swing.JFormattedTextField pesoJFT;
	private javax.swing.JLabel registrosLabel;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JLabel sobraHist1Label;
	private javax.swing.JLabel nAnimaisHist1Label;
	private javax.swing.JLabel sobraHist2Label;
	private javax.swing.JLabel nAnimaisHist2Label;
	private javax.swing.JLabel sobraHist3Label;
	private javax.swing.JLabel nAnimaisHist3Label;
	private javax.swing.JLabel sobraHist4Label;
	private javax.swing.JLabel nAnimaisHist4Label;
	private javax.swing.JLabel sobraHist5Label;
	private javax.swing.JLabel nAnimaisHist5Label;
	private javax.swing.JFormattedTextField sobraJFT;
	private javax.swing.JFormattedTextField trata2JFT;
	private JCheckBox chkUsarColunaExtra;
	private JFormattedTextField trataJFT;

	public ViewConsumoSC() {
		initComponents();
	}


	public JFormattedTextField getBaiaJFT() {
		return baiaJFT;
	}

	public JPanel getBaiaJP() {
		return baiaJP;
	}

	public JFormattedTextField getControleBaiaJFT() {
		return controleBaiaJFT;
	}


	public JFormattedTextField getSexoJFT() {
		return sexoJFT;
	}

	public JFormattedTextField getTrataJFT() {
		return trataJFT;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel5 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		idadeHist1Label = new javax.swing.JLabel();
		idadeHist2Label = new javax.swing.JLabel();
		idadeHist3Label = new javax.swing.JLabel();
		idadeHist4Label = new javax.swing.JLabel();
		idadeHist5Label = new javax.swing.JLabel();
		idadeJFT = new javax.swing.JFormattedTextField();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		controleRMEJP1 = new javax.swing.JPanel();
		jLabel42 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		jLabel47 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		jLabel49 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		controleBaiaLabel = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		controleBaiaJFT = new javax.swing.JFormattedTextField();
		baiaJFT = new javax.swing.JFormattedTextField();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new javax.swing.JLabel();
		trata2JFT = new javax.swing.JFormattedTextField();
		jLabel33 = new javax.swing.JLabel();
		registrosLabel = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		jLabel27 = new javax.swing.JLabel();
		consumoJP = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		fornecidaHist4Label = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		sobraHist4Label = new javax.swing.JLabel();
		fornecidaJFT = new javax.swing.JFormattedTextField();
		fornecidaHist5Label = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		sobraHist5Label = new javax.swing.JLabel();
		sobraJFT = new javax.swing.JFormattedTextField();
		fornecidaHist1Label = new javax.swing.JLabel();
		sobraHist1Label = new javax.swing.JLabel();
		fornecidaHist2Label = new javax.swing.JLabel();
		sobraHist2Label = new javax.swing.JLabel();
		fornecidaHist3Label = new javax.swing.JLabel();
		sobraHist3Label = new javax.swing.JLabel();
		data1HistLabel = new javax.swing.JLabel();
		data2HistLabel = new javax.swing.JLabel();
		data3HistLabel = new javax.swing.JLabel();
		data4HistLabel = new javax.swing.JLabel();
		data5HistLabel = new javax.swing.JLabel();
		dataJFT = new javax.swing.JFormattedTextField();
		jLabel28 = new javax.swing.JLabel();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		ordemJFT = new javax.swing.JFormattedTextField();
		jLabel29 = new javax.swing.JLabel();
		controleRMEJP2 = new javax.swing.JPanel();
		controleFornecidaJFT = new javax.swing.JFormattedTextField();
		controleSobraJFT = new javax.swing.JFormattedTextField();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		controlePesoJFT = new javax.swing.JFormattedTextField();
		controleAnimaisJFT = new javax.swing.JFormattedTextField();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		nAnimaisJFT = new javax.swing.JFormattedTextField();
		pesoJFT = new javax.swing.JFormattedTextField();
		nAnimaisHist5Label = new javax.swing.JLabel();
		pesoHist5Label = new javax.swing.JLabel();
		nAnimaisHist4Label = new javax.swing.JLabel();
		pesoHist4Label = new javax.swing.JLabel();
		nAnimaisHist3Label = new javax.swing.JLabel();
		pesoHist3Label = new javax.swing.JLabel();
		nAnimaisHist2Label = new javax.swing.JLabel();
		pesoHist2Label = new javax.swing.JLabel();
		nAnimaisHist1Label = new javax.swing.JLabel();
		pesoHist1Label = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		trataJFT = new JFormattedTextField();

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel17.setText("Escolha uma opção:");

		jLabel18.setText("[1] - Digitar Próxima Baia");

		jLabel19.setText("[2] - Finalizar Desempenho / Voltar");

		jLabel39.setText("[0] - Sair");

		jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel40.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		opcaoJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel5Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel39).addComponent(jLabel19).addComponent(jLabel18).addComponent(jLabel17))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(jPanel5Layout.createSequentialGroup().addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel17).addGap(18, 18, 18)
						.addComponent(jLabel18).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel19)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE).addComponent(jLabel39)
						.addGap(36, 36, 36)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel40))
						.addContainerGap()));

		jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel20.setText("Escolha uma opção:");

		jLabel21.setText("[1] - Digitar Mortalidade");

		jLabel22.setText("[2] - Digitar Medicados");

		jLabel41.setText("[0] - Sair");

		jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel43.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		opcaoJFT.setEnabled(false);

		jLabel23.setText("[3] - Finalizar Desempenho / Voltar");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup().addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel41).addComponent(jLabel22).addComponent(jLabel21).addComponent(jLabel20)
												.addComponent(jLabel23))
										.addGap(0, 10, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(jLabel20).addGap(18, 18, 18)
						.addComponent(jLabel21).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel22)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel23)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE).addComponent(jLabel41)
						.addGap(36, 36, 36)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel43))
						.addContainerGap()));

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
			fornecidaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
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
			sobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
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
			idadeJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeJFT.setToolTipText("");
		idadeJFT.setEnabled(false);

		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Data");

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
			ordemJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemJFT.setEnabled(false);

		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Ordem");

		controleRMEJP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		try {
			controleFornecidaJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleFornecidaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleFornecidaJFT.setEnabled(false);
		controleFornecidaJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleFornecidaJFTActionPerformed(evt);
			}
		});

		try {
			controleSobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleSobraJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleSobraJFT.setEnabled(false);
		controleSobraJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleSobraJFTActionPerformed(evt);
			}
		});

		jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel42.setText("Controles");

		jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel46.setText("Fornecida");

		jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel47.setText("Sobra");

		try {
			controlePesoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controlePesoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controlePesoJFT.setEnabled(false);
		controlePesoJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controlePesoJFTActionPerformed(evt);
			}
		});

		try {
			controleAnimaisJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleAnimaisJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleAnimaisJFT.setEnabled(false);
		controleAnimaisJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleAnimaisJFTActionPerformed(evt);
			}
		});

		jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel48.setText("Nº Animais");

		jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel49.setText("Peso");

		javax.swing.GroupLayout controleRMEJP1Layout = new javax.swing.GroupLayout(controleRMEJP1);
		controleRMEJP1.setLayout(controleRMEJP1Layout);
		controleRMEJP1Layout.setHorizontalGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addGroup(controleRMEJP1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(controleRMEJP1Layout.createSequentialGroup()
								.addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(controleRMEJP1Layout.createSequentialGroup()
								.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
										jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
										jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(0, 13, Short.MAX_VALUE)))));
		controleRMEJP1Layout.setVerticalGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(controleRMEJP1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel42)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controleRMEJP1Layout.createSequentialGroup()
										.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel46).addComponent(jLabel47)))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controleRMEJP1Layout.createSequentialGroup()
										.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel49).addComponent(jLabel48))
										.addGap(4, 4, 4)
										.addGroup(controleRMEJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))))
						.addContainerGap()));

		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("Nº Animais");

		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("Peso");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(controleRMEJP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(
										jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idadeHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(idadeHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(idadeJFT))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
										jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
										jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
										jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
										jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9).addComponent(jLabel10))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel13)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(idadeHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(idadeHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(idadeJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel14)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel12).addComponent(jLabel11))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)))
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(145, 145, 145)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(controleRMEJP1,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		controleBaiaLabel.setText("Controle");

		jLabel31.setText("Baia");

		try {
			controleBaiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleBaiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleBaiaJFT.setEnabled(false);

		try {
			baiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		try {
			sexoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		sexoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		sexoJFT.setEnabled(false);

		jLabel34.setText("Trat.");

		try {
			trataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trataJFT.setEnabled(false);

		jLabel44.setText("Galpão");

		galpaoJFT.setEditable(false);
		try {
			galpaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		galpaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		galpaoJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				galpaoJFTActionPerformed(evt);
			}
		});

		jLabel45.setText("Trat. 2");

		try {
			trata2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trata2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trata2JFT.setEnabled(false);

		jLabel33.setText("Sexo");

		chkUsarColunaExtra = new JCheckBox("Usar Coluna Pesos / Nº Anim.");
		

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		baiaJPLayout.setHorizontalGroup(
			baiaJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel44)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jLabel31)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(jLabel33)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jLabel34)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(jLabel45)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(trata2JFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(controleBaiaLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chkUsarColunaExtra)
					.addContainerGap(122, Short.MAX_VALUE))
		);
		baiaJPLayout.setVerticalGroup(
			baiaJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup()
					.addGap(12)
					.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel31)
						.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel34)
						.addComponent(jLabel44)
						.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel33)
						.addComponent(jLabel45)
						.addComponent(trata2JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(controleBaiaLabel)
						.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chkUsarColunaExtra)
						.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		baiaJP.setLayout(baiaJPLayout);

		registrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registrosLabel.setForeground(new java.awt.Color(0, 153, 255));
		registrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registrosLabel.setText("Registros salvos com sucesso!!");

		jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel24.setText("Escolha uma opção:");

		jLabel25.setText("[1] - Digitar Mortalidade");

		jLabel26.setText("[2] - Digitar Medicados");

		jLabel50.setText("[0] - Sair");

		jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel51.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		opcaoJFT.setEnabled(false);

		jLabel27.setText("[3] - Finalizar Desempenho / Voltar");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel7Layout.createSequentialGroup().addGap(4, 4, 4)
								.addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel7Layout.createSequentialGroup()
								.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel50).addComponent(jLabel26).addComponent(jLabel25).addComponent(jLabel24)
										.addComponent(jLabel27))
								.addGap(0, 10, Short.MAX_VALUE)))
				.addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(jLabel24).addGap(18, 18, 18)
						.addComponent(jLabel25).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel26)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel27)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE).addComponent(jLabel50)
						.addGap(36, 36, 36)
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel51)
								.addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		consumoJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Consumo de Ração");

		fornecidaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist4Label.setEnabled(false);

		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("Fornecida");

		sobraHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist4Label.setEnabled(false);


		fornecidaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		fornecidaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		fornecidaHist5Label.setEnabled(false);

		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Sobra");

		sobraHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		sobraHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		sobraHist5Label.setEnabled(false);

		try {
			sobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
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

		data1HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		data1HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		data1HistLabel.setEnabled(false);

		data2HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		data2HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		data2HistLabel.setEnabled(false);

		data3HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		data3HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		data3HistLabel.setEnabled(false);

		data4HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		data4HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		data4HistLabel.setEnabled(false);

		data5HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		data5HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		data5HistLabel.setEnabled(false);

		try {
			dataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dataJFT.setToolTipText("");
		dataJFT.setEnabled(false);

		jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel28.setText("Data");

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


		jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel29.setText("Ordem");

		controleRMEJP2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));


		try {
			controleSobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleSobraJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleSobraJFT.setEnabled(false);
		controleSobraJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleSobraJFT1ActionPerformed(evt);
			}
		});

		jLabel52.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel52.setText("Controles");

		jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel53.setText("Fornecida");

		jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel54.setText("Sobra");

		try {
			controlePesoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controlePesoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controlePesoJFT.setEnabled(false);
		controlePesoJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controlePesoJFT1ActionPerformed(evt);
			}
		});

		try {
			controleAnimaisJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleAnimaisJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleAnimaisJFT.setEnabled(false);
		controleAnimaisJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleAnimaisJFT1ActionPerformed(evt);
			}
		});

		jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel55.setText("Nº Animais");

		jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel56.setText("Peso");

		javax.swing.GroupLayout controleRMEJP2Layout = new javax.swing.GroupLayout(controleRMEJP2);
		controleRMEJP2Layout.setHorizontalGroup(
			controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(controleRMEJP2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(controleRMEJP2Layout.createSequentialGroup()
							.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel53, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel54, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jLabel56, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(controlePesoJFT, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
							.addGap(10)
							.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel55, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleAnimaisJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jLabel52, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
					.addContainerGap())
		);
		controleRMEJP2Layout.setVerticalGroup(
			controleRMEJP2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(controleRMEJP2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel52)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(controleRMEJP2Layout.createSequentialGroup()
							.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel53)
								.addComponent(jLabel55)
								.addComponent(jLabel54)
								.addComponent(jLabel56))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(controleRMEJP2Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(controlePesoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(controleAnimaisJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		controleRMEJP2.setLayout(controleRMEJP2Layout);

		try {
			nAnimaisJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nAnimaisJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nAnimaisJFT.setEnabled(false);

		try {
			pesoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT.setEnabled(false);

		nAnimaisHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nAnimaisHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		nAnimaisHist5Label.setEnabled(false);

		pesoHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		pesoHist5Label.setEnabled(false);

		nAnimaisHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nAnimaisHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		nAnimaisHist4Label.setEnabled(false);

		pesoHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		pesoHist4Label.setEnabled(false);

		nAnimaisHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nAnimaisHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		nAnimaisHist3Label.setEnabled(false);

		pesoHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		pesoHist3Label.setEnabled(false);

		nAnimaisHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nAnimaisHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		nAnimaisHist2Label.setEnabled(false);

		pesoHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		pesoHist2Label.setEnabled(false);

		nAnimaisHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nAnimaisHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		nAnimaisHist1Label.setEnabled(false);

		pesoHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pesoHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		pesoHist1Label.setEnabled(false);

		jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel30.setText("Nº Animais");

		jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel32.setText("Peso");

		javax.swing.GroupLayout gl_consumoJP = new javax.swing.GroupLayout(consumoJP);
		gl_consumoJP.setHorizontalGroup(
			gl_consumoJP.createParallelGroup(Alignment.TRAILING)
				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
				.addGroup(gl_consumoJP.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_consumoJP.createParallelGroup(Alignment.TRAILING)
						.addComponent(controleRMEJP2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_consumoJP.createSequentialGroup()
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ordemJFT)
								.addComponent(ordemHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(data3HistLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(data2HistLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(data1HistLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(data5HistLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(data4HistLabel, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(jLabel28, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addComponent(dataJFT, 69, 69, 69))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING, false)
								.addComponent(fornecidaHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sobraJFT, Alignment.TRAILING)
								.addComponent(sobraHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist1Label, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(pesoHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(pesoHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(pesoHist3Label, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(pesoHist4Label, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(jLabel32, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
								.addComponent(pesoJFT, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(nAnimaisJFT, 56, 56, 56)
								.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING, false)
									.addComponent(nAnimaisHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nAnimaisHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nAnimaisHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nAnimaisHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(nAnimaisHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_consumoJP.setVerticalGroup(
			gl_consumoJP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_consumoJP.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel7)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_consumoJP.createSequentialGroup()
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel15)
								.addComponent(jLabel16))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.BASELINE)
								.addComponent(fornecidaHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_consumoJP.createSequentialGroup()
							.addComponent(jLabel28)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(data1HistLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(data2HistLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(data3HistLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(data4HistLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(data5HistLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.BASELINE)
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(fornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_consumoJP.createSequentialGroup()
							.addComponent(jLabel29)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ordemHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(ordemHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_consumoJP.createSequentialGroup()
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel32)
								.addComponent(jLabel30))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.BASELINE)
								.addComponent(pesoHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_consumoJP.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(controleRMEJP2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		consumoJP.setLayout(gl_consumoJP);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
							.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
						.addComponent(baiaJP, GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(registrosLabel, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registrosLabel))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 428, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void galpaoJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_galpaoJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_galpaoJFTActionPerformed

	private void controleAnimaisJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleAnimaisJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleAnimaisJFTActionPerformed

	private void controlePesoJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controlePesoJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controlePesoJFTActionPerformed

	private void controleSobraJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFTActionPerformed

	private void controleFornecidaJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleFornecidaJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleFornecidaJFTActionPerformed

	private void controleFornecidaJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleFornecidaJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleFornecidaJFT1ActionPerformed

	private void controleSobraJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleSobraJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleSobraJFT1ActionPerformed

	private void controlePesoJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controlePesoJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controlePesoJFT1ActionPerformed

	private void controleAnimaisJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleAnimaisJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleAnimaisJFT1ActionPerformed

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
			java.util.logging.Logger.getLogger(ViewConsumoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewConsumoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewConsumoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewConsumoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewConsumoSC().setVisible(true);
			}
		});
	}

	public javax.swing.JFormattedTextField getControleAnimaisJFT() {
		return controleAnimaisJFT;
	}

	public void setControleAnimaisJFT(javax.swing.JFormattedTextField controleAnimaisJFT) {
		this.controleAnimaisJFT = controleAnimaisJFT;
	}

	public javax.swing.JFormattedTextField getControleFornecidaJFT() {
		return controleFornecidaJFT;
	}

	public void setControleFornecidaJFT(javax.swing.JFormattedTextField controleFornecidaJFT) {
		this.controleFornecidaJFT = controleFornecidaJFT;
	}

	public javax.swing.JFormattedTextField getControlePesoJFT() {
		return controlePesoJFT;
	}

	public void setControlePesoJFT(javax.swing.JFormattedTextField controlePesoJFT) {
		this.controlePesoJFT = controlePesoJFT;
	}

	public javax.swing.JPanel getControleRMEJP1() {
		return controleRMEJP1;
	}

	public void setControleRMEJP1(javax.swing.JPanel controleRMEJP1) {
		this.controleRMEJP1 = controleRMEJP1;
	}

	public javax.swing.JPanel getControleRMEJP2() {
		return controleRMEJP2;
	}

	public void setControleRMEJP2(javax.swing.JPanel controleRMEJP2) {
		this.controleRMEJP2 = controleRMEJP2;
	}

	public javax.swing.JFormattedTextField getControleSobraJFT() {
		return controleSobraJFT;
	}

	public void setControleSobraJFT(javax.swing.JFormattedTextField controleSobraJFT) {
		this.controleSobraJFT = controleSobraJFT;
	}

	public javax.swing.JLabel getFornecidaHist1Label() {
		return fornecidaHist1Label;
	}

	public void setFornecidaHist1Label(javax.swing.JLabel fornecidaHist1Label) {
		this.fornecidaHist1Label = fornecidaHist1Label;
	}

	public javax.swing.JLabel getPesoHist1Label() {
		return pesoHist1Label;
	}

	public void setPesoHist1Label(javax.swing.JLabel pesoHist1Label) {
		this.pesoHist1Label = pesoHist1Label;
	}

	public javax.swing.JLabel getFornecidaHist2Label() {
		return fornecidaHist2Label;
	}

	public void setFornecidaHist2Label(javax.swing.JLabel fornecidaHist2Label) {
		this.fornecidaHist2Label = fornecidaHist2Label;
	}

	public javax.swing.JLabel getPesoHist2Label() {
		return pesoHist2Label;
	}

	public void setPesoHist2Label(javax.swing.JLabel pesoHist2Label) {
		this.pesoHist2Label = pesoHist2Label;
	}

	public javax.swing.JLabel getFornecidaHist3Label() {
		return fornecidaHist3Label;
	}

	public void setFornecidaHist3Label(javax.swing.JLabel fornecidaHist3Label) {
		this.fornecidaHist3Label = fornecidaHist3Label;
	}

	public javax.swing.JLabel getPesoHist3Label() {
		return pesoHist3Label;
	}

	public void setPesoHist3Label(javax.swing.JLabel pesoHist3Label) {
		this.pesoHist3Label = pesoHist3Label;
	}

	public javax.swing.JLabel getFornecidaHist4Label() {
		return fornecidaHist4Label;
	}

	public void setFornecidaHist4Label(javax.swing.JLabel fornecidaHist4Label) {
		this.fornecidaHist4Label = fornecidaHist4Label;
	}

	public javax.swing.JLabel getPesoHist4Label() {
		return pesoHist4Label;
	}

	public void setPesoHist4Label(javax.swing.JLabel pesoHist4Label) {
		this.pesoHist4Label = pesoHist4Label;
	}

	public javax.swing.JLabel getFornecidaHist5Label() {
		return fornecidaHist5Label;
	}

	public void setFornecidaHist5Label(javax.swing.JLabel fornecidaHist5Label) {
		this.fornecidaHist5Label = fornecidaHist5Label;
	}

	public javax.swing.JLabel getPesoHist5Label() {
		return pesoHist5Label;
	}

	public void setPesoHist5Label(javax.swing.JLabel pesoHist5Label) {
		this.pesoHist5Label = pesoHist5Label;
	}

	public javax.swing.JFormattedTextField getFornecidaJFT() {
		return fornecidaJFT;
	}

	public void setFornecidaJFT(javax.swing.JFormattedTextField fornecidaJFT) {
		this.fornecidaJFT = fornecidaJFT;
	}

	public javax.swing.JFormattedTextField getGalpaoJFT() {
		return galpaoJFT;
	}

	public void setGalpaoJFT(javax.swing.JFormattedTextField galpaoJFT) {
		this.galpaoJFT = galpaoJFT;
	}

	public javax.swing.JLabel getIdadeHist1Label() {
		return idadeHist1Label;
	}

	public void setIdadeHist1Label(javax.swing.JLabel idadeHist1Label) {
		this.idadeHist1Label = idadeHist1Label;
	}

	public javax.swing.JLabel getData1HistLabel() {
		return data1HistLabel;
	}

	public void setData1HistLabel(javax.swing.JLabel data1HistLabel) {
		this.data1HistLabel = data1HistLabel;
	}

	public javax.swing.JLabel getIdadeHist2Label() {
		return idadeHist2Label;
	}

	public void setIdadeHist2Label(javax.swing.JLabel idadeHist2Label) {
		this.idadeHist2Label = idadeHist2Label;
	}

	public javax.swing.JLabel getData2HistLabel() {
		return data2HistLabel;
	}

	public void setData2HistLabel(javax.swing.JLabel data2HistLabel) {
		this.data2HistLabel = data2HistLabel;
	}

	public javax.swing.JLabel getIdadeHist3Label() {
		return idadeHist3Label;
	}

	public void setIdadeHist3Label(javax.swing.JLabel idadeHist3Label) {
		this.idadeHist3Label = idadeHist3Label;
	}

	public javax.swing.JLabel getData3HistLabel() {
		return data3HistLabel;
	}

	public void setData3HistLabel(javax.swing.JLabel data3HistLabel) {
		this.data3HistLabel = data3HistLabel;
	}

	public javax.swing.JLabel getIdadeHist4Label() {
		return idadeHist4Label;
	}

	public void setIdadeHist4Label(javax.swing.JLabel idadeHist4Label) {
		this.idadeHist4Label = idadeHist4Label;
	}

	public javax.swing.JLabel getData4HistLabel() {
		return data4HistLabel;
	}

	public void setData4HistLabel(javax.swing.JLabel data4HistLabel) {
		this.data4HistLabel = data4HistLabel;
	}

	public javax.swing.JLabel getIdadeHist5Label() {
		return idadeHist5Label;
	}

	public void setIdadeHist5Label(javax.swing.JLabel idadeHist5Label) {
		this.idadeHist5Label = idadeHist5Label;
	}

	public javax.swing.JLabel getData5HistLabel() {
		return data5HistLabel;
	}

	public void setData5HistLabel(javax.swing.JLabel data5HistLabel) {
		this.data5HistLabel = data5HistLabel;
	}

	public javax.swing.JFormattedTextField getIdadeJFT() {
		return idadeJFT;
	}

	public void setIdadeJFT(javax.swing.JFormattedTextField idadeJFT) {
		this.idadeJFT = idadeJFT;
	}

	public javax.swing.JFormattedTextField getData() {
		return dataJFT;
	}

	public void setData(javax.swing.JFormattedTextField data) {
		this.dataJFT = data;
	}

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(javax.swing.JLabel jLabel10) {
		this.jLabel10 = jLabel10;
	}

	public javax.swing.JLabel getjLabel11() {
		return jLabel11;
	}

	public void setjLabel11(javax.swing.JLabel jLabel11) {
		this.jLabel11 = jLabel11;
	}

	public javax.swing.JLabel getjLabel12() {
		return jLabel12;
	}

	public void setjLabel12(javax.swing.JLabel jLabel12) {
		this.jLabel12 = jLabel12;
	}

	public javax.swing.JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(javax.swing.JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public javax.swing.JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(javax.swing.JLabel jLabel14) {
		this.jLabel14 = jLabel14;
	}

	public javax.swing.JLabel getjLabel15() {
		return jLabel15;
	}

	public void setjLabel15(javax.swing.JLabel jLabel15) {
		this.jLabel15 = jLabel15;
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

	public javax.swing.JLabel getControleBaiaLabel() {
		return controleBaiaLabel;
	}

	public void setControleBaiaLabel(javax.swing.JLabel controleBaiaLabel) {
		this.controleBaiaLabel = controleBaiaLabel;
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

	public javax.swing.JLabel getjLabel42() {
		return jLabel42;
	}

	public void setjLabel42(javax.swing.JLabel jLabel42) {
		this.jLabel42 = jLabel42;
	}

	public javax.swing.JLabel getjLabel43() {
		return jLabel43;
	}

	public void setjLabel43(javax.swing.JLabel jLabel43) {
		this.jLabel43 = jLabel43;
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

	public javax.swing.JLabel getjLabel46() {
		return jLabel46;
	}

	public void setjLabel46(javax.swing.JLabel jLabel46) {
		this.jLabel46 = jLabel46;
	}

	public javax.swing.JLabel getjLabel47() {
		return jLabel47;
	}

	public void setjLabel47(javax.swing.JLabel jLabel47) {
		this.jLabel47 = jLabel47;
	}

	public javax.swing.JLabel getjLabel48() {
		return jLabel48;
	}

	public void setjLabel48(javax.swing.JLabel jLabel48) {
		this.jLabel48 = jLabel48;
	}

	public javax.swing.JLabel getjLabel49() {
		return jLabel49;
	}

	public void setjLabel49(javax.swing.JLabel jLabel49) {
		this.jLabel49 = jLabel49;
	}

	public javax.swing.JLabel getjLabel50() {
		return jLabel50;
	}

	public void setjLabel50(javax.swing.JLabel jLabel50) {
		this.jLabel50 = jLabel50;
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

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(javax.swing.JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public javax.swing.JLabel getjLabel9() {
		return jLabel9;
	}

	public void setjLabel9(javax.swing.JLabel jLabel9) {
		this.jLabel9 = jLabel9;
	}

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JPanel getjPanel2() {
		return jPanel2;
	}

	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.jPanel2 = jPanel2;
	}

	public javax.swing.JPanel getConsumoJP() {
		return consumoJP;
	}

	public void setConsumoJP(javax.swing.JPanel consumoJP) {
		this.consumoJP = consumoJP;
	}

	public javax.swing.JPanel getjPanel5() {
		return jPanel5;
	}

	public void setjPanel5(javax.swing.JPanel jPanel5) {
		this.jPanel5 = jPanel5;
	}

	public javax.swing.JPanel getjPanel6() {
		return jPanel6;
	}

	public void setjPanel6(javax.swing.JPanel jPanel6) {
		this.jPanel6 = jPanel6;
	}

	public javax.swing.JPanel getjPanel7() {
		return jPanel7;
	}

	public void setjPanel7(javax.swing.JPanel jPanel7) {
		this.jPanel7 = jPanel7;
	}

	public javax.swing.JFormattedTextField getnAnimaisJFT() {
		return nAnimaisJFT;
	}

	public void setnAnimaisJFT(javax.swing.JFormattedTextField nAnimaisJFT) {
		this.nAnimaisJFT = nAnimaisJFT;
	}

	public javax.swing.JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public javax.swing.JLabel getOrdemHist1Label() {
		return ordemHist1Label;
	}

	public void setOrdemHist1Label(javax.swing.JLabel ordemHist1Label) {
		this.ordemHist1Label = ordemHist1Label;
	}

	public javax.swing.JLabel getOrdemHist2Label() {
		return ordemHist2Label;
	}

	public void setOrdemHist2Label(javax.swing.JLabel ordemHist2Label) {
		this.ordemHist2Label = ordemHist2Label;
	}

	public javax.swing.JLabel getOrdemHist3Label() {
		return ordemHist3Label;
	}

	public void setOrdemHist3Label(javax.swing.JLabel ordemHist3Label) {
		this.ordemHist3Label = ordemHist3Label;
	}

	public javax.swing.JLabel getOrdemHist4Label() {
		return ordemHist4Label;
	}

	public void setOrdemHist4Label(javax.swing.JLabel ordemHist4Label) {
		this.ordemHist4Label = ordemHist4Label;
	}

	public javax.swing.JLabel getOrdemHist5Label() {
		return ordemHist5Label;
	}

	public void setOrdemHist5Label(javax.swing.JLabel ordemHist5Label) {
		this.ordemHist5Label = ordemHist5Label;
	}

	public javax.swing.JFormattedTextField getOrdemJFT() {
		return ordemJFT;
	}

	public void setOrdemJFT(javax.swing.JFormattedTextField ordemJFT) {
		this.ordemJFT = ordemJFT;
	}

	public javax.swing.JFormattedTextField getPesoJFT() {
		return pesoJFT;
	}

	public void setPesoJFT(javax.swing.JFormattedTextField pesoJFT) {
		this.pesoJFT = pesoJFT;
	}

	public javax.swing.JLabel getRegistrosLabel() {
		return registrosLabel;
	}

	public void setRegistrosLabel(javax.swing.JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

	public javax.swing.JLabel getSobraHist1Label() {
		return sobraHist1Label;
	}

	public void setSobraHist1Label(javax.swing.JLabel sobraHist1Label) {
		this.sobraHist1Label = sobraHist1Label;
	}

	public javax.swing.JLabel getnAnimaisHist1Label() {
		return nAnimaisHist1Label;
	}

	public void setnAnimaisHist1Label(javax.swing.JLabel nAnimaisHist1Label) {
		this.nAnimaisHist1Label = nAnimaisHist1Label;
	}

	public javax.swing.JLabel getSobraHist2Label() {
		return sobraHist2Label;
	}

	public void setSobraHist2Label(javax.swing.JLabel sobraHist2Label) {
		this.sobraHist2Label = sobraHist2Label;
	}

	public javax.swing.JLabel getnAnimaisHist2Label() {
		return nAnimaisHist2Label;
	}

	public void setnAnimaisHist2Label(javax.swing.JLabel nAnimaisHist2Label) {
		this.nAnimaisHist2Label = nAnimaisHist2Label;
	}

	public javax.swing.JLabel getSobraHist3Label() {
		return sobraHist3Label;
	}

	public void setSobraHist3Label(javax.swing.JLabel sobraHist3Label) {
		this.sobraHist3Label = sobraHist3Label;
	}

	public javax.swing.JLabel getnAnimaisHist3Label() {
		return nAnimaisHist3Label;
	}

	public void setnAnimaisHist3Label(javax.swing.JLabel nAnimaisHist3Label) {
		this.nAnimaisHist3Label = nAnimaisHist3Label;
	}

	public javax.swing.JLabel getSobraHist4Label() {
		return sobraHist4Label;
	}

	public void setSobraHist4Label(javax.swing.JLabel sobraHist4Label) {
		this.sobraHist4Label = sobraHist4Label;
	}

	public javax.swing.JLabel getnAnimaisHist4Label() {
		return nAnimaisHist4Label;
	}

	public void setnAnimaisHist4Label(javax.swing.JLabel nAnimaisHist4Label) {
		this.nAnimaisHist4Label = nAnimaisHist4Label;
	}

	public javax.swing.JLabel getSobraHist5Label() {
		return sobraHist5Label;
	}

	public void setSobraHist5Label(javax.swing.JLabel sobraHist5Label) {
		this.sobraHist5Label = sobraHist5Label;
	}

	public javax.swing.JLabel getnAnimaisHist5Label() {
		return nAnimaisHist5Label;
	}

	public void setnAnimaisHist5Label(javax.swing.JLabel nAnimaisHist5Label) {
		this.nAnimaisHist5Label = nAnimaisHist5Label;
	}

	public javax.swing.JFormattedTextField getSobraJFT() {
		return sobraJFT;
	}

	public void setSobraJFT(javax.swing.JFormattedTextField sobraJFT) {
		this.sobraJFT = sobraJFT;
	}

	public javax.swing.JFormattedTextField getTrata2JFT() {
		return trata2JFT;
	}

	public void setTrata2JFT(javax.swing.JFormattedTextField trata2jft) {
		trata2JFT = trata2jft;
	}

	public JCheckBox getChkUsarColunaExtra() {
		return chkUsarColunaExtra;
	}

	public void setChkUsarColunaExtra(JCheckBox chkUsarColunaExtra) {
		this.chkUsarColunaExtra = chkUsarColunaExtra;
	}

	public void setBaiaJFT(javax.swing.JFormattedTextField baiaJFT) {
		this.baiaJFT = baiaJFT;
	}

	public void setBaiaJP(javax.swing.JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	public void setControleBaiaJFT(javax.swing.JFormattedTextField controleBaiaJFT) {
		this.controleBaiaJFT = controleBaiaJFT;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}


	public javax.swing.JFormattedTextField getDataJFT() {
		return dataJFT;
	}

	public void setDataJFT(javax.swing.JFormattedTextField dataJFT) {
		this.dataJFT = dataJFT;
	}

	public void setTrataJFT(JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}
}
