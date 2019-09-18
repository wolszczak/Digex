package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import brf.main.controller.ControllerEscolhaExp;
import brf.main.view.ViewEscolhaExp;
import brf.suino.model.dao.ConsumoDAOSC;
import brf.suino.model.dao.MedicadosDAOSC;
import brf.suino.model.dao.MortalidadeDAOSC;
import brf.suino.view.ViewEscolhaDigST;
import brf.util.ExpFileFilter;
import brf.util.SystemFileView;

public class ControllerEscolhaDigST extends KeyAdapter {
	private final ControllerST controller;
	private ViewEscolhaDigST view;
	private ViewEscolhaExp viewEscolhaExp;
	private ControllerEscolhaExp controllerescolhaExp;
	private List<String> datasFases = new ArrayList<>();

	public ControllerEscolhaDigST(ControllerST c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		view = new ViewEscolhaDigST();
		view.setTitle("DIGEX - Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		view.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		view.getOpcaoJFT().addKeyListener(this);
		this.datasFases = datasFases;
//		if (controller.getModel().getExperimentoVO().getConsumo() != null
//				&& controller.getModel().getExperimentoVO().getConsumo().isEmpty()) {
//			viewEscolhaDig.getExportarConsLabel().setForeground(Color.GRAY);
//		}
		if (controller.getModel().getExperimentoVO().getMortalidade() != null
				&& controller.getModel().getExperimentoVO().getMortalidade().isEmpty()) {
			view.getExportarMortLabel().setForeground(Color.GRAY);
		}
		if (controller.getModel().getExperimentoVO().getMedicados() != null
				&& controller.getModel().getExperimentoVO().getMedicados().isEmpty()) {
			view.getExportarMediLabel().setForeground(Color.GRAY);
		}
		histSetup();
	}

	public void histSetup() {
//		int obsConsumo = controller.getModel().getExperimentoVO().getConsumo().size();
//		int obsMedi = controller.getModel().getExperimentoVO().getMedicados().size();
//		int obsMort = controller.getModel().getExperimentoVO().getMortalidade().size();
//		viewEscolhaDig.getQtdeConsLabel()
//				.setText(obsConsumo + "/" + controller.getModel().getExperimentoVO().getInfoExp().getNrBaias() + " registro(s)");
	}

	public void resumeWindow() {
		histSetup();
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().setText("");
		view.getOpcaoJFT().grabFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
			int n = JOptionPane.showConfirmDialog(view, "Deseja realmente sair do programa?", "DIGEX - Sair",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(controller.getIdDigitador());
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			view.setVisible(false);
//			ControllerEscolhaTipoDigST controllerEscolhaTipoDigST =  new ControllerEscolhaTipoDigST(controller);
//			controllerEscolhaTipoDigST.openWindow(datasFases);
			break;
		case KeyEvent.VK_2:
			break;
		case KeyEvent.VK_3:
			break;
		case KeyEvent.VK_4:
			break;
		}
	}

}
