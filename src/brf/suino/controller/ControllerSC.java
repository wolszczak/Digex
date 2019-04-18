package brf.suino.controller;

import java.util.List;

import brf.peru.controller.ControllerInfoExpP;
import brf.peru.model.ModelP;
import brf.peru.model.bo.DesempenhoBOP;
import brf.peru.model.vo.RmeVOP;
import brf.suino.model.ModelSC;

public class ControllerSC {
	private ModelSC modelSC;
	private final String idDigitador;
	private ControllerInfoExpP ctrlInfoExp;

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

//	public void startModuloSuino() {
//		ctrlInfoExp = new ControllerInfoExpSC(this);
//		ctrlInfoExp.openWindow(idDigitador);
//	}


}