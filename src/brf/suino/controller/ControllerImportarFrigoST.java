package brf.suino.controller;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import brf.suino.model.dao.ModelStateDAOST;
import brf.suino.model.vo.FrigorificoVOST;
import brf.suino.view.ViewImportarFrigoST;
import brf.util.SystemFileFilter;
import brf.util.SystemFileView;
import brf.util.Utils;

public class ControllerImportarFrigoST extends KeyAdapter implements ItemListener {
	private final ControllerST controller;
	private ViewImportarFrigoST view;
	private ModelStateDAOST dao;
	private List<String> datasFases;

	public String[] colunasFrigo = { "BRINCO", "PESOINIC", "BAIA", "SEXO", "COMEDOURO", "TRAT1", "BLOCO", "DATA1", "PESO1", "DATA2", "PESO",
			"TATUAGEM", "DATAABA", "ABATE", "ETPAQUIM", "PLPAQUIM", "GIM", "PERPESO", "PERPELGO", "PERPEGOF", "PERPEGOM", "PEROSSTE",
			"PERMUSC", "PERPE", "PERCJPCS", "PERPH24", "PERDINI", "PERDFIN", "PALPESO", "PALPELGO", "PALPEGOF", "PALPEGOM", "PALOSSTE",
			"PALCAMA", "PALCMSP", "COSPESO", "COSOSSTE", "COSPELGO", "COSLOMBO", "COSRETA", "COSPH24", "COSCJPCS", "BARPESO", "BARCPTPF",
			"BARPRONT", "BARESGOR", "PALLECA" };

	public ControllerImportarFrigoST(ControllerST c) {
		this.controller = c;
		this.dao = controller.getModel().getModelStateDAO();
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		view = new ViewImportarFrigoST();
		view.setTitle("DIGEX - Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().addKeyListener(this);

		histSetup();
	}

	public void histSetup() {
		if (controller.getModel().getExperimentoVO().getFrigorificoVOST().size() == 0) {
			view.getPcrLabel().setForeground(Color.GRAY);
			view.getBarrigaLabel().setForeground(Color.GRAY);
			view.getCostadoLabel().setForeground(Color.GRAY);
			view.getPernilLabel().setForeground(Color.GRAY);
			view.getPaletaLabel().setForeground(Color.GRAY);
		} else {
			view.getRegistrosImportadosLabel()
					.setText(controller.getModel().getExperimentoVO().getFrigorificoVOST().size() + " registro(s) importado(s)");
		}
	}

	public void resumeWindow() {
		view.setLocationRelativeTo(null);
		view.setVisible(true);
//		view.getOpcaoJFT().setText("");
//		view.getOpcaoJFT().grabFocus();
		histSetup();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(view, "Deseja realmente sair do programa?", "DIGEX - Sair", JOptionPane.YES_NO_OPTION,
					JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela de escolha de experimento?",
					"DIGEX - Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigST ce = new ControllerEscolhaDigST(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			if (controller.getModel().getExperimentoVO().getFrigorificoVOST().size() != 0) {
				int options = JOptionPane.showConfirmDialog(view, "Arquivo já carregado:\n" + "Deseja sobrescrever o arquivo anterior?",
						"DIGEX - Aviso", JOptionPane.ERROR_MESSAGE);
				if (options == 0) {
					controller.getModel().getExperimentoVO().setFrigorificoVOST(new ArrayList<FrigorificoVOST>());
					carregarFrigo();
				}
			} else {
				carregarFrigo();
			}
			break;
		case KeyEvent.VK_2:
			view.setVisible(false);
			ControllerPCRST pcr = new ControllerPCRST(controller);
			pcr.openWindow(datasFases);
			break;
		case KeyEvent.VK_3:
			view.setVisible(false);
			ControllerPernilST pernil = new ControllerPernilST(controller);
			pernil.openWindow(datasFases);
			break;
		case KeyEvent.VK_4:
			view.setVisible(false);
			ControllerPaletaST paleta = new ControllerPaletaST(controller);
			paleta.openWindow(datasFases);
			break;
		case KeyEvent.VK_5:
			view.setVisible(false);
			ControllerCostadoST costado = new ControllerCostadoST(controller);
			costado.openWindow(datasFases);
			break;
		case KeyEvent.VK_6:
			view.setVisible(false);
			ControllerBarrigaST barriga = new ControllerBarrigaST(controller);
			barriga.openWindow(datasFases);
			break;
		}
	}

	private void carregarFrigo() {
		view.setVisible(false);
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.addChoosableFileFilter(new SystemFileFilter());
		fileChooser.setFileView(new SystemFileView());
		int returnVal = fileChooser.showDialog(view, "Abrir");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			BufferedReader csvReader;
			try {
				csvReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
				String row = "";
				boolean key = true;
				while ((row = csvReader.readLine()) != null) {
					String[] data = row.split(";");
					if (key) {
						for (int z = 0; z < data.length; z++) {
							if (!data[z].equals(colunasFrigo[z])) {
								String msg = "Problema(s) na estrutura do arquivo .csv. \nVerifique o arquivo e tente novamente.";
								JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
								break;
							}
						}
						key = false;
					} else {
						System.out.println("");
						for (int x = 0; x < data.length; x++) {
							if (data[x].equals("")) {
								data[x] = "0";
							}
						}
						controller.getModel().getExperimentoVO().getFrigorificoVOST()
								.add(new FrigorificoVOST(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]),
										data[3], data[4], Integer.parseInt(data[5]), data[6], Utils.dateFromString(data[7]),
										Integer.parseInt(data[8]), Utils.dateFromString(data[9]), Integer.parseInt(data[10]),
										Integer.parseInt(data[11]), Utils.dateFromString(data[12]), Integer.parseInt(data[13]),
										Integer.parseInt(data[14]), Integer.parseInt(data[15]), Integer.parseInt(data[16]),
										Integer.parseInt(data[17]), Integer.parseInt(data[18]), Integer.parseInt(data[19]),
										Integer.parseInt(data[20]), Integer.parseInt(data[21]), Integer.parseInt(data[22]),
										Integer.parseInt(data[23]), Integer.parseInt(data[24]), Integer.parseInt(data[25]),
										Integer.parseInt(data[26]), Integer.parseInt(data[27]), Integer.parseInt(data[28]),
										Integer.parseInt(data[29]), Integer.parseInt(data[30]), Integer.parseInt(data[31]),
										Integer.parseInt(data[32]), Integer.parseInt(data[33]), Integer.parseInt(data[34]),
										Integer.parseInt(data[35]), Integer.parseInt(data[36]), Integer.parseInt(data[37]),
										Integer.parseInt(data[38]), Integer.parseInt(data[39]), Integer.parseInt(data[40]),
										Integer.parseInt(data[41]), Integer.parseInt(data[42]), Integer.parseInt(data[43]),
										Integer.parseInt(data[44]), Integer.parseInt(data[45]), Integer.parseInt(data[46])));
					}
				}
				csvReader.close();
				controller.getModel().getModelStateDAO().saveModelState(false);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else {
			view.setVisible(true);
		}
		fileChooser.setSelectedFile(null);
		openWindow(datasFases);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

}
