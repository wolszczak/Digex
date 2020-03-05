package brf.frigoaves.model.vo;

import java.io.Serializable;

public class CarcacaAvesVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String data;
	private int contrato;
	private int instal;
	private int carga;
	private int hora;
	private int ordem;
	private int numero;
	private int gord;
	private int carc;
	private int carcsg;
	private int melano;

	public CarcacaAvesVO(String data, int contrato, int instal, int carga, int hora, int ordem, int numero, int gord, int carc, int carcsg,
			int melano) {
		super();
		this.data = data;
		this.contrato = contrato;
		this.instal = instal;
		this.carga = carga;
		this.hora = hora;
		this.ordem = ordem;
		this.numero = numero;
		this.gord = gord;
		this.carc = carc;
		this.carcsg = carcsg;
		this.melano = melano;
	}

	public CarcacaAvesVO() {
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

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGord() {
		return gord;
	}

	public void setGord(int gord) {
		this.gord = gord;
	}

	public int getCarc() {
		return carc;
	}

	public void setCarc(int carc) {
		this.carc = carc;
	}

	public int getCarcsg() {
		return carcsg;
	}

	public void setCarcsg(int carcsg) {
		this.carcsg = carcsg;
	}

	public int getMelano() {
		return melano;
	}

	public void setMelano(int melano) {
		this.melano = melano;
	}

}
