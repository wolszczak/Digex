package brf.peru.model.vo;

import java.io.Serializable;

public class ConsumoVOP implements Serializable {
	private static final long serialVersionUID = 1L;
    private int fase;
    private int ordem;
    private int fornecida;
    private int sobra;

    public ConsumoVOP(int fase, int ordem, int fornecida, int sobra) {
        this.fase = fase;
        this.ordem = ordem;
        this.fornecida = fornecida;
        this.sobra = sobra;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getFornecida() {
        return fornecida;
    }

    public void setFornecida(int fornecida) {
        this.fornecida = fornecida;
    }

    public int getSobra() {
        return sobra;
    }

    public void setSobra(int sobra) {
        this.sobra = sobra;
    }    
}
