package brf.main.controller;

import brf.main.view.ViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;

public class ControllerLogin extends MouseAdapter implements ActionListener {
    private ViewLogin viewLogin;
    
    public void openWindow() {
        viewLogin = new ViewLogin();
//        java.net.URL imgURL = getClass().getResource("/brf/view/image/icone_DIGEX.png");
//        ImageIcon imgIcon = new ImageIcon(imgURL);
//        viewLogin.setIconImage(imgIcon.getImage());
        viewLogin.setTitle("DIGEX");
        viewLogin.setResizable(false);
        viewLogin.setLocationRelativeTo(null);
        viewLogin.setVisible(true);
        
        viewLogin.getIdDigitadorJFT().addMouseListener(this);
        viewLogin.getIdDigitadorJFT().addActionListener(this);
        viewLogin.getIniciarProgramaBtn().addActionListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        ((JFormattedTextField)e.getComponent()).setCaretPosition(0);
        ((JFormattedTextField)e.getComponent()).selectAll();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(viewLogin.getIdDigitadorJFT().getValue() == null) {
            viewLogin.getIdDigitadorJFT().grabFocus();
        } else {
            String idDigitador = viewLogin.getIdDigitadorJFT().getValue().toString();
            System.out.println("action: idDigitador=" + idDigitador);
            System.out.println("length=" + idDigitador.length());
            if(idDigitador.length()==6) {
                viewLogin.getIdDigitadorJFT().setCaretPosition(0);
                System.out.println("action: " + idDigitador);
                ControllerEscolhaExp ce = new ControllerEscolhaExp();
                ce.openWindow(idDigitador);
                viewLogin.setVisible(false);
            } else {
                viewLogin.getIdDigitadorJFT().setCaretPosition(0);
                viewLogin.getIdDigitadorJFT().selectAll();
                System.out.println("ID inválido!!!");
            }
        }
    }
}
