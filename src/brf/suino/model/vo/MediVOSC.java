package brf.suino.model.vo;

import java.io.Serializable;

public class MediVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;

	public MediVOSC(int ordem) {
		this.ordem = ordem;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}


}
