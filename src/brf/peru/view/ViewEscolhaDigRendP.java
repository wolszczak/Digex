package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

public class ViewEscolhaDigRendP extends javax.swing.JFrame {
	
	private javax.swing.JFormattedTextField abateJFT;
    private javax.swing.JFormattedTextField aviarioJFT;
    private javax.swing.JFormattedTextField dataAbateJFT;
    private javax.swing.JLabel digitarRendimentoLabel;
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
        digitarRendimentoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        qtdeDesLabel = new javax.swing.JLabel();
        idadeJFT = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Escolha uma opção:");

        visualizarArquivoLabel.setText("[1] - Digitar relação baia/amostrados");

        try {
            opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
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
            aviarioJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        aviarioJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setText("Abate");

        abateJFT.setEditable(false);
        abateJFT.setForeground(new java.awt.Color(0, 153, 255));
        try {
            abateJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        abateJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Data");

        dataAbateJFT.setEditable(false);
        dataAbateJFT.setForeground(new java.awt.Color(0, 153, 255));
        try {
            dataAbateJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataAbateJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Idade");

        try {
        	idadeJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel10)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(jLabel11)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addGap(19)
        			.addComponent(jLabel12)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel11)
        				.addComponent(abateJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12)
        				.addComponent(dataAbateJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4)
        				.addComponent(idadeJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        digitarRendimentoLabel.setText("[3] - Digitar dados do frigorífico (cones)");

        jLabel1.setText("[2] - Digitar dados do frigorífico (câmaras)");

        qtdeDesLabel.setForeground(new java.awt.Color(0, 153, 255));
        qtdeDesLabel.setText("999 amostrados digitados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(digitarRendimentoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visualizarArquivoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdeDesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizarArquivoLabel)
                    .addComponent(qtdeDesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitarRendimentoLabel)
                .addGap(30, 30, 30)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(opcaoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigRendP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    public JLabel getDigitarRendimentoLabel() {
        return digitarRendimentoLabel;
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
}
