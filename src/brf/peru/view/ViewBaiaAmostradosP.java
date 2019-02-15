package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JCheckBox;

public class ViewBaiaAmostradosP extends javax.swing.JFrame {

	private javax.swing.JFormattedTextField abateJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JFormattedTextField baia1JFT;
	private javax.swing.JFormattedTextField baia2JFT;
	private javax.swing.JFormattedTextField baia3JFT;
	private javax.swing.JFormattedTextField baia4JFT;
	private javax.swing.JFormattedTextField baia5JFT;
	private javax.swing.JPanel baiaAmostradosJP;
	private javax.swing.JLabel baiaHist1Label;
	private javax.swing.JLabel baiaHist2Label;
	private javax.swing.JLabel baiaHist3Label;
	private javax.swing.JLabel baiaHist4Label;
	private javax.swing.JLabel baiaHist5Label;
	private javax.swing.JFormattedTextField controleJFT;
	private javax.swing.JFormattedTextField dataAbateJFT;
	private javax.swing.JFormattedTextField idadeJFT;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JFormattedTextField nasa11JFT;
	private javax.swing.JFormattedTextField nasa12JFT;
	private javax.swing.JFormattedTextField nasa13JFT;
	private javax.swing.JFormattedTextField nasa14JFT;
	private javax.swing.JFormattedTextField nasa15JFT;
	private javax.swing.JLabel nasa1Hist1Label;
	private javax.swing.JLabel nasa1Hist2Label;
	private javax.swing.JLabel nasa1Hist3Label;
	private javax.swing.JLabel nasa1Hist4Label;
	private javax.swing.JLabel nasa1Hist5Label;
	private javax.swing.JFormattedTextField nasa21JFT;
	private javax.swing.JFormattedTextField nasa22JFT;
	private javax.swing.JFormattedTextField nasa23JFT;
	private javax.swing.JFormattedTextField nasa24JFT;
	private javax.swing.JFormattedTextField nasa25JFT;
	private javax.swing.JLabel nasa2Hist1Label;
	private javax.swing.JLabel nasa2Hist2Label;
	private javax.swing.JLabel nasa2Hist3Label;
	private javax.swing.JLabel nasa2Hist4Label;
	private javax.swing.JLabel nasa2Hist5Label;
	private javax.swing.JFormattedTextField nasa31JFT;
	private javax.swing.JFormattedTextField nasa32JFT;
	private javax.swing.JFormattedTextField nasa33JFT;
	private javax.swing.JFormattedTextField nasa34JFT;
	private javax.swing.JFormattedTextField nasa35JFT;
	private javax.swing.JLabel nasa3Hist1Label;
	private javax.swing.JLabel nasa3Hist2Label;
	private javax.swing.JLabel nasa3Hist3Label;
	private javax.swing.JLabel nasa3Hist4Label;
	private javax.swing.JLabel nasa3Hist5Label;
	private javax.swing.JFormattedTextField ordem1JFT;
	private javax.swing.JFormattedTextField ordem2JFT;
	private javax.swing.JFormattedTextField ordem3JFT;
	private javax.swing.JFormattedTextField ordem4JFT;
	private javax.swing.JFormattedTextField ordem5JFT;
	private javax.swing.JLabel ordemHist1Label;
	private javax.swing.JLabel ordemHist2Label;
	private javax.swing.JLabel ordemHist3Label;
	private javax.swing.JLabel ordemHist4Label;
	private javax.swing.JLabel ordemHist5Label;
	private javax.swing.JFormattedTextField peso11JFT;
	private javax.swing.JFormattedTextField peso12JFT;
	private javax.swing.JFormattedTextField peso13JFT;
	private javax.swing.JFormattedTextField peso14JFT;
	private javax.swing.JFormattedTextField peso15JFT;
	private javax.swing.JLabel peso1Hist1Label;
	private javax.swing.JLabel peso1Hist2Label;
	private javax.swing.JLabel peso1Hist3Label;
	private javax.swing.JLabel peso1Hist4Label;
	private javax.swing.JLabel peso1Hist5Label;
	private javax.swing.JFormattedTextField peso21JFT;
	private javax.swing.JFormattedTextField peso22JFT;
	private javax.swing.JFormattedTextField peso23JFT;
	private javax.swing.JFormattedTextField peso24JFT;
	private javax.swing.JFormattedTextField peso25JFT;
	private javax.swing.JLabel peso2Hist1Label;
	private javax.swing.JLabel peso2Hist2Label;
	private javax.swing.JLabel peso2Hist3Label;
	private javax.swing.JLabel peso2Hist4Label;
	private javax.swing.JLabel peso2Hist5Label;
	private javax.swing.JFormattedTextField peso31JFT;
	private javax.swing.JFormattedTextField peso32JFT;
	private javax.swing.JFormattedTextField peso33JFT;
	private javax.swing.JFormattedTextField peso34JFT;
	private javax.swing.JFormattedTextField peso35JFT;
	private javax.swing.JLabel peso3Hist1Label;
	private javax.swing.JLabel peso3Hist2Label;
	private javax.swing.JLabel peso3Hist3Label;
	private javax.swing.JLabel peso3Hist4Label;
	private javax.swing.JLabel peso3Hist5Label;
	private javax.swing.JLabel registrosLabel;
	private JCheckBox checkColunaExtra;

	public ViewBaiaAmostradosP() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		jLabel21 = new javax.swing.JLabel();
		abateJFT = new javax.swing.JFormattedTextField();
		jLabel22 = new javax.swing.JLabel();
		dataAbateJFT = new javax.swing.JFormattedTextField();
		jLabel23 = new javax.swing.JLabel();
		idadeJFT = new javax.swing.JFormattedTextField();
		idadeJFT.setEditable(false);
		baiaAmostradosJP = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		ordem1JFT = new javax.swing.JFormattedTextField();
		ordem1JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem1JFT.setEnabled(false);
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		baia1JFT = new javax.swing.JFormattedTextField();
		baia1JFT.setEnabled(false);
		nasa11JFT = new javax.swing.JFormattedTextField();
		peso11JFT = new javax.swing.JFormattedTextField();
		nasa21JFT = new javax.swing.JFormattedTextField();
		peso21JFT = new javax.swing.JFormattedTextField();
		controleJFT = new javax.swing.JFormattedTextField();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		baiaHist1Label = new javax.swing.JLabel();
		baiaHist2Label = new javax.swing.JLabel();
		nasa1Hist1Label = new javax.swing.JLabel();
		nasa1Hist2Label = new javax.swing.JLabel();
		peso1Hist1Label = new javax.swing.JLabel();
		peso1Hist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		baiaHist3Label = new javax.swing.JLabel();
		nasa1Hist3Label = new javax.swing.JLabel();
		peso1Hist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		baiaHist4Label = new javax.swing.JLabel();
		nasa1Hist4Label = new javax.swing.JLabel();
		peso1Hist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		baiaHist5Label = new javax.swing.JLabel();
		nasa1Hist5Label = new javax.swing.JLabel();
		peso1Hist5Label = new javax.swing.JLabel();
		nasa2Hist1Label = new javax.swing.JLabel();
		peso2Hist1Label = new javax.swing.JLabel();
		nasa2Hist2Label = new javax.swing.JLabel();
		peso2Hist2Label = new javax.swing.JLabel();
		nasa2Hist3Label = new javax.swing.JLabel();
		peso2Hist3Label = new javax.swing.JLabel();
		nasa2Hist4Label = new javax.swing.JLabel();
		peso2Hist4Label = new javax.swing.JLabel();
		nasa2Hist5Label = new javax.swing.JLabel();
		peso2Hist5Label = new javax.swing.JLabel();
		ordem2JFT = new javax.swing.JFormattedTextField();
		ordem2JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem2JFT.setEnabled(false);
		ordem3JFT = new javax.swing.JFormattedTextField();
		ordem3JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem3JFT.setEnabled(false);
		ordem4JFT = new javax.swing.JFormattedTextField();
		ordem4JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem4JFT.setEnabled(false);
		ordem5JFT = new javax.swing.JFormattedTextField();
		ordem5JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem5JFT.setEnabled(false);
		baia2JFT = new javax.swing.JFormattedTextField();
		baia3JFT = new javax.swing.JFormattedTextField();
		baia4JFT = new javax.swing.JFormattedTextField();
		baia5JFT = new javax.swing.JFormattedTextField();
		nasa12JFT = new javax.swing.JFormattedTextField();
		nasa13JFT = new javax.swing.JFormattedTextField();
		nasa14JFT = new javax.swing.JFormattedTextField();
		nasa15JFT = new javax.swing.JFormattedTextField();
		peso12JFT = new javax.swing.JFormattedTextField();
		peso13JFT = new javax.swing.JFormattedTextField();
		peso14JFT = new javax.swing.JFormattedTextField();
		peso15JFT = new javax.swing.JFormattedTextField();
		nasa22JFT = new javax.swing.JFormattedTextField();
		nasa23JFT = new javax.swing.JFormattedTextField();
		nasa24JFT = new javax.swing.JFormattedTextField();
		nasa25JFT = new javax.swing.JFormattedTextField();
		peso22JFT = new javax.swing.JFormattedTextField();
		peso23JFT = new javax.swing.JFormattedTextField();
		peso24JFT = new javax.swing.JFormattedTextField();
		peso25JFT = new javax.swing.JFormattedTextField();
		peso35JFT = new javax.swing.JFormattedTextField();
		nasa35JFT = new javax.swing.JFormattedTextField();
		peso34JFT = new javax.swing.JFormattedTextField();
		nasa34JFT = new javax.swing.JFormattedTextField();
		peso33JFT = new javax.swing.JFormattedTextField();
		nasa33JFT = new javax.swing.JFormattedTextField();
		peso32JFT = new javax.swing.JFormattedTextField();
		nasa32JFT = new javax.swing.JFormattedTextField();
		peso31JFT = new javax.swing.JFormattedTextField();
		nasa31JFT = new javax.swing.JFormattedTextField();
		jLabel14 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		peso3Hist5Label = new javax.swing.JLabel();
		nasa3Hist5Label = new javax.swing.JLabel();
		peso3Hist4Label = new javax.swing.JLabel();
		nasa3Hist4Label = new javax.swing.JLabel();
		peso3Hist3Label = new javax.swing.JLabel();
		nasa3Hist3Label = new javax.swing.JLabel();
		peso3Hist2Label = new javax.swing.JLabel();
		nasa3Hist2Label = new javax.swing.JLabel();
		peso3Hist1Label = new javax.swing.JLabel();
		nasa3Hist1Label = new javax.swing.JLabel();
		registrosLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel10.setText("Aviário");

		aviarioJFT.setEditable(false);
		aviarioJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			aviarioJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		aviarioJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel21.setText("Abate");

		abateJFT.setEditable(false);
		abateJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			abateJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		abateJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel22.setText("Data");

		dataAbateJFT.setEditable(false);
		dataAbateJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			dataAbateJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dataAbateJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel23.setText("Idade");

		idadeJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			idadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		checkColunaExtra = new JCheckBox("3ª Coluna");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(jLabel21).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(jLabel23).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(jLabel22).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addGap(8).addComponent(checkColunaExtra).addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel21)
												.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel22)
												.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel23)
												.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(checkColunaExtra))
										.addContainerGap()));
		jPanel2.setLayout(jPanel2Layout);

		baiaAmostradosJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Ordem");

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Baia");

		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Ident. 1");

		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("Peso 1");

		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("Peso 2");

		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("Controle");

		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel16.setText("Ident. 2");

		try {
			baia1JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baia1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		try {
			nasa11JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nasa11JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa11JFT.setEnabled(false);

		try {
			peso11JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		peso11JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso11JFT.setEnabled(false);

		try {
			nasa21JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		nasa21JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa21JFT.setEnabled(false);

		try {
			peso21JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		peso21JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso21JFT.setEnabled(false);

		try {
			controleJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleJFT.setEnabled(false);

		ordemHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		baiaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		baiaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		baiaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		baiaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa1Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa1Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa1Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa1Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso1Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso1Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso1Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso1Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		baiaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		baiaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa1Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa1Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso1Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso1Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		baiaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		baiaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa1Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa1Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso1Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso1Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		baiaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		baiaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa1Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa1Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso1Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso1Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa2Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa2Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso2Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso2Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa2Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa2Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso2Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso2Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa2Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa2Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso2Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso2Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa2Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa2Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso2Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso2Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa2Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa2Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso2Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso2Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordem1JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		ordem1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		ordem2JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		ordem2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		ordem3JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		ordem3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		ordem4JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		ordem4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		ordem5JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		ordem5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		try {
			baia2JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baia2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		baia2JFT.setEnabled(false);

		try {
			baia3JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baia3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		baia3JFT.setEnabled(false);

		try {
			baia4JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baia4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		baia4JFT.setEnabled(false);

		try {
			baia5JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		baia5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		baia5JFT.setEnabled(false);

		try {
			nasa12JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa12JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa12JFT.setEnabled(false);

		try {
			nasa13JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa13JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa13JFT.setEnabled(false);

		try {
			nasa14JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa14JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa14JFT.setEnabled(false);

		try {
			nasa15JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa15JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa15JFT.setEnabled(false);

		try {
			peso12JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso12JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso12JFT.setEnabled(false);

		try {
			peso13JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso13JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso13JFT.setEnabled(false);

		try {
			peso14JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso14JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso14JFT.setEnabled(false);

		try {
			peso15JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso15JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso15JFT.setEnabled(false);

		try {
			nasa22JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa22JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa22JFT.setEnabled(false);

		try {
			nasa23JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa23JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa23JFT.setEnabled(false);

		try {
			nasa24JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa24JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa24JFT.setEnabled(false);

		try {
			nasa25JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa25JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa25JFT.setEnabled(false);

		try {
			peso22JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso22JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso22JFT.setEnabled(false);

		try {
			peso23JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso23JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso23JFT.setEnabled(false);

		try {
			peso24JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso24JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso24JFT.setEnabled(false);

		try {
			peso25JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso25JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso25JFT.setEnabled(false);

		try {
			peso35JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso35JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso35JFT.setEnabled(false);

		try {
			nasa35JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa35JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa35JFT.setEnabled(false);

		try {
			peso34JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso34JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso34JFT.setEnabled(false);

		try {
			nasa34JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa34JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa34JFT.setEnabled(false);

		try {
			peso33JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso33JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso33JFT.setEnabled(false);

		try {
			nasa33JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa33JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa33JFT.setEnabled(false);

		try {
			peso32JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		peso32JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso32JFT.setEnabled(false);

		try {
			nasa32JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		nasa32JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa32JFT.setEnabled(false);

		try {
			peso31JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		peso31JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		peso31JFT.setEnabled(false);

		try {
			nasa31JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		nasa31JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nasa31JFT.setEnabled(false);

		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("Peso 3");

		jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel17.setText("Ident. 3");

		peso3Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso3Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa3Hist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa3Hist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso3Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso3Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa3Hist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa3Hist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso3Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso3Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa3Hist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa3Hist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso3Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso3Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa3Hist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa3Hist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		peso3Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		peso3Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		nasa3Hist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		nasa3Hist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		javax.swing.GroupLayout baiaAmostradosJPLayout = new javax.swing.GroupLayout(baiaAmostradosJP);
		baiaAmostradosJPLayout.setHorizontalGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(baiaAmostradosJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ordem1JFT).addComponent(ordem5JFT, Alignment.TRAILING)
								.addComponent(ordem4JFT).addComponent(ordem3JFT)
								.addComponent(ordem2JFT, Alignment.TRAILING)
								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(ordemHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(ordemHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(ordemHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(ordemHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(ordemHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(baia1JFT)
								.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(baiaHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(baiaHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(baiaHist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(baiaHist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(baiaHist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(baia2JFT).addComponent(baia3JFT).addComponent(baia4JFT)
								.addComponent(baia5JFT))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(nasa11JFT)
								.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa1Hist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa1Hist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa1Hist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa1Hist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa1Hist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nasa12JFT).addComponent(nasa13JFT).addComponent(nasa14JFT)
								.addComponent(nasa15JFT))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(peso14JFT).addComponent(peso13JFT).addComponent(peso11JFT)
								.addComponent(peso1Hist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(peso1Hist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso1Hist3Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(peso1Hist4Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(peso1Hist5Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(peso12JFT).addComponent(peso15JFT, Alignment.TRAILING))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(nasa2Hist1Label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa2Hist2Label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa2Hist3Label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa2Hist4Label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa2Hist5Label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa22JFT, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 39,
										Short.MAX_VALUE)
								.addComponent(nasa21JFT, 39, 39, Short.MAX_VALUE)
								.addComponent(jLabel16, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nasa23JFT, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa24JFT, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
								.addComponent(nasa25JFT, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(peso2Hist1Label, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso2Hist2Label, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso2Hist3Label, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso2Hist4Label, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso2Hist5Label, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(peso23JFT, 50, 50, 50).addComponent(peso24JFT, 50, 50, 50)
								.addComponent(peso25JFT, 50, 50, 50)
								.addComponent(peso22JFT, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 50,
										Short.MAX_VALUE)
								.addComponent(peso21JFT, Alignment.TRAILING, 50, 50, 50)
								.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(nasa3Hist1Label, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(nasa3Hist2Label, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(nasa3Hist3Label, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(nasa3Hist4Label, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(nasa3Hist5Label, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
								.addComponent(nasa34JFT, 40, 40, 40).addComponent(nasa33JFT, 40, 40, 40)
								.addComponent(nasa32JFT, 40, 40, 40).addComponent(nasa31JFT, 40, 40, 40)
								.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
										.addComponent(jLabel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(1))
								.addComponent(nasa35JFT, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(peso3Hist4Label, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
												.addComponent(peso3Hist2Label, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
												.addComponent(peso3Hist1Label, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
												.addComponent(peso3Hist5Label, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
												.addComponent(peso3Hist3Label, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
												.addComponent(peso35JFT, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso34JFT, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(controleJFT, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 50,
														GroupLayout.PREFERRED_SIZE)))
								.addComponent(peso33JFT, 50, 50, 50).addComponent(peso32JFT, 50, 50, 50)
								.addComponent(peso31JFT, 50, 50, 50)
								.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
										.addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
										.addGap(56)))
						.addContainerGap()));
		baiaAmostradosJPLayout.setVerticalGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING).addGroup(
				baiaAmostradosJPLayout.createSequentialGroup().addContainerGap().addGroup(baiaAmostradosJPLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(baiaAmostradosJPLayout.createSequentialGroup().addGroup(baiaAmostradosJPLayout
								.createParallelGroup(Alignment.LEADING, false)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(ordemHist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(baiaHist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nasa1Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(peso1Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(nasa2Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(peso2Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(ordemHist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(baiaHist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(nasa1Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso1Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(nasa2Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso2Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(ordemHist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(baiaHist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(nasa1Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso1Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(nasa2Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso2Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(ordemHist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(baiaHist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nasa1Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(peso1Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(nasa2Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso2Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(ordemHist5Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(baiaHist5Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nasa1Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(peso1Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(nasa2Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(peso2Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))))
						.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(peso3Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(nasa3Hist1Label, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
												.addComponent(nasa3Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(nasa3Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
												.addComponent(peso3Hist2Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(peso3Hist3Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
												.addComponent(nasa3Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(nasa3Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(baiaAmostradosJPLayout.createSequentialGroup()
												.addComponent(peso3Hist4Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(peso3Hist5Label, GroupLayout.PREFERRED_SIZE, 14,
														GroupLayout.PREFERRED_SIZE)))))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(baiaAmostradosJPLayout
								.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(jLabel2)
								.addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel16)
								.addComponent(jLabel12).addComponent(jLabel17).addComponent(jLabel14))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordem1JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(baia1JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa11JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(peso11JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa21JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(peso21JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa31JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(peso31JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordem2JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(baia2JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa12JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso12JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa22JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso22JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa32JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso32JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordem3JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(baia3JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa13JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso13JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa23JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso23JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa33JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso33JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordem4JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(baia4JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa14JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso14JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa24JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso24JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa34JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso34JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel13))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(baiaAmostradosJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(ordem5JFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(baia5JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa15JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso15JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso25JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(peso35JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(controleJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa35JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(nasa25JFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		baiaAmostradosJP.setLayout(baiaAmostradosJPLayout);

		registrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registrosLabel.setForeground(new java.awt.Color(0, 153, 255));
		registrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registrosLabel.setText("Registros salvos com sucesso!!");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(registrosLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(baiaAmostradosJP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(baiaAmostradosJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(registrosLabel).addContainerGap()));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(ViewBaiaAmostradosP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewBaiaAmostradosP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewBaiaAmostradosP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewBaiaAmostradosP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewBaiaAmostradosP().setVisible(true);
			}
		});
	}

	// End of variables declaration//GEN-END:variables
	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(javax.swing.JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(javax.swing.JLabel jLabel10) {
		this.jLabel10 = jLabel10;
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

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
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

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(javax.swing.JLabel jLabel4) {
		this.jLabel4 = jLabel4;
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

	public javax.swing.JFormattedTextField getNasa31JFT() {
		return nasa31JFT;
	}

	public void setNasa31JFT(javax.swing.JFormattedTextField nasa31jft) {
		nasa31JFT = nasa31jft;
	}

	public javax.swing.JFormattedTextField getNasa32JFT() {
		return nasa32JFT;
	}

	public void setNasa32JFT(javax.swing.JFormattedTextField nasa32jft) {
		nasa32JFT = nasa32jft;
	}

	public javax.swing.JFormattedTextField getNasa33JFT() {
		return nasa33JFT;
	}

	public void setNasa33JFT(javax.swing.JFormattedTextField nasa33jft) {
		nasa33JFT = nasa33jft;
	}

	public javax.swing.JFormattedTextField getNasa34JFT() {
		return nasa34JFT;
	}

	public void setNasa34JFT(javax.swing.JFormattedTextField nasa34jft) {
		nasa34JFT = nasa34jft;
	}

	public javax.swing.JFormattedTextField getNasa35JFT() {
		return nasa35JFT;
	}

	public void setNasa35JFT(javax.swing.JFormattedTextField nasa35jft) {
		nasa35JFT = nasa35jft;
	}

	public javax.swing.JLabel getNasa3Hist1Label() {
		return nasa3Hist1Label;
	}

	public void setNasa3Hist1Label(javax.swing.JLabel nasa3Hist1Label) {
		this.nasa3Hist1Label = nasa3Hist1Label;
	}

	public javax.swing.JLabel getNasa3Hist2Label() {
		return nasa3Hist2Label;
	}

	public void setNasa3Hist2Label(javax.swing.JLabel nasa3Hist2Label) {
		this.nasa3Hist2Label = nasa3Hist2Label;
	}

	public javax.swing.JLabel getNasa3Hist3Label() {
		return nasa3Hist3Label;
	}

	public void setNasa3Hist3Label(javax.swing.JLabel nasa3Hist3Label) {
		this.nasa3Hist3Label = nasa3Hist3Label;
	}

	public javax.swing.JLabel getNasa3Hist4Label() {
		return nasa3Hist4Label;
	}

	public void setNasa3Hist4Label(javax.swing.JLabel nasa3Hist4Label) {
		this.nasa3Hist4Label = nasa3Hist4Label;
	}

	public javax.swing.JLabel getNasa3Hist5Label() {
		return nasa3Hist5Label;
	}

	public void setNasa3Hist5Label(javax.swing.JLabel nasa3Hist5Label) {
		this.nasa3Hist5Label = nasa3Hist5Label;
	}

	public javax.swing.JFormattedTextField getPeso31JFT() {
		return peso31JFT;
	}

	public void setPeso31JFT(javax.swing.JFormattedTextField peso31jft) {
		peso31JFT = peso31jft;
	}

	public javax.swing.JFormattedTextField getPeso32JFT() {
		return peso32JFT;
	}

	public void setPeso32JFT(javax.swing.JFormattedTextField peso32jft) {
		peso32JFT = peso32jft;
	}

	public javax.swing.JFormattedTextField getPeso33JFT() {
		return peso33JFT;
	}

	public void setPeso33JFT(javax.swing.JFormattedTextField peso33jft) {
		peso33JFT = peso33jft;
	}

	public javax.swing.JFormattedTextField getPeso34JFT() {
		return peso34JFT;
	}

	public void setPeso34JFT(javax.swing.JFormattedTextField peso34jft) {
		peso34JFT = peso34jft;
	}

	public javax.swing.JFormattedTextField getPeso35JFT() {
		return peso35JFT;
	}

	public void setPeso35JFT(javax.swing.JFormattedTextField peso35jft) {
		peso35JFT = peso35jft;
	}

	public javax.swing.JLabel getPeso3Hist1Label() {
		return peso3Hist1Label;
	}

	public void setPeso3Hist1Label(javax.swing.JLabel peso3Hist1Label) {
		this.peso3Hist1Label = peso3Hist1Label;
	}

	public javax.swing.JLabel getPeso3Hist2Label() {
		return peso3Hist2Label;
	}

	public void setPeso3Hist2Label(javax.swing.JLabel peso3Hist2Label) {
		this.peso3Hist2Label = peso3Hist2Label;
	}

	public javax.swing.JLabel getPeso3Hist3Label() {
		return peso3Hist3Label;
	}

	public void setPeso3Hist3Label(javax.swing.JLabel peso3Hist3Label) {
		this.peso3Hist3Label = peso3Hist3Label;
	}

	public javax.swing.JLabel getPeso3Hist4Label() {
		return peso3Hist4Label;
	}

	public void setPeso3Hist4Label(javax.swing.JLabel peso3Hist4Label) {
		this.peso3Hist4Label = peso3Hist4Label;
	}

	public javax.swing.JLabel getPeso3Hist5Label() {
		return peso3Hist5Label;
	}

	public void setPeso3Hist5Label(javax.swing.JLabel peso3Hist5Label) {
		this.peso3Hist5Label = peso3Hist5Label;
	}

	public void setAbateJFT(javax.swing.JFormattedTextField abateJFT) {
		this.abateJFT = abateJFT;
	}

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.aviarioJFT = aviarioJFT;
	}

	public void setBaia1JFT(javax.swing.JFormattedTextField baia1jft) {
		baia1JFT = baia1jft;
	}

	public void setBaia2JFT(javax.swing.JFormattedTextField baia2jft) {
		baia2JFT = baia2jft;
	}

	public void setBaia3JFT(javax.swing.JFormattedTextField baia3jft) {
		baia3JFT = baia3jft;
	}

	public void setBaia4JFT(javax.swing.JFormattedTextField baia4jft) {
		baia4JFT = baia4jft;
	}

	public void setBaia5JFT(javax.swing.JFormattedTextField baia5jft) {
		baia5JFT = baia5jft;
	}

	public void setBaiaAmostradosJP(javax.swing.JPanel baiaAmostradosJP) {
		this.baiaAmostradosJP = baiaAmostradosJP;
	}

	public void setBaiaHist1Label(javax.swing.JLabel baiaHist1Label) {
		this.baiaHist1Label = baiaHist1Label;
	}

	public void setBaiaHist2Label(javax.swing.JLabel baiaHist2Label) {
		this.baiaHist2Label = baiaHist2Label;
	}

	public void setBaiaHist3Label(javax.swing.JLabel baiaHist3Label) {
		this.baiaHist3Label = baiaHist3Label;
	}

	public void setBaiaHist4Label(javax.swing.JLabel baiaHist4Label) {
		this.baiaHist4Label = baiaHist4Label;
	}

	public void setBaiaHist5Label(javax.swing.JLabel baiaHist5Label) {
		this.baiaHist5Label = baiaHist5Label;
	}

	public void setControleJFT(javax.swing.JFormattedTextField controleJFT) {
		this.controleJFT = controleJFT;
	}

	public void setDataAbateJFT(javax.swing.JFormattedTextField dataAbateJFT) {
		this.dataAbateJFT = dataAbateJFT;
	}

	public void setIdadeJFT(javax.swing.JFormattedTextField idadeJFT) {
		this.idadeJFT = idadeJFT;
	}

	public void setNasa11JFT(javax.swing.JFormattedTextField nasa11jft) {
		nasa11JFT = nasa11jft;
	}

	public void setNasa12JFT(javax.swing.JFormattedTextField nasa12jft) {
		nasa12JFT = nasa12jft;
	}

	public void setNasa13JFT(javax.swing.JFormattedTextField nasa13jft) {
		nasa13JFT = nasa13jft;
	}

	public void setNasa14JFT(javax.swing.JFormattedTextField nasa14jft) {
		nasa14JFT = nasa14jft;
	}

	public void setNasa15JFT(javax.swing.JFormattedTextField nasa15jft) {
		nasa15JFT = nasa15jft;
	}

	public void setNasa1Hist1Label(javax.swing.JLabel nasa1Hist1Label) {
		this.nasa1Hist1Label = nasa1Hist1Label;
	}

	public void setNasa1Hist2Label(javax.swing.JLabel nasa1Hist2Label) {
		this.nasa1Hist2Label = nasa1Hist2Label;
	}

	public void setNasa1Hist3Label(javax.swing.JLabel nasa1Hist3Label) {
		this.nasa1Hist3Label = nasa1Hist3Label;
	}

	public void setNasa1Hist4Label(javax.swing.JLabel nasa1Hist4Label) {
		this.nasa1Hist4Label = nasa1Hist4Label;
	}

	public void setNasa1Hist5Label(javax.swing.JLabel nasa1Hist5Label) {
		this.nasa1Hist5Label = nasa1Hist5Label;
	}

	public void setNasa21JFT(javax.swing.JFormattedTextField nasa21jft) {
		nasa21JFT = nasa21jft;
	}

	public void setNasa22JFT(javax.swing.JFormattedTextField nasa22jft) {
		nasa22JFT = nasa22jft;
	}

	public void setNasa23JFT(javax.swing.JFormattedTextField nasa23jft) {
		nasa23JFT = nasa23jft;
	}

	public void setNasa24JFT(javax.swing.JFormattedTextField nasa24jft) {
		nasa24JFT = nasa24jft;
	}

	public void setNasa25JFT(javax.swing.JFormattedTextField nasa25jft) {
		nasa25JFT = nasa25jft;
	}

	public void setNasa2Hist1Label(javax.swing.JLabel nasa2Hist1Label) {
		this.nasa2Hist1Label = nasa2Hist1Label;
	}

	public void setNasa2Hist2Label(javax.swing.JLabel nasa2Hist2Label) {
		this.nasa2Hist2Label = nasa2Hist2Label;
	}

	public void setNasa2Hist3Label(javax.swing.JLabel nasa2Hist3Label) {
		this.nasa2Hist3Label = nasa2Hist3Label;
	}

	public void setNasa2Hist4Label(javax.swing.JLabel nasa2Hist4Label) {
		this.nasa2Hist4Label = nasa2Hist4Label;
	}

	public void setNasa2Hist5Label(javax.swing.JLabel nasa2Hist5Label) {
		this.nasa2Hist5Label = nasa2Hist5Label;
	}

	public void setOrdem1JFT(javax.swing.JFormattedTextField ordem1jft) {
		ordem1JFT = ordem1jft;
	}

	public void setOrdem2JFT(javax.swing.JFormattedTextField ordem2jft) {
		ordem2JFT = ordem2jft;
	}

	public void setOrdem3JFT(javax.swing.JFormattedTextField ordem3jft) {
		ordem3JFT = ordem3jft;
	}

	public void setOrdem4JFT(javax.swing.JFormattedTextField ordem4jft) {
		ordem4JFT = ordem4jft;
	}

	public void setOrdem5JFT(javax.swing.JFormattedTextField ordem5jft) {
		ordem5JFT = ordem5jft;
	}

	public void setOrdemHist1Label(javax.swing.JLabel ordemHist1Label) {
		this.ordemHist1Label = ordemHist1Label;
	}

	public void setOrdemHist2Label(javax.swing.JLabel ordemHist2Label) {
		this.ordemHist2Label = ordemHist2Label;
	}

	public void setOrdemHist3Label(javax.swing.JLabel ordemHist3Label) {
		this.ordemHist3Label = ordemHist3Label;
	}

	public void setOrdemHist4Label(javax.swing.JLabel ordemHist4Label) {
		this.ordemHist4Label = ordemHist4Label;
	}

	public void setOrdemHist5Label(javax.swing.JLabel ordemHist5Label) {
		this.ordemHist5Label = ordemHist5Label;
	}

	public void setPeso11JFT(javax.swing.JFormattedTextField peso11jft) {
		peso11JFT = peso11jft;
	}

	public void setPeso12JFT(javax.swing.JFormattedTextField peso12jft) {
		peso12JFT = peso12jft;
	}

	public void setPeso13JFT(javax.swing.JFormattedTextField peso13jft) {
		peso13JFT = peso13jft;
	}

	public void setPeso14JFT(javax.swing.JFormattedTextField peso14jft) {
		peso14JFT = peso14jft;
	}

	public void setPeso15JFT(javax.swing.JFormattedTextField peso15jft) {
		peso15JFT = peso15jft;
	}

	public void setPeso1Hist1Label(javax.swing.JLabel peso1Hist1Label) {
		this.peso1Hist1Label = peso1Hist1Label;
	}

	public void setPeso1Hist2Label(javax.swing.JLabel peso1Hist2Label) {
		this.peso1Hist2Label = peso1Hist2Label;
	}

	public void setPeso1Hist3Label(javax.swing.JLabel peso1Hist3Label) {
		this.peso1Hist3Label = peso1Hist3Label;
	}

	public void setPeso1Hist4Label(javax.swing.JLabel peso1Hist4Label) {
		this.peso1Hist4Label = peso1Hist4Label;
	}

	public void setPeso1Hist5Label(javax.swing.JLabel peso1Hist5Label) {
		this.peso1Hist5Label = peso1Hist5Label;
	}

	public void setPeso21JFT(javax.swing.JFormattedTextField peso21jft) {
		peso21JFT = peso21jft;
	}

	public void setPeso22JFT(javax.swing.JFormattedTextField peso22jft) {
		peso22JFT = peso22jft;
	}

	public void setPeso23JFT(javax.swing.JFormattedTextField peso23jft) {
		peso23JFT = peso23jft;
	}

	public void setPeso24JFT(javax.swing.JFormattedTextField peso24jft) {
		peso24JFT = peso24jft;
	}

	public void setPeso25JFT(javax.swing.JFormattedTextField peso25jft) {
		peso25JFT = peso25jft;
	}

	public void setPeso2Hist1Label(javax.swing.JLabel peso2Hist1Label) {
		this.peso2Hist1Label = peso2Hist1Label;
	}

	public void setPeso2Hist2Label(javax.swing.JLabel peso2Hist2Label) {
		this.peso2Hist2Label = peso2Hist2Label;
	}

	public void setPeso2Hist3Label(javax.swing.JLabel peso2Hist3Label) {
		this.peso2Hist3Label = peso2Hist3Label;
	}

	public void setPeso2Hist4Label(javax.swing.JLabel peso2Hist4Label) {
		this.peso2Hist4Label = peso2Hist4Label;
	}

	public void setPeso2Hist5Label(javax.swing.JLabel peso2Hist5Label) {
		this.peso2Hist5Label = peso2Hist5Label;
	}

	public void setRegistrosLabel(javax.swing.JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

	public JFormattedTextField getAbateJFT() {
		return abateJFT;
	}

	public JFormattedTextField getAviarioJFT() {
		return aviarioJFT;
	}

	public JFormattedTextField getBaia1JFT() {
		return baia1JFT;
	}

	public JFormattedTextField getBaia2JFT() {
		return baia2JFT;
	}

	public JFormattedTextField getBaia3JFT() {
		return baia3JFT;
	}

	public JFormattedTextField getBaia4JFT() {
		return baia4JFT;
	}

	public JFormattedTextField getBaia5JFT() {
		return baia5JFT;
	}

	public JPanel getBaiaAmostradosJP() {
		return baiaAmostradosJP;
	}

	public JLabel getBaiaHist1Label() {
		return baiaHist1Label;
	}

	public JLabel getBaiaHist2Label() {
		return baiaHist2Label;
	}

	public JLabel getBaiaHist3Label() {
		return baiaHist3Label;
	}

	public JLabel getBaiaHist4Label() {
		return baiaHist4Label;
	}

	public JLabel getBaiaHist5Label() {
		return baiaHist5Label;
	}

	public JFormattedTextField getControleJFT() {
		return controleJFT;
	}

	public JFormattedTextField getDataAbateJFT() {
		return dataAbateJFT;
	}

	public JFormattedTextField getIdadeJFT() {
		return idadeJFT;
	}

	public JFormattedTextField getNasa11JFT() {
		return nasa11JFT;
	}

	public JFormattedTextField getNasa12JFT() {
		return nasa12JFT;
	}

	public JFormattedTextField getNasa13JFT() {
		return nasa13JFT;
	}

	public JFormattedTextField getNasa14JFT() {
		return nasa14JFT;
	}

	public JFormattedTextField getNasa15JFT() {
		return nasa15JFT;
	}

	public JLabel getNasa1Hist1Label() {
		return nasa1Hist1Label;
	}

	public JLabel getNasa1Hist2Label() {
		return nasa1Hist2Label;
	}

	public JLabel getNasa1Hist3Label() {
		return nasa1Hist3Label;
	}

	public JLabel getNasa1Hist4Label() {
		return nasa1Hist4Label;
	}

	public JLabel getNasa1Hist5Label() {
		return nasa1Hist5Label;
	}

	public JFormattedTextField getNasa21JFT() {
		return nasa21JFT;
	}

	public JFormattedTextField getNasa22JFT() {
		return nasa22JFT;
	}

	public JFormattedTextField getNasa23JFT() {
		return nasa23JFT;
	}

	public JFormattedTextField getNasa24JFT() {
		return nasa24JFT;
	}

	public JFormattedTextField getNasa25JFT() {
		return nasa25JFT;
	}

	public JLabel getNasa2Hist1Label() {
		return nasa2Hist1Label;
	}

	public JLabel getNasa2Hist2Label() {
		return nasa2Hist2Label;
	}

	public JLabel getNasa2Hist3Label() {
		return nasa2Hist3Label;
	}

	public JLabel getNasa2Hist4Label() {
		return nasa2Hist4Label;
	}

	public JLabel getNasa2Hist5Label() {
		return nasa2Hist5Label;
	}

	public JFormattedTextField getOrdem1JFT() {
		return ordem1JFT;
	}

	public JFormattedTextField getOrdem2JFT() {
		return ordem2JFT;
	}

	public JFormattedTextField getOrdem3JFT() {
		return ordem3JFT;
	}

	public JFormattedTextField getOrdem4JFT() {
		return ordem4JFT;
	}

	public JFormattedTextField getOrdem5JFT() {
		return ordem5JFT;
	}

	public JLabel getOrdemHist1Label() {
		return ordemHist1Label;
	}

	public JLabel getOrdemHist2Label() {
		return ordemHist2Label;
	}

	public JLabel getOrdemHist3Label() {
		return ordemHist3Label;
	}

	public JLabel getOrdemHist4Label() {
		return ordemHist4Label;
	}

	public JLabel getOrdemHist5Label() {
		return ordemHist5Label;
	}

	public JFormattedTextField getPeso11JFT() {
		return peso11JFT;
	}

	public JFormattedTextField getPeso12JFT() {
		return peso12JFT;
	}

	public JFormattedTextField getPeso13JFT() {
		return peso13JFT;
	}

	public JFormattedTextField getPeso14JFT() {
		return peso14JFT;
	}

	public JFormattedTextField getPeso15JFT() {
		return peso15JFT;
	}

	public JLabel getPeso1Hist1Label() {
		return peso1Hist1Label;
	}

	public JLabel getPeso1Hist2Label() {
		return peso1Hist2Label;
	}

	public JLabel getPeso1Hist3Label() {
		return peso1Hist3Label;
	}

	public JLabel getPeso1Hist4Label() {
		return peso1Hist4Label;
	}

	public JLabel getPeso1Hist5Label() {
		return peso1Hist5Label;
	}

	public JFormattedTextField getPeso21JFT() {
		return peso21JFT;
	}

	public JFormattedTextField getPeso22JFT() {
		return peso22JFT;
	}

	public JFormattedTextField getPeso23JFT() {
		return peso23JFT;
	}

	public JFormattedTextField getPeso24JFT() {
		return peso24JFT;
	}

	public JFormattedTextField getPeso25JFT() {
		return peso25JFT;
	}

	public JLabel getPeso2Hist1Label() {
		return peso2Hist1Label;
	}

	public JLabel getPeso2Hist2Label() {
		return peso2Hist2Label;
	}

	public JLabel getPeso2Hist3Label() {
		return peso2Hist3Label;
	}

	public JLabel getPeso2Hist4Label() {
		return peso2Hist4Label;
	}

	public JLabel getPeso2Hist5Label() {
		return peso2Hist5Label;
	}

	public JLabel getRegistrosLabel() {
		return registrosLabel;
	}

	public JCheckBox getCheckColunaExtra() {
		return checkColunaExtra;
	}

	public void setCheckColunaExtra(JCheckBox checkColunaExtra) {
		this.checkColunaExtra = checkColunaExtra;
	}

}
