package brf.suino.model.vo;

import java.io.Serializable;
import java.util.Date;

public class CostadoVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date data;
	private int tatuagem;
	private int cospeso;
	private int cososste;
	private int cospelgo;
	private int coslombo;
	private int cosreta;

	public CostadoVOST() {
	}

	public CostadoVOST(Date data, int tatuagem, int cospeso, int cocosste, int cospelgo, int coslombo, int cosreta) {
		super();
		this.data = data;
		this.tatuagem = tatuagem;
		this.cospeso = cospeso;
		this.cososste = cocosste;
		this.cospelgo = cospelgo;
		this.coslombo = coslombo;
		this.cosreta = cosreta;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTatuagem() {
		return tatuagem;
	}

	public void setTatuagem(int tatuagem) {
		this.tatuagem = tatuagem;
	}

	public int getCospeso() {
		return cospeso;
	}

	public void setCospeso(int cospeso) {
		this.cospeso = cospeso;
	}

	public int getCocosste() {
		return cososste;
	}

	public void setCocosste(int cocosste) {
		this.cososste = cocosste;
	}

	public int getCospelgo() {
		return cospelgo;
	}

	public void setCospelgo(int cospelgo) {
		this.cospelgo = cospelgo;
	}

	public int getCoslombo() {
		return coslombo;
	}

	public void setCoslombo(int coslombo) {
		this.coslombo = coslombo;
	}

	public int getCosreta() {
		return cosreta;
	}

	public void setCosreta(int cosreta) {
		this.cosreta = cosreta;
	}

}
