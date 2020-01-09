package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.BalancaVOF;
import brf.frango.model.vo.RendimentoVOF;
import java.util.ArrayList;
import java.util.List;

public class RendimentoBOF {
	private final ControllerF controller;

	public RendimentoBOF(ControllerF controller) {
		this.controller = controller;
	}

	public String verificaErros(int abate, int nasa1, int nasa2, int nasa3, int nasa4, int nasa5) {
		String msg = "";
		List<Integer> nasas = new ArrayList<>();
		nasas.add(nasa1);
		nasas.add(nasa2);
		nasas.add(nasa3);
		nasas.add(nasa4);
		nasas.add(nasa5);
		nasas.sort((Integer n1, Integer n2) -> {
			if (n1 > n2)
				return 1;
			if (n1 < n2)
				return -1;
			return 0;
		});
		int nasaAnterior = 0;
		for (Integer nasa : nasas) {
			if (nasa == nasaAnterior && nasa != 0) {
				msg = msg.concat("- Anilha digitada mais de uma vez no bloco: " + nasa + "\n");
			}
			nasaAnterior = nasa;
		}
		return msg;
	}

	public List<Integer> verificaNasaDuplicada(int abate, int nasa1, int nasa2, int nasa3, int nasa4, int nasa5) {
		List<Integer> nasas = new ArrayList<>();
		List<Integer> nasasDup = new ArrayList<>();
		nasas.add(nasa1);
		nasas.add(nasa2);
		nasas.add(nasa3);
		nasas.add(nasa4);
		nasas.add(nasa5);
		nasas.sort((Integer n1, Integer n2) -> {
			if (n1 > n2)
				return 1;
			if (n1 < n2)
				return -1;
			return 0;
		});
		for (Integer nasa : nasas) {
			for (RendimentoVOF r : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento()) {
				if (nasa == r.getNasa() && nasa != 0) {
					nasasDup.add(nasa);
				}
			}
		}
		return nasasDup;
	}

	public String verificaNasaInexistente(int abate, int nasa1, int nasa2, int nasa3, int nasa4, int nasa5) {
		String msg = "";
		List<Integer> nasas = new ArrayList<>();
		nasas.add(nasa1);
		nasas.add(nasa2);
		nasas.add(nasa3);
		nasas.add(nasa4);
		nasas.add(nasa5);
		nasas.sort((Integer n1, Integer n2) -> {
			if (n1 > n2)
				return 1;
			if (n1 < n2)
				return -1;
			return 0;
		});

		for (Integer nasa : nasas) {
			String nasaInexistente = "";
			if (nasa != 0) {
				nasaInexistente = "- Anilha digitada não consta no arquivo da balança: " + nasa + "\n";
			}
			for (BalancaVOF b : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getBalanca()) {
				if (nasa == b.getAnilha()) {
					nasaInexistente = "";
					break;
				}
			}
			msg = msg.concat(nasaInexistente);
		}
		return msg;
	}

	public void excluirAnimais(int abate, List<Integer> nasasDup) {
		List<RendimentoVOF> nasasRemocao = new ArrayList<>();
		for (Integer nasaDuplicada : nasasDup) {
			for (RendimentoVOF rendimento : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento()) {
				if (nasaDuplicada == rendimento.getNasa()) {
					nasasRemocao.add(rendimento);
					break;
				}
			}
		}
		for (RendimentoVOF nasaDuplicada : nasasRemocao) {
			controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento().remove(nasaDuplicada);
		}
		ajustaOrdem(abate);
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	public void removeNasasZeradas(int abate) {
		List<RendimentoVOF> it = new ArrayList<>();
		it.addAll(controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento());
		for (RendimentoVOF rendimento : it) {
			if (rendimento.getNasa() == 0) {
				controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento().remove(rendimento);
			}
		}
		ajustaOrdem(abate);
		controller.getModel().getModelStateDAO().saveModelState(false);
	}

	private void ajustaOrdem(int abate) {
		int ordem = 1;
		while (controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento().size() % 5 != 0) {
			controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento()
					.add(new RendimentoVOF(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		}
		for (RendimentoVOF rendimento : controller.getModel().getExperimentoVO().getAbates().get(abate - 1).getRendimento()) {
			rendimento.setOrdem(ordem++);
		}
	}
}
