package brf.frigoaves.model.vo;

import java.io.Serializable;

public class infoAves2VO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private int contrato;
	private int instal;
	private int carga;
	private int hora;

	public infoAves2VO(String data, int contrato, int instal, int carga, int hora) {
		this.data = data;
		this.contrato = contrato;
		this.instal = instal;
		this.carga = carga;
		this.hora = hora;
	}

	public infoAves2VO() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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
		return hora;
	}

	public void setHoraini(int horaini) {
		this.hora = horaini;
	}

}
