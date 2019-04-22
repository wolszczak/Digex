package brf.suino.model.vo;

import java.io.Serializable;

public class RmeVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ordem;
	private int idadeRacao;
	private int fornecida;
	private int sobra;
	
	public RmeVOSC() {
	}

	public RmeVOSC(int ordem, int idadeRacao, int fornecida, int sobra) {
		this.ordem = ordem;
		this.idadeRacao = idadeRacao;
		this.fornecida = fornecida;
		this.sobra = sobra;
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

}
