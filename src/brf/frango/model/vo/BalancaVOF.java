package brf.frango.model.vo;

import java.io.Serializable;

public class BalancaVOF implements Serializable {
    private int ordem;
    private int anilha;
    private int pVivo;

    public BalancaVOF(int ordem, int anilha, int pVivo) {
        this.ordem = ordem;
        this.anilha = anilha;
        this.pVivo = pVivo;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getAnilha() {
        return anilha;
    }

    public void setAnilha(int anilha) {
        this.anilha = anilha;
    }

    public int getpVivo() {
        return pVivo;
    }

    public void setpVivo(int pVivo) {
        this.pVivo = pVivo;
    }
}
