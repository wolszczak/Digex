package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOSC implements Serializable {
    private InfoExpVOSC infoExp;
    private List<DesempenhoVOSC> desempenho;

    public ExperimentoVOSC() {
        desempenho = new ArrayList<>();
    }

	public InfoExpVOSC getInfoExp() {
		return infoExp;
	}

	public void setInfoExp(InfoExpVOSC infoExp) {
		this.infoExp = infoExp;
	}

	public List<DesempenhoVOSC> getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(List<DesempenhoVOSC> desempenho) {
		this.desempenho = desempenho;
	}   
    
    
    
}
