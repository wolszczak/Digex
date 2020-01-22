package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FrigorificoTempVOST implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<PCRVOST> pcr;
	private List<BarrigaVOST> barriga;
	private List<CostadoVOST> costado;
	private List<PernilVOST> pernil;
	private List<PaletaVOST> paleta;

	public FrigorificoTempVOST() {
		this.pcr = new ArrayList<>();
		this.barriga = new ArrayList<>();
		this.costado = new ArrayList<>();
		this.pernil = new ArrayList<>();
		this.paleta = new ArrayList<>();
	}

	public List<PCRVOST> getPcr() {
		return pcr;
	}

	public void setPcr(List<PCRVOST> pcr) {
		this.pcr = pcr;
	}

	public List<BarrigaVOST> getBarriga() {
		return barriga;
	}

	public void setBarriga(List<BarrigaVOST> barriga) {
		this.barriga = barriga;
	}

	public List<CostadoVOST> getCostado() {
		return costado;
	}

	public void setCostado(List<CostadoVOST> costado) {
		this.costado = costado;
	}

	public List<PernilVOST> getPernil() {
		return pernil;
	}

	public void setPernil(List<PernilVOST> pernil) {
		this.pernil = pernil;
	}

	public List<PaletaVOST> getPaleta() {
		return paleta;
	}

	public void setPaleta(List<PaletaVOST> paleta) {
		this.paleta = paleta;
	}

}
