package brf.frigoaves.view;

import brf.frango.view.*;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewEscolhaDigAves extends javax.swing.JFrame {

    /**
     * Creates new form SelecaoArqVIEW
     */
    public ViewEscolhaDigAves() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desempenhoLabel = new javax.swing.JLabel();
        exportarDesempenhoLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        opcaoJFT = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        desempenhoLabel1 = new javax.swing.JLabel();
        desempenhoLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Avaliação de Aves no Frigorífico");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Escolha uma opção:");

        desempenhoLabel.setText("1 - Digitar dados de plataforma");

        exportarDesempenhoLabel.setText("4 - Exportar avaliação");

        jLabel9.setText("Opção");

        jLabel10.setText("9/ ESC- Voltar");

        jLabel11.setText("0- Sair");

        try {
            opcaoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        opcaoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Digitação");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Exportação");

        desempenhoLabel1.setText("2 - Digitar dados de carcaças");

        desempenhoLabel2.setText("3 - Digitar dados de partes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        					.addGap(51))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel11)
        					.addGap(36, 358, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(0, 318, Short.MAX_VALUE)
        					.addComponent(jLabel9)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(opcaoJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(desempenhoLabel2, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        						.addComponent(desempenhoLabel1, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        							.addGap(0, 0, Short.MAX_VALUE))
        						.addComponent(desempenhoLabel, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(exportarDesempenhoLabel, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
        					.addContainerGap())
        				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(24)
        			.addComponent(jLabel3)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(desempenhoLabel)
        				.addComponent(exportarDesempenhoLabel))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(desempenhoLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(desempenhoLabel2)
        			.addGap(40)
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
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(ViewEscolhaDigAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEscolhaDigAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEscolhaDigAves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desempenhoLabel;
    private javax.swing.JLabel desempenhoLabel1;
    private javax.swing.JLabel desempenhoLabel2;
    private javax.swing.JLabel exportarDesempenhoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField opcaoJFT;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the desempenhoLabel
     */
    public javax.swing.JLabel getDesempenhoLabel() {
        return desempenhoLabel;
    }

    /**
     * @param desempenhoLabel the desempenhoLabel to set
     */
    public void setDesempenhoLabel(javax.swing.JLabel desempenhoLabel) {
        this.desempenhoLabel = desempenhoLabel;
    }

    /**
     * @return the desempenhoLabel1
     */
    public javax.swing.JLabel getDesempenhoLabel1() {
        return desempenhoLabel1;
    }

    /**
     * @param desempenhoLabel1 the desempenhoLabel1 to set
     */
    public void setDesempenhoLabel1(javax.swing.JLabel desempenhoLabel1) {
        this.desempenhoLabel1 = desempenhoLabel1;
    }

    /**
     * @return the desempenhoLabel2
     */
    public javax.swing.JLabel getDesempenhoLabel2() {
        return desempenhoLabel2;
    }

    /**
     * @param desempenhoLabel2 the desempenhoLabel2 to set
     */
    public void setDesempenhoLabel2(javax.swing.JLabel desempenhoLabel2) {
        this.desempenhoLabel2 = desempenhoLabel2;
    }

    /**
     * @return the exportarDesempenhoLabel
     */
    public javax.swing.JLabel getExportarDesempenhoLabel() {
        return exportarDesempenhoLabel;
    }

    /**
     * @param exportarDesempenhoLabel the exportarDesempenhoLabel to set
     */
    public void setExportarDesempenhoLabel(javax.swing.JLabel exportarDesempenhoLabel) {
        this.exportarDesempenhoLabel = exportarDesempenhoLabel;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel10
     */
    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    /**
     * @param jLabel10 the jLabel10 to set
     */
    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    /**
     * @return the jLabel11
     */
    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    /**
     * @param jLabel11 the jLabel11 to set
     */
    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the opcaoJFT
     */
    public javax.swing.JFormattedTextField getOpcaoJFT() {
        return opcaoJFT;
    }

    /**
     * @param opcaoJFT the opcaoJFT to set
     */
    public void setOpcaoJFT(javax.swing.JFormattedTextField opcaoJFT) {
        this.opcaoJFT = opcaoJFT;
    }
}
