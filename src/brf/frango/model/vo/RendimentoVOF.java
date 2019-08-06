package brf.frango.model.vo;

import java.io.Serializable;

public class RendimentoVOF implements Serializable {
	private static final long serialVersionUID = -3729039559657964183L;
	private int abate;
    private int ordem;
    private int nasa;
    private int gDir;
    private int gEsq;
    private int pAbate;
    private int pGorDir;
    private int pGorEsq;
    private int pAsa;
    private int gorPeito;
    private int pPeito;
    private Integer pad;
    private Integer pae;
    private Integer estPDir;
    private Integer estPEsq;
    private Integer largPeito;
    private Integer compPeito;
    private int pCoxSob;
  
    public RendimentoVOF(int abate, int ordem, int nasa, int gDir, int gEsq, int pAbate, int pGorDir, int pGorEsq, int pAsa, int gorPeito,  int pPeito, Integer pad, Integer pae, Integer estPDir, Integer estPEsq,Integer largPeito, Integer compPeito, int pCoxSob) {
        this.abate = abate;
        this.ordem = ordem;
        this.nasa = nasa;
        this.gDir = gDir;
        this.gEsq = gEsq;
        this.pAbate = pAbate;
        this.pGorDir = pGorDir;
        this.pGorEsq = pGorEsq;
        this.pAsa = pAsa;
        this.gorPeito = gorPeito;
        this.pPeito = pPeito;
        this.pad = pad;
        this.pae = pae;
        this.estPDir = estPDir;
        this.estPEsq = estPEsq;
        this.largPeito = largPeito;
        this.compPeito = compPeito;
        this.pCoxSob = pCoxSob;
    }

    public int getAbate() {
        return abate;
    }

    public void setAbate(int abate) {
        this.abate = abate;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getNasa() {
        return nasa;
    }

    public void setNasa(int nasa) {
        this.nasa = nasa;
    }

    public int getgDir() {
        return gDir;
    }

    public void setgDir(int gDir) {
        this.gDir = gDir;
    }

    public int getgEsq() {
        return gEsq;
    }

    public void setgEsq(int gEsq) {
        this.gEsq = gEsq;
    }

    public int getpAbate() {
        return pAbate;
    }

    public void setpAbate(int pAbate) {
        this.pAbate = pAbate;
    }

    public int getpGorDir() {
        return pGorDir;
    }

    public void setpGorDir(int pGorDir) {
        this.pGorDir = pGorDir;
    }

    public int getpGorEsq() {
        return pGorEsq;
    }

    public void setpGorEsq(int pGorEsq) {
        this.pGorEsq = pGorEsq;
    }

    public int getpAsa() {
        return pAsa;
    }

    public void setpAsa(int pAsa) {
        this.pAsa = pAsa;
    }

    public int getGorPeito() {
        return gorPeito;
    }

    public void setGorPeito(int gorPeito) {
        this.gorPeito = gorPeito;
    }

    public int getpPeito() {
        return pPeito;
    }

    public void setpPeito(int pPeito) {
        this.pPeito = pPeito;
    }

    public Integer getPad() {
        return pad;
    }

    public void setPad(Integer pad) {
        this.pad = pad;
    }

    public Integer getPae() {
        return pae;
    }

    public void setPae(Integer pae) {
        this.pae = pae;
    }

    public Integer getEstPDir() {
        return estPDir;
    }

    public void setEstPDir(Integer estPDir) {
        this.estPDir = estPDir;
    }

    public Integer getEstPEsq() {
        return estPEsq;
    }

    public void setEstPEsq(Integer estPEsq) {
        this.estPEsq = estPEsq;
    }

    public int getpCoxSob() {
        return pCoxSob;
    }

    public void setpCoxSob(int pCoxSob) {
        this.pCoxSob = pCoxSob;
    }

	public Integer getLargPeito() {
		return largPeito;
	}

	public void setLargPeito(Integer largPeito) {
		this.largPeito = largPeito;
	}

	public Integer getCompPeito() {
		return compPeito;
	}

	public void setCompPeito(Integer compPeito) {
		this.compPeito = compPeito;
	}
}
