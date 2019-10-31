package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 612251
 *
 */
public class ConsumoLivreVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private int galpao;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private boolean finalizado;
	private List<RmeVOST> rme;

	public ConsumoLivreVOST() {
		this.rme = new ArrayList<>();
	}

	public ConsumoLivreVOST(int galpao, int baia, int sexo, int trat1, int trat2, boolean finalizado, List<RmeVOST> rme) {
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.finalizado = finalizado;
		this.rme = rme;
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

	public List<RmeVOST> getRme() {
		return rme;
	}

	public void setRme(List<RmeVOST> rme) {
		this.rme = rme;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}

}