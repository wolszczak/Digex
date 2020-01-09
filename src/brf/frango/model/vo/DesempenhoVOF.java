package brf.frango.model.vo;

import java.io.Serializable;
import java.util.List;


public class DesempenhoVOF implements Serializable  {
    private int baia, sexo, lado, trat1, trat2, nrAlojados;
    
    private List<RmeVOF> rme;
    private List<PesagemVOF> pesagem;
    
    private int controleBaia;

    public DesempenhoVOF(int baia, int sexo, int lado, int trat1, int trat2, int nrAlojados, int controleBaia, List<RmeVOF> rme, List<PesagemVOF> pesagem) {
        this.baia = baia;
        this.sexo = sexo;
        this.lado = lado;
        this.trat1 = trat1;
        this.trat2 = trat2;
        this.nrAlojados = nrAlojados;
        this.controleBaia = controleBaia;
        this.rme = rme;
        this.pesagem = pesagem;
    }

    public int getBaia() {
        return baia;
    }

    public int getControleBaia() {
        return controleBaia;
    }

    public void setControleBaia(int controleBaia) {
        this.controleBaia = controleBaia;
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

    public int getNrAlojados() {
        return nrAlojados;
    }

    public void setNrAlojados(int nrAlojados) {
        this.nrAlojados = nrAlojados;
    }

    public List<RmeVOF> getRme() {
        return rme;
    }

    public void setRme(List<RmeVOF> rme) {
        this.rme = rme;
    }

    public List<PesagemVOF> getPesagem() {
        return pesagem;
    }

    public void setPesagem(List<PesagemVOF> pesagem) {
        this.pesagem = pesagem;
    }
}
