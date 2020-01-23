package brf.suino.model.vo;

import java.io.Serializable;
import java.util.Date;

public class PernilVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private String data;
	private int tatuagem;
	private int perpeso;
	private int perpelgo;
	private int perpegof;
	private int perpegom;
	private int perosste;
	private int permusc;
	private int perpe;
	private int percjpcs;
	private int perpeh24;
	private int perdini;
	private int perdfin;

	public PernilVOST() {
	}
	
	public PernilVOST(String data, int tatuagem, int perpeso, int perpelgo, int perpegof, int perpegom, int perosste, int permusc, int perpe,
			int percjpcs, int perpeh24, int perdini, int perdfin) {
		super();
		this.data = data;
		this.tatuagem = tatuagem;
		this.perpeso = perpeso;
		this.perpelgo = perpelgo;
		this.perpegof = perpegof;
		this.perpegom = perpegom;
		this.perosste = perosste;
		this.permusc = permusc;
		this.perpe = perpe;
		this.percjpcs = percjpcs;
		this.perpeh24 = perpeh24;
		this.perdini = perdini;
		this.perdfin = perdfin;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getTatuagem() {
		return tatuagem;
	}

	public void setTatuagem(int tatuagem) {
		this.tatuagem = tatuagem;
	}

	public int getPerpeso() {
		return perpeso;
	}

	public void setPerpeso(int perpeso) {
		this.perpeso = perpeso;
	}

	public int getPerpelgo() {
		return perpelgo;
	}

	public void setPerpelgo(int perpelgo) {
		this.perpelgo = perpelgo;
	}

	public int getPerpegof() {
		return perpegof;
	}

	public void setPerpegof(int perpegof) {
		this.perpegof = perpegof;
	}

	public int getPerpegom() {
		return perpegom;
	}

	public void setPerpegom(int perpegom) {
		this.perpegom = perpegom;
	}

	public int getPerosste() {
		return perosste;
	}

	public void setPerosste(int perosste) {
		this.perosste = perosste;
	}

	public int getPermusc() {
		return permusc;
	}

	public void setPermusc(int permusc) {
		this.permusc = permusc;
	}

	public int getPerpe() {
		return perpe;
	}

	public void setPerpe(int perpe) {
		this.perpe = perpe;
	}

	public int getPercjpcs() {
		return percjpcs;
	}

	public void setPercjpcs(int percjpcs) {
		this.percjpcs = percjpcs;
	}

	public int getPerpeh24() {
		return perpeh24;
	}

	public void setPerpeh24(int perpeh24) {
		this.perpeh24 = perpeh24;
	}

	public int getPerdini() {
		return perdini;
	}

	public void setPerdini(int perdini) {
		this.perdini = perdini;
	}

	public int getPerdfin() {
		return perdfin;
	}

	public void setPerdfin(int perdfin) {
		this.perdfin = perdfin;
	}
	
	
	
}
