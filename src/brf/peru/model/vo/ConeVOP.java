package brf.peru.model.vo;

import java.io.Serializable;

public class ConeVOP implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private int ordem;
    private int nasa;
    private int pGordura;
    private int pPeito1;
    private int pPeito2;
    private int pesoSobreCoxa;

    public ConeVOP(int ordem, int nasa, int pGordura, int pPeito1, int pPeito2, int pesoSobreCoxa) {
        this.ordem = ordem;
        this.nasa = nasa;
        this.pGordura = pGordura;
        this.pPeito1 = pPeito1;
        this.pPeito2 = pPeito2;
        this.pesoSobreCoxa = pesoSobreCoxa;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getNasa() {
        return nasa;
    }

    public void setNasa(int nasa) {
        this.nasa = nasa;
    }

    public int getpGordura() {
        return pGordura;
    }

    public void setpGordura(int pGordura) {
        this.pGordura = pGordura;
    }

    public int getpPeito1() {
        return pPeito1;
    }

    public void setpPeito1(int pPeito1) {
        this.pPeito1 = pPeito1;
    }

    public int getpPeito2() {
        return pPeito2;
    }

    public void setpPeito2(int pPeito2) {
        this.pPeito2 = pPeito2;
    }

    public int getPesoSobreCoxa() {
        return pesoSobreCoxa;
    }

    public void setPesoSobreCoxa(int pesoSobreCoxa) {
        this.pesoSobreCoxa = pesoSobreCoxa;
    }
}