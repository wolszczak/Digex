package brf.frango.controller;

import brf.frango.model.ModelF;
import brf.frango.model.bo.AvaliacaoPeBOF;
import brf.frango.model.bo.BaiaAnilhaBOF;
import brf.frango.model.bo.DesempenhoBOF;
import brf.frango.model.bo.EscolhaBalBOF;
import brf.frango.model.bo.LacreAnilhaBOF;
import brf.frango.model.bo.RendimentoBOF;
import brf.frango.model.vo.ExperimentoVOF;
import javax.swing.JFrame;

public class ControllerF {
    private ModelF modelF;
    private ControllerInfoExpF ctrlInfoExp;
    private ControllerDesempenhoF ctrlDesempenho;
    private ControllerEscolhaDigF ctrlEscolhaDig;
    private ControllerEscolhaAbateF ctrlEscolhaAbate;
    private ControllerEscolhaBalF ctrlEscolhaBal;
    private ControllerBalancaF ctrlBalanca;
    private ControllerBaiaAnilhaF ctrlBaiaAnilha;
    private ControllerRendimentoF ctrlRendimento;
    private ControllerLacreAnilhaF ctrlLacreAnilha;
    private ControllerAvaliacaoPeF ctrlAvaliacaoPe;
    private final String idDigitador;
    
    public ControllerF(ModelF mf, String idDigitador) {
        modelF = mf;
        this.idDigitador = idDigitador;
    }
    
    public ModelF getModel() {
        return modelF;
    }
    
    public String getIdDigitador() {
        return idDigitador;
    }
    
    public void startModuloFrango() {
        ctrlInfoExp = new ControllerInfoExpF(this);
        ctrlInfoExp.openWindow(idDigitador);
        modelF.setExperimentoVO(new ExperimentoVOF());
    }
    
    public void startEscolhaDig() {
        ctrlEscolhaDig = new ControllerEscolhaDigF(this);
        ctrlEscolhaDig.openWindow();
    }
    
    public void resumeEscolhaDig() {
        ctrlEscolhaDig.resumeWindow();
    }
    
    public void startDesempenho() {
        ctrlDesempenho = new ControllerDesempenhoF(this, new DesempenhoBOF(this));
        ctrlDesempenho.openWindow();
    }
    
    public void startEscolhaAbate(String escolha) {
        ctrlEscolhaAbate = new ControllerEscolhaAbateF(this, escolha);
        ctrlEscolhaAbate.openWindow();
    }
    
    public void resumeEscolhaAbate() {
        ctrlEscolhaAbate.resumeWindow();
    }
    
    public void startBaiaAnilha(String aviario, int abate, String dataAbate) {
        ctrlBaiaAnilha = new ControllerBaiaAnilhaF(this, new BaiaAnilhaBOF(this));
        ctrlBaiaAnilha.openWindow(aviario, abate, dataAbate);
    }
    
    public void resumeBaiaAnilha() {
        ctrlBaiaAnilha.resumeWindow();
    }
        
    public void startEscolhaBal(String aviario, int abate, String dataAbate) {
        ctrlEscolhaBal = new ControllerEscolhaBalF(this, new EscolhaBalBOF(this));
        ctrlEscolhaBal.openWindow(aviario, abate, dataAbate);
    }
    
    public void startBalanca(JFrame parentView,int abate) {
        ctrlBalanca = new ControllerBalancaF(this);
        ctrlBalanca.openWindow(parentView, abate);
    }
    
    public void resumeEscolhaBal() {
        ctrlEscolhaBal.resumeWindow();
    }
    
    public void startRendimento(String aviario, int abate, String dataAbate) {
        ctrlRendimento = new ControllerRendimentoF(this, new RendimentoBOF(this));
        ctrlRendimento.openWindow(aviario, abate, dataAbate);
    }
    
    public void startLacreAnilha(String aviario, int abate, String dataAbate) {
        ctrlLacreAnilha = new ControllerLacreAnilhaF(this, new LacreAnilhaBOF(this));
        ctrlLacreAnilha.openWindow(aviario, abate, dataAbate);
    }
    
    public void resumeLacreAnilha() {
        ctrlLacreAnilha.resumeWindow();
    }
    
    public void startAvaliacaoPe(String aviario, int abate, String dataAbate) {
        ctrlAvaliacaoPe = new ControllerAvaliacaoPeF(this, new AvaliacaoPeBOF(this));
        ctrlAvaliacaoPe.openWindow(aviario, abate, dataAbate);
    }    
}
