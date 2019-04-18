package brf.suino.model.bo;

import brf.frango.model.ModelF;
import brf.frango.model.vo.InfoExpVOF;
import brf.suino.model.ModelSC;
import brf.suino.model.vo.InfoExpVOSC;

public class InfoExpBOSC {
    private final ModelSC model;
    
    public InfoExpBOSC(ModelSC model) {
        this.model = model;
    }
    
    public boolean duplaDigitacao(InfoExpVOSC info1, InfoExpVOSC info2) {
        if (info2.equals(info1)) {
            model.getExperimentoVO().setInfoExp(info2);
            model.getModelStateDAO().saveModelState(true);
            return true;
        } else return false;
    }
}
