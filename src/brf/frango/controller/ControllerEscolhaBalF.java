package brf.frango.controller;

import brf.frango.model.bo.EscolhaBalBOF;
import brf.util.DTAReader;
import brf.frango.model.vo.BalancaVOF;
import brf.frango.view.ViewEscolhaBalF;
import brf.util.DTAFileFilter;
import brf.util.SystemFileView;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class ControllerEscolhaBalF extends KeyAdapter {
    private final ControllerF controller;
    private ViewEscolhaBalF viewEscolhaBal;
    private String aviario;
    private int abate;
    private String dataAbate;
    private final EscolhaBalBOF escolhaBalBO;
    private boolean isOk;

    public ControllerEscolhaBalF(ControllerF c, EscolhaBalBOF escolhaBalBO) {
        controller = c;
        this.escolhaBalBO = escolhaBalBO;
    }
    
    public void openWindow(String aviario, int abate, String dataAbate) {
        viewEscolhaBal = new ViewEscolhaBalF();
        viewEscolhaBal.setTitle("DIGEX - Frango");
        viewEscolhaBal.setResizable(false);
        viewEscolhaBal.setLocationRelativeTo(null);
        viewEscolhaBal.setVisible(true);
        viewEscolhaBal.getOpcaoJFT().addKeyListener(this);
        viewEscolhaBal.getOpcaoJFT().grabFocus();    
        
        this.aviario = aviario;
        this.abate = abate;
        this.dataAbate = dataAbate;
                
        viewEscolhaBal.getAviarioJFT().setText(aviario);
        viewEscolhaBal.getAbateJFT().setText(""+abate);
        viewEscolhaBal.getDataAbateJFT().setText(dataAbate);
        
        loadHist();
    }
    
    public void loadHist() {
        int obsBalanca = controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBalanca().size();
        viewEscolhaBal.getRegistrosBalancaLabel().setText(obsBalanca + " registro(s) importado(s)");
        if (escolhaBalBO.balancaIsEmpty(abate)) {
            viewEscolhaBal.getVisualizarArquivoLabel().setForeground(Color.GRAY);
            viewEscolhaBal.getDigitarRendimentoLabel().setForeground(Color.GRAY);
        } else {
            String msgErros = escolhaBalBO.verificaErros(abate);
            if (msgErros.length() != 0) {
                viewEscolhaBal.getDigitarRendimentoLabel().setForeground(Color.GRAY);
                isOk = false;
            } else {
                viewEscolhaBal.getDigitarRendimentoLabel().setForeground(Color.BLACK);
                isOk = true;
            }
            viewEscolhaBal.getVisualizarArquivoLabel().setForeground(Color.BLACK);
        }
    }
    
    public void displayMessages() {
        String msgErros = escolhaBalBO.verificaErros(abate);
        if (msgErros.length() != 0) {
            JOptionPane.showMessageDialog(viewEscolhaBal,
                    "Problema(s):\n" + msgErros, "DIGEX - Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String msgFaltante = escolhaBalBO.verificaAnilhasFaltantes(abate);
            if (msgFaltante.length() != 0) {
                JOptionPane.showMessageDialog(viewEscolhaBal,
                       "Problemas(s):\n" + msgFaltante, "DIGEX - Aviso",
                       JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void resumeWindow() {
        loadHist();
        viewEscolhaBal.setLocationRelativeTo(null);
        viewEscolhaBal.setVisible(true);
        viewEscolhaBal.getOpcaoJFT().setText("");
        viewEscolhaBal.getOpcaoJFT().grabFocus();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_0:
                int n = JOptionPane.showConfirmDialog(viewEscolhaBal,
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
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.addChoosableFileFilter(new DTAFileFilter());
                fileChooser.setFileView(new SystemFileView());
                fileChooser.setAcceptAllFileFilterUsed(false);
                int returnVal = fileChooser.showDialog(viewEscolhaBal, "Carregar arquivo do Abate");
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    String localArquivo = file.getAbsolutePath();
                    List<String> arquivoDta = DTAReader.readFile(localArquivo);
                    List<BalancaVOF> balanca = new ArrayList<>();
                    int ordem = 1;
                    for (String obs : arquivoDta) {
                        balanca.add(new BalancaVOF(ordem++, Integer.parseInt(obs.substring(1, 4).trim()), Integer.parseInt(obs.substring(6).trim())));
                        System.out.println("ordem: " + balanca.get(ordem-2).getOrdem()+
                                " anilha: " + balanca.get(ordem-2).getAnilha() + 
                                " peso: " + balanca.get(ordem-2).getpVivo());
                    }
                    controller.getModel().getExperimentoVO().getAbates().get(abate-1).setBalanca(balanca);
                    
                    balanca.sort((BalancaVOF b1, BalancaVOF b2) -> {
                        if (b1.getAnilha()> b2.getAnilha())
                            return 1;
                        if (b1.getAnilha()< b2.getAnilha())
                            return -1;
                        return 0;
                    });
                    controller.getModel().getModelStateDAO().saveModelState(false);
                    loadHist();
                    displayMessages();
                 }
                fileChooser.setSelectedFile(null);
                break;
            case KeyEvent.VK_2:
                if (escolhaBalBO.balancaIsEmpty(abate)) {
                    JOptionPane.showMessageDialog(viewEscolhaBal,
                            "Arquivo da balança não importado ou sem registros!", "DIGEX - Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    controller.startBalanca(viewEscolhaBal, abate);
                    System.out.println("Visualização balança");
                }
                break;
            case KeyEvent.VK_3:
                viewEscolhaBal.setVisible(false);
                controller.startBaiaAnilha(controller.getModel().getExperimentoVO().getInfoExp().getAviario(), abate,
                                           dataAbate);
                break;
            case KeyEvent.VK_4:
                loadHist();
                if (isOk) {
                    viewEscolhaBal.setVisible(false);
                    controller.startRendimento(aviario, abate, dataAbate);
                    System.out.println("Rendimento frigorífico");
                }
                if (escolhaBalBO.balancaIsEmpty(abate)) {
                    JOptionPane.showMessageDialog(viewEscolhaBal,
                            "Arquivo da balança não importado ou sem registros!", "DIGEX - Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    displayMessages();
                }
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_ESCAPE:
                int option = JOptionPane.showConfirmDialog(viewEscolhaBal,
                                                           "Deseja realmente voltar para tela anterior?",
                                                           "DIGEX - Voltar",
                                                           JOptionPane.YES_NO_OPTION,
                                                           JOptionPane.WARNING_MESSAGE);
                if(option == 0) {
                    viewEscolhaBal.setVisible(false);
                    controller.resumeEscolhaAbate();
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