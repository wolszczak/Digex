package brf.peru.controller;

import brf.peru.view.ViewEscolhaConeP;
import java.awt.Color;
import java.awt.event.KeyAdapter;

public class ControllerEscolhaConeP extends KeyAdapter {
    private final ControllerP controller;
    private ViewEscolhaConeP viewEscolhaCone;
    private String escolha;
    private int obsCone1, obsCone2;
    
    public ControllerEscolhaConeP (ControllerP c, String escolha) {
        controller = c;
        this.escolha = escolha;
    }
    
    public void openWindow() {
        viewEscolhaCone = new ViewEscolhaConeP();
        viewEscolhaCone.setTitle("DIGEX - Peru");
        viewEscolhaCone.setResizable(false);
        viewEscolhaCone.setLocationRelativeTo(null);
        viewEscolhaCone.setVisible(true);
        viewEscolhaCone.getOpcaoJFT().addKeyListener(this);
        
        if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 1) {
            viewEscolhaCone.getAbate2Label().setForeground(Color.GRAY);
            viewEscolhaCone.getQtdeAbate2Label().setVisible(false);
        }
        histSetup();        
    }

    public void histSetup() {
        int obsCone[] = {0, 0};
        
        viewEscolhaCone.getQtdeAbate1Label().setText(obsCone[0] + " registro(s)");
        viewEscolhaCone.getQtdeAbate2Label().setText(obsCone[1] + " registro(s)");
    }
    
    public void resumeWindow() {
        histSetup();
        viewEscolhaCone.setLocationRelativeTo(null);
        viewEscolhaCone.setVisible(true);
        viewEscolhaCone.getOpcaoJFT().setText("");
        viewEscolhaCone.getOpcaoJFT().grabFocus();
    }
}
