package brf.peru.controller;

import java.util.List;

import brf.peru.model.ModelP;
import brf.peru.model.bo.DesempenhoBOP;

public class ControllerP {
    private ModelP modelP;
    private ControllerInfoExpP ctrlInfoExp;
    private ControllerDesempenhoP ctrlDesempenho;
    private ControllerEscolhaDigP ctrlEscolhaDig;
    private ControllerEscolhaDigRendP ctrlEscolhaDigRend;
    private ControllerEscolhaAbateP ctrlEscolhaAbate;
    private ControllerBaiaAmostradosP ctrlBaiaAmostrados;
    private final String idDigitador;
    
    public ControllerP(ModelP mp, String idDigitador) {
        modelP = mp;
        this.idDigitador = idDigitador;
    }
    
    public ModelP getModel() {
        return modelP;
    }
    
    public String getIdDigitador() {
        return idDigitador;
    }
    
    public void startModuloPeru() {
        ctrlInfoExp = new ControllerInfoExpP(this);
        ctrlInfoExp.openWindow(idDigitador);
    }
    
    public void startEscolhaDig(List<Integer> idadesFases) {
        ctrlEscolhaDig = new ControllerEscolhaDigP(this);
        ctrlEscolhaDig.openWindow(idadesFases);
    }
    
    public void startEscolhaDigRend(Integer abate, Integer idadeAbate, String dataAbate) {
        ctrlEscolhaDigRend = new ControllerEscolhaDigRendP(this);
        ctrlEscolhaDigRend.openWindow(modelP.getExperimentoVO().getInfoExp().getAviario(), abate, idadeAbate, dataAbate);
    }
    
    public void resumeEscolhaDig() {
        ctrlEscolhaDig.resumeWindow();
    }
    
    public void startDesempenho(List<Integer> idadesFases) {
        ctrlDesempenho = new ControllerDesempenhoP(this, new DesempenhoBOP(this));
        ctrlDesempenho.openWindow(idadesFases);
    }
    
    public void startEscolhaAbate(List<Integer> idades) {
        ctrlEscolhaAbate = new ControllerEscolhaAbateP(this);
        ctrlEscolhaAbate.openWindow(idades);
    }
    
    public void resumeEscolhaAbate() {
        ctrlEscolhaAbate.resumeWindow();
    }
    
    public void startBaiaAmostrados(Integer aviario, Integer abate,Integer idadeAbate,String dataAbate) {
    	ctrlBaiaAmostrados = new ControllerBaiaAmostradosP(this);
    	ctrlBaiaAmostrados.openWindow(modelP.getExperimentoVO().getInfoExp().getAviario(), abate, idadeAbate, dataAbate);
    }
    
    public void startCamaras() {
    	
    }
    
    public void startCones() {
    	
    }
}