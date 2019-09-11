
package brf.suino.model.bo;

import java.util.Date;
import java.util.List;

import brf.suino.controller.ControllerSC;
import brf.util.Utils;

public class MedicadosBOSC {
	private final ControllerSC controller;

	public MedicadosBOSC(ControllerSC controller) {
		this.controller = controller;
	}

	public String verificaData(String dataString, List<String> fases) {
		if (dataString.equals("00/00/00")) {
			return null;
		} else {
			String[] split = dataString.split("/");
			dataString = split[0] + "/" + split[1] + "/20" + split[2];
			Date digitada = Utils.dateFromString(dataString);
			Date inicioFase = Utils.dateFromString(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp().toString());
			Date finalFase = Utils.dateFromString(fases.get(fases.size() - 1));
			if (digitada.before(inicioFase) || digitada.after(finalFase)) {
				return "- Data fora do período do experimento.";
			}
		}
		return null;
	}

//	public String verificaRacao(String data, Integer racao, Integer sobra, Integer peso, Integer nanimais, List<String> datasFases) {
//		String msg = "";
//		Date dataRacao = new Date();
//		Date dataIni = new Date();
//		Date dataFim = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
//		try {
//			dataIni = sdf.parse(datasFases.get(0));
//			dataFim = sdf.parse(datasFases.get(datasFases.size() - 1));
//			dataRacao = sdf.parse(data);
//		} catch (Exception e) {
//			return "- Formato de data incorreta\n";
//		}
//		if (!data.equals("00/00/00")) {
//			if (dataRacao.after(dataFim) || dataRacao.before(dataIni)) {
//				msg = msg.concat("- Idade fora do período do experimento\n");
//			} else if (!data.equals("00/00/00") && racao == 0 && sobra == 0) {
//				msg = msg.concat("- Entrada/Saída de ração igual à 0\n");
//			}
//		} else {
//			if (racao != 0 | sobra != 0) {
//				msg = msg.concat("- Data inválida!\n");
//			}
//		}
//		return msg;
//	}

}
