package brf.suino.model.vo;

import java.io.Serializable;
import java.util.Date;

public class PaletaVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date data;
	private int tatuagem;
	private int palpeso;
	private int pelpelgo;
	private int palpegof;
	private int palpegom;
	private int palosste;
	private int palcama;
	private int palcmsp;

	public PaletaVOST() {

	}

	public PaletaVOST(Date data, int tatuagem, int palpeso, int pelpelgo, int palpegof, int palpegom, int palosste, int palcama,
			int palcmsp) {
		super();
		this.data = data;
		this.tatuagem = tatuagem;
		this.palpeso = palpeso;
		this.pelpelgo = pelpelgo;
		this.palpegof = palpegof;
		this.palpegom = palpegom;
		this.palosste = palosste;
		this.palcama = palcama;
		this.palcmsp = palcmsp;
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

	public int getPalpeso() {
		return palpeso;
	}

	public void setPalpeso(int palpeso) {
		this.palpeso = palpeso;
	}

	public int getPelpelgo() {
		return pelpelgo;
	}

	public void setPelpelgo(int pelpelgo) {
		this.pelpelgo = pelpelgo;
	}

	public int getPalpegof() {
		return palpegof;
	}

	public void setPalpegof(int palpegof) {
		this.palpegof = palpegof;
	}

	public int getPalpegom() {
		return palpegom;
	}

	public void setPalpegom(int palpegom) {
		this.palpegom = palpegom;
	}

	public int getPalosste() {
		return palosste;
	}

	public void setPalosste(int palosste) {
		this.palosste = palosste;
	}

	public int getPalcama() {
		return palcama;
	}

	public void setPalcama(int palcama) {
		this.palcama = palcama;
	}

	public int getPalcmsp() {
		return palcmsp;
	}

	public void setPalcmsp(int palcmsp) {
		this.palcmsp = palcmsp;
	}

}
