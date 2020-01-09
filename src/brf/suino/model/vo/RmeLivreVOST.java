package brf.suino.model.vo;

import java.io.Serializable;

public class RmeLivreVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private String dataRacao;
	private int fornecida;
	private int sobra;

	public RmeLivreVOST() {
	}

	public RmeLivreVOST(int ordem, String dataRacao, int fornecida, int sobra) {
		this.ordem = ordem;
		this.dataRacao = dataRacao;
		this.fornecida = fornecida;
		this.sobra = sobra;
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

	public String getDataRacao() {
		return dataRacao;
	}

	public void setDataRacao(String dataRacao) {
		this.dataRacao = dataRacao;
	}

}
