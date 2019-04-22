package brf.suino.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicadosVOSC implements Serializable{
	private static final long serialVersionUID = 1L;
	private int baia;
	private int sexo;
	private int trat1;
	private int trat2;
	private List<MediVOSC> medicados;
	
	public MedicadosVOSC() {
		this.medicados = new ArrayList<>();
	}
	
	private void MedicadosVOSC(int baia, int sexo, int trat1, int trat2, List<MediVOSC> medicados) {
		this.baia = baia;
		this.sexo = sexo;
		this.trat1 = trat1;
		this.trat2 = trat2;
		this.medicados =  medicados;
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

	public List<MediVOSC> getMedicados() {
		return medicados;
	}

	public void setMedicados(List<MediVOSC> medicados) {
		this.medicados = medicados;
	}
	
	
	

}
