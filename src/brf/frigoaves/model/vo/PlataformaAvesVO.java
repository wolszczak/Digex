package brf.frigoaves.model.vo;

import java.io.Serializable;

public class PlataformaAvesVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private String nome;
	private int contrato;
	private int instal;
	private String cor;
	private int carga;
	private int horaIni;
	private int horaFim;
	private int numero;
	private int peso;

	public PlataformaAvesVO(String data, String nome, int contrato, int instal, String cor, int carga, int horaIni, int horaFim, int numero, int peso) {
		this.data = data;
		this.nome = nome;
		this.contrato = contrato;
		this.instal = instal;
		this.cor = cor;
		this.carga = carga;
		this.horaIni = horaIni;
		this.horaFim = horaFim;
		this.numero = numero;
		this.peso = peso;
	}

	public PlataformaAvesVO() {
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getHoraIni() {
		return horaIni;
	}

	public void setHoraIni(int horaIni) {
		this.horaIni = horaIni;
	}

	public int getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
