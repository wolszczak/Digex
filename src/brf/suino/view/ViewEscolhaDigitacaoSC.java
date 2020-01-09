package brf.suino.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

public class ViewEscolhaDigitacaoSC extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel abate1Label;
	private javax.swing.JLabel abate1Label1;
	private javax.swing.JLabel abate1Label2;
	private javax.swing.JLabel abate2Label;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel qtdeAbate1Label;
	private javax.swing.JLabel qtdeAbate1Label1;
	private javax.swing.JLabel qtdeAbate1Label2;
	private javax.swing.JLabel qtdeAbate1Label3;
	private javax.swing.JLabel qtdeAbate2Label;

	public ViewEscolhaDigitacaoSC() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel11 = new javax.swing.JPanel();
		jLabel37 = new javax.swing.JLabel();
		abate1Label = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		abate2Label = new javax.swing.JLabel();
		qtdeAbate1Label = new javax.swing.JLabel();
		qtdeAbate2Label = new javax.swing.JLabel();
		qtdeAbate1Label1 = new javax.swing.JLabel();
		abate1Label1 = new javax.swing.JLabel();
		qtdeAbate1Label2 = new javax.swing.JLabel();
		abate1Label2 = new javax.swing.JLabel();
		qtdeAbate1Label3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel37.setText("Última baia digitada:");

		abate1Label.setText("[1] - Digitar Baias");

		jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel41.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		abate2Label.setText("[2] - Digitar Mortalidade");

		qtdeAbate1Label.setForeground(new java.awt.Color(0, 153, 255));
		qtdeAbate1Label.setText("99 registro(s)");

		qtdeAbate2Label.setForeground(new java.awt.Color(0, 153, 255));
		qtdeAbate2Label.setText("99 registro(s)");

		qtdeAbate1Label1.setForeground(new java.awt.Color(0, 153, 255));
		qtdeAbate1Label1.setText("99");

		abate1Label1.setText("[3] - Digitar Medicados");

		qtdeAbate1Label2.setForeground(new java.awt.Color(0, 153, 255));
		qtdeAbate1Label2.setText("99 registro(s)");

		abate1Label2.setText("[4] - Começar nova baia");

		qtdeAbate1Label3.setForeground(new java.awt.Color(0, 153, 255));
		qtdeAbate1Label3.setText("99 registro(s)");

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel11Layout.createSequentialGroup().addComponent(abate1Label1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(qtdeAbate1Label2))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel11Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
												.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(abate1Label).addComponent(abate2Label))
												.addGap(52, 52, 52))
										.addGroup(jPanel11Layout.createSequentialGroup().addComponent(jLabel37).addGap(13, 13, 13)))
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(qtdeAbate1Label1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(qtdeAbate2Label, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(qtdeAbate1Label, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(jPanel11Layout.createSequentialGroup().addComponent(abate1Label2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(qtdeAbate1Label3)))
						.addContainerGap()));
		jPanel11Layout
				.setVerticalGroup(
						jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel11Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(qtdeAbate1Label1))
										.addGap(18, 18, 18)
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(abate1Label).addComponent(qtdeAbate1Label))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(abate2Label).addComponent(qtdeAbate2Label))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(abate1Label1).addComponent(qtdeAbate1Label2))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(abate1Label2).addComponent(qtdeAbate1Label3))
										.addGap(18, 27, Short.MAX_VALUE)
										.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel41))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel11,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel11,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigitacaoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigitacaoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigitacaoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigitacaoSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewEscolhaDigitacaoSC().setVisible(true);
			}
		});
	}

	public javax.swing.JLabel getAbate1Label() {
		return abate1Label;
	}

	public void setAbate1Label(javax.swing.JLabel abate1Label) {
		this.abate1Label = abate1Label;
	}

	public javax.swing.JLabel getAbate1Label1() {
		return abate1Label1;
	}

	public void setAbate1Label1(javax.swing.JLabel abate1Label1) {
		this.abate1Label1 = abate1Label1;
	}

	public javax.swing.JLabel getAbate1Label2() {
		return abate1Label2;
	}

	public void setAbate1Label2(javax.swing.JLabel abate1Label2) {
		this.abate1Label2 = abate1Label2;
	}

	public javax.swing.JLabel getAbate2Label() {
		return abate2Label;
	}

	public void setAbate2Label(javax.swing.JLabel abate2Label) {
		this.abate2Label = abate2Label;
	}

	public javax.swing.JLabel getjLabel37() {
		return jLabel37;
	}

	public void setjLabel37(javax.swing.JLabel jLabel37) {
		this.jLabel37 = jLabel37;
	}

	public javax.swing.JLabel getjLabel41() {
		return jLabel41;
	}

	public void setjLabel41(javax.swing.JLabel jLabel41) {
		this.jLabel41 = jLabel41;
	}

	public javax.swing.JPanel getjPanel11() {
		return jPanel11;
	}

	public void setjPanel11(javax.swing.JPanel jPanel11) {
		this.jPanel11 = jPanel11;
	}

	public javax.swing.JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public javax.swing.JLabel getQtdeAbate1Label() {
		return qtdeAbate1Label;
	}

	public void setQtdeAbate1Label(javax.swing.JLabel qtdeAbate1Label) {
		this.qtdeAbate1Label = qtdeAbate1Label;
	}

	public javax.swing.JLabel getQtdeAbate1Label1() {
		return qtdeAbate1Label1;
	}

	public void setQtdeAbate1Label1(javax.swing.JLabel qtdeAbate1Label1) {
		this.qtdeAbate1Label1 = qtdeAbate1Label1;
	}

	public javax.swing.JLabel getQtdeAbate1Label2() {
		return qtdeAbate1Label2;
	}

	public void setQtdeAbate1Label2(javax.swing.JLabel qtdeAbate1Label2) {
		this.qtdeAbate1Label2 = qtdeAbate1Label2;
	}

	public javax.swing.JLabel getQtdeAbate1Label3() {
		return qtdeAbate1Label3;
	}

	public void setQtdeAbate1Label3(javax.swing.JLabel qtdeAbate1Label3) {
		this.qtdeAbate1Label3 = qtdeAbate1Label3;
	}

	public javax.swing.JLabel getQtdeAbate2Label() {
		return qtdeAbate2Label;
	}

	public void setQtdeAbate2Label(javax.swing.JLabel qtdeAbate2Label) {
		this.qtdeAbate2Label = qtdeAbate2Label;
	}

}
