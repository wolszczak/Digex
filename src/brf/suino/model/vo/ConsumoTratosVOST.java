package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsumoTratosVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private List<RmeTratosVOST> consumosTratos;

	public ConsumoTratosVOST() {
	}

	public ConsumoTratosVOST(int ordem, String dataRacao, int baia, int fornecida) {
		consumosTratos = new ArrayList<>();
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
	
	


}
