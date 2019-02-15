package brf.peru.model.vo;

import java.io.Serializable;

public class BaiaAmostradosVOP implements Serializable {
	private static final long serialVersionUID = 1L;
    private int nrBaia;
    private int nasa;
    private int peso;
    
    public BaiaAmostradosVOP(int nrBaia, int nasa, int peso) {
        this.nrBaia = nrBaia;
        this.nasa = nasa;
        this.peso = peso;
    }
    
    public BaiaAmostradosVOP() {
	}

	public int getNrBaia() {
		return nrBaia;
	}

	public void setNrBaia(int nrBaia) {
		this.nrBaia = nrBaia;
	}

	public int getNasa() {
		return nasa;
	}

	public void setNasa(int nasa) {
		this.nasa = nasa;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


}
