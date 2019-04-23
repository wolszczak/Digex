package brf.suino.model.vo;

import java.io.Serializable;

public class RmeVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private int idadeRacao;
	private int fornecida;
	private int sobra;
	private int peso;
	private int numAnimais;
	
	public RmeVOSC() {
	}

	public RmeVOSC(int ordem, int idadeRacao, int fornecida, int sobra,int peso, int numAnimais) {
		this.ordem = ordem;
		this.idadeRacao = idadeRacao;
		this.fornecida = fornecida;
		this.sobra = sobra;
		this.peso = peso;
		this.numAnimais = numAnimais;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getIdadeRacao() {
		return idadeRacao;
	}

	public void setIdadeRacao(int idadeRacao) {
		this.idadeRacao = idadeRacao;
	}

	public int getFornecida() {
		return fornecida;
	}

	public void setFornecida(int fornecida) {
		this.fornecida = fornecida;
	}

	public int getSobra() {
		return sobra;
	}

	public void setSobra(int sobra) {
		this.sobra = sobra;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getNumAnimais() {
		return numAnimais;
	}

	public void setNumAnimais(int numAnimais) {
		this.numAnimais = numAnimais;
	}

}
