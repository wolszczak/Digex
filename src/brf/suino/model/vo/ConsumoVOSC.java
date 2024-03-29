package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsumoVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int galpao;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private boolean colunaExtra,finalizado;
	private List<RmeVOSC> rme;
	
	public ConsumoVOSC() {
		this.rme = new ArrayList<>();
	}
	
	public ConsumoVOSC(int galpao, int baia, int sexo, int trat1, int trat2, boolean colunaExtra, boolean finalizado, List<RmeVOSC> rme) {
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.colunaExtra = colunaExtra;
		this.finalizado =  finalizado;
		this.rme =  rme;
	}

	public int getBaia() {
		return baia;
	}

	public void setBaia(int baia) {
		this.baia = baia;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getTrat1() {
		return trat1;
	}

	public void setTrat1(int trat1) {
		this.trat1 = trat1;
	}

	public int getTrat2() {
		return trat2;
	}

	public void setTrat2(int trat2) {
		this.trat2 = trat2;
	}

	public List<RmeVOSC> getRme() {
		return rme;
	}

	public void setRme(List<RmeVOSC> rme) {
		this.rme = rme;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public boolean isColunaExtra() {
		return colunaExtra;
	}

	public void setColunaExtra(boolean colunaExtra) {
		this.colunaExtra = colunaExtra;
	}

	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}
	
	

}
