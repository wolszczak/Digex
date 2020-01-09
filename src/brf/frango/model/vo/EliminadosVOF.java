package brf.frango.model.vo;

public class EliminadosVOF {
    private int idade;
    private int nr;
    private int peso;

    public EliminadosVOF(int idade, int nr, int peso) {
        this.idade = idade;
        this.nr = nr;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
