package brf.suino.controller;

import java.util.List;

import brf.peru.controller.ControllerEscolhaDigP;
import brf.suino.model.ModelSC;

public class ControllerSC {
	private ModelSC modelSC;
	private final String idDigitador;
	private ControllerInfoExpSC ctrlInfoExp;
	private ControllerEscolhaDigSC ctrlEscolhaDig;
	private ControllerConsumoSC ctrlConsumo;

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

	public void startEscolhaDig(List<String> datasFase) {
		ctrlEscolhaDig = new ControllerEscolhaDigSC(this);
		ctrlEscolhaDig.openWindow(datasFase);
	}
	
	public void startConsumoSC(List<String> datasFase) {
		ctrlConsumo = new ControllerConsumoSC(this);
		ctrlConsumo.openWindow(datasFase);
	}
	
}