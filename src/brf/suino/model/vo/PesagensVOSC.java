package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PesagensVOSC implements Serializable {
	private static final long serialVersionUID = 1L;
	private int baia;
	private String sexo;
	private int trat1;
	private String bloco;
	private List<ItemPesagemVOSC> pesagens;
	
	public PesagensVOSC() {
		this.pesagens = new ArrayList<>();
	}
	
	private void ConsumoVOSC(int baia, String sexo, int trat1, String bloco, List<ItemPesagemVOSC> pesagens) {
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.bloco = bloco;
		this.pesagens = pesagens;
	}

	public int getBaia() {
		return baia;
	}

	public void setBaia(int baia) {
		this.baia = baia;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTrat1() {
		return trat1;
	}

	public void setTrat1(int trat1) {
		this.trat1 = trat1;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public List<ItemPesagemVOSC> getPesagens() {
		return pesagens;
	}

	public void setPesagens(List<ItemPesagemVOSC> pesagens) {
		this.pesagens = pesagens;
	}

	
	

}
