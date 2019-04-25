
package brf.suino.model.bo;

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

	public String verificaRacao(Integer idade, Integer racao, Integer sobra, Integer idadeInicioFase,
			Integer idadeFinalFase) {
		String msg = "";
		int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase()
				.get(controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size() - 1);
		if (idade > idadeFim || idade < 0) {
			msg = msg.concat("- Idade fora do período do experimento\n");
		} else if ((idade != 0 && idade < idadeInicioFase) || (idade != 0 && idade > idadeFinalFase)) {
			msg = msg.concat(
					"- Idade fora do período da fase. Dos " + idadeInicioFase + " aos " + idadeFinalFase + " dias.");
		} else if (idade != 0 && racao == 0 && sobra == 0) {
			msg = msg.concat("- Entrada/Saída de ração igual à 0\n");
		} else if (idade == 0) {
			if (racao != 0 || sobra != 0) {
				msg = msg.concat("- Idade não pode ser 0\n");
			}
		}
		return msg;
	}

}
