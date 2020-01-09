package brf.frango.model;

import brf.frango.model.bo.InfoExpBOF;
import brf.frango.model.dao.AvaliacaoPeDAOF;
import brf.frango.model.dao.ModelStateDAOF;
import brf.frango.model.vo.ExperimentoVOF;

public class ModelF {
    private ModelStateDAOF modelStateDAO;
    private ExperimentoVOF experimentoVO;
    private InfoExpBOF infoExpBO;
    private AvaliacaoPeDAOF avalPeDAO;
    
    public ModelF() {
       modelStateDAO = new ModelStateDAOF(this);
       experimentoVO = new ExperimentoVOF();
       infoExpBO = new InfoExpBOF(this);
       avalPeDAO = new AvaliacaoPeDAOF();
    }
    
    public ModelStateDAOF getModelStateDAO() {
        return modelStateDAO;
    }
    
    public InfoExpBOF getInfoExpBO() {
        return infoExpBO;
    }
    
    public void setExperimentoVO(Object experimentoVO) {
        this.experimentoVO = (ExperimentoVOF) experimentoVO;
    }
    
    public ExperimentoVOF getExperimentoVO() {
        return experimentoVO;
    }
}
