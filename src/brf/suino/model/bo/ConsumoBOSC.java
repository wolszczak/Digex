
package brf.suino.model.bo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import brf.frango.model.vo.RmeVOF;
import brf.peru.controller.ControllerP;
import brf.peru.model.vo.AmostradosVOP;
import brf.peru.model.vo.DesempenhoVOP;
import brf.peru.model.vo.EliminadosVOP;
import brf.peru.model.vo.ErrosVOP;
import brf.peru.model.vo.MortalidadeVOP;
import brf.peru.model.vo.PesadosVOP;
import brf.peru.model.vo.RmeVOP;
import brf.suino.controller.ControllerSC;
import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.RmeVOSC;
import brf.util.Utils;

public class ConsumoBOSC {
	private final ControllerSC controller;

	public ConsumoBOSC(ControllerSC controller) {
		this.controller = controller;
	}

	public String verificaCabecalho(int baia, int sexo, int trata, int trata2) {
		String msg = "";
		if (baia == 0) {
			msg = msg.concat("- Baia igual à 0\n");
		}
		if (sexo != 1 && sexo != 2) {
			msg = msg.concat("- Sexo diferente de 1 e 2\n");
		}
		return msg;
	}

	public boolean isBaiaDigitada(int baia) {
		for (ConsumoVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()) {
			if (baia == consumo.getBaia()) {
				return true;
			}
		}
		return false;
	}

	public void excluirBaia(int baia) {
		ConsumoVOSC consumoRemocao = null;
		for (ConsumoVOSC consumo : controller.getModel().getExperimentoVO().getConsumo()) {
			if (baia == consumo.getBaia()) {
				consumoRemocao = consumo;
				break;
			}
		}
		controller.getModel().getExperimentoVO().getConsumo().remove(consumoRemocao);
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	public String verificaData(String dataString, List<String> fases) {
		if (dataString.equals("00/00/00")) {
			return null;
		} else {
			String[] split = dataString.split("/");
			dataString = split[0] + "/" + split[1] + "/20" + split[2];
			Date digitada = Utils.stringToDate(dataString);
			Date inicioFase = Utils.stringToDate(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp().toString());
			Date finalFase = Utils.stringToDate(fases.get(fases.size() - 1));
			if (digitada.before(inicioFase) || digitada.after(finalFase)) {
				return "- Data fora do período do experimento.";
			}
		}
		return null;
	}

	public String verificaRacao(String data, Integer racao, Integer sobra, Integer peso, Integer nanimais, List<String> datasFases) {
		String msg = "";
		Date dataRacao = new Date();
		Date dataIni = new Date();
		Date dataFim = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		try {
			dataIni = sdf.parse(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp());
			dataFim = sdf.parse(datasFases.get(datasFases.size() - 1));
			dataRacao = sdf.parse(data);
		} catch (Exception e) {
			return "- Formato de data incorreta\n";
		}
		if (!data.equals("00/00/00")) {
			if (dataRacao.after(dataFim) || dataRacao.before(dataIni)) {
				msg = msg.concat("- Idade fora do período do experimento\n");
			} else if (!data.equals("00/00/00") && racao == 0 && sobra == 0) {
				msg = msg.concat("- Entrada/Saída de ração igual à 0\n");
			}
			
		} else {
			if (racao != 0 | sobra != 0) {
				msg = msg.concat("- Data inválida!\n");
			}
		}
		return msg;
	}

}
