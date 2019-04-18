package brf.suino.controller;

import brf.suino.model.ModelSC;

public class ControllerSC {
	private ModelSC modelSC;
	private final String idDigitador;
	private ControllerInfoExpSC ctrlInfoExp;

	public ControllerSC(ModelSC msc, String idDigitador) {
		this.modelSC = msc;
		this.idDigitador = idDigitador;
	}

	public ModelSC getModel() {
		return modelSC;
	}

	public String getIdDigitador() {
		return idDigitador;
	}

	public void startModuloSuino() {
		ctrlInfoExp = new ControllerInfoExpSC(this);
		ctrlInfoExp.openWindow(idDigitador);
	}

}