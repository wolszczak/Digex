package brf.frigoaves.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FrigorificoAvesVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<PlataformaAvesVO> plataformas;
	private List<CarcacaAvesVO> carcacas;
	private List<PartesAvesVO> partes;

	public FrigorificoAvesVO() {
		this.plataformas = new ArrayList<>();
		this.carcacas = new ArrayList<>();
		this.partes = new ArrayList<>();
	}

	public List<PlataformaAvesVO> getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(List<PlataformaAvesVO> plataformas) {
		this.plataformas = plataformas;
	}

	public List<CarcacaAvesVO> getCarcacas() {
		return carcacas;
	}

	public void setCarcacas(List<CarcacaAvesVO> carcacas) {
		this.carcacas = carcacas;
	}

	public List<PartesAvesVO> getPartes() {
		return partes;
	}

	public void setPartes(List<PartesAvesVO> partes) {
		this.partes = partes;
	}

}