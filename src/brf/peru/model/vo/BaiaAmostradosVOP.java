package brf.peru.model.vo;

import java.io.Serializable;

public class BaiaAmostradosVOP implements Serializable {
	private static final long serialVersionUID = 1L;
    private int ordem;
    private int nrBaia;
    private int nasa1;
    private int peso1;
    
    public BaiaAmostradosVOP(int ordem, int nrBaia, int nasa1, int peso1) {
        this.ordem = ordem;
        this.nrBaia = nrBaia;
        this.nasa1 = nasa1;
        this.peso1 = peso1;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getNrBaia() {
        return nrBaia;
    }

    public void setNrBaia(int nrBaia) {
        this.nrBaia = nrBaia;
    }

    public int getNasa1() {
        return nasa1;
    }

    public void setNasa1(int nasa1) {
        this.nasa1 = nasa1;
    }

    public int getPeso1() {
        return peso1;
    }

    public void setPeso1(int peso1) {
        this.peso1 = peso1;
    }

}
