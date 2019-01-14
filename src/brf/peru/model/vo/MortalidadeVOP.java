package brf.peru.model.vo;

import java.io.Serializable;

public class MortalidadeVOP implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idade,quantidade,peso;
	
	public MortalidadeVOP(int idade, int quantidade, int peso) {
		this.idade = idade;
		this.quantidade = quantidade;
		this.peso = peso;
	}
	
	public MortalidadeVOP() {
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
}
