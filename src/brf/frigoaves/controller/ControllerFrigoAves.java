package brf.frigoaves.controller;

import java.util.List;

import brf.suino.model.ModelSC;
import brf.suino.model.ModelST;

public class ControllerFrigoAves{
	private ModelST modelST;
	private ControllerPlataformaAves cpa;
	
	public ControllerFrigoAves(ModelFrigoAves mfa) {
	}


//	public void startModuloSuino() {
//		ctrlInfoExp = new ControllerInfoExpST(this);
//	}

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