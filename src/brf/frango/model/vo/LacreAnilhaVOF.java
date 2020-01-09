package brf.frango.model.vo;

import java.io.Serializable;

public class LacreAnilhaVOF implements Serializable {
    private int ordem;
    private int baia;
    private int nasa;
    private int lacre;

    public LacreAnilhaVOF(int ordem, int baia, int nasa, int lacre) {
        this.ordem = ordem;
        this.baia = baia;
        this.nasa = nasa;
        this.lacre = lacre;
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

    public int getNasa() {
        return nasa;
    }

    public void setNasa(int nasa) {
        this.nasa = nasa;
    }

    public int getLacre() {
        return lacre;
    }

    public void setLacre(int lacre) {
        this.lacre = lacre;
    }
}
