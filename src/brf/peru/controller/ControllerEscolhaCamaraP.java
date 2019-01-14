package brf.peru.controller;

import brf.peru.view.ViewEscolhaCamaraP;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaCamaraP extends KeyAdapter {
    
    private final ControllerP controller;
    private ViewEscolhaCamaraP viewEscolhaCamara;
    private String escolha;
    
    
    public ControllerEscolhaCamaraP(ControllerP c, String escolha) {
        controller = c;
        this.escolha = escolha;
    }
    
    public void openWindow() {
        viewEscolhaCamara = new ViewEscolhaCamaraP();
        viewEscolhaCamara.setTitle("DIGEX - Peru");
        viewEscolhaCamara.setResizable(false);
        viewEscolhaCamara.setLocationRelativeTo(null);
        viewEscolhaCamara.setVisible(true);
        viewEscolhaCamara.getOpcaoJFT().addKeyListener(this);
        
        if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 1) {
            viewEscolhaCamara.getAbate2Label().setForeground(Color.GRAY);
            viewEscolhaCamara.getQtdeAbate2Label().setVisible(false);
        }
        histSetup();
    }
    
    public void histSetup() {
        int obsCamara[] = {0, 0};
        
        viewEscolhaCamara.getQtdeAbate1Label().setText(obsCamara[0] + " registro(s)");
        viewEscolhaCamara.getQtdeAbate2Label().setText(obsCamara[1] + " registro(s)");
    }
    
    public void resumeWindow() {
        histSetup();
        viewEscolhaCamara.setLocationRelativeTo(null);
        viewEscolhaCamara.setVisible(true);
        viewEscolhaCamara.getOpcaoJFT().setText("");
        viewEscolhaCamara.getOpcaoJFT().grabFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_0:
                int n = JOptionPane.showConfirmDialog(viewEscolhaCamara, 
                                                            "Deseja realmente sair do programa?", 
                                                            "DIGEX - Sair", 
                                                            JOptionPane.YES_NO_OPTION, 
                                                            JOptionPane.WARNING_MESSAGE);
                if (n == 0) {
                    System.out.println("Fim...");
                    System.exit(0);
                }
                break;
            case KeyEvent.VK_1:
                break;
            case KeyEvent.VK_2:
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_ESCAPE:
                int option = JOptionPane.showConfirmDialog(viewEscolhaCamara,
                                                            "Deseja realmente voltar para tela anterior?", 
                                                            "DIGEX - Voltar", 
                                                            JOptionPane.YES_NO_OPTION, 
                                                            JOptionPane.WARNING_MESSAGE);
                if (option == 0) {
                    viewEscolhaCamara.setVisible(false);
                    controller.resumeEscolhaDig();
                    System.out.println("Voltar");
                }
                break;
            default:
                System.out.println("opção inválida!");
                ((JFormattedTextField)e.getComponent()).setCaretPosition(0);
                ((JFormattedTextField)e.getComponent()).selectAll();
                break;
        }
    }
}
