package brf.frango.model.vo;

import java.io.Serializable;

public class RmeVOF implements Serializable  {
    private int ordem;
    private int idadeRacao;
    private int fornecida;
    private int sobra;
    private int idadeMortos;
    private int nrMortos;
    private int pesoMortos;
    private int idadeEliminados;
    private int nrEliminados;
    private int pesoEliminados;
    private int controle;

    public RmeVOF(int ordem, int idadeRacao, int fornecida, int sobra, int idadeMortos, int nrMortos, int pesoMortos, int idadeEliminados, int nrEliminados, int pesoEliminados, int controle) {
        this.ordem = ordem;
        this.idadeRacao = idadeRacao;
        this.fornecida = fornecida;
        this.sobra = sobra;
        this.idadeMortos = idadeMortos;
        this.nrMortos = nrMortos;
        this.pesoMortos = pesoMortos;
        this.idadeEliminados = idadeEliminados;
        this.nrEliminados = nrEliminados;
        this.pesoEliminados = pesoEliminados;
        this.controle = controle;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getIdadeRacao() {
        return idadeRacao;
    }

    public void setIdadeRacao(int idadeRacao) {
        this.idadeRacao = idadeRacao;
    }

    public int getFornecida() {
        return fornecida;
    }

    public void setFornecida(int fornecida) {
        this.fornecida = fornecida;
    }

    public int getSobra() {
        return sobra;
    }

    public void setSobra(int sobra) {
        this.sobra = sobra;
    }

    public int getIdadeMortos() {
        return idadeMortos;
    }

    public void setIdadeMortos(int idadeMortos) {
        this.idadeMortos = idadeMortos;
    }

    public int getNrMortos() {
        return nrMortos;
    }

    public void setNrMortos(int nrMortos) {
        this.nrMortos = nrMortos;
    }

    public int getPesoMortos() {
        return pesoMortos;
    }

    public void setPesoMortos(int pesoMortos) {
        this.pesoMortos = pesoMortos;
    }

    public int getIdadeEliminados() {
        return idadeEliminados;
    }

    public void setIdadeEliminados(int idadeEliminados) {
        this.idadeEliminados = idadeEliminados;
    }

    public int getNrEliminados() {
        return nrEliminados;
    }

    public void setNrEliminados(int nrEliminados) {
        this.nrEliminados = nrEliminados;
    }

    public int getPesoEliminados() {
        return pesoEliminados;
    }

    public void setPesoEliminados(int pesoEliminados) {
        this.pesoEliminados = pesoEliminados;
    }
    
    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }
    
}
