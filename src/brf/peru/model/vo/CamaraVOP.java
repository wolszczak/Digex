package brf.peru.model.vo;

import java.io.Serializable;
import java.util.List;

public class CamaraVOP implements Serializable {
	private static final long serialVersionUID = 1L;
	private int nasa;
	private int pCarcaca;
	private int escGordura;
	private int escCarcaca;

	public CamaraVOP(int nasa, int pCarcaca, int escGordura, int escCarcaca) {
		this.nasa = nasa;
		this.pCarcaca = pCarcaca;
		this.escGordura = escGordura;
		this.escCarcaca = escCarcaca;
	}

	public int getNasa() {
		return nasa;
	}

	public void setNasa(int nasa) {
		this.nasa = nasa;
	}

	public int getpCarcaca() {
		return pCarcaca;
	}

	public void setpCarcaca(int pCarcaca) {
		this.pCarcaca = pCarcaca;
	}

	public int getEscGordura() {
		return escGordura;
	}

	public void setEscGordura(int escGordura) {
		this.escGordura = escGordura;
	}

	public int getEscCarcaca() {
		return escCarcaca;
	}

	public void setEscCarcaca(int escCarcaca) {
		this.escCarcaca = escCarcaca;
	}
}
