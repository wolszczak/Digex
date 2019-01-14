package brf.frango.model.bo;

import brf.frango.model.ModelF;
import brf.frango.model.vo.InfoExpVOF;

public class InfoExpBOF {
    private final ModelF model;
    
    public InfoExpBOF(ModelF model) {
        this.model = model;
    }
    
    public boolean duplaDigitacao(InfoExpVOF info1, InfoExpVOF info2) {
        if (info2.equals(info1)) {
            model.getExperimentoVO().setInfoExp(info2);
            model.getModelStateDAO().saveModelState(true);
            return true;
        } else return false;
    }
}
