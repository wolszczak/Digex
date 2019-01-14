package brf.frango.model.vo;

import java.io.Serializable;

public class PesagemVOF implements Serializable  {
    private int ordem;
    private int idade;
    private int nrAnimais;
    private int tara;
    private int pesoAnimais1, pesoAnimais2;
    private int nrAmostrados;
    private int pesoAmostrados;
    private int nrErros;
    private int pesoErros;
    private int nrAleijados;
    private int pesoAleijados;

    public int getIdade() {
        return idade;
    }

    public PesagemVOF(int ordem, int idade, int nrAnimais, int tara, int pesoAnimais1, int pesoAnimais2, int nrAmostrados, int pesoAmostrados, int nrErros, int pesoErros, int nrAleijados, int pesoAleijados) {
        this.ordem = ordem;
        this.idade = idade;
        this.nrAnimais = nrAnimais;
        this.tara = tara;
        this.pesoAnimais1 = pesoAnimais1;
        this.pesoAnimais2 = pesoAnimais2;
        this.nrAmostrados = nrAmostrados;
        this.pesoAmostrados = pesoAmostrados;
        this.nrErros = nrErros;
        this.pesoErros = pesoErros;
        this.nrAleijados = nrAleijados;
        this.pesoAleijados = pesoAleijados;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNrAnimais() {
        return nrAnimais;
    }

    public void setNrAnimais(int nrAnimais) {
        this.nrAnimais = nrAnimais;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getPesoAnimais1() {
        return pesoAnimais1;
    }

    public void setPesoAnimais1(int pesoAnimais1) {
        this.pesoAnimais1 = pesoAnimais1;
    }

    public int getPesoAnimais2() {
        return pesoAnimais2;
    }

    public void setPesoAnimais2(int pesoAnimais2) {
        this.pesoAnimais2 = pesoAnimais2;
    }
    
    public int getNrAmostrados() {
        return nrAmostrados;
    }

    public void setNrAmostrados(int nrAmostrados) {
        this.nrAmostrados = nrAmostrados;
    }

    public int getPesoAmostrados() {
        return pesoAmostrados;
    }

    public void setPesoAmostrados(int pesoAmostrados) {
        this.pesoAmostrados = pesoAmostrados;
    }

    public int getNrErros() {
        return nrErros;
    }

    public void setNrErros(int nrErros) {
        this.nrErros = nrErros;
    }

    public int getPesoErros() {
        return pesoErros;
    }

    public void setPesoErros(int pesoErros) {
        this.pesoErros = pesoErros;
    }

    public int getNrAleijados() {
        return nrAleijados;
    }

    public void setNrAleijados(int nrAleijados) {
        this.nrAleijados = nrAleijados;
    }

    public int getPesoAleijados() {
        return pesoAleijados;
    }

    public void setPesoAleijados(int pesoAleijados) {
        this.pesoAleijados = pesoAleijados;
    }
}
