package brf.frigoaves.model;

import brf.frigoaves.model.dao.ModelStateAvesDAO;
import brf.frigoaves.model.vo.FrigorificoAvesVO;

public class ModelAves {
	private ModelStateAvesDAO modelStateDAO;
	private FrigorificoAvesVO frigorifico;

	public ModelAves() {
		modelStateDAO = new ModelStateAvesDAO(this);
	}

	public ModelStateAvesDAO getModelStateDAO() {
		return modelStateDAO;
	}

	public FrigorificoAvesVO getFrigorifico() {
		return frigorifico;
	}

	public void setFrigorifico(FrigorificoAvesVO frigorifico) {
		this.frigorifico = frigorifico;
	}

	public void setModelStateDAO(ModelStateAvesDAO modelStateDAO) {
		this.modelStateDAO = modelStateDAO;
	}

}
