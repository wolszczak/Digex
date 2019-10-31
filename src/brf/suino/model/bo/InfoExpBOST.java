package brf.suino.model.bo;

import brf.suino.model.ModelST;
import brf.suino.model.vo.ExperimentoVOST;
import brf.suino.model.vo.InfoExpVOST;

public class InfoExpBOST {
	private final ModelST model;

	public InfoExpBOST(ModelST model) {
		this.model = model;
	}

	public boolean duplaDigitacao(InfoExpVOST info1, InfoExpVOST info2) {
		if (info2.equals(info1)) {
			model.setExperimentoVO(new ExperimentoVOST());
			model.getExperimentoVO().setInfoExp(info2);
			model.getModelStateDAO().saveModelState(true);
			return true;
		} else
			return false;
	}

	public ModelST getModel() {
		return model;
	}
}
