package brf.peru.model.vo;

import java.io.Serializable;

public class RmeVOP implements Serializable {
	private int ordem;
	private int idadeRacao;
	private int fornecida;
	private int sobra;
	private MortalidadeVOP mortos;
	private EliminadosVOP eliminados;
	private ErrosVOP erros;
	private AmostradosVOP amostrados;
	private PesadosVOP pesados;

	public RmeVOP(int ordem, int idadeRacao, int fornecida, int sobra, MortalidadeVOP mortos,
			EliminadosVOP eliminados, ErrosVOP erros, AmostradosVOP amostrados, PesadosVOP pesados) {
		this.ordem = ordem;
		this.idadeRacao = idadeRacao;
		this.fornecida = fornecida;
		this.sobra = sobra;
		this.mortos =  mortos;
		this.eliminados = eliminados;
		this.erros = erros;
		this.amostrados =  amostrados;
		this.pesados = pesados;
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

	public MortalidadeVOP getMortos() {
		return mortos;
	}

	public void setMortos(MortalidadeVOP mortos) {
		this.mortos = mortos;
	}

	public EliminadosVOP getEliminados() {
		return eliminados;
	}

	public void setEliminados(EliminadosVOP eliminados) {
		this.eliminados = eliminados;
	}

	public ErrosVOP getErros() {
		return erros;
	}

	public void setErros(ErrosVOP erros) {
		this.erros = erros;
	}

	public AmostradosVOP getAmostrados() {
		return amostrados;
	}

	public void setAmostrados(AmostradosVOP amostrados) {
		this.amostrados = amostrados;
	}

	public PesadosVOP getPesados() {
		return pesados;
	}

	public void setPesados(PesadosVOP pesados) {
		this.pesados = pesados;
	}

}
