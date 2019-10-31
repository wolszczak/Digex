package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOST infoExp;
	private List<BaiaVOST> baias;

	public ExperimentoVOST() {
		this.baias = new ArrayList<>();
	}

	public InfoExpVOST getInfoExp() {
		return infoExp;
	}

	public void setInfoExp(InfoExpVOST infoExp) {
		this.infoExp = infoExp;
	}

	public List<BaiaVOST> getBaias() {
		return baias;
	}

	public void setBaias(List<BaiaVOST> baias) {
		this.baias = baias;
	}

}
