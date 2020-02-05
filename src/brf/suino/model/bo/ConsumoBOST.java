
package brf.suino.model.bo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import brf.suino.controller.ControllerST;
import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.ConsumoLivreVOST;
import brf.util.Utils;

public class ConsumoBOST {
	private final ControllerST controller;

	public ConsumoBOST(ControllerST controller) {
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

	public String verificaCabecalhoConsumoTratos(String data, List<String> datasFases, int tratos) {
		String msg = "";
		if (tratos == 0 && data != "00/00/0000") {
			return "- Quantidade de tratos não pode ser 0.";
		}
		if (tratos != 0 && data == "00/00/0000") {
			return "- Valor de data inválido.";
		}
		msg = verificaData(data, datasFases);
		if (msg != null) {
			return "- Data fora do período do experimento\n";
		}
		return null;
	}

//	public boolean isBaiaDigitada(int baia) {
//		for (ConsumoLivreVOST consumo : controller.getModel().getExperimentoVO().getBaias().get(0).getConsumo() ) {
//			if (baia == consumo.getBaia()) {
//				return true;
//			}
//		}
//		return false;
//	}

//	public void excluirBaia(int baia) {
//		ConsumoLivreVOST consumoRemocao = null;
//		for (ConsumoLivreVOST consumo : controller.getModel().getExperimentoVO().getConsumoLivre()) {
//			if (baia == consumo.getBaia()) {
//				consumoRemocao = consumo;
//				break;
//			}
//		}
//		controller.getModel().getExperimentoVO().getConsumoLivre().remove(consumoRemocao);
//		controller.getModel().getModelStateDAO().saveModelState(false);
//	}

	public String verificaData(String dataString, List<String> fases) {
		Date digitada = Utils.stringToDate(dataString);
		Date inicioFase = Utils.stringToDate(controller.getModel().getExperimentoVO().getInfoExp().getInicioExp().toString());
		Date finalFase = Utils.stringToDate(fases.get(fases.size() - 1));
		if (digitada.before(inicioFase) || digitada.after(finalFase)) {
			return "- Data fora do período do experimento.";
		}
		return null;
	}

	public String verificaConsumoTratos(int baia, int consumo) {
		if (baia == 0 && consumo != 0) {
			return "Baia não digitada!";
		}
		if (baia != 0 && consumo == 0) {
			return "Consumo não digitado!";
		}
		return null;
	}

	public String verificaRacao(String data, Integer racao, Integer sobra, List<String> datasFases) {
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
		if (!data.equals("00/00/0000")) {
			if (dataRacao.after(dataFim) || dataRacao.before(dataIni)) {
				msg = msg.concat("- Idade fora do período do experimento\n");
			} else if (!data.equals("00/00/0000") && racao == 0 && sobra == 0) {
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
