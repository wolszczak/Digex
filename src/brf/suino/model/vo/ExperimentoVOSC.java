package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import brf.peru.model.vo.ConsumoVOP;

public class ExperimentoVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOSC infoExp;
    private List<ConsumoVOSC> consumo;
    private List<MortoVOSC> mortalidade;
    private List<MedicadosVOSC> medicados ;

    public ExperimentoVOSC() {
        this.consumo = new ArrayList<>();
        this.mortalidade = new ArrayList<>();
        this.medicados = new ArrayList<>();
    }

	public InfoExpVOSC getInfoExp() {
		return infoExp;
	}

	public void setInfoExp(InfoExpVOSC infoExp) {
		this.infoExp = infoExp;
	}

	public List<ConsumoVOSC> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<ConsumoVOSC> consumo) {
		this.consumo = consumo;
	}

	public List<MortoVOSC> getMortalidade() {
		return mortalidade;
	}

	public void setMortalidade(List<MortoVOSC> mortalidade) {
		this.mortalidade = mortalidade;
	}

	public List<MedicadosVOSC> getMedicados() {
		return medicados;
	}

	public void setMedicados(List<MedicadosVOSC> medicados) {
		this.medicados = medicados;
	}


    
}
