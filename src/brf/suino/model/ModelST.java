package brf.suino.model;

import brf.suino.model.bo.InfoExpBOST;
import brf.suino.model.dao.ModelStateDAOST;
import brf.suino.model.vo.ExperimentoVOST;
import brf.suino.model.vo.InfoExpVOST;

public class ModelST {
	private ModelStateDAOST modelStateDAO;
	private ExperimentoVOST experimentoVO;
	private InfoExpBOST infoExpBO;
	private InfoExpVOST infoExpVO;

	public ModelST() {
		modelStateDAO = new ModelStateDAOST(this);
		experimentoVO = new ExperimentoVOST();
		infoExpBO = new InfoExpBOST(this);
	}

	public ModelStateDAOST getModelStateDAO() {
		return modelStateDAO;
	}

	public void setModelStateDAO(ModelStateDAOST modelStateDAO) {
		this.modelStateDAO = modelStateDAO;
	}

	public InfoExpBOST getInfoExpBO() {
		return infoExpBO;
	}

	public void setInfoExpBO(InfoExpBOST infoExpBO) {
		this.infoExpBO = infoExpBO;
	}

	public InfoExpVOST getInfoExpVO() {
		return infoExpVO;
	}

	public void setInfoExpVO(InfoExpVOST infoExpVO) {
		this.infoExpVO = infoExpVO;
	}

	public ExperimentoVOST getExperimentoVO() {
		return experimentoVO;
	}

	public void setExperimentoVO(ExperimentoVOST experimentoVO) {
		this.experimentoVO = experimentoVO;
	}

}