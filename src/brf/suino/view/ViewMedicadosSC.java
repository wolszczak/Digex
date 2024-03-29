package brf.suino.view;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

public class ViewMedicadosSC extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	private javax.swing.JFormattedTextField baiaJFT;
	private JPanel baiaJP;
	private JPanel baiaJP_1;
	private javax.swing.JFormattedTextField trata2JFT;
	private javax.swing.JFormattedTextField trataJFT;
	private javax.swing.JFormattedTextField galpaoJFT;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JLabel brincoLabel;
	private javax.swing.JLabel medicamentoLabel;
	private javax.swing.JLabel escolhaLabel;
	private javax.swing.JLabel voltarLabel;
	private javax.swing.JLabel dataLabel;
	private javax.swing.JLabel ordemLabel;
	private javax.swing.JLabel dose1Label;
	private javax.swing.JLabel causaLabel;
	private javax.swing.JLabel controleLabel;
	private javax.swing.JLabel baiaLabel;
	private javax.swing.JLabel trataLabel;
	private javax.swing.JLabel sexoLabel;
	private javax.swing.JLabel sairLabel;
	private javax.swing.JLabel opcaoLabel;
	private javax.swing.JLabel galpaoLabel;
	private javax.swing.JLabel trata2Label;
	private javax.swing.JLabel dose2Label;
	private javax.swing.JLabel dose3Label;
	private javax.swing.JLabel headerLabel;
	private javax.swing.JFormattedTextField ordemJFT;
	private javax.swing.JFormattedTextField causaJFT;
	private javax.swing.JFormattedTextField brincoJFT;
	private javax.swing.JFormattedTextField dataJFT;
	private javax.swing.JFormattedTextField medicamentoJFT;
	private javax.swing.JFormattedTextField controleJFT;
	private javax.swing.JFormattedTextField dose1JFT;
	private javax.swing.JFormattedTextField dose2JFT;
	private javax.swing.JFormattedTextField dose3JFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JLabel dataHist1Label;
	private javax.swing.JLabel dataHist2Label;
	private javax.swing.JLabel dataHist3Label;
	private javax.swing.JLabel dataHist4Label;
	private javax.swing.JLabel dataHist5Label;
	private javax.swing.JLabel brincoHist1Label;
	private javax.swing.JLabel causaHist1Label;
	private javax.swing.JLabel brincoHist2Label;
	private javax.swing.JLabel causaHist2Label;
	private javax.swing.JLabel brincoHist3Label;
	private javax.swing.JLabel causaHist3Label;
	private javax.swing.JLabel brincoHist4Label;
	private javax.swing.JLabel causaHist4Label;
	private javax.swing.JLabel brincoHist5Label;
	private javax.swing.JLabel causaHist5Label;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel pnlMedicados;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JLabel medicamentoHist1Label;
	private javax.swing.JLabel dose1Hist1Label;
	private javax.swing.JLabel dose2Hist1Label;
	private javax.swing.JLabel dose3Hist1Label;
	private javax.swing.JLabel medicamentoHist2Label;
	private javax.swing.JLabel dose1Hist2Label;
	private javax.swing.JLabel dose2Hist2Label;
	private javax.swing.JLabel dose3Hist2Label;
	private javax.swing.JLabel medicamentoHist3Label;
	private javax.swing.JLabel dose1Hist3Label;
	private javax.swing.JLabel dose2Hist3Label;
	private javax.swing.JLabel dose3Hist3Label;
	private javax.swing.JLabel medicamentoHist4Label;
	private javax.swing.JLabel dose1Hist4Label;
	private javax.swing.JLabel dose2Hist4Label;
	private javax.swing.JLabel dose3Hist4Label;
	private javax.swing.JLabel medicamentoHist5Label;
	private javax.swing.JLabel dose1Hist5Label;
	private javax.swing.JLabel dose2Hist5Label;
	private javax.swing.JLabel dose3Hist5Label;
	private JLabel registrosLabel;
	private JLabel lblDigitar;
	private JFormattedTextField controleBrincos;
	private JLabel lblControleBrincos;

	public ViewMedicadosSC() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		baiaJP = new javax.swing.JPanel();
		jLabel31 = new javax.swing.JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		jLabel44 = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new javax.swing.JLabel();
		trata2JFT = new javax.swing.JFormattedTextField();
		jLabel33 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		baiaJP_1 = new javax.swing.JPanel();
		baiaLabel = new javax.swing.JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		sexoJFT = new javax.swing.JFormattedTextField();
		trataLabel = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		galpaoLabel = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		trata2Label = new javax.swing.JLabel();
		trata2JFT = new javax.swing.JFormattedTextField();
		sexoLabel = new javax.swing.JLabel();
		jPanel7 = new javax.swing.JPanel();
		escolhaLabel = new javax.swing.JLabel();
		sairLabel = new javax.swing.JLabel();
		opcaoLabel = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		voltarLabel = new javax.swing.JLabel();
		pnlMedicados = new javax.swing.JPanel();
		headerLabel = new javax.swing.JLabel();
		brincoHist4Label = new javax.swing.JLabel();
		brincoLabel = new javax.swing.JLabel();
		medicamentoHist4Label = new javax.swing.JLabel();
		brincoJFT = new javax.swing.JFormattedTextField();
		brincoHist5Label = new javax.swing.JLabel();
		medicamentoLabel = new javax.swing.JLabel();
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
		dataLabel = new javax.swing.JLabel();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		ordemJFT = new javax.swing.JFormattedTextField();
		ordemLabel = new javax.swing.JLabel();
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
		dose1Label = new javax.swing.JLabel();
		causaLabel = new javax.swing.JLabel();
		controleJFT = new javax.swing.JFormattedTextField();
		controleLabel = new javax.swing.JLabel();
		dose2Label = new javax.swing.JLabel();
		dose2Hist1Label = new javax.swing.JLabel();
		dose2Hist2Label = new javax.swing.JLabel();
		dose2Hist3Label = new javax.swing.JLabel();
		dose2Hist4Label = new javax.swing.JLabel();
		dose2Hist5Label = new javax.swing.JLabel();
		dose2JFT = new javax.swing.JFormattedTextField();
		dose3Label = new javax.swing.JLabel();
		dose3Hist1Label = new javax.swing.JLabel();
		dose3Hist2Label = new javax.swing.JLabel();
		dose3Hist3Label = new javax.swing.JLabel();
		dose3Hist4Label = new javax.swing.JLabel();
		dose3Hist5Label = new javax.swing.JLabel();
		dose3JFT = new javax.swing.JFormattedTextField();

		baiaJP_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP_1);
		baiaJP_1.setLayout(baiaJPLayout);
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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		baiaLabel.setText("Baia");

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

		trataLabel.setText("Trat.");

		try {
			trataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trataJFT.setEnabled(false);

		galpaoLabel.setText("Galpão");

		galpaoJFT.setEditable(false);
		try {
			galpaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		galpaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		galpaoJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				galpaoJFT1ActionPerformed(evt);
			}
		});

		trata2Label.setText("Trat. 2");

		try {
			trata2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trata2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trata2JFT.setEnabled(false);

		sexoLabel.setText("Sexo");

		javax.swing.GroupLayout baiaJP1Layout = new javax.swing.GroupLayout(baiaJP_1);
		baiaJP_1.setLayout(baiaJP1Layout);
		baiaJP1Layout.setHorizontalGroup(baiaJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(baiaJP1Layout.createSequentialGroup().addContainerGap().addComponent(galpaoLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(galpaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(baiaLabel)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(baiaJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(16, 16, 16).addComponent(sexoLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(sexoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(trataLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(trataJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(16, 16, 16).addComponent(trata2Label).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(trata2JFT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(92, Short.MAX_VALUE)));
		baiaJP1Layout
				.setVerticalGroup(
						baiaJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(baiaJP1Layout.createSequentialGroup().addContainerGap()
										.addGroup(baiaJP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(baiaLabel)
												.addComponent(baiaJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(sexoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(trataLabel)
												.addComponent(trataJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(galpaoLabel)
												.addComponent(galpaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(sexoLabel).addComponent(trata2Label).addComponent(trata2JFT,
														javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		escolhaLabel.setText("Escolha uma opção:");

		sairLabel.setText("[0] - Sair");

		opcaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		opcaoLabel.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		opcaoJFT.setEnabled(false);

		voltarLabel.setText("[9] - Voltar");

		lblDigitar = new JLabel();
		lblDigitar.setText("[1] - Digitar próxima baia");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDigitar, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
								.addGroup(jPanel7Layout.createSequentialGroup().addGap(4)
										.addComponent(opcaoLabel, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel7Layout.createSequentialGroup().addComponent(sairLabel).addGap(124, 134, Short.MAX_VALUE))
								.addComponent(voltarLabel).addComponent(escolhaLabel))
						.addContainerGap()));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(escolhaLabel)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblDigitar)
								.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE).addComponent(voltarLabel)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(sairLabel).addGap(36)
								.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE).addComponent(opcaoLabel).addComponent(
										opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		jPanel7.setLayout(jPanel7Layout);

		pnlMedicados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		headerLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		headerLabel.setText("Medicados");

		brincoHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		brincoHist4Label.setEnabled(false);

		brincoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		brincoLabel.setText("Brinco");

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

		medicamentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoLabel.setText("Medicamento");

		medicamentoHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		medicamentoHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		medicamentoHist5Label.setEnabled(false);

		try {
			medicamentoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
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

		try {
			dataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dataJFT.setToolTipText("");
		dataJFT.setEnabled(false);

		dataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataLabel.setText("Data");

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

		ordemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemLabel.setText("Ordem");

		try {
			dose1JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dose1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dose1JFT.setEnabled(false);

		try {
			causaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
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

		dose1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose1Label.setText("Dose 1");

		causaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		causaLabel.setText("Causa");

		try {
			controleJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleJFT.setEnabled(false);
		controleJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleFornecidaJFT1ActionPerformed(evt);
			}
		});

		controleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		controleLabel.setText("Controle");

		dose2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Label.setText("Dose 2");

		dose2Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose2Hist1Label.setEnabled(false);

		dose2Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose2Hist2Label.setEnabled(false);

		dose2Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose2Hist3Label.setEnabled(false);

		dose2Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose2Hist4Label.setEnabled(false);

		dose2Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose2Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose2Hist5Label.setEnabled(false);

		try {
			dose2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dose2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dose2JFT.setEnabled(false);

		dose3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Label.setText("Dose 3");

		dose3Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose3Hist1Label.setEnabled(false);

		dose3Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose3Hist2Label.setEnabled(false);

		dose3Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose3Hist3Label.setEnabled(false);

		dose3Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose3Hist4Label.setEnabled(false);

		dose3Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dose3Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		dose3Hist5Label.setEnabled(false);

		try {
			dose3JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dose3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dose3JFT.setEnabled(false);

		controleBrincos = new JFormattedTextField();
		try {
			controleBrincos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleBrincos.setHorizontalAlignment(SwingConstants.CENTER);
		controleBrincos.setEnabled(false);

		lblControleBrincos = new JLabel();
		lblControleBrincos.setText("Controle Brincos");
		lblControleBrincos.setHorizontalAlignment(SwingConstants.CENTER);

		javax.swing.GroupLayout gl_pnlMedicados = new javax.swing.GroupLayout(pnlMedicados);
		gl_pnlMedicados.setHorizontalGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
				.addComponent(headerLabel, GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
				.addGroup(gl_pnlMedicados.createSequentialGroup().addContainerGap().addGroup(gl_pnlMedicados
						.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(ordemHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ordemHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ordemHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ordemHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ordemHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(ordemLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(ordemJFT)).addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(dataHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dataHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dataHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dataHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dataHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(dataLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(brincoHist5Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(brincoHist4Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(brincoHist3Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(brincoHist2Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(brincoHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(brincoLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(brincoJFT, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING)
								.addComponent(medicamentoLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
										.addComponent(medicamentoHist1Label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(medicamentoHist2Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(medicamentoHist3Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(medicamentoHist4Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(medicamentoHist5Label, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(medicamentoJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING)
								.addComponent(causaLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
										.addComponent(causaHist2Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(causaHist1Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(causaHist3Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(causaHist4Label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING, false)
										.addComponent(causaHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(causaJFT, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING, false).addComponent(dose1JFT, Alignment.TRAILING)
								.addComponent(dose1Hist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Hist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose1Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING, false).addComponent(dose2JFT, Alignment.TRAILING)
								.addComponent(dose2Hist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose2Hist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose2Hist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose2Hist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose2Hist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose2Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING, false).addComponent(dose3JFT, Alignment.TRAILING)
								.addComponent(dose3Hist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose3Hist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose3Hist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose3Hist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose3Hist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(dose3Label, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING).addComponent(controleJFT, 88, 88, 88)
								.addComponent(controleLabel, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING)
								.addComponent(controleBrincos, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblControleBrincos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_pnlMedicados.setVerticalGroup(gl_pnlMedicados.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlMedicados.createSequentialGroup().addContainerGap().addComponent(headerLabel)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlMedicados
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(gl_pnlMedicados.createSequentialGroup()
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.BASELINE).addComponent(brincoLabel)
												.addComponent(medicamentoLabel))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(medicamentoHist1Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(brincoHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(brincoHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addComponent(medicamentoHist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING, false)
												.addComponent(brincoHist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
												.addComponent(medicamentoHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(brincoHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addComponent(medicamentoHist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(
												gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
														.addComponent(brincoHist5Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																medicamentoHist5Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlMedicados.createSequentialGroup().addComponent(dataLabel)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(dataHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dataHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dataHist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dataHist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE).addGap(11)
										.addComponent(dataHist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.BASELINE)
												.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(brincoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(medicamentoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(causaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(dose1JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlMedicados.createSequentialGroup().addComponent(ordemLabel)
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
								.addGroup(gl_pnlMedicados.createSequentialGroup()
										.addGroup(gl_pnlMedicados
												.createParallelGroup(Alignment.BASELINE).addComponent(causaLabel).addComponent(dose1Label))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(dose1Hist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addComponent(causaHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(causaHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addComponent(dose1Hist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(
												gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
														.addComponent(causaHist3Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(dose1Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(
												gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
														.addComponent(causaHist4Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(dose1Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(
												gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
														.addComponent(causaHist5Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(dose1Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
																GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlMedicados.createSequentialGroup().addComponent(dose2Label)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(dose2Hist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dose2Hist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dose2Hist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dose2Hist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dose2Hist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlMedicados.createSequentialGroup().addGroup(gl_pnlMedicados
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.BASELINE).addComponent(controleLabel)
												.addComponent(lblControleBrincos))
										.addGroup(gl_pnlMedicados.createSequentialGroup().addComponent(dose3Label)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(dose3Hist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(dose3Hist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(dose3Hist3Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(dose3Hist4Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(dose3Hist5Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.LEADING)
												.addComponent(dose2JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_pnlMedicados.createParallelGroup(Alignment.BASELINE)
														.addComponent(dose3JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addComponent(controleJFT, GroupLayout.PREFERRED_SIZE, 20,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(controleBrincos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnlMedicados.setLayout(gl_pnlMedicados);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(pnlMedicados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(baiaJP_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 384, Short.MAX_VALUE)))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(baiaJP_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnlMedicados, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE).addGap(31))
				.addGroup(Alignment.LEADING,
						jPanel1Layout.createSequentialGroup().addGap(111)
								.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(20, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		registrosLabel = new JLabel();
		registrosLabel.setText("Registros salvos com sucesso!!");
		registrosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		registrosLabel.setForeground(new Color(0, 153, 255));
		registrosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(registrosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
						.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(registrosLabel).addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void galpaoJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_galpaoJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_galpaoJFTActionPerformed

	private void controleFornecidaJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleFornecidaJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleFornecidaJFT1ActionPerformed

	private void galpaoJFT1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_galpaoJFT1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_galpaoJFT1ActionPerformed

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
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewMedicadosSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
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

	public JPanel getBaiaJP() {
		return baiaJP;
	}

	public void setBaiaJP(JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	public JPanel getBaiaJP_1() {
		return baiaJP_1;
	}

	public void setBaiaJP_1(JPanel baiaJP_1) {
		this.baiaJP_1 = baiaJP_1;
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

	public javax.swing.JFormattedTextField getGalpaoJFT() {
		return galpaoJFT;
	}

	public void setGalpaoJFT(javax.swing.JFormattedTextField galpaoJFT) {
		this.galpaoJFT = galpaoJFT;
	}

	public javax.swing.JFormattedTextField getSexoJFT() {
		return sexoJFT;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public javax.swing.JLabel getBrincoLabel() {
		return brincoLabel;
	}

	public void setBrincoLabel(javax.swing.JLabel brincoLabel) {
		this.brincoLabel = brincoLabel;
	}

	public javax.swing.JLabel getMedicamentoLabel() {
		return medicamentoLabel;
	}

	public void setMedicamentoLabel(javax.swing.JLabel medicamentoLabel) {
		this.medicamentoLabel = medicamentoLabel;
	}

	public javax.swing.JLabel getEscolhaLabel() {
		return escolhaLabel;
	}

	public void setEscolhaLabel(javax.swing.JLabel escolhaLabel) {
		this.escolhaLabel = escolhaLabel;
	}

	public javax.swing.JLabel getVoltarLabel() {
		return voltarLabel;
	}

	public void setVoltarLabel(javax.swing.JLabel voltarLabel) {
		this.voltarLabel = voltarLabel;
	}

	public javax.swing.JLabel getDataLabel() {
		return dataLabel;
	}

	public void setDataLabel(javax.swing.JLabel dataLabel) {
		this.dataLabel = dataLabel;
	}

	public javax.swing.JLabel getOrdemLabel() {
		return ordemLabel;
	}

	public void setOrdemLabel(javax.swing.JLabel ordemLabel) {
		this.ordemLabel = ordemLabel;
	}

	public javax.swing.JLabel getDose1Label() {
		return dose1Label;
	}

	public void setDose1Label(javax.swing.JLabel dose1Label) {
		this.dose1Label = dose1Label;
	}

	public javax.swing.JLabel getCausaLabel() {
		return causaLabel;
	}

	public void setCausaLabel(javax.swing.JLabel causaLabel) {
		this.causaLabel = causaLabel;
	}

	public javax.swing.JLabel getControleLabel() {
		return controleLabel;
	}

	public void setControleLabel(javax.swing.JLabel controleLabel) {
		this.controleLabel = controleLabel;
	}

	public javax.swing.JLabel getBaiaLabel() {
		return baiaLabel;
	}

	public void setBaiaLabel(javax.swing.JLabel baiaLabel) {
		this.baiaLabel = baiaLabel;
	}

	public javax.swing.JLabel getTrataLabel() {
		return trataLabel;
	}

	public void setTrataLabel(javax.swing.JLabel trataLabel) {
		this.trataLabel = trataLabel;
	}

	public javax.swing.JLabel getSexoLabel() {
		return sexoLabel;
	}

	public void setSexoLabel(javax.swing.JLabel sexoLabel) {
		this.sexoLabel = sexoLabel;
	}

	public javax.swing.JLabel getSairLabel() {
		return sairLabel;
	}

	public void setSairLabel(javax.swing.JLabel sairLabel) {
		this.sairLabel = sairLabel;
	}

	public javax.swing.JLabel getOpcaoLabel() {
		return opcaoLabel;
	}

	public void setOpcaoLabel(javax.swing.JLabel opcaoLabel) {
		this.opcaoLabel = opcaoLabel;
	}

	public javax.swing.JLabel getGalpaoLabel() {
		return galpaoLabel;
	}

	public void setGalpaoLabel(javax.swing.JLabel galpaoLabel) {
		this.galpaoLabel = galpaoLabel;
	}

	public javax.swing.JLabel getTrata2Label() {
		return trata2Label;
	}

	public void setTrata2Label(javax.swing.JLabel trata2Label) {
		this.trata2Label = trata2Label;
	}

	public javax.swing.JLabel getDose2Label() {
		return dose2Label;
	}

	public void setDose2Label(javax.swing.JLabel dose2Label) {
		this.dose2Label = dose2Label;
	}

	public javax.swing.JLabel getDose3Label() {
		return dose3Label;
	}

	public void setDose3Label(javax.swing.JLabel dose3Label) {
		this.dose3Label = dose3Label;
	}

	public javax.swing.JLabel getHeaderLabel() {
		return headerLabel;
	}

	public void setHeaderLabel(javax.swing.JLabel headerLabel) {
		this.headerLabel = headerLabel;
	}

	public javax.swing.JFormattedTextField getOrdemJFT() {
		return ordemJFT;
	}

	public void setOrdemJFT(javax.swing.JFormattedTextField ordemJFT) {
		this.ordemJFT = ordemJFT;
	}

	public javax.swing.JFormattedTextField getCausaJFT() {
		return causaJFT;
	}

	public void setCausaJFT(javax.swing.JFormattedTextField causaJFT) {
		this.causaJFT = causaJFT;
	}

	public javax.swing.JFormattedTextField getBrincoJFT() {
		return brincoJFT;
	}

	public void setBrincoJFT(javax.swing.JFormattedTextField brincoJFT) {
		this.brincoJFT = brincoJFT;
	}

	public javax.swing.JFormattedTextField getDataJFT() {
		return dataJFT;
	}

	public void setDataJFT(javax.swing.JFormattedTextField dataJFT) {
		this.dataJFT = dataJFT;
	}

	public javax.swing.JFormattedTextField getMedicamentoJFT() {
		return medicamentoJFT;
	}

	public void setMedicamentoJFT(javax.swing.JFormattedTextField medicamentoJFT) {
		this.medicamentoJFT = medicamentoJFT;
	}

	public javax.swing.JFormattedTextField getControleJFT() {
		return controleJFT;
	}

	public void setControleJFT(javax.swing.JFormattedTextField controleJFT) {
		this.controleJFT = controleJFT;
	}

	public javax.swing.JFormattedTextField getDose1JFT() {
		return dose1JFT;
	}

	public void setDose1JFT(javax.swing.JFormattedTextField dose1jft) {
		dose1JFT = dose1jft;
	}

	public javax.swing.JFormattedTextField getDose2JFT() {
		return dose2JFT;
	}

	public void setDose2JFT(javax.swing.JFormattedTextField dose2jft) {
		dose2JFT = dose2jft;
	}

	public javax.swing.JFormattedTextField getDose3JFT() {
		return dose3JFT;
	}

	public void setDose3JFT(javax.swing.JFormattedTextField dose3jft) {
		dose3JFT = dose3jft;
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

	public javax.swing.JLabel getBrincoHist1Label() {
		return brincoHist1Label;
	}

	public void setBrincoHist1Label(javax.swing.JLabel brincoHist1Label) {
		this.brincoHist1Label = brincoHist1Label;
	}

	public javax.swing.JLabel getCausaHist1Label() {
		return causaHist1Label;
	}

	public void setCausaHist1Label(javax.swing.JLabel causaHist1Label) {
		this.causaHist1Label = causaHist1Label;
	}

	public javax.swing.JLabel getBrincoHist2Label() {
		return brincoHist2Label;
	}

	public void setBrincoHist2Label(javax.swing.JLabel brincoHist2Label) {
		this.brincoHist2Label = brincoHist2Label;
	}

	public javax.swing.JLabel getCausaHist2Label() {
		return causaHist2Label;
	}

	public void setCausaHist2Label(javax.swing.JLabel causaHist2Label) {
		this.causaHist2Label = causaHist2Label;
	}

	public javax.swing.JLabel getBrincoHist3Label() {
		return brincoHist3Label;
	}

	public void setBrincoHist3Label(javax.swing.JLabel brincoHist3Label) {
		this.brincoHist3Label = brincoHist3Label;
	}

	public javax.swing.JLabel getCausaHist3Label() {
		return causaHist3Label;
	}

	public void setCausaHist3Label(javax.swing.JLabel causaHist3Label) {
		this.causaHist3Label = causaHist3Label;
	}

	public javax.swing.JLabel getBrincoHist4Label() {
		return brincoHist4Label;
	}

	public void setBrincoHist4Label(javax.swing.JLabel brincoHist4Label) {
		this.brincoHist4Label = brincoHist4Label;
	}

	public javax.swing.JLabel getCausaHist4Label() {
		return causaHist4Label;
	}

	public void setCausaHist4Label(javax.swing.JLabel causaHist4Label) {
		this.causaHist4Label = causaHist4Label;
	}

	public javax.swing.JLabel getBrincoHist5Label() {
		return brincoHist5Label;
	}

	public void setBrincoHist5Label(javax.swing.JLabel brincoHist5Label) {
		this.brincoHist5Label = brincoHist5Label;
	}

	public javax.swing.JLabel getCausaHist5Label() {
		return causaHist5Label;
	}

	public void setCausaHist5Label(javax.swing.JLabel causaHist5Label) {
		this.causaHist5Label = causaHist5Label;
	}

	public javax.swing.JLabel getjLabel31() {
		return jLabel31;
	}

	public void setjLabel31(javax.swing.JLabel jLabel31) {
		this.jLabel31 = jLabel31;
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

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JPanel getPnlMedicados() {
		return pnlMedicados;
	}

	public void setPnlMedicados(javax.swing.JPanel pnlMedicados) {
		this.pnlMedicados = pnlMedicados;
	}

	public javax.swing.JPanel getjPanel7() {
		return jPanel7;
	}

	public void setjPanel7(javax.swing.JPanel jPanel7) {
		this.jPanel7 = jPanel7;
	}

	public javax.swing.JLabel getMedicamentoHist1Label() {
		return medicamentoHist1Label;
	}

	public void setMedicamentoHist1Label(javax.swing.JLabel medicamentoHist1Label) {
		this.medicamentoHist1Label = medicamentoHist1Label;
	}

	public javax.swing.JLabel getDose1Hist1Label() {
		return dose1Hist1Label;
	}

	public void setDose1Hist1Label(javax.swing.JLabel dose1Hist1Label) {
		this.dose1Hist1Label = dose1Hist1Label;
	}

	public javax.swing.JLabel getDose2Hist1Label() {
		return dose2Hist1Label;
	}

	public void setDose2Hist1Label(javax.swing.JLabel dose2Hist1Label) {
		this.dose2Hist1Label = dose2Hist1Label;
	}

	public javax.swing.JLabel getDose3Hist1Label() {
		return dose3Hist1Label;
	}

	public void setDose3Hist1Label(javax.swing.JLabel dose3Hist1Label) {
		this.dose3Hist1Label = dose3Hist1Label;
	}

	public javax.swing.JLabel getMedicamentoHist2Label() {
		return medicamentoHist2Label;
	}

	public void setMedicamentoHist2Label(javax.swing.JLabel medicamentoHist2Label) {
		this.medicamentoHist2Label = medicamentoHist2Label;
	}

	public javax.swing.JLabel getDose1Hist2Label() {
		return dose1Hist2Label;
	}

	public void setDose1Hist2Label(javax.swing.JLabel dose1Hist2Label) {
		this.dose1Hist2Label = dose1Hist2Label;
	}

	public javax.swing.JLabel getDose2Hist2Label() {
		return dose2Hist2Label;
	}

	public void setDose2Hist2Label(javax.swing.JLabel dose2Hist2Label) {
		this.dose2Hist2Label = dose2Hist2Label;
	}

	public javax.swing.JLabel getDose3Hist2Label() {
		return dose3Hist2Label;
	}

	public void setDose3Hist2Label(javax.swing.JLabel dose3Hist2Label) {
		this.dose3Hist2Label = dose3Hist2Label;
	}

	public javax.swing.JLabel getMedicamentoHist3Label() {
		return medicamentoHist3Label;
	}

	public void setMedicamentoHist3Label(javax.swing.JLabel medicamentoHist3Label) {
		this.medicamentoHist3Label = medicamentoHist3Label;
	}

	public javax.swing.JLabel getDose1Hist3Label() {
		return dose1Hist3Label;
	}

	public void setDose1Hist3Label(javax.swing.JLabel dose1Hist3Label) {
		this.dose1Hist3Label = dose1Hist3Label;
	}

	public javax.swing.JLabel getDose2Hist3Label() {
		return dose2Hist3Label;
	}

	public void setDose2Hist3Label(javax.swing.JLabel dose2Hist3Label) {
		this.dose2Hist3Label = dose2Hist3Label;
	}

	public javax.swing.JLabel getDose3Hist3Label() {
		return dose3Hist3Label;
	}

	public void setDose3Hist3Label(javax.swing.JLabel dose3Hist3Label) {
		this.dose3Hist3Label = dose3Hist3Label;
	}

	public javax.swing.JLabel getMedicamentoHist4Label() {
		return medicamentoHist4Label;
	}

	public void setMedicamentoHist4Label(javax.swing.JLabel medicamentoHist4Label) {
		this.medicamentoHist4Label = medicamentoHist4Label;
	}

	public javax.swing.JLabel getDose1Hist4Label() {
		return dose1Hist4Label;
	}

	public void setDose1Hist4Label(javax.swing.JLabel dose1Hist4Label) {
		this.dose1Hist4Label = dose1Hist4Label;
	}

	public javax.swing.JLabel getDose2Hist4Label() {
		return dose2Hist4Label;
	}

	public void setDose2Hist4Label(javax.swing.JLabel dose2Hist4Label) {
		this.dose2Hist4Label = dose2Hist4Label;
	}

	public javax.swing.JLabel getDose3Hist4Label() {
		return dose3Hist4Label;
	}

	public void setDose3Hist4Label(javax.swing.JLabel dose3Hist4Label) {
		this.dose3Hist4Label = dose3Hist4Label;
	}

	public javax.swing.JLabel getMedicamentoHist5Label() {
		return medicamentoHist5Label;
	}

	public void setMedicamentoHist5Label(javax.swing.JLabel medicamentoHist5Label) {
		this.medicamentoHist5Label = medicamentoHist5Label;
	}

	public javax.swing.JLabel getDose1Hist5Label() {
		return dose1Hist5Label;
	}

	public void setDose1Hist5Label(javax.swing.JLabel dose1Hist5Label) {
		this.dose1Hist5Label = dose1Hist5Label;
	}

	public javax.swing.JLabel getDose2Hist5Label() {
		return dose2Hist5Label;
	}

	public void setDose2Hist5Label(javax.swing.JLabel dose2Hist5Label) {
		this.dose2Hist5Label = dose2Hist5Label;
	}

	public javax.swing.JLabel getDose3Hist5Label() {
		return dose3Hist5Label;
	}

	public void setDose3Hist5Label(javax.swing.JLabel dose3Hist5Label) {
		this.dose3Hist5Label = dose3Hist5Label;
	}

	public JLabel getRegistrosLabel() {
		return registrosLabel;
	}

	public void setRegistrosLabel(JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

	public JFormattedTextField getControleBrincos() {
		return controleBrincos;
	}

	public void setControleBrincos(JFormattedTextField controleBrincos) {
		this.controleBrincos = controleBrincos;
	}

}
