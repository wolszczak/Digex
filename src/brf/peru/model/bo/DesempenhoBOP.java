
package brf.peru.model.bo;

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

public class DesempenhoBOP {
	private final ControllerP controller;

	public DesempenhoBOP(ControllerP controller) {
		this.controller = controller;
	}

	public String verificaCabecalho(int baia, int sexo, int lado, int nAlojados) {
		String msg = "";
		if (baia == 0) {
			msg = msg.concat("- Baia igual à 0\n");
		}
		if (sexo != 1 && sexo != 2) {
			msg = msg.concat("- Sexo diferente de 1 e 2\n");
		}
		if (lado > 2) {
			msg = msg.concat("- Lado diferente de 0, 1 e 2\n");
		}
		if (nAlojados == 0) {
			msg = msg.concat("- Número de aves alojadas igual à 0");
		}
		return msg;
	}

	public boolean isBaiaDigitada(int baia) {
		for (DesempenhoVOP desempenho : controller.getModel().getExperimentoVO().getDesempenho()) {
			if (baia == desempenho.getBaia()) {
				return true;
			}
		}
		return false;
	}

	public void excluirBaia(int baia) {
		DesempenhoVOP baiaRemocao = null;
		for (DesempenhoVOP desempenho : controller.getModel().getExperimentoVO().getDesempenho()) {
			if (baia == desempenho.getBaia()) {
				baiaRemocao = desempenho;
				break;
			}
		}
		controller.getModel().getExperimentoVO().getDesempenho().remove(baiaRemocao);
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	public String verificaRacao(Integer idade, Integer racao, Integer sobra, Integer idadeInicioFase,
			Integer idadeFinalFase) {
		String msg = "";
		int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase()
				.get(controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size() - 1);
		if (idade > idadeFim || idade < 0) {
			msg = msg.concat("- Idade fora do período do experimento\n");
		} else if (idade < idadeInicioFase || idade > idadeFinalFase) {
			if (idade != 0) {
				msg = msg.concat("- Idade fora do período da fase. Dos " + idadeInicioFase + " aos " + idadeFinalFase
						+ " dias.");
			}
		} else if (idade != 0 && racao == 0 && sobra == 0) {
			msg = msg.concat("- Entrada/Saída de ração igual à 0\n");
		} else if (idade == 0 && racao != 0 && sobra != 0) {
			msg = msg.concat("- Idade não pode ser 0");
		}
		return msg;
	}

	public String verificaMortalidade(Integer idade, Integer numero, Integer peso, Integer idadeInicioFase,
			Integer idadeFinalFase) {
		String msg = "";
		int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase()
				.get(controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size() - 1);
		if (idade > idadeFim || idade < 0) {
			msg = msg.concat("- Idade fora do período do experimento\n");
		} else if (idade < idadeInicioFase || idade > idadeFinalFase) {
			if(idade != 0) {
				msg = msg.concat(
						"- Idade fora do período da fase. Dos " + idadeInicioFase + " aos " + idadeFinalFase + " dias.");
			}
		} else if (idade != 0 && numero == 0 && peso == 0) {
			msg = msg.concat("- Nº de mortos igual à 0\n");
		} else if (idade == 0 && numero != 0 && peso != 0 ) {
			msg = msg.concat("- Idade não pode ser 0");
		}
		return msg;
	}
	
	public String verificaEliminados(Integer idade, Integer numero, Integer peso, Integer idadeInicioFase,
			Integer idadeFinalFase) {
		String msg = "";
		int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase()
				.get(controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size() - 1);
		if (idade > idadeFim || idade < 0) {
			msg = msg.concat("- Idade fora do período do experimento\n");
		} else if (idade < idadeInicioFase || idade > idadeFinalFase) {
			if(idade != 0) {
				msg = msg.concat(
						"- Idade fora do período da fase. Dos " + idadeInicioFase + " aos " + idadeFinalFase + " dias.");
			}
		} else if (idade != 0 && numero == 0 && peso == 0) {
			msg = msg.concat("- Nº de mortos igual à 0\n");
		} else if (idade == 0 && numero != 0 && peso != 0 ) {
			msg = msg.concat("- Idade não pode ser 0");
		}
		return msg;
	}

	public String verificaPesagem(List<RmeVOP> rme, int nrAlojados, int idadeM, int nMortos, int pMortos, int idadeElim,
			int nElim, int pElim, int idadeEr, int nrErros, int pErros, int idadeAm, int nrAmostrados, int pAmostrados,
			int idadePe, int nrPesagem, int pPesagem, int idadeFaseAnterior, int idadeFaseAtual) {
		String msg = "";
		int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase()
				.get(controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size() - 1);
		if ((idadeM != 0 && (idadeM < idadeFaseAnterior || idadeM > idadeFaseAtual))
				|| (idadeElim != 0 && (idadeElim < idadeFaseAnterior || idadeElim > idadeFaseAtual))
				|| (idadeEr != 0 && (idadeEr < idadeFaseAnterior || idadeEr > idadeFaseAtual))
				|| (idadeAm != 0 && (idadeAm < idadeFaseAnterior || idadeAm > idadeFaseAtual))
				|| (idadePe != 0 && (idadePe < idadeFaseAnterior || idadePe > idadeFaseAtual))) {
			msg = msg.concat("- Idade(s) fora do período da fase. Dos " + idadeFaseAnterior + " aos " + idadeFaseAtual
					+ " dias.");
		}
		if (idadeM == 0 && pMortos != 0) {
			msg = msg.concat("- Peso do(s) morto(s) em idade igual à 0\n");
		}
		if (idadeElim == 0 && pElim != 0) {
			msg = msg.concat("- Peso do(s) eliminado(s) em idade igual à 0\n");
		}
		if (idadeEr == 0 && pErros != 0) {
			msg = msg.concat("- Peso do(s) erro(s) em idade igual à 0\n");
		}
		if (idadeAm == 0 && pAmostrados != 0) {
			msg = msg.concat("- Peso do(s) amostrado(s) em idade igual à 0\n");
		}
		if (idadePe == 0 && pPesagem != 0) {
			msg = msg.concat("- Peso do(s) eliminado(s) em idade igual à 0\n");
		}
		if (nMortos == 0 && pMortos != 0) {
			msg = msg.concat("- Número de mortos igual à 0\n");
		}
		if (nElim == 0 && pElim != 0) {
			msg = msg.concat("- Número de eliminados igual à 0\n");
		}
		if (nrErros == 0 && pErros != 0) {
			msg = msg.concat("- Número de erros igual à 0\n");
		}
		if (nrAmostrados == 0 && pAmostrados != 0) {
			msg = msg.concat("- Número de amostrados igual à 0\n");
		}
		if (nrPesagem == 0 && pPesagem != 0) {
			msg = msg.concat("- Número de pesados igual à 0\n");
		}
		if (pMortos == 0 && (idadeM != 0 || nMortos != 0)) {
			msg = msg.concat("- Peso do(s) morto(s) igual à 0\n");
		}
		if (pElim == 0 && (idadeElim != 0 || nElim != 0)) {
			msg = msg.concat("- Peso do(s) eliminado(s) igual à 0\n");
		}
		if (pErros == 0 && (idadeEr != 0 || nrErros != 0)) {
			msg = msg.concat("- Peso do(s) erro(s) igual à 0\n");
		}
		if (pAmostrados == 0 && (idadeAm != 0 || nrAmostrados != 0)) {
			msg = msg.concat("- Peso do(s) amostrado(s) igual à 0\n");
		}
		if (pPesagem == 0 && (idadePe != 0 || nrPesagem != 0)) {
			msg = msg.concat("- Pesagem(s) igual à 0\n");
		}
		int totalMortosEliminados = nMortos + nElim;
		for (RmeVOP histRme : rme) {
			totalMortosEliminados += histRme.getMortos().getQuantidade() + histRme.getEliminados().getQuantidade();
		}
		if (totalMortosEliminados > nrAlojados) {
			msg = msg.concat("- Número de mortos e eliminados maior que o número de alojados\n");
		}
		return msg;
	}

}
