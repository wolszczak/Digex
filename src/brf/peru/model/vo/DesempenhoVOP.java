package brf.peru.model.vo;

import java.io.Serializable;
import java.util.List;

public class DesempenhoVOP implements Serializable {
	private static final long serialVersionUID = 1L;
	private int baia, sexo, lado, linhagem, trata, nrAlojados;
	private List<RmeVOP> consumo;

	public DesempenhoVOP(int baia, int sexo, int lado, int linhagem, int trata, int nrAlojados, List<RmeVOP> consumo) {
		this.baia = baia;
		this.sexo = sexo;
		this.lado = lado;
		this.linhagem = linhagem;
		this.trata = trata;
		this.nrAlojados = nrAlojados;
		this.consumo = consumo;
	}

	public DesempenhoVOP() {

	}

	public int getBaia() {
		return baia;
	}

	public void setBaia(int baia) {
		this.baia = baia;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getLinhagem() {
		return linhagem;
	}

	public void setLinhagem(int linhagem) {
		this.linhagem = linhagem;
	}

	public int getTrata() {
		return trata;
	}

	public void setTrata(int trata) {
		this.trata = trata;
	}

	public int getNrAlojados() {
		return nrAlojados;
	}

	public void setNrAlojados(int nrAlojados) {
		this.nrAlojados = nrAlojados;
	}

	public List<RmeVOP> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<RmeVOP> consumo) {
		this.consumo = consumo;
	}

}
