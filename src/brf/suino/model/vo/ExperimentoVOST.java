package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExperimentoVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private InfoExpVOST infoExp;
	private List<BaiaVOST> baias;
	private List<ConsumoTratosVOST> consumosTratos;
	private List<FrigorificoVOST> frigorificoVOST;

	public ExperimentoVOST() {
		this.baias = new ArrayList<>();
		this.consumosTratos = new ArrayList<>();
		this.frigorificoVOST = new ArrayList<>();
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

	public List<ConsumoTratosVOST> getConsumosTratos() {
		return consumosTratos;
	}

	public void setConsumosTratos(List<ConsumoTratosVOST> consumosTratos) {
		this.consumosTratos = consumosTratos;
	}

	public List<FrigorificoVOST> getFrigorificoVOST() {
		return frigorificoVOST;
	}

	public void setFrigorificoVOST(List<FrigorificoVOST> frigorificoVOST) {
		this.frigorificoVOST = frigorificoVOST;
	}

}
