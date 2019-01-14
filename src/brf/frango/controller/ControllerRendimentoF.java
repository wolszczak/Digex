package brf.frango.controller;

import brf.frango.model.bo.RendimentoBOF;
import brf.frango.model.vo.RendimentoVOF;
import brf.frango.view.ViewRendimentoF;
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

public class ControllerRendimentoF extends KeyAdapter
        implements FocusListener {

    private final ControllerF controller;
    private ViewRendimentoF viewRendimento;
    private Border defaultBorder;
    private int controle;
    private List<RendimentoVOF> rendimento;
    private List<RendimentoVOF> lastHist;
    private int ordem;
    private int abate;
    private final RendimentoBOF rendimentoBO;
    
    public ControllerRendimentoF(ControllerF c, RendimentoBOF rendimentoBO) {
        controller = c;
        this.rendimentoBO = rendimentoBO;
    }

    public void openWindow(String aviario, int abate, String dataAbate) {
        viewRendimento = new ViewRendimentoF();
        viewRendimento.setTitle("DIGEX - Frango");
        viewRendimento.setResizable(false);
        viewRendimento.setLocationRelativeTo(null);
        viewRendimento.setVisible(true);
        viewRendimento.getRegistrosLabel().setVisible(false);
        defaultBorder = viewRendimento.getRendimentoJP().getBorder();

        this.abate = abate;

        viewRendimento.getAviarioJFT().setText(aviario);
        viewRendimento.getAbateJFT().setText("" + abate);
        viewRendimento.getDataAbateJFT().setText(dataAbate);

        lastHist = new ArrayList<>();

        List<Component> order = new ArrayList<>();
        order.add(viewRendimento.getNumJFT1());
        order.add(viewRendimento.getNumJFT2());
        order.add(viewRendimento.getNumJFT3());
        order.add(viewRendimento.getNumJFT4());
        order.add(viewRendimento.getNumJFT5());
        order.add(viewRendimento.getgDirJFT1());
        order.add(viewRendimento.getgDirJFT2());
        order.add(viewRendimento.getgDirJFT3());
        order.add(viewRendimento.getgDirJFT4());
        order.add(viewRendimento.getgDirJFT5());
        order.add(viewRendimento.getgEsqJFT1());
        order.add(viewRendimento.getgEsqJFT2());
        order.add(viewRendimento.getgEsqJFT3());
        order.add(viewRendimento.getgEsqJFT4());
        order.add(viewRendimento.getgEsqJFT5());
        order.add(viewRendimento.getpCarcJFT1());
        order.add(viewRendimento.getpCarcJFT2());
        order.add(viewRendimento.getpCarcJFT3());
        order.add(viewRendimento.getpCarcJFT4());
        order.add(viewRendimento.getpCarcJFT5());
        order.add(viewRendimento.getpGorDirJFT1());
        order.add(viewRendimento.getpGorDirJFT2());
        order.add(viewRendimento.getpGorDirJFT3());
        order.add(viewRendimento.getpGorDirJFT4());
        order.add(viewRendimento.getpGorDirJFT5());
        order.add(viewRendimento.getpGorEsqJFT1());
        order.add(viewRendimento.getpGorEsqJFT2());
        order.add(viewRendimento.getpGorEsqJFT3());
        order.add(viewRendimento.getpGorEsqJFT4());
        order.add(viewRendimento.getpGorEsqJFT5());
        order.add(viewRendimento.getpAsaJFT1());
        order.add(viewRendimento.getpAsaJFT2());
        order.add(viewRendimento.getpAsaJFT3());
        order.add(viewRendimento.getpAsaJFT4());
        order.add(viewRendimento.getpAsaJFT5());
        order.add(viewRendimento.getGorPeitoJFT1());
        order.add(viewRendimento.getGorPeitoJFT2());
        order.add(viewRendimento.getGorPeitoJFT3());
        order.add(viewRendimento.getGorPeitoJFT4());
        order.add(viewRendimento.getGorPeitoJFT5());
        order.add(viewRendimento.getpPeitoJFT1());
        order.add(viewRendimento.getpPeitoJFT2());
        order.add(viewRendimento.getpPeitoJFT3());
        order.add(viewRendimento.getpPeitoJFT4());
        order.add(viewRendimento.getpPeitoJFT5());
        order.add(viewRendimento.getPadJFT1());
        order.add(viewRendimento.getPadJFT2());
        order.add(viewRendimento.getPadJFT3());
        order.add(viewRendimento.getPadJFT4());
        order.add(viewRendimento.getPadJFT5());
        order.add(viewRendimento.getPaeJFT1());
        order.add(viewRendimento.getPaeJFT2());
        order.add(viewRendimento.getPaeJFT3());
        order.add(viewRendimento.getPaeJFT4());
        order.add(viewRendimento.getPaeJFT5());
        order.add(viewRendimento.getEstPDirJFT1());
        order.add(viewRendimento.getEstPDirJFT2());
        order.add(viewRendimento.getEstPDirJFT3());
        order.add(viewRendimento.getEstPDirJFT4());
        order.add(viewRendimento.getEstPDirJFT5());
        order.add(viewRendimento.getEstPEsqJFT1());
        order.add(viewRendimento.getEstPEsqJFT2());
        order.add(viewRendimento.getEstPEsqJFT3());
        order.add(viewRendimento.getEstPEsqJFT4());
        order.add(viewRendimento.getEstPEsqJFT5());
        order.add(viewRendimento.getpCoxaJFT1());
        order.add(viewRendimento.getpCoxaJFT2());
        order.add(viewRendimento.getpCoxaJFT3());
        order.add(viewRendimento.getpCoxaJFT4());
        order.add(viewRendimento.getpCoxaJFT5());
        order.add(viewRendimento.getControleJFT());
        order.add(viewRendimento.getOpcaoJFT());

        FocusOrderPolicy newPolicy = new FocusOrderPolicy(order);
        viewRendimento.setFocusTraversalPolicy(newPolicy);
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
        List<JLabel> histOrdens = new ArrayList<>();
        List<JLabel> histNum = new ArrayList<>();
        List<JLabel> histGDir = new ArrayList<>();
        List<JLabel> histGEsq = new ArrayList<>();
        List<JLabel> histPCarc = new ArrayList<>();
        List<JLabel> histPGorDir = new ArrayList<>();
        List<JLabel> histPGorEsq = new ArrayList<>();
        List<JLabel> histPAsa = new ArrayList<>();
        List<JLabel> histGorPeito = new ArrayList<>();
        List<JLabel> histPPeito = new ArrayList<>();
        List<JLabel> histPad = new ArrayList<>();
        List<JLabel> histPae = new ArrayList<>();
        List<JLabel> histEstPDir = new ArrayList<>();
        List<JLabel> histEstPEsq = new ArrayList<>();
        List<JLabel> histPCoxa = new ArrayList<>();

        histOrdens.add(viewRendimento.getOrdemHistLabel());
        histNum.add(viewRendimento.getNumHistLabel());
        histGDir.add(viewRendimento.getgDirHistLabel());
        histGEsq.add(viewRendimento.getgEsqHistLabel());
        histPCarc.add(viewRendimento.getpCarcHistLabel());
        histPGorDir.add(viewRendimento.getpGorDirHistLabel());
        histPGorEsq.add(viewRendimento.getpGorEsqHistLabel());
        histPAsa.add(viewRendimento.getpAsaHistLabel());
        histGorPeito.add(viewRendimento.getGorPeitoHistLabel());
        histPPeito.add(viewRendimento.getpPeitoHistLabel());
        histPad.add(viewRendimento.getPadHistLabel());
        histPae.add(viewRendimento.getPaeHistLabel());
        histEstPDir.add(viewRendimento.getEstPDirHistLabel());
        histEstPEsq.add(viewRendimento.getEstPEsqHistLabel());
        histPCoxa.add(viewRendimento.getpCoxaHistLabel());

        System.out.println("size hist: " + histOrdens.size());
        rendimento = controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento();
        rendimentoBO.removeNasasZeradas(abate);
        ordem = rendimento.size() + 1;
        viewRendimento.getOrdemLabel1().setText("" + ordem);
        TextFormatter.formatStringOrdem(viewRendimento.getOrdemLabel1(), viewRendimento.getOrdemLabel1().getText(), ordem);
        viewRendimento.getOrdemLabel2().setText("" + (++ordem));
        TextFormatter.formatStringOrdem(viewRendimento.getOrdemLabel2(), viewRendimento.getOrdemLabel2().getText(), ordem);
        viewRendimento.getOrdemLabel3().setText("" + (++ordem));
        TextFormatter.formatStringOrdem(viewRendimento.getOrdemLabel3(), viewRendimento.getOrdemLabel3().getText(), ordem);
        viewRendimento.getOrdemLabel4().setText("" + (++ordem));
        TextFormatter.formatStringOrdem(viewRendimento.getOrdemLabel4(), viewRendimento.getOrdemLabel4().getText(), ordem);
        viewRendimento.getOrdemLabel5().setText("" + (++ordem));
        TextFormatter.formatStringOrdem(viewRendimento.getOrdemLabel5(), viewRendimento.getOrdemLabel5().getText(), ordem);
        if (!rendimento.isEmpty()) {
            System.out.println("rendimento nao vazio!");
            int i = 4;
            String text = "" + rendimento.get(rendimento.size() - 5 + i).getOrdem();
            if (text.length() == 2) {
                text = "0" + text;
            } else if (text.length() == 1) {
                text = "00" + text;
            }
            histOrdens.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getNasa();
            if (text.length() == 2) {
                text = "0" + text;
            } else if (text.length() == 1) {
                text = "00" + text;
            }
            histNum.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getgDir();
            histGDir.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getgEsq();
            histGEsq.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpAbate();
            if (text.length() == 3) {
                text = "0" + text;
            } else if (text.length() == 2) {
                text = "00" + text;
            } else if (text.length() == 1) {
                text = "000" + text;
            }
            histPCarc.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpGorDir();
            if (text.length() == 1) {
                text = "0" + text;
            }
            histPGorDir.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpGorEsq();
            if (text.length() == 1) {
                text = "0" + text;
            }
            histPGorEsq.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpAsa();
            if (text.length() == 2) {
                text = "0" + text;
            } else if (text.length() == 1) {
                text = "00" + text;
            }
            histPAsa.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getGorPeito();
            histGorPeito.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpPeito();
            if (text.length() == 3) {
                text = "0" + text;
            } else if (text.length() == 2) {
                text = "00" + text;
            } else if (text.length() == 1) {
                text = "000" + text;
            }
            histPPeito.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getPad();
            histPad.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getPae();
            histPae.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getEstPDir();
            histEstPDir.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getEstPEsq();
            histEstPEsq.get(i - 4).setText(text);

            text = "" + rendimento.get(rendimento.size() - 5 + i).getpCoxSob();
            if (text.length() == 3) {
                text = "0" + text;
            } else if (text.length() == 2) {
                text = "00" + text;
            } else if (text.length() == 1) {
                text = "000" + text;
            }
            histPCoxa.get(i - 4).setText(text);
        } 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Object src = e.getSource();
        if (e.getKeyCode() == KeyEvent.VK_LEFT && !e.getSource().equals(viewRendimento.getNumJFT1())) {
            System.out.println("left");
            Component prev;
            ((JFormattedTextField) src).setEnabled(false);
            if (!e.getSource().equals(viewRendimento.getOpcaoJFT())) {
                prev = viewRendimento.getFocusTraversalPolicy().getComponentBefore(viewRendimento, (JFormattedTextField) src);
            } else {
                prev = viewRendimento.getNumJFT1();
            }
            prev.setEnabled(true);
            ((JFormattedTextField) prev).grabFocus();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if ((JFormattedTextField) e.getSource() == viewRendimento.getOpcaoJFT()) {
            switch (e.getKeyChar()) {
                case KeyEvent.VK_0:
                    int n = JOptionPane.showConfirmDialog(viewRendimento,
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
                    int option1 = JOptionPane.showConfirmDialog(viewRendimento,
                            "Deseja realmente voltar para tela principal?",
                            "DIGEX - Finalizar Abate " + abate,
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (option1 == 0) {
                        viewRendimento.setVisible(false);
                        controller.resumeEscolhaDig();
                        System.out.println("Finalizar Abate");
                    }
                    break;
                case KeyEvent.VK_9:
                    int option9 = JOptionPane.showConfirmDialog(viewRendimento,
                            "Deseja realmente voltar para tela anterior?",
                            "DIGEX - Voltar",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (option9 == 0) {
                        viewRendimento.setVisible(false);
                        controller.resumeEscolhaBal();
                        System.out.println("Voltar");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    ((JFormattedTextField) e.getComponent()).setCaretPosition(0);
                    ((JFormattedTextField) e.getComponent()).selectAll();
                    break;
            }
        }
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            int option = JOptionPane.showConfirmDialog(viewRendimento,
                    "Deseja realmente voltar para tela anterior?",
                    "DIGEX - Voltar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (option == 0) {
                viewRendimento.setVisible(false);
                controller.resumeEscolhaBal();
                System.out.println("Voltar");
            }
        } else if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            JFormattedTextField src = (JFormattedTextField) e.getSource();
            String text = src.getText();
            if ((JFormattedTextField) e.getSource() == viewRendimento.getNumJFT1()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getNumJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getNumJFT2()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getNumJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getNumJFT3()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getNumJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getNumJFT4()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getNumJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getNumJFT5()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getgDirJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgDirJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgDirJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgDirJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgDirJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgDirJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgDirJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgDirJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgDirJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgDirJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgEsqJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgEsqJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgEsqJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgEsqJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgEsqJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgEsqJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgEsqJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgEsqJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getgEsqJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getgEsqJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getpCarcJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCarcJFT1()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCarcJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCarcJFT2()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCarcJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCarcJFT3()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCarcJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCarcJFT4()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCarcJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCarcJFT5()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpGorDirJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorDirJFT1()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorDirJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorDirJFT2()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorDirJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorDirJFT3()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorDirJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorDirJFT4()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorDirJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorDirJFT5()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorEsqJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorEsqJFT1()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorEsqJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorEsqJFT2()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorEsqJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorEsqJFT3()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorEsqJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorEsqJFT4()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpGorEsqJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpGorEsqJFT5()) {
                TextFormatter.formatStringJFT(src, text, 2);
                viewRendimento.getpAsaJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpAsaJFT1()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getpAsaJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpAsaJFT2()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getpAsaJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpAsaJFT3()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getpAsaJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpAsaJFT4()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getpAsaJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpAsaJFT5()) {
                TextFormatter.formatStringJFT(src, text, 3);
                viewRendimento.getGorPeitoJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getGorPeitoJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getGorPeitoJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getGorPeitoJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getGorPeitoJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getGorPeitoJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getGorPeitoJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getGorPeitoJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getGorPeitoJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getGorPeitoJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getpPeitoJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpPeitoJFT1()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpPeitoJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpPeitoJFT2()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpPeitoJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpPeitoJFT3()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpPeitoJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpPeitoJFT4()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpPeitoJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpPeitoJFT5()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getPadJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPadJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPadJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPadJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPadJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPadJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPadJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPadJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPadJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPadJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPaeJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPaeJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPaeJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPaeJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPaeJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPaeJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPaeJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPaeJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getPaeJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getPaeJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPDirJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPDirJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPDirJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPDirJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPDirJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPDirJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPDirJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPDirJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPDirJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPDirJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPEsqJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPEsqJFT1()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPEsqJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPEsqJFT2()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPEsqJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPEsqJFT3()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPEsqJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPEsqJFT4()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getEstPEsqJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getEstPEsqJFT5()) {
                TextFormatter.formatStringJFT(src, text, 1);
                viewRendimento.getpCoxaJFT1().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCoxaJFT1()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCoxaJFT2().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCoxaJFT2()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCoxaJFT3().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCoxaJFT3()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCoxaJFT4().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCoxaJFT4()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getpCoxaJFT5().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getpCoxaJFT5()) {
                TextFormatter.formatStringJFT(src, text, 4);
                viewRendimento.getControleJFT().setEnabled(true);
                ((JFormattedTextField) e.getSource()).transferFocus();
            } else if ((JFormattedTextField) e.getSource() == viewRendimento.getControleJFT()) {
                TextFormatter.formatStringJFT(src, text, 5);
                controle = Integer.parseInt(viewRendimento.getControleJFT().getText());
                int somaControle = Integer.parseInt(viewRendimento.getNumJFT1().getText())
                        + Integer.parseInt(viewRendimento.getNumJFT2().getText())
                        + Integer.parseInt(viewRendimento.getNumJFT3().getText())
                        + Integer.parseInt(viewRendimento.getNumJFT4().getText())
                        + Integer.parseInt(viewRendimento.getNumJFT5().getText())
                        + Integer.parseInt(viewRendimento.getgDirJFT1().getText())
                        + Integer.parseInt(viewRendimento.getgDirJFT2().getText())
                        + Integer.parseInt(viewRendimento.getgDirJFT3().getText())
                        + Integer.parseInt(viewRendimento.getgDirJFT4().getText())
                        + Integer.parseInt(viewRendimento.getgDirJFT5().getText())
                        + Integer.parseInt(viewRendimento.getgEsqJFT1().getText())
                        + Integer.parseInt(viewRendimento.getgEsqJFT2().getText())
                        + Integer.parseInt(viewRendimento.getgEsqJFT3().getText())
                        + Integer.parseInt(viewRendimento.getgEsqJFT4().getText())
                        + Integer.parseInt(viewRendimento.getgEsqJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpCarcJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpCarcJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpCarcJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpCarcJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpCarcJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpGorDirJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpGorDirJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpGorDirJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpGorDirJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpGorDirJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpGorEsqJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpGorEsqJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpGorEsqJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpGorEsqJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpGorEsqJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpAsaJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpAsaJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpAsaJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpAsaJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpAsaJFT5().getText())
                        + Integer.parseInt(viewRendimento.getGorPeitoJFT1().getText())
                        + Integer.parseInt(viewRendimento.getGorPeitoJFT2().getText())
                        + Integer.parseInt(viewRendimento.getGorPeitoJFT3().getText())
                        + Integer.parseInt(viewRendimento.getGorPeitoJFT4().getText())
                        + Integer.parseInt(viewRendimento.getGorPeitoJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpPeitoJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpPeitoJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpPeitoJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpPeitoJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpPeitoJFT5().getText())
                        + Integer.parseInt(viewRendimento.getPadJFT1().getText())
                        + Integer.parseInt(viewRendimento.getPadJFT2().getText())
                        + Integer.parseInt(viewRendimento.getPadJFT3().getText())
                        + Integer.parseInt(viewRendimento.getPadJFT4().getText())
                        + Integer.parseInt(viewRendimento.getPadJFT5().getText())
                        + Integer.parseInt(viewRendimento.getPaeJFT1().getText())
                        + Integer.parseInt(viewRendimento.getPaeJFT2().getText())
                        + Integer.parseInt(viewRendimento.getPaeJFT3().getText())
                        + Integer.parseInt(viewRendimento.getPaeJFT4().getText())
                        + Integer.parseInt(viewRendimento.getPaeJFT5().getText())
                        + Integer.parseInt(viewRendimento.getEstPDirJFT1().getText())
                        + Integer.parseInt(viewRendimento.getEstPDirJFT2().getText())
                        + Integer.parseInt(viewRendimento.getEstPDirJFT3().getText())
                        + Integer.parseInt(viewRendimento.getEstPDirJFT4().getText())
                        + Integer.parseInt(viewRendimento.getEstPDirJFT5().getText())
                        + Integer.parseInt(viewRendimento.getEstPEsqJFT1().getText())
                        + Integer.parseInt(viewRendimento.getEstPEsqJFT2().getText())
                        + Integer.parseInt(viewRendimento.getEstPEsqJFT3().getText())
                        + Integer.parseInt(viewRendimento.getEstPEsqJFT4().getText())
                        + Integer.parseInt(viewRendimento.getEstPEsqJFT5().getText())
                        + Integer.parseInt(viewRendimento.getpCoxaJFT1().getText())
                        + Integer.parseInt(viewRendimento.getpCoxaJFT2().getText())
                        + Integer.parseInt(viewRendimento.getpCoxaJFT3().getText())
                        + Integer.parseInt(viewRendimento.getpCoxaJFT4().getText())
                        + Integer.parseInt(viewRendimento.getpCoxaJFT5().getText());
                System.out.println("Soma controle: " + somaControle);
                if (controle != somaControle) {
                    fluxoProblema();
                } else {
                    String msgInexistente = rendimentoBO.verificaNasaInexistente(abate,
                            Integer.parseInt(viewRendimento.getNumJFT1().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT2().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT3().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT4().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT5().getText()));
                    if (msgInexistente.length() != 0) {
                        JOptionPane.showMessageDialog(viewRendimento,
                                "Aviso(s):\n" + msgInexistente, "DIGEX - Aviso",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    String msgErros = rendimentoBO.verificaErros(abate,
                            Integer.parseInt(viewRendimento.getNumJFT1().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT2().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT3().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT4().getText()),
                            Integer.parseInt(viewRendimento.getNumJFT5().getText()));
                    if (msgErros.length() != 0) {
                        JOptionPane.showMessageDialog(viewRendimento,
                                "Problema(s):\n" + msgErros, "DIGEX - Erro",
                                JOptionPane.ERROR_MESSAGE);
                        fluxoProblema();
                    } else if (controle == 0) {
                        fluxoOk();
                    } else {
                        List<Integer> nasasDup = rendimentoBO.verificaNasaDuplicada(abate,
                                Integer.parseInt(viewRendimento.getNumJFT1().getText()),
                                Integer.parseInt(viewRendimento.getNumJFT2().getText()),
                                Integer.parseInt(viewRendimento.getNumJFT3().getText()),
                                Integer.parseInt(viewRendimento.getNumJFT4().getText()),
                                Integer.parseInt(viewRendimento.getNumJFT5().getText()));
                        if (nasasDup.size() > 0) {
                            int options = JOptionPane.showConfirmDialog(viewRendimento,
                                    "Anilha(s) já digitada(s):\n" + nasasDup + "\n\n"
                                    + "Deseja sobrescrever esta(s) anilha(s) e deletar a(s) anterior(es)?",
                                    "DIGEX - Erro",
                                    JOptionPane.ERROR_MESSAGE);
                            if (options == 0) {
                                rendimentoBO.excluirAnimais(abate, nasasDup);
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
                ((JFormattedTextField) e.getSource()).selectAll();
            }
        });
    }

    @Override
    public void focusLost(FocusEvent e) {
    }

    public void updateHist() {

        viewRendimento.getOrdemHistLabel().setText(viewRendimento.getOrdemLabel5().getText());
        viewRendimento.getNumHistLabel().setText(viewRendimento.getNumJFT5().getText());
        viewRendimento.getgDirHistLabel().setText(viewRendimento.getgDirJFT5().getText());
        viewRendimento.getgEsqHistLabel().setText(viewRendimento.getgEsqJFT5().getText());
        viewRendimento.getpCarcHistLabel().setText(viewRendimento.getpCarcJFT5().getText());
        viewRendimento.getpGorDirHistLabel().setText(viewRendimento.getpGorDirJFT5().getText());
        viewRendimento.getpGorEsqHistLabel().setText(viewRendimento.getpGorEsqJFT5().getText());
        viewRendimento.getpAsaHistLabel().setText(viewRendimento.getpAsaJFT5().getText());
        viewRendimento.getGorPeitoHistLabel().setText(viewRendimento.getGorPeitoJFT5().getText());
        viewRendimento.getpPeitoHistLabel().setText(viewRendimento.getpPeitoJFT5().getText());
        viewRendimento.getPadHistLabel().setText(viewRendimento.getPadJFT5().getText());
        viewRendimento.getPaeHistLabel().setText(viewRendimento.getPaeJFT5().getText());
        viewRendimento.getEstPDirHistLabel().setText(viewRendimento.getEstPDirJFT5().getText());
        viewRendimento.getEstPEsqHistLabel().setText(viewRendimento.getEstPEsqJFT5().getText());
        viewRendimento.getpCoxaHistLabel().setText(viewRendimento.getpCoxaJFT5().getText());

//        viewRendimento.getNumeroJFT().setText("000");
//        viewRendimento.getgDirJFT().setText("0");
//        viewRendimento.getgEsqJFT().setText("0");
//        viewRendimento.getpCarcJFT().setText("0000");
//        viewRendimento.getpGorDirJFT().setText("00");
//        viewRendimento.getpGorEsqJFT().setText("00");
//        viewRendimento.getpAsaJFT().setText("000");
//        viewRendimento.getGpJFT().setText("0");
//        viewRendimento.getpPeitoJFT().setText("0000");
//        viewRendimento.getPadJFT().setText("0");
//        viewRendimento.getPaeJFT().setText("0");
//        viewRendimento.getEstPDirJFT().setText("0");
//        viewRendimento.getEstPEsqJFT().setText("0");
//        viewRendimento.getpCoxaJFT().setText("0000");
//        viewRendimento.getFddJFT().setText("0");
//        viewRendimento.getFdeJFT().setText("0");
    }

    public void clearHist() {

        viewRendimento.getNumJFT1().setText("");
        viewRendimento.getNumJFT2().setText("");
        viewRendimento.getNumJFT3().setText("");
        viewRendimento.getNumJFT4().setText("");
        viewRendimento.getNumJFT5().setText("");

        viewRendimento.getgDirJFT1().setText("");
        viewRendimento.getgDirJFT2().setText("");
        viewRendimento.getgDirJFT3().setText("");
        viewRendimento.getgDirJFT4().setText("");
        viewRendimento.getgDirJFT5().setText("");

        viewRendimento.getgEsqJFT1().setText("");
        viewRendimento.getgEsqJFT2().setText("");
        viewRendimento.getgEsqJFT3().setText("");
        viewRendimento.getgEsqJFT4().setText("");
        viewRendimento.getgEsqJFT5().setText("");

        viewRendimento.getpCarcJFT1().setText("");
        viewRendimento.getpCarcJFT2().setText("");
        viewRendimento.getpCarcJFT3().setText("");
        viewRendimento.getpCarcJFT4().setText("");
        viewRendimento.getpCarcJFT5().setText("");

        viewRendimento.getpGorDirJFT1().setText("");
        viewRendimento.getpGorDirJFT2().setText("");
        viewRendimento.getpGorDirJFT3().setText("");
        viewRendimento.getpGorDirJFT4().setText("");
        viewRendimento.getpGorDirJFT5().setText("");

        viewRendimento.getpGorEsqJFT1().setText("");
        viewRendimento.getpGorEsqJFT2().setText("");
        viewRendimento.getpGorEsqJFT3().setText("");
        viewRendimento.getpGorEsqJFT4().setText("");
        viewRendimento.getpGorEsqJFT5().setText("");

        viewRendimento.getpAsaJFT1().setText("");
        viewRendimento.getpAsaJFT2().setText("");
        viewRendimento.getpAsaJFT3().setText("");
        viewRendimento.getpAsaJFT4().setText("");
        viewRendimento.getpAsaJFT5().setText("");

        viewRendimento.getGorPeitoJFT1().setText("");
        viewRendimento.getGorPeitoJFT2().setText("");
        viewRendimento.getGorPeitoJFT3().setText("");
        viewRendimento.getGorPeitoJFT4().setText("");
        viewRendimento.getGorPeitoJFT5().setText("");

        viewRendimento.getpPeitoJFT1().setText("");
        viewRendimento.getpPeitoJFT2().setText("");
        viewRendimento.getpPeitoJFT3().setText("");
        viewRendimento.getpPeitoJFT4().setText("");
        viewRendimento.getpPeitoJFT5().setText("");

        viewRendimento.getPadJFT1().setText("");
        viewRendimento.getPadJFT2().setText("");
        viewRendimento.getPadJFT3().setText("");
        viewRendimento.getPadJFT4().setText("");
        viewRendimento.getPadJFT5().setText("");

        viewRendimento.getPaeJFT1().setText("");
        viewRendimento.getPaeJFT2().setText("");
        viewRendimento.getPaeJFT3().setText("");
        viewRendimento.getPaeJFT4().setText("");
        viewRendimento.getPaeJFT5().setText("");

        viewRendimento.getEstPDirJFT1().setText("");
        viewRendimento.getEstPDirJFT2().setText("");
        viewRendimento.getEstPDirJFT3().setText("");
        viewRendimento.getEstPDirJFT4().setText("");
        viewRendimento.getEstPDirJFT5().setText("");

        viewRendimento.getEstPEsqJFT1().setText("");
        viewRendimento.getEstPEsqJFT2().setText("");
        viewRendimento.getEstPEsqJFT3().setText("");
        viewRendimento.getEstPEsqJFT4().setText("");
        viewRendimento.getEstPEsqJFT5().setText("");

        viewRendimento.getpCoxaJFT1().setText("");
        viewRendimento.getpCoxaJFT2().setText("");
        viewRendimento.getpCoxaJFT3().setText("");
        viewRendimento.getpCoxaJFT4().setText("");
        viewRendimento.getpCoxaJFT5().setText("");
        
        viewRendimento.getControleJFT().setText("");
    }

    public void lastHistNok() {
        lastHist.removeAll(lastHist);
        lastHist.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel1().getText()),
                Integer.parseInt(viewRendimento.getNumJFT1().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT1().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT1().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT1().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT1().getText()),
                Integer.parseInt(viewRendimento.getPadJFT1().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT1().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT1().getText())));

        lastHist.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel2().getText()),
                Integer.parseInt(viewRendimento.getNumJFT2().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT2().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT2().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT2().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT2().getText()),
                Integer.parseInt(viewRendimento.getPadJFT2().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT2().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT2().getText())));

        lastHist.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel3().getText()),
                Integer.parseInt(viewRendimento.getNumJFT3().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT3().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT3().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT3().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT3().getText()),
                Integer.parseInt(viewRendimento.getPadJFT3().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT3().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT3().getText())));

        lastHist.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel4().getText()),
                Integer.parseInt(viewRendimento.getNumJFT4().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT4().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT4().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT4().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT4().getText()),
                Integer.parseInt(viewRendimento.getPadJFT4().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT4().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT4().getText())));

        lastHist.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel5().getText()),
                Integer.parseInt(viewRendimento.getNumJFT5().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT5().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT5().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT5().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT5().getText()),
                Integer.parseInt(viewRendimento.getPadJFT5().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT5().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT5().getText())));

    }

    public void fluxoProblema() {
        lastHistNok();
        loadHist();
        viewRendimento.getNumJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getNasa(), 3));
        viewRendimento.getgDirJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getgDir(), 1));
        viewRendimento.getgEsqJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getgEsq(), 1));
        viewRendimento.getpCarcJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpAbate(), 4));
        viewRendimento.getpGorDirJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpGorDir(), 2));
        viewRendimento.getpGorEsqJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpGorEsq(), 2));
        viewRendimento.getpAsaJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpAsa(), 3));
        viewRendimento.getGorPeitoJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getGorPeito(), 1));
        viewRendimento.getpPeitoJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpPeito(), 4));
        viewRendimento.getPadJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getPad(), 1));
        viewRendimento.getPaeJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getPae(), 1));
        viewRendimento.getEstPDirJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getEstPDir(), 1));
        viewRendimento.getEstPEsqJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getEstPEsq(), 1));
        viewRendimento.getpCoxaJFT1().setText(TextFormatter.formatString("" + lastHist.get(0).getpCoxSob(), 4));
        viewRendimento.getNumJFT2().setText(TextFormatter.formatString("" + lastHist.get(1).getNasa(), 3));
        lastHist.remove(0);
        viewRendimento.getRendimentoJP().setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        startLabel();
        viewRendimento.getNumJFT1().setEnabled(true);
        viewRendimento.getNumJFT1().grabFocus();

    }

    public void fluxoCont() {
        SaveUpdater.startCountdown(5, viewRendimento.getRegistrosLabel());
        updateHist();
        viewRendimento.getControleJFT().setText("");
        viewRendimento.getOrdemLabel1().setText("" + (++ordem)); //verificar esta linha
        //TextFormatter.formatStringJL(viewRendimento.getOrdemLabel1(), viewRendimento.getOrdemLabel1().getText(), 3);

        viewRendimento.getRendimentoJP().setBorder(defaultBorder);
        startLabel();
        viewRendimento.getNumJFT1().setEnabled(true);
        viewRendimento.getNumJFT1().grabFocus();

        // Salva variáveis de rendimento digitadas
        rendimento.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel1().getText()),
                Integer.parseInt(viewRendimento.getNumJFT1().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT1().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT1().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT1().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT1().getText()),
                Integer.parseInt(viewRendimento.getPadJFT1().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT1().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT1().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT1().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT1().getText())));

        rendimento.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel2().getText()),
                Integer.parseInt(viewRendimento.getNumJFT2().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT2().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT2().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT2().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT2().getText()),
                Integer.parseInt(viewRendimento.getPadJFT2().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT2().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT2().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT2().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT2().getText())));

        rendimento.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel3().getText()),
                Integer.parseInt(viewRendimento.getNumJFT3().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT3().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT3().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT3().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT3().getText()),
                Integer.parseInt(viewRendimento.getPadJFT3().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT3().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT3().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT3().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT3().getText())));

        rendimento.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel4().getText()),
                Integer.parseInt(viewRendimento.getNumJFT4().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT4().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT4().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT4().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT4().getText()),
                Integer.parseInt(viewRendimento.getPadJFT4().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT4().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT4().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT4().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT4().getText())));

        rendimento.add(new RendimentoVOF(abate,
                Integer.parseInt(viewRendimento.getOrdemLabel5().getText()),
                Integer.parseInt(viewRendimento.getNumJFT5().getText()),
                Integer.parseInt(viewRendimento.getgDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getgEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpCarcJFT5().getText()),
                Integer.parseInt(viewRendimento.getpGorDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getpGorEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpAsaJFT5().getText()),
                Integer.parseInt(viewRendimento.getGorPeitoJFT5().getText()),
                Integer.parseInt(viewRendimento.getpPeitoJFT5().getText()),
                Integer.parseInt(viewRendimento.getPadJFT5().getText()),
                Integer.parseInt(viewRendimento.getPaeJFT5().getText()),
                Integer.parseInt(viewRendimento.getEstPDirJFT5().getText()),
                Integer.parseInt(viewRendimento.getEstPEsqJFT5().getText()),
                Integer.parseInt(viewRendimento.getpCoxaJFT5().getText())));
        controller.getModel().getModelStateDAO().saveModelState(false);
        System.out.println("próx 5 rendimentos");
        clearHist();
    }

    public void fluxoOk() {
        viewRendimento.getRendimentoJP().setBorder(defaultBorder);
        startLabel();
        viewRendimento.getOpcaoJFT().setEnabled(true);
        viewRendimento.getOpcaoJFT().grabFocus();
    }

    private void startLabel() {
        viewRendimento.getNumJFT1().setEnabled(false);
        viewRendimento.getNumJFT2().setEnabled(false);
        viewRendimento.getNumJFT3().setEnabled(false);
        viewRendimento.getNumJFT4().setEnabled(false);
        viewRendimento.getNumJFT5().setEnabled(false);
        viewRendimento.getgDirJFT1().setEnabled(false);
        viewRendimento.getgDirJFT2().setEnabled(false);
        viewRendimento.getgDirJFT3().setEnabled(false);
        viewRendimento.getgDirJFT4().setEnabled(false);
        viewRendimento.getgDirJFT5().setEnabled(false);
        viewRendimento.getgEsqJFT1().setEnabled(false);
        viewRendimento.getgEsqJFT2().setEnabled(false);
        viewRendimento.getgEsqJFT3().setEnabled(false);
        viewRendimento.getgEsqJFT4().setEnabled(false);
        viewRendimento.getgEsqJFT5().setEnabled(false);
        viewRendimento.getpCarcJFT1().setEnabled(false);
        viewRendimento.getpCarcJFT2().setEnabled(false);
        viewRendimento.getpCarcJFT3().setEnabled(false);
        viewRendimento.getpCarcJFT4().setEnabled(false);
        viewRendimento.getpCarcJFT5().setEnabled(false);
        viewRendimento.getpGorDirJFT1().setEnabled(false);
        viewRendimento.getpGorDirJFT2().setEnabled(false);
        viewRendimento.getpGorDirJFT3().setEnabled(false);
        viewRendimento.getpGorDirJFT4().setEnabled(false);
        viewRendimento.getpGorDirJFT5().setEnabled(false);
        viewRendimento.getpGorEsqJFT1().setEnabled(false);
        viewRendimento.getpGorEsqJFT2().setEnabled(false);
        viewRendimento.getpGorEsqJFT3().setEnabled(false);
        viewRendimento.getpGorEsqJFT4().setEnabled(false);
        viewRendimento.getpGorEsqJFT5().setEnabled(false);
        viewRendimento.getpAsaJFT1().setEnabled(false);
        viewRendimento.getpAsaJFT2().setEnabled(false);
        viewRendimento.getpAsaJFT3().setEnabled(false);
        viewRendimento.getpAsaJFT4().setEnabled(false);
        viewRendimento.getpAsaJFT5().setEnabled(false);
        viewRendimento.getGorPeitoJFT1().setEnabled(false);
        viewRendimento.getGorPeitoJFT2().setEnabled(false);
        viewRendimento.getGorPeitoJFT3().setEnabled(false);
        viewRendimento.getGorPeitoJFT4().setEnabled(false);
        viewRendimento.getGorPeitoJFT5().setEnabled(false);
        viewRendimento.getpPeitoJFT1().setEnabled(false);
        viewRendimento.getpPeitoJFT2().setEnabled(false);
        viewRendimento.getpPeitoJFT3().setEnabled(false);
        viewRendimento.getpPeitoJFT4().setEnabled(false);
        viewRendimento.getpPeitoJFT5().setEnabled(false);
        viewRendimento.getPadJFT1().setEnabled(false);
        viewRendimento.getPadJFT2().setEnabled(false);
        viewRendimento.getPadJFT3().setEnabled(false);
        viewRendimento.getPadJFT4().setEnabled(false);
        viewRendimento.getPadJFT5().setEnabled(false);
        viewRendimento.getPaeJFT1().setEnabled(false);
        viewRendimento.getPaeJFT2().setEnabled(false);
        viewRendimento.getPaeJFT3().setEnabled(false);
        viewRendimento.getPaeJFT4().setEnabled(false);
        viewRendimento.getPaeJFT5().setEnabled(false);
        viewRendimento.getEstPDirJFT1().setEnabled(false);
        viewRendimento.getEstPDirJFT2().setEnabled(false);
        viewRendimento.getEstPDirJFT3().setEnabled(false);
        viewRendimento.getEstPDirJFT4().setEnabled(false);
        viewRendimento.getEstPDirJFT5().setEnabled(false);
        viewRendimento.getEstPEsqJFT1().setEnabled(false);
        viewRendimento.getEstPEsqJFT2().setEnabled(false);
        viewRendimento.getEstPEsqJFT3().setEnabled(false);
        viewRendimento.getEstPEsqJFT4().setEnabled(false);
        viewRendimento.getEstPEsqJFT5().setEnabled(false);
        viewRendimento.getpCoxaJFT1().setEnabled(false);
        viewRendimento.getpCoxaJFT2().setEnabled(false);
        viewRendimento.getpCoxaJFT3().setEnabled(false);
        viewRendimento.getpCoxaJFT4().setEnabled(false);
        viewRendimento.getpCoxaJFT5().setEnabled(false);
        viewRendimento.getControleJFT().setEnabled(false);
    }
}
