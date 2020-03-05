package brf.frigoaves.model.vo;

import java.io.Serializable;

public class PartesAvesVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String data;
	private int contrato;
	private int carga;
	private int hora;
	private int ordem;
	private int perna;
	private int asa;
	private int peito;
	private int filezi;
	private int mpp;
	private int mpf;
	private int gp;
	private int gf;
	private int epd;
	private int epe;
	private int pad;
	private int pae;
	private int fdd;
	private int fde;

	public PartesAvesVO(String data, int contrato, int carga, int hora, int ordem, int perna, int asa, int peito, int filezi, int mpp,
			int mpf, int gp, int gf, int epd, int epe, int pad, int pae, int fdd, int fde) {
		super();
		this.data = data;
		this.contrato = contrato;
		this.carga = carga;
		this.hora = hora;
		this.ordem = ordem;
		this.perna = perna;
		this.asa = asa;
		this.peito = peito;
		this.filezi = filezi;
		this.mpp = mpp;
		this.mpf = mpf;
		this.gp = gp;
		this.gf = gf;
		this.epd = epd;
		this.epe = epe;
		this.pad = pad;
		this.pae = pae;
		this.fdd = fdd;
		this.fde = fde;
	}

	public PartesAvesVO() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getPerna() {
		return perna;
	}

	public void setPerna(int perna) {
		this.perna = perna;
	}

	public int getAsa() {
		return asa;
	}

	public void setAsa(int asa) {
		this.asa = asa;
	}

	public int getPeito() {
		return peito;
	}

	public void setPeito(int peito) {
		this.peito = peito;
	}

	public int getFilezi() {
		return filezi;
	}

	public void setFilezi(int filezi) {
		this.filezi = filezi;
	}

	public int getMpp() {
		return mpp;
	}

	public void setMpp(int mpp) {
		this.mpp = mpp;
	}

	public int getMpf() {
		return mpf;
	}

	public void setMpf(int mpf) {
		this.mpf = mpf;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getEpd() {
		return epd;
	}

	public void setEpd(int epd) {
		this.epd = epd;
	}

	public int getEpe() {
		return epe;
	}

	public void setEpe(int epe) {
		this.epe = epe;
	}

	public int getPad() {
		return pad;
	}

	public void setPad(int pad) {
		this.pad = pad;
	}

	public int getPae() {
		return pae;
	}

	public void setPae(int pae) {
		this.pae = pae;
	}

	public int getFdd() {
		return fdd;
	}

	public void setFdd(int fdd) {
		this.fdd = fdd;
	}

	public int getFde() {
		return fde;
	}

	public void setFde(int fde) {
		this.fde = fde;
	}

}
