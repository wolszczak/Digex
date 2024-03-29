package brf.suino.view;

import brf.frango.view.*;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ViewImportarFrigoST extends javax.swing.JFrame {

    /**
     * Creates new form ViewImportarBalanca
     */
    public ViewImportarFrigoST() {
        initComponents();
    }
    
    public JLabel getRegistrosBalancaLabel() {
        return registrosImportadosLabel;
    }


    public JFormattedTextField getOpcaoJFT() {
        return opcaoJFT;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pcrLabel = new javax.swing.JLabel();
        opcaoJFT = new javax.swing.JFormattedTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        registrosImportadosLabel = new javax.swing.JLabel();
        pernilLabel = new javax.swing.JLabel();
        paletaLabel = new javax.swing.JLabel();
        costadoLabel = new javax.swing.JLabel();
        barrigaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Escolha uma opção:");

        jLabel3.setText("1 - Importar arquivo de Frigorífico");

        pcrLabel.setText("2 - Digitar dados PCR");

        try {
            opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel41.setText("Opção");

        jLabel40.setText("0 - Sair");

        jLabel39.setText("9/ESC - Voltar");

        registrosImportadosLabel.setForeground(new java.awt.Color(0, 153, 255));
        registrosImportadosLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        registrosImportadosLabel.setText("0 registro(s) importado(s)");

        pernilLabel.setText("3 - Digitar dados Pernil");

        paletaLabel.setText("4 - Digitar dados Paleta");

        costadoLabel.setText("5 - Digitar dados Costado");

        barrigaLabel.setText("6 - Digitar dados Barriga");
        
        digitadosPCR = new JLabel();
        digitadosPCR.setText("0 digitado(s)");
        digitadosPCR.setHorizontalAlignment(SwingConstants.TRAILING);
        digitadosPCR.setForeground(new Color(0, 153, 255));
        
        digitadosPernil = new JLabel();
        digitadosPernil.setText("0 digitado(s)");
        digitadosPernil.setHorizontalAlignment(SwingConstants.TRAILING);
        digitadosPernil.setForeground(new Color(0, 153, 255));
        
        digitadosPaleta = new JLabel();
        digitadosPaleta.setText("0 digitado(s)");
        digitadosPaleta.setHorizontalAlignment(SwingConstants.TRAILING);
        digitadosPaleta.setForeground(new Color(0, 153, 255));
        
        digitadosCostado = new JLabel();
        digitadosCostado.setText("0 digitado(s)");
        digitadosCostado.setHorizontalAlignment(SwingConstants.TRAILING);
        digitadosCostado.setForeground(new Color(0, 153, 255));
        
        digitadosBarriga = new JLabel();
        digitadosBarriga.setText("0 digitado(s)");
        digitadosBarriga.setHorizontalAlignment(SwingConstants.TRAILING);
        digitadosBarriga.setForeground(new Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel40)
        						.addComponent(jLabel2)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(pcrLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(registrosImportadosLabel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        								.addComponent(digitadosPCR, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(jLabel39, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel41)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addGap(15))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(pernilLabel, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(digitadosPernil, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(paletaLabel, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(digitadosPaleta, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(costadoLabel, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(digitadosCostado, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(barrigaLabel, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(digitadosBarriga, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(registrosImportadosLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(pcrLabel)
        				.addComponent(digitadosPCR))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(pernilLabel)
        				.addComponent(digitadosPernil))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(paletaLabel)
        				.addComponent(digitadosPaleta))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(costadoLabel)
        				.addComponent(digitadosCostado))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(barrigaLabel)
        				.addComponent(digitadosBarriga))
        			.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        			.addComponent(jLabel39)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel40)
        			.addGap(2)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel41)
        				.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewImportarFrigoST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewImportarFrigoST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewImportarFrigoST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewImportarFrigoST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewImportarFrigoST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField opcaoJFT;
    private javax.swing.JLabel registrosImportadosLabel;
    private javax.swing.JLabel pcrLabel;
    private javax.swing.JLabel pernilLabel;
    private javax.swing.JLabel paletaLabel;
    private javax.swing.JLabel costadoLabel;
    private javax.swing.JLabel barrigaLabel;
    private javax.swing.JLabel digitadosPCR;
    private javax.swing.JLabel digitadosPernil;
    private javax.swing.JLabel digitadosPaleta;
    private javax.swing.JLabel digitadosCostado;
    private javax.swing.JLabel digitadosBarriga;
    // End of variables declaration//GEN-END:variables
	

	public javax.swing.JLabel getRegistrosImportadosLabel() {
		return registrosImportadosLabel;
	}

	public void setRegistrosImportadosLabel(javax.swing.JLabel registrosImportadosLabel) {
		this.registrosImportadosLabel = registrosImportadosLabel;
	}

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(javax.swing.JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public void setjLabel3(javax.swing.JLabel jLabel3) {
		this.jLabel3 = jLabel3;
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

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public void setjPanel1(javax.swing.JPanel jPanel1) {
		this.jPanel1 = jPanel1;
	}

	public javax.swing.JLabel getPcrLabel() {
		return pcrLabel;
	}

	public void setPcrLabel(javax.swing.JLabel pcrLabel) {
		this.pcrLabel = pcrLabel;
	}

	public javax.swing.JLabel getPernilLabel() {
		return pernilLabel;
	}

	public void setPernilLabel(javax.swing.JLabel pernilLabel) {
		this.pernilLabel = pernilLabel;
	}

	public javax.swing.JLabel getPaletaLabel() {
		return paletaLabel;
	}

	public void setPaletaLabel(javax.swing.JLabel paletaLabel) {
		this.paletaLabel = paletaLabel;
	}

	public javax.swing.JLabel getCostadoLabel() {
		return costadoLabel;
	}

	public void setCostadoLabel(javax.swing.JLabel costadoLabel) {
		this.costadoLabel = costadoLabel;
	}

	public javax.swing.JLabel getBarrigaLabel() {
		return barrigaLabel;
	}

	public void setBarrigaLabel(javax.swing.JLabel barrigaLabel) {
		this.barrigaLabel = barrigaLabel;
	}

	public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
		this.opcaoJFT = opcaoJFT;
	}

	public javax.swing.JLabel getDigitadosPCR() {
		return digitadosPCR;
	}

	public void setDigitadosPCR(javax.swing.JLabel digitadosPCR) {
		this.digitadosPCR = digitadosPCR;
	}

	public javax.swing.JLabel getDigitadosPernil() {
		return digitadosPernil;
	}

	public void setDigitadosPernil(javax.swing.JLabel digitadosPernil) {
		this.digitadosPernil = digitadosPernil;
	}

	public javax.swing.JLabel getDigitadosPaleta() {
		return digitadosPaleta;
	}

	public void setDigitadosPaleta(javax.swing.JLabel digitadosPaleta) {
		this.digitadosPaleta = digitadosPaleta;
	}

	public javax.swing.JLabel getDigitadosCostado() {
		return digitadosCostado;
	}

	public void setDigitadosCostado(javax.swing.JLabel digitadosCostado) {
		this.digitadosCostado = digitadosCostado;
	}

	public javax.swing.JLabel getDigitadosBarriga() {
		return digitadosBarriga;
	}

	public void setDigitadosBarriga(javax.swing.JLabel digitadosBarriga) {
		this.digitadosBarriga = digitadosBarriga;
	}
}
