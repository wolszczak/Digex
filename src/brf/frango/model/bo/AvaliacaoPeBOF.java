package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.AvaliacaoPeVOF;
import brf.frango.model.vo.LacreAnilhaVOF;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoPeBOF {
    private final ControllerF controller;
    
    public AvaliacaoPeBOF(ControllerF controller) {
        this.controller = controller;
    }
    
    public String verificaErros(int abate, int lacre1, int lacre2, int lacre3, int lacre4, int lacre5) {
        String msg = "";
        List<Integer> lacres = new ArrayList<>();
        lacres.add(lacre1);
        lacres.add(lacre2);
        lacres.add(lacre3);
        lacres.add(lacre4);
        lacres.add(lacre5);
        lacres.sort((Integer n1, Integer n2) -> {
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
            return 0;
        });
        int lacreAnterior = 0;
        for (Integer lacre : lacres) {
            if (lacre == lacreAnterior && lacre != 0) {
                msg = msg.concat("- Lacre digitado mais de uma vez no bloco: " + lacre + "\n");
            }
            lacreAnterior = lacre;
        }
        return msg;
    }
    
    public List<Integer> verificaLacreDuplicado(int abate, int lacre1, int lacre2, int lacre3, int lacre4, int lacre5) {
        List<Integer> lacres = new ArrayList<>();
        List<Integer> lacresDup = new ArrayList<>();
        lacres.add(lacre1);
        lacres.add(lacre2);
        lacres.add(lacre3);
        lacres.add(lacre4);
        lacres.add(lacre5);
        lacres.sort((Integer n1, Integer n2) -> {
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
            return 0;
        });
        for (Integer lacre : lacres) {
            for (AvaliacaoPeVOF a : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe()) {
                if (lacre == a.getLacre()&& lacre != 0) {
                    lacresDup.add(lacre);
                }
            }
        }
        return lacresDup;
    }
    
    public String verificaLacreInexistente(int abate, int lacre1, int lacre2, int lacre3, int lacre4, int lacre5) {
        String msg = "";
        List<Integer> lacres = new ArrayList<>();
        lacres.add(lacre1);
        lacres.add(lacre2);
        lacres.add(lacre3);
        lacres.add(lacre4);
        lacres.add(lacre5);
        lacres.sort((Integer n1, Integer n2) -> {
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
            return 0;
        });
        
        for (Integer lacre : lacres) {
            String lacreInexistente = "";
            if (lacre != 0) {
                lacreInexistente = "- Lacre digitado sem anilha correspondente: " + lacre + "\n";
            }
            for (LacreAnilhaVOF la : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha()) {
                if (lacre == la.getLacre()) {
                     lacreInexistente = "";
                     break;
                }
            }
            msg = msg.concat(lacreInexistente);
        }
        return msg;
    }
    
    public void excluirAnimais(int abate, List<Integer> lacresDup) {
        List<AvaliacaoPeVOF> lacresRemocao = new ArrayList<>();
        for (Integer lacreDuplicado : lacresDup) {
            for(AvaliacaoPeVOF avaliacaoPe: controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe()) {
                if (lacreDuplicado == avaliacaoPe.getLacre()) {
                    lacresRemocao.add(avaliacaoPe);
                    break;
                }            
            }
        }
        for (AvaliacaoPeVOF lacreDuplicado : lacresRemocao) {
            controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe().remove(lacreDuplicado);
        }
        ajustaOrdem(abate);
        controller.getModel().getModelStateDAO().saveModelState(false);
    }
    
    public void removeLacresZerados(int abate) {
        List<AvaliacaoPeVOF> it = new ArrayList<>();
        it.addAll(controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe());
        for(AvaliacaoPeVOF avaliacaoPe: it) {
            if (avaliacaoPe.getLacre()== 0) {
                controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe().remove(avaliacaoPe);
            }            
        }
        ajustaOrdem(abate);
        controller.getModel().getModelStateDAO().saveModelState(false);
    }
    
    private void ajustaOrdem(int abate) {
        int ordem = 1;
        while (controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe().size() % 5 != 0) {
            controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe().add(new AvaliacaoPeVOF(
                    0, 0, 0, 0, 0));
        }
        for(AvaliacaoPeVOF avaliacaoPe: controller.getModel().getExperimentoVO().getAbates().get(abate-1).getAvaliacaoPe()) {
            avaliacaoPe.setOrdem(ordem++);
        }
    }
}
