package brf.frigoaves.controller;

import brf.frigoaves.model.ModelFrigoAves;
import brf.suino.model.ModelST;

public class ControllerFrigoAves {
	private final String idDigitador;
	private ModelFrigoAves model;
	private ControllerPlataformaAves cpa;
	private ControllerEscolhaDigAves ced;

	public ControllerFrigoAves(ModelFrigoAves modelAves, String idDigitador) {
		this.model = modelAves;
		this.idDigitador = idDigitador;
	}

	public void startModuloPlataformaAves() {
		cpa = new ControllerPlataformaAves();
		cpa.openWindow(idDigitador);
	}

	public void startEscolhaDig() {
		ced = new ControllerEscolhaDigAves();
		ced.openWindow(idDigitador);
	}

	public ModelFrigoAves getModelAves() {
		return model;
	}

	public void setModelAves(ModelFrigoAves modelAves) {
		this.model = modelAves;
	}

	public ControllerPlataformaAves getCpa() {
		return cpa;
	}

	public void setCpa(ControllerPlataformaAves cpa) {
		this.cpa = cpa;
	}

	public ControllerEscolhaDigAves getCed() {
		return ced;
	}

	public void setCed(ControllerEscolhaDigAves ced) {
		this.ced = ced;
	}

	public ModelFrigoAves getModel() {
		return model;
	}

	public void setModel(ModelFrigoAves model) {
		this.model = model;
	}

	public String getIdDigitador() {
		return idDigitador;
	}

//	public void startEscolhaDig(List<String> datasFase) {
//		ctrlEscolhaDig = new ControllerEscolhaDigAves(this);
//		ctrlEscolhaDig.openWindow(datasFase);
//	}

//	public void startConsumoSC(List<String> datasFase) {
//		ctrlConsumo = new ControllerConsumoSC(this);
//		ctrlConsumo.openWindow(datasFase);
//	}

}