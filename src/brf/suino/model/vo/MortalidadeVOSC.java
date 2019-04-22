package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MortalidadeVOSC implements Serializable{
	private static final long serialVersionUID = 1L;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private List<MortoVOSC> mortos;
	
	public MortalidadeVOSC() {
		this.mortos = new ArrayList<>();
	}
	
	private void MortalidadeVOSC(int baia, int sexo, int trat1, int trat2, List<MortoVOSC> mortos) {
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.mortos = mortos;
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

	public List<MortoVOSC> getMortos() {
		return mortos;
	}

	public void setMortos(List<MortoVOSC> mortos) {
		this.mortos = mortos;
	}
	
	
}
