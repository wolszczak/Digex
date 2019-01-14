package brf.peru.controller;

import brf.main.controller.ControllerEscolhaExp;
import brf.peru.model.vo.InfoExpVOP;
import brf.peru.view.ViewInfoExpP;
import brf.util.FocusOrderPolicy;
import brf.util.TextFormatter;
import brf.util.VerifyRules;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class ControllerInfoExpP extends KeyAdapter
                               implements ActionListener, FocusListener, ItemListener {
    private final ControllerP controller;
    private ViewInfoExpP viewInfoExp;
    private String idDigitador;
    private String protocolo;
    private String teste;
    private int idLocal;
    private String local;
    private int idArea;
    private String area;
    private String inicioExp, fimExp;
    private int aviario;
    private List<Integer> idadeFase;
    private int faseCounter;
    private int abateCounter;
    private List<String> dataAbate;
    private List<JFormattedTextField> erros, aleijados;
    private InfoExpVOP info1, info2;
    private ViewInfoExpP view1, view2;
    private boolean duplaDigitacao;
    private Border defaultJTF, defaultJCB, defaultJP;
    
    public ControllerInfoExpP(ControllerP c) {
        controller = c;
        duplaDigitacao = false;
    }

    public void openWindow(String idDigitador) {
        viewInfoExp = new ViewInfoExpP();
        viewInfoExp.setTitle("DIGEX - Peru");
        viewInfoExp.setResizable(false);
        viewInfoExp.setLocationRelativeTo(null);
        viewInfoExp.setVisible(true);
        viewInfoExp.getIdDigitadorJFT().setText(idDigitador);
        this.idDigitador = idDigitador;
        
        idadeFase = new ArrayList<>();
        dataAbate = new ArrayList<>();
        
        erros = new ArrayList<>();
        aleijados = new ArrayList<>();
        
        defaultJTF = viewInfoExp.getProtocoloJFT().getBorder();
        defaultJCB = viewInfoExp.getLocalJCB().getBorder();
        defaultJP = viewInfoExp.getFasesJP().getBorder();        

        erros.add(viewInfoExp.getErro1JFT());
        erros.add(viewInfoExp.getErro2JFT());
        erros.add(viewInfoExp.getErro3JFT());
        erros.add(viewInfoExp.getErro4JFT());
        erros.add(viewInfoExp.getErro5JFT());
        erros.add(viewInfoExp.getErro6JFT());
        erros.add(viewInfoExp.getErro7JFT());
        erros.add(viewInfoExp.getErro8JFT());
        aleijados.add(viewInfoExp.getAleijado1JFT());
        aleijados.add(viewInfoExp.getAleijado2JFT());
        aleijados.add(viewInfoExp.getAleijado3JFT());
        aleijados.add(viewInfoExp.getAleijado4JFT());
        aleijados.add(viewInfoExp.getAleijado5JFT());
        aleijados.add(viewInfoExp.getAleijado6JFT());
        aleijados.add(viewInfoExp.getAleijado7JFT());
        aleijados.add(viewInfoExp.getAleijado8JFT());

        idLocal = 1;
        local = "CHAPECO";

        idArea = 1;
        area = "GENETICA";


        viewInfoExp.getFaseJFT().setText("1");
        viewInfoExp.getAbateJFT().setText("0");

        faseCounter = 1;
        abateCounter = 0;
        
        List<Component> order = new ArrayList<>();
        order.add(viewInfoExp.getProtocoloJFT());
        order.add(viewInfoExp.getLocalJCB());
        order.add(viewInfoExp.getAviarioJFT());
        order.add(viewInfoExp.getNrCamaJFT());
        order.add(viewInfoExp.getAreaJCB());
        order.add(viewInfoExp.getNrBaiaJFT());
        order.add(viewInfoExp.getInicioExpJFT());
        order.add(viewInfoExp.getFimExpJFT());
        order.add(viewInfoExp.getIdadeAlojJFT());
        order.add(viewInfoExp.getEqualizacaoJFT());
        order.add(viewInfoExp.getNrFasesJFT());
        order.add(viewInfoExp.getIdadeFaseJFT());
        order.add(viewInfoExp.getNrAbatesJFT());
        order.add(viewInfoExp.getDataAbateJFT());        
        order.add(viewInfoExp.getErro1JFT());
        order.add(viewInfoExp.getErro2JFT());
        order.add(viewInfoExp.getErro3JFT());
        order.add(viewInfoExp.getErro4JFT());
        order.add(viewInfoExp.getErro5JFT());
        order.add(viewInfoExp.getErro6JFT());
        order.add(viewInfoExp.getErro7JFT());
        order.add(viewInfoExp.getErro8JFT());
        order.add(viewInfoExp.getAleijado1JFT());
        order.add(viewInfoExp.getAleijado2JFT());
        order.add(viewInfoExp.getAleijado3JFT());
        order.add(viewInfoExp.getAleijado4JFT());
        order.add(viewInfoExp.getAleijado5JFT());
        order.add(viewInfoExp.getAleijado6JFT());
        order.add(viewInfoExp.getAleijado7JFT());
        order.add(viewInfoExp.getAleijado8JFT());        
        order.add(viewInfoExp.getOpcaoJFT());
        FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
        viewInfoExp.setFocusTraversalPolicy(newPolicy);
        listenerSetup(order);
    }

    public void listenerSetup(List<Component> components) {
        components.stream().forEach((it) -> {
            if (it instanceof JFormattedTextField) {
                ((JFormattedTextField) it).addFocusListener(this);
            } else if (it instanceof JComboBox) {
                ((JComboBox) it).addActionListener(this);
            } else if (it instanceof JCheckBox) {
                ((JCheckBox) it).addItemListener(this);
            }
            if (!(it instanceof JCheckBox)) {
                it.addKeyListener(this);
            }
        });
    }

    
    @Override
    @SuppressWarnings("rawtypes")
    public void actionPerformed(ActionEvent e) {        
		JComboBox src = ((JComboBox) e.getSource());
        int selectedIndex = src.getSelectedIndex();
        if (src == viewInfoExp.getLocalJCB()) {
            idLocal = selectedIndex+1;
            switch (idLocal) {
                case 1:
                    local = "CHAPECO";
                    break;
                default:
                    break;
            }
        } else if (src == viewInfoExp.getAreaJCB()) {
            idArea = selectedIndex+1;
            switch (idArea) {
                case 1:
                    area = "GENETICA";
                    break;
                case 2:
                    area = "NUTRICAO";
                    break;
                case 3:
                    area = "SANIDADE";
                    break;
                case 4:
                    area = "MANEJO";
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        Object src = e.getSource();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                if(src instanceof JFormattedTextField) {
                    ((JFormattedTextField) src).setCaretPosition(0);
                    ((JFormattedTextField) src).selectAll();
                }
            }
        });
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("item: "+e.getStateChange());
        
    }

    @Override
    public void focusLost(FocusEvent e) { }
    
    @Override
    public void keyPressed(KeyEvent e) {
        Object src = e.getSource();
        if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewInfoExp.getProtocoloJFT())) {
            System.out.println("left");
            if(src instanceof JFormattedTextField) {
                ((JFormattedTextField) src).setEnabled(false);
                Component prev = viewInfoExp.getFocusTraversalPolicy().getComponentBefore(viewInfoExp, (JFormattedTextField) src);
                if(prev instanceof JFormattedTextField) {
                    if (prev.equals(viewInfoExp.getIdadeFaseJFT()) || prev.equals(viewInfoExp.getNrFasesJFT())) {
                        viewInfoExp.getNrFasesJFT().setEnabled(true);
                        viewInfoExp.getNrFasesJFT().grabFocus();
                        viewInfoExp.getFaseJFT().setText("1");
                        viewInfoExp.getFaseHist1Label().setText("");
                        viewInfoExp.getFaseHist2Label().setText("");
                        viewInfoExp.getIdadeHist1Label().setText("");
                        viewInfoExp.getIdadeHist2Label().setText("");
                        viewInfoExp.getIdadeFaseJFT().setText("");
                        idadeFase.removeAll(idadeFase);
                        faseCounter = 1;                        
                    } else if (prev.equals(viewInfoExp.getDataAbateJFT()) || prev.equals(viewInfoExp.getNrAbatesJFT()) ||
                               prev.equals(viewInfoExp.getErro1JFT()) || prev.equals(viewInfoExp.getErro2JFT()) ||
                               prev.equals(viewInfoExp.getErro3JFT()) || prev.equals(viewInfoExp.getErro4JFT()) ||
                               prev.equals(viewInfoExp.getErro5JFT()) || prev.equals(viewInfoExp.getErro6JFT()) ||
                               prev.equals(viewInfoExp.getErro7JFT()) || prev.equals(viewInfoExp.getErro8JFT()) ||
                               prev.equals(viewInfoExp.getAleijado1JFT()) || prev.equals(viewInfoExp.getAleijado2JFT()) ||
                               prev.equals(viewInfoExp.getAleijado3JFT()) || prev.equals(viewInfoExp.getAleijado4JFT()) ||
                               prev.equals(viewInfoExp.getAleijado5JFT()) || prev.equals(viewInfoExp.getAleijado6JFT()) ||
                               prev.equals(viewInfoExp.getAleijado7JFT()) || prev.equals(viewInfoExp.getAleijado8JFT())) {
                        viewInfoExp.getNrAbatesJFT().setEnabled(true);
                        viewInfoExp.getNrAbatesJFT().grabFocus();
                        viewInfoExp.getAbateJFT().setText("0");
                        viewInfoExp.getAbateHist1Label().setText("");
                        viewInfoExp.getAbateHist2Label().setText("");
                        viewInfoExp.getDataAbateHist1Label().setText("");
                        viewInfoExp.getDataAbateHist2Label().setText("");
                        viewInfoExp.getDataAbateJFT().setText("");
                        dataAbate.removeAll(dataAbate);
                        abateCounter = 0;
                    } else {
                        prev.setEnabled(true);
                        ((JFormattedTextField) prev).grabFocus();
                    }
                } else if (prev instanceof JComboBox) {
                    prev.setEnabled(true);
                    ((JComboBox) prev).grabFocus();
                }
            } else if (src instanceof JComboBox) {
                ((JComboBox) src).setEnabled(false);
                Component prev = viewInfoExp.getFocusTraversalPolicy().getComponentBefore(viewInfoExp, (JComboBox) src);
                prev.setEnabled(true);
                if(prev instanceof JFormattedTextField) {
                    ((JFormattedTextField) prev).grabFocus();
                } else if (prev instanceof JComboBox) {
                    ((JComboBox) prev).grabFocus();
                }
            }
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == viewInfoExp.getOpcaoJFT()) {
            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    int n = JOptionPane.showConfirmDialog(viewInfoExp,
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
                    if (!duplaDigitacao) {
                        info1 = new InfoExpVOP(idDigitador, protocolo, idLocal, local, aviario, teste,
                                            Integer.parseInt(viewInfoExp.getNrCamaJFT().getText()),
                                            idArea, area,
                                            Integer.parseInt(viewInfoExp.getNrBaiaJFT().getText()),
                                            inicioExp,
                                            fimExp,
                                            Integer.parseInt(viewInfoExp.getIdadeAlojJFT().getText()),
                                            Integer.parseInt(viewInfoExp.getEqualizacaoJFT().getText()),
                                            Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()),
                                            idadeFase, 
                                            Integer.parseInt(viewInfoExp.getNrAbatesJFT().getText()),
                                            dataAbate,
                                            Integer.parseInt(viewInfoExp.getErro1JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro2JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro3JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro4JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro5JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro6JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro7JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getErro8JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado1JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado2JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado3JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado4JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado5JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado6JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado7JFT().getText()),
                                            Integer.parseInt(viewInfoExp.getAleijado8JFT().getText()));
                        duplaDigitacao = true;
                        viewInfoExp.setVisible(false);
                        view1 = viewInfoExp;
                        if (view2 == null) {
                            openWindow(idDigitador);
                        } else {
                            viewInfoExp = view2;
                            viewInfoExp.setVisible(true);
                            viewInfoExp.getOpcaoJFT().setEnabled(false);
                            viewInfoExp.getProtocoloJFT().setEnabled(true);
                            viewInfoExp.getProtocoloJFT().grabFocus();
                            mostraCamposErrados();
                            resetaFasesAbates();
                        }                        
                    }  else if (duplaDigitacao) {
                        info2 = new InfoExpVOP(idDigitador, protocolo, idLocal, local, aviario, teste,
                                          Integer.parseInt(viewInfoExp.getNrCamaJFT().getText()),
                                          idArea, area,
                                          Integer.parseInt(viewInfoExp.getNrBaiaJFT().getText()),
                                          inicioExp,
                                          fimExp,
                                          Integer.parseInt(viewInfoExp.getIdadeAlojJFT().getText()),
                                          Integer.parseInt(viewInfoExp.getEqualizacaoJFT().getText()),
                                          Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()),
                                          idadeFase,
                                          Integer.parseInt(viewInfoExp.getNrAbatesJFT().getText()),
                                          dataAbate,
                                          Integer.parseInt(viewInfoExp.getErro1JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro2JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro3JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro4JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro5JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro6JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro7JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getErro8JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado1JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado2JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado3JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado4JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado5JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado6JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado7JFT().getText()),
                                          Integer.parseInt(viewInfoExp.getAleijado8JFT().getText()));
                        boolean isOk = controller.getModel().getInfoExpBO().duplaDigitacao(info1, info2);
                        if (isOk) {
                            viewInfoExp.setVisible(false);
                            controller.startEscolhaDig(idadeFase);
                            System.out.println("Continuar digitação");
                        } else {
                            JOptionPane.showMessageDialog(viewInfoExp,
                                                          "Problema(s):\n" + info2.getErrorMessage(),
                                                          "DIGEX - Dupla Digitação",
                                                          JOptionPane.ERROR_MESSAGE);
                            duplaDigitacao = false; 
                            viewInfoExp.setVisible(false);
                            view2 = viewInfoExp;
                            viewInfoExp = view1;
                            viewInfoExp.setVisible(true);
                            viewInfoExp.getOpcaoJFT().setEnabled(false);
                            viewInfoExp.getProtocoloJFT().setEnabled(true);
                            viewInfoExp.getProtocoloJFT().grabFocus();
                            idadeFase = new ArrayList<>();
                            dataAbate = new ArrayList<>();
                            mostraCamposErrados();
                            resetaFasesAbates();
                        }
                    }
                    break;
                case KeyEvent.VK_9:
                    int option = JOptionPane.showConfirmDialog(viewInfoExp,
                                                      "Deseja realmente voltar para tela anterior?",
                                                      "DIGEX - Voltar",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
                    if(option == 0) {
                        viewInfoExp.setVisible(false);
                        ControllerEscolhaExp ce = new ControllerEscolhaExp();
                        ce.openWindow(idDigitador);
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
            int option = JOptionPane.showConfirmDialog(viewInfoExp,
                                                      "Deseja realmente voltar para tela anterior?",
                                                      "DIGEX - Voltar",
                                                      JOptionPane.YES_NO_OPTION,
                                                      JOptionPane.WARNING_MESSAGE);
            if(option == 0) {
                viewInfoExp.setVisible(false);
                ControllerEscolhaExp ce = new ControllerEscolhaExp();
                ce.openWindow(idDigitador);
                System.out.println("Voltar");
            }
        } else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            Object src = e.getSource();
            String text = "";
            if (src instanceof JFormattedTextField) {
                text = ((JFormattedTextField) src).getText();
            }
            if (src == viewInfoExp.getProtocoloJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 25);
                System.out.println(text);
                protocolo = viewInfoExp.getProtocoloJFT().getText();
                teste = protocolo.substring(0, 5);
                teste += protocolo.substring(19, 25);
                viewInfoExp.getTesteJFT().setText(teste);
                viewInfoExp.getProtocoloJFT().setEnabled(false);
                viewInfoExp.getLocalJCB().setEnabled(true);
            } else if (src == viewInfoExp.getLocalJCB()) {
                viewInfoExp.getLocalJCB().setEnabled(false);
                viewInfoExp.getAviarioJFT().setEnabled(true);
            } else if (src == viewInfoExp.getAviarioJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 1);
                aviario = Integer.parseInt(viewInfoExp.getAviarioJFT().getText());
                viewInfoExp.getAviarioJFT().setEnabled(false);
                viewInfoExp.getNrCamaJFT().setEnabled(true);
            } else if (src == viewInfoExp.getNrCamaJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 1);
                viewInfoExp.getNrCamaJFT().setEnabled(false);
                viewInfoExp.getAreaJCB().setEnabled(true);
            } else if (src == viewInfoExp.getAreaJCB()) {
                viewInfoExp.getAreaJCB().setEnabled(false);
                viewInfoExp.getNrBaiaJFT().setEnabled(true);
            } else if (src == viewInfoExp.getNrBaiaJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 3);
                viewInfoExp.getNrBaiaJFT().setEnabled(false);
                viewInfoExp.getInicioExpJFT().setEnabled(true);
            } else if (src == viewInfoExp.getInicioExpJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 10);
                inicioExp = viewInfoExp.getInicioExpJFT().getText();
                if (VerifyRules.verifyData(inicioExp)) {
                    viewInfoExp.getInicioExpJFT().setEnabled(false);
                    viewInfoExp.getFimExpJFT().setEnabled(true);
                } else {
                    viewInfoExp.getInicioExpJFT().setEnabled(true);
                    viewInfoExp.getInicioExpJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getFimExpJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 10);
                fimExp = viewInfoExp.getFimExpJFT().getText();
                if (VerifyRules.verifyData(fimExp)) {
                    viewInfoExp.getFimExpJFT().setEnabled(false);
                    viewInfoExp.getIdadeAlojJFT().setEnabled(true);
                } else {
                    viewInfoExp.getFimExpJFT().setEnabled(true);
                    viewInfoExp.getFimExpJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getIdadeAlojJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 2);
                viewInfoExp.getIdadeAlojJFT().setEnabled(false);
                viewInfoExp.getEqualizacaoJFT().setEnabled(true);
            } else if (src == viewInfoExp.getEqualizacaoJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 2);
                viewInfoExp.getEqualizacaoJFT().setEnabled(false);
                viewInfoExp.getNrFasesJFT().setEnabled(true);            
            } else if (src == viewInfoExp.getEqualizacaoJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 2);
                viewInfoExp.getEqualizacaoJFT().setEnabled(false);
                viewInfoExp.getNrFasesJFT().setEnabled(true);            
            } else if (src == viewInfoExp.getNrFasesJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField) src, text, 1);
                viewInfoExp.getNrFasesJFT().setEnabled(false);
                viewInfoExp.getIdadeFaseJFT().setEnabled(true);
                int nFases = Integer.parseInt(viewInfoExp.getNrFasesJFT().getText());   
                switch (nFases) {
                    case 8:
                        viewInfoExp.getErro8JFT().setVisible(true);
                        viewInfoExp.getAleijado8JFT().setVisible(true);  
                        viewInfoExp.getErro8JFT().setText("");
                        viewInfoExp.getAleijado8JFT().setText("");
                    case 7:
                        viewInfoExp.getErro7JFT().setVisible(true);
                        viewInfoExp.getAleijado7JFT().setVisible(true);
                        viewInfoExp.getErro7JFT().setText("");
                        viewInfoExp.getAleijado7JFT().setText("");
                    case 6:
                        viewInfoExp.getErro6JFT().setVisible(true);
                        viewInfoExp.getAleijado6JFT().setVisible(true);
                        viewInfoExp.getErro6JFT().setText("");
                        viewInfoExp.getAleijado6JFT().setText("");
                    case 5:
                        viewInfoExp.getErro5JFT().setVisible(true);
                        viewInfoExp.getAleijado5JFT().setVisible(true);
                        viewInfoExp.getErro5JFT().setText("");
                        viewInfoExp.getAleijado5JFT().setText("");                        
                    case 4:
                        viewInfoExp.getErro4JFT().setVisible(true);
                        viewInfoExp.getAleijado4JFT().setVisible(true);
                        viewInfoExp.getErro4JFT().setText("");
                        viewInfoExp.getAleijado4JFT().setText("");
                    case 3:
                        viewInfoExp.getErro3JFT().setVisible(true);
                        viewInfoExp.getAleijado3JFT().setVisible(true);
                        viewInfoExp.getErro3JFT().setText("");
                        viewInfoExp.getAleijado3JFT().setText("");
                    case 2:
                        viewInfoExp.getErro2JFT().setVisible(true);
                        viewInfoExp.getAleijado2JFT().setVisible(true);
                        viewInfoExp.getErro2JFT().setText("");
                        viewInfoExp.getAleijado2JFT().setText("");
                    case 1:
                        viewInfoExp.getErro1JFT().setVisible(true);
                        viewInfoExp.getAleijado1JFT().setVisible(true);  
                        viewInfoExp.getErro1JFT().setText("");
                        viewInfoExp.getAleijado1JFT().setText("");
                    default:
                        break;
                }
                switch (nFases) {
                    case 1:
                        viewInfoExp.getErro2JFT().setVisible(false);
                        viewInfoExp.getAleijado2JFT().setVisible(false);
                        viewInfoExp.getErro2JFT().setText("0");
                        viewInfoExp.getAleijado2JFT().setText("0");
                    case 2:
                        viewInfoExp.getErro3JFT().setVisible(false);
                        viewInfoExp.getAleijado3JFT().setVisible(false);
                        viewInfoExp.getErro3JFT().setText("0");
                        viewInfoExp.getAleijado3JFT().setText("0");
                    case 3:
                        viewInfoExp.getErro4JFT().setVisible(false);
                        viewInfoExp.getAleijado4JFT().setVisible(false);
                        viewInfoExp.getErro4JFT().setText("0");
                        viewInfoExp.getAleijado4JFT().setText("0");                        
                    case 4:
                        viewInfoExp.getErro5JFT().setVisible(false);
                        viewInfoExp.getAleijado5JFT().setVisible(false);
                        viewInfoExp.getErro5JFT().setText("0");
                        viewInfoExp.getAleijado5JFT().setText("0");                        
                    case 5:
                        viewInfoExp.getErro6JFT().setVisible(false);
                        viewInfoExp.getAleijado6JFT().setVisible(false);
                        viewInfoExp.getErro6JFT().setText("0");
                        viewInfoExp.getAleijado6JFT().setText("0");                        
                    case 6:
                        viewInfoExp.getErro7JFT().setVisible(false);
                        viewInfoExp.getAleijado7JFT().setVisible(false);
                        viewInfoExp.getErro7JFT().setText("0");
                        viewInfoExp.getAleijado7JFT().setText("0");                        
                    case 7:
                        viewInfoExp.getErro8JFT().setVisible(false);
                        viewInfoExp.getAleijado8JFT().setVisible(false);
                        viewInfoExp.getErro8JFT().setText("0");
                        viewInfoExp.getAleijado8JFT().setText("0");                        
                    default:
                        break;   
                }
            } else if (src == viewInfoExp.getIdadeFaseJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 2);
                System.out.println("faseCounter: " + faseCounter);
                System.out.println("viewInfoExp.getNrFasesJFT().getText(): " + viewInfoExp.getNrFasesJFT().getText());
                if (faseCounter < Integer.parseInt(viewInfoExp.getNrFasesJFT().getText())) {
                    idadeFase.add(Integer.parseInt(viewInfoExp.getIdadeFaseJFT().getText()));
                    viewInfoExp.getFaseHist1Label().setText(viewInfoExp.getFaseHist2Label().getText());
                    viewInfoExp.getIdadeHist1Label().setText(viewInfoExp.getIdadeHist2Label().getText());
                    viewInfoExp.getFaseHist2Label().setText(""+faseCounter);
                    viewInfoExp.getIdadeHist2Label().setText(viewInfoExp.getIdadeFaseJFT().getText());
                    viewInfoExp.getFaseJFT().setText(""+(++faseCounter));
                } else {
                    idadeFase.add(Integer.parseInt(viewInfoExp.getIdadeFaseJFT().getText()));
                    viewInfoExp.getIdadeFaseJFT().setEnabled(false);
                    viewInfoExp.getNrAbatesJFT().setEnabled(true);
                }
            } else if (src == viewInfoExp.getNrAbatesJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getNrAbatesJFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrAbatesJFT().getText()) == 0) {
                    viewInfoExp.getErro1JFT().setEnabled(true);
                    viewInfoExp.getErro1JFT().grabFocus();
                } else {
                    viewInfoExp.getAbateJFT().setText(""+(++abateCounter));
                    viewInfoExp.getDataAbateJFT().setEnabled(true);
                }
            } else if (src == viewInfoExp.getDataAbateJFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 10);
                if (abateCounter < Integer.parseInt(viewInfoExp.getNrAbatesJFT().getText())) {
                    dataAbate.add(viewInfoExp.getDataAbateJFT().getText());
                    viewInfoExp.getAbateHist1Label().setText(viewInfoExp.getAbateHist2Label().getText());
                    viewInfoExp.getDataAbateHist1Label().setText(viewInfoExp.getDataAbateHist2Label().getText());
                    viewInfoExp.getAbateHist2Label().setText(""+abateCounter);
                    viewInfoExp.getDataAbateHist2Label().setText(viewInfoExp.getDataAbateJFT().getText());
                    viewInfoExp.getAbateJFT().setText(""+(++abateCounter));
                } else {
                    dataAbate.add(viewInfoExp.getDataAbateJFT().getText());
                    viewInfoExp.getDataAbateJFT().setEnabled(false);
                    viewInfoExp.getErro1JFT().setEnabled(true);
                    viewInfoExp.getErro1JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro1JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro1JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 2) {
                    viewInfoExp.getErro2JFT().setEnabled(true);
                    viewInfoExp.getErro2JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado1JFT().setEnabled(true);
                    viewInfoExp.getAleijado1JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro2JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro2JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 3) {
                    viewInfoExp.getErro3JFT().setEnabled(true);
                    viewInfoExp.getErro3JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado1JFT().setEnabled(true);
                    viewInfoExp.getAleijado1JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro3JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro3JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 4) {
                    viewInfoExp.getErro4JFT().setEnabled(true);
                    viewInfoExp.getErro4JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado1JFT().setEnabled(true);
                    viewInfoExp.getAleijado1JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro4JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro4JFT().setEnabled(false);
                viewInfoExp.getAleijado1JFT().setEnabled(true);
                viewInfoExp.getAleijado1JFT().grabFocus();
            } else if (src == viewInfoExp.getAleijado1JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado1JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 2) {
                    viewInfoExp.getAleijado2JFT().setEnabled(true);
                    viewInfoExp.getAleijado2JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado2JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado2JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 3) {
                    viewInfoExp.getAleijado3JFT().setEnabled(true);
                    viewInfoExp.getAleijado3JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado3JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado3JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 4) {
                    viewInfoExp.getAleijado4JFT().setEnabled(true);
                    viewInfoExp.getAleijado4JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado4JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado4JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 5) {
                    viewInfoExp.getErro5JFT().setEnabled(true);
                    viewInfoExp.getErro5JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro5JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro5JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 6) {
                    viewInfoExp.getErro6JFT().setEnabled(true);
                    viewInfoExp.getErro6JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado5JFT().setEnabled(true);
                    viewInfoExp.getAleijado5JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro6JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro6JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 7) {
                    viewInfoExp.getErro7JFT().setEnabled(true);
                    viewInfoExp.getErro7JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado5JFT().setEnabled(true);
                    viewInfoExp.getAleijado5JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro7JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro7JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) == 8) {
                    viewInfoExp.getErro8JFT().setEnabled(true);
                    viewInfoExp.getErro8JFT().grabFocus();
                } else {
                    viewInfoExp.getAleijado5JFT().setEnabled(true);
                    viewInfoExp.getAleijado5JFT().grabFocus();
                }
            } else if (src == viewInfoExp.getErro8JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getErro8JFT().setEnabled(false);
                viewInfoExp.getAleijado5JFT().setEnabled(true);
                viewInfoExp.getAleijado5JFT().grabFocus();
            } else if (src == viewInfoExp.getAleijado5JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado5JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 6) {
                    viewInfoExp.getAleijado6JFT().setEnabled(true);
                    viewInfoExp.getAleijado6JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado6JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado6JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) >= 7) {
                    viewInfoExp.getAleijado7JFT().setEnabled(true);
                    viewInfoExp.getAleijado7JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado7JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado7JFT().setEnabled(false);
                if (Integer.parseInt(viewInfoExp.getNrFasesJFT().getText()) == 8) {
                    viewInfoExp.getAleijado8JFT().setEnabled(true);
                    viewInfoExp.getAleijado8JFT().grabFocus();
                } else {
                    viewInfoExp.getOpcaoJFT().setEnabled(true);
                    viewInfoExp.getOpcaoJFT().grabFocus();
                }
            } else if (src == viewInfoExp.getAleijado8JFT()) {
                TextFormatter.formatStringJFT((JFormattedTextField)src, text, 1);
                viewInfoExp.getAleijado8JFT().setEnabled(false);
                viewInfoExp.getOpcaoJFT().setEnabled(true);
            }
            ((Component) src).transferFocus();
        }
    }
    
    public void mostraCamposErrados() {
        if (info2.getProblemas()[0]) {
            viewInfoExp.getProtocoloJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getProtocoloJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[1] ||
                info2.getProblemas()[2]) {
            viewInfoExp.getLocalJCB().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getLocalJCB().setBorder(defaultJCB);
        }
        if (info2.getProblemas()[3]) {
            viewInfoExp.getAviarioJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAviarioJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[4]) {
            viewInfoExp.getTesteJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getTesteJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[5]) {
            viewInfoExp.getNrCamaJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getNrCamaJFT().setBorder(defaultJTF);
        }       
        if (info2.getProblemas()[6] ||
                info2.getProblemas()[7]) {
            viewInfoExp.getAreaJCB().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAreaJCB().setBorder(defaultJCB);
        }
        if (info2.getProblemas()[8]) {
            viewInfoExp.getNrBaiaJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getNrBaiaJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[9]) {
            viewInfoExp.getInicioExpJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getInicioExpJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[10]) {
            viewInfoExp.getFimExpJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getFimExpJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[11]) {
            viewInfoExp.getIdadeAlojJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getIdadeAlojJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[12]) {
            viewInfoExp.getEqualizacaoJFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getEqualizacaoJFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[13] ||
                info2.getProblemas()[14]) {
            viewInfoExp.getFasesJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getFasesJP().setBorder(defaultJP);
        }
        if (info2.getProblemas()[15] ||
                info2.getProblemas()[16]) {
            viewInfoExp.getAbatesJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAbatesJP().setBorder(defaultJP);
        }
//        for (int i = 17; i <= 32; i++) {
//            if(info2.getProblemas()[i]) {
//                viewInfoExp.getRetiradaJP().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
//                break;
//            }
//        }
        if (info2.getProblemas()[17]) {
            viewInfoExp.getErro1JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro1JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[18]) {
            viewInfoExp.getErro2JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro2JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[19]) {
            viewInfoExp.getErro3JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro3JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[20]) {
            viewInfoExp.getErro4JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro4JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[21]) {
            viewInfoExp.getErro5JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro5JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[22]) {
            viewInfoExp.getErro6JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro6JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[23]) {
            viewInfoExp.getErro7JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro7JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[24]) {
            viewInfoExp.getErro8JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getErro8JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[25]) {
            viewInfoExp.getAleijado1JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado1JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[26]) {
            viewInfoExp.getAleijado2JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado2JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[27]) {
            viewInfoExp.getAleijado3JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado3JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[28]) {
            viewInfoExp.getAleijado4JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado4JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[29]) {
            viewInfoExp.getAleijado5JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado5JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[30]) {
            viewInfoExp.getAleijado6JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado6JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[31]) {
            viewInfoExp.getAleijado7JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado7JFT().setBorder(defaultJTF);
        }
        if (info2.getProblemas()[32]) {
            viewInfoExp.getAleijado8JFT().setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            viewInfoExp.getAleijado8JFT().setBorder(defaultJTF);
        }
    }
    
    public void resetaFasesAbates() {
        viewInfoExp.getFaseJFT().setText("1");
        viewInfoExp.getFaseHist1Label().setText("");
        viewInfoExp.getFaseHist2Label().setText("");
        viewInfoExp.getIdadeHist1Label().setText("");
        viewInfoExp.getIdadeHist2Label().setText("");
        viewInfoExp.getIdadeFaseJFT().setText("");
//        idadeFase.removeAll(idadeFase);
        idadeFase = new ArrayList<>();
        faseCounter = 1; 
        viewInfoExp.getAbateJFT().setText("0");
        viewInfoExp.getAbateHist1Label().setText("");
        viewInfoExp.getAbateHist2Label().setText("");
        viewInfoExp.getDataAbateHist1Label().setText("");
        viewInfoExp.getDataAbateHist2Label().setText("");
        viewInfoExp.getDataAbateJFT().setText("");
//        dataAbate.removeAll(dataAbate);
        dataAbate = new ArrayList<>();
        abateCounter = 0;
    }
}
