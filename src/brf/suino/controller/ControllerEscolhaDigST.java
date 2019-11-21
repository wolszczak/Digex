package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import brf.main.controller.ControllerEscolhaExp;
import brf.main.view.ViewEscolhaExp;
import brf.suino.view.ViewEscolhaDigST;

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
		view.setTitle("DIGEX - Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getProtocoloJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getProtocolo());
		view.getTesteJFT().setText(controller.getModel().getExperimentoVO().getInfoExp().getTeste());
		view.getOpcaoJFT().addKeyListener(this);
		this.datasFases = datasFases;

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarMortLabel().setForeground(Color.GRAY);
		} else if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
				.getMortalidades() == null) {
			view.getExportarMortLabel().setForeground(Color.GRAY);
		}

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarMediLabel().setForeground(Color.GRAY);
		} else if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
				.getMedicados() == null) {
			view.getExportarMediLabel().setForeground(Color.GRAY);
		}

		if (controller.getModel().getExperimentoVO().getBaias() == null || controller.getModel().getExperimentoVO().getBaias().isEmpty()) {
			view.getExportarLivreLabel().setForeground(Color.GRAY);
		} else if (controller.getModel().getExperimentoVO().getBaias().get(controller.getModel().getExperimentoVO().getBaias().size() - 1)
				.getConsumos() == null) {
			view.getExportarLivreLabel().setForeground(Color.GRAY);
		}

		if (controller.getModel().getExperimentoVO().getConsumosTratos() == null
				|| controller.getModel().getExperimentoVO().getConsumosTratos().isEmpty()) {
			view.getExportarTratosLabel().setForeground(Color.GRAY);
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
				ControllerEscolhaExp ce = new ControllerEscolhaExp();
				ce.openWindow(controller.getIdDigitador());
				System.out.println("Voltar");
			}
			break;
		case KeyEvent.VK_1:
			view.setVisible(false);
			ControllerMortalidadeST mortalidade = new ControllerMortalidadeST(controller);
			mortalidade.openWindow(datasFases);
			break;
		case KeyEvent.VK_2:
			view.setVisible(false);
			ControllerConsumoTratosST cl = new ControllerConsumoTratosST(controller);
			cl.openWindow(datasFases);
			break;
		case KeyEvent.VK_3:
			break;
		case KeyEvent.VK_4:
			break;
		}
	}

}
