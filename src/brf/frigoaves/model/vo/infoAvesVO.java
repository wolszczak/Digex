package brf.frigoaves.model.vo;

import java.io.Serializable;

public class infoAvesVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private String nome;
	private int contrato;
	private int instal;
	private int carga;
	private int horaini;
	private int horafin;

	public infoAvesVO(String data, String nome, int contrato, int instal, int carga, int horaini, int horafin) {
		this.data = data;
		this.nome = nome;
		this.contrato = contrato;
		this.instal = instal;
		this.carga = carga;
		this.horaini = horaini;
		this.horafin = horafin;
	}

	public infoAvesVO() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public int getInstal() {
		return instal;
	}

	public void setInstal(int instal) {
		this.instal = instal;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getHoraini() {
		return horaini;
	}

	public void setHoraini(int horaini) {
		this.horaini = horaini;
	}

	public int getHorafin() {
		return horafin;
	}

	public void setHorafin(int horafin) {
		this.horafin = horafin;
	}

}
