package brf.suino.model.vo;

import java.io.Serializable;

public class MortoVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private String data;
	private int peso;
	private int brinco;
	private int fase;
	private int causa;

	public MortoVOSC(int ordem, String data, Integer brinco, Integer peso, Integer fase, Integer causa) {
		this.ordem = ordem;
		this.data = data;
		this.brinco = brinco;
		this.peso = peso;
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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
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

	public int getBrinco() {
		return brinco;
	}

	public void setBrinco(int brinco) {
		this.brinco = brinco;
	}

}
