package brf.peru.model.bo;

import brf.peru.model.ModelP;
import brf.peru.model.vo.InfoExpVOP;

public class InfoExpBOP {
    private final ModelP model;
    
    public InfoExpBOP(ModelP model) {
        this.model = model;
    }
    
    public boolean duplaDigitacao(InfoExpVOP info1, InfoExpVOP info2) {
        if (info2.equals(info1)) {
            model.getExperimentoVO().setInfoExp(info2);
            model.getModelStateDAO().saveModelState(true);
            return true;
        } else return false;
    }
}
