package brf.suino.model.vo;

import java.io.Serializable;

public class RmeTratosVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private int baia;
	private int consumo;

	public RmeTratosVOST() {
	}

	public RmeTratosVOST(int ordem, int baia, int consumo) {
		this.ordem = ordem;
		this.baia = baia;
		this.consumo = consumo;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getBaia() {
		return baia;
	}

	public void setBaia(int baia) {
		this.baia = baia;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

}
