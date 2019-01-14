package brf.frango.model.vo;

import java.io.Serializable;

public class AvaliacaoPeVOF implements Serializable {
    private int abate;
    private int ordem;
    private int lacre;
    private int pesoPe;
    private int escore;

    public AvaliacaoPeVOF(int abate, int ordem, int lacre, int pesoPe, int escore) {
        this.abate = abate;
        this.ordem = ordem;
        this.lacre = lacre;
        this.pesoPe = pesoPe;
        this.escore = escore;
    }
    
    public int getAbate() {
        return abate;
    }

    public void setAbate(int abate) {
        this.abate = abate;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getLacre() {
        return lacre;
    }

    public void setLacre(int lacre) {
        this.lacre = lacre;
    }

    public int getPesoPe() {
        return pesoPe;
    }

    public void setPesoPe(int pesoPe) {
        this.pesoPe = pesoPe;
    }

    public int getEscore() {
        return escore;
    }

    public void setEscore(int escore) {
        this.escore = escore;
    }
}
