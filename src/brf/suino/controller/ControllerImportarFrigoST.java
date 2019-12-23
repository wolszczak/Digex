package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import brf.suino.model.dao.ModelStateDAOST;
import brf.suino.view.ViewImportarFrigoST;
import brf.util.SystemFileFilter;
import brf.util.SystemFileView;

public class ControllerImportarFrigoST extends KeyAdapter {
	private final ControllerST controller;
	private ViewImportarFrigoST view;
	private ModelStateDAOST dao;
	private List<String> datasFases;

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

		histSetup();

	}

	public void histSetup() {
		if (controller.getModel().getExperimentoVO().getFrigorificoVOST().size() == 0) {
			view.getRegistrosImportadosLabel().setForeground(Color.GRAY);
		} else {
			view.getRegistrosImportadosLabel()
					.setText(controller.getModel().getExperimentoVO().getFrigorificoVOST().size() + " registro(s) importado(s)");
		}
	}

	public void resumeWindow() {
		histSetup();
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
			view.setVisible(false);
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new SystemFileFilter());
			fileChooser.setFileView(new SystemFileView());
			fileChooser.setAcceptAllFileFilterUsed(false);
			int returnVal = fileChooser.showDialog(view, "Abrir");

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();

				BufferedReader csvReader;
				try {
					csvReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
					String row = "";
					while ((row = csvReader.readLine()) != null) {
						String[] data = row.split(",");
						
						
						
					}
					csvReader.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else {
				view.setVisible(true);
			}
			fileChooser.setSelectedFile(null);

			break;
		case KeyEvent.VK_2:
			view.setVisible(false);
			break;
		}
	}

}
