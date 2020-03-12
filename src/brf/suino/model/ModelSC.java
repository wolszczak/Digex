package brf.suino.model;

import brf.suino.model.bo.InfoExpBOSC;
import brf.suino.model.dao.ModelStateDAOSC;
import brf.suino.model.vo.ExperimentoVOSC;
import brf.suino.model.vo.InfoExpVOSC;

public class ModelSC {
    private ModelStateDAOSC modelStateDAO;
    private ExperimentoVOSC experimentoVO;
    private InfoExpBOSC infoExpBO;
    private InfoExpVOSC infoExpVO;
    
    public ModelSC() {
       modelStateDAO = new ModelStateDAOSC(this);
       experimentoVO = new ExperimentoVOSC();
       infoExpBO = new InfoExpBOSC(this);
    }

	public ModelStateDAOSC getModelStateDAO() {
		return modelStateDAO;
	}

	public void setModelStateDAO(ModelStateDAOSC modelStateDAO) {
		this.modelStateDAO = modelStateDAO;
	}

	public ExperimentoVOSC getExperimentoVO() {
		return experimentoVO;
	}

	public void setExperimentoVO(ExperimentoVOSC experimentoVO) {
		this.experimentoVO = experimentoVO;
	}

	public InfoExpBOSC getInfoExpBO() {
		return infoExpBO;
	}

	public void setInfoExpBO(InfoExpBOSC infoExpBO) {
		this.infoExpBO = infoExpBO;
	}

	public InfoExpVOSC getInfoExpVO() {
		return infoExpVO;
	}

	public void setInfoExpVO(InfoExpVOSC infoExpVO) {
		this.infoExpVO = infoExpVO;
	}

    
    
    
}