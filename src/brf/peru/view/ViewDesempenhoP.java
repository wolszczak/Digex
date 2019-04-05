package brf.peru.view;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ViewDesempenhoP extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private javax.swing.JFormattedTextField avesAlojadasJFT;
    private javax.swing.JFormattedTextField aviarioJFT;
    private javax.swing.JFormattedTextField baiaJFT;
    private javax.swing.JPanel baiaJP;
    private javax.swing.JPanel consumoJP;
    private javax.swing.JFormattedTextField controleFornecidaJFT;
    private javax.swing.JPanel controleRMEJP1;
    private javax.swing.JFormattedTextField controleSobraJFT;
    private javax.swing.JLabel faseConsumoLabel;
    private javax.swing.JLabel fornecidaHist1Label;
    private javax.swing.JLabel fornecidaHist2Label;
    private javax.swing.JLabel fornecidaHist3Label;
    private javax.swing.JLabel fornecidaHist4Label;
    private javax.swing.JLabel fornecidaHist5Label;
    private javax.swing.JFormattedTextField fornecidaJFT;
    private javax.swing.JLabel idadeHist1Label;
    private javax.swing.JLabel idadeHist2Label;
    private javax.swing.JLabel idadeHist3Label;
    private javax.swing.JLabel idadeHist4Label;
    private javax.swing.JLabel idadeHist5Label;
    private javax.swing.JFormattedTextField idadeJFT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField ladoJFT;
    private javax.swing.JFormattedTextField linhagemJFT;
    private javax.swing.JLabel ordemHist1Label;
    private javax.swing.JLabel ordemHist2Label;
    private javax.swing.JLabel ordemHist3Label;
    private javax.swing.JLabel ordemHist4Label;
    private javax.swing.JLabel ordemHist5Label;
    private javax.swing.JFormattedTextField ordemJFT;
    private javax.swing.JFormattedTextField sexoJFT;
    private javax.swing.JLabel sobraHist1Label;
    private javax.swing.JLabel sobraHist2Label;
    private javax.swing.JLabel sobraHist3Label;
    private javax.swing.JLabel sobraHist4Label;
    private javax.swing.JLabel sobraHist5Label;
    private javax.swing.JFormattedTextField sobraJFT;
    private javax.swing.JFormattedTextField trataJFT;
    private JLabel registroLabel;
    private JFormattedTextField controleBaiaJFT;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baiaJP = new javax.swing.JPanel();
        avesAlojadasJFT = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        baiaJFT = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        sexoJFT = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        linhagemJFT = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        aviarioJFT = new javax.swing.JFormattedTextField();
        jLabel45 = new javax.swing.JLabel();
        trataJFT = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        ladoJFT = new javax.swing.JFormattedTextField();
        consumoJP = new javax.swing.JPanel();
        faseConsumoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fornecidaHist4Label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sobraHist4Label = new javax.swing.JLabel();
        fornecidaJFT = new javax.swing.JFormattedTextField();
        fornecidaHist5Label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sobraHist5Label = new javax.swing.JLabel();
        sobraJFT = new javax.swing.JFormattedTextField();
        fornecidaHist1Label = new javax.swing.JLabel();
        sobraHist1Label = new javax.swing.JLabel();
        fornecidaHist2Label = new javax.swing.JLabel();
        sobraHist2Label = new javax.swing.JLabel();
        fornecidaHist3Label = new javax.swing.JLabel();
        sobraHist3Label = new javax.swing.JLabel();
        idadeHist1Label = new javax.swing.JLabel();
        idadeHist2Label = new javax.swing.JLabel();
        idadeHist3Label = new javax.swing.JLabel();
        idadeHist4Label = new javax.swing.JLabel();
        idadeHist5Label = new javax.swing.JLabel();
        idadeJFT = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        ordemHist1Label = new javax.swing.JLabel();
        ordemHist2Label = new javax.swing.JLabel();
        ordemHist3Label = new javax.swing.JLabel();
        ordemHist4Label = new javax.swing.JLabel();
        ordemHist5Label = new javax.swing.JLabel();
        ordemJFT = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        controleRMEJP1 = new javax.swing.JPanel();
        controleFornecidaJFT = new javax.swing.JFormattedTextField();
        controleSobraJFT = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        registroLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        try {
            avesAlojadasJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        avesAlojadasJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        avesAlojadasJFT.setEnabled(false);

        jLabel36.setText("Controle");

        jLabel31.setText("Baia");

        try {
            baiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        baiaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel32.setText("Sexo");

        try {
            sexoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        sexoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sexoJFT.setEnabled(false);

        jLabel34.setText("Linhagem");

        try {
            linhagemJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        linhagemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        linhagemJFT.setEnabled(false);

        jLabel35.setText("Aves Alojadas");

        jLabel44.setText("Aviário");

        aviarioJFT.setEditable(false);
        try {
            aviarioJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        aviarioJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel45.setText("Trat.");

        try {
            trataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        trataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        trataJFT.setEnabled(false);

        jLabel33.setText("Lado");

        try {
            ladoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ladoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ladoJFT.setEnabled(false);
        
        controleBaiaJFT = new JFormattedTextField();
        try {
        	controleBaiaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        controleBaiaJFT.setHorizontalAlignment(SwingConstants.CENTER);
        controleBaiaJFT.setEnabled(false);

        javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
        baiaJPLayout.setHorizontalGroup(
        	baiaJPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(baiaJPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(baiaJPLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(baiaJPLayout.createSequentialGroup()
        					.addComponent(jLabel44)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel31)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel33)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel32)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel34)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        				.addGroup(baiaJPLayout.createSequentialGroup()
        					.addComponent(jLabel45)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        					.addGap(10)
        					.addComponent(jLabel35)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabel36)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(104, Short.MAX_VALUE))
        );
        baiaJPLayout.setVerticalGroup(
        	baiaJPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(baiaJPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel31)
        				.addComponent(baiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel32)
        				.addComponent(sexoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel34)
        				.addComponent(linhagemJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel44)
        				.addComponent(aviarioJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel33)
        				.addComponent(ladoJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(baiaJPLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel35)
        				.addComponent(avesAlojadasJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel36)
        				.addComponent(jLabel45)
        				.addComponent(trataJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(controleBaiaJFT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        baiaJP.setLayout(baiaJPLayout);

        consumoJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        faseConsumoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        faseConsumoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consumo de Ração");

        fornecidaHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fornecidaHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fornecidaHist4Label.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fornecida");

        sobraHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobraHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sobraHist4Label.setEnabled(false);

        try {
            fornecidaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fornecidaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fornecidaJFT.setEnabled(false);

        fornecidaHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fornecidaHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fornecidaHist5Label.setEnabled(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sobra");

        sobraHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobraHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sobraHist5Label.setEnabled(false);

        try {
            sobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        sobraJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sobraJFT.setEnabled(false);

        fornecidaHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fornecidaHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fornecidaHist1Label.setEnabled(false);

        sobraHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobraHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sobraHist1Label.setEnabled(false);

        fornecidaHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fornecidaHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fornecidaHist2Label.setEnabled(false);

        sobraHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobraHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sobraHist2Label.setEnabled(false);

        fornecidaHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fornecidaHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fornecidaHist3Label.setEnabled(false);

        sobraHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sobraHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sobraHist3Label.setEnabled(false);

        idadeHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idadeHist1Label.setEnabled(false);

        idadeHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idadeHist2Label.setEnabled(false);

        idadeHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idadeHist3Label.setEnabled(false);

        idadeHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idadeHist4Label.setEnabled(false);

        idadeHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idadeHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        idadeHist5Label.setEnabled(false);

        try {
            idadeJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idadeJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idadeJFT.setEnabled(false);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Idade");

        ordemHist1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordemHist1Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ordemHist1Label.setEnabled(false);

        ordemHist2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordemHist2Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ordemHist2Label.setEnabled(false);

        ordemHist3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordemHist3Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ordemHist3Label.setEnabled(false);

        ordemHist4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordemHist4Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ordemHist4Label.setEnabled(false);

        ordemHist5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordemHist5Label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ordemHist5Label.setEnabled(false);

        try {
            ordemJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ordemJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ordemJFT.setEnabled(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ordem");

        controleRMEJP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        try {
            controleFornecidaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        controleFornecidaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        controleFornecidaJFT.setEnabled(false);
        controleFornecidaJFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleFornecidaJFTActionPerformed(evt);
            }
        });

        try {
            controleSobraJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        controleSobraJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        controleSobraJFT.setEnabled(false);
        controleSobraJFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleSobraJFTActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Controles");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Fornecida");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Sobra");

        javax.swing.GroupLayout controleRMEJP1Layout = new javax.swing.GroupLayout(controleRMEJP1);
        controleRMEJP1Layout.setHorizontalGroup(
        	controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(controleRMEJP1Layout.createSequentialGroup()
        			.addContainerGap(12, Short.MAX_VALUE)
        			.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel42, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
        				.addGroup(controleRMEJP1Layout.createSequentialGroup()
        					.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        						.addGroup(controleRMEJP1Layout.createSequentialGroup()
        							.addGap(6)
        							.addComponent(jLabel46, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel47, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        						.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))))
        			.addGap(0, 1, Short.MAX_VALUE))
        );
        controleRMEJP1Layout.setVerticalGroup(
        	controleRMEJP1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(controleRMEJP1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel42)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel46)
        				.addComponent(jLabel47))
        			.addGap(4)
        			.addGroup(controleRMEJP1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(controleFornecidaJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        				.addComponent(controleSobraJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addGap(14))
        );
        controleRMEJP1.setLayout(controleRMEJP1Layout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controleRMEJP1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ordemJFT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ordemHist5Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ordemHist4Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ordemHist3Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ordemHist2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ordemHist1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idadeJFT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idadeHist5Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadeHist4Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadeHist3Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadeHist2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idadeHist1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fornecidaHist1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fornecidaHist2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fornecidaHist5Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fornecidaHist3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fornecidaHist4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fornecidaJFT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sobraJFT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sobraHist5Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobraHist4Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobraHist3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobraHist2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sobraHist1Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fornecidaHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecidaHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecidaHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecidaHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecidaHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idadeHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idadeHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idadeHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idadeHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idadeHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idadeJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornecidaJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobraJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordemHist1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordemHist2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordemHist3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordemHist4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordemHist5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordemJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controleRMEJP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout consumoJPLayout = new javax.swing.GroupLayout(consumoJP);
        consumoJPLayout.setHorizontalGroup(
        	consumoJPLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(faseConsumoLabel, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        		.addGroup(consumoJPLayout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 247, Short.MAX_VALUE)
        			.addContainerGap())
        );
        consumoJPLayout.setVerticalGroup(
        	consumoJPLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(consumoJPLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(faseConsumoLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        consumoJP.setLayout(consumoJPLayout);

        registroLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registroLabel.setForeground(new java.awt.Color(0, 153, 255));
        registroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registroLabel.setText("Registro salvo com sucesso!!");
        
        registroLabel = new JLabel();
        registroLabel.setText("Registro salvo com sucesso!!");
        registroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registroLabel.setForeground(new Color(0, 153, 255));
        registroLabel.setFont(new Font("Tahoma", Font.BOLD, 11));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(registroLabel, GroupLayout.PREFERRED_SIZE, 1009, GroupLayout.PREFERRED_SIZE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(105)
        			.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
        		.addComponent(registroLabel, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(consumoJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(registroLabel)
        			.addGap(240)
        			.addComponent(registroLabel)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void controleSobraJFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleSobraJFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleSobraJFTActionPerformed

    private void controleFornecidaJFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleFornecidaJFTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleFornecidaJFTActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDesempenhoP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDesempenhoP().setVisible(true);
            }
        });
    }

    
    // End of variables declaration//GEN-END:variables
	public javax.swing.JFormattedTextField getControleFornecidaJFT() {
		return controleFornecidaJFT;
	}

	public void setControleFornecidaJFT(javax.swing.JFormattedTextField controleFornecidaJFT) {
		this.controleFornecidaJFT = controleFornecidaJFT;
	}

	public javax.swing.JPanel getControleRMEJP1() {
		return controleRMEJP1;
	}

	public void setControleRMEJP1(javax.swing.JPanel controleRMEJP1) {
		this.controleRMEJP1 = controleRMEJP1;
	}

	public javax.swing.JFormattedTextField getControleSobraJFT() {
		return controleSobraJFT;
	}

	public void setControleSobraJFT(javax.swing.JFormattedTextField controleSobraJFT) {
		this.controleSobraJFT = controleSobraJFT;
	}

	public javax.swing.JLabel getIdadeHist1Label() {
		return idadeHist1Label;
	}

	public void setIdadeHist1Label(javax.swing.JLabel idadeHist1Label) {
		this.idadeHist1Label = idadeHist1Label;
	}

	public javax.swing.JLabel getIdadeHist2Label() {
		return idadeHist2Label;
	}

	public void setIdadeHist2Label(javax.swing.JLabel idadeHist2Label) {
		this.idadeHist2Label = idadeHist2Label;
	}

	public javax.swing.JLabel getIdadeHist3Label() {
		return idadeHist3Label;
	}

	public void setIdadeHist3Label(javax.swing.JLabel idadeHist3Label) {
		this.idadeHist3Label = idadeHist3Label;
	}

	public javax.swing.JLabel getIdadeHist4Label() {
		return idadeHist4Label;
	}

	public void setIdadeHist4Label(javax.swing.JLabel idadeHist4Label) {
		this.idadeHist4Label = idadeHist4Label;
	}

	public javax.swing.JLabel getIdadeHist5Label() {
		return idadeHist5Label;
	}

	public void setIdadeHist5Label(javax.swing.JLabel idadeHist5Label) {
		this.idadeHist5Label = idadeHist5Label;
	}

	public javax.swing.JFormattedTextField getIdadeJFT() {
		return idadeJFT;
	}

	public void setIdadeJFT(javax.swing.JFormattedTextField idadeJFT) {
		this.idadeJFT = idadeJFT;
	}

	public javax.swing.JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(javax.swing.JLabel jLabel10) {
		this.jLabel10 = jLabel10;
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

	public javax.swing.JLabel getjLabel31() {
		return jLabel31;
	}

	public void setjLabel31(javax.swing.JLabel jLabel31) {
		this.jLabel31 = jLabel31;
	}

	public javax.swing.JLabel getjLabel32() {
		return jLabel32;
	}

	public void setjLabel32(javax.swing.JLabel jLabel32) {
		this.jLabel32 = jLabel32;
	}

	public javax.swing.JLabel getjLabel33() {
		return jLabel33;
	}

	public void setjLabel33(javax.swing.JLabel jLabel33) {
		this.jLabel33 = jLabel33;
	}

	public javax.swing.JLabel getjLabel34() {
		return jLabel34;
	}

	public void setjLabel34(javax.swing.JLabel jLabel34) {
		this.jLabel34 = jLabel34;
	}

	public javax.swing.JLabel getjLabel35() {
		return jLabel35;
	}

	public void setjLabel35(javax.swing.JLabel jLabel35) {
		this.jLabel35 = jLabel35;
	}

	public javax.swing.JLabel getjLabel36() {
		return jLabel36;
	}

	public void setjLabel36(javax.swing.JLabel jLabel36) {
		this.jLabel36 = jLabel36;
	}

	public javax.swing.JLabel getjLabel42() {
		return jLabel42;
	}

	public void setjLabel42(javax.swing.JLabel jLabel42) {
		this.jLabel42 = jLabel42;
	}

	public javax.swing.JLabel getjLabel44() {
		return jLabel44;
	}

	public void setjLabel44(javax.swing.JLabel jLabel44) {
		this.jLabel44 = jLabel44;
	}

	public javax.swing.JLabel getjLabel45() {
		return jLabel45;
	}

	public void setjLabel45(javax.swing.JLabel jLabel45) {
		this.jLabel45 = jLabel45;
	}

	public javax.swing.JLabel getjLabel46() {
		return jLabel46;
	}

	public void setjLabel46(javax.swing.JLabel jLabel46) {
		this.jLabel46 = jLabel46;
	}

	public javax.swing.JLabel getjLabel47() {
		return jLabel47;
	}

	public void setjLabel47(javax.swing.JLabel jLabel47) {
		this.jLabel47 = jLabel47;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(javax.swing.JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public javax.swing.JLabel getjLabel9() {
		return jLabel9;
	}

	public void setjLabel9(javax.swing.JLabel jLabel9) {
		this.jLabel9 = jLabel9;
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

	public javax.swing.JLabel getOrdemHist1Label() {
		return ordemHist1Label;
	}

	public void setOrdemHist1Label(javax.swing.JLabel ordemHist1Label) {
		this.ordemHist1Label = ordemHist1Label;
	}

	public javax.swing.JLabel getOrdemHist2Label() {
		return ordemHist2Label;
	}

	public void setOrdemHist2Label(javax.swing.JLabel ordemHist2Label) {
		this.ordemHist2Label = ordemHist2Label;
	}

	public javax.swing.JLabel getOrdemHist3Label() {
		return ordemHist3Label;
	}

	public void setOrdemHist3Label(javax.swing.JLabel ordemHist3Label) {
		this.ordemHist3Label = ordemHist3Label;
	}

	public javax.swing.JLabel getOrdemHist4Label() {
		return ordemHist4Label;
	}

	public void setOrdemHist4Label(javax.swing.JLabel ordemHist4Label) {
		this.ordemHist4Label = ordemHist4Label;
	}

	public javax.swing.JLabel getOrdemHist5Label() {
		return ordemHist5Label;
	}

	public void setOrdemHist5Label(javax.swing.JLabel ordemHist5Label) {
		this.ordemHist5Label = ordemHist5Label;
	}

	public javax.swing.JFormattedTextField getOrdemJFT() {
		return ordemJFT;
	}

	public void setOrdemJFT(javax.swing.JFormattedTextField ordemJFT) {
		this.ordemJFT = ordemJFT;
	}

	public void setAvesAlojadasJFT(javax.swing.JFormattedTextField avesAlojadasJFT) {
		this.avesAlojadasJFT = avesAlojadasJFT;
	}

	public void setAviarioJFT(javax.swing.JFormattedTextField aviarioJFT) {
		this.aviarioJFT = aviarioJFT;
	}

	public void setBaiaJFT(javax.swing.JFormattedTextField baiaJFT) {
		this.baiaJFT = baiaJFT;
	}

	public void setBaiaJP(javax.swing.JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	public void setConsumoJP(javax.swing.JPanel consumoJP) {
		this.consumoJP = consumoJP;
	}

	public void setControleBaiaJFT(javax.swing.JFormattedTextField controleBaiaJFT) {
		this.controleBaiaJFT = controleBaiaJFT;
	}

	public void setFaseConsumoLabel(javax.swing.JLabel faseConsumoLabel) {
		this.faseConsumoLabel = faseConsumoLabel;
	}

	public void setFornecidaHist1Label(javax.swing.JLabel fornecidaHist1Label) {
		this.fornecidaHist1Label = fornecidaHist1Label;
	}

	public void setFornecidaHist2Label(javax.swing.JLabel fornecidaHist2Label) {
		this.fornecidaHist2Label = fornecidaHist2Label;
	}

	public void setFornecidaHist3Label(javax.swing.JLabel fornecidaHist3Label) {
		this.fornecidaHist3Label = fornecidaHist3Label;
	}

	public void setFornecidaHist4Label(javax.swing.JLabel fornecidaHist4Label) {
		this.fornecidaHist4Label = fornecidaHist4Label;
	}

	public void setFornecidaHist5Label(javax.swing.JLabel fornecidaHist5Label) {
		this.fornecidaHist5Label = fornecidaHist5Label;
	}

	public void setFornecidaJFT(javax.swing.JFormattedTextField fornecidaJFT) {
		this.fornecidaJFT = fornecidaJFT;
	}

	public void setLadoJFT(javax.swing.JFormattedTextField ladoJFT) {
		this.ladoJFT = ladoJFT;
	}

	public void setLinhagemJFT(javax.swing.JFormattedTextField linhagemJFT) {
		this.linhagemJFT = linhagemJFT;
	}

	public void setRegistroLabel(javax.swing.JLabel registroLabel) {
		this.registroLabel = registroLabel;
	}

	public void setSexoJFT(javax.swing.JFormattedTextField sexoJFT) {
		this.sexoJFT = sexoJFT;
	}

	public void setSobraHist1Label(javax.swing.JLabel sobraHist1Label) {
		this.sobraHist1Label = sobraHist1Label;
	}

	public void setSobraHist2Label(javax.swing.JLabel sobraHist2Label) {
		this.sobraHist2Label = sobraHist2Label;
	}

	public void setSobraHist3Label(javax.swing.JLabel sobraHist3Label) {
		this.sobraHist3Label = sobraHist3Label;
	}

	public void setSobraHist4Label(javax.swing.JLabel sobraHist4Label) {
		this.sobraHist4Label = sobraHist4Label;
	}

	public void setSobraHist5Label(javax.swing.JLabel sobraHist5Label) {
		this.sobraHist5Label = sobraHist5Label;
	}

	public void setSobraJFT(javax.swing.JFormattedTextField sobraJFT) {
		this.sobraJFT = sobraJFT;
	}

	public void setTrataJFT(javax.swing.JFormattedTextField trataJFT) {
		this.trataJFT = trataJFT;
	}
	
	public ViewDesempenhoP() {
        initComponents();
    }

    public JFormattedTextField getAvesAlojadasJFT() {
        return avesAlojadasJFT;
    }

    public JFormattedTextField getAviarioJFT() {
        return aviarioJFT;
    }

    public JFormattedTextField getBaiaJFT() {
        return baiaJFT;
    }

    public JPanel getBaiaJP() {
        return baiaJP;
    }

    public JPanel getConsumoJP() {
        return consumoJP;
    }

    public JFormattedTextField getControleBaiaJFT() {
        return controleBaiaJFT;
    }
    
    public JLabel getFaseConsumoLabel() {
        return faseConsumoLabel;
    }

    public JLabel getFornecidaHist1Label() {
        return fornecidaHist1Label;
    }

    public JLabel getFornecidaHist2Label() {
        return fornecidaHist2Label;
    }

    public JLabel getFornecidaHist3Label() {
        return fornecidaHist3Label;
    }

    public JLabel getFornecidaHist4Label() {
        return fornecidaHist4Label;
    }

    public JLabel getFornecidaHist5Label() {
        return fornecidaHist5Label;
    }

    public JFormattedTextField getFornecidaJFT() {
        return fornecidaJFT;
    }

    public JFormattedTextField getLadoJFT() {
        return ladoJFT;
    }

    public JFormattedTextField getLinhagemJFT() {
        return linhagemJFT;
    }

        public JLabel getRegistroLabel() {
        return registroLabel;
    }

    public JFormattedTextField getSexoJFT() {
        return sexoJFT;
    }

    public JLabel getSobraHist1Label() {
        return sobraHist1Label;
    }

    public JLabel getSobraHist2Label() {
        return sobraHist2Label;
    }

    public JLabel getSobraHist3Label() {
        return sobraHist3Label;
    }

    public JLabel getSobraHist4Label() {
        return sobraHist4Label;
    }

    public JLabel getSobraHist5Label() {
        return sobraHist5Label;
    }

    public JFormattedTextField getSobraJFT() {
        return sobraJFT;
    }

    public JFormattedTextField getTrataJFT() {
        return trataJFT;
    }

	public JLabel getregistroLabel() {
		return registroLabel;
	}

	public void setregistroLabel(JLabel registroLabel) {
		this.registroLabel = registroLabel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
