package brf.peru.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AbateVOP implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer abate;
	private List<BaiaAmostradosVOP> baiaAmostrados;
	private List<CamaraVOP> camaras;
	private List<ConeVOP> cones;

	public AbateVOP() {
		abate = 0;
		baiaAmostrados = new ArrayList<>();
		camaras = new ArrayList<>();
		cones = new ArrayList<>();
	}

	public List<BaiaAmostradosVOP> getBaiaAmostrados() {
		return baiaAmostrados;
	}

	public void setBaiaAmostrados(List<BaiaAmostradosVOP> baiaAmostrados) {
		this.baiaAmostrados = baiaAmostrados;
	}

	public List<ConeVOP> getCones() {
		return cones;
	}

	public void setCones(List<ConeVOP> cones) {
		this.cones = cones;
	}

	public Integer getAbate() {
		return abate;
	}

	public void setAbate(Integer abate) {
		this.abate = abate;
	}

	public List<CamaraVOP> getCamaras() {
		return camaras;
	}

	public void setCamaras(List<CamaraVOP> camaras) {
		this.camaras = camaras;
	}
}
