package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ItemPesagemVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int peso;
	private int numAnimais;
	private String data;
	
	public ItemPesagemVOSC() {
	}
	
	private void ConsumoVOSC(int peso, int numAnimais, String data) {
		this.peso = peso;
		this.numAnimais = numAnimais;
		this.data = data;
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}



}
