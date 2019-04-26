package brf.suino.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;

public class ViewConsumoSC extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JFormattedTextField galpaoJFT;
	private javax.swing.JFormattedTextField baiaJFT;
	private javax.swing.JPanel baiaJP;
	private javax.swing.JPanel consumoJP;
	private javax.swing.JLabel faseConsumoLabel;
	private javax.swing.JLabel fornecidaHist1Label;
	private javax.swing.JLabel fornecidaHist2Label;
	private javax.swing.JLabel fornecidaHist3Label;
	private javax.swing.JLabel fornecidaHist4Label;
	private javax.swing.JLabel fornecidaHist5Label;
	private javax.swing.JFormattedTextField fornecidaJFT;
	private javax.swing.JLabel Data1HistLabel;
	private javax.swing.JLabel Data2HistLabel;
	private javax.swing.JLabel Data3HistLabel;
	private javax.swing.JLabel Data4HistLabel;
	private javax.swing.JLabel Data5HistLabel;
	private javax.swing.JFormattedTextField dataJFT;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel Data;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel controleBaiaLabel;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JFormattedTextField trata2JFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JFormattedTextField ordemJFT;
	private javax.swing.JFormattedTextField sexoJFT;
	private javax.swing.JLabel sobraHist1Label;
	private javax.swing.JLabel sobraHist2Label;
	private javax.swing.JLabel sobraHist3Label;
	private javax.swing.JLabel sobraHist4Label;
	private javax.swing.JLabel sobraHist5Label;
	private javax.swing.JFormattedTextField sobraJFT;
	private javax.swing.JFormattedTextField trataJFT;
	private JLabel RegistrosLabel;
	private JFormattedTextField controleBaiaJFT;
	private JLabel lblPeso;
	private JLabel pesoHist1Label;
	private JLabel pesoHist2Label;
	private JLabel pesoHist3Label;
	private JLabel pesoHist4Label;
	private JLabel pesoHist5Label;
	private JFormattedTextField pesoJFT;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblNAnim_1;
	private JLabel nAnimHist1Label;
	private JLabel nAnimHist3Label;
	private JLabel nAnimHist4Label;
	private JLabel nAnimHist5Label;
	private JFormattedTextField nAnimaisJFT;
	private JLabel nAnimHist2Label;
	private JCheckBox chkUsarColunaExtra;
	private javax.swing.JFormattedTextField controleFornecidaJFT;
	private javax.swing.JFormattedTextField controleSobraJFT;

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		controleBaiaLabel = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		baiaJFT = new javax.swing.JFormattedTextField();
		jLabel32 = new javax.swing.JLabel();
		sexoJFT = new javax.swing.JFormattedTextField();
		jLabel34 = new javax.swing.JLabel();
		trata2JFT = new javax.swing.JFormattedTextField();
		jLabel44 = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		jLabel45 = new javax.swing.JLabel();
		trataJFT = new javax.swing.JFormattedTextField();
		consumoJP = new javax.swing.JPanel();
		faseConsumoLabel = new javax.swing.JLabel();
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
		Data1HistLabel = new javax.swing.JLabel();
		Data2HistLabel = new javax.swing.JLabel();
		Data3HistLabel = new javax.swing.JLabel();
		Data4HistLabel = new javax.swing.JLabel();
		Data5HistLabel = new javax.swing.JLabel();
		dataJFT = new javax.swing.JFormattedTextField();
		Data = new javax.swing.JLabel();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		ordemJFT = new javax.swing.JFormattedTextField();
		jLabel14 = new javax.swing.JLabel();
		chkUsarColunaExtra = new JCheckBox();
		controleFornecidaJFT = new JFormattedTextField();
		controleSobraJFT = new JFormattedTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		controleBaiaLabel.setText("Controle");

		jLabel31.setText("Baia");

		try {
			baiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel32.setText("Sexo");

		try {
			sexoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		sexoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		sexoJFT.setEnabled(false);

		jLabel34.setText("Trat.2");

		try {
			trata2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trata2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trata2JFT.setEnabled(false);

		jLabel44.setText("Galpão");

		galpaoJFT.setEditable(false);
		try {
			galpaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		galpaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel45.setText("Trat.");

		try {
			trataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		trataJFT.setEnabled(false);

		controleBaiaJFT = new JFormattedTextField();
		try {
			controleBaiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleBaiaJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleBaiaJFT.setEnabled(false);

		chkUsarColunaExtra = new JCheckBox("Usar Coluna Pesos / Nº Anim.");

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING).addGroup(baiaJPLayout.createSequentialGroup()
				.addContainerGap().addComponent(jLabel44).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel31).addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel32).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel45).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel34).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(trata2JFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(controleBaiaLabel).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(chkUsarColunaExtra).addContainerGap(107, Short.MAX_VALUE)));
		baiaJPLayout.setVerticalGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel31)
								.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel44)
								.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel32)
								.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel45)
								.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel34)
								.addComponent(trata2JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleBaiaLabel)
								.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(chkUsarColunaExtra))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		baiaJP.setLayout(baiaJPLayout);

		consumoJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		faseConsumoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		faseConsumoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

		Data1HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data1HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		Data1HistLabel.setEnabled(false);

		Data2HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data2HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		Data2HistLabel.setEnabled(false);

		Data3HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data3HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		Data3HistLabel.setEnabled(false);

		Data4HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data4HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		Data4HistLabel.setEnabled(false);

		Data5HistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data5HistLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
		Data5HistLabel.setEnabled(false);

		try {
			dataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dataJFT.setEnabled(false);

		Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Data.setText("Data");

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

		lblPeso = new JLabel();
		lblPeso.setText("Peso");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);

		pesoHist1Label = new JLabel();
		pesoHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoHist1Label.setEnabled(false);
		pesoHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pesoHist2Label = new JLabel();
		pesoHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoHist2Label.setEnabled(false);
		pesoHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pesoHist3Label = new JLabel();
		pesoHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoHist3Label.setEnabled(false);
		pesoHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pesoHist4Label = new JLabel();
		pesoHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoHist4Label.setEnabled(false);
		pesoHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pesoHist5Label = new JLabel();
		pesoHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		pesoHist5Label.setEnabled(false);
		pesoHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pesoJFT = new JFormattedTextField();
		try {
			pesoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT.setHorizontalAlignment(SwingConstants.CENTER);
		pesoJFT.setEnabled(false);

		label_10 = new JLabel();
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setEnabled(false);

		label_11 = new JLabel();
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setEnabled(false);

		lblNAnim_1 = new JLabel();
		lblNAnim_1.setText("Nº Anim.");
		lblNAnim_1.setHorizontalAlignment(SwingConstants.CENTER);

		nAnimHist1Label = new JLabel();
		nAnimHist1Label.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimHist1Label.setEnabled(false);
		nAnimHist1Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		nAnimHist3Label = new JLabel();
		nAnimHist3Label.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimHist3Label.setEnabled(false);
		nAnimHist3Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		nAnimHist4Label = new JLabel();
		nAnimHist4Label.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimHist4Label.setEnabled(false);
		nAnimHist4Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		nAnimHist5Label = new JLabel();
		nAnimHist5Label.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimHist5Label.setEnabled(false);
		nAnimHist5Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		nAnimaisJFT = new JFormattedTextField();
		try {
			nAnimaisJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nAnimaisJFT.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimaisJFT.setEnabled(false);

		nAnimHist2Label = new JLabel();
		nAnimHist2Label.setHorizontalAlignment(SwingConstants.CENTER);
		nAnimHist2Label.setEnabled(false);
		nAnimHist2Label.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

		JLabel label = new JLabel();
		label.setText("Controles");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 12));

		controleFornecidaJFT = new JFormattedTextField();
		try {
			controleFornecidaJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleFornecidaJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleFornecidaJFT.setEnabled(false);

		JLabel label_1 = new JLabel();
		label_1.setText("Fornecida");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_2 = new JLabel();
		label_2.setText("Sobra");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);

		controleSobraJFT = new JFormattedTextField();
		try {
			controleSobraJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleSobraJFT.setHorizontalAlignment(SwingConstants.CENTER);
		controleSobraJFT.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(15)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(controleFornecidaJFT, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
												.addGroup(gl_panel.createSequentialGroup().addGap(6)
														.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(controleSobraJFT, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
										.addGap(14)))
						.addGap(4)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(label)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(label_1).addComponent(label_2)).addGap(4)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(14)));
		panel.setLayout(gl_panel);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(ordemHist5Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(ordemHist4Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(ordemHist3Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(ordemHist2Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(ordemHist1Label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(jLabel14, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(ordemJFT, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(Data, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
								.addComponent(Data1HistLabel, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addComponent(Data2HistLabel, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addComponent(Data3HistLabel, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addComponent(Data4HistLabel, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addComponent(Data5HistLabel, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(fornecidaHist5Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(fornecidaHist4Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(fornecidaHist2Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(fornecidaHist1Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(jLabel9)
								.addComponent(fornecidaHist3Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(fornecidaJFT, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(sobraHist4Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(sobraHist5Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(sobraHist2Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(sobraHist1Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraHist3Label, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
								.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoHist1Label, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(pesoHist4Label, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(pesoHist3Label, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(pesoHist5Label, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(pesoHist2Label, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(lblPeso, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
								.addComponent(pesoJFT, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(nAnimHist5Label, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
												.addComponent(nAnimHist4Label, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
												.addComponent(nAnimHist2Label, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
												.addComponent(nAnimaisJFT, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addComponent(nAnimHist3Label, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
											.addComponent(panel, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
									.addGap(6))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
										.addComponent(nAnimHist1Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
										.addComponent(lblNAnim_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
									.addContainerGap(216, Short.MAX_VALUE))))))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel6)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(10)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
											.addComponent(jLabel9)
											.addComponent(jLabel10)
											.addComponent(lblPeso))
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(Data)
												.addComponent(jLabel14))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(pesoHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(sobraHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fornecidaHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Data1HistLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
										.addComponent(ordemHist1Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(lblNAnim_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nAnimHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(ordemHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
											.addComponent(label_10)
											.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
											.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(jPanel2Layout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(nAnimHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addComponent(pesoHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(sobraHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(fornecidaHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(Data2HistLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)))
									.addGap(7)))
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(nAnimHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
								.addComponent(Data3HistLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
								.addComponent(fornecidaHist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
								.addComponent(sobraHist3Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addGap(11)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(nAnimHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist4Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
								.addComponent(Data4HistLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addGap(11)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(nAnimHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pesoHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(sobraHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fornecidaHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist5Label, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
								.addComponent(Data5HistLabel, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
							.addGap(16)
							.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordemJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(fornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(sobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(nAnimaisJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout consumoJPLayout = new javax.swing.GroupLayout(consumoJP);
		consumoJPLayout.setHorizontalGroup(consumoJPLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(faseConsumoLabel, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
				.addGroup(consumoJPLayout.createSequentialGroup().addGap(10)
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE).addContainerGap()));
		consumoJPLayout.setVerticalGroup(consumoJPLayout.createParallelGroup(Alignment.LEADING).addGroup(consumoJPLayout
				.createSequentialGroup().addContainerGap().addComponent(faseConsumoLabel).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE).addContainerGap(19, Short.MAX_VALUE)));
		consumoJP.setLayout(consumoJPLayout);

		RegistrosLabel = new JLabel();
		RegistrosLabel.setText("Registro salvo com sucesso!!");
		RegistrosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegistrosLabel.setForeground(new Color(0, 153, 255));
		RegistrosLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
												.addComponent(baiaJP, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE).addContainerGap())
										.addGroup(Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(consumoJP, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE).addGap(5))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(RegistrosLabel, GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE).addGap(5)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(RegistrosLabel)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(layout);

		pack();
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

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(javax.swing.JLabel jLabel10) {
		this.jLabel10 = jLabel10;
	}

	public javax.swing.JLabel getjLabel13() {
		return Data;
	}

	public void setjLabel13(javax.swing.JLabel jLabel13) {
		this.Data = jLabel13;
	}

	public javax.swing.JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(javax.swing.JLabel jLabel14) {
		this.jLabel14 = jLabel14;
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

	public javax.swing.JLabel getjLabel34() {
		return jLabel34;
	}

	public void setjLabel34(javax.swing.JLabel jLabel34) {
		this.jLabel34 = jLabel34;
	}

	public javax.swing.JLabel getjLabel36() {
		return controleBaiaLabel;
	}

	public void setjLabel36(javax.swing.JLabel jLabel36) {
		this.controleBaiaLabel = jLabel36;
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

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
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

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.galpaoJFT = aviarioJFT;
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

	public void setFaseConsumoLabel(javax.swing.JLabel faseConsumoLabel) {
		this.faseConsumoLabel = faseConsumoLabel;
	}

	public void setFornecidaHist1Label(javax.swing.JLabel fornecidaHist1Label) {
		this.fornecidaHist1Label = fornecidaHist1Label;
	}

	public void setFornecidaHist2Label(javax.swing.JLabel fornecidaHist2Label) {
		this.fornecidaHist2Label = fornecidaHist2Label;
	}

	public void setFornecidaHist3Label(javax.swing.JLabel fornecidaHist3Label) {
		this.fornecidaHist3Label = fornecidaHist3Label;
	}

	public void setFornecidaHist4Label(javax.swing.JLabel fornecidaHist4Label) {
		this.fornecidaHist4Label = fornecidaHist4Label;
	}

	public void setFornecidaHist5Label(javax.swing.JLabel fornecidaHist5Label) {
		this.fornecidaHist5Label = fornecidaHist5Label;
	}

	public void setFornecidaJFT(javax.swing.JFormattedTextField fornecidaJFT) {
		this.fornecidaJFT = fornecidaJFT;
	}

	public void setLinhagemJFT(javax.swing.JFormattedTextField linhagemJFT) {
		this.trata2JFT = linhagemJFT;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public void setSobraHist1Label(javax.swing.JLabel sobraHist1Label) {
		this.sobraHist1Label = sobraHist1Label;
	}

	public void setSobraHist2Label(javax.swing.JLabel sobraHist2Label) {
		this.sobraHist2Label = sobraHist2Label;
	}

	public void setSobraHist3Label(javax.swing.JLabel sobraHist3Label) {
		this.sobraHist3Label = sobraHist3Label;
	}

	public void setSobraHist4Label(javax.swing.JLabel sobraHist4Label) {
		this.sobraHist4Label = sobraHist4Label;
	}

	public void setSobraHist5Label(javax.swing.JLabel sobraHist5Label) {
		this.sobraHist5Label = sobraHist5Label;
	}

	public void setSobraJFT(javax.swing.JFormattedTextField sobraJFT) {
		this.sobraJFT = sobraJFT;
	}

	public void setTrataJFT(javax.swing.JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}

	public ViewConsumoSC() {
		initComponents();
	}

	public JFormattedTextField getAviarioJFT() {
		return galpaoJFT;
	}

	public JFormattedTextField getBaiaJFT() {
		return baiaJFT;
	}

	public JPanel getBaiaJP() {
		return baiaJP;
	}

	public JPanel getConsumoJP() {
		return consumoJP;
	}

	public JFormattedTextField getControleBaiaJFT() {
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

	public JFormattedTextField getFornecidaJFT() {
		return fornecidaJFT;
	}

	public JFormattedTextField getLinhagemJFT() {
		return trata2JFT;
	}

	public JFormattedTextField getSexoJFT() {
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

	public JFormattedTextField getSobraJFT() {
		return sobraJFT;
	}

	public JFormattedTextField getTrataJFT() {
		return trataJFT;
	}

	public JLabel getLabel() {
		return RegistrosLabel;
	}

	public void setLabel(JLabel label) {
		this.RegistrosLabel = label;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public javax.swing.JFormattedTextField getTrata2JFT() {
		return trata2JFT;
	}

	public void setTrata2JFT(javax.swing.JFormattedTextField trata2jft) {
		trata2JFT = trata2jft;
	}

	public JLabel getLblPeso() {
		return lblPeso;
	}

	public void setLblPeso(JLabel lblPeso) {
		this.lblPeso = lblPeso;
	}

	public JLabel getLabel_2() {
		return pesoHist1Label;
	}

	public void setLabel_2(JLabel label_2) {
		this.pesoHist1Label = label_2;
	}

	public JLabel getLabel_3() {
		return pesoHist2Label;
	}

	public void setLabel_3(JLabel label_3) {
		this.pesoHist2Label = label_3;
	}

	public JLabel getLabel_4() {
		return pesoHist3Label;
	}

	public void setLabel_4(JLabel label_4) {
		this.pesoHist3Label = label_4;
	}

	public JLabel getLabel_5() {
		return pesoHist4Label;
	}

	public void setLabel_5(JLabel label_5) {
		this.pesoHist4Label = label_5;
	}

	public JLabel getLabel_6() {
		return pesoHist5Label;
	}

	public void setLabel_6(JLabel label_6) {
		this.pesoHist5Label = label_6;
	}

	public JFormattedTextField getPesoJFT() {
		return pesoJFT;
	}

	public void setPesoJFT(JFormattedTextField pesoJFT) {
		this.pesoJFT = pesoJFT;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public void setLabel_10(JLabel label_10) {
		this.label_10 = label_10;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public void setLabel_11(JLabel label_11) {
		this.label_11 = label_11;
	}

	public JLabel getLblNAnim_1() {
		return lblNAnim_1;
	}

	public void setLblNAnim_1(JLabel lblNAnim_1) {
		this.lblNAnim_1 = lblNAnim_1;
	}

	public JLabel getLabel_7() {
		return nAnimHist1Label;
	}

	public void setLabel_7(JLabel label_7) {
		this.nAnimHist1Label = label_7;
	}

	public JLabel getLabel_9() {
		return nAnimHist3Label;
	}

	public void setLabel_9(JLabel label_9) {
		this.nAnimHist3Label = label_9;
	}

	public JLabel getLabel_12() {
		return nAnimHist4Label;
	}

	public void setLabel_12(JLabel label_12) {
		this.nAnimHist4Label = label_12;
	}

	public JLabel getLabel_13() {
		return nAnimHist5Label;
	}

	public void setLabel_13(JLabel label_13) {
		this.nAnimHist5Label = label_13;
	}

	public JFormattedTextField getFormattedTextField_1() {
		return nAnimaisJFT;
	}

	public void setFormattedTextField_1(JFormattedTextField formattedTextField_1) {
		this.nAnimaisJFT = formattedTextField_1;
	}

	public javax.swing.JFormattedTextField getGalpaoJFT() {
		return galpaoJFT;
	}

	public void setGalpaoJFT(javax.swing.JFormattedTextField galpaoJFT) {
		this.galpaoJFT = galpaoJFT;
	}

	public JFormattedTextField getnAnimaisJFT() {
		return nAnimaisJFT;
	}

	public void setnAnimaisJFT(JFormattedTextField nAnimaisJFT) {
		this.nAnimaisJFT = nAnimaisJFT;
	}

	public JLabel getLabel_1() {
		return nAnimHist2Label;
	}

	public void setLabel_1(JLabel label_1) {
		this.nAnimHist2Label = label_1;
	}

	public JLabel getPesoHist1Label() {
		return pesoHist1Label;
	}

	public void setPesoHist1Label(JLabel pesoHist1Label) {
		this.pesoHist1Label = pesoHist1Label;
	}

	public JLabel getPesoHist2Label() {
		return pesoHist2Label;
	}

	public void setPesoHist2Label(JLabel pesoHist2Label) {
		this.pesoHist2Label = pesoHist2Label;
	}

	public JLabel getPesoHist3Label() {
		return pesoHist3Label;
	}

	public void setPesoHist3Label(JLabel pesoHist3Label) {
		this.pesoHist3Label = pesoHist3Label;
	}

	public JLabel getPesoHist4Label() {
		return pesoHist4Label;
	}

	public void setPesoHist4Label(JLabel pesoHist4Label) {
		this.pesoHist4Label = pesoHist4Label;
	}

	public JLabel getPesoHist5Label() {
		return pesoHist5Label;
	}

	public void setPesoHist5Label(JLabel pesoHist5Label) {
		this.pesoHist5Label = pesoHist5Label;
	}

	public JLabel getnAnimHist1Label() {
		return nAnimHist1Label;
	}

	public void setnAnimHist1Label(JLabel nAnimHist1Label) {
		this.nAnimHist1Label = nAnimHist1Label;
	}

	public JLabel getnAnimHist3Label() {
		return nAnimHist3Label;
	}

	public void setnAnimHist3Label(JLabel nAnimHist3Label) {
		this.nAnimHist3Label = nAnimHist3Label;
	}

	public JLabel getnAnimHist4Label() {
		return nAnimHist4Label;
	}

	public void setnAnimHist4Label(JLabel nAnimHist4Label) {
		this.nAnimHist4Label = nAnimHist4Label;
	}

	public JLabel getnAnimHist5Label() {
		return nAnimHist5Label;
	}

	public void setnAnimHist5Label(JLabel nAnimHist5Label) {
		this.nAnimHist5Label = nAnimHist5Label;
	}

	public JLabel getnAnimHist2Label() {
		return nAnimHist2Label;
	}

	public void setnAnimHist2Label(JLabel nAnimHist2Label) {
		this.nAnimHist2Label = nAnimHist2Label;
	}

	public JCheckBox getChkUsarColunaExtra() {
		return chkUsarColunaExtra;
	}

	public void setChkUsarColunaExtra(JCheckBox chkUsarColunaExtra) {
		this.chkUsarColunaExtra = chkUsarColunaExtra;
	}

	public javax.swing.JLabel getControleBaiaLabel() {
		return controleBaiaLabel;
	}

	public void setControleBaiaLabel(javax.swing.JLabel controleBaiaLabel) {
		this.controleBaiaLabel = controleBaiaLabel;
	}

	public JLabel getRegistrosLabel() {
		return RegistrosLabel;
	}

	public void setRegistrosLabel(JLabel registrosLabel) {
		RegistrosLabel = registrosLabel;
	}

	public javax.swing.JLabel getIdadeData1Label() {
		return Data1HistLabel;
	}

	public void setIdadeData1Label(javax.swing.JLabel idadeData1Label) {
		this.Data1HistLabel = idadeData1Label;
	}

	public javax.swing.JLabel getIdadeData2Label() {
		return Data2HistLabel;
	}

	public void setIdadeData2Label(javax.swing.JLabel idadeData2Label) {
		this.Data2HistLabel = idadeData2Label;
	}

	public javax.swing.JLabel getIdadeData3Label() {
		return Data3HistLabel;
	}

	public void setIdadeData3Label(javax.swing.JLabel idadeData3Label) {
		this.Data3HistLabel = idadeData3Label;
	}

	public javax.swing.JLabel getIdadeData4Label() {
		return Data4HistLabel;
	}

	public void setIdadeData4Label(javax.swing.JLabel idadeData4Label) {
		this.Data4HistLabel = idadeData4Label;
	}

	public javax.swing.JLabel getIdadeData5Label() {
		return Data5HistLabel;
	}

	public void setIdadeData5Label(javax.swing.JLabel idadeData5Label) {
		this.Data5HistLabel = idadeData5Label;
	}

	public javax.swing.JFormattedTextField getDataJFT() {
		return dataJFT;
	}

	public void setDataJFT(javax.swing.JFormattedTextField dataJFT) {
		this.dataJFT = dataJFT;
	}

	public javax.swing.JLabel getData() {
		return Data;
	}

	public void setData(javax.swing.JLabel data) {
		Data = data;
	}

	public javax.swing.JLabel getData1HistLabel() {
		return Data1HistLabel;
	}

	public void setData1HistLabel(javax.swing.JLabel data1HistLabel) {
		Data1HistLabel = data1HistLabel;
	}

	public javax.swing.JLabel getData2HistLabel() {
		return Data2HistLabel;
	}

	public void setData2HistLabel(javax.swing.JLabel data2HistLabel) {
		Data2HistLabel = data2HistLabel;
	}

	public javax.swing.JLabel getData3HistLabel() {
		return Data3HistLabel;
	}

	public void setData3HistLabel(javax.swing.JLabel data3HistLabel) {
		Data3HistLabel = data3HistLabel;
	}

	public javax.swing.JLabel getData4HistLabel() {
		return Data4HistLabel;
	}

	public void setData4HistLabel(javax.swing.JLabel data4HistLabel) {
		Data4HistLabel = data4HistLabel;
	}

	public javax.swing.JLabel getData5HistLabel() {
		return Data5HistLabel;
	}

	public void setData5HistLabel(javax.swing.JLabel data5HistLabel) {
		Data5HistLabel = data5HistLabel;
	}

	public javax.swing.JFormattedTextField getControleFornecidaJFT() {
		return controleFornecidaJFT;
	}

	public void setControleFornecidaJFT(javax.swing.JFormattedTextField controleFornecidaJFT) {
		this.controleFornecidaJFT = controleFornecidaJFT;
	}

	public javax.swing.JFormattedTextField getControleSobraJFT() {
		return controleSobraJFT;
	}

	public void setControleSobraJFT(javax.swing.JFormattedTextField controleSobraJFT) {
		this.controleSobraJFT = controleSobraJFT;
	}
}
