package brf.frigoaves.view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

public class ViewPlataformaAves extends javax.swing.JFrame {

	/**
	 * Creates new form ViewImportarBalanca
	 */
	public ViewPlataformaAves() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		baiaJP = new javax.swing.JPanel();
		jLabel44 = new javax.swing.JLabel();
		dataJFT = new javax.swing.JFormattedTextField();
		dataJFT.setEnabled(false);
		jLabel45 = new javax.swing.JLabel();
		nomeJFT = new javax.swing.JFormattedTextField();
		nomeJFT.setEnabled(false);
		jLabel46 = new javax.swing.JLabel();
		contratoJFT = new javax.swing.JFormattedTextField();
		contratoJFT.setEnabled(false);
		jLabel47 = new javax.swing.JLabel();
		instalJFT = new javax.swing.JFormattedTextField();
		instalJFT.setEnabled(false);
		jLabel48 = new javax.swing.JLabel();
		cargaJFT = new javax.swing.JFormattedTextField();
		cargaJFT.setEnabled(false);
		jLabel49 = new javax.swing.JLabel();
		horaIniJFT = new javax.swing.JFormattedTextField();
		horaIniJFT.setEnabled(false);
		jLabel52 = new javax.swing.JLabel();
		horaFinJFT = new javax.swing.JFormattedTextField();
		horaFinJFT.setEnabled(false);
		registrosLabel = new javax.swing.JLabel();
		pnlPlataforma = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		numeroJFT3 = new javax.swing.JFormattedTextField();
		jLabel29 = new javax.swing.JLabel();
		controleJFT = new javax.swing.JFormattedTextField();
		jLabel35 = new javax.swing.JLabel();
		pesoJFT3 = new javax.swing.JFormattedTextField();
		numeroJFT4 = new javax.swing.JFormattedTextField();
		pesoJFT4 = new javax.swing.JFormattedTextField();
		numeroJFT5 = new javax.swing.JFormattedTextField();
		pesoJFT5 = new javax.swing.JFormattedTextField();
		numeroJFT2 = new javax.swing.JFormattedTextField();
		pesoJFT2 = new javax.swing.JFormattedTextField();
		pesoJFT1 = new javax.swing.JFormattedTextField();
		numeroJFT1 = new javax.swing.JFormattedTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		baiaJP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel44.setText("Data");
		try {
			dataJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		dataJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		dataJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dataJFTActionPerformed(evt);
			}
		});

		jLabel45.setText("Nome");
		nomeJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nomeJFTActionPerformed(evt);
			}
		});

		jLabel46.setText("Contrato");
		try {
			contratoJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		contratoJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		contratoJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				contratoJFTActionPerformed(evt);
			}
		});

		jLabel47.setText("Instal");
		try {
			instalJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		instalJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		instalJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				instalJFTActionPerformed(evt);
			}
		});

		jLabel48.setText("Carga");
		try {
			cargaJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		cargaJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		cargaJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cargaJFTActionPerformed(evt);
			}
		});

		jLabel49.setText("Hora Inicial");
		try {
			horaIniJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		horaIniJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		horaIniJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				horaIniJFTActionPerformed(evt);
			}
		});

		jLabel52.setText("Hora Final");
		try {
			horaFinJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		horaFinJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		horaFinJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				horaFinJFTActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout baiaJPLayout = new javax.swing.GroupLayout(baiaJP);
		baiaJP.setLayout(baiaJPLayout);
		baiaJPLayout.setHorizontalGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(baiaJPLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(baiaJPLayout.createSequentialGroup().addComponent(jLabel44)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(dataJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel45)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(nomeJFT))
						.addGroup(baiaJPLayout.createSequentialGroup().addComponent(jLabel46)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(contratoJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel47)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(instalJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel48)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(cargaJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(baiaJPLayout.createSequentialGroup().addComponent(jLabel49)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(horaIniJFT, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel52)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(horaFinJFT,
										javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		baiaJPLayout.setVerticalGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(baiaJPLayout.createSequentialGroup().addContainerGap()
						.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel44)
								.addComponent(dataJFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel45).addComponent(nomeJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel46)
										.addComponent(contratoJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel47)
										.addComponent(instalJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel48).addComponent(cargaJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel52).addComponent(horaFinJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(baiaJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel49).addComponent(horaIniJFT, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		registrosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		registrosLabel.setForeground(new java.awt.Color(0, 153, 255));
		registrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		registrosLabel.setText("Registros salvos com sucesso!!");

		pnlPlataforma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Plataforma");

		jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel28.setText("PESO");

		try {
			numeroJFT3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numeroJFT3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numeroJFT3.setEnabled(false);

		jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel29.setText("NUMERO");

		try {
			controleJFT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		controleJFT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		controleJFT.setEnabled(false);
		controleJFT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controleJFTActionPerformed(evt);
			}
		});

		jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel35.setText("Controle");

		try {
			pesoJFT3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT3.setEnabled(false);

		try {
			numeroJFT4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numeroJFT4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numeroJFT4.setEnabled(false);

		try {
			pesoJFT4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT4.setEnabled(false);

		try {
			numeroJFT5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numeroJFT5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numeroJFT5.setEnabled(false);

		try {
			pesoJFT5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT5.setEnabled(false);

		try {
			numeroJFT2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numeroJFT2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numeroJFT2.setEnabled(false);

		try {
			pesoJFT2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT2.setEnabled(false);

		try {
			pesoJFT1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		pesoJFT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		pesoJFT1.setEnabled(false);

		try {
			numeroJFT1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		numeroJFT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		numeroJFT1.setEnabled(false);

		javax.swing.GroupLayout pnlPlataformaLayout = new javax.swing.GroupLayout(pnlPlataforma);
		pnlPlataformaLayout.setHorizontalGroup(pnlPlataformaLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
				.addGroup(pnlPlataformaLayout.createSequentialGroup().addContainerGap().addGroup(pnlPlataformaLayout
						.createParallelGroup(Alignment.LEADING)
						.addComponent(numeroJFT1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(numeroJFT2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(pnlPlataformaLayout.createSequentialGroup().addGroup(pnlPlataformaLayout
								.createParallelGroup(Alignment.LEADING).addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(numeroJFT4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE).addComponent(
												numeroJFT3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addComponent(numeroJFT5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(jLabel28, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
												.addComponent(pesoJFT2, Alignment.LEADING).addComponent(pesoJFT1, Alignment.LEADING))
										.addGroup(pnlPlataformaLayout.createSequentialGroup()
												.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(pesoJFT3, Alignment.LEADING).addComponent(pesoJFT4)
														.addComponent(pesoJFT5, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
												.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(controleJFT, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 88,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel35, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
																GroupLayout.PREFERRED_SIZE))))))
						.addGap(74)));
		pnlPlataformaLayout.setVerticalGroup(pnlPlataformaLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(pnlPlataformaLayout.createSequentialGroup().addContainerGap().addComponent(jLabel7)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel29).addComponent(jLabel28))
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(numeroJFT1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(numeroJFT2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(numeroJFT3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(numeroJFT4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE).addComponent(jLabel35)
								.addComponent(pesoJFT4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(pnlPlataformaLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(controleJFT, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(numeroJFT5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoJFT5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		pnlPlataforma.setLayout(pnlPlataformaLayout);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(pnlPlataforma, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(205, Short.MAX_VALUE))
						.addComponent(registrosLabel, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addComponent(baiaJP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlPlataforma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(registrosLabel).addContainerGap()));
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void dataJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dataJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_dataJFTActionPerformed

	private void controleJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_controleJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_controleJFTActionPerformed

	private void nomeJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nomeJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_nomeJFTActionPerformed

	private void contratoJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_contratoJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_contratoJFTActionPerformed

	private void instalJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_instalJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_instalJFTActionPerformed

	private void cargaJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cargaJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cargaJFTActionPerformed

	private void horaIniJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_horaIniJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_horaIniJFTActionPerformed

	private void horaFinJFTActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_horaFinJFTActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_horaFinJFTActionPerformed

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
			java.util.logging.Logger.getLogger(ViewPlataformaAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ViewPlataformaAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ViewPlataformaAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ViewPlataformaAves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
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
				new ViewPlataformaAves().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel baiaJP;
	private javax.swing.JFormattedTextField cargaJFT;
	private javax.swing.JFormattedTextField contratoJFT;
	private javax.swing.JFormattedTextField controleJFT;
	private javax.swing.JFormattedTextField dataJFT;
	private javax.swing.JFormattedTextField horaFinJFT;
	private javax.swing.JFormattedTextField horaIniJFT;
	private javax.swing.JFormattedTextField instalJFT;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JFormattedTextField nomeJFT;
	private javax.swing.JFormattedTextField numeroJFT1;
	private javax.swing.JFormattedTextField numeroJFT2;
	private javax.swing.JFormattedTextField numeroJFT3;
	private javax.swing.JFormattedTextField numeroJFT4;
	private javax.swing.JFormattedTextField numeroJFT5;
	private javax.swing.JFormattedTextField pesoJFT1;
	private javax.swing.JFormattedTextField pesoJFT2;
	private javax.swing.JFormattedTextField pesoJFT3;
	private javax.swing.JFormattedTextField pesoJFT4;
	private javax.swing.JFormattedTextField pesoJFT5;
	private javax.swing.JPanel pnlPlataforma;
	private javax.swing.JLabel registrosLabel;
	// End of variables declaration//GEN-END:variables

	/**
	 * @return the baiaJP
	 */
	public javax.swing.JPanel getBaiaJP() {
		return baiaJP;
	}

	/**
	 * @param baiaJP the baiaJP to set
	 */
	public void setBaiaJP(javax.swing.JPanel baiaJP) {
		this.baiaJP = baiaJP;
	}

	/**
	 * @return the cargaJFT
	 */
	public javax.swing.JFormattedTextField getCargaJFT() {
		return cargaJFT;
	}

	/**
	 * @param cargaJFT the cargaJFT to set
	 */
	public void setCargaJFT(javax.swing.JFormattedTextField cargaJFT) {
		this.cargaJFT = cargaJFT;
	}

	/**
	 * @return the contratoJFT
	 */
	public javax.swing.JFormattedTextField getContratoJFT() {
		return contratoJFT;
	}

	/**
	 * @param contratoJFT the contratoJFT to set
	 */
	public void setContratoJFT(javax.swing.JFormattedTextField contratoJFT) {
		this.contratoJFT = contratoJFT;
	}

	/**
	 * @return the controleJFT
	 */
	public javax.swing.JFormattedTextField getControleJFT() {
		return controleJFT;
	}

	/**
	 * @param controleJFT the controleJFT to set
	 */
	public void setControleJFT(javax.swing.JFormattedTextField controleJFT) {
		this.controleJFT = controleJFT;
	}

	/**
	 * @return the dataJFT
	 */
	public javax.swing.JFormattedTextField getDataJFT() {
		return dataJFT;
	}

	/**
	 * @param dataJFT the dataJFT to set
	 */
	public void setDataJFT(javax.swing.JFormattedTextField dataJFT) {
		this.dataJFT = dataJFT;
	}

	/**
	 * @return the horaFinJFT
	 */
	public javax.swing.JFormattedTextField getHoraFinJFT() {
		return horaFinJFT;
	}

	/**
	 * @param horaFinJFT the horaFinJFT to set
	 */
	public void setHoraFinJFT(javax.swing.JFormattedTextField horaFinJFT) {
		this.horaFinJFT = horaFinJFT;
	}

	/**
	 * @return the horaIniJFT
	 */
	public javax.swing.JFormattedTextField getHoraIniJFT() {
		return horaIniJFT;
	}

	/**
	 * @param horaIniJFT the horaIniJFT to set
	 */
	public void setHoraIniJFT(javax.swing.JFormattedTextField horaIniJFT) {
		this.horaIniJFT = horaIniJFT;
	}

	/**
	 * @return the instalJFT
	 */
	public javax.swing.JFormattedTextField getInstalJFT() {
		return instalJFT;
	}

	/**
	 * @param instalJFT the instalJFT to set
	 */
	public void setInstalJFT(javax.swing.JFormattedTextField instalJFT) {
		this.instalJFT = instalJFT;
	}

	public javax.swing.JLabel getjLabel28() {
		return jLabel28;
	}

	/**
	 * @param jLabel28 the jLabel28 to set
	 */
	public void setjLabel28(javax.swing.JLabel jLabel28) {
		this.jLabel28 = jLabel28;
	}

	/**
	 * @return the jLabel29
	 */
	public javax.swing.JLabel getjLabel29() {
		return jLabel29;
	}

	/**
	 * @param jLabel29 the jLabel29 to set
	 */
	public void setjLabel29(javax.swing.JLabel jLabel29) {
		this.jLabel29 = jLabel29;
	}

	/**
	 * @return the jLabel35
	 */
	public javax.swing.JLabel getjLabel35() {
		return jLabel35;
	}

	/**
	 * @param jLabel35 the jLabel35 to set
	 */
	public void setjLabel35(javax.swing.JLabel jLabel35) {
		this.jLabel35 = jLabel35;
	}

	/**
	 * @return the jLabel44
	 */
	public javax.swing.JLabel getjLabel44() {
		return jLabel44;
	}

	/**
	 * @param jLabel44 the jLabel44 to set
	 */
	public void setjLabel44(javax.swing.JLabel jLabel44) {
		this.jLabel44 = jLabel44;
	}

	/**
	 * @return the jLabel45
	 */
	public javax.swing.JLabel getjLabel45() {
		return jLabel45;
	}

	/**
	 * @param jLabel45 the jLabel45 to set
	 */
	public void setjLabel45(javax.swing.JLabel jLabel45) {
		this.jLabel45 = jLabel45;
	}

	/**
	 * @return the jLabel46
	 */
	public javax.swing.JLabel getjLabel46() {
		return jLabel46;
	}

	/**
	 * @param jLabel46 the jLabel46 to set
	 */
	public void setjLabel46(javax.swing.JLabel jLabel46) {
		this.jLabel46 = jLabel46;
	}

	/**
	 * @return the jLabel47
	 */
	public javax.swing.JLabel getjLabel47() {
		return jLabel47;
	}

	/**
	 * @param jLabel47 the jLabel47 to set
	 */
	public void setjLabel47(javax.swing.JLabel jLabel47) {
		this.jLabel47 = jLabel47;
	}

	/**
	 * @return the jLabel48
	 */
	public javax.swing.JLabel getjLabel48() {
		return jLabel48;
	}

	/**
	 * @param jLabel48 the jLabel48 to set
	 */
	public void setjLabel48(javax.swing.JLabel jLabel48) {
		this.jLabel48 = jLabel48;
	}

	/**
	 * @return the jLabel49
	 */
	public javax.swing.JLabel getjLabel49() {
		return jLabel49;
	}

	/**
	 * @param jLabel49 the jLabel49 to set
	 */
	public void setjLabel49(javax.swing.JLabel jLabel49) {
		this.jLabel49 = jLabel49;
	}

	/**
	 * @return the jLabel52
	 */
	public javax.swing.JLabel getjLabel52() {
		return jLabel52;
	}

	/**
	 * @param jLabel52 the jLabel52 to set
	 */
	public void setjLabel52(javax.swing.JLabel jLabel52) {
		this.jLabel52 = jLabel52;
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
	 * @return the jPanel2
	 */
	public javax.swing.JPanel getjPanel2() {
		return jPanel2;
	}

	/**
	 * @param jPanel2 the jPanel2 to set
	 */
	public void setjPanel2(javax.swing.JPanel jPanel2) {
		this.jPanel2 = jPanel2;
	}

	/**
	 * @return the nomeJFT
	 */
	public javax.swing.JFormattedTextField getNomeJFT() {
		return nomeJFT;
	}

	/**
	 * @param nomeJFT the nomeJFT to set
	 */
	public void setNomeJFT(javax.swing.JFormattedTextField nomeJFT) {
		this.nomeJFT = nomeJFT;
	}

	/**
	 * @return the numeroJFT1
	 */
	public javax.swing.JFormattedTextField getNumeroJFT1() {
		return numeroJFT1;
	}

	/**
	 * @param numeroJFT1 the numeroJFT1 to set
	 */
	public void setNumeroJFT1(javax.swing.JFormattedTextField numeroJFT1) {
		this.numeroJFT1 = numeroJFT1;
	}

	/**
	 * @return the numeroJFT2
	 */
	public javax.swing.JFormattedTextField getNumeroJFT2() {
		return numeroJFT2;
	}

	/**
	 * @param numeroJFT2 the numeroJFT2 to set
	 */
	public void setNumeroJFT2(javax.swing.JFormattedTextField numeroJFT2) {
		this.numeroJFT2 = numeroJFT2;
	}

	/**
	 * @return the numeroJFT3
	 */
	public javax.swing.JFormattedTextField getNumeroJFT3() {
		return numeroJFT3;
	}

	/**
	 * @param numeroJFT3 the numeroJFT3 to set
	 */
	public void setNumeroJFT3(javax.swing.JFormattedTextField numeroJFT3) {
		this.numeroJFT3 = numeroJFT3;
	}

	/**
	 * @return the numeroJFT4
	 */
	public javax.swing.JFormattedTextField getNumeroJFT4() {
		return numeroJFT4;
	}

	/**
	 * @param numeroJFT4 the numeroJFT4 to set
	 */
	public void setNumeroJFT4(javax.swing.JFormattedTextField numeroJFT4) {
		this.numeroJFT4 = numeroJFT4;
	}

	/**
	 * @return the numeroJFT5
	 */
	public javax.swing.JFormattedTextField getNumeroJFT5() {
		return numeroJFT5;
	}

	/**
	 * @param numeroJFT5 the numeroJFT5 to set
	 */
	public void setNumeroJFT5(javax.swing.JFormattedTextField numeroJFT5) {
		this.numeroJFT5 = numeroJFT5;
	}

	/**
	 * @return the pesoJFT1
	 */
	public javax.swing.JFormattedTextField getPesoJFT1() {
		return pesoJFT1;
	}

	/**
	 * @param pesoJFT1 the pesoJFT1 to set
	 */
	public void setPesoJFT1(javax.swing.JFormattedTextField pesoJFT1) {
		this.pesoJFT1 = pesoJFT1;
	}

	/**
	 * @return the pesoJFT2
	 */
	public javax.swing.JFormattedTextField getPesoJFT2() {
		return pesoJFT2;
	}

	/**
	 * @param pesoJFT2 the pesoJFT2 to set
	 */
	public void setPesoJFT2(javax.swing.JFormattedTextField pesoJFT2) {
		this.pesoJFT2 = pesoJFT2;
	}

	/**
	 * @return the pesoJFT3
	 */
	public javax.swing.JFormattedTextField getPesoJFT3() {
		return pesoJFT3;
	}

	/**
	 * @param pesoJFT3 the pesoJFT3 to set
	 */
	public void setPesoJFT3(javax.swing.JFormattedTextField pesoJFT3) {
		this.pesoJFT3 = pesoJFT3;
	}

	/**
	 * @return the pesoJFT4
	 */
	public javax.swing.JFormattedTextField getPesoJFT4() {
		return pesoJFT4;
	}

	/**
	 * @param pesoJFT4 the pesoJFT4 to set
	 */
	public void setPesoJFT4(javax.swing.JFormattedTextField pesoJFT4) {
		this.pesoJFT4 = pesoJFT4;
	}

	/**
	 * @return the pesoJFT5
	 */
	public javax.swing.JFormattedTextField getPesoJFT5() {
		return pesoJFT5;
	}

	/**
	 * @param pesoJFT5 the pesoJFT5 to set
	 */
	public void setPesoJFT5(javax.swing.JFormattedTextField pesoJFT5) {
		this.pesoJFT5 = pesoJFT5;
	}

	/**
	 * @return the pnlPlataforma
	 */
	public javax.swing.JPanel getPnlPlataforma() {
		return pnlPlataforma;
	}

	/**
	 * @param pnlPlataforma the pnlPlataforma to set
	 */
	public void setPnlPlataforma(javax.swing.JPanel pnlPlataforma) {
		this.pnlPlataforma = pnlPlataforma;
	}

	/**
	 * @return the registrosLabel
	 */
	public javax.swing.JLabel getRegistrosLabel() {
		return registrosLabel;
	}

	/**
	 * @param registrosLabel the registrosLabel to set
	 */
	public void setRegistrosLabel(javax.swing.JLabel registrosLabel) {
		this.registrosLabel = registrosLabel;
	}

}
