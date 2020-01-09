package brf.frango.model.vo;

import java.io.Serializable;

public class BaiaAnilhaVOF implements Serializable {
    private int ordem;
    private int baia;
    private int sexo;
    private int lado;
    private int trat1;
    private int trat2;
    private int inicioAnilha;
    private int fimAnilha;
    private int controle;

    public BaiaAnilhaVOF(int ordem, int baia, int sexo, int lado, int trat1, int trat2, int inicioAnilha, int fimAnilha, int controle) {
        this.ordem = ordem;
        this.baia = baia;
        this.sexo = sexo;
        this.lado = lado;
        this.trat1 = trat1;
        this.trat2 = trat2;
        this.inicioAnilha = inicioAnilha;
        this.fimAnilha = fimAnilha;
        this.controle = controle;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getBaia() {
        return baia;
    }

    public void setBaia(int baia) {
        this.baia = baia;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getTrat1() {
        return trat1;
    }

    public void setTrat1(int trat1) {
        this.trat1 = trat1;
    }

    public int getTrat2() {
        return trat2;
    }

    public void setTrat2(int trat2) {
        this.trat2 = trat2;
    }

    public int getInicioAnilha() {
        return inicioAnilha;
    }

    public void setInicioAnilha(int inicioAnilha) {
        this.inicioAnilha = inicioAnilha;
    }

    public int getFimAnilha() {
        return fimAnilha;
    }

    public void setFimAnilha(int fimAnilha) {
        this.fimAnilha = fimAnilha;
    }
    
    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }
}
