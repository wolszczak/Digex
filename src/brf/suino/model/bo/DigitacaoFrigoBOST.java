
package brf.suino.model.bo;

import java.util.Date;
import java.util.List;

import brf.suino.controller.ControllerST;
import brf.suino.model.vo.FrigorificoVOST;
import brf.suino.model.vo.PCRVOST;
import brf.util.Utils;

public class DigitacaoFrigoBOST {
	private final ControllerST controller;

	public DigitacaoFrigoBOST(ControllerST controller) {
		this.controller = controller;
	}

	public String verificaData(String dataString, List<String> fases) {
		for(PCRVOST pcr : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr()) {
			if(dataString.equals(pcr.getData())) {
				return "existente";
			}
		}
		if (dataString.equals("00/00/0000")) {
			return "- Data fora do período do experimento.";
		} else {
			Date digitada = Utils.dateFromString(dataString);
			Date inicioFase = Utils.dateFromString(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp().toString());
			Date finalFase = Utils.dateFromString(fases.get(fases.size() - 1));
			if (digitada.before(inicioFase) || digitada.after(finalFase)) {
				return "- Data fora do período do experimento.";
			}
		}
		return null;
	}

	public String verificaTatuagem(int tatuagem) {
		for (FrigorificoVOST f : controller.getModel().getExperimentoVO().getFrigorificoVOST()) {
			if (tatuagem == f.getTatuagem()) {
				return null;
			}
		}
		return "tatuagem não encontrada não existe no arquivo de frigorífico";
	}

}
