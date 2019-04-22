package brf.suino.model.vo;

import java.io.Serializable;

public class MortoVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;

	public MortoVOSC(int ordem) {
		this.ordem = ordem;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}


}
