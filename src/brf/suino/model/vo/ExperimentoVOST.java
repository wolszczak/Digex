package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOST infoExp;
//	private List<ConsumoVOST> consumo;
//	private List<MortalidadeVOSC> mortalidade;
//	private List<MedicadosVOSC> medicados;

	public ExperimentoVOST() {
//		this.consumo = new ArrayList<>();
//		this.mortalidade = new ArrayList<>();
//		this.medicados = new ArrayList<>();
	}

	public InfoExpVOST getInfoExp() {
		return infoExp;
	}

	public void setInfoExp(InfoExpVOST infoExp) {
		this.infoExp = infoExp;
	}



}
