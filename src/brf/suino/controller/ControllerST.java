package brf.suino.controller;

import java.util.List;

import brf.suino.model.ModelSC;
import brf.suino.model.ModelST;

public class ControllerST {
	private ModelST modelST;
	private final String idDigitador;
	private ControllerInfoExpST ctrlInfoExp;
	private ControllerEscolhaDigST ctrlEscolhaDig;
//	private ControllerConsumoSC ctrlConsumo;
	private ControllerMortalidadeST ctrlMortalidade;

	public ControllerST(ModelST mst, String idDigitador) {
		this.modelST = mst;
		this.idDigitador = idDigitador;
	}

	public ModelST getModel() {
		return modelST;
	}

	public String getIdDigitador() {
		return idDigitador;
	}

	public void startModuloSuino() {
		ctrlInfoExp = new ControllerInfoExpST(this);
		ctrlInfoExp.openWindow(idDigitador);
	}

	public void startEscolhaDig(List<String> datasFase) {
		ctrlEscolhaDig = new ControllerEscolhaDigST(this);
		ctrlEscolhaDig.openWindow(datasFase);
	}

//	public void startConsumoSC(List<String> datasFase) {
//		ctrlConsumo = new ControllerConsumoSC(this);
//		ctrlConsumo.openWindow(datasFase);
//	}

	public void startMortalidadeST(Integer galpao, Integer baia, Integer sexo, Integer trata, Integer trata2, List<String> datasFases) {
		ctrlMortalidade = new ControllerMortalidadeST(this);
		ctrlMortalidade.openWindow(datasFases);
	}

}