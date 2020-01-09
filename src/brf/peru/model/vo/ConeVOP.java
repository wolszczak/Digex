package brf.peru.model.vo;

import java.io.Serializable;

public class ConeVOP implements Serializable {

	private static final long serialVersionUID = 1L;
	private int abate;
	private int camara;
	private int ncone;
	private int nasa;
	private int pGordura;
	private int pPeito1;
	private int pesoSobreCoxa;

	public ConeVOP() {
		
	}
	
	public ConeVOP(int abate, int camara, int ncone, int nasa, int pGordura, int pPeito1, int pesoSobreCoxa) {
		this.abate = abate;
		this.camara = camara;
		this.ncone = ncone;
		this.nasa = nasa;
		this.pGordura = pGordura;
		this.pPeito1 = pPeito1;
		this.pesoSobreCoxa = pesoSobreCoxa;
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

	public int getPesoSobreCoxa() {
		return pesoSobreCoxa;
	}

	public void setPesoSobreCoxa(int pesoSobreCoxa) {
		this.pesoSobreCoxa = pesoSobreCoxa;
	}

	public int getCamara() {
		return camara;
	}

	public void setCamara(int camara) {
		this.camara = camara;
	}

	public int getNcone() {
		return ncone;
	}

	public void setNcone(int ncone) {
		this.ncone = ncone;
	}

	public int getAbate() {
		return abate;
	}

	public void setAbate(int abate) {
		this.abate = abate;
	}
}
