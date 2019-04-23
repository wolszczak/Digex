package brf.main.controller;

import brf.frango.controller.ControllerF;
import brf.main.view.ViewEscolhaExp;
import brf.frango.model.ModelF;
import brf.peru.controller.ControllerP;
import brf.peru.model.ModelP;
import brf.suino.controller.ControllerSC;
import brf.suino.model.ModelSC;
import brf.util.SystemFileFilter;
import brf.util.SystemFileView;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaExp extends KeyAdapter {
	private ViewEscolhaExp viewEscolhaExp;
	private ModelF mf;
	private ControllerF cf;
	private ModelP mp;
	private ControllerP cp;
	boolean frango, peru, suino;
	private ModelSC msc;
	private ControllerSC csc;

	public void openWindow(String idDigitador) {
		viewEscolhaExp = new ViewEscolhaExp();
		viewEscolhaExp.setTitle("DIGEX");
		viewEscolhaExp.setResizable(false);
		viewEscolhaExp.setLocationRelativeTo(null);
		viewEscolhaExp.setVisible(true);
		viewEscolhaExp.getOpcaoJFT().addKeyListener(this);

		mf = new ModelF();
		cf = new ControllerF(mf, idDigitador);
		mp = new ModelP();
		cp = new ControllerP(mp, idDigitador);
		msc = new ModelSC();
		csc = new ControllerSC(msc, idDigitador);
	}

	public void resumeWindow() {
		viewEscolhaExp.setVisible(true);
		viewEscolhaExp.getOpcaoJFT().setText("");
		viewEscolhaExp.getOpcaoJFT().grabFocus();
	}

	public boolean carregaModel(String localArquivo, String tipoExp) {
		if (tipoExp.equals("F")) {
			try {
				cf.getModel().getModelStateDAO().loadModelState(localArquivo);
				frango = true;
				peru = false;
				suino = false;
				return true;
			} catch (Exception e) {
				System.out.println("tentou carregar experimento de frango");
			}
		} else if (tipoExp.equals("P")) {
			try {
				cp.getModel().getModelStateDAO().loadModelState(localArquivo);
				peru = true;
				frango = false;
				suino = false;
				return true;
			} catch (Exception e) {
				System.out.println("tentou carregar experimento de peru");
			}
		} else if (tipoExp.equals("SC")) {
			try {
				csc.getModel().getModelStateDAO().loadModelState(localArquivo);
				suino = true;
				frango = false;
				peru = false;
				return true;
			} catch (Exception e) {
				System.out.println("tentou carregar experimento de suino");
			}
		}
		return false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case KeyEvent.VK_0:
		case KeyEvent.VK_ESCAPE:
			int n = JOptionPane.showConfirmDialog(viewEscolhaExp, "Deseja realmente sair do programa?", "DIGEX - Sair",
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				System.out.println("Fim...");
				System.exit(0);
			}
			break;
		case KeyEvent.VK_1:
			viewEscolhaExp.setVisible(false);
			cf.startModuloFrango();
			System.out.println("FRANGO");
			break;
		case KeyEvent.VK_2:
			viewEscolhaExp.setVisible(false);
			cp.startModuloPeru();
			System.out.println("PERU");
			break;
		case KeyEvent.VK_3:
			viewEscolhaExp.setVisible(false);
			csc.startModuloSuino();
			System.out.println("SUÍNO");
			break;
		case KeyEvent.VK_4:
			viewEscolhaExp.setVisible(false);
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.addChoosableFileFilter(new SystemFileFilter());
			fileChooser.setFileView(new SystemFileView());
			fileChooser.setAcceptAllFileFilterUsed(false);
			int returnVal = fileChooser.showDialog(viewEscolhaExp, "Abrir");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				String localArquivo = file.getAbsolutePath();
				String[] split = localArquivo.split(Pattern.quote("\\"));
				String nomeArquivo = split[split.length - 1];
				String tipoExp = "";
				boolean versaoOK =  false;
				if(split[6].equals("frango")) {
					versaoOK = carregaModel(localArquivo,"F");	
				}else if (split[6].equals("peru")) {
					versaoOK = carregaModel(localArquivo,"P");	
				}else if (split[6].equals("suinos_creche")) {
					versaoOK = carregaModel(localArquivo,"SC");	
				}
				if (versaoOK && frango) {
					cf.startEscolhaDig();
				} else if (versaoOK && peru) {
					cp.startEscolhaDig(cp.getModel().getExperimentoVO().getInfoExp().getIdadeFase());
				} else if (versaoOK && suino) {
					csc.startEscolhaDig(csc.getModel().getExperimentoVO().getInfoExp().getDatasFases());
				} else {
					JOptionPane.showMessageDialog(viewEscolhaExp, "Arquivo criado em outra versão do Software!", "DIGEX - Aviso",
							JOptionPane.WARNING_MESSAGE);
					viewEscolhaExp.setVisible(true);
				}
			} else {
				viewEscolhaExp.setVisible(true);
			}
			fileChooser.setSelectedFile(null);
			break;
		default:
			System.out.println("Opção inválida!");
			((JFormattedTextField) e.getComponent()).setCaretPosition(0);
			((JFormattedTextField) e.getComponent()).selectAll();
			break;
		}
	}
}
