package brf.frango.controller;

import brf.frango.model.bo.LacreAnilhaBOF;
import brf.frango.model.vo.LacreAnilhaVOF;
import brf.frango.view.ViewLacreAnilhaF;
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

public class ControllerLacreAnilhaF extends KeyAdapter 
        implements FocusListener {
    private final ControllerF controller;
    private ViewLacreAnilhaF viewLacreAnilha;
    private Border defaultBorder;
    private int controle;
    private List<LacreAnilhaVOF> lacreAnilha;
    private List<LacreAnilhaVOF> lastHist;
    private int ordem;
    private String aviario;
    private int abate;
    private String dataAbate;
    private List<JLabel> histOrdens;
    private List<JLabel> histBaia;
    private List<JLabel> histNasa;
    private List<JLabel> histLacre;
    private LacreAnilhaBOF lacreAnilhaBO;
    
    public ControllerLacreAnilhaF(ControllerF c, LacreAnilhaBOF lacreAnilhaBO) {
        controller = c;
        this.lacreAnilhaBO = lacreAnilhaBO;
    }

    public void openWindow(String aviario, int abate, String dataAbate) {
        viewLacreAnilha = new ViewLacreAnilhaF();
        viewLacreAnilha.setTitle("DIGEX - Frango");
        viewLacreAnilha.setResizable(false);
        viewLacreAnilha.setLocationRelativeTo(null);
        viewLacreAnilha.setVisible(true);
        viewLacreAnilha.getRegistroLabel().setVisible(false);
        defaultBorder = viewLacreAnilha.getLacreAnilhaJP().getBorder();
        
        this.aviario = aviario;
        this.abate = abate;
        this.dataAbate = dataAbate;
        
        viewLacreAnilha.getAviarioJFT().setText(aviario);
        viewLacreAnilha.getAbateJFT().setText(""+abate);
        viewLacreAnilha.getDataAbateJFT().setText(dataAbate);
        
        histOrdens = new ArrayList<>();
        histBaia = new ArrayList<>();
        histNasa = new ArrayList<>();
        histLacre = new ArrayList<>();
        histOrdens.add(viewLacreAnilha.getOrdemHist1Label());
        histBaia.add(viewLacreAnilha.getBaiaHist1Label());
        histNasa.add(viewLacreAnilha.getNasaHist1Label());
        histLacre.add(viewLacreAnilha.getLacreHist1Label());
        histOrdens.add(viewLacreAnilha.getOrdemHist2Label());
        histBaia.add(viewLacreAnilha.getBaiaHist2Label());
        histNasa.add(viewLacreAnilha.getNasaHist2Label());
        histLacre.add(viewLacreAnilha.getLacreHist2Label());
        histOrdens.add(viewLacreAnilha.getOrdemHist3Label());
        histBaia.add(viewLacreAnilha.getBaiaHist3Label());
        histNasa.add(viewLacreAnilha.getNasaHist3Label());
        histLacre.add(viewLacreAnilha.getLacreHist3Label());
        histOrdens.add(viewLacreAnilha.getOrdemHist4Label());
        histBaia.add(viewLacreAnilha.getBaiaHist4Label());
        histNasa.add(viewLacreAnilha.getNasaHist4Label());
        histLacre.add(viewLacreAnilha.getLacreHist4Label());
        histOrdens.add(viewLacreAnilha.getOrdemHist5Label());
        histBaia.add(viewLacreAnilha.getBaiaHist5Label());
        histNasa.add(viewLacreAnilha.getNasaHist5Label());
        histLacre.add(viewLacreAnilha.getLacreHist5Label());
        
        lastHist = new ArrayList<>();
        
        List<Component> order = new ArrayList<>();
        order.add(viewLacreAnilha.getBaiaJFT());
        order.add(viewLacreAnilha.getNasaJFT());
        order.add(viewLacreAnilha.getLacreJFT());
        order.add(viewLacreAnilha.getControleJFT());
        order.add(viewLacreAnilha.getOpcaoJFT());
        FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
        viewLacreAnilha.setFocusTraversalPolicy(newPolicy);
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
        lacreAnilha = controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha();
        lacreAnilhaBO.removeNasasZeradas(abate);
        ordem = lacreAnilha.size()+1;
        viewLacreAnilha.getOrdemJFT().setText(""+ordem);
        TextFormatter.formatStringJFT(viewLacreAnilha.getOrdemJFT(), viewLacreAnilha.getOrdemJFT().getText(), 3);
        if (!lacreAnilha.isEmpty()) {
            System.out.println("nao vazio!");
            for (int i = 0; i < 5; i++) {
                String text = ""+lacreAnilha.get(lacreAnilha.size()-5+i).getOrdem();
                if (text.length() == 2) {
                    text = "0"+text;
                } else if (text.length() == 1) {
                    text = "00"+text;
                }
                histOrdens.get(i).setText(text);
                
                text = ""+lacreAnilha.get(lacreAnilha.size()-5+i).getBaia();
                if (text.length() == 2) {
                    text = "0"+text;
                } else if (text.length() == 1) {
                    text = "00"+text;
                }
                histBaia.get(i).setText(text);
                
                text = ""+lacreAnilha.get(lacreAnilha.size()-5+i).getNasa();
                if (text.length() == 2) {
                    text = "0"+text;
                } else if (text.length() == 1) {
                    text = "00"+text;
                }
                histNasa.get(i).setText(text);
                
                text = ""+lacreAnilha.get(lacreAnilha.size()-5+i).getLacre();
                if (text.length() == 2) {
                    text = "0"+text;
                } else if (text.length() == 1) {
                    text = "00"+text;
                }
                histLacre.get(i).setText(text);
            }
        } else {
            clearHist();
        }
    }
    
    public void clearHist() {        
        histOrdens.stream().forEach((it) -> {
            it.setText("");
        });
        
         histBaia.stream().forEach((it) -> {
            it.setText("");
        });
         
        histNasa.stream().forEach((it) -> {
            it.setText("");
        });
          
        histLacre.stream().forEach((it) -> {
            it.setText("");
        });
    }

    public void resumeWindow() {
//        loadHist();
        viewLacreAnilha.setLocationRelativeTo(null);
        viewLacreAnilha.setVisible(true);
        viewLacreAnilha.getOpcaoJFT().setText("");
        viewLacreAnilha.getOpcaoJFT().setEnabled(false);
        viewLacreAnilha.getBaiaJFT().setEnabled(true);
        viewLacreAnilha.getBaiaJFT().grabFocus();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        Object src = e.getSource();
        if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewLacreAnilha.getBaiaJFT())) {
            System.out.println("left");
            Component prev;
            ((JFormattedTextField) src).setEnabled(false);
            if (!e.getSource().equals(viewLacreAnilha.getOpcaoJFT())) {
                prev = viewLacreAnilha.getFocusTraversalPolicy().getComponentBefore(viewLacreAnilha, (JFormattedTextField) src);
            } else {
                prev = viewLacreAnilha.getBaiaJFT();
            }
            prev.setEnabled(true);
            ((JFormattedTextField) prev).grabFocus();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if ((JFormattedTextField) e.getSource() == viewLacreAnilha.getOpcaoJFT()) {
            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    int n = JOptionPane.showConfirmDialog(viewLacreAnilha,
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
                    viewLacreAnilha.setVisible(false);
                    controller.startAvaliacaoPe(aviario, abate, dataAbate);
                    break;
                case KeyEvent.VK_9:
                    int option = JOptionPane.showConfirmDialog(viewLacreAnilha,
                                                               "Deseja realmente voltar para tela anterior?",
                                                               "DIGEX - Voltar",
                                                               JOptionPane.YES_NO_OPTION,
                                                               JOptionPane.WARNING_MESSAGE);
                    if(option == 0) {
                        viewLacreAnilha.setVisible(false);
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
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            int option = JOptionPane.showConfirmDialog(viewLacreAnilha,
                                                      "Deseja realmente voltar para tela anterior?",
                                                      "DIGEX - Voltar",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
            if(option == 0) {
                viewLacreAnilha.setVisible(false);
                controller.resumeEscolhaAbate();
                System.out.println("Voltar");
            }
        } else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            JFormattedTextField src = (JFormattedTextField)e.getSource();
            String text = src.getText();
            if ((JFormattedTextField) e.getSource() == viewLacreAnilha.getBaiaJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewLacreAnilha.getNasaJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewLacreAnilha.getNasaJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewLacreAnilha.getLacreJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewLacreAnilha.getLacreJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                if (ordem%5 == 0) {
                    viewLacreAnilha.getControleJFT().setEnabled(true);
                    ((JFormattedTextField) e.getSource()).transferFocus();
                } else {
                    updateHist();
                    viewLacreAnilha.getOrdemJFT().setText(""+(++ordem));
                    TextFormatter.formatStringJFT(viewLacreAnilha.getOrdemJFT(), viewLacreAnilha.getOrdemJFT().getText(), 3);
                    if (!lastHist.isEmpty()) {
                        viewLacreAnilha.getBaiaJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getBaia(), 3));
                        viewLacreAnilha.getNasaJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getNasa(), 3));
                        viewLacreAnilha.getLacreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getLacre(), 3));
                        lastHist.remove(0);
                    }
                    viewLacreAnilha.getBaiaJFT().setEnabled(true);
                    viewLacreAnilha.getBaiaJFT().grabFocus();
                    viewLacreAnilha.getNasaJFT().setEnabled(false);
                    viewLacreAnilha.getLacreJFT().setEnabled(false);
                    viewLacreAnilha.getControleJFT().setEnabled(false);
                }
            } else if ((JFormattedTextField) e.getSource() == viewLacreAnilha.getControleJFT()) {
                TextFormatter.formatStringJFT(src, text, 5);
                controle = Integer.parseInt(viewLacreAnilha.getControleJFT().getText());
                int somaControle = Integer.parseInt(viewLacreAnilha.getBaiaHist2Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getNasaHist2Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getLacreHist2Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getBaiaHist3Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getNasaHist3Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getLacreHist3Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getBaiaHist4Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getNasaHist4Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getLacreHist4Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getBaiaHist5Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getNasaHist5Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getLacreHist5Label().getText())
                                 + Integer.parseInt(viewLacreAnilha.getBaiaJFT().getText())
                                 + Integer.parseInt(viewLacreAnilha.getNasaJFT().getText())
                                 + Integer.parseInt(viewLacreAnilha.getLacreJFT().getText());
                System.out.println("Soma controle: " + somaControle);
                if (controle != somaControle ) {
                    fluxoProblema();
                } else {
                    String msgErros = lacreAnilhaBO.verificaErros(abate,
                            Integer.parseInt(viewLacreAnilha.getNasaHist2Label().getText()),
                            Integer.parseInt(viewLacreAnilha.getNasaHist3Label().getText()),
                            Integer.parseInt(viewLacreAnilha.getNasaHist4Label().getText()),
                            Integer.parseInt(viewLacreAnilha.getNasaHist5Label().getText()),
                            Integer.parseInt(viewLacreAnilha.getNasaJFT().getText()));
                    if (msgErros.length() != 0) {
                        JOptionPane.showMessageDialog(viewLacreAnilha,
                                "Problema(s):\n" + msgErros, "DIGEX - Erro",
                                JOptionPane.ERROR_MESSAGE);
                        fluxoProblema();
                    } else if (controle == 0) {
                        if (!lacreAnilhaBO.temDados(abate)) {
                            JOptionPane.showMessageDialog(viewLacreAnilha,
                                    "Problema:\n" + "Não há dados!", "DIGEX - Erro",
                                    JOptionPane.ERROR_MESSAGE);
                            fluxoProblema();
                        } else {
                            fluxoOk();
                        }
                    } else {
                        List<Integer> nasasDup = lacreAnilhaBO.verificaNasaDuplicada(abate,
                                Integer.parseInt(viewLacreAnilha.getNasaHist2Label().getText()),
                                Integer.parseInt(viewLacreAnilha.getNasaHist3Label().getText()),
                                Integer.parseInt(viewLacreAnilha.getNasaHist4Label().getText()),
                                Integer.parseInt(viewLacreAnilha.getNasaHist5Label().getText()),
                                Integer.parseInt(viewLacreAnilha.getNasaJFT().getText()));
                        if (nasasDup.size() > 0) {
                            int options = JOptionPane.showConfirmDialog(viewLacreAnilha,
                                    "Anilha(s) já digitada(s):\n" + nasasDup + "\n\n" +    
                                    "Deseja sobrescrever esta(s) anilha(s) e deletar a(s) anterior(es)?", 
                                    "DIGEX - Erro",
                                    JOptionPane.ERROR_MESSAGE);
                            if (options == 0) {
                                lacreAnilhaBO.excluirAnimais(abate, nasasDup);
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
        viewLacreAnilha.getOrdemHist1Label().setText(viewLacreAnilha.getOrdemHist2Label().getText());
        viewLacreAnilha.getOrdemHist2Label().setText(viewLacreAnilha.getOrdemHist3Label().getText());
        viewLacreAnilha.getOrdemHist3Label().setText(viewLacreAnilha.getOrdemHist4Label().getText());
        viewLacreAnilha.getOrdemHist4Label().setText(viewLacreAnilha.getOrdemHist5Label().getText());
        viewLacreAnilha.getOrdemHist5Label().setText(viewLacreAnilha.getOrdemJFT().getText());
        viewLacreAnilha.getBaiaHist1Label().setText(viewLacreAnilha.getBaiaHist2Label().getText());
        viewLacreAnilha.getBaiaHist2Label().setText(viewLacreAnilha.getBaiaHist3Label().getText());
        viewLacreAnilha.getBaiaHist3Label().setText(viewLacreAnilha.getBaiaHist4Label().getText());
        viewLacreAnilha.getBaiaHist4Label().setText(viewLacreAnilha.getBaiaHist5Label().getText());
        viewLacreAnilha.getBaiaHist5Label().setText(viewLacreAnilha.getBaiaJFT().getText());
        viewLacreAnilha.getNasaHist1Label().setText(viewLacreAnilha.getNasaHist2Label().getText());
        viewLacreAnilha.getNasaHist2Label().setText(viewLacreAnilha.getNasaHist3Label().getText());
        viewLacreAnilha.getNasaHist3Label().setText(viewLacreAnilha.getNasaHist4Label().getText());
        viewLacreAnilha.getNasaHist4Label().setText(viewLacreAnilha.getNasaHist5Label().getText());
        viewLacreAnilha.getNasaHist5Label().setText(viewLacreAnilha.getNasaJFT().getText());
        viewLacreAnilha.getLacreHist1Label().setText(viewLacreAnilha.getLacreHist2Label().getText());
        viewLacreAnilha.getLacreHist2Label().setText(viewLacreAnilha.getLacreHist3Label().getText());
        viewLacreAnilha.getLacreHist3Label().setText(viewLacreAnilha.getLacreHist4Label().getText());
        viewLacreAnilha.getLacreHist4Label().setText(viewLacreAnilha.getLacreHist5Label().getText());
        viewLacreAnilha.getLacreHist5Label().setText(viewLacreAnilha.getLacreJFT().getText());
        
        viewLacreAnilha.getBaiaJFT().setText("000");
        viewLacreAnilha.getNasaJFT().setText("000");
        viewLacreAnilha.getLacreJFT().setText("000");
    }
    
    public void lastHistNok() {
        lastHist.removeAll(lastHist);
        lastHist.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist2Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getBaiaHist2Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getNasaHist2Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getLacreHist2Label().getText())));
        lastHist.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist3Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getBaiaHist3Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getNasaHist3Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getLacreHist3Label().getText())));
        lastHist.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist4Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getBaiaHist4Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getNasaHist4Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getLacreHist4Label().getText())));
        lastHist.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist5Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getBaiaHist5Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getNasaHist5Label().getText()),
                                      Integer.parseInt(viewLacreAnilha.getLacreHist5Label().getText())));
        lastHist.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemJFT().getText()),
                                      Integer.parseInt(viewLacreAnilha.getBaiaJFT().getText()),
                                      Integer.parseInt(viewLacreAnilha.getNasaJFT().getText()),
                                      Integer.parseInt(viewLacreAnilha.getLacreJFT().getText())));
    }
    
    public void fluxoProblema(){
        lastHistNok();
        loadHist();
        viewLacreAnilha.getBaiaJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getBaia(), 3));
        viewLacreAnilha.getNasaJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getNasa(), 3));
        viewLacreAnilha.getLacreJFT().setText(TextFormatter.formatString(""+lastHist.get(0).getLacre(), 3));
        lastHist.remove(0);
        viewLacreAnilha.getLacreAnilhaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        viewLacreAnilha.getBaiaJFT().setEnabled(true);
        viewLacreAnilha.getBaiaJFT().grabFocus();
        viewLacreAnilha.getNasaJFT().setEnabled(false);
        viewLacreAnilha.getLacreJFT().setEnabled(false);
        viewLacreAnilha.getControleJFT().setEnabled(false);
    }
    
    public void fluxoCont() {
        SaveUpdater.startCountdown(5, viewLacreAnilha.getRegistroLabel());
        updateHist();
        viewLacreAnilha.getControleJFT().setText("00000");
        viewLacreAnilha.getOrdemJFT().setText(""+(++ordem));
        TextFormatter.formatStringJFT(viewLacreAnilha.getOrdemJFT(), viewLacreAnilha.getOrdemJFT().getText(), 3);
        
        viewLacreAnilha.getLacreAnilhaJP().setBorder(defaultBorder);
        viewLacreAnilha.getBaiaJFT().setEnabled(true);
        viewLacreAnilha.getBaiaJFT().grabFocus();
        viewLacreAnilha.getNasaJFT().setEnabled(false);
        viewLacreAnilha.getLacreJFT().setEnabled(false);
        viewLacreAnilha.getControleJFT().setEnabled(false);

        // Salva variáveis de lacre/anilha digitadas
        lacreAnilha.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist1Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getBaiaHist1Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getNasaHist1Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getLacreHist1Label().getText())));
        lacreAnilha.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist2Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getBaiaHist2Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getNasaHist2Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getLacreHist2Label().getText())));
        lacreAnilha.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist3Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getBaiaHist3Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getNasaHist3Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getLacreHist3Label().getText())));
        lacreAnilha.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist4Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getBaiaHist4Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getNasaHist4Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getLacreHist4Label().getText())));
        lacreAnilha.add(new LacreAnilhaVOF(Integer.parseInt(viewLacreAnilha.getOrdemHist5Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getBaiaHist5Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getNasaHist5Label().getText()),
                                          Integer.parseInt(viewLacreAnilha.getLacreHist5Label().getText())));                        
        controller.getModel().getModelStateDAO().saveModelState(false);
        System.out.println("próx 5 lacres/anilhas");  
    }
    
    public void fluxoOk() {
        viewLacreAnilha.getLacreAnilhaJP().setBorder(defaultBorder);
        viewLacreAnilha.getBaiaJFT().setEnabled(false);
        viewLacreAnilha.getNasaJFT().setEnabled(false);
        viewLacreAnilha.getLacreJFT().setEnabled(false);
        viewLacreAnilha.getControleJFT().setEnabled(false);
        viewLacreAnilha.getOpcaoJFT().setEnabled(true);
        viewLacreAnilha.getOpcaoJFT().grabFocus();
    }
}
