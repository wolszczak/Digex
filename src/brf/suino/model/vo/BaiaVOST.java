package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaiaVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private int galpao;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private List<MortalidadeVOST> mortalidades;
	private List<MedicadosVOST> medicados;
	private ConsumoLivreVOST consumoLivre;
	private boolean finalizado;

	public BaiaVOST(int galpao, int baia, int sexo, int trat1, int trat2, List<MortalidadeVOST> mortalidades, List<MedicadosVOST> medicados,
			ConsumoLivreVOST consumo, boolean finalizado) {
		super();
		this.galpao = galpao;
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.mortalidades = mortalidades;
		this.medicados = medicados;
		this.consumoLivre = consumo;
		this.finalizado = finalizado;
	}

	public BaiaVOST() {
		mortalidades = new ArrayList<>();
		medicados = new ArrayList<>();
		consumoLivre = new ConsumoLivreVOST();
	}

	public List<MortalidadeVOST> getMortalidades() {
		return mortalidades;
	}

	public void setMortalidades(List<MortalidadeVOST> mortalidades) {
		this.mortalidades = mortalidades;
	}

	public List<MedicadosVOST> getMedicados() {
		return medicados;
	}

	public void setMedicados(List<MedicadosVOST> medicados) {
		this.medicados = medicados;
	}

	public ConsumoLivreVOST getConsumoLivre() {
		return consumoLivre;
	}

	public void setConsumoLivre(ConsumoLivreVOST consumoLivre) {
		this.consumoLivre = consumoLivre;
	}

	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
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

	public int getTrat1() {
		return trat1;
	}

	public void setTrat1(int trat1) {
		this.trat1 = trat1;
	}

	public int getTrat2() {
		return trat2;
	}

	public void setTrat2(int trat2) {
		this.trat2 = trat2;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

}
