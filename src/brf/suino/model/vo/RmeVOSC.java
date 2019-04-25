package brf.suino.model.vo;

import java.io.Serializable;

public class RmeVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private String dataRacao;
	private int fornecida;
	private int sobra;
	private int peso;
	private int numAnimais;
	
	public RmeVOSC() {
	}

	public RmeVOSC(int ordem, String dataRacao, int fornecida, int sobra,int peso, int numAnimais) {
		this.ordem = ordem;
		this.dataRacao = dataRacao;
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

	public String getIdadeRacao() {
		return dataRacao;
	}

	public void setIdadeRacao(String idadeRacao) {
		this.dataRacao = idadeRacao;
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

	public String getDataRacao() {
		return dataRacao;
	}

	public void setDataRacao(String dataRacao) {
		this.dataRacao = dataRacao;
	}

}
