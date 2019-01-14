package brf.frango.controller;

import brf.frango.model.bo.BaiaAnilhaBOF;
import brf.frango.model.vo.BaiaAnilhaVOF;
import brf.frango.view.ViewBaiaAnilhaF;
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

public class ControllerBaiaAnilhaF extends KeyAdapter
        implements FocusListener {
    private final ControllerF controller;
    private ViewBaiaAnilhaF viewBaiaAnilha;
    private Border defaultBorder;
    private int controle;
    private List<BaiaAnilhaVOF> baiaAnilha;
    private List<BaiaAnilhaVOF> lastHist;
    private int ordem;
    private String aviario;
    private int abate;
    private String dataAbate;
    private List<JLabel> histOrdens;
    private List<JLabel> histBaias;
    private List<JLabel> histSexos;
    private List<JLabel> histLados;
    private List<JLabel> histTrats1;
    private List<JLabel> histTrats2;
    private List<JLabel> histInicioAnilhas;
    private List<JLabel> histFimAnilhas;
    private List<JLabel> histControles;
    private BaiaAnilhaBOF baiaAnilhaBO;
    
    public ControllerBaiaAnilhaF(ControllerF c, BaiaAnilhaBOF baiaAnilhaBO) {
        controller = c;
        this.baiaAnilhaBO = baiaAnilhaBO;
    }

    public void openWindow(String aviario, int abate, String dataAbate) {
        viewBaiaAnilha = new ViewBaiaAnilhaF();
        viewBaiaAnilha.setTitle("DIGEX - Frango");
        viewBaiaAnilha.setResizable(false);
        viewBaiaAnilha.setLocationRelativeTo(null);
        viewBaiaAnilha.setVisible(true);
        viewBaiaAnilha.getRegistroLabel().setVisible(false);
        defaultBorder = viewBaiaAnilha.getBaiaAnilhaJP().getBorder();
        
        this.aviario = aviario;
        this.abate = abate;
        this.dataAbate = dataAbate;
        
        
        viewBaiaAnilha.getAviarioJFT().setText(aviario);
        viewBaiaAnilha.getAbateJFT().setText(""+abate);
        viewBaiaAnilha.getDataAbateJFT().setText(dataAbate);
        
        histOrdens = new ArrayList<>();
        histBaias = new ArrayList<>();
        histSexos = new ArrayList<>();
        histLados = new ArrayList<>();
        histTrats1 = new ArrayList<>();
        histTrats2 = new ArrayList<>();
        histInicioAnilhas = new ArrayList<>();
        histFimAnilhas = new ArrayList<>();
        histControles = new ArrayList<>();
        histOrdens.add(viewBaiaAnilha.getOrdemHist1Label());
        histBaias.add(viewBaiaAnilha.getBaiaHist1Label());
        histSexos.add(viewBaiaAnilha.getSexoHist1Label());
        histLados.add(viewBaiaAnilha.getLadoHist1Label());
        histTrats1.add(viewBaiaAnilha.getTrat1Hist1Label());
        histTrats2.add(viewBaiaAnilha.getTrat2Hist1Label());
        histInicioAnilhas.add(viewBaiaAnilha.getInicioAnilha1Hist1Label());
        histFimAnilhas.add(viewBaiaAnilha.getFimAnilhaHist1Label());
        histControles.add(viewBaiaAnilha.getControleHist1Label());
        histOrdens.add(viewBaiaAnilha.getOrdemHist2Label());
        histBaias.add(viewBaiaAnilha.getBaiaHist2Label());
        histSexos.add(viewBaiaAnilha.getSexoHist2Label());
        histLados.add(viewBaiaAnilha.getLadoHist2Label());
        histTrats1.add(viewBaiaAnilha.getTrat1Hist2Label());
        histTrats2.add(viewBaiaAnilha.getTrat2Hist2Label());
        histInicioAnilhas.add(viewBaiaAnilha.getInicioAnilha1Hist2Label());
        histFimAnilhas.add(viewBaiaAnilha.getFimAnilhaHist2Label());
        histControles.add(viewBaiaAnilha.getControleHist2Label());
        histOrdens.add(viewBaiaAnilha.getOrdemHist3Label());
        histBaias.add(viewBaiaAnilha.getBaiaHist3Label());
        histSexos.add(viewBaiaAnilha.getSexoHist3Label());
        histLados.add(viewBaiaAnilha.getLadoHist3Label());
        histTrats1.add(viewBaiaAnilha.getTrat1Hist3Label());
        histTrats2.add(viewBaiaAnilha.getTrat2Hist3Label());
        histInicioAnilhas.add(viewBaiaAnilha.getInicioAnilha1Hist3Label());
        histFimAnilhas.add(viewBaiaAnilha.getFimAnilhaHist3Label());
        histControles.add(viewBaiaAnilha.getControleHist3Label());
        histOrdens.add(viewBaiaAnilha.getOrdemHist4Label());
        histBaias.add(viewBaiaAnilha.getBaiaHist4Label());
        histSexos.add(viewBaiaAnilha.getSexoHist4Label());
        histLados.add(viewBaiaAnilha.getLadoHist4Label());
        histTrats1.add(viewBaiaAnilha.getTrat1Hist4Label());
        histTrats2.add(viewBaiaAnilha.getTrat2Hist4Label());
        histInicioAnilhas.add(viewBaiaAnilha.getInicioAnilha1Hist4Label());
        histFimAnilhas.add(viewBaiaAnilha.getFimAnilhaHist4Label());
        histControles.add(viewBaiaAnilha.getControleHist4Label());
        histOrdens.add(viewBaiaAnilha.getOrdemHist5Label());
        histBaias.add(viewBaiaAnilha.getBaiaHist5Label());
        histSexos.add(viewBaiaAnilha.getSexoHist5Label());
        histLados.add(viewBaiaAnilha.getLadoHist5Label());
        histTrats1.add(viewBaiaAnilha.getTrat1Hist5Label());
        histTrats2.add(viewBaiaAnilha.getTrat2Hist5Label());
        histInicioAnilhas.add(viewBaiaAnilha.getInicioAnilha1Hist5Label());
        histFimAnilhas.add(viewBaiaAnilha.getFimAnilhaHist5Label());
        histControles.add(viewBaiaAnilha.getControleHist5Label());
        
        
        lastHist = new ArrayList<>();

        List<Component> order = new ArrayList<>();
        order.add(viewBaiaAnilha.getBaiaJFT());
        order.add(viewBaiaAnilha.getSexoJFT());
        order.add(viewBaiaAnilha.getLadoJFT());
        order.add(viewBaiaAnilha.getTrat1JFT());
        order.add(viewBaiaAnilha.getTrat2JFT());
        order.add(viewBaiaAnilha.getInicioAnilhaJFT());
        order.add(viewBaiaAnilha.getFimAnilhaJFT());
        order.add(viewBaiaAnilha.getControleJFT());
        order.add(viewBaiaAnilha.getOpcaoJFT());
        FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
        viewBaiaAnilha.setFocusTraversalPolicy(newPolicy);
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
        baiaAnilha = controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBaiaAnilha();
        ordem = baiaAnilha.size()+1;
        viewBaiaAnilha.getOrdemJFT().setText(""+ordem);
        TextFormatter.formatStringJFT(viewBaiaAnilha.getOrdemJFT(), viewBaiaAnilha.getOrdemJFT().getText(), 3);
        if (!baiaAnilha.isEmpty()) {
            System.out.println("nao vazio");
            int histSize = 5;
            if (baiaAnilha.size() < 5) {
                for (int i = baiaAnilha.size() - 1; i >= 0; i--) {
                    String text = ""+baiaAnilha.get(i).getOrdem();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histSize--;
                    histOrdens.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getBaia();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histBaias.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getSexo();
                    histSexos.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getLado();
                    histLados.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getTrat1();
                    if (text.length() == 1) {
                        text = "0"+text;
                    }
                    histTrats1.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getTrat2();
                    if (text.length() == 1) {
                        text = "0"+text;
                    }
                    histTrats2.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getInicioAnilha();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histInicioAnilhas.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getFimAnilha();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histFimAnilhas.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(i).getControle();
                    if (text.length() == 3) {
                        text = "0"+text;
                    } else if (text.length() == 2) {
                        text = "00"+text;
                    } else if (text.length() == 1) {
                        text = "000"+text;
                    }
                    histControles.get(histSize).setText(text);
                }
            } else {
                histSize = 0;
                for (int i = 0; i < 5; i++) {
                    String text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getOrdem();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histOrdens.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getBaia();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histBaias.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getSexo();
                    histSexos.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getLado();
                    histLados.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getTrat1();
                    if (text.length() == 1) {
                        text = "0"+text;
                    }
                    histTrats1.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getTrat2();
                    if (text.length() == 1) {
                        text = "0"+text;
                    }
                    histTrats2.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getInicioAnilha();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histInicioAnilhas.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getFimAnilha();
                    if (text.length() == 2) {
                        text = "0"+text;
                    } else if (text.length() == 1) {
                        text = "00"+text;
                    }
                    histFimAnilhas.get(histSize).setText(text);
                    
                    text = ""+baiaAnilha.get(baiaAnilha.size()-5+i).getControle();
                    if (text.length() == 3) {
                        text = "0"+text;
                    } else if (text.length() == 2) {
                        text = "00"+text;
                    } else if (text.length() == 1) {
                        text = "000"+text;
                    }
                    histControles.get(histSize).setText(text);
                    histSize++;
                }
            }
        } else {
            clearHist();
        }
    }
    
    public void clearHist() {        
        histOrdens.stream().forEach((it) -> {
            it.setText("");
        });
        
         histBaias.stream().forEach((it) -> {
            it.setText("");
        });
         
        histSexos.stream().forEach((it) -> {
            it.setText("");
        });
          
        histLados.stream().forEach((it) -> {
            it.setText("");
        });
           
        histTrats1.stream().forEach((it) -> {
            it.setText("");
        });
            
        histTrats2.stream().forEach((it) -> {
            it.setText("");
        });
             
        histInicioAnilhas.stream().forEach((it) -> {
            it.setText("");
        });
              
        histFimAnilhas.stream().forEach((it) -> {
            it.setText("");
        });
               
        histControles.stream().forEach((it) -> {
            it.setText("");
        });
    }

    public void resumeWindow() {
        viewBaiaAnilha.setLocationRelativeTo(null);
        viewBaiaAnilha.setVisible(true);
        viewBaiaAnilha.getOpcaoJFT().setText("");
        viewBaiaAnilha.getOpcaoJFT().setEnabled(false);
        viewBaiaAnilha.getBaiaJFT().setEnabled(true);
        viewBaiaAnilha.getBaiaJFT().grabFocus();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        Object src = e.getSource();
        if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewBaiaAnilha.getBaiaJFT())) {
            System.out.println("left");
            Component prev;
            ((JFormattedTextField) src).setEnabled(false);
            if (!e.getSource().equals(viewBaiaAnilha.getOpcaoJFT())) {
                prev = viewBaiaAnilha.getFocusTraversalPolicy().getComponentBefore(viewBaiaAnilha, (JFormattedTextField) src);
            } else {
                prev = viewBaiaAnilha.getBaiaJFT();
            }
            prev.setEnabled(true);
            ((JFormattedTextField) prev).grabFocus();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getOpcaoJFT()) {
            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    int n = JOptionPane.showConfirmDialog(viewBaiaAnilha,
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
                    viewBaiaAnilha.setVisible(false);
                    controller.resumeEscolhaBal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    ((JFormattedTextField)e.getComponent()).setCaretPosition(0);
                    ((JFormattedTextField)e.getComponent()).selectAll();
                    break;
            }
        }
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            int option = JOptionPane.showConfirmDialog(viewBaiaAnilha,
                                                      "Deseja realmente voltar para tela anterior?",
                                                      "DIGEX - Voltar",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
            if(option == 0) {
                viewBaiaAnilha.setVisible(false);
                controller.resumeEscolhaBal();
                System.out.println("Voltar");
            }
        } else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            JFormattedTextField src = (JFormattedTextField)e.getSource();
            String text = src.getText();
            if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getBaiaJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewBaiaAnilha.getSexoJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getSexoJFT()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewBaiaAnilha.getLadoJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getLadoJFT()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewBaiaAnilha.getTrat1JFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getTrat1JFT()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewBaiaAnilha.getTrat2JFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getTrat2JFT()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewBaiaAnilha.getInicioAnilhaJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            }  else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getInicioAnilhaJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewBaiaAnilha.getFimAnilhaJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            }  else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getFimAnilhaJFT()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewBaiaAnilha.getControleJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewBaiaAnilha.getControleJFT()) {
                TextFormatter.formatStringJFT(src, text, 4);
                controle = Integer.parseInt(viewBaiaAnilha.getControleJFT().getText());
                int somaControle = Integer.parseInt(viewBaiaAnilha.getBaiaJFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getSexoJFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getLadoJFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getTrat1JFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getTrat2JFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getInicioAnilhaJFT().getText())
                        + Integer.parseInt(viewBaiaAnilha.getFimAnilhaJFT().getText());
                if (controle != somaControle) {
                    fluxoProblema();
                } else {
                    if (controle == 0) {
                        fluxoOk();
                    } else {
                        String msgDup = "Problema(s):\n";
                        List<Integer> nasasDup = baiaAnilhaBO.verificaNasasDuplicadas(abate,
                                Integer.parseInt(viewBaiaAnilha.getInicioAnilhaJFT().getText()),
                                Integer.parseInt(viewBaiaAnilha.getFimAnilhaJFT().getText()));
                        if (nasasDup.size() > 0) {
                            List<Integer> baiasAnilhasDup = baiaAnilhaBO.getBaiasAnilhasDup();
                            for (int i = 0; i < nasasDup.size(); i++) {
                                msgDup = msgDup.concat("\n- Anilha " + nasasDup.get(i) + " já digitada na Baia " + baiasAnilhasDup.get(i));
                            }
                            int options = JOptionPane.showConfirmDialog(viewBaiaAnilha,
                                    msgDup + "\n\n" +    
                                    "Deseja deletar tudo e iniciar novamente a digitação?", 
                                    "DIGEX - Erro",
                                    JOptionPane.ERROR_MESSAGE);
                            if (options == 0) {
                                baiaAnilhaBO.apagaRegistros(abate);
                                fluxoCont(false);
                            } else {
                                fluxoProblema();
                            }
                        } else {
                            fluxoCont(true);
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
        viewBaiaAnilha.getOrdemHist1Label().setText(viewBaiaAnilha.getOrdemHist2Label().getText());
        viewBaiaAnilha.getOrdemHist2Label().setText(viewBaiaAnilha.getOrdemHist3Label().getText());
        viewBaiaAnilha.getOrdemHist3Label().setText(viewBaiaAnilha.getOrdemHist4Label().getText());
        viewBaiaAnilha.getOrdemHist4Label().setText(viewBaiaAnilha.getOrdemHist5Label().getText());
        viewBaiaAnilha.getOrdemHist5Label().setText(viewBaiaAnilha.getOrdemJFT().getText());
        viewBaiaAnilha.getBaiaHist1Label().setText(viewBaiaAnilha.getBaiaHist2Label().getText());
        viewBaiaAnilha.getBaiaHist2Label().setText(viewBaiaAnilha.getBaiaHist3Label().getText());
        viewBaiaAnilha.getBaiaHist3Label().setText(viewBaiaAnilha.getBaiaHist4Label().getText());
        viewBaiaAnilha.getBaiaHist4Label().setText(viewBaiaAnilha.getBaiaHist5Label().getText());
        viewBaiaAnilha.getBaiaHist5Label().setText(viewBaiaAnilha.getBaiaJFT().getText());
        viewBaiaAnilha.getSexoHist1Label().setText(viewBaiaAnilha.getSexoHist2Label().getText());
        viewBaiaAnilha.getSexoHist2Label().setText(viewBaiaAnilha.getSexoHist3Label().getText());
        viewBaiaAnilha.getSexoHist3Label().setText(viewBaiaAnilha.getSexoHist4Label().getText());
        viewBaiaAnilha.getSexoHist4Label().setText(viewBaiaAnilha.getSexoHist5Label().getText());
        viewBaiaAnilha.getSexoHist5Label().setText(viewBaiaAnilha.getSexoJFT().getText());
        viewBaiaAnilha.getLadoHist1Label().setText(viewBaiaAnilha.getLadoHist2Label().getText());
        viewBaiaAnilha.getLadoHist2Label().setText(viewBaiaAnilha.getLadoHist3Label().getText());
        viewBaiaAnilha.getLadoHist3Label().setText(viewBaiaAnilha.getLadoHist4Label().getText());
        viewBaiaAnilha.getLadoHist4Label().setText(viewBaiaAnilha.getLadoHist5Label().getText());
        viewBaiaAnilha.getLadoHist5Label().setText(viewBaiaAnilha.getLadoJFT().getText());
        viewBaiaAnilha.getTrat1Hist1Label().setText(viewBaiaAnilha.getTrat1Hist2Label().getText());
        viewBaiaAnilha.getTrat1Hist2Label().setText(viewBaiaAnilha.getTrat1Hist3Label().getText());
        viewBaiaAnilha.getTrat1Hist3Label().setText(viewBaiaAnilha.getTrat1Hist4Label().getText());
        viewBaiaAnilha.getTrat1Hist4Label().setText(viewBaiaAnilha.getTrat1Hist5Label().getText());
        viewBaiaAnilha.getTrat1Hist5Label().setText(viewBaiaAnilha.getTrat1JFT().getText());
        viewBaiaAnilha.getTrat2Hist1Label().setText(viewBaiaAnilha.getTrat2Hist2Label().getText());
        viewBaiaAnilha.getTrat2Hist2Label().setText(viewBaiaAnilha.getTrat2Hist3Label().getText());
        viewBaiaAnilha.getTrat2Hist3Label().setText(viewBaiaAnilha.getTrat2Hist4Label().getText());
        viewBaiaAnilha.getTrat2Hist4Label().setText(viewBaiaAnilha.getTrat2Hist5Label().getText());
        viewBaiaAnilha.getTrat2Hist5Label().setText(viewBaiaAnilha.getTrat2JFT().getText());
        viewBaiaAnilha.getInicioAnilha1Hist1Label().setText(viewBaiaAnilha.getInicioAnilha1Hist2Label().getText());
        viewBaiaAnilha.getInicioAnilha1Hist2Label().setText(viewBaiaAnilha.getInicioAnilha1Hist3Label().getText());
        viewBaiaAnilha.getInicioAnilha1Hist3Label().setText(viewBaiaAnilha.getInicioAnilha1Hist4Label().getText());
        viewBaiaAnilha.getInicioAnilha1Hist4Label().setText(viewBaiaAnilha.getInicioAnilha1Hist5Label().getText());
        viewBaiaAnilha.getInicioAnilha1Hist5Label().setText(viewBaiaAnilha.getInicioAnilhaJFT().getText());
        viewBaiaAnilha.getFimAnilhaHist1Label().setText(viewBaiaAnilha.getFimAnilhaHist2Label().getText());
        viewBaiaAnilha.getFimAnilhaHist2Label().setText(viewBaiaAnilha.getFimAnilhaHist3Label().getText());
        viewBaiaAnilha.getFimAnilhaHist3Label().setText(viewBaiaAnilha.getFimAnilhaHist4Label().getText());
        viewBaiaAnilha.getFimAnilhaHist4Label().setText(viewBaiaAnilha.getFimAnilhaHist5Label().getText());
        viewBaiaAnilha.getFimAnilhaHist5Label().setText(viewBaiaAnilha.getFimAnilhaJFT().getText());
        viewBaiaAnilha.getControleHist1Label().setText(viewBaiaAnilha.getControleHist2Label().getText());
        viewBaiaAnilha.getControleHist2Label().setText(viewBaiaAnilha.getControleHist3Label().getText());
        viewBaiaAnilha.getControleHist3Label().setText(viewBaiaAnilha.getControleHist4Label().getText());
        viewBaiaAnilha.getControleHist4Label().setText(viewBaiaAnilha.getControleHist5Label().getText());
        viewBaiaAnilha.getControleHist5Label().setText(viewBaiaAnilha.getControleJFT().getText());
        
        viewBaiaAnilha.getBaiaJFT().setText("000");
        viewBaiaAnilha.getSexoJFT().setText("0");
        viewBaiaAnilha.getLadoJFT().setText("0");
        viewBaiaAnilha.getTrat1JFT().setText("00");
        viewBaiaAnilha.getTrat2JFT().setText("00");
        viewBaiaAnilha.getInicioAnilhaJFT().setText("000");
        viewBaiaAnilha.getFimAnilhaJFT().setText("000");
        viewBaiaAnilha.getControleJFT().setText("0000");
    }
    
    public void fluxoProblema() {
        loadHist();
        viewBaiaAnilha.getBaiaAnilhaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        viewBaiaAnilha.getBaiaJFT().setEnabled(true);
        viewBaiaAnilha.getBaiaJFT().grabFocus();
        viewBaiaAnilha.getSexoJFT().setEnabled(false);
        viewBaiaAnilha.getLadoJFT().setEnabled(false);
        viewBaiaAnilha.getTrat1JFT().setEnabled(false);
        viewBaiaAnilha.getTrat2JFT().setEnabled(false);
        viewBaiaAnilha.getInicioAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getFimAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getControleJFT().setEnabled(false);
    }
    
    public void fluxoCont(boolean isOk) {
        if(isOk) {
            // Salva variáveis da baia digitada
            baiaAnilha.add(new BaiaAnilhaVOF(Integer.parseInt(viewBaiaAnilha.getOrdemJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getBaiaJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getSexoJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getLadoJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getTrat1JFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getTrat2JFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getInicioAnilhaJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getFimAnilhaJFT().getText()),
                                            Integer.parseInt(viewBaiaAnilha.getControleJFT().getText())));
            SaveUpdater.startCountdown(3, viewBaiaAnilha.getRegistroLabel());
        }
        controller.getModel().getModelStateDAO().saveModelState(false);
        updateHist();
        viewBaiaAnilha.getOrdemJFT().setText(""+(++ordem));
        TextFormatter.formatStringJFT(viewBaiaAnilha.getOrdemJFT(), viewBaiaAnilha.getOrdemJFT().getText(), 3);
        
        viewBaiaAnilha.getBaiaAnilhaJP().setBorder(defaultBorder);
        viewBaiaAnilha.getBaiaJFT().setEnabled(true);
        viewBaiaAnilha.getBaiaJFT().grabFocus();
        viewBaiaAnilha.getSexoJFT().setEnabled(false);
        viewBaiaAnilha.getLadoJFT().setEnabled(false);
        viewBaiaAnilha.getTrat1JFT().setEnabled(false);
        viewBaiaAnilha.getTrat2JFT().setEnabled(false);
        viewBaiaAnilha.getInicioAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getFimAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getControleJFT().setEnabled(false);
        
        System.out.println("próx informação baia-anilhas");
    }
    
    public void fluxoOk() {
        viewBaiaAnilha.getBaiaAnilhaJP().setBorder(defaultBorder);
        viewBaiaAnilha.getBaiaJFT().setEnabled(false);
        viewBaiaAnilha.getSexoJFT().setEnabled(false);
        viewBaiaAnilha.getLadoJFT().setEnabled(false);
        viewBaiaAnilha.getTrat1JFT().setEnabled(false);
        viewBaiaAnilha.getTrat2JFT().setEnabled(false);
        viewBaiaAnilha.getInicioAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getFimAnilhaJFT().setEnabled(false);
        viewBaiaAnilha.getControleJFT().setEnabled(false);
        viewBaiaAnilha.getOpcaoJFT().setEnabled(true);
        viewBaiaAnilha.getOpcaoJFT().grabFocus();
    }
}
