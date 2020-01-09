package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.BaiaAnilhaVOF;
import brf.frango.model.vo.BalancaVOF;
import java.util.ArrayList;
import java.util.List;

public class EscolhaBalBOF {
    private final ControllerF controller;
    private List<Integer> anilhasDigitadas;
    private List<Integer> anilhasArquivo;
    private List<Integer> anilhasFaltante;
    private List<Integer> anilhasSobra;
    private List<Integer> anilhasDuplicadas;
    
    
    public EscolhaBalBOF(ControllerF controller) {
        this.controller = controller;
    }
    
    public boolean balancaIsEmpty(int abate) {
        return controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBalanca().isEmpty();
    }
    
    public String verificaErros(int abate) {
        String msg = "";
        atualizaConjuntos(abate);
        if (!anilhasDuplicadas.isEmpty()) {
            msg = msg.concat("- Anilha(s) duplicada(s) no arquivo da balança:\n" + anilhasDuplicadas + "\n");
            
        }
        if (!anilhasSobra.isEmpty()) {
            if (anilhasSobra.size() < 10) {
                msg = msg.concat("- Anilha(s) contida(s) no arquivo da balança e não digitada(s):\n" + anilhasSobra + "\n");
            } else {
                msg = msg.concat("Muitas anilhas do arquivo não foram digitadas!\n" + 
                                "Verifique se o arquivo é o correto!");
            }
        }
        return msg;
    }
    
    public String verificaAnilhasFaltantes(int abate) {
        String msg = "";
        atualizaConjuntos(abate);
        if (!anilhasFaltante.isEmpty()) {
            if (anilhasFaltante.size() < 10) {
                msg = msg.concat("- Anilha(s) digitada(s) inexistente(s) no arquivo da balança:\n" + anilhasFaltante);
            } else {
               msg = "Muitas anilhas digitadas não estão no arquivo!\n" + 
                     "Verifique se o arquivo é o correto!";
            }
        }
        return msg;
    }
    
    private void atualizaConjuntos(int abate) {
        anilhasDigitadas = new ArrayList<>();
        for (BaiaAnilhaVOF ba : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBaiaAnilha()) {
            if (ba.getInicioAnilha() > ba.getFimAnilha()) {
                if (ba.getFimAnilha() > 0) {
                    for(int i = ba.getInicioAnilha(); i >= ba.getFimAnilha(); i--) {
                        anilhasDigitadas.add(i);
                    }
                } else if (ba.getFimAnilha() == 0) {
                    anilhasDigitadas.add(ba.getInicioAnilha());
                }
            } else if (ba.getInicioAnilha() == ba.getFimAnilha()) {
                if (ba.getInicioAnilha() > 0) {
                    anilhasDigitadas.add(ba.getInicioAnilha());
                }
            } else if (ba.getInicioAnilha() < ba.getFimAnilha()) {
                if (ba.getInicioAnilha() > 0) {
                    for(int i = ba.getInicioAnilha(); i <= ba.getFimAnilha(); i++) {
                        anilhasDigitadas.add(i);
                    }
                } else if (ba.getInicioAnilha() == 0) {
                    anilhasDigitadas.add(ba.getFimAnilha());
                } 
            }
        }
        anilhasArquivo = new ArrayList<>();
        for (BalancaVOF b : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBalanca()) {
            anilhasArquivo.add(b.getAnilha());
        }
        anilhasFaltante = new ArrayList<>();
        if (!anilhasArquivo.containsAll(anilhasDigitadas)) {
            anilhasFaltante.addAll(anilhasDigitadas);
            anilhasFaltante.removeAll(anilhasArquivo);
        }
        anilhasSobra = new ArrayList<>();
        if(!anilhasDigitadas.containsAll(anilhasArquivo)) {
            anilhasSobra.addAll(anilhasArquivo);
            anilhasSobra.removeAll(anilhasDigitadas);
        }
        anilhasDuplicadas = new ArrayList<>();
        int anilhaAnterior = 0;
        for (BalancaVOF b : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBalanca()) {
            if (b.getAnilha()== anilhaAnterior) {
                anilhasDuplicadas.add(b.getAnilha());
            }
            anilhaAnterior = b.getAnilha();
        }
    }
}