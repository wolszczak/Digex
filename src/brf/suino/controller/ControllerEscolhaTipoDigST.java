package brf.suino.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import brf.suino.view.ViewEscolhaTipoDigST;

public class ControllerEscolhaTipoDigST extends KeyAdapter {
	private final ControllerST controller;
	private ViewEscolhaTipoDigST view;
	private List<String> datasFases;

	public ControllerEscolhaTipoDigST(ControllerST c) {
		controller = c;
	}

	public void openWindow(List<String> datasFases) {
		this.datasFases = datasFases;
		view = new ViewEscolhaTipoDigST();
		view.setTitle("DIGEX - Suínos Terminação");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getOpcaoJFT().addKeyListener(this);

		histSetup();
	}

	public void histSetup() {
		int obsAbate[] = { 0, 0, 0 };
//		int lastBaia = controller.getModel().getExperimentoVO().getConsumo()
//				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getBaia();
//		List<ConsumoVOSC> lista = new ArrayList<>();
//
//		obsAbate[0] = controller.getModel().getExperimentoVO().getConsumo()
//				.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getRme().size();
//
//		for (MortalidadeVOSC m : controller.getModel().getExperimentoVO().getMortalidade()) {
//			if (m.getBaia() == lastBaia) {
//				obsAbate[1]++;
//			}
//		}
//
//		for (MedicadosVOSC m : controller.getModel().getExperimentoVO().getMedicados()) {
//			if (m.getBaia() == lastBaia) {
//				obsAbate[2]++;
//			}
//		}

//		view.getLabelBaia().setText(String.valueOf(lastBaia));
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
//			ControllerConsumoST consumo = new ControllerConsumoST(controller);
//			consumo.openWindow(datasFases);
			break;
		case KeyEvent.VK_2:
//			view.setVisible(false);
//			ControllerMortalidadeSC mortalidade = new ControllerMortalidadeSC(controller);
//			mortalidade.openWindow(
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getGalpao(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getBaia(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getSexo(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getTrat1(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getTrat2(),
//					datasFases);
			break;
		case KeyEvent.VK_3:
			view.setVisible(false);
//			ControllerMedicadosSC medicados = new ControllerMedicadosSC(controller);
//			medicados.openWindow(
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getGalpao(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getBaia(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getSexo(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getTrat1(),
//					controller.getModel().getExperimentoVO().getConsumo()
//							.get(controller.getModel().getExperimentoVO().getConsumo().size() - 1).getTrat2(),
//					datasFases);
			break;
		case KeyEvent.VK_9:
		case KeyEvent.VK_ESCAPE:
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaDigST ce = new ControllerEscolhaDigST(controller);
				ce.openWindow(datasFases);
				System.out.println("Voltar");
			}
			break;
		default:
			System.out.println("Opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}

	}
}
