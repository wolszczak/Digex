package brf.peru.view;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewEscolhaDigRendP extends javax.swing.JFrame {

	private javax.swing.JFormattedTextField abateJFT;
	private javax.swing.JFormattedTextField aviarioJFT;
	private javax.swing.JFormattedTextField dataAbateJFT;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel qtdeDesLabel;
	private javax.swing.JLabel visualizarArquivoLabel;
	private JLabel qtdCamarasLabel;
	private javax.swing.JFormattedTextField idadeJFT;

	public ViewEscolhaDigRendP() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		visualizarArquivoLabel = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		jLabel41 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		aviarioJFT = new javax.swing.JFormattedTextField();
		jLabel11 = new javax.swing.JLabel();
		abateJFT = new javax.swing.JFormattedTextField();
		jLabel12 = new javax.swing.JLabel();
		dataAbateJFT = new javax.swing.JFormattedTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		qtdeDesLabel = new javax.swing.JLabel();
		idadeJFT = new javax.swing.JFormattedTextField();
		idadeJFT.setEditable(false);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel2.setText("Escolha uma opção:");

		visualizarArquivoLabel.setText("[1] - Digitar relação baia/amostrados");

		try {
			opcaoJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel41.setText("Opção");

		jLabel40.setText("[0] - Sair");

		jLabel39.setText("[9]- Voltar");

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

		jLabel11.setText("Abate");

		abateJFT.setEditable(false);
		abateJFT.setForeground(new java.awt.Color(0, 153, 255));
		try {
			abateJFT.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		abateJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel12.setText("Data");

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
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(jLabel11).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addGap(20)
						.addComponent(jLabel4).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(idadeJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20).addComponent(jLabel12).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(
						jPanel2Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11)
												.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel12)
												.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4).addComponent(idadeJFT,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
		jPanel2.setLayout(jPanel2Layout);

		jLabel1.setText("[2] - Digitar dados do frigorífico (câmaras)");

		qtdeDesLabel.setForeground(new java.awt.Color(0, 153, 255));
		qtdeDesLabel.setText("999 amostrados digitados");

		qtdCamarasLabel = new JLabel();
		qtdCamarasLabel.setText("999 amostrados digitados");
		qtdCamarasLabel.setForeground(new Color(0, 153, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel2)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(visualizarArquivoLabel, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(qtdCamarasLabel, GroupLayout.PREFERRED_SIZE, 168,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(qtdeDesLabel, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
						.addComponent(jLabel39).addComponent(jLabel40)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel41, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(opcaoJFT,
												GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(jLabel2).addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(visualizarArquivoLabel)
						.addComponent(qtdeDesLabel))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(qtdCamarasLabel))
				.addGap(50).addComponent(jLabel39).addPreferredGap(ComponentPlacement.RELATED).addComponent(jLabel40)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel41).addComponent(
						opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));

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
			java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewEscolhaDigRendP().setVisible(true);
			}
		});
	}

	public JFormattedTextField getAbateJFT() {
		return abateJFT;
	}

	public JFormattedTextField getAviarioJFT() {
		return aviarioJFT;
	}

	public JFormattedTextField getDataAbateJFT() {
		return dataAbateJFT;
	}

	public JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public JLabel getQtdeDesLabel() {
		return qtdeDesLabel;
	}

	public JLabel getVisualizarArquivoLabel() {
		return visualizarArquivoLabel;
	}

	public javax.swing.JFormattedTextField getIdadeJFT() {
		return idadeJFT;
	}

	public void setIdadeJFT(javax.swing.JFormattedTextField idadeJFT) {
		this.idadeJFT = idadeJFT;
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

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public javax.swing.JLabel getjLabel39() {
		return jLabel39;
	}

	public void setjLabel39(javax.swing.JLabel jLabel39) {
		this.jLabel39 = jLabel39;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(javax.swing.JLabel jLabel4) {
		this.jLabel4 = jLabel4;
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

	public void setAbateJFT(javax.swing.JFormattedTextField abateJFT) {
		this.abateJFT = abateJFT;
	}

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.aviarioJFT = aviarioJFT;
	}

	public void setDataAbateJFT(javax.swing.JFormattedTextField dataAbateJFT) {
		this.dataAbateJFT = dataAbateJFT;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public void setQtdeDesLabel(javax.swing.JLabel qtdeDesLabel) {
		this.qtdeDesLabel = qtdeDesLabel;
	}

	public void setVisualizarArquivoLabel(javax.swing.JLabel visualizarArquivoLabel) {
		this.visualizarArquivoLabel = visualizarArquivoLabel;
	}

	public JLabel getQtdCamarasLabel() {
		return qtdCamarasLabel;
	}

	public void setQtdCamarasLabel(JLabel qtdCamarasLabel) {
		this.qtdCamarasLabel = qtdCamarasLabel;
	}

	public javax.swing.JFormattedTextField getIdadeLabelJFT() {
		return idadeJFT;
	}

	public void setIdadeLabelJFT(javax.swing.JFormattedTextField idadeLabelJFT) {
		this.idadeJFT = idadeLabelJFT;
	}
}
