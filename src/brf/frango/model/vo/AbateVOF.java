package brf.frango.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AbateVOF implements Serializable {
    private List<BaiaAnilhaVOF> baiaAnilha;
    private List<BalancaVOF> balanca;
    private List<RendimentoVOF> rendimento;
    private List<LacreAnilhaVOF> lacreAnilha;
    private List<AvaliacaoPeVOF> avaliacaoPe;
    
    public AbateVOF() {
        baiaAnilha = new ArrayList<>();
        balanca = new ArrayList<>();
        rendimento = new ArrayList<>();
        lacreAnilha = new ArrayList<>();
        avaliacaoPe = new ArrayList<>();
    }    
        
    public void setBaiaAnilha(List<BaiaAnilhaVOF> baiaAnilha) {
        this.baiaAnilha = baiaAnilha;
    }
    
    public List<BaiaAnilhaVOF> getBaiaAnilha() {
        return baiaAnilha;
    }

    public List<BalancaVOF> getBalanca() {
        return balanca;
    }

    public void setBalanca(List<BalancaVOF> balanca) {
        this.balanca = balanca;
    }

    public List<RendimentoVOF> getRendimento() {
        return rendimento;
    }

    public void setRendimento(List<RendimentoVOF> rendimento) {
        this.rendimento = rendimento;
    }
    
    public List<LacreAnilhaVOF> getLacreAnilha() {
        return lacreAnilha;
    }

    public void setLacreAnilha(List<LacreAnilhaVOF> lacreAnilha) {
        this.lacreAnilha = lacreAnilha;
    }

    public List<AvaliacaoPeVOF> getAvaliacaoPe() {
        return avaliacaoPe;
    }

    public void setAvaliacaoPe(List<AvaliacaoPeVOF> avaliacaoPe) {
        this.avaliacaoPe = avaliacaoPe;
    }
}