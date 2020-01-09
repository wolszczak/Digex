package brf.frango.controller;

import brf.frango.model.vo.BalancaVOF;
import brf.frango.view.ViewBalancaF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerBalancaF implements ActionListener {
    private final ControllerF controller;
    private ViewBalancaF viewBalanca;
    
    public ControllerBalancaF(ControllerF c) {
        controller = c;
    }
    
    public void openWindow(JFrame parentView, int abate) {        
        viewBalanca = new ViewBalancaF(parentView, false);
        viewBalanca.getImprimirButton().addActionListener(this);
        DefaultTableModel model = (DefaultTableModel)viewBalanca.getBalancaTable().getModel();
        viewBalanca.getBalancaTable().setModel(model);
        for (BalancaVOF balanca: controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBalanca()) {
            model.addRow(new Object[] {balanca.getOrdem(), balanca.getAnilha(), balanca.getpVivo()});
        }
        
        viewBalanca.setTitle("DIGEX - Frango");
        viewBalanca.setResizable(false);
        viewBalanca.setLocationRelativeTo(null);
        viewBalanca.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MessageFormat header = new MessageFormat("Arquivo da balança");
        MessageFormat footer = new MessageFormat("Página - {0}");
        try {
            boolean complete = viewBalanca.getBalancaTable().print(JTable.PrintMode.NORMAL,
                    header, footer, true, null, true, null);
            if (complete) {
                JOptionPane.showMessageDialog(viewBalanca,
                            "Arquivo enviado à impressora!", "DIGEX - Aviso",
                            JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(viewBalanca,
                            "Impressão cancelada!", "DIGEX - Aviso",
                            JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(viewBalanca,
                            "Falha na Impressão!", "DIGEX - Aviso",
                            JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
