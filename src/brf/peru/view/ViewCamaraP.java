package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewCamaraP extends javax.swing.JFrame {
	private javax.swing.JFormattedTextField abateJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JPanel camaraJP;
	private javax.swing.JFormattedTextField controleJFT;
	private javax.swing.JFormattedTextField dataAbateJFT;
	private javax.swing.JFormattedTextField escCarcaca1JFT;
	private javax.swing.JFormattedTextField escCarcaca2JFT;
	private javax.swing.JFormattedTextField escCarcaca3JFT;
	private javax.swing.JFormattedTextField escCarcaca4JFT;
	private javax.swing.JFormattedTextField escCarcaca5JFT;
	private javax.swing.JLabel escCarcacaHist1Label;
	private javax.swing.JLabel escCarcacaHist2Label;
	private javax.swing.JLabel escCarcacaHist3Label;
	private javax.swing.JLabel escCarcacaHist4Label;
	private javax.swing.JLabel escCarcacaHist5Label;
	private javax.swing.JFormattedTextField escGordura1JFT;
	private javax.swing.JFormattedTextField escGordura2JFT;
	private javax.swing.JFormattedTextField escGordura3JFT;
	private javax.swing.JFormattedTextField escGordura4JFT;
	private javax.swing.JFormattedTextField escGordura5JFT;
	private javax.swing.JLabel escGorduraHist1Label;
	private javax.swing.JLabel escGorduraHist2Label;
	private javax.swing.JLabel escGorduraHist3Label;
	private javax.swing.JLabel escGorduraHist4Label;
	private javax.swing.JLabel escGorduraHist5Label;
	private javax.swing.JFormattedTextField idadeJFT;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JLabel numHist1Label;
	private javax.swing.JLabel numHist2Label;
	private javax.swing.JLabel numHist3Label;
	private javax.swing.JLabel numHist4Label;
	private javax.swing.JLabel numHist5Label;
	private javax.swing.JFormattedTextField numero1JFT;
	private javax.swing.JFormattedTextField numero2JFT;
	private javax.swing.JFormattedTextField numero3JFT;
	private javax.swing.JFormattedTextField numero4JFT;
	private javax.swing.JFormattedTextField numero5JFT;
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
	private javax.swing.JFormattedTextField pCarcaca1JFT;
	private javax.swing.JFormattedTextField pCarcaca2JFT;
	private javax.swing.JFormattedTextField pCarcaca3JFT;
	private javax.swing.JFormattedTextField pCarcaca4JFT;
	private javax.swing.JFormattedTextField pCarcaca5JFT;
	private javax.swing.JLabel pCarcacaHist1Label;
	private javax.swing.JLabel pCarcacaHist2Label;
	private javax.swing.JLabel pCarcacaHist3Label;
	private javax.swing.JLabel pCarcacaHist4Label;
	private javax.swing.JLabel pCarcacaHist5Label;
	private javax.swing.JLabel registrosLabel;
	private JFormattedTextField camaraJFT;
	private JLabel lblfAbrir;
	private JLabel qtdeAbate1Label;
	private JLabel lblfAbrir_1;
	private JLabel qtdeAbate2Label;

	public ViewCamaraP() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		camaraJP = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		ordem1JFT = new javax.swing.JFormattedTextField();
		ordem1JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		ordem1JFT.setEnabled(false);
		jLabel2 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		numero1JFT = new javax.swing.JFormattedTextField();
		numero1JFT.setEnabled(false);
		pCarcaca1JFT = new javax.swing.JFormattedTextField();
		escGordura1JFT = new javax.swing.JFormattedTextField();
		escCarcaca1JFT = new javax.swing.JFormattedTextField();
		controleJFT = new javax.swing.JFormattedTextField();
		ordemHist1Label = new javax.swing.JLabel();
		ordemHist2Label = new javax.swing.JLabel();
		numHist1Label = new javax.swing.JLabel();
		numHist2Label = new javax.swing.JLabel();
		ordemHist3Label = new javax.swing.JLabel();
		numHist3Label = new javax.swing.JLabel();
		ordemHist4Label = new javax.swing.JLabel();
		numHist4Label = new javax.swing.JLabel();
		ordemHist5Label = new javax.swing.JLabel();
		numHist5Label = new javax.swing.JLabel();
		pCarcacaHist1Label = new javax.swing.JLabel();
		escGorduraHist1Label = new javax.swing.JLabel();
		escCarcacaHist1Label = new javax.swing.JLabel();
		pCarcacaHist2Label = new javax.swing.JLabel();
		escGorduraHist2Label = new javax.swing.JLabel();
		escCarcacaHist2Label = new javax.swing.JLabel();
		pCarcacaHist3Label = new javax.swing.JLabel();
		escGorduraHist3Label = new javax.swing.JLabel();
		escCarcacaHist3Label = new javax.swing.JLabel();
		pCarcacaHist4Label = new javax.swing.JLabel();
		escGorduraHist4Label = new javax.swing.JLabel();
		escCarcacaHist4Label = new javax.swing.JLabel();
		pCarcacaHist5Label = new javax.swing.JLabel();
		escGorduraHist5Label = new javax.swing.JLabel();
		escCarcacaHist5Label = new javax.swing.JLabel();
		ordem2JFT = new javax.swing.JFormattedTextField();
		ordem2JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		numero2JFT = new javax.swing.JFormattedTextField();
		pCarcaca2JFT = new javax.swing.JFormattedTextField();
		escGordura2JFT = new javax.swing.JFormattedTextField();
		escCarcaca2JFT = new javax.swing.JFormattedTextField();
		ordem3JFT = new javax.swing.JFormattedTextField();
		ordem3JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		numero3JFT = new javax.swing.JFormattedTextField();
		pCarcaca3JFT = new javax.swing.JFormattedTextField();
		escGordura3JFT = new javax.swing.JFormattedTextField();
		escCarcaca3JFT = new javax.swing.JFormattedTextField();
		ordem4JFT = new javax.swing.JFormattedTextField();
		ordem4JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		numero4JFT = new javax.swing.JFormattedTextField();
		pCarcaca4JFT = new javax.swing.JFormattedTextField();
		escGordura4JFT = new javax.swing.JFormattedTextField();
		escCarcaca4JFT = new javax.swing.JFormattedTextField();
		ordem5JFT = new javax.swing.JFormattedTextField();
		ordem5JFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		numero5JFT = new javax.swing.JFormattedTextField();
		pCarcaca5JFT = new javax.swing.JFormattedTextField();
		escGordura5JFT = new javax.swing.JFormattedTextField();
		escCarcaca5JFT = new javax.swing.JFormattedTextField();
		registrosLabel = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		aviarioJFT.setEditable(false);
		jLabel21 = new javax.swing.JLabel();
		abateJFT = new javax.swing.JFormattedTextField();
		jLabel22 = new javax.swing.JLabel();
		dataAbateJFT = new javax.swing.JFormattedTextField();
		jLabel4 = new javax.swing.JLabel();
		idadeJFT = new javax.swing.JFormattedTextField();
		idadeJFT.setEditable(false);
		jPanel3 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		camaraJFT = new JFormattedTextField();
		camaraJFT.setEditable(false);
		camaraJFT.setFont(new Font("Tahoma", Font.BOLD, 11));
		camaraJFT.setForeground(new java.awt.Color(0, 153, 255));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		camaraJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Ordem");
		ordem1JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
		ordem1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Nr. Ident.");

		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("Esc. Carc.");

		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("Controle");

		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel14.setText("P. Carcaça");

		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel15.setText("Esc. Gord.");

		try {
			numero1JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numero1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		pCarcaca1JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
		pCarcaca1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pCarcaca1JFT.setEnabled(false);

		try {
			escGordura1JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escGordura1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escGordura1JFT.setEnabled(false);

		try {
			escCarcaca1JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escCarcaca1JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escCarcaca1JFT.setEnabled(false);

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

		numHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		numHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		numHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		numHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		numHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		numHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		numHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		numHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordemHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		ordemHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		numHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		numHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pCarcacaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pCarcacaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escGorduraHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escGorduraHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escCarcacaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escCarcacaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pCarcacaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pCarcacaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escGorduraHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escGorduraHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escCarcacaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escCarcacaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pCarcacaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pCarcacaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escGorduraHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escGorduraHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escCarcacaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escCarcacaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pCarcacaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pCarcacaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escGorduraHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escGorduraHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escCarcacaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escCarcacaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		pCarcacaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		pCarcacaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escGorduraHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escGorduraHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		escCarcacaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		escCarcacaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		ordem2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
		ordem2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordem2JFT.setEnabled(false);

		numero2JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		numero2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numero2JFT.setEnabled(false);

		pCarcaca2JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
		pCarcaca2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pCarcaca2JFT.setEnabled(false);

		try {
			escGordura2JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escGordura2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escGordura2JFT.setEnabled(false);

		try {
			escCarcaca2JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escCarcaca2JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escCarcaca2JFT.setEnabled(false);

		ordem3JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
		ordem3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordem3JFT.setEnabled(false);

		numero3JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		numero3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numero3JFT.setEnabled(false);

		pCarcaca3JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
		pCarcaca3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pCarcaca3JFT.setEnabled(false);

		try {
			escGordura3JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escGordura3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escGordura3JFT.setEnabled(false);

		try {
			escCarcaca3JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escCarcaca3JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escCarcaca3JFT.setEnabled(false);

		ordem4JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
		ordem4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordem4JFT.setEnabled(false);

		numero4JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		numero4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numero4JFT.setEnabled(false);

		pCarcaca4JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
		pCarcaca4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pCarcaca4JFT.setEnabled(false);

		try {
			escGordura4JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escGordura4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escGordura4JFT.setEnabled(false);

		try {
			escCarcaca4JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escCarcaca4JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escCarcaca4JFT.setEnabled(false);

		ordem5JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
		ordem5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		ordem5JFT.setEnabled(false);

		numero5JFT.setFormatterFactory(
				new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
		numero5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numero5JFT.setEnabled(false);

		pCarcaca5JFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));
		pCarcaca5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pCarcaca5JFT.setEnabled(false);

		try {
			escGordura5JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escGordura5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escGordura5JFT.setEnabled(false);

		try {
			escCarcaca5JFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		escCarcaca5JFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		escCarcaca5JFT.setEnabled(false);

		javax.swing.GroupLayout camaraJPLayout = new javax.swing.GroupLayout(camaraJP);
		camaraJP.setLayout(camaraJPLayout);
		camaraJPLayout.setHorizontalGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(camaraJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(ordem5JFT).addComponent(ordem4JFT).addComponent(ordem3JFT)
								.addComponent(ordem2JFT, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordemHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(ordem1JFT))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(numero5JFT).addComponent(numero4JFT).addComponent(numero3JFT)
								.addComponent(numero1JFT)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(numero2JFT))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(pCarcaca5JFT).addComponent(pCarcaca4JFT).addComponent(pCarcaca3JFT)
								.addComponent(pCarcacaHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcacaHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcacaHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcacaHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcacaHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcaca1JFT)
								.addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pCarcaca2JFT))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(escGordura5JFT).addComponent(escGordura4JFT).addComponent(escGordura3JFT)
								.addComponent(escGordura1JFT)
								.addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGorduraHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGorduraHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGorduraHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGorduraHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGorduraHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escGordura2JFT))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcaca1JFT, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(escCarcacaHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcacaHist2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcacaHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcacaHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcacaHist5Label, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(escCarcaca2JFT).addComponent(escCarcaca3JFT).addComponent(escCarcaca4JFT)
								.addComponent(escCarcaca5JFT))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(controleJFT).addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		camaraJPLayout.setVerticalGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(camaraJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ordemHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(numHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(pCarcacaHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escGorduraHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escCarcacaHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ordemHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(numHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(pCarcacaHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escGorduraHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escCarcacaHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(ordemHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(numHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(pCarcacaHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escGorduraHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escCarcacaHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(ordemHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(pCarcacaHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escGorduraHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escCarcacaHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(ordemHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(pCarcacaHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escGorduraHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(escCarcacaHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel11).addComponent(jLabel14).addComponent(jLabel15)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(escGordura1JFT, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escCarcaca1JFT, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ordem1JFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(numero1JFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(pCarcaca1JFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ordem2JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numero2JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pCarcaca2JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escGordura2JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escCarcaca2JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ordem3JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numero3JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pCarcaca3JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escGordura3JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escCarcaca3JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ordem4JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numero4JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pCarcaca4JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escGordura4JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escCarcaca4JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(camaraJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ordem5JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(numero5JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pCarcaca5JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escGordura5JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(escCarcaca5JFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(controleJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		registrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registrosLabel.setForeground(new java.awt.Color(0, 153, 255));
		registrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registrosLabel.setText("Registros salvos com sucesso!!");

		jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel10.setText("Aviário");
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

		jLabel4.setText("Idade");

		idadeJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			idadeJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(aviarioJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20).addComponent(jLabel21)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(abateJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20).addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(idadeJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20).addComponent(jLabel22)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(dataAbateJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10)
								.addComponent(aviarioJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel21)
								.addComponent(abateJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel22)
								.addComponent(dataAbateJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4).addComponent(idadeJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));

		jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel24.setText("Câmara");
		try {
			camaraJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		camaraJFT.setHorizontalAlignment(SwingConstants.CENTER);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel24).addGap(5)
						.addComponent(camaraJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel3Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel24).addComponent(
						camaraJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		jPanel3.setLayout(jPanel3Layout);
		
		lblfAbrir = new JLabel();
		lblfAbrir.setText("[F1] - Abrir Cone 1");
		lblfAbrir.setHorizontalAlignment(SwingConstants.CENTER);
		lblfAbrir.setForeground(Color.BLACK);
		lblfAbrir.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		qtdeAbate1Label = new JLabel();
		qtdeAbate1Label.setText("99 registro(s)");
		qtdeAbate1Label.setHorizontalAlignment(SwingConstants.CENTER);
		qtdeAbate1Label.setForeground(new Color(0, 153, 255));
		qtdeAbate1Label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		lblfAbrir_1 = new JLabel();
		lblfAbrir_1.setText("[F2] - Abrir Cone 2");
		lblfAbrir_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblfAbrir_1.setForeground(Color.BLACK);
		lblfAbrir_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		qtdeAbate2Label = new JLabel();
		qtdeAbate2Label.setText("99 registro(s)");
		qtdeAbate2Label.setHorizontalAlignment(SwingConstants.CENTER);
		qtdeAbate2Label.setForeground(new Color(0, 153, 255));
		qtdeAbate2Label.setFont(new Font("Tahoma", Font.PLAIN, 11));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
									.addComponent(lblfAbrir, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(qtdeAbate1Label, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
									.addComponent(lblfAbrir_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(qtdeAbate2Label, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))))
						.addComponent(camaraJP, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
						.addComponent(registrosLabel, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(qtdeAbate1Label, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblfAbrir))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(qtdeAbate2Label, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblfAbrir_1))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(camaraJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(registrosLabel)
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

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
			java.util.logging.Logger.getLogger(ViewCamaraP.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewCamaraP.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewCamaraP.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewCamaraP.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
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
				new ViewCamaraP().setVisible(true);
			}
		});
	}

	public JFormattedTextField getAbateJFT() {
		return abateJFT;
	}

	public JFormattedTextField getAviarioJFT() {
		return aviarioJFT;
	}

	public JFormattedTextField getCamaraJFT() {
		return camaraJFT;
	}

	public JPanel getCamaraJP() {
		return camaraJP;
	}

	public JFormattedTextField getControleJFT() {
		return controleJFT;
	}

	public JFormattedTextField getDataAbateJFT() {
		return dataAbateJFT;
	}

	public JFormattedTextField getEscCarcaca1JFT() {
		return escCarcaca1JFT;
	}

	public JFormattedTextField getEscCarcaca2JFT() {
		return escCarcaca2JFT;
	}

	public JFormattedTextField getEscCarcaca3JFT() {
		return escCarcaca3JFT;
	}

	public JFormattedTextField getEscCarcaca4JFT() {
		return escCarcaca4JFT;
	}

	public JFormattedTextField getEscCarcaca5JFT() {
		return escCarcaca5JFT;
	}

	public JLabel getEscCarcacaHist1Label() {
		return escCarcacaHist1Label;
	}

	public JLabel getEscCarcacaHist2Label() {
		return escCarcacaHist2Label;
	}

	public JLabel getEscCarcacaHist3Label() {
		return escCarcacaHist3Label;
	}

	public JLabel getEscCarcacaHist4Label() {
		return escCarcacaHist4Label;
	}

	public JLabel getEscCarcacaHist5Label() {
		return escCarcacaHist5Label;
	}

	public JFormattedTextField getEscGordura1JFT() {
		return escGordura1JFT;
	}

	public JFormattedTextField getEscGordura2JFT() {
		return escGordura2JFT;
	}

	public JFormattedTextField getEscGordura3JFT() {
		return escGordura3JFT;
	}

	public JFormattedTextField getEscGordura4JFT() {
		return escGordura4JFT;
	}

	public JFormattedTextField getEscGordura5JFT() {
		return escGordura5JFT;
	}

	public JLabel getEscGorduraHist1Label() {
		return escGorduraHist1Label;
	}

	public JLabel getEscGorduraHist2Label() {
		return escGorduraHist2Label;
	}

	public JLabel getEscGorduraHist3Label() {
		return escGorduraHist3Label;
	}

	public JLabel getEscGorduraHist4Label() {
		return escGorduraHist4Label;
	}

	public JLabel getEscGorduraHist5Label() {
		return escGorduraHist5Label;
	}

	public JFormattedTextField getIdadeJFT() {
		return idadeJFT;
	}

	public JLabel getNumHist1Label() {
		return numHist1Label;
	}

	public JLabel getNumHist2Label() {
		return numHist2Label;
	}

	public JLabel getNumHist3Label() {
		return numHist3Label;
	}

	public JLabel getNumHist4Label() {
		return numHist4Label;
	}

	public JLabel getNumHist5Label() {
		return numHist5Label;
	}

	public JFormattedTextField getNumero1JFT() {
		return numero1JFT;
	}

	public JFormattedTextField getNumero2JFT() {
		return numero2JFT;
	}

	public JFormattedTextField getNumero3JFT() {
		return numero3JFT;
	}

	public JFormattedTextField getNumero4JFT() {
		return numero4JFT;
	}

	public JFormattedTextField getNumero5JFT() {
		return numero5JFT;
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

	public JFormattedTextField getpCarcaca1JFT() {
		return pCarcaca1JFT;
	}

	public JFormattedTextField getpCarcaca2JFT() {
		return pCarcaca2JFT;
	}

	public JFormattedTextField getpCarcaca3JFT() {
		return pCarcaca3JFT;
	}

	public JFormattedTextField getpCarcaca4JFT() {
		return pCarcaca4JFT;
	}

	public JFormattedTextField getpCarcaca5JFT() {
		return pCarcaca5JFT;
	}

	public JLabel getpCarcacaHist1Label() {
		return pCarcacaHist1Label;
	}

	public JLabel getpCarcacaHist2Label() {
		return pCarcacaHist2Label;
	}

	public JLabel getpCarcacaHist3Label() {
		return pCarcacaHist3Label;
	}

	public JLabel getpCarcacaHist4Label() {
		return pCarcacaHist4Label;
	}

	public JLabel getpCarcacaHist5Label() {
		return pCarcacaHist5Label;
	}

	public JLabel getRegistrosLabel() {
		return registrosLabel;
	}

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

	public javax.swing.JLabel getjLabel24() {
		return jLabel24;
	}

	public void setjLabel24(javax.swing.JLabel jLabel24) {
		this.jLabel24 = jLabel24;
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

	public javax.swing.JPanel getjPanel3() {
		return jPanel3;
	}

	public void setjPanel3(javax.swing.JPanel jPanel3) {
		this.jPanel3 = jPanel3;
	}

	public void setAbateJFT(javax.swing.JFormattedTextField abateJFT) {
		this.abateJFT = abateJFT;
	}

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.aviarioJFT = aviarioJFT;
	}

	public void setCamaraJP(javax.swing.JPanel camaraJP) {
		this.camaraJP = camaraJP;
	}

	public void setControleJFT(javax.swing.JFormattedTextField controleJFT) {
		this.controleJFT = controleJFT;
	}

	public void setDataAbateJFT(javax.swing.JFormattedTextField dataAbateJFT) {
		this.dataAbateJFT = dataAbateJFT;
	}

	public void setEscCarcaca1JFT(javax.swing.JFormattedTextField escCarcaca1JFT) {
		this.escCarcaca1JFT = escCarcaca1JFT;
	}

	public void setEscCarcaca2JFT(javax.swing.JFormattedTextField escCarcaca2JFT) {
		this.escCarcaca2JFT = escCarcaca2JFT;
	}

	public void setEscCarcaca3JFT(javax.swing.JFormattedTextField escCarcaca3JFT) {
		this.escCarcaca3JFT = escCarcaca3JFT;
	}

	public void setEscCarcaca4JFT(javax.swing.JFormattedTextField escCarcaca4JFT) {
		this.escCarcaca4JFT = escCarcaca4JFT;
	}

	public void setEscCarcaca5JFT(javax.swing.JFormattedTextField escCarcaca5JFT) {
		this.escCarcaca5JFT = escCarcaca5JFT;
	}

	public void setEscCarcacaHist1Label(javax.swing.JLabel escCarcacaHist1Label) {
		this.escCarcacaHist1Label = escCarcacaHist1Label;
	}

	public void setEscCarcacaHist2Label(javax.swing.JLabel escCarcacaHist2Label) {
		this.escCarcacaHist2Label = escCarcacaHist2Label;
	}

	public void setEscCarcacaHist3Label(javax.swing.JLabel escCarcacaHist3Label) {
		this.escCarcacaHist3Label = escCarcacaHist3Label;
	}

	public void setEscCarcacaHist4Label(javax.swing.JLabel escCarcacaHist4Label) {
		this.escCarcacaHist4Label = escCarcacaHist4Label;
	}

	public void setEscCarcacaHist5Label(javax.swing.JLabel escCarcacaHist5Label) {
		this.escCarcacaHist5Label = escCarcacaHist5Label;
	}

	public void setEscGordura1JFT(javax.swing.JFormattedTextField escGordura1JFT) {
		this.escGordura1JFT = escGordura1JFT;
	}

	public void setEscGordura2JFT(javax.swing.JFormattedTextField escGordura2JFT) {
		this.escGordura2JFT = escGordura2JFT;
	}

	public void setEscGordura3JFT(javax.swing.JFormattedTextField escGordura3JFT) {
		this.escGordura3JFT = escGordura3JFT;
	}

	public void setEscGordura4JFT(javax.swing.JFormattedTextField escGordura4JFT) {
		this.escGordura4JFT = escGordura4JFT;
	}

	public void setEscGordura5JFT(javax.swing.JFormattedTextField escGordura5JFT) {
		this.escGordura5JFT = escGordura5JFT;
	}

	public void setEscGorduraHist1Label(javax.swing.JLabel escGorduraHist1Label) {
		this.escGorduraHist1Label = escGorduraHist1Label;
	}

	public void setEscGorduraHist2Label(javax.swing.JLabel escGorduraHist2Label) {
		this.escGorduraHist2Label = escGorduraHist2Label;
	}

	public void setEscGorduraHist3Label(javax.swing.JLabel escGorduraHist3Label) {
		this.escGorduraHist3Label = escGorduraHist3Label;
	}

	public void setEscGorduraHist4Label(javax.swing.JLabel escGorduraHist4Label) {
		this.escGorduraHist4Label = escGorduraHist4Label;
	}

	public void setEscGorduraHist5Label(javax.swing.JLabel escGorduraHist5Label) {
		this.escGorduraHist5Label = escGorduraHist5Label;
	}

	public void setIdadeJFT(javax.swing.JFormattedTextField idadeJFT) {
		this.idadeJFT = idadeJFT;
	}

	public void setNumHist1Label(javax.swing.JLabel numHist1Label) {
		this.numHist1Label = numHist1Label;
	}

	public void setNumHist2Label(javax.swing.JLabel numHist2Label) {
		this.numHist2Label = numHist2Label;
	}

	public void setNumHist3Label(javax.swing.JLabel numHist3Label) {
		this.numHist3Label = numHist3Label;
	}

	public void setNumHist4Label(javax.swing.JLabel numHist4Label) {
		this.numHist4Label = numHist4Label;
	}

	public void setNumHist5Label(javax.swing.JLabel numHist5Label) {
		this.numHist5Label = numHist5Label;
	}

	public void setNumero1JFT(javax.swing.JFormattedTextField numero1jft) {
		numero1JFT = numero1jft;
	}

	public void setNumero2JFT(javax.swing.JFormattedTextField numero2jft) {
		numero2JFT = numero2jft;
	}

	public void setNumero3JFT(javax.swing.JFormattedTextField numero3jft) {
		numero3JFT = numero3jft;
	}

	public void setNumero4JFT(javax.swing.JFormattedTextField numero4jft) {
		numero4JFT = numero4jft;
	}

	public void setNumero5JFT(javax.swing.JFormattedTextField numero5jft) {
		numero5JFT = numero5jft;
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

	public void setpCarcaca1JFT(javax.swing.JFormattedTextField pCarcaca1JFT) {
		this.pCarcaca1JFT = pCarcaca1JFT;
	}

	public void setpCarcaca2JFT(javax.swing.JFormattedTextField pCarcaca2JFT) {
		this.pCarcaca2JFT = pCarcaca2JFT;
	}

	public void setpCarcaca3JFT(javax.swing.JFormattedTextField pCarcaca3JFT) {
		this.pCarcaca3JFT = pCarcaca3JFT;
	}

	public void setpCarcaca4JFT(javax.swing.JFormattedTextField pCarcaca4JFT) {
		this.pCarcaca4JFT = pCarcaca4JFT;
	}

	public void setpCarcaca5JFT(javax.swing.JFormattedTextField pCarcaca5JFT) {
		this.pCarcaca5JFT = pCarcaca5JFT;
	}

	public void setpCarcacaHist1Label(javax.swing.JLabel pCarcacaHist1Label) {
		this.pCarcacaHist1Label = pCarcacaHist1Label;
	}

	public void setpCarcacaHist2Label(javax.swing.JLabel pCarcacaHist2Label) {
		this.pCarcacaHist2Label = pCarcacaHist2Label;
	}

	public void setpCarcacaHist3Label(javax.swing.JLabel pCarcacaHist3Label) {
		this.pCarcacaHist3Label = pCarcacaHist3Label;
	}

	public void setpCarcacaHist4Label(javax.swing.JLabel pCarcacaHist4Label) {
		this.pCarcacaHist4Label = pCarcacaHist4Label;
	}

	public void setpCarcacaHist5Label(javax.swing.JLabel pCarcacaHist5Label) {
		this.pCarcacaHist5Label = pCarcacaHist5Label;
	}

	public void setRegistrosLabel(javax.swing.JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

	public void setCamaraJFT(JFormattedTextField camaraJFT) {
		this.camaraJFT = camaraJFT;
	}

	public JLabel getLblfAbrir() {
		return lblfAbrir;
	}

	public void setLblfAbrir(JLabel lblfAbrir) {
		this.lblfAbrir = lblfAbrir;
	}

	public JLabel getQtdeAbate1Label() {
		return qtdeAbate1Label;
	}

	public void setQtdeAbate1Label(JLabel qtdeAbate1Label) {
		this.qtdeAbate1Label = qtdeAbate1Label;
	}

	public JLabel getLblfAbrir_1() {
		return lblfAbrir_1;
	}

	public void setLblfAbrir_1(JLabel lblfAbrir_1) {
		this.lblfAbrir_1 = lblfAbrir_1;
	}

	public JLabel getQtdeAbate2Label() {
		return qtdeAbate2Label;
	}

	public void setQtdeAbate2Label(JLabel qtdeAbate2Label) {
		this.qtdeAbate2Label = qtdeAbate2Label;
	}

}
