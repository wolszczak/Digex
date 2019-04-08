package brf.peru.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOP implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOP infoExp;
    private List<DesempenhoVOP> desempenho;
    private List<AbateVOP> abates;

    public ExperimentoVOP() {
    	desempenho =  new ArrayList<>();
    	abates =  new ArrayList<>();
    	abates.add(new AbateVOP());
    }
    
    public ExperimentoVOP(InfoExpVOP infoExp) {
        this.infoExp = infoExp;
    }
    
    public InfoExpVOP getInfoExp() {
        return infoExp;
    }

    public void setInfoExp(InfoExpVOP infoExp) {
        this.infoExp = infoExp;
    }

    public List<DesempenhoVOP> getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(List<DesempenhoVOP> desempenho) {
        this.desempenho = desempenho;
    }

    public List<AbateVOP> getAbates() {
        return abates;
    }

    public void setAbates(List<AbateVOP> abates) {
        this.abates = abates;
    }
}
