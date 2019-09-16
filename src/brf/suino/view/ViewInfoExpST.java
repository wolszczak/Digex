package brf.suino.view;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;

public class ViewInfoExpST extends javax.swing.JFrame {
	private javax.swing.JComboBox<String> areaJCB;
	private javax.swing.JFormattedTextField galpaoJFT;
	private javax.swing.JLabel faseHist1Label;
	private javax.swing.JLabel faseHist2Label;
	private javax.swing.JFormattedTextField faseJFT;
	private javax.swing.JPanel fasesJP;
	private javax.swing.JFormattedTextField fimExpJFT;
	private javax.swing.JFormattedTextField idDigitadorJFT;
	private javax.swing.JFormattedTextField idadeAlojJFT;
	private javax.swing.JLabel dataFaseHist1Label;
	private javax.swing.JLabel dataFaseHist2Label;
	private javax.swing.JFormattedTextField inicioExpJFT;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JToggleButton jToggleButton1;
	private javax.swing.JComboBox<String> localJCB;
	private javax.swing.JFormattedTextField nrBaiaJFT;
	private javax.swing.JFormattedTextField nrFasesJFT;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JFormattedTextField protocoloJFT;
	private javax.swing.JFormattedTextField testeJFT;
	private JFormattedTextField dataFaseJFT;

	public ViewInfoExpST() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jToggleButton1 = new javax.swing.JToggleButton();
		jLabel24 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		jLabel1 = new javax.swing.JLabel();
		idDigitadorJFT = new javax.swing.JFormattedTextField();
		jLabel2 = new javax.swing.JLabel();
		protocoloJFT = new javax.swing.JFormattedTextField();
		jLabel5 = new javax.swing.JLabel();
		testeJFT = new javax.swing.JFormattedTextField();
		jLabel6 = new javax.swing.JLabel();
		localJCB = new javax.swing.JComboBox<>();
		areaJCB = new javax.swing.JComboBox<>();
		jLabel3 = new javax.swing.JLabel();
		galpaoJFT = new javax.swing.JFormattedTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		nrBaiaJFT = new javax.swing.JFormattedTextField();
		jLabel8 = new javax.swing.JLabel();
		inicioExpJFT = new javax.swing.JFormattedTextField();
		jLabel9 = new javax.swing.JLabel();
		fimExpJFT = new javax.swing.JFormattedTextField();
		jLabel23 = new javax.swing.JLabel();
		idadeAlojJFT = new javax.swing.JFormattedTextField();
		fasesJP = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		nrFasesJFT = new javax.swing.JFormattedTextField();
		jLabel18 = new javax.swing.JLabel();
		faseJFT = new javax.swing.JFormattedTextField();
		jLabel19 = new javax.swing.JLabel();
		jLabel19.setHorizontalAlignment(SwingConstants.CENTER);
		faseHist1Label = new javax.swing.JLabel();
		dataFaseHist1Label = new javax.swing.JLabel();
		faseHist2Label = new javax.swing.JLabel();
		dataFaseHist2Label = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();

		jToggleButton1.setText("jToggleButton1");

		jLabel24.setText("jLabel24");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("ID Digitador");

		idDigitadorJFT.setEditable(false);
		idDigitadorJFT.setForeground(new java.awt.Color(0, 153, 255));
		idDigitadorJFT.setText("jFormattedTextField12");
		idDigitadorJFT.setFocusable(false);

		jLabel2.setText("Protocolo");

		try {
			protocoloJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##.####.##.##.###.##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		protocoloJFT.setToolTipText("");

		jLabel5.setText("Teste");

		try {
			testeJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.###.##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		testeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		testeJFT.setToolTipText("");
		testeJFT.setEnabled(false);
		testeJFT.setName("");

		jLabel6.setText("Local");

		localJCB.setModel(new DefaultComboBoxModel(new String[] { "1 - Videira", "2 - Catanduvas" }));
		localJCB.setEnabled(false);

		areaJCB.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Genética", "2 - Nutrição", "3 - Sanidade", "4 - Manejo" }));
		areaJCB.setEnabled(false);

		jLabel3.setText("Área");

		try {
			galpaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		galpaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		galpaoJFT.setEnabled(false);

		jLabel7.setText("Galpão");

		jLabel4.setText("Nr. Baias");

		try {
			nrBaiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrBaiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrBaiaJFT.setEnabled(false);

		jLabel8.setText("Início Exp.");

		try {
			inicioExpJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		inicioExpJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		inicioExpJFT.setEnabled(false);

		jLabel9.setText("Fim Exp.");

		try {
			fimExpJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		fimExpJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		fimExpJFT.setEnabled(false);

		jLabel23.setText("Idade Aloj.");

		try {
			idadeAlojJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		idadeAlojJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		idadeAlojJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout
								.createParallelGroup(Alignment.LEADING).addComponent(jLabel1).addComponent(jLabel2)
								.addComponent(
										jLabel5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8).addComponent(jLabel23))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(idDigitadorJFT, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout
										.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(inicioExpJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
												.addComponent(protocoloJFT, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
												.addComponent(testeJFT, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(jPanel2Layout
												.createSequentialGroup()
												.addGroup(jPanel2Layout
														.createParallelGroup(Alignment.LEADING).addComponent(jLabel6).addComponent(jLabel3))
												.addGap(18)
												.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(localJCB, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
														.addComponent(areaJCB, GroupLayout.PREFERRED_SIZE, 110,
																GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel9)
														.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE).addComponent(
																fimExpJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
										.addGap(18)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel4)
												.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
												.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(nrBaiaJFT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
										.addComponent(idadeAlojJFT, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(68, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup()
				.addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(
						idDigitadorJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel6)
								.addComponent(localJCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7)
								.addComponent(galpaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
								.addComponent(areaJCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4)
								.addComponent(nrBaiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(fimExpJFT,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(
										protocoloJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(testeJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel8).addComponent(
										inicioExpJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel23).addComponent(
										idadeAlojJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		fasesJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel11.setText("Nr. Fases");

		try {
			nrFasesJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		nrFasesJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		nrFasesJFT.setEnabled(false);

		jLabel18.setText("Fase");

		faseJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		faseJFT.setEnabled(false);

		jLabel19.setText("Data");

		faseHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		dataFaseHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataFaseHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		faseHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		faseHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		dataFaseHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		dataFaseHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		try {
			faseJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}

		dataFaseJFT = new JFormattedTextField();
		try {
			dataFaseJFT
					.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dataFaseJFT.setHorizontalAlignment(SwingConstants.CENTER);
		dataFaseJFT.setEnabled(false);

		javax.swing.GroupLayout fasesJPLayout = new javax.swing.GroupLayout(fasesJP);
		fasesJPLayout.setHorizontalGroup(fasesJPLayout.createParallelGroup(Alignment.LEADING).addGroup(fasesJPLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(fasesJPLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(fasesJPLayout.createSequentialGroup().addComponent(jLabel11).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(nrFasesJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(fasesJPLayout.createSequentialGroup()
								.addGroup(fasesJPLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(faseHist2Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(faseJFT, Alignment.TRAILING)
										.addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(faseHist1Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(fasesJPLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(dataFaseJFT, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
										.addComponent(jLabel19, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
										.addComponent(dataFaseHist2Label, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
										.addComponent(dataFaseHist1Label, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
				.addContainerGap()));
		fasesJPLayout.setVerticalGroup(fasesJPLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(fasesJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(fasesJPLayout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel11).addComponent(nrFasesJFT,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(14)
						.addGroup(fasesJPLayout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel18).addComponent(jLabel19))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(fasesJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(faseHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataFaseHist1Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(fasesJPLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(faseHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(dataFaseHist2Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(
								fasesJPLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(faseJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(dataFaseJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		fasesJP.setLayout(fasesJPLayout);

		jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel13.setText("Escolha uma opção:");

		jLabel14.setText("1 - Continuar digitação");

		jLabel15.setText("9 - Voltar");

		jLabel16.setText("0 - Sair");

		jLabel17.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		opcaoJFT.setEnabled(false);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel16).addComponent(jLabel15)
								.addComponent(jLabel14).addComponent(jLabel13))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap(60, Short.MAX_VALUE).addComponent(jLabel17).addGap(8)
						.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addContainerGap()));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(jLabel13).addGap(18)
								.addComponent(jLabel14).addGap(18).addComponent(jLabel15).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jLabel16).addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
								.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel17).addComponent(
										opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		jPanel5.setLayout(jPanel5Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap().addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(fasesJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(45)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
						.addComponent(jPanel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(fasesJP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(22)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 820, GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)));
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
			java.util.logging.Logger.getLogger(ViewInfoExpST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewInfoExpST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewInfoExpST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewInfoExpST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewInfoExpST().setVisible(true);
			}
		});
	}

	public JLabel getFaseHist1Label() {
		return faseHist1Label;
	}

	public void setFaseHist1Label(JLabel faseHist1Label) {
		this.faseHist1Label = faseHist1Label;
	}

	public JLabel getFaseHist2Label() {
		return faseHist2Label;
	}

	public void setFaseHist2Label(JLabel faseHist2Label) {
		this.faseHist2Label = faseHist2Label;
	}

	public JLabel getIdadeHist1Label() {
		return dataFaseHist1Label;
	}

	public void setIdadeHist1Label(JLabel idadeHist1Label) {
		this.dataFaseHist1Label = idadeHist1Label;
	}

	public JLabel getIdadeHist2Label() {
		return dataFaseHist2Label;
	}

	public void setIdadeHist2Label(JLabel idadeHist2Label) {
		this.dataFaseHist2Label = idadeHist2Label;
	}

	public JFormattedTextField getIdadeAlojJFT() {
		return idadeAlojJFT;
	}

	public void setIdadeAlojJFT(JFormattedTextField idadeAlojJFT) {
		this.idadeAlojJFT = idadeAlojJFT;
	}

	public JPanel getFasesJP() {
		return fasesJP;
	}

	public void setFasesJP(JPanel fasesJP) {
		this.fasesJP = fasesJP;
	}

	public JFormattedTextField getFaseJFT() {
		return faseJFT;
	}

	public void setFaseJFT(JFormattedTextField faseJFT) {
		this.faseJFT = faseJFT;
	}

	public JFormattedTextField getFimExpJFT() {
		return fimExpJFT;
	}

	public void setFimExpJFT(JFormattedTextField fimExpJFT) {
		this.fimExpJFT = fimExpJFT;
	}

	public JFormattedTextField getIdadeFaseJFT() {
		return dataFaseJFT;
	}

	public void setIdadeFaseJFT(JFormattedTextField idadeFaseJFT) {
		this.dataFaseJFT = idadeFaseJFT;
	}

	public JFormattedTextField getIdDigitadorJFT() {
		return idDigitadorJFT;
	}

	public void setIdDigitadorJFT(JFormattedTextField idDigitadorJFT) {
		this.idDigitadorJFT = idDigitadorJFT;
	}

	public JFormattedTextField getInicioExpJFT() {
		return inicioExpJFT;
	}

	public void setInicioExpJFT(JFormattedTextField inicioExpJFT) {
		this.inicioExpJFT = inicioExpJFT;
	}

	public JComboBox<String> getLocalJCB() {
		return localJCB;
	}

	public void setLocalJCB(JComboBox<String> localJCB) {
		this.localJCB = localJCB;
	}

	public JFormattedTextField getNrBaiaJFT() {
		return nrBaiaJFT;
	}

	public void setNrBaiaJFT(JFormattedTextField nrBaiaJFT) {
		this.nrBaiaJFT = nrBaiaJFT;
	}

	public JFormattedTextField getNrFasesJFT() {
		return nrFasesJFT;
	}

	public void setNrFasesJFT(JFormattedTextField nrFasesJFT) {
		this.nrFasesJFT = nrFasesJFT;
	}

	public JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public void setOpcaoJFT(JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public JFormattedTextField getProtocoloJFT() {
		return protocoloJFT;
	}

	public void setProtocoloJFT(JFormattedTextField protocoloJFT) {
		this.protocoloJFT = protocoloJFT;
	}

	public JFormattedTextField getTesteJFT() {
		return testeJFT;
	}

	public void setTesteJFT(JFormattedTextField testeJFT) {
		this.testeJFT = testeJFT;
	}

	public JComboBox<String> getAreaJCB() {
		return areaJCB;
	}

	public void setAreaJCB(JComboBox<String> areaJCB) {
		this.areaJCB = areaJCB;
	}

	public javax.swing.JToggleButton getjToggleButton1() {
		return jToggleButton1;
	}

	public void setjToggleButton1(javax.swing.JToggleButton jToggleButton1) {
		this.jToggleButton1 = jToggleButton1;
	}

	public javax.swing.JFormattedTextField getGalpaoJFT() {
		return galpaoJFT;
	}

	public void setGalpaoJFT(javax.swing.JFormattedTextField galpaoJFT) {
		this.galpaoJFT = galpaoJFT;
	}

	public javax.swing.JLabel getDataAbateHist1Label() {
		return dataFaseHist1Label;
	}

	public void setDataAbateHist1Label(javax.swing.JLabel dataAbateHist1Label) {
		this.dataFaseHist1Label = dataAbateHist1Label;
	}

	public javax.swing.JLabel getDataAbateHist2Label() {
		return dataFaseHist2Label;
	}

	public void setDataAbateHist2Label(javax.swing.JLabel dataAbateHist2Label) {
		this.dataFaseHist2Label = dataAbateHist2Label;
	}


	public JFormattedTextField getDataFaseJFT() {
		return dataFaseJFT;
	}

	public void setDataFaseJFT(JFormattedTextField dataFaseJFT) {
		this.dataFaseJFT = dataFaseJFT;
	}

	public javax.swing.JLabel getDataFaseHist1Label() {
		return dataFaseHist1Label;
	}

	public void setDataFaseHist1Label(javax.swing.JLabel dataFaseHist1Label) {
		this.dataFaseHist1Label = dataFaseHist1Label;
	}

	public javax.swing.JLabel getDataFaseHist2Label() {
		return dataFaseHist2Label;
	}

	public void setDataFaseHist2Label(javax.swing.JLabel dataFaseHist2Label) {
		this.dataFaseHist2Label = dataFaseHist2Label;
	}

}
