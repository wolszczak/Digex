package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOST infoExp;
	private List<MortalidadeVOST> mortalidade;
//	private List<ConsumoVOST> consumo;
	private List<MedicadosVOST> medicados;

	public ExperimentoVOST() {
		this.mortalidade = new ArrayList<>();
//		this.consumo = new ArrayList<>();
		this.medicados = new ArrayList<>();
	}

	public InfoExpVOST getInfoExp() {
		return infoExp;
	}

	public void setInfoExp(InfoExpVOST infoExp) {
		this.infoExp = infoExp;
	}

	public List<MortalidadeVOST> getMortalidade() {
		return mortalidade;
	}

	public void setMortalidade(List<MortalidadeVOST> mortalidade) {
		this.mortalidade = mortalidade;
	}

	public List<MedicadosVOST> getMedicados() {
		return medicados;
	}

	public void setMedicados(List<MedicadosVOST> medicados) {
		this.medicados = medicados;
	}



}
