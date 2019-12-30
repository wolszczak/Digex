package brf.suino.model.vo;

import java.io.Serializable;
import java.util.Date;

public class PCRVOST implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date data;
	private int tatuagem;
	private int etpaquim;
	private int plpaquim;
	private int gim;
	private int cosph24;
	private int coscjpcs;
	
	public PCRVOST() {
	}
	
	public PCRVOST(Date data, int tatuagem, int etpaquim, int plpaquim, int gim, int cosph24, int coscjpcs) {
		super();
		this.data = data;
		this.tatuagem = tatuagem;
		this.etpaquim = etpaquim;
		this.plpaquim = plpaquim;
		this.gim = gim;
		this.cosph24 = cosph24;
		this.coscjpcs = coscjpcs;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTatuagem() {
		return tatuagem;
	}

	public void setTatuagem(int tatuagem) {
		this.tatuagem = tatuagem;
	}

	public int getEtpaquim() {
		return etpaquim;
	}

	public void setEtpaquim(int etpaquim) {
		this.etpaquim = etpaquim;
	}

	public int getPlpaquim() {
		return plpaquim;
	}

	public void setPlpaquim(int plpaquim) {
		this.plpaquim = plpaquim;
	}

	public int getGim() {
		return gim;
	}

	public void setGim(int gim) {
		this.gim = gim;
	}

	public int getCosph24() {
		return cosph24;
	}

	public void setCosph24(int cosph24) {
		this.cosph24 = cosph24;
	}

	public int getCoscjpcs() {
		return coscjpcs;
	}

	public void setCoscjpcs(int coscjpcs) {
		this.coscjpcs = coscjpcs;
	}
	
	

	
	
	
}
