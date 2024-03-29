
package brf.suino.model.bo;

import java.util.Date;
import java.util.List;

import brf.suino.controller.ControllerST;
import brf.suino.model.vo.BarrigaVOST;
import brf.suino.model.vo.CostadoVOST;
import brf.suino.model.vo.FrigorificoVOST;
import brf.suino.model.vo.PCRVOST;
import brf.suino.model.vo.PaletaVOST;
import brf.suino.model.vo.PernilVOST;
import brf.util.Utils;

public class DigitacaoFrigoBOST {
	private final ControllerST controller;

	public DigitacaoFrigoBOST(ControllerST controller) {
		this.controller = controller;
	}

	public String verificaData(String dataString, List<String> fases) {
		if (dataString.equals("00/00/0000")) {
			return "- Data fora do período do experimento.";
		} else {
			Date digitada = Utils.stringToDate(dataString);
			Date inicioFase = Utils.stringToDate(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp().toString());
			Date finalFase = Utils.stringToDate(fases.get(fases.size() - 1));
			if (digitada.before(inicioFase) || digitada.after(finalFase)) {
				return "- Data fora do período do experimento.";
			}
		}
		return null;
	}

	public String verificaTatuagem(int tatuagem, String classe) {
		if (classe.equals("PCR")) {
			for (PCRVOST pcr : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPcr()) {
				if (pcr.getTatuagem() == tatuagem) {
					return "DUPLICADA";
				}
			}
		}

		if (classe.equals("COSTADO")) {
			for (CostadoVOST costado : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getCostado()) {
				if (costado.getTatuagem() == tatuagem) {
					return "DUPLICADA";
				}
			}
		}

		if (classe.equals("BARRIGA")) {
			for (BarrigaVOST barriga : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getBarriga()) {
				if (barriga.getTatuagem() == tatuagem) {
					return "DUPLICADA";
				}
			}
		}

		if (classe.equals("PERNIL")) {
			for (PernilVOST pernil : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPernil()) {
				if (pernil.getTatuagem() == tatuagem) {
					return "DUPLICADA";
				}
			}
		}

		if (classe.equals("PALETA")) {
			for (PaletaVOST paleta : controller.getModel().getExperimentoVO().getFrigorificoTempVOST().getPaleta()) {
				if (paleta.getTatuagem() == tatuagem) {
					return "DUPLICADA";
				}
			}
		}

		for (FrigorificoVOST f : controller.getModel().getExperimentoVO().getFrigorificoVOST()) {
			if (tatuagem == f.getTatuagem()) {
				return null;
			}
		}
		return "INEXISTENTE";
	}

}
