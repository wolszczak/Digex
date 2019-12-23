package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsumoTratosVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private int tratos;
	private List<RmeTratosVOST> consumosTratos;
	private boolean finalizado;

	public ConsumoTratosVOST() {
	}

	public ConsumoTratosVOST(String data, int tratos, List<RmeTratosVOST> consumos,  boolean finalizado) {
		this.data = data;
		this.tratos = tratos;
		this.consumosTratos = consumos;
		this.finalizado = finalizado;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<RmeTratosVOST> getConsumosTratos() {
		return consumosTratos;
	}

	public void setConsumosTratos(List<RmeTratosVOST> consumosTratos) {
		this.consumosTratos = consumosTratos;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public int getTratos() {
		return tratos;
	}

	public void setTratos(int tratos) {
		this.tratos = tratos;
	}
	
	


}
