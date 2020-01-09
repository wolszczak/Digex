package brf.suino.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import brf.suino.model.bo.MedicadosBOSC;
import brf.suino.model.vo.MedicadosVOSC;
import brf.suino.view.ViewMedicadosSC;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;

public class ControllerMedicadosSC extends KeyAdapter implements FocusListener {
	private ControllerSC controller;
	private List<MedicadosVOSC> erros;
	private ViewMedicadosSC view;
	private List<MedicadosVOSC> medicadosHist;
	private List<Component> order, orderLoadHist;
	private List<String> datasFases;
	private int ordem, galpao, baia, sexo, trata, trata2;
	private MedicadosBOSC bo;
	private Border defaultBorder;

	public ControllerMedicadosSC(ControllerSC c) {
		this.controller = c;
		bo = new MedicadosBOSC(c);
	}

	public void openWindow(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2, List<String> datasFases) {
		this.datasFases = datasFases;
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trata = trata;
		this.trata2 = trata2;
		erros = new ArrayList<>();
		view = new ViewMedicadosSC();
		view.setTitle("DIGEX - Medicados Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.getGalpaoJFT().setText(String.valueOf(galpao));
		view.getBaiaJFT().setText(String.valueOf(baia));
		view.getSexoJFT().setText(String.valueOf(sexo));
		view.getTrataJFT().setText(String.valueOf(trata));
		view.getTrata2JFT().setText(String.valueOf(trata2));
		view.getBrincoJFT().setText("0000");
		view.getMedicamentoJFT().setText("000000");
		view.getCausaJFT().setText("00");
		TextFormatter.formatStringJFT(view.getCausaJFT(), view.getCausaJFT().getText().trim(), 2);
		view.getDose1JFT().setText("000");
		view.getDose2JFT().setText("000");
		view.getDose3JFT().setText("000");
		view.getControleJFT().setText("000000");
		view.getControleBrincos().setText("000000");
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
		view.getRegistrosLabel().setVisible(false);
		view.getOpcaoJFT().addKeyListener(this);
		defaultBorder = view.getPnlMedicados().getBorder();
		criarOrdemComponentes();
		criarOrdemComponentesHist();
		loadHist();
		view.pack();
	}

	private void criarOrdemComponentesHist() {
		orderLoadHist = new ArrayList<>();
		orderLoadHist.add(view.getDose3Hist5Label());
		orderLoadHist.add(view.getDose2Hist5Label());
		orderLoadHist.add(view.getDose1Hist5Label());
		orderLoadHist.add(view.getCausaHist5Label());
		orderLoadHist.add(view.getMedicamentoHist5Label());
		orderLoadHist.add(view.getBrincoHist5Label());
		orderLoadHist.add(view.getDataHist5Label());
		orderLoadHist.add(view.getOrdemHist5Label());

		orderLoadHist.add(view.getDose3Hist4Label());
		orderLoadHist.add(view.getDose2Hist4Label());
		orderLoadHist.add(view.getDose1Hist4Label());
		orderLoadHist.add(view.getCausaHist4Label());
		orderLoadHist.add(view.getMedicamentoHist4Label());
		orderLoadHist.add(view.getBrincoHist4Label());
		orderLoadHist.add(view.getDataHist4Label());
		orderLoadHist.add(view.getOrdemHist4Label());

		orderLoadHist.add(view.getDose3Hist3Label());
		orderLoadHist.add(view.getDose2Hist3Label());
		orderLoadHist.add(view.getDose1Hist3Label());
		orderLoadHist.add(view.getCausaHist3Label());
		orderLoadHist.add(view.getMedicamentoHist3Label());
		orderLoadHist.add(view.getBrincoHist3Label());
		orderLoadHist.add(view.getDataHist3Label());
		orderLoadHist.add(view.getOrdemHist3Label());

		orderLoadHist.add(view.getDose3Hist2Label());
		orderLoadHist.add(view.getDose2Hist2Label());
		orderLoadHist.add(view.getDose1Hist2Label());
		orderLoadHist.add(view.getCausaHist2Label());
		orderLoadHist.add(view.getMedicamentoHist2Label());
		orderLoadHist.add(view.getBrincoHist2Label());
		orderLoadHist.add(view.getDataHist2Label());
		orderLoadHist.add(view.getOrdemHist2Label());

		orderLoadHist.add(view.getDose3Hist1Label());
		orderLoadHist.add(view.getDose2Hist1Label());
		orderLoadHist.add(view.getDose1Hist1Label());
		orderLoadHist.add(view.getCausaHist1Label());
		orderLoadHist.add(view.getMedicamentoHist1Label());
		orderLoadHist.add(view.getBrincoHist1Label());
		orderLoadHist.add(view.getDataHist1Label());
		orderLoadHist.add(view.getOrdemHist1Label());
	}

	private void criarOrdemComponentes() {
		order = new ArrayList<>();
		order.add(view.getDataJFT());
		order.add(view.getBrincoJFT());
		order.add(view.getMedicamentoJFT());
		order.add(view.getCausaJFT());
		order.add(view.getDose1JFT());
		order.add(view.getDose2JFT());
		order.add(view.getDose3JFT());
		order.add(view.getControleJFT());
		order.add(view.getControleBrincos());

		FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
		view.setFocusTraversalPolicy(newPolicy);
		listenerSetup(order);
	}

	public void listenerSetup(List<Component> textFields) {
		textFields.stream().forEach((it) -> {
			((JFormattedTextField) it).addKeyListener(this);
			((JFormattedTextField) it).addFocusListener(this);
		});
	}

	private void loadHist() {
		if (controller.getModel().getExperimentoVO().getMedicados() != null
				&& controller.getModel().getExperimentoVO().getMedicados().size() > 0) {
			if (controller.getModel().getExperimentoVO().getMedicados()
					.get(controller.getModel().getExperimentoVO().getMedicados().size() - 1).getBaia() == baia) {
				medicadosHist = new ArrayList<>();
				for (MedicadosVOSC m : controller.getModel().getExperimentoVO().getMedicados()) {
					if (m.getBaia() == baia) {
						medicadosHist.add(m);
					}
				}
				ordem = medicadosHist.get(medicadosHist.size() - 1).getOrdem() + 1;
			} else {
				ordem = 1;
			}
		} else {
			ordem = 1;
		}

		view.getOrdemJFT().setText(String.valueOf(ordem));
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);

		if (medicadosHist != null) {
			for (int k = 0; k < 5; k++) {
				if (medicadosHist != null && medicadosHist.size() > 0) {
					JLabel lbl1 = (JLabel) orderLoadHist.get(0);
					lbl1.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getDose3()));
					orderLoadHist.remove(0);

					JLabel lbl2 = (JLabel) orderLoadHist.get(0);
					lbl2.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getDose2()));
					orderLoadHist.remove(0);

					JLabel lbl3 = (JLabel) orderLoadHist.get(0);
					lbl3.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getDose1()));
					orderLoadHist.remove(0);

					JLabel lbl4 = (JLabel) orderLoadHist.get(0);
					lbl4.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getCausa()));
					orderLoadHist.remove(0);

					JLabel lbl5 = (JLabel) orderLoadHist.get(0);
					lbl5.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getMedicamento()));
					orderLoadHist.remove(0);

					JLabel lbl6 = (JLabel) orderLoadHist.get(0);
					lbl6.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getBrinco()));
					orderLoadHist.remove(0);

					JLabel lbl7 = (JLabel) orderLoadHist.get(0);
					lbl7.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getData()));
					orderLoadHist.remove(0);

					JLabel lbl8 = (JLabel) orderLoadHist.get(0);
					lbl8.setText(String.valueOf(medicadosHist.get(medicadosHist.size() - 1).getOrdem()));
					orderLoadHist.remove(0);
					medicadosHist.remove(medicadosHist.size() - 1);
				} else {
					break;
				}
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Object src = e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(view.getDataJFT())) {
			System.out.println("left");
			Component prev = view.getFocusTraversalPolicy().getComponentBefore(view, (JFormattedTextField) src);
			((JFormattedTextField) src).setEnabled(false);
			prev.setEnabled(true);
			((JFormattedTextField) prev).grabFocus();
		}
		if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
			int option = JOptionPane.showConfirmDialog(view, "Deseja realmente voltar para tela anterior?", "DIGEX - Voltar",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (option == 0) {
				view.setVisible(false);
				ControllerEscolhaTipoDigSC controllerEscolhaTipoDigSC = new ControllerEscolhaTipoDigSC(controller);
				controllerEscolhaTipoDigSC.openWindow(datasFases);
				System.out.println("Voltar");
			}
		}
		if ((JFormattedTextField) e.getSource() == view.getOpcaoJFT()) {
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
				ControllerConsumoSC consumo = new ControllerConsumoSC(controller);
				consumo.openWindow(datasFases);
				break;
			case KeyEvent.VK_2:
				view.setVisible(false);
				ControllerEscolhaTipoDigSC controllerEscolha = new ControllerEscolhaTipoDigSC(controller);
				controllerEscolha.openWindow(datasFases);
				break;
			case KeyEvent.VK_9:
				view.setVisible(false);
				ControllerEscolhaTipoDigSC escolha = new ControllerEscolhaTipoDigSC(controller);
				escolha.openWindow(datasFases);
				break;
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			JFormattedTextField src = (JFormattedTextField) e.getSource();
			String text = src.getText();
			if ((JFormattedTextField) e.getSource() == view.getDataJFT()) {
				view.getRegistrosLabel().setVisible(false);
				TextFormatter.formatStringJFT(src, text, 8);
				String msg = bo.verificaData(view.getDataJFT().getText(), datasFases);
				if (msg != null) {
					JOptionPane.showMessageDialog(view, "Problema(s):\n" + msg, "DIGEX - Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					view.getDataJFT().setEnabled(false);
					view.getBrincoJFT().setEnabled(true);
					view.getBrincoJFT().grabFocus();
				}
			} else if ((JFormattedTextField) e.getSource() == view.getBrincoJFT()) {
				TextFormatter.formatStringJFT(src, text, 4);
				view.getBrincoJFT().setEnabled(false);
				view.getMedicamentoJFT().setEnabled(true);
				view.getMedicamentoJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getMedicamentoJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				view.getMedicamentoJFT().setEnabled(false);
				view.getCausaJFT().setEnabled(true);
				view.getCausaJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getCausaJFT()) {
				TextFormatter.formatStringJFT(src, text, 2);
				view.getCausaJFT().setEnabled(false);
				view.getDose1JFT().setEnabled(true);
				view.getDose1JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getDose1JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				view.getDose1JFT().setEnabled(false);
				view.getDose2JFT().setEnabled(true);
				view.getDose2JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getDose2JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				view.getDose2JFT().setEnabled(false);
				view.getDose3JFT().setEnabled(true);
				view.getDose3JFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getDose3JFT()) {
				TextFormatter.formatStringJFT(src, text, 3);
				view.getDose3JFT().setEnabled(false);
				view.getControleJFT().setEnabled(true);
				view.getControleJFT().grabFocus();
			} else if ((JFormattedTextField) e.getSource() == view.getControleJFT()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (view.getDataJFT().getText().equals("00/00/00") && view.getBrincoJFT().getText().equals("0000")
						&& view.getCausaJFT().getText().equals("00") && view.getMedicamentoJFT().getText().equals("00")
						&& view.getDose1JFT().getText().equals("000") && view.getDose2JFT().getText().equals("000")
						&& view.getDose3JFT().getText().equals("000") && view.getControleJFT().getText().trim().equals("000000")) {
					view.getControleJFT().setEnabled(false);
					view.getControleBrincos().setEnabled(true);
					view.getControleBrincos().grabFocus();
				} else {
					if (Integer.parseInt(view.getControleJFT().getText()) == calculaControleJFT()) {
						controller.getModel().getExperimentoVO().getMedicados()
								.add(new MedicadosVOSC(Integer.parseInt(view.getGalpaoJFT().getText().trim()),
										Integer.parseInt(view.getBaiaJFT().getText().trim()),
										Integer.parseInt(view.getSexoJFT().getText().trim()),
										Integer.parseInt(view.getTrataJFT().getText().trim()),
										Integer.parseInt(view.getTrata2JFT().getText().trim()),
										Integer.parseInt(view.getOrdemJFT().getText().trim()), view.getDataJFT().getText().trim(),
										Integer.parseInt(view.getBrincoJFT().getText().trim()),
										Integer.parseInt(view.getMedicamentoJFT().getText().trim()),
										Integer.parseInt(view.getCausaJFT().getText().trim()),
										Integer.parseInt(view.getDose1JFT().getText().trim()),
										Integer.parseInt(view.getDose2JFT().getText().trim()),
										Integer.parseInt(view.getDose3JFT().getText().trim()),
										Integer.parseInt(view.getControleJFT().getText().trim())));
						controller.getModel().getModelStateDAO().saveModelState(false);
						view.getDataJFT().setEnabled(true);
						view.getDataJFT().grabFocus();
						TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
						updateHist();
						ordem++;
						view.getRegistrosLabel().setVisible(true);
						view.getPnlMedicados().setBorder(defaultBorder);
					} else {
						fluxoErroControle();
						view.getPnlMedicados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
					}
				}
			} else if ((JFormattedTextField) e.getSource() == view.getControleBrincos()) {
				TextFormatter.formatStringJFT(src, text, 6);
				if (Integer.parseInt(view.getControleBrincos().getText().trim()) == calculaControleBrincos()) {
					view.getControleBrincos().setEnabled(false);
					view.getOpcaoJFT().setEnabled(true);
					view.getOpcaoJFT().grabFocus();
				} else {
					fluxoErroControleBrincos();
					recuperaHist();
					view.getPnlMedicados().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
				}
			}
		}
	}

	private void updateHist() {
		view.getOrdemHist1Label().setText(String.valueOf(view.getOrdemHist2Label().getText()));
		view.getOrdemHist2Label().setText(String.valueOf(view.getOrdemHist3Label().getText()));
		view.getOrdemHist3Label().setText(String.valueOf(view.getOrdemHist4Label().getText()));
		view.getOrdemHist4Label().setText(String.valueOf(view.getOrdemHist5Label().getText()));
		view.getOrdemHist5Label().setText(String.valueOf(view.getOrdemJFT().getText()));

		view.getDataHist1Label().setText(String.valueOf(view.getDataHist2Label().getText()));
		view.getDataHist2Label().setText(String.valueOf(view.getDataHist3Label().getText()));
		view.getDataHist3Label().setText(String.valueOf(view.getDataHist4Label().getText()));
		view.getDataHist4Label().setText(String.valueOf(view.getDataHist5Label().getText()));
		view.getDataHist5Label().setText(String.valueOf(view.getDataJFT().getText()));

		view.getBrincoHist1Label().setText(String.valueOf(view.getBrincoHist2Label().getText()));
		view.getBrincoHist2Label().setText(String.valueOf(view.getBrincoHist3Label().getText()));
		view.getBrincoHist3Label().setText(String.valueOf(view.getBrincoHist4Label().getText()));
		view.getBrincoHist4Label().setText(String.valueOf(view.getBrincoHist5Label().getText()));
		view.getBrincoHist5Label().setText(String.valueOf(view.getBrincoJFT().getText()));

		view.getMedicamentoHist1Label().setText(String.valueOf(view.getMedicamentoHist2Label().getText()));
		view.getMedicamentoHist2Label().setText(String.valueOf(view.getMedicamentoHist3Label().getText()));
		view.getMedicamentoHist3Label().setText(String.valueOf(view.getMedicamentoHist4Label().getText()));
		view.getMedicamentoHist4Label().setText(String.valueOf(view.getMedicamentoHist5Label().getText()));
		view.getMedicamentoHist5Label().setText(String.valueOf(view.getMedicamentoJFT().getText()));

		view.getCausaHist1Label().setText(String.valueOf(view.getCausaHist2Label().getText()));
		view.getCausaHist2Label().setText(String.valueOf(view.getCausaHist3Label().getText()));
		view.getCausaHist3Label().setText(String.valueOf(view.getCausaHist4Label().getText()));
		view.getCausaHist4Label().setText(String.valueOf(view.getCausaHist5Label().getText()));
		view.getCausaHist5Label().setText(String.valueOf(view.getCausaJFT().getText()));

		view.getDose1Hist1Label().setText(String.valueOf(view.getDose1Hist2Label().getText()));
		view.getDose1Hist2Label().setText(String.valueOf(view.getDose1Hist3Label().getText()));
		view.getDose1Hist3Label().setText(String.valueOf(view.getDose1Hist4Label().getText()));
		view.getDose1Hist4Label().setText(String.valueOf(view.getDose1Hist5Label().getText()));
		view.getDose1Hist5Label().setText(String.valueOf(view.getDose1JFT().getText()));

		view.getDose2Hist1Label().setText(String.valueOf(view.getDose2Hist2Label().getText()));
		view.getDose2Hist2Label().setText(String.valueOf(view.getDose2Hist3Label().getText()));
		view.getDose2Hist3Label().setText(String.valueOf(view.getDose2Hist4Label().getText()));
		view.getDose2Hist4Label().setText(String.valueOf(view.getDose2Hist5Label().getText()));
		view.getDose2Hist5Label().setText(String.valueOf(view.getDose2JFT().getText()));

		view.getDose3Hist1Label().setText(String.valueOf(view.getDose3Hist2Label().getText()));
		view.getDose3Hist2Label().setText(String.valueOf(view.getDose3Hist3Label().getText()));
		view.getDose3Hist3Label().setText(String.valueOf(view.getDose3Hist4Label().getText()));
		view.getDose3Hist4Label().setText(String.valueOf(view.getDose3Hist5Label().getText()));
		view.getDose3Hist5Label().setText(String.valueOf(view.getDose3JFT().getText()));

		if (!erros.isEmpty()) {
			recuperaHist();
		} else {
			view.getOrdemJFT().setText(String.valueOf(ordem));
			view.getDataJFT().setText("00/00/00");
			view.getBrincoJFT().setText("0000");
			view.getMedicamentoJFT().setText("000000");
			view.getCausaJFT().setText("00");
			TextFormatter.formatStringJFT(view.getCausaJFT(), view.getCausaJFT().getText().trim(), 2);
			view.getDose1JFT().setText("000");
			view.getDose2JFT().setText("000");
			view.getDose3JFT().setText("000");
			view.getControleJFT().setText("000000");
			view.getControleBrincos().setText("000000");

			view.getBrincoJFT().setEnabled(false);
			view.getMedicamentoJFT().setEnabled(false);
			view.getCausaJFT().setEnabled(false);
			view.getDose1JFT().setEnabled(false);
			view.getDose2JFT().setEnabled(false);
			view.getDose3JFT().setEnabled(false);
			view.getControleJFT().setEnabled(false);
			view.pack();
		}

	}

	private void recuperaHist() {
		view.getOrdemJFT().setText(String.valueOf(erros.get(0).getOrdem()));
		TextFormatter.formatStringJFT(view.getOrdemJFT(), view.getOrdemJFT().getText(), 2);
		view.getDataJFT().setText(String.valueOf(erros.get(0).getData()));
		TextFormatter.formatStringJFT(view.getDataJFT(), view.getDataJFT().getText(), 8);
		view.getBrincoJFT().setText(String.valueOf(erros.get(0).getBrinco()));
		TextFormatter.formatStringJFT(view.getBrincoJFT(), view.getBrincoJFT().getText(), 4);
		view.getMedicamentoJFT().setText(String.valueOf(erros.get(0).getMedicamento()));
		TextFormatter.formatStringJFT(view.getMedicamentoJFT(), view.getMedicamentoJFT().getText(), 2);
		view.getCausaJFT().setText(String.valueOf(erros.get(0).getCausa()));
		TextFormatter.formatStringJFT(view.getCausaJFT(), view.getCausaJFT().getText(), 2);
		view.getDose1JFT().setText(String.valueOf(erros.get(0).getDose1()));
		TextFormatter.formatStringJFT(view.getDose1JFT(), view.getDose1JFT().getText(), 3);
		view.getDose2JFT().setText(String.valueOf(erros.get(0).getDose2()));
		TextFormatter.formatStringJFT(view.getDose2JFT(), view.getDose2JFT().getText(), 3);
		view.getDose3JFT().setText(String.valueOf(erros.get(0).getDose3()));
		TextFormatter.formatStringJFT(view.getDose3JFT(), view.getDose3JFT().getText(), 3);
		view.getControleJFT().setText(String.valueOf(erros.get(0).getControle()));
		TextFormatter.formatStringJFT(view.getControleJFT(), view.getControleJFT().getText(), 6);

		erros.remove(0);
	}

	private void fluxoErroControle() {
		view.getControleJFT().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();
	}

	private void fluxoErroControleBrincos() {
		for (MedicadosVOSC m : controller.getModel().getExperimentoVO().getMedicados()) {
			if (m.getBaia() == baia) {
				erros.add(m);
			}
		}
		controller.getModel().getExperimentoVO().getMedicados().removeIf(x -> x.getBaia() == baia);

		view.getOrdemHist1Label().setText("");
		view.getDataHist1Label().setText("");
		view.getBrincoHist1Label().setText("");
		view.getMedicamentoHist1Label().setText("");
		view.getCausaHist1Label().setText("");
		view.getDose1Hist1Label().setText("");
		view.getDose2Hist1Label().setText("");
		view.getDose3Hist1Label().setText("");

		view.getOrdemHist2Label().setText("");
		view.getDataHist2Label().setText("");
		view.getBrincoHist2Label().setText("");
		view.getMedicamentoHist2Label().setText("");
		view.getCausaHist2Label().setText("");
		view.getDose1Hist2Label().setText("");
		view.getDose2Hist2Label().setText("");
		view.getDose3Hist2Label().setText("");

		view.getOrdemHist3Label().setText("");
		view.getDataHist3Label().setText("");
		view.getBrincoHist3Label().setText("");
		view.getMedicamentoHist3Label().setText("");
		view.getCausaHist3Label().setText("");
		view.getDose1Hist3Label().setText("");
		view.getDose2Hist3Label().setText("");
		view.getDose3Hist3Label().setText("");

		view.getOrdemHist4Label().setText("");
		view.getDataHist4Label().setText("");
		view.getBrincoHist4Label().setText("");
		view.getMedicamentoHist4Label().setText("");
		view.getCausaHist4Label().setText("");
		view.getDose1Hist4Label().setText("");
		view.getDose2Hist4Label().setText("");
		view.getDose3Hist4Label().setText("");

		view.getOrdemHist5Label().setText("");
		view.getDataHist5Label().setText("");
		view.getBrincoHist5Label().setText("");
		view.getMedicamentoHist5Label().setText("");
		view.getCausaHist5Label().setText("");
		view.getDose1Hist5Label().setText("");
		view.getDose2Hist5Label().setText("");
		view.getDose3Hist5Label().setText("");

		view.getControleBrincos().setEnabled(false);
		view.getDataJFT().setEnabled(true);
		view.getDataJFT().grabFocus();

	}

	private Integer calculaControleJFT() {
		int soma = 0;
		String[] split = view.getDataJFT().getText().split("/");
//		soma += Integer.parseInt(split[0]);
//		soma += Integer.parseInt(split[1]);
//		soma += Integer.parseInt(split[2]);
		soma += Integer.parseInt(split[0] + split[1] + split[2]);
		soma += Integer.parseInt(view.getBrincoJFT().getText());
		soma += Integer.parseInt(view.getMedicamentoJFT().getText());
		soma += Integer.parseInt(view.getCausaJFT().getText());
		soma += Integer.parseInt(view.getDose1JFT().getText());
		soma += Integer.parseInt(view.getDose2JFT().getText());
		soma += Integer.parseInt(view.getDose3JFT().getText());
		return soma;
	}

	private Integer calculaControleBrincos() {
		int soma = 0;
		for (MedicadosVOSC m : controller.getModel().getExperimentoVO().getMedicados()) {
			if (m.getBaia() == baia) {
				soma += m.getBrinco();
			}
		}
		return soma;
	}

	@Override
	public void focusGained(FocusEvent e) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				((JFormattedTextField) e.getSource()).setCaretPosition(0);
				((JFormattedTextField) e.getSource()).selectAll();
			}
		});
	}

	@Override
	public void focusLost(FocusEvent arg0) {
	}
}