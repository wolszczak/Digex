package brf.suino.controller;

import brf.suino.model.ModelSC;

public class ControllerST {
	private ModelSC modelSC;
	private final String idDigitador;
	private ControllerInfoExpST ctrlInfoExp;
	private ControllerEscolhaDigST ctrlEscolhaDig;
//	private ControllerConsumoSC ctrlConsumo;
//	private ControllerMortalidadeSC ctrlMortalidade;

	public ControllerST(ModelSC msc, String idDigitador) {
		this.modelSC = msc;
		this.idDigitador = idDigitador;
	}

	public ModelSC getModel() {
		return modelSC;
	}

	public String getIdDigitador() {
		return idDigitador;
	}

//	public void startModuloSuino() {
//		ctrlInfoExp = new ControllerInfoExpSC(this);
//		ctrlInfoExp.openWindow(idDigitador);
//	}

//	public void startEscolhaDig(List<String> datasFase) {
//		ctrlEscolhaDig = new ControllerEscolhaDigSC(this);
//		ctrlEscolhaDig.openWindow(datasFase);
//	}

//	public void startConsumoSC(List<String> datasFase) {
//		ctrlConsumo = new ControllerConsumoSC(this);
//		ctrlConsumo.openWindow(datasFase);
//	}

//	public void startMortalidadeSC(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2,List<String> datasFases) {
//		ctrlMortalidade = new ControllerMortalidadeSC(this);
//		ctrlMortalidade.openWindow(galpao, baia, sexo, trata, trata2, datasFases);
//	}

}