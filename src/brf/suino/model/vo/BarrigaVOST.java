package brf.suino.model.vo;

import java.io.Serializable;
import java.util.Date;

public class BarrigaVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date data;
	private int tatuagem;
	private int barpeso;
	private int barcptpf;
	private int barpront;
	private int baresgor;
	private int palleca;

	public BarrigaVOST() {

	}

	public BarrigaVOST(Date data, int tatuagem, int barpeso, int barcptpf, int barpront, int baresgor, int palleca) {
		super();
		this.data = data;
		this.tatuagem = tatuagem;
		this.barpeso = barpeso;
		this.barcptpf = barcptpf;
		this.barpront = barpront;
		this.baresgor = baresgor;
		this.palleca = palleca;
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

	public int getBarpeso() {
		return barpeso;
	}

	public void setBarpeso(int barpeso) {
		this.barpeso = barpeso;
	}

	public int getBarcptpf() {
		return barcptpf;
	}

	public void setBarcptpf(int barcptpf) {
		this.barcptpf = barcptpf;
	}

	public int getBarpront() {
		return barpront;
	}

	public void setBarpront(int barpront) {
		this.barpront = barpront;
	}

	public int getBaresgor() {
		return baresgor;
	}

	public void setBaresgor(int baresgor) {
		this.baresgor = baresgor;
	}

	public int getPalleca() {
		return palleca;
	}

	public void setPalleca(int palleca) {
		this.palleca = palleca;
	}

}
