package brf.suino.view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class ViewMedicadosSC extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JLabel fornecidaHist1Label;
	private javax.swing.JLabel brincoHist1Label;
	private javax.swing.JLabel causaHist1Label;
	private javax.swing.JLabel fornecidaHist2Label;
	private javax.swing.JLabel brincoHist2Label;
	private javax.swing.JLabel causaHist2Label;
	private javax.swing.JLabel fornecidaHist3Label;
	private javax.swing.JLabel brincoHist3Label;
	private javax.swing.JLabel causaHist3Label;
	private javax.swing.JLabel fornecidaHist4Label;
	private javax.swing.JLabel brincoHist4Label;
	private javax.swing.JLabel causaHist4Label;
	private javax.swing.JLabel fornecidaHist5Label;
	private javax.swing.JLabel brincoHist5Label;
	private javax.swing.JLabel causaHist5Label;
	private javax.swing.JFormattedTextField fornecidaJFT;
	private javax.swing.JFormattedTextField brincoJFT;
	private javax.swing.JFormattedTextField galpaoJFT;
	private javax.swing.JLabel dataHist1Label;
	private javax.swing.JLabel dataHist2Label;
	private javax.swing.JLabel dataHist3Label;
	private javax.swing.JLabel dataHist4Label;
	private javax.swing.JLabel dataHist5Label;
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
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
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
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel pnlMortalidade;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JFormattedTextField dose1JFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JFormattedTextField ordemJFT;
	private javax.swing.JFormattedTextField causaJFT;
	private javax.swing.JLabel registrosLabel;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JLabel sobraHist1Label;
	private javax.swing.JLabel medicamentoHist1Label;
	private javax.swing.JLabel dose1Hist1Label;
	private javax.swing.JLabel sobraHist2Label;
	private javax.swing.JLabel medicamentoHist2Label;
	private javax.swing.JLabel dose1Hist2Label;
	private javax.swing.JLabel sobraHist3Label;
	private javax.swing.JLabel medicamentoHist3Label;
	private javax.swing.JLabel dose1Hist3Label;
	private javax.swing.JLabel sobraHist4Label;
	private javax.swing.JLabel medicamentoHist4Label;
	private javax.swing.JLabel dose1Hist4Label;
	private javax.swing.JLabel sobraHist5Label;
	private javax.swing.JLabel medicamentoHist5Label;
	private javax.swing.JLabel dose1Hist5Label;
	private javax.swing.JFormattedTextField sobraJFT;
	private javax.swing.JFormattedTextField medicamentoJFT;
	private javax.swing.JFormattedTextField trata2JFT;
	private javax.swing.JFormattedTextField trataJFT;
	private JFormattedTextField controleJFT;
	private JLabel lblDose;
	private JLabel dose2Hist1Label;
	private JLabel dose2Hist2Label;
	private JLabel dose2Hist3Label;
	private JLabel dose2Hist4Label;
	private JLabel dose2Hist5Label;
	private JFormattedTextField dose2JFT;
	private JFormattedTextField dose3JFT;
	private JLabel dose3Hist5Label;
	private JLabel dose3Hist4Label;
	private JLabel dose3Hist3Label;
	private JLabel dose3Hist2Label;
	private JLabel dose3Hist1Label;
	private JLabel lblDose_1;

	public ViewMedicadosSC() {
		initComponents();
	}

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
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		jLabel47 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		jLabel49 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		jLabel31 = new javax.swing.JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		baiaJFT.setEditable(false);
		baiaJFT.setEnabled(false);
		sexoJFT = new javax.swing.JFormattedTextField();
		sexoJFT.setEditable(false);
		jLabel34 = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		trataJFT.setEditable(false);
		jLabel44 = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		galpaoJFT.setEnabled(false);
		jLabel45 = new javax.swing.JLabel();
		trata2JFT = new javax.swing.JFormattedTextField();
		trata2JFT.setEditable(false);
		jLabel33 = new javax.swing.JLabel();
		registrosLabel = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		jLabel27 = new javax.swing.JLabel();
		pnlMortalidade = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		brincoHist4Label = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		medicamentoHist4Label = new javax.swing.JLabel();
		brincoJFT = new javax.swing.JFormattedTextField();
		brincoHist5Label = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		medicamentoHist5Label = new javax.swing.JLabel();
		medicamentoJFT = new javax.swing.JFormattedTextField();
		brincoHist1Label = new javax.swing.JLabel();
		medicamentoHist1Label = new javax.swing.JLabel();
		brincoHist2Label = new javax.swing.JLabel();
		medicamentoHist2Label = new javax.swing.JLabel();
		brincoHist3Label = new javax.swing.JLabel();
		medicamentoHist3Label = new javax.swing.JLabel();
		dataHist1Label = new javax.swing.JLabel();
		dataHist2Label = new javax.swing.JLabel();
		dataHist3Label = new javax.swing.JLabel();
		dataHist4Label = new javax.swing.JLabel();
		dataHist5Label = new javax.swing.JLabel();
		dataJFT = new javax.swing.JFormattedTextField();
		jLabel28 = new javax.swing.JLabel();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		ordemJFT = new javax.swing.JFormattedTextField();
		jLabel29 = new javax.swing.JLabel();
		dose1JFT = new javax.swing.JFormattedTextField();
		causaJFT = new javax.swing.JFormattedTextField();
		dose1Hist5Label = new javax.swing.JLabel();
		causaHist5Label = new javax.swing.JLabel();
		dose1Hist4Label = new javax.swing.JLabel();
		causaHist4Label = new javax.swing.JLabel();
		dose1Hist3Label = new javax.swing.JLabel();
		causaHist3Label = new javax.swing.JLabel();
		dose1Hist2Label = new javax.swing.JLabel();
		causaHist2Label = new javax.swing.JLabel();
		dose1Hist1Label = new javax.swing.JLabel();
		causaHist1Label = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel17.setText("Escolha uma opção:");

		jLabel18.setText("[1] - Digitar Próxima Baia");

		jLabel19.setText("[2] - Finalizar Desempenho / Voltar");

		jLabel39.setText("[0] - Sair");

		jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel40.setText("Opção");

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

		jLabel23.setText("[3] - Finalizar Desempenho / Voltar");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup()
										.addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(8, 8, 8))
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
			fornecidaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
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

		try {
			dataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dataJFT.setToolTipText("");

		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Data");

		try {
			ordemJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemJFT.setEnabled(false);

		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Ordem");

		jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
		jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel42.setText("Controles");

		jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel46.setText("Fornecida");

		jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel47.setText("Sobra");

		jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel48.setText("Nº Animais");

		jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel49.setText("Peso");

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
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(fornecidaHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist2Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(fornecidaHist5Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaJFT, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(sobraJFT, javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(sobraHist5Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist4Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist3Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist2Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist1Label, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(
										jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

										.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout
								.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9).addComponent(jLabel10))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(fornecidaHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(sobraHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(fornecidaHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(sobraHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(fornecidaHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(sobraHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(fornecidaHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(sobraHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(fornecidaHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(sobraHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel13)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(fornecidaJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(sobraJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel14)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
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
						.addContainerGap()));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel31.setText("Baia");

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
			trataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
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
			trata2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trata2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trata2JFT.setEnabled(false);

		jLabel33.setText("Sexo");

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		baiaJP.setLayout(baiaJPLayout);
		baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap().addComponent(jLabel44)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(galpaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel31)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(baiaJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(16, 16, 16).addComponent(jLabel33).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(sexoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jLabel34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(trataJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(16, 16, 16).addComponent(jLabel45).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(trata2JFT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(92, Short.MAX_VALUE)));
		baiaJPLayout
				.setVerticalGroup(
						baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
										.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel31)
												.addComponent(baiaJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(sexoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel34)
												.addComponent(trataJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel44)
												.addComponent(galpaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel33).addComponent(jLabel45).addComponent(trata2JFT,
														javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		registrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registrosLabel.setForeground(new java.awt.Color(0, 153, 255));
		registrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registrosLabel.setText("Registros salvos com sucesso!!");

		jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel24.setText("Escolha uma opção:");

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

		jLabel27.setText("[9] - Voltar");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(4)
						.addComponent(jLabel51, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel7Layout.createSequentialGroup().addComponent(jLabel50).addGap(124, 134, Short.MAX_VALUE))
						.addComponent(jLabel27).addComponent(jLabel24))
				.addContainerGap()));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
						jPanel7Layout.createSequentialGroup().addContainerGap(82, Short.MAX_VALUE).addComponent(jLabel24).addGap(18)
								.addComponent(jLabel27).addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel50).addGap(36)
								.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel51).addComponent(
										opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		jPanel7.setLayout(jPanel7Layout);

		pnlMortalidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Mortos / Descartados");

		brincoHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist4Label.setEnabled(false);

		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("Brinco");

		medicamentoHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist4Label.setEnabled(false);

		try {
			brincoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		brincoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		brincoJFT.setEnabled(false);

		brincoHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist5Label.setEnabled(false);

		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Medicamento");

		medicamentoHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist5Label.setEnabled(false);

		try {
			medicamentoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		medicamentoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		medicamentoJFT.setEnabled(false);

		brincoHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist1Label.setEnabled(false);

		medicamentoHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist1Label.setEnabled(false);

		brincoHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist2Label.setEnabled(false);

		medicamentoHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist2Label.setEnabled(false);

		brincoHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist3Label.setEnabled(false);

		medicamentoHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist3Label.setEnabled(false);

		dataHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dataHist1Label.setEnabled(false);

		dataHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dataHist2Label.setEnabled(false);

		dataHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dataHist3Label.setEnabled(false);

		dataHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dataHist4Label.setEnabled(false);

		dataHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dataHist5Label.setEnabled(false);

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

		try {
			ordemJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		ordemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordemJFT.setEnabled(false);

		jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel29.setText("Ordem");

		try {
			dose1JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dose1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dose1JFT.setEnabled(false);

		try {
			causaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		causaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		causaJFT.setEnabled(false);

		dose1Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose1Hist5Label.setEnabled(false);

		causaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		causaHist5Label.setEnabled(false);

		dose1Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose1Hist4Label.setEnabled(false);

		causaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		causaHist4Label.setEnabled(false);

		dose1Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose1Hist3Label.setEnabled(false);

		causaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		causaHist3Label.setEnabled(false);

		dose1Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose1Hist2Label.setEnabled(false);

		causaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		causaHist2Label.setEnabled(false);

		dose1Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose1Hist1Label.setEnabled(false);

		causaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		causaHist1Label.setEnabled(false);

		jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel30.setText("Dose 1");

		jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel32.setText("Causa");

		jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel35.setText("Controle");

		controleJFT = new JFormattedTextField();
		try {
			controleJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleJFT.setEnabled(false);

		lblDose = new JLabel();
		lblDose.setText("Dose 2");
		lblDose.setHorizontalAlignment(SwingConstants.CENTER);

		dose2Hist1Label = new JLabel();
		dose2Hist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose2Hist1Label.setEnabled(false);
		dose2Hist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose2Hist2Label = new JLabel();
		dose2Hist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose2Hist2Label.setEnabled(false);
		dose2Hist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose2Hist3Label = new JLabel();
		dose2Hist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose2Hist3Label.setEnabled(false);
		dose2Hist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose2Hist4Label = new JLabel();
		dose2Hist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose2Hist4Label.setEnabled(false);
		dose2Hist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose2Hist5Label = new JLabel();
		dose2Hist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose2Hist5Label.setEnabled(false);
		dose2Hist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose2JFT = new JFormattedTextField();
		dose2JFT.setHorizontalAlignment(SwingConstants.CENTER);
		dose2JFT.setEnabled(false);

		dose3JFT = new JFormattedTextField();
		dose3JFT.setHorizontalAlignment(SwingConstants.CENTER);
		dose3JFT.setEnabled(false);

		dose3Hist5Label = new JLabel();
		dose3Hist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose3Hist5Label.setEnabled(false);
		dose3Hist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose3Hist4Label = new JLabel();
		dose3Hist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose3Hist4Label.setEnabled(false);
		dose3Hist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose3Hist3Label = new JLabel();
		dose3Hist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose3Hist3Label.setEnabled(false);
		dose3Hist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose3Hist2Label = new JLabel();
		dose3Hist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose3Hist2Label.setEnabled(false);
		dose3Hist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		dose3Hist1Label = new JLabel();
		dose3Hist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		dose3Hist1Label.setEnabled(false);
		dose3Hist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		lblDose_1 = new JLabel();
		lblDose_1.setText("Dose 3");
		lblDose_1.setHorizontalAlignment(SwingConstants.CENTER);

		javax.swing.GroupLayout gl_pnlMortalidade = new javax.swing.GroupLayout(pnlMortalidade);
		gl_pnlMortalidade.setHorizontalGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
				.addGroup(gl_pnlMortalidade.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist1Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemHist2Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemHist3Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemHist4Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemHist5Label, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(ordemJFT, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addComponent(dataHist3Label, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataHist1Label, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(dataHist2Label, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(dataHist4Label, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
								.addComponent(dataHist5Label, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addComponent(brincoHist3Label, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(brincoJFT, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addComponent(brincoHist4Label, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(brincoHist5Label, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(brincoHist1Label, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addComponent(brincoHist2Label, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addComponent(medicamentoHist3Label, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
								.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
										.addComponent(medicamentoHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(medicamentoHist4Label, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
										.addComponent(medicamentoHist5Label, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
										.addComponent(medicamentoJFT, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE).addComponent(jLabel16,
												Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(medicamentoHist2Label, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
												.addComponent(causaHist3Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
												.addComponent(causaHist2Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
												.addComponent(causaHist1Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(causaHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(causaHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 55,
																Short.MAX_VALUE)))
										.addComponent(causaJFT, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addComponent(jLabel32, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
								.addComponent(dose1Hist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(dose1JFT, Alignment.TRAILING)
								.addComponent(dose1Hist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jLabel30, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlMortalidade.createSequentialGroup()
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
												.addComponent(dose2JFT, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addComponent(dose2Hist5Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblDose_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
														.addComponent(dose3JFT, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
														.addComponent(dose3Hist1Label, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 56,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(dose3Hist5Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING).addComponent(controleJFT,
												GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
												.addComponent(jLabel35, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
										.addGap(22))
								.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlMortalidade.createSequentialGroup()
												.addComponent(dose2Hist4Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(dose3Hist4Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlMortalidade.createSequentialGroup()
												.addComponent(dose2Hist3Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(dose3Hist3Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_pnlMortalidade.createSequentialGroup()
												.addComponent(dose2Hist2Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(dose3Hist2Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addComponent(dose2Hist1Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDose, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
										.addContainerGap(103, Short.MAX_VALUE)))));
		gl_pnlMortalidade.setVerticalGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING).addGroup(gl_pnlMortalidade
				.createSequentialGroup().addContainerGap().addComponent(jLabel7).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING).addGroup(gl_pnlMortalidade.createSequentialGroup()
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING).addComponent(jLabel35, Alignment.TRAILING)
								.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
										.createParallelGroup(Alignment.LEADING).addComponent(jLabel29)
										.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
												.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
														.createParallelGroup(Alignment.LEADING).addComponent(jLabel28)
														.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.BASELINE)
																.addComponent(jLabel15).addComponent(jLabel16).addComponent(jLabel32))
														.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.BASELINE)
																.addComponent(jLabel30).addComponent(lblDose)))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
																.addComponent(dose2Hist1Label, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(ordemHist1Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(dataHist1Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
																.addComponent(brincoHist1Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(medicamentoHist1Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(dose1Hist1Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(causaHist1Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)))
												.addGroup(gl_pnlMortalidade.createSequentialGroup().addComponent(lblDose_1)
														.addPreferredGap(ComponentPlacement.RELATED).addComponent(dose3Hist1Label,
																GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
														.addComponent(dose3Hist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(dose1Hist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(causaHist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(medicamentoHist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(brincoHist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(dataHist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(ordemHist2Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(dose2Hist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
												.addComponent(dose3Hist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
												.addComponent(dose2Hist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
												.addGroup(
														gl_pnlMortalidade.createSequentialGroup()
																.addComponent(
																		causaHist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(dose1Hist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(medicamentoHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(brincoHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(ordemHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 14,
																Short.MAX_VALUE)
														.addComponent(dataHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGap(11)
										.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_pnlMortalidade.createSequentialGroup()
																.addComponent(ordemHist4Label, GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(ordemHist5Label, GroupLayout.PREFERRED_SIZE, 14,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
																.createParallelGroup(Alignment.TRAILING)
																.addGroup(gl_pnlMortalidade.createSequentialGroup()
																		.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING)
																				.addComponent(medicamentoHist4Label,
																						GroupLayout.PREFERRED_SIZE, 14,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(brincoHist4Label, GroupLayout.PREFERRED_SIZE,
																						14, GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(ComponentPlacement.UNRELATED))
																.addGroup(gl_pnlMortalidade.createSequentialGroup()
																		.addComponent(dataHist4Label, GroupLayout.PREFERRED_SIZE, 14,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)))
																.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.TRAILING)
																		.addComponent(dataHist5Label, Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																		.addComponent(brincoHist5Label, Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
																		.addComponent(medicamentoHist5Label, Alignment.LEADING,
																				GroupLayout.PREFERRED_SIZE, 14,
																				GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_pnlMortalidade.createSequentialGroup().addGroup(gl_pnlMortalidade
														.createParallelGroup(Alignment.LEADING, false)
														.addComponent(dose3Hist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(dose2Hist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(dose1Hist4Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
														.addComponent(causaHist4Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.LEADING, false)
																.addComponent(causaHist5Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(dose1Hist5Label, GroupLayout.DEFAULT_SIZE, 14,
																		Short.MAX_VALUE)
																.addComponent(dose2Hist5Label, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(dose3Hist5Label, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.BASELINE)
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(brincoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(medicamentoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(dose1JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(causaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlMortalidade.createParallelGroup(Alignment.BASELINE)
								.addComponent(dose2JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(dose3JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(17)));
		pnlMortalidade.setLayout(gl_pnlMortalidade);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(pnlMortalidade, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel1Layout.createSequentialGroup()
										.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(0, 385, Short.MAX_VALUE))
						.addComponent(registrosLabel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(pnlMortalidade, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jPanel7, GroupLayout.PREFERRED_SIZE,
								165, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(registrosLabel).addContainerGap()));
		jPanel1.setLayout(jPanel1Layout);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		getContentPane().setLayout(layout);
		pack();
	}

	private void galpaoJFTActionPerformed(java.awt.event.ActionEvent evt) {
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewMedicadosSC().setVisible(true);
			}
		});
	}

	public javax.swing.JFormattedTextField getBaiaJFT() {
		return baiaJFT;
	}

	public void setBaiaJFT(javax.swing.JFormattedTextField baiaJFT) {
		this.baiaJFT = baiaJFT;
	}

	public javax.swing.JPanel getBaiaJP() {
		return baiaJP;
	}

	public void setBaiaJP(javax.swing.JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	public javax.swing.JLabel getFornecidaHist1Label() {
		return fornecidaHist1Label;
	}

	public void setFornecidaHist1Label(javax.swing.JLabel fornecidaHist1Label) {
		this.fornecidaHist1Label = fornecidaHist1Label;
	}

	public javax.swing.JLabel getBrincoHist1Label() {
		return brincoHist1Label;
	}

	public void setBrincoHist1Label(javax.swing.JLabel brincoHist1Label) {
		this.brincoHist1Label = brincoHist1Label;
	}

	public javax.swing.JLabel getFaseHist1Label() {
		return causaHist1Label;
	}

	public void setFaseHist1Label(javax.swing.JLabel faseHist1Label) {
		this.causaHist1Label = faseHist1Label;
	}

	public javax.swing.JLabel getFornecidaHist2Label() {
		return fornecidaHist2Label;
	}

	public void setFornecidaHist2Label(javax.swing.JLabel fornecidaHist2Label) {
		this.fornecidaHist2Label = fornecidaHist2Label;
	}

	public javax.swing.JLabel getBrincoHist2Label() {
		return brincoHist2Label;
	}

	public void setBrincoHist2Label(javax.swing.JLabel brincoHist2Label) {
		this.brincoHist2Label = brincoHist2Label;
	}

	public javax.swing.JLabel getFaseHist2Label() {
		return causaHist2Label;
	}

	public void setFaseHist2Label(javax.swing.JLabel faseHist2Label) {
		this.causaHist2Label = faseHist2Label;
	}

	public javax.swing.JLabel getFornecidaHist3Label() {
		return fornecidaHist3Label;
	}

	public void setFornecidaHist3Label(javax.swing.JLabel fornecidaHist3Label) {
		this.fornecidaHist3Label = fornecidaHist3Label;
	}

	public javax.swing.JLabel getBrincoHist3Label() {
		return brincoHist3Label;
	}

	public void setBrincoHist3Label(javax.swing.JLabel brincoHist3Label) {
		this.brincoHist3Label = brincoHist3Label;
	}

	public javax.swing.JLabel getFaseHist3Label() {
		return causaHist3Label;
	}

	public void setFaseHist3Label(javax.swing.JLabel faseHist3Label) {
		this.causaHist3Label = faseHist3Label;
	}

	public javax.swing.JLabel getFornecidaHist4Label() {
		return fornecidaHist4Label;
	}

	public void setFornecidaHist4Label(javax.swing.JLabel fornecidaHist4Label) {
		this.fornecidaHist4Label = fornecidaHist4Label;
	}

	public javax.swing.JLabel getBrincoHist4Label() {
		return brincoHist4Label;
	}

	public void setBrincoHist4Label(javax.swing.JLabel brincoHist4Label) {
		this.brincoHist4Label = brincoHist4Label;
	}

	public javax.swing.JLabel getFaseHist4Label() {
		return causaHist4Label;
	}

	public void setFaseHist4Label(javax.swing.JLabel faseHist4Label) {
		this.causaHist4Label = faseHist4Label;
	}

	public javax.swing.JLabel getFornecidaHist5Label() {
		return fornecidaHist5Label;
	}

	public void setFornecidaHist5Label(javax.swing.JLabel fornecidaHist5Label) {
		this.fornecidaHist5Label = fornecidaHist5Label;
	}

	public javax.swing.JLabel getBrincoHist5Label() {
		return brincoHist5Label;
	}

	public void setBrincoHist5Label(javax.swing.JLabel brincoHist5Label) {
		this.brincoHist5Label = brincoHist5Label;
	}

	public javax.swing.JLabel getFaseHist5Label() {
		return causaHist5Label;
	}

	public void setFaseHist5Label(javax.swing.JLabel faseHist5Label) {
		this.causaHist5Label = faseHist5Label;
	}

	public javax.swing.JFormattedTextField getFornecidaJFT() {
		return fornecidaJFT;
	}

	public void setFornecidaJFT(javax.swing.JFormattedTextField fornecidaJFT) {
		this.fornecidaJFT = fornecidaJFT;
	}

	public javax.swing.JFormattedTextField getBrincoJFT() {
		return brincoJFT;
	}

	public void setBrincoJFT(javax.swing.JFormattedTextField brincoJFT) {
		this.brincoJFT = brincoJFT;
	}

	public javax.swing.JFormattedTextField getGalpaoJFT() {
		return galpaoJFT;
	}

	public void setGalpaoJFT(javax.swing.JFormattedTextField galpaoJFT) {
		this.galpaoJFT = galpaoJFT;
	}

	public javax.swing.JLabel getDataHist1Label() {
		return dataHist1Label;
	}

	public void setDataHist1Label(javax.swing.JLabel dataHist1Label) {
		this.dataHist1Label = dataHist1Label;
	}

	public javax.swing.JLabel getDataHist2Label() {
		return dataHist2Label;
	}

	public void setDataHist2Label(javax.swing.JLabel dataHist2Label) {
		this.dataHist2Label = dataHist2Label;
	}

	public javax.swing.JLabel getDataHist3Label() {
		return dataHist3Label;
	}

	public void setDataHist3Label(javax.swing.JLabel dataHist3Label) {
		this.dataHist3Label = dataHist3Label;
	}

	public javax.swing.JLabel getDataHist4Label() {
		return dataHist4Label;
	}

	public void setDataHist4Label(javax.swing.JLabel dataHist4Label) {
		this.dataHist4Label = dataHist4Label;
	}

	public javax.swing.JLabel getDataHist5Label() {
		return dataHist5Label;
	}

	public void setDataHist5Label(javax.swing.JLabel dataHist5Label) {
		this.dataHist5Label = dataHist5Label;
	}

	public javax.swing.JFormattedTextField getDataJFT() {
		return dataJFT;
	}

	public void setDataJFT(javax.swing.JFormattedTextField dataJFT) {
		this.dataJFT = dataJFT;
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

	public javax.swing.JPanel getjPanel3() {
		return pnlMortalidade;
	}

	public void setjPanel3(javax.swing.JPanel jPanel3) {
		this.pnlMortalidade = jPanel3;
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

	public javax.swing.JFormattedTextField getCausaJFT() {
		return dose1JFT;
	}

	public void setCausaJFT(javax.swing.JFormattedTextField causaJFT) {
		this.dose1JFT = causaJFT;
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

	public javax.swing.JFormattedTextField getFaseJFT() {
		return causaJFT;
	}

	public void setFaseJFT(javax.swing.JFormattedTextField faseJFT) {
		this.causaJFT = faseJFT;
	}

	public javax.swing.JLabel getRegistrosLabel() {
		return registrosLabel;
	}

	public void setRegistrosLabel(javax.swing.JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

	public javax.swing.JFormattedTextField getSexoJFT() {
		return sexoJFT;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public javax.swing.JLabel getSobraHist1Label() {
		return sobraHist1Label;
	}

	public void setSobraHist1Label(javax.swing.JLabel sobraHist1Label) {
		this.sobraHist1Label = sobraHist1Label;
	}

	public javax.swing.JLabel getPesoHist1Label() {
		return medicamentoHist1Label;
	}

	public void setPesoHist1Label(javax.swing.JLabel pesoHist1Label) {
		this.medicamentoHist1Label = pesoHist1Label;
	}

	public javax.swing.JLabel getCausaHist1Label() {
		return dose1Hist1Label;
	}

	public void setCausaHist1Label(javax.swing.JLabel causaHist1Label) {
		this.dose1Hist1Label = causaHist1Label;
	}

	public javax.swing.JLabel getSobraHist2Label() {
		return sobraHist2Label;
	}

	public void setSobraHist2Label(javax.swing.JLabel sobraHist2Label) {
		this.sobraHist2Label = sobraHist2Label;
	}

	public javax.swing.JLabel getPesoHist2Label() {
		return medicamentoHist2Label;
	}

	public void setPesoHist2Label(javax.swing.JLabel pesoHist2Label) {
		this.medicamentoHist2Label = pesoHist2Label;
	}

	public javax.swing.JLabel getCausaHist2Label() {
		return dose1Hist2Label;
	}

	public void setCausaHist2Label(javax.swing.JLabel causaHist2Label) {
		this.dose1Hist2Label = causaHist2Label;
	}

	public javax.swing.JLabel getSobraHist3Label() {
		return sobraHist3Label;
	}

	public void setSobraHist3Label(javax.swing.JLabel sobraHist3Label) {
		this.sobraHist3Label = sobraHist3Label;
	}

	public javax.swing.JLabel getPesoHist3Label() {
		return medicamentoHist3Label;
	}

	public void setPesoHist3Label(javax.swing.JLabel pesoHist3Label) {
		this.medicamentoHist3Label = pesoHist3Label;
	}

	public javax.swing.JLabel getCausaHist3Label() {
		return dose1Hist3Label;
	}

	public void setCausaHist3Label(javax.swing.JLabel causaHist3Label) {
		this.dose1Hist3Label = causaHist3Label;
	}

	public javax.swing.JLabel getSobraHist4Label() {
		return sobraHist4Label;
	}

	public void setSobraHist4Label(javax.swing.JLabel sobraHist4Label) {
		this.sobraHist4Label = sobraHist4Label;
	}

	public javax.swing.JLabel getPesoHist4Label() {
		return medicamentoHist4Label;
	}

	public void setPesoHist4Label(javax.swing.JLabel pesoHist4Label) {
		this.medicamentoHist4Label = pesoHist4Label;
	}

	public javax.swing.JLabel getCausaHist4Label() {
		return dose1Hist4Label;
	}

	public void setCausaHist4Label(javax.swing.JLabel causaHist4Label) {
		this.dose1Hist4Label = causaHist4Label;
	}

	public javax.swing.JLabel getSobraHist5Label() {
		return sobraHist5Label;
	}

	public void setSobraHist5Label(javax.swing.JLabel sobraHist5Label) {
		this.sobraHist5Label = sobraHist5Label;
	}

	public javax.swing.JLabel getPesoHist5Label() {
		return medicamentoHist5Label;
	}

	public void setPesoHist5Label(javax.swing.JLabel pesoHist5Label) {
		this.medicamentoHist5Label = pesoHist5Label;
	}

	public javax.swing.JLabel getCausaHist5Label() {
		return dose1Hist5Label;
	}

	public void setCausaHist5Label(javax.swing.JLabel causaHist5Label) {
		this.dose1Hist5Label = causaHist5Label;
	}

	public javax.swing.JFormattedTextField getSobraJFT() {
		return sobraJFT;
	}

	public void setSobraJFT(javax.swing.JFormattedTextField sobraJFT) {
		this.sobraJFT = sobraJFT;
	}

	public javax.swing.JFormattedTextField getPesoJFT() {
		return medicamentoJFT;
	}

	public void setPesoJFT(javax.swing.JFormattedTextField pesoJFT) {
		this.medicamentoJFT = pesoJFT;
	}

	public javax.swing.JFormattedTextField getTrata2JFT() {
		return trata2JFT;
	}

	public void setTrata2JFT(javax.swing.JFormattedTextField trata2jft) {
		trata2JFT = trata2jft;
	}

	public javax.swing.JFormattedTextField getTrataJFT() {
		return trataJFT;
	}

	public void setTrataJFT(javax.swing.JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public javax.swing.JFormattedTextField getControleJFT() {
		return controleJFT;
	}

	public void setControleJFT(javax.swing.JFormattedTextField controleJFT) {
		this.controleJFT = controleJFT;
	}

	public javax.swing.JPanel getPnlMortalidade() {
		return pnlMortalidade;
	}

	public void setPnlMortalidade(javax.swing.JPanel pnlMortalidade) {
		this.pnlMortalidade = pnlMortalidade;
	}
}
