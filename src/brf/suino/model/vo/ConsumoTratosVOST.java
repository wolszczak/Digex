package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsumoTratosVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private int tratos;
	private List<RmeTratosVOST> consumo;

	public ConsumoTratosVOST() {
		this.consumo = new ArrayList<>();
	}

	public ConsumoTratosVOST(String data, int tratos, List<RmeTratosVOST> consumos) {
		this.data = data;
		this.tratos = tratos;
		this.consumo = consumos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getTratos() {
		return tratos;
	}

	public void setTratos(int tratos) {
		this.tratos = tratos;
	}

	public List<RmeTratosVOST> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<RmeTratosVOST> consumo) {
		this.consumo = consumo;
	}

}
