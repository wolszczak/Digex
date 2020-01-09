package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.LacreAnilhaVOF;
import java.util.ArrayList;
import java.util.List;

public class LacreAnilhaBOF {
    private final ControllerF controller;
    
    public LacreAnilhaBOF(ControllerF controller) {
        this.controller = controller;
    }
    
    public String verificaErros(int abate, int nasa1, int nasa2, int nasa3, int nasa4, int nasa5) {
        String msg = "";
        List<Integer> nasas = new ArrayList<>();
        nasas.add(nasa1);
        nasas.add(nasa2);
        nasas.add(nasa3);
        nasas.add(nasa4);
        nasas.add(nasa5);
        nasas.sort((Integer n1, Integer n2) -> {
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
            return 0;
        });
        int nasaAnterior = 0;
        for (Integer nasa : nasas) {
            if (nasa == nasaAnterior && nasa != 0) {
                msg = msg.concat("- Anilha digitada mais de uma vez no bloco: " + nasa + "\n");
            }
            nasaAnterior = nasa;
        }
        return msg;
    }
    
    public List<Integer> verificaNasaDuplicada(int abate, int nasa1, int nasa2, int nasa3, int nasa4, int nasa5) {
        List<Integer> nasas = new ArrayList<>();
        List<Integer> nasasDup = new ArrayList<>();
        nasas.add(nasa1);
        nasas.add(nasa2);
        nasas.add(nasa3);
        nasas.add(nasa4);
        nasas.add(nasa5);
        nasas.sort((Integer n1, Integer n2) -> {
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
            return 0;
        });
        for (Integer nasa : nasas) {
            for (LacreAnilhaVOF la : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha()) {
                if (nasa == la.getNasa() && nasa != 0) {
                    nasasDup.add(nasa);
                }
            }
        }
        return nasasDup;
    }
    
    public void excluirAnimais(int abate, List<Integer> nasasDup) {
        List<LacreAnilhaVOF> nasasRemocao = new ArrayList<>();
        for (Integer nasaDuplicada : nasasDup) {
            for(LacreAnilhaVOF lacreAnilha: controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha()) {
                if (nasaDuplicada == lacreAnilha.getNasa()) {
                    nasasRemocao.add(lacreAnilha);
                    break;
                }            
            }
        }
        for (LacreAnilhaVOF nasaDuplicada : nasasRemocao) {
            controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha().remove(nasaDuplicada);
        }
        ajustaOrdem(abate);
        controller.getModel().getModelStateDAO().saveModelState(false);
    }
    
    public void removeNasasZeradas(int abate) {
        List<LacreAnilhaVOF> it = new ArrayList<>();
        it.addAll(controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha());
        for(LacreAnilhaVOF lacreAnilha: it) {
            if (lacreAnilha.getNasa() == 0) {
                controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha().remove(lacreAnilha);
            }            
        }
        ajustaOrdem(abate);
        controller.getModel().getModelStateDAO().saveModelState(false);
    }
    
    private void ajustaOrdem(int abate) {
        int ordem = 1;
        while (controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha().size() % 5 != 0) {
            controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha().add(new LacreAnilhaVOF(
                    0, 0, 0, 0));
        }
        for(LacreAnilhaVOF lacreAnilha: controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha()) {
            lacreAnilha.setOrdem(ordem++);
        }
    }
    
    public boolean temDados(int abate) {
        return !controller.getModel().getExperimentoVO().getAbates().get(abate-1).getLacreAnilha().isEmpty();
    }
}
