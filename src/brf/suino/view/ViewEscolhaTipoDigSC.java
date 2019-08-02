package brf.suino.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class ViewEscolhaTipoDigSC extends javax.swing.JFrame {

	private javax.swing.JLabel abate1Label;
	private javax.swing.JLabel abate2Label;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JLabel labelMortalidadeRegistros;
	private javax.swing.JLabel labelMedicadosRegistros;
	private JLabel labelBaia;
	private JLabel labelBaiaRegistros;

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel11 = new javax.swing.JPanel();
		jLabel37 = new javax.swing.JLabel();
		abate1Label = new javax.swing.JLabel();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		abate2Label = new javax.swing.JLabel();
		labelMortalidadeRegistros = new javax.swing.JLabel();
		labelMedicadosRegistros = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel37.setText("Última baia digitada:");

		abate1Label.setText("Mortalidade:");

		jLabel39.setText("[2] - Digitar Mortalidade");

		jLabel40.setText("[3] - Digitar Medicados");

		jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel41.setText("Opção");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		abate2Label.setText("Medicados");

		labelMortalidadeRegistros.setForeground(new java.awt.Color(0, 153, 255));
		labelMortalidadeRegistros.setText("0 registro(s)");

		labelMedicadosRegistros.setForeground(new java.awt.Color(0, 153, 255));
		labelMedicadosRegistros.setText("0 registro(s)");

		labelBaia = new JLabel();
		labelBaia.setText("99");
		labelBaia.setForeground(new Color(0, 153, 255));

		JLabel lblDigitar = new JLabel();
		lblDigitar.setText("[1] - Digitar próxima baia");

		JLabel lblVoltar = new JLabel();
		lblVoltar.setText("[9] - Voltar");

		JLabel lblSair = new JLabel();
		lblSair.setText("[0] - Sair");

		labelBaiaRegistros = new JLabel();
		labelBaiaRegistros.setText("0 registro(s)");
		labelBaiaRegistros.setForeground(new Color(0, 153, 255));

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11Layout.setHorizontalGroup(
			jPanel11Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
							.addGroup(jPanel11Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(abate1Label, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
								.addComponent(abate2Label))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel11Layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(labelMortalidadeRegistros, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelMedicadosRegistros, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jLabel39, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
						.addComponent(jLabel40, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
							.addComponent(jLabel37, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(labelBaia, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
							.addComponent(labelBaiaRegistros, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
							.addComponent(jLabel41, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(6))
						.addGroup(jPanel11Layout.createSequentialGroup()
							.addComponent(lblVoltar, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(jPanel11Layout.createSequentialGroup()
							.addComponent(lblSair, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(jPanel11Layout.createSequentialGroup()
							.addComponent(lblDigitar, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE))))
		);
		jPanel11Layout.setVerticalGroup(
			jPanel11Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel37)
						.addComponent(labelBaiaRegistros)
						.addComponent(labelBaia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(abate1Label)
						.addComponent(labelMortalidadeRegistros))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(abate2Label)
						.addComponent(labelMedicadosRegistros))
					.addGap(18)
					.addComponent(lblDigitar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jLabel39)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jLabel40)
					.addGap(29)
					.addComponent(lblVoltar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSair)
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(jPanel11Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel41)
						.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel11.setLayout(jPanel11Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel11, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);

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
			java.util.logging.Logger.getLogger(ViewEscolhaTipoDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaTipoDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaTipoDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaTipoDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
				new ViewEscolhaTipoDigSC().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables

	public javax.swing.JLabel getjLabel37() {
		return jLabel37;
	}

	public void setjLabel37(javax.swing.JLabel jLabel37) {
		this.jLabel37 = jLabel37;
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

	public javax.swing.JPanel getjPanel11() {
		return jPanel11;
	}

	public void setjPanel11(javax.swing.JPanel jPanel11) {
		this.jPanel11 = jPanel11;
	}

	public javax.swing.JLabel getLabelMortalidadeRegistros() {
		return labelMortalidadeRegistros;
	}

	public void setLabelMortalidadeRegistros(javax.swing.JLabel labelMortalidadeRegistros) {
		this.labelMortalidadeRegistros = labelMortalidadeRegistros;
	}

	public javax.swing.JLabel getLabelMedicadosRegistros() {
		return labelMedicadosRegistros;
	}

	public void setLabelMedicadosRegistros(javax.swing.JLabel labelMedicadosRegistros) {
		this.labelMedicadosRegistros = labelMedicadosRegistros;
	}

	public void setAbate1Label(javax.swing.JLabel abate1Label) {
		this.abate1Label = abate1Label;
	}

	public void setAbate2Label(javax.swing.JLabel abate2Label) {
		this.abate2Label = abate2Label;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public ViewEscolhaTipoDigSC() {
		initComponents();
	}

	public JLabel getAbate1Label() {
		return abate1Label;
	}

	public JLabel getAbate2Label() {
		return abate2Label;
	}

	public JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public JLabel getQtdeAbate1Label() {
		return labelMortalidadeRegistros;
	}

	public JLabel getQtdeAbate2Label() {
		return labelMedicadosRegistros;
	}

	public JLabel getLabelBaia() {
		return labelBaia;
	}

	public void setLabelBaia(JLabel labelBaia) {
		this.labelBaia = labelBaia;
	}

	public JLabel getLabelBaiaRegistros() {
		return labelBaiaRegistros;
	}

	public void setLabelBaiaRegistros(JLabel labelBaiaRegistros) {
		this.labelBaiaRegistros = labelBaiaRegistros;
	}
}
