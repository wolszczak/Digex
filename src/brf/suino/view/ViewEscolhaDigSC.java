package brf.suino.view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewEscolhaDigSC extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	public ViewEscolhaDigSC() {
		initComponents();
	}

	public JLabel getExportarDesempenhoLabel() {
		return exportarConsLabel;
	}

	public JLabel getExportarRendimentoLabel() {
		return exportarMediLabel;
	}

	public JFormattedTextField getOpcaoJFT() {
		return opcaoJFT;
	}

	public JFormattedTextField getProtocoloJFT() {
		return protocoloJFT;
	}

	public JFormattedTextField getTesteJFT() {
		return testeJFT;
	}


	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		protocoloJFT = new javax.swing.JFormattedTextField();
		jLabel2 = new javax.swing.JLabel();
		testeJFT = new javax.swing.JFormattedTextField();
		jLabel3 = new javax.swing.JLabel();
		desempenhoLabel = new javax.swing.JLabel();
		exportarConsLabel = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		opcaoJFT = new javax.swing.JFormattedTextField();
		qtdeConsLabel = new javax.swing.JLabel();
		exportarMediLabel = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Experimento");

		protocoloJFT.setEditable(false);
		protocoloJFT.setForeground(new java.awt.Color(0, 153, 255));
		protocoloJFT.setText("jFormattedTextField1");
		protocoloJFT.setFocusable(false);

		jLabel2.setText("Teste");

		testeJFT.setEditable(false);
		testeJFT.setForeground(new java.awt.Color(0, 153, 255));
		testeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		testeJFT.setText("jFormattedTextField2");
		testeJFT.setFocusable(false);

		jLabel3.setText("Escolha uma opção:");

		desempenhoLabel.setText("[1] - Baias");

		exportarConsLabel.setText("[2] - Arquivo de Rações");

		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel9.setText("Opção");

		jLabel10.setText("[9] - Voltar");

		jLabel11.setText("[0]- Sair");

		try {
			opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		qtdeConsLabel.setForeground(new java.awt.Color(0, 153, 255));
		qtdeConsLabel.setText("999/999 registro(s)");

		exportarMediLabel.setText("[4] - Arquivo de Medicados");

		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("Digitação");

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Exportação");

		exportarMortLabel = new JLabel();
		exportarMortLabel.setText("[3] - Arquivo de Mortalidade");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
							.addGap(51))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(0)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel2)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup()
											.addComponent(desempenhoLabel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(qtdeConsLabel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
										.addComponent(exportarConsLabel, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(jLabel1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(testeJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(protocoloJFT, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
								.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())))
				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					.addGap(238)
					.addComponent(exportarMortLabel, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					.addGap(238)
					.addComponent(exportarMediLabel, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(29)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel1)
						.addComponent(protocoloJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel2)
						.addComponent(testeJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(jLabel3)
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jLabel6)
						.addComponent(jLabel7))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(desempenhoLabel)
							.addComponent(qtdeConsLabel))
						.addComponent(exportarConsLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exportarMortLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(exportarMediLabel)
					.addGap(45)
					.addComponent(jLabel10)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jLabel11)
					.addGap(18)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9)
						.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,
				GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING).addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE));
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
			java.util.logging.Logger.getLogger(ViewEscolhaDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewEscolhaDigSC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ViewEscolhaDigSC().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel desempenhoLabel;
	private javax.swing.JLabel exportarConsLabel;
	private javax.swing.JLabel exportarMediLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JFormattedTextField opcaoJFT;
	private javax.swing.JFormattedTextField protocoloJFT;
	private javax.swing.JLabel qtdeConsLabel;
	private javax.swing.JFormattedTextField testeJFT;
	private JLabel exportarMortLabel;

	public javax.swing.JLabel getQtdeConsLabel() {
		return qtdeConsLabel;
	}

	public void setQtdeConsLabel(javax.swing.JLabel qtdeConsLabel) {
		this.qtdeConsLabel = qtdeConsLabel;
	}

	public javax.swing.JLabel getExportarConsLabel() {
		return exportarConsLabel;
	}

	public void setExportarConsLabel(javax.swing.JLabel exportarConsLabel) {
		this.exportarConsLabel = exportarConsLabel;
	}

	public javax.swing.JLabel getExportarMediLabel() {
		return exportarMediLabel;
	}

	public void setExportarMediLabel(javax.swing.JLabel exportarMediLabel) {
		this.exportarMediLabel = exportarMediLabel;
	}

	public JLabel getExportarMortLabel() {
		return exportarMortLabel;
	}

	public void setExportarMortLabel(JLabel exportarMortLabel) {
		this.exportarMortLabel = exportarMortLabel;
	}

}
