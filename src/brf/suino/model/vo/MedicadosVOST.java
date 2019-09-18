package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicadosVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private int galpao;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private int ordem;
	private String data;
	private int brinco;
	private int medicamento;
	private int causa;
	private int dose1;
	private int dose2;
	private int dose3;
	private int controle;

	public MedicadosVOST() {
	}

	public MedicadosVOST(int galpao, int baia, int sexo, int trat1, int trat2, int ordem, String data, int brinco, int medicamento,
			int causa, int dose1, int dose2, int dose3, int controle) {
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.ordem = ordem;
		this.data = data;
		this.brinco = brinco;
		this.medicamento = medicamento;
		this.causa = causa;
		this.dose1 = dose1;
		this.dose2 = dose2;
		this.dose3 = dose3;
		this.controle = controle;
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

	public int getBrinco() {
		return brinco;
	}

	public void setBrinco(int brinco) {
		this.brinco = brinco;
	}

	public int getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(int medicamento) {
		this.medicamento = medicamento;
	}

	public int getCausa() {
		return causa;
	}

	public void setCausa(int causa) {
		this.causa = causa;
	}

	public int getDose1() {
		return dose1;
	}

	public void setDose1(int dose1) {
		this.dose1 = dose1;
	}

	public int getDose2() {
		return dose2;
	}

	public void setDose2(int dose2) {
		this.dose2 = dose2;
	}

	public int getDose3() {
		return dose3;
	}

	public void setDose3(int dose3) {
		this.dose3 = dose3;
	}

	public int getControle() {
		return controle;
	}

	public void setControle(int controle) {
		this.controle = controle;
	}

}
