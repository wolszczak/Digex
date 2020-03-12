package brf.frigoaves.model;

import brf.frigoaves.model.dao.ModelStateAvesDAO;
import brf.frigoaves.model.vo.FrigorificoAvesVO;

public class ModelFrigoAves {
	private ModelStateAvesDAO modelStateDAO;
	private FrigorificoAvesVO avaliacao;

	public ModelFrigoAves() {
		modelStateDAO = new ModelStateAvesDAO(this);
	}

	public ModelStateAvesDAO getModelStateDAO() {
		return modelStateDAO;
	}

	public FrigorificoAvesVO getFrigorifico() {
		return avaliacao;
	}

	public void setFrigorifico(FrigorificoAvesVO frigorifico) {
		this.avaliacao = frigorifico;
	}

	public void setModelStateDAO(ModelStateAvesDAO modelStateDAO) {
		this.modelStateDAO = modelStateDAO;
	}

}
