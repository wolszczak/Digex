package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MortalidadeVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ordem;
	private String data;
	private int pesoMorto;
	private int brinco;
	private int fase;
	private int causa;

	public MortalidadeVOST() {
	}

	public MortalidadeVOST(int ordem, String data, int pesoMorto, int brinco, int fase, int causa) {
		this.ordem = ordem;
		this.data = data;
		this.pesoMorto = pesoMorto;
		this.brinco = brinco;
		this.fase = fase;
		this.causa = causa;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getBrinco() {
		return brinco;
	}

	public void setBrinco(int brinco) {
		this.brinco = brinco;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int getCausa() {
		return causa;
	}

	public void setCausa(int causa) {
		this.causa = causa;
	}

	public int getPesoMorto() {
		return pesoMorto;
	}

	public void setPesoMorto(int pesoMorto) {
		this.pesoMorto = pesoMorto;
	}

}
