package brf.frango.controller;

import brf.frango.model.vo.AbateVOF;
import brf.frango.model.vo.AvaliacaoPeVOF;
import brf.frango.model.vo.RendimentoVOF;
import brf.frango.view.ViewEscolhaAbateF;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaAbateF extends KeyAdapter {
    private final ControllerF controller;
    private ViewEscolhaAbateF viewEscolhaAbate;
    private String escolha;
    private int obsAbate1, obsAbate2, obsAbate3;
//    private List<AbateVO> rendimento;
//    private List<BaiaAnilhaVO> baiaAnilha;
//    private List <AnimalVO> animal;

    public ControllerEscolhaAbateF(ControllerF c, String escolha) {
        controller = c;
        this.escolha = escolha;
    }
    
    public void openWindow() {
        viewEscolhaAbate = new ViewEscolhaAbateF();
        viewEscolhaAbate.setTitle("DIGEX - Frango");
        viewEscolhaAbate.setResizable(false);
        viewEscolhaAbate.setLocationRelativeTo(null);
        viewEscolhaAbate.setVisible(true);
        viewEscolhaAbate.getOpcaoJFT().addKeyListener(this);
        
        if(controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 1) {
            viewEscolhaAbate.getAbate2Label().setForeground(Color.GRAY);
            viewEscolhaAbate.getAbate3Label().setForeground(Color.GRAY);
            viewEscolhaAbate.getQtdeAbate2Label().setVisible(false);
            viewEscolhaAbate.getQtdeAbate3Label().setVisible(false);
        } else if(controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 2) {
            viewEscolhaAbate.getAbate3Label().setForeground(Color.GRAY);
            viewEscolhaAbate.getQtdeAbate3Label().setVisible(false);
        }
        histSetup();
    }

    public void histSetup() {
        int obsAbate[] = {0, 0, 0};
        if (escolha.equals("REND")) {
            for (int i = 0; i < 3; i ++) {
                for (RendimentoVOF rendimento : controller.getModel().getExperimentoVO().getAbates().get(i).getRendimento()) {
                    if (rendimento.getNasa() != 0) {
                        obsAbate[i]++;
                    }
                }
            }
        } else if (escolha.equals("AVAL")) {
            for (int i = 0; i < 3; i ++) {
                for (AvaliacaoPeVOF avaliacaoPe : controller.getModel().getExperimentoVO().getAbates().get(i).getAvaliacaoPe()) {
                    if (avaliacaoPe.getLacre()!= 0) {
                        obsAbate[i]++;
                    }
                }
            }
        }
        viewEscolhaAbate.getQtdeAbate1Label().setText(obsAbate[0] + " registro(s)");
        viewEscolhaAbate.getQtdeAbate2Label().setText(obsAbate[1] + " registro(s)");
        viewEscolhaAbate.getQtdeAbate3Label().setText(obsAbate[2] + " registro(s)");
    }
    
    public void resumeWindow() {
        histSetup();
        viewEscolhaAbate.setLocationRelativeTo(null);
        viewEscolhaAbate.setVisible(true);
        viewEscolhaAbate.getOpcaoJFT().setText("");
        viewEscolhaAbate.getOpcaoJFT().grabFocus();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_0:
                int n = JOptionPane.showConfirmDialog(viewEscolhaAbate,
                                                      "Deseja realmente sair do programa?",
                                                      "DIGEX - Sair",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
                if(n == 0) {
                    System.out.println("Fim...");
                    System.exit(0);
                }
                break;
            case KeyEvent.VK_1:
                viewEscolhaAbate.setVisible(false);
                if (escolha.equals("REND")) {
                    controller.startEscolhaBal(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 1,
                                               controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(0));
                } else if (escolha.equals("AVAL")) {
                    controller.startLacreAnilha(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 1,
                                                controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(0));
                }                
                System.out.println("Abate 1");
                break;
            case KeyEvent.VK_2:
                if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() >= 2) {
                    viewEscolhaAbate.setVisible(false);
                    if (escolha.equals("REND")) {
                        controller.startEscolhaBal(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 2,
                                               controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(1));
                    } else if (escolha.equals("AVAL")) {
                        controller.startLacreAnilha(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 2,
                                                    controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(1));
                    }  
                    System.out.println("Abate 2");
                } else {
                    JOptionPane.showMessageDialog(viewEscolhaAbate,
                            "Experimento não teve 2 abates!", "DIGEX - Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
                break;
            case KeyEvent.VK_3:
                if (controller.getModel().getExperimentoVO().getInfoExp().getNrAbate() == 3) {
                    viewEscolhaAbate.setVisible(false);
                    if (escolha.equals("REND")) {
                        controller.startEscolhaBal(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 3,
                                                   controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(2));
                    } else if (escolha.equals("AVAL")) {
                        controller.startLacreAnilha(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), 3,
                                                    controller.getModel().getExperimentoVO().getInfoExp().getDataAbate().get(2));
                    } 
                    System.out.println("Abate 3");
                } else {
                    JOptionPane.showMessageDialog(viewEscolhaAbate,
                            "Experimento não teve 3 abates!", "DIGEX - Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_ESCAPE:
                int option = JOptionPane.showConfirmDialog(viewEscolhaAbate,
                                                           "Deseja realmente voltar para tela anterior?",
                                                           "DIGEX - Voltar",
                                                           JOptionPane.YES_NO_OPTION,
                                                           JOptionPane.WARNING_MESSAGE);
                if(option == 0) {
                    viewEscolhaAbate.setVisible(false);
                    controller.resumeEscolhaDig();
                    System.out.println("Voltar");
                }                   
                break;
            default:
                System.out.println("Opção inválida!");
                ((JFormattedTextField)e.getComponent()).setCaretPosition(0);
                ((JFormattedTextField)e.getComponent()).selectAll();
                break;
        }
    }
}
