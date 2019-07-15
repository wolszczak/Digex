package brf.suino.controller;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.MedicadosVOSC;
import brf.suino.model.vo.MortalidadeVOSC;
import brf.suino.view.ViewEscolhaTipoDigSC;

public class ControllerEscolhaTipoDigSC extends KeyAdapter {
	private final ControllerSC controller;
	private ViewEscolhaTipoDigSC view;
	private List<Integer> idadesFases;

	public ControllerEscolhaTipoDigSC(ControllerSC c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		view = new ViewEscolhaTipoDigSC();
		view.setTitle("DIGEX - Peru");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().addKeyListener(this);

		histSetup();
	}

	public void histSetup() {
		int obsAbate[] = { 0, 0, 0 };
		int lastBaia = controller.getModel().getExperimentoVO().getConsumo()
				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getBaia();
		List<ConsumoVOSC> lista = new ArrayList<>();

		for (ConsumoVOSC c : controller.getModel().getExperimentoVO().getConsumo()) {
			if (c.getBaia() == lastBaia) {
				obsAbate[0]++;
			}
		}

		for (MortalidadeVOSC m : controller.getModel().getExperimentoVO().getMortalidade()) {
			if (m.getBaia() == lastBaia) {
				obsAbate[1]++;
			}
		}

		for (MedicadosVOSC m : controller.getModel().getExperimentoVO().getMedicados()) {
			if (m.getBaia() == lastBaia) {
				obsAbate[2]++;
			}
		}

		view.getLabelBaia().setText(String.valueOf(lastBaia));
		view.getLabelBaiaRegistros().setText(obsAbate[0] + " registro(s)");
		view.getLabelMortalidadeRegistros().setText(obsAbate[1] + " registro(s)");
		view.getLabelMedicadosRegistros().setText(obsAbate[2] + " registro(s)");
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
		case KeyEvent.VK_1:
			view.setVisible(false);
//			controller.startEscolhaDigRend(1, 0,
//					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(0));
//			System.out.println("Abate 1");
//			if (controller.getModel().getExperimentoVO().getAbates() == null) {
//				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(1);
//			} else {
//				controller.getModel().getExperimentoVO().getAbates().get(0).setAbate(1);
//			}
			break;
		case KeyEvent.VK_2:
			view.setVisible(false);
//			controller.startEscolhaDigRend(2, 0,
//					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(1));
//			if (controller.getModel().getExperimentoVO().getAbates() == null) {
//				controller.getModel().getExperimentoVO().getAbates().get(1).setAbate(2);
//			} else {
//				controller.getModel().getExperimentoVO().getAbates().get(1).setAbate(2);
//			}
			System.out.println("Abate 2");
			break;
		case KeyEvent.VK_3:
			view.setVisible(false);
//			controller.startEscolhaDigRend(3, 0,
//					controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(2));
//			if (controller.getModel().getExperimentoVO().getAbates() == null) {
//				controller.getModel().getExperimentoVO().getAbates().get(2).setAbate(3);
//			} else {
//				controller.getModel().getExperimentoVO().getAbates().get(2).setAbate(3);
//			}
			System.out.println("Abate 3");
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (option == 0) {
//				viewEscolhaTipoDigSC.setVisible(false);
//				controller.resumeEscolhaDig();
//				System.out.println("Voltar");
//			}
			break;
		default:
			System.out.println("Opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}
	}
}
