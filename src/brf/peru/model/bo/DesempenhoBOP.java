
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
			msg = msg.concat("- Idade não pode ser 0\n");
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
			msg = msg.concat("- Idade não pode ser 0\n");
		}else if (idade != 0 && numero != 0 && peso == 0 ) {
			msg = msg.concat("- Peso não pode ser 0\n");
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
			msg = msg.concat("- Idade não pode ser 0\n");
		}else if (idade != 0 && numero != 0 && peso == 0 ) {
			msg = msg.concat("- Peso não pode ser 0\n");
		}
		return msg;
	}
	
	public String verificaErros(Integer idade, Integer numero, Integer peso, Integer idadeInicioFase,
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
			msg = msg.concat("- Idade não pode ser 0\n");
		}else if (idade != 0 && numero != 0 && peso == 0 ) {
			msg = msg.concat("- Peso não pode ser 0\n");
		}
		return msg;
	}
	
	public String verificaAmostrados(Integer idade, Integer numero, Integer peso, Integer idadeInicioFase,
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
			msg = msg.concat("- Idade não pode ser 0\n");
		}else if (idade != 0 && numero != 0 && peso == 0 ) {
			msg = msg.concat("- Peso não pode ser 0\n");
		}
		return msg;
	}
		
	public String verificaPesagem(List<PesadosVOP> lista, Integer idade, Integer numero, Integer peso, Integer idadeInicioFase,
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
			msg = msg.concat("- Idade não pode ser 0\n");
		}else if (idade != 0 && numero != 0 && peso == 0 ) {
			msg = msg.concat("- Peso não pode ser 0\n");
		}else if(lista.isEmpty() && idade == 0 && numero == 0 && peso == 0) {
			msg = msg.concat("- Obrigatório informar valores de pesagem.");
		}
		return msg;
	}
}
