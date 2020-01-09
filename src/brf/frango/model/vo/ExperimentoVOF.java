package brf.frango.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOF implements Serializable {
    private InfoExpVOF infoExp;
    private List<DesempenhoVOF> desempenho;
    private List<AbateVOF> abates;

    public ExperimentoVOF() {
        desempenho = new ArrayList<>();
        abates = new ArrayList<>();
        abates.add(new AbateVOF());
        abates.add(new AbateVOF());
        abates.add(new AbateVOF());
    }   
    
    public void setInfoExp(InfoExpVOF infoExp) {
        this.infoExp = infoExp;
    }
    
    public InfoExpVOF getInfoExp() {
        return infoExp;
    }
    
    public void setDesempenho(List<DesempenhoVOF> desempenho) {
        this.desempenho = desempenho;
    }
    
     public List<DesempenhoVOF> getDesempenho() {
        return desempenho;
    }

    public void setAbates(List<AbateVOF> abates) {
        this.abates = abates;
    }
    
     public List<AbateVOF> getAbates() {
        return abates;
    }
}
