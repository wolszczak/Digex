package brf.peru.model;

import brf.peru.model.bo.AbateBOP;
import brf.peru.model.bo.InfoExpBOP;
import brf.peru.model.dao.ModelStateDAOP;
import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.ExperimentoVOP;
import brf.peru.model.vo.InfoExpVOP;

public class ModelP {
    private ModelStateDAOP modelStateDAO;
    private ExperimentoVOP experimentoVO;
    private InfoExpBOP infoExpBO;
    private InfoExpVOP infoExpVO;
  //    private AvaliacaoPeDAOP avalPeDAO;
    
    public ModelP() {
       modelStateDAO = new ModelStateDAOP(this);
       experimentoVO = new ExperimentoVOP();
       infoExpBO = new InfoExpBOP(this);
    }
    
    public ModelStateDAOP getModelStateDAO() {
        return modelStateDAO;
    }
    
    public InfoExpBOP getInfoExpBO() {
        return infoExpBO;
    }
    
    public void setExperimentoVO(Object experimentoVO) {
        this.experimentoVO = (ExperimentoVOP) experimentoVO;
    }
    
    public ExperimentoVOP getExperimentoVO() {
        return experimentoVO;
    }
}