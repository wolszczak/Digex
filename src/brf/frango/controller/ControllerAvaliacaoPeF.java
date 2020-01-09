package brf.frango.controller;

import brf.frango.model.bo.AvaliacaoPeBOF;
import brf.frango.model.vo.AvaliacaoPeVOF;
import brf.frango.view.ViewAvaliacaoPeF;
import brf.util.FocusOrderPolicy;
import brf.util.SaveUpdater;
import brf.util.TextFormatter;
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

public class ControllerAvaliacaoPeF extends KeyAdapter
        implements FocusListener {
    private final ControllerF controller;
    private ViewAvaliacaoPeF viewAvaliacaoPe;
    private Border defaultBorder;
    private int controle;
    private List<AvaliacaoPeVOF> avaliacaoPe;
    private List<AvaliacaoPeVOF> lastHist;
    private int ordem;
    private String aviario;
    private int abate;
    private String dataAbate;
    private List<JLabel> histOrdens;
    private List<JLabel> histLacre;
    private List<JLabel> histPesoPe;
    private List<JLabel> histEscore;
    private final AvaliacaoPeBOF avaliacaoPeBO;
    
    public ControllerAvaliacaoPeF(ControllerF c, AvaliacaoPeBOF avaliacaoPeBO) {
        controller = c;
        this.avaliacaoPeBO = avaliacaoPeBO;
    }

    public void openWindow(String aviario, int abate, String dataAbate) {
        viewAvaliacaoPe = new ViewAvaliacaoPeF();
        viewAvaliacaoPe.setTitle("DIGEX - Frango");
        viewAvaliacaoPe.setResizable(false);
        viewAvaliacaoPe.setLocationRelativeTo(null);
        viewAvaliacaoPe.setVisible(true);
        viewAvaliacaoPe.getRegistroLabel().setVisible(false);
        defaultBorder = viewAvaliacaoPe.getAvaliacaoPeJP().getBorder();
        
        this.aviario = aviario;
        this.abate = abate;
        this.dataAbate = dataAbate;
        
        viewAvaliacaoPe.getAviarioJFT().setText(aviario);
        viewAvaliacaoPe.getAbateJFT().setText(""+abate);
        viewAvaliacaoPe.getDataAbateJFT().setText(dataAbate);
        
        histOrdens = new ArrayList<>();
        histLacre = new ArrayList<>();
        histPesoPe = new ArrayList<>();
        histEscore = new ArrayList<>();
        histOrdens.add(viewAvaliacaoPe.getOrdemHist1Label());
        histLacre.add(viewAvaliacaoPe.getLacreHist1Label());
        histPesoPe.add(viewAvaliacaoPe.getPesoPeHist1Label());
        histEscore.add(viewAvaliacaoPe.getEscoreHist1Label());
        histOrdens.add(viewAvaliacaoPe.getOrdemHist2Label());
        histLacre.add(viewAvaliacaoPe.getLacreHist2Label());
        histPesoPe.add(viewAvaliacaoPe.getPesoPeHist2Label());
        histEscore.add(viewAvaliacaoPe.getEscoreHist2Label());
        histOrdens.add(viewAvaliacaoPe.getOrdemHist3Label());
        histLacre.add(viewAvaliacaoPe.getLacreHist3Label());
        histPesoPe.add(viewAvaliacaoPe.getPesoPeHist3Label());
        histEscore.add(viewAvaliacaoPe.getEscoreHist3Label());
        histOrdens.add(viewAvaliacaoPe.getOrdemHist4Label());
        histLacre.add(viewAvaliacaoPe.getLacreHist4Label());
        histPesoPe.add(viewAvaliacaoPe.getPesoPeHist4Label());
        histEscore.add(viewAvaliacaoPe.getEscoreHist4Label());
        histOrdens.add(viewAvaliacaoPe.getOrdemHist5Label());
        histLacre.add(viewAvaliacaoPe.getLacreHist5Label());
        histPesoPe.add(viewAvaliacaoPe.getPesoPeHist5Label());
        histEscore.add(viewAvaliacaoPe.getEscoreHist5Label());
       
        lastHist = new ArrayList<>();
        
        List<Component> order = new ArrayList<>();
        order.add(viewAvaliacaoPe.getLacreJFT());
        order.add(viewAvaliacaoPe.getPesoPeJFT());
        order.add(viewAvaliacaoPe.getEscoreJFT());
        order.add(viewAvaliacaoPe.getControleJFT());
        order.add(viewAvaliacaoPe.getOpcaoJFT());
        FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
        viewAvaliacaoPe.setFocusTraversalPolicy(newPolicy);
        listenerSetup(order);
        loadHist();
    }  

    public void listenerSetup(List<Component> textFields) {
        textFields.stream().forEach((it) -> {
            ((JFormattedTextField) it).addKeyListener(this);
            ((JFormattedTextField) it).addFocusListener(this);
        });
    }
    
    public void loadHist() {
        System.out.println("size hist: "+histOrdens.size());
        avaliacaoPe = controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe();
        avaliacaoPeBO.removeLacresZerados(abate);
        ordem = avaliacaoPe.size()+1;
        viewAvaliacaoPe.getOrdemJFT().setText(""+ordem);
        TextFormatter.formatStringJFT(viewAvaliacaoPe.getOrdemJFT(), viewAvaliacaoPe.getOrdemJFT().getText(), 3);
        if (!avaliacaoPe.isEmpty()) {
            System.out.println("nao vazio!");
            for (int i = 0; i < 5; i++) {
                String text = ""+avaliacaoPe.get(avaliacaoPe.size()-5+i).getOrdem();
                histOrdens.get(i).setText(TextFormatter.formatString(text, 3));
                
                text = ""+avaliacaoPe.get(avaliacaoPe.size()-5+i).getLacre();
                histLacre.get(i).setText(TextFormatter.formatString(text, 3));
                
                text = ""+avaliacaoPe.get(avaliacaoPe.size()-5+i).getPesoPe();
                histPesoPe.get(i).setText(TextFormatter.formatString(text, 2));
                
                text = ""+avaliacaoPe.get(avaliacaoPe.size()-5+i).getEscore();
                histEscore.get(i).setText(TextFormatter.formatString(text, 1));
            }
        } else {
            clearHist();
        }
    }
    
    public void clearHist() {        
        histOrdens.stream().forEach((it) -> {
            it.setText("");
        });
        
         histLacre.stream().forEach((it) -> {
            it.setText("");
        });
         
        histPesoPe.stream().forEach((it) -> {
            it.setText("");
        });
          
        histEscore.stream().forEach((it) -> {
            it.setText("");
        });
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        Object src = e.getSource();
        if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewAvaliacaoPe.getLacreJFT())) {
            System.out.println("left");
            Component prev;
            ((JFormattedTextField) src).setEnabled(false);
            if (!e.getSource().equals(viewAvaliacaoPe.getOpcaoJFT())) {
                prev = viewAvaliacaoPe.getFocusTraversalPolicy().getComponentBefore(viewAvaliacaoPe, (JFormattedTextField) src);
            } else {
                prev = viewAvaliacaoPe.getLacreJFT();
            }
            prev.setEnabled(true);
            ((JFormattedTextField) prev).grabFocus();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if ((JFormattedTextField) e.getSource() == viewAvaliacaoPe.getOpcaoJFT()) {
            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    int n = JOptionPane.showConfirmDialog(viewAvaliacaoPe,
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
                    int option = JOptionPane.showConfirmDialog(viewAvaliacaoPe,
                                                               "Deseja realmente voltar para tela de escolha de abate?",
                                                               "DIGEX - Voltar",
                                                               JOptionPane.YES_NO_OPTION,
                                                               JOptionPane.WARNING_MESSAGE);
                    if(option == 0) {
                        viewAvaliacaoPe.setVisible(false);
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
        } if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            int option = JOptionPane.showConfirmDialog(viewAvaliacaoPe,
                                                      "Deseja realmente voltar para tela de escolha de abate?",
                                                      "DIGEX - Voltar",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
            if(option == 0) {
                viewAvaliacaoPe.setVisible(false);
                controller.resumeEscolhaAbate();
                System.out.println("Voltar");
            }
        } else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            JFormattedTextField src = (JFormattedTextField)e.getSource();
            String text = src.getText();
            if ((JFormattedTextField) e.getSource() == viewAvaliacaoPe.getLacreJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewAvaliacaoPe.getPesoPeJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewAvaliacaoPe.getPesoPeJFT()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewAvaliacaoPe.getEscoreJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewAvaliacaoPe.getEscoreJFT()) {
                TextFormatter.formatStringJFT(src, text, 1);
                if (ordem%5 == 0) {
                    viewAvaliacaoPe.getControleJFT().setEnabled(true);
                    ((JFormattedTextField) e.getSource()).transferFocus();
                } else {
                    updateHist();
                    viewAvaliacaoPe.getOrdemJFT().setText(""+(++ordem));
                    TextFormatter.formatStringJFT(viewAvaliacaoPe.getOrdemJFT(), viewAvaliacaoPe.getOrdemJFT().getText(), 3);
                    if (!lastHist.isEmpty()) {
                        viewAvaliacaoPe.getLacreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getLacre(), 3));
                        viewAvaliacaoPe.getPesoPeJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getPesoPe(), 2));
                        viewAvaliacaoPe.getEscoreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getEscore(), 1));
                        lastHist.remove(0);
                    }
                    viewAvaliacaoPe.getLacreJFT().setEnabled(true);
                    viewAvaliacaoPe.getLacreJFT().grabFocus();
                    viewAvaliacaoPe.getPesoPeJFT().setEnabled(false);
                    viewAvaliacaoPe.getEscoreJFT().setEnabled(false);
                    viewAvaliacaoPe.getControleJFT().setEnabled(false);
                }
            } else if ((JFormattedTextField) e.getSource() == viewAvaliacaoPe.getControleJFT()) {
                TextFormatter.formatStringJFT(src, text, 4);
                controle = Integer.parseInt(viewAvaliacaoPe.getControleJFT().getText());
                int somaControle = Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getPesoPeHist2Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getEscoreHist2Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getPesoPeHist3Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getEscoreHist3Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getPesoPeHist4Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getEscoreHist4Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getPesoPeHist5Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getEscoreHist5Label().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getLacreJFT().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getPesoPeJFT().getText())
                                 + Integer.parseInt(viewAvaliacaoPe.getEscoreJFT().getText());
                System.out.println("Soma controle: " + somaControle);
                if (controle != somaControle ) {
                    fluxoProblema();                    
                } else {
                    String msgInexistente = avaliacaoPeBO.verificaLacreInexistente(abate,
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreJFT().getText()));
                    if (msgInexistente.length() != 0) {
                        JOptionPane.showMessageDialog(viewAvaliacaoPe,
                                "Aviso(s):\n" + msgInexistente, "DIGEX - Aviso",
                                JOptionPane.WARNING_MESSAGE);                    
                    }                    
                    String msgErros = avaliacaoPeBO.verificaErros(abate,
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText()),
                            Integer.parseInt(viewAvaliacaoPe.getLacreJFT().getText()));
                    if (msgErros.length() != 0) {
                        JOptionPane.showMessageDialog(viewAvaliacaoPe,
                                "Problema(s):\n" + msgErros, "DIGEX - Erro",
                                JOptionPane.ERROR_MESSAGE);
                        fluxoProblema();
                    } else if (controle == 0) {
                        fluxoOk();
                    } else {
                        List<Integer> lacresDup = avaliacaoPeBO.verificaLacreDuplicado(abate,
                                Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText()),
                                Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText()),
                                Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText()),
                                Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText()),
                                Integer.parseInt(viewAvaliacaoPe.getLacreJFT().getText()));
                        if (lacresDup.size() > 0) {
                            int options = JOptionPane.showConfirmDialog(viewAvaliacaoPe,
                                    "Lacre(s) já digitado(s):\n" + lacresDup + "\n\n" +    
                                    "Deseja sobrescrever este(s) lacre(s) e deletar o(s) anterior(es)?", 
                                    "DIGEX - Erro",
                                    JOptionPane.ERROR_MESSAGE);
                            if (options == 0) {
                                avaliacaoPeBO.excluirAnimais(abate, lacresDup);
                                fluxoCont();              
                            } else {
                                fluxoProblema();
                            }
                        } else {
                            fluxoCont();
                        }
                    }
                    loadHist();
                }
            }
        }
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ((JFormattedTextField) e.getSource()).setCaretPosition(0);
                ((JFormattedTextField)e.getSource()).selectAll();
            }
        });
    }

    @Override
    public void focusLost(FocusEvent e) { }
    
    public void updateHist() {
        viewAvaliacaoPe.getOrdemHist1Label().setText(viewAvaliacaoPe.getOrdemHist2Label().getText());
        viewAvaliacaoPe.getOrdemHist2Label().setText(viewAvaliacaoPe.getOrdemHist3Label().getText());
        viewAvaliacaoPe.getOrdemHist3Label().setText(viewAvaliacaoPe.getOrdemHist4Label().getText());
        viewAvaliacaoPe.getOrdemHist4Label().setText(viewAvaliacaoPe.getOrdemHist5Label().getText());
        viewAvaliacaoPe.getOrdemHist5Label().setText(viewAvaliacaoPe.getOrdemJFT().getText());
        viewAvaliacaoPe.getLacreHist1Label().setText(viewAvaliacaoPe.getLacreHist2Label().getText());
        viewAvaliacaoPe.getLacreHist2Label().setText(viewAvaliacaoPe.getLacreHist3Label().getText());
        viewAvaliacaoPe.getLacreHist3Label().setText(viewAvaliacaoPe.getLacreHist4Label().getText());
        viewAvaliacaoPe.getLacreHist4Label().setText(viewAvaliacaoPe.getLacreHist5Label().getText());
        viewAvaliacaoPe.getLacreHist5Label().setText(viewAvaliacaoPe.getLacreJFT().getText());
        viewAvaliacaoPe.getPesoPeHist1Label().setText(viewAvaliacaoPe.getPesoPeHist2Label().getText());
        viewAvaliacaoPe.getPesoPeHist2Label().setText(viewAvaliacaoPe.getPesoPeHist3Label().getText());
        viewAvaliacaoPe.getPesoPeHist3Label().setText(viewAvaliacaoPe.getPesoPeHist4Label().getText());
        viewAvaliacaoPe.getPesoPeHist4Label().setText(viewAvaliacaoPe.getPesoPeHist5Label().getText());
        viewAvaliacaoPe.getPesoPeHist5Label().setText(viewAvaliacaoPe.getPesoPeJFT().getText());
        viewAvaliacaoPe.getEscoreHist1Label().setText(viewAvaliacaoPe.getEscoreHist2Label().getText());
        viewAvaliacaoPe.getEscoreHist2Label().setText(viewAvaliacaoPe.getEscoreHist3Label().getText());
        viewAvaliacaoPe.getEscoreHist3Label().setText(viewAvaliacaoPe.getEscoreHist4Label().getText());
        viewAvaliacaoPe.getEscoreHist4Label().setText(viewAvaliacaoPe.getEscoreHist5Label().getText());
        viewAvaliacaoPe.getEscoreHist5Label().setText(viewAvaliacaoPe.getEscoreJFT().getText());
        
        viewAvaliacaoPe.getLacreJFT().setText("000");
        viewAvaliacaoPe.getPesoPeJFT().setText("00");
        viewAvaliacaoPe.getEscoreJFT().setText("0");
    }
    
    public void lastHistNok() {
        lastHist.removeAll(lastHist);
        lastHist.add(new AvaliacaoPeVOF(abate,
                                       Integer.parseInt(viewAvaliacaoPe.getOrdemHist2Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getPesoPeHist2Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getEscoreHist2Label().getText())));
        lastHist.add(new AvaliacaoPeVOF(abate,
                                       Integer.parseInt(viewAvaliacaoPe.getOrdemHist3Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getPesoPeHist3Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getEscoreHist3Label().getText())));
        lastHist.add(new AvaliacaoPeVOF(abate,
                                       Integer.parseInt(viewAvaliacaoPe.getOrdemHist4Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getPesoPeHist4Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getEscoreHist4Label().getText())));
        lastHist.add(new AvaliacaoPeVOF(abate,
                                       Integer.parseInt(viewAvaliacaoPe.getOrdemHist5Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getPesoPeHist5Label().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getEscoreHist5Label().getText())));
        lastHist.add(new AvaliacaoPeVOF(abate,
                                       Integer.parseInt(viewAvaliacaoPe.getOrdemJFT().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getLacreJFT().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getPesoPeJFT().getText()),
                                       Integer.parseInt(viewAvaliacaoPe.getEscoreJFT().getText())));
    }
    
    public void fluxoProblema() {
        lastHistNok();
        loadHist();
        viewAvaliacaoPe.getLacreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getLacre(), 3));
        viewAvaliacaoPe.getPesoPeJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getPesoPe(), 2));
        viewAvaliacaoPe.getEscoreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getEscore(), 1));
        lastHist.remove(0);
        viewAvaliacaoPe.getAvaliacaoPeJP().setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        viewAvaliacaoPe.getLacreJFT().setEnabled(true);
        viewAvaliacaoPe.getLacreJFT().grabFocus();
        viewAvaliacaoPe.getPesoPeJFT().setEnabled(false);
        viewAvaliacaoPe.getEscoreJFT().setEnabled(false);
        viewAvaliacaoPe.getControleJFT().setEnabled(false);
    }
    
    public void fluxoCont() {
        SaveUpdater.startCountdown(5, viewAvaliacaoPe.getRegistroLabel());
        updateHist();
        viewAvaliacaoPe.getControleJFT().setText("0000");
        viewAvaliacaoPe.getOrdemJFT().setText(""+(++ordem));
        TextFormatter.formatStringJFT(viewAvaliacaoPe.getOrdemJFT(), viewAvaliacaoPe.getOrdemJFT().getText(), 3);
                
        viewAvaliacaoPe.getAvaliacaoPeJP().setBorder(defaultBorder);
        viewAvaliacaoPe.getLacreJFT().setEnabled(true);
        viewAvaliacaoPe.getLacreJFT().grabFocus();
        viewAvaliacaoPe.getPesoPeJFT().setEnabled(false);
        viewAvaliacaoPe.getEscoreJFT().setEnabled(false);
        viewAvaliacaoPe.getControleJFT().setEnabled(false);
        
        // Salva variáveis de avaliação de pé digitadas
        avaliacaoPe.add(new AvaliacaoPeVOF(abate,
                                          Integer.parseInt(viewAvaliacaoPe.getOrdemHist1Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getLacreHist1Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getPesoPeHist1Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getEscoreHist1Label().getText())));
        avaliacaoPe.add(new AvaliacaoPeVOF(abate,
                                          Integer.parseInt(viewAvaliacaoPe.getOrdemHist2Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getLacreHist2Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getPesoPeHist2Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getEscoreHist2Label().getText())));
        avaliacaoPe.add(new AvaliacaoPeVOF(abate,
                                          Integer.parseInt(viewAvaliacaoPe.getOrdemHist3Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getLacreHist3Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getPesoPeHist3Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getEscoreHist3Label().getText())));
        avaliacaoPe.add(new AvaliacaoPeVOF(abate,
                                          Integer.parseInt(viewAvaliacaoPe.getOrdemHist4Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getLacreHist4Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getPesoPeHist4Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getEscoreHist4Label().getText())));
        avaliacaoPe.add(new AvaliacaoPeVOF(abate,
                                          Integer.parseInt(viewAvaliacaoPe.getOrdemHist5Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getLacreHist5Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getPesoPeHist5Label().getText()),
                                          Integer.parseInt(viewAvaliacaoPe.getEscoreHist5Label().getText())));                        
        controller.getModel().getModelStateDAO().saveModelState(false);
        System.out.println("próx 5 avaliações de pé");
    }
    
    public void fluxoOk() {
        viewAvaliacaoPe.getAvaliacaoPeJP().setBorder(defaultBorder);
        viewAvaliacaoPe.getLacreJFT().setEnabled(false);
        viewAvaliacaoPe.getPesoPeJFT().setEnabled(false);
        viewAvaliacaoPe.getEscoreJFT().setEnabled(false);
        viewAvaliacaoPe.getControleJFT().setEnabled(false);
        viewAvaliacaoPe.getOpcaoJFT().setEnabled(true);
        viewAvaliacaoPe.getOpcaoJFT().grabFocus();
    }
}
