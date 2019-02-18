package brf.peru.model.bo;

import java.util.List;

import brf.peru.controller.ControllerP;
import brf.peru.model.vo.BaiaAmostradosVOP;

public class AbateBOP {
	private final ControllerP controller;

	public AbateBOP(ControllerP controller) {
		this.controller = controller;
	}

	public String verificaAmostrados(List<BaiaAmostradosVOP> amostrados) {
		for (BaiaAmostradosVOP a : amostrados) {
			if ((a.getNrBaia() == 0 && (a.getNasa() != 0 && a.getPeso() != 0))
					|| (a.getNrBaia() == 0 && (a.getNasa() == 0 && a.getPeso() != 0))
					|| (a.getNrBaia() == 0 && (a.getNasa() != 0 && a.getPeso() == 0))) {
				return "Existe(m) valor(es) de BAIA(S) zerados.";
			} else if ((a.getNasa() == 0 && (a.getNrBaia() != 0 && a.getPeso() != 0))
					|| (a.getNasa() == 0 && (a.getNrBaia() == 0 && a.getPeso() != 0))
					|| (a.getNasa() == 0 && (a.getNrBaia() != 0 && a.getPeso() == 0))) {
				return "Existe(m) valor(es) de IDENTIFICAÇÃO zerados.";
			} else if ((a.getPeso() == 0 && (a.getNasa() != 0 && a.getNrBaia() != 0))
					|| (a.getPeso() == 0 && (a.getNasa() == 0 && a.getNrBaia() != 0))
					|| (a.getPeso() == 0 && (a.getNasa() != 0 && a.getNrBaia() == 0))) {
				return "Existe(m) valor(es) de PESO(S) zerados.";
			}
		}
		return null;
	}

	public boolean validaFinalDigitacao(List<BaiaAmostradosVOP> amostrados, boolean usaColunaExtra) {
		boolean retorno =  false;
		if(!usaColunaExtra) {
			for(int i = 0; i < 5; i++) {
				if(amostrados.get(0).getNrBaia() == 0 && amostrados.get(0).getNasa() == 0 && amostrados.get(0).getPeso() == 0) {
					if(amostrados.get(1).getNrBaia() == 0 && amostrados.get(1).getNasa() == 0 && amostrados.get(1).getPeso() == 0) {
						retorno =  true;
						break;
					}
				}else {
					amostrados.remove(1);
					amostrados.remove(0);
				}
			}
		} else {
			for(int i = 0; i < 5; i++) {
				if(amostrados.get(0).getNrBaia() == 0 && amostrados.get(0).getNasa() == 0 && amostrados.get(0).getPeso() == 0) {
					if(amostrados.get(1).getNrBaia() == 0 && amostrados.get(1).getNasa() == 0 && amostrados.get(1).getPeso() == 0) {
						if(amostrados.get(2).getNrBaia() == 0 && amostrados.get(2).getNasa() == 0 && amostrados.get(2).getPeso() == 0) {
							retorno =  true;
							break;
						}
					}
				}else {
					amostrados.remove(2);
					amostrados.remove(1);
					amostrados.remove(0);
				}
			}
		}
		return retorno;
	}

}
