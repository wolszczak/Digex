package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MortalidadeVOSC implements Serializable{
	private static final long serialVersionUID = 1L;
	private int galpao;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private int ordem;
	private String data;
	private int peso;
	private int brinco;
	private int fase;
	private int causa;
//	private List<MortoVOSC> mortos;
	
	public MortalidadeVOSC() {
//		this.mortos = new ArrayList<>();
	}
	
	public MortalidadeVOSC(int galpao, int baia, int sexo, int trat1, int trat2, int ordem, String data, int peso, int brinco, int fase, int causa) {
		this.galpao =  galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.ordem = ordem;
		this.data = data;
		this.peso = peso;
		this.brinco = brinco;
		this.fase = fase;
		this.causa = causa;
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


	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getBrinco() {
		return brinco;
	}

	public void setBrinco(int brinco) {
		this.brinco = brinco;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int getCausa() {
		return causa;
	}

	public void setCausa(int causa) {
		this.causa = causa;
	}
	
	
}
