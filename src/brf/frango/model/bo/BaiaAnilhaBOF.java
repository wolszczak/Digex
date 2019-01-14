package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.BaiaAnilhaVOF;
import java.util.ArrayList;
import java.util.List;

public class BaiaAnilhaBOF {
    private final ControllerF controller;
    private List<Integer> baiasRegistradas;
    private List<Integer> nasasRegistradas;
    private List<Integer> nasas;
    private List<Integer> baiasDup;
    private List<Integer> nasasDup;    
    
    public BaiaAnilhaBOF(ControllerF controller) {
        this.controller = controller;
    }
    
    public List<Integer> verificaNasasDuplicadas(int abate, int inicioNasa, int fimNasa) {
        baiasRegistradas = new ArrayList<>();
        nasasRegistradas = new ArrayList<>();
        nasas = new ArrayList<>();
        baiasDup = new ArrayList<>();
        nasasDup = new ArrayList<>();
        int limInferior = 0, limSuperior = 0;        
        for (BaiaAnilhaVOF la : controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBaiaAnilha()) {
            limInferior = 0;
            limSuperior = 0;  
            if (la.getInicioAnilha() > la.getFimAnilha()) {
                if (la.getFimAnilha() > 0) {
                    limInferior = la.getFimAnilha();
                    limSuperior = la.getInicioAnilha();
                } else if (la.getFimAnilha() == 0) {
                    limInferior = la.getInicioAnilha();
                    limSuperior = la.getInicioAnilha();
                }
            } else if (la.getInicioAnilha() == la.getFimAnilha()) {
                limInferior = la.getInicioAnilha();
                limSuperior = la.getFimAnilha();
            } else if (la.getInicioAnilha() < la.getFimAnilha()) {
                if (la.getInicioAnilha() > 0) {
                    limInferior = la.getInicioAnilha();
                    limSuperior = la.getFimAnilha();
                } else if (la.getInicioAnilha() == 0) {
                    limInferior = la.getFimAnilha();
                    limSuperior = la.getFimAnilha();
                } 
            }
            for(int i = limInferior; i <= limSuperior; i++) {
                if (i != 0) {
                    baiasRegistradas.add(la.getBaia());
                    nasasRegistradas.add(i);
                }
            }
        }
          
        if (inicioNasa > fimNasa) {
            if (fimNasa > 0) {
                limInferior = fimNasa;
                limSuperior = inicioNasa;
            } else if (fimNasa == 0) {
                limInferior = inicioNasa;
                limSuperior = inicioNasa;
            }
        } else if (inicioNasa == fimNasa) {
            limInferior = inicioNasa;
            limSuperior = fimNasa;
        } else if (inicioNasa < fimNasa) {
            if (inicioNasa > 0) {
                limInferior = inicioNasa;
                limSuperior = fimNasa;
            } else if (inicioNasa == 0) {
                limInferior = fimNasa;
                limSuperior = fimNasa;
            } 
        }
        for(int i = limInferior; i <= limSuperior; i++) {
            if (i != 0) {
                nasas.add(i);
            }
        }
        
        
        for (Integer nasa : nasas) {
            for (Integer registrada : nasasRegistradas) {
                if (nasa.equals(registrada)) {
                    nasasDup.add(nasa);
                    baiasDup.add(baiasRegistradas.get(nasasRegistradas.indexOf(registrada)));
                }
            }
        }
        return nasasDup;
    }
    
    public List<Integer> getBaiasAnilhasDup() {
        return baiasDup;
    }
    
    public void apagaRegistros(int abate) {
        controller.getModel().getExperimentoVO().getAbates().get(abate-1).getBaiaAnilha().clear();
    }
    
}
