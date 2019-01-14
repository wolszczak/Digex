package brf.peru.model.vo;

import java.io.Serializable;

public class BaiaAmostradosVOP implements Serializable {
	private static final long serialVersionUID = 1L;
    private int ordem;
    private int nrBaia;
    private int nasa1;
    private int peso1;
    private int nasa2;
    private int peso2;
    
    public BaiaAmostradosVOP(int ordem, int nrBaia, int nasa1, int peso1, int nasa2, int peso2) {
        this.ordem = ordem;
        this.nrBaia = nrBaia;
        this.nasa1 = nasa1;
        this.peso1 = peso1;
        this.nasa2 = nasa2;
        this.peso2 = peso2;
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

    public int getNasa2() {
        return nasa2;
    }

    public void setNasa2(int nasa2) {
        this.nasa2 = nasa2;
    }

    public int getPeso2() {
        return peso2;
    }

    public void setPeso2(int peso2) {
        this.peso2 = peso2;
    }
}
