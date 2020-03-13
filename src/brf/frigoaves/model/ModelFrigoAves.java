package brf.frigoaves.model;

import brf.frigoaves.model.dao.ModelStateAvesDAO;
import brf.frigoaves.model.vo.AvaliacaoAvesVO;

public class ModelFrigoAves {
	private ModelStateAvesDAO modelStateDAO;
	private AvaliacaoAvesVO avaliacao;

	public ModelFrigoAves() {
		modelStateDAO = new ModelStateAvesDAO(this);
	}

	public ModelStateAvesDAO getModelStateDAO() {
		return modelStateDAO;
	}

	public AvaliacaoAvesVO getFrigorifico() {
		return avaliacao;
	}

	public void setFrigorifico(AvaliacaoAvesVO frigorifico) {
		this.avaliacao = frigorifico;
	}

	public void setModelStateDAO(ModelStateAvesDAO modelStateDAO) {
		this.modelStateDAO = modelStateDAO;
	}

}
