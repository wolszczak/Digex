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
	private int trat3;
	private List<RmeLivreVOST> rme;

	public ConsumoLivreVOST() {
		this.rme = new ArrayList<>();
	}

	public ConsumoLivreVOST(int galpao, int baia, int sexo, int trat1, int trat2, int trat3,  List<RmeLivreVOST> rme) {
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.trat3 = trat3;
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

	public List<RmeLivreVOST> getRme() {
		return rme;
	}

	public void setRme(List<RmeLivreVOST> rme) {
		this.rme = rme;
	}


	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}

	public int getTrat3() {
		return trat3;
	}

	public void setTrat3(int trat3) {
		this.trat3 = trat3;
	}

}
