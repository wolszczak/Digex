package brf.frango.model.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class InfoExpVOF implements Serializable {
    private String idDigitador; 
    private String protocolo;
    private int local;
    private String local1;
    private int aviario;
    private String teste;
    private int cama;
    private int tipo;
    private String tipo1;
    private int nrBaias;
    private String inicioExp;
    private String fimExp;
    private int idadeAloj;
    private int equalizacao;
    private int nrFases;
    private List<Integer> idadeFase;
    private int nrAbate;
    private List<String> dataAbate;
    private int erro1, erro2, erro3, erro4, erro5, erro6, erro7, erro8;
    private int aleijado1, aleijado2, aleijado3, aleijado4, aleijado5, aleijado6, aleijado7, aleijado8;
    private String msg;
    private boolean[] problemas = {false,false,false,false,false,false,false,false,
                                   false,false,false,false,false,false,false,false,
                                   false,false,false,false,false,false,false,false,
                                   false,false,false,false,false,false,false,false,false};

    public InfoExpVOF(String idDigitador, String protocolo, int local, String local1, int aviario, String teste, 
                     int cama, int tipo, String tipo1, int nrBaias, String inicioExp, String fimExp, int idadeAloj,
                     int equalizacao, int nrFases, List<Integer> idadeFase, int nrAbate, List<String> dataAbate,
                     int erro1, int erro2, int erro3, int erro4, int erro5, int erro6, int erro7, int erro8, 
                     int aleijado1, int aleijado2, int aleijado3, int aleijado4, int aleijado5, int aleijado6,
                     int aleijado7, int aleijado8) {
        this.idDigitador = idDigitador;
        this.protocolo = protocolo;
        this.local = local;
        this.local1 = local1;
        this.aviario = aviario;
        this.teste = teste;
        this.cama = cama;
        this.tipo = tipo;
        this.tipo1 = tipo1;
        this.nrBaias = nrBaias;
        this.inicioExp = inicioExp;
        this.fimExp = fimExp;
        this.idadeAloj = idadeAloj;
        this.equalizacao = equalizacao;
        this.nrFases = nrFases;
        this.idadeFase = idadeFase;
        this.nrAbate = nrAbate;
        this.dataAbate = dataAbate;
        this.erro1 = erro1;
        this.erro2 = erro2;
        this.erro3 = erro3;
        this.erro4 = erro4;
        this.erro5 = erro5;
        this.erro6 = erro6;
        this.erro7 = erro7;
        this.erro8 = erro8;
        this.aleijado1 = aleijado1;
        this.aleijado2 = aleijado2;
        this.aleijado3 = aleijado3;
        this.aleijado4 = aleijado4;
        this.aleijado5 = aleijado5;
        this.aleijado6 = aleijado6;
        this.aleijado7 = aleijado7;
        this.aleijado8 = aleijado8;
        this.erro1 = erro1;
        this.erro1 = erro1;
        msg = "";
    }

    public String getIdDigitador() {
        return idDigitador;
    }

    public void setIdDigitador(String idDigitador) {
        this.idDigitador = idDigitador;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getLocal() {
        return Integer.toString(local);
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public String getLocal1() {
        return local1;
    }

    public void setLocal1(String local1) {
        this.local1 = local1;
    }

    public String getAviario() {
        return Integer.toString(aviario);
    }

    public void setAviario(int aviario) {
        this.aviario = aviario;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getCama() {
        return Integer.toString(cama);
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public String getTipo() {
        return Integer.toString(tipo);
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public int getNrBaias() {
        return nrBaias;
    }

    public void setNrBaias(int nrBaias) {
        this.nrBaias = nrBaias;
    }

    public String getInicioExp() {
        return inicioExp;
    }

    public void setInicioExp(String inicioExp) {
        this.inicioExp = inicioExp;
    }

    public String getFimExp() {
        return fimExp;
    }

    public void setFimExp(String fimExp) {
        this.fimExp = fimExp;
    }

    public String getIdadeAloj() {
        return Integer.toString(idadeAloj);
    }

    public void setIdadeAloj(int idadeAloj) {
        this.idadeAloj = idadeAloj;
    }

    public String getEqualizacao() {
        return Integer.toString(equalizacao);
    }

    public void setEqualizacao(int equalizacao) {
        this.equalizacao = equalizacao;
    }

    public int getNrFases() {
        return nrFases;
    }

    public void setNrFases(int nrFases) {
        this.nrFases = nrFases;
    }

    public List<Integer> getIdadeFase() {
        return idadeFase;
    }

    public void setIdadeFase(List<Integer> idadeFase) {
        this.idadeFase = idadeFase;
    }

    public int getNrAbate() {
        return nrAbate;
    }

    public void setNrAbate(int nrAbate) {
        this.nrAbate = nrAbate;
    }

    public List<String> getDataAbate() {
        return dataAbate;
    }

    public void setDataAbate(List<String> dataAbate) {
        this.dataAbate = dataAbate;
    }

    public boolean isErro1() {
        if (erro1 == 0) {
            return false;
        } else return true;
    }

    public void setErro1(int erro1) {
        this.erro1 = erro1;
    }

    public boolean isErro2() {
        if (erro2 == 0) {
            return false;
        } else return true;
    }

    public void setErro2(int erro2) {
        this.erro2 = erro2;
    }

    public boolean isErro3() {
        if (erro3 == 0) {
            return false;
        } else return true;
    }

    public void setErro3(int erro3) {
        this.erro3 = erro3;
    }

    public boolean isErro4() {
        if (erro4 == 0) {
            return false;
        } else return true;
    }

    public void setErro4(int erro4) {
        this.erro4 = erro4;
    }

    public boolean isErro5() {
        if (erro5 == 0) {
            return false;
        } else return true;
    }

    public void setErro5(int erro5) {
        this.erro5 = erro5;
    }

    public boolean isErro6() {
        if (erro6 == 0) {
            return false;
        } else return true;
    }

    public void setErro6(int erro6) {
        this.erro6 = erro6;
    }

    public boolean isErro7() {
        if (erro7 == 0) {
            return false;
        } else return true;
    }

    public void setErro7(int erro7) {
        this.erro7 = erro7;
    }

    public boolean isErro8() {
        if (erro8 == 0) {
            return false;
        } else return true;
    }

    public void setErro8(int erro8) {
        this.erro8 = erro8;
    }

    public boolean isAleijado1() {
        if (aleijado1 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado1(int aleijado1) {
        this.aleijado1 = aleijado1;
    }

    public boolean isAleijado2() {
        if (aleijado2 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado2(int aleijado2) {
        this.aleijado2 = aleijado2;
    }

    public boolean isAleijado3() {
        if (aleijado3 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado3(int aleijado3) {
        this.aleijado3 = aleijado3;
    }

    public boolean isAleijado4() {
        if (aleijado4 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado4(int aleijado4) {
        this.aleijado4 = aleijado4;
    }

    public boolean isAleijado5() {
        if (aleijado5 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado5(int aleijado5) {
        this.aleijado5 = aleijado5;
    }

    public boolean isAleijado6() {
        if (aleijado6 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado6(int aleijado6) {
        this.aleijado6 = aleijado6;
    }

    public boolean isAleijado7() {
        if (aleijado7 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado7(int aleijado7) {
        this.aleijado7 = aleijado7;
    }

    public boolean isAleijado8() {
        if (aleijado8 == 0) {
            return false;
        } else return true;
    }

    public void setAleijado8(int aleijado8) {
        this.aleijado8 = aleijado8;
    }

    public boolean[] getProblemas() {
        return problemas;
    }

    public void setProblemas(boolean[] problemas) {
        this.problemas = problemas;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InfoExpVOF other = (InfoExpVOF) obj;
        if (!Objects.equals(this.protocolo, other.protocolo)) {
            msg = msg.concat("- Protocolo não confere\n");
            problemas[0] = true;
        }
        if (this.local != other.local) {
            msg = msg.concat("- Local não confere\n");
            problemas[1] = true;
        }
        if (!Objects.equals(this.local1, other.local1)) {
            problemas[2] = true;
        }
        if (this.aviario != other.aviario) {
            msg = msg.concat("- Aviário não confere\n");
            problemas[3] = true;
        }
        if (!Objects.equals(this.teste, other.teste)) {
            msg = msg.concat("- Teste não confere\n");
            problemas[4] = true;
        }
        if (this.cama != other.cama) {
            msg = msg.concat("- Cama não confere\n");
            problemas[5] = true;
        }        
        if (this.tipo != other.tipo) {
            msg = msg.concat("- Área não confere\n");
            problemas[6] = true;
        }
        if (!Objects.equals(this.tipo1, other.tipo1)) {
            problemas[7] = true;
        }
        if (this.nrBaias != other.nrBaias) {
            msg = msg.concat("- Nr. de Baias não confere\n");
            problemas[8] = true;
        }
        if (!Objects.equals(this.inicioExp, other.inicioExp)) {
            msg = msg.concat("- Início do Experimento não confere\n");
            problemas[9] = true;
        }
        if (!Objects.equals(this.fimExp, other.fimExp)) {
            msg = msg.concat("- Fim do Experimento não confere\n");
            problemas[10] = true;
        }
        if (this.idadeAloj != other.idadeAloj) {
            msg = msg.concat("- Idade de Alojamento não confere\n");
            problemas[11] = true;
        }
        if (this.equalizacao != other.equalizacao) {
            msg = msg.concat("- Equalização não confere\n");
            problemas[12] = true;
        }
        if (this.nrFases != other.nrFases) {
            msg = msg.concat("- Número de fases não confere\n");
            problemas[13] = true;
        }
        
        if (!this.idadeFase.equals(other.idadeFase)) {
            msg = msg.concat("- Idade(s) não confere(m)\n");
            problemas[14] = true;
        }
        
        if (this.nrAbate != other.nrAbate) {
            msg = msg.concat("- Número de abates não confere\n");
            problemas[15] = true;
        }
        if (!this.dataAbate.equals(other.dataAbate)) {
            msg = msg.concat("- Data(s) de Abate não confere(m)\n");
            problemas[16] = true;
        }
        if (!(erro1 == other.erro1)) {
            msg = msg.concat("- Retirada de Erro na Fase 1 não confere\n");
            problemas[17] = true;
        }
        if (!(erro2 == other.erro2)) {
            msg = msg.concat("- Retirada de Erro na Fase 2 não confere\n");
            problemas[18] = true;
        }
        if (!(erro3 == other.erro3)) {
            msg = msg.concat("- Retirada de Erro na Fase 3 não confere\n");
            problemas[19] = true;
        }
        if (!(erro4 == other.erro4)) {
            msg = msg.concat("- Retirada de Erro na Fase 4 não confere\n");
            problemas[20] = true;
        }
        if (!(erro5 == other.erro5)) {
            msg = msg.concat("- Retirada de Erro na Fase 5 não confere\n");
            problemas[21] = true;
        }
        if (!(erro6 == other.erro6)) {
            msg = msg.concat("- Retirada de Erro na Fase 6 não confere\n");
            problemas[22] = true;
        }
        if (!(erro7 == other.erro7)) {
            msg = msg.concat("- Retirada de Erro na Fase 7 não confere\n");
            problemas[23] = true;
        }
        if (!(erro8 == other.erro8)) {
            msg = msg.concat("- Retirada de Erro na Fase 8 não confere\n");
            problemas[24] = true;
        }
        if (!(aleijado1 == other.aleijado1)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 1 não confere\n");
            problemas[25] = true;
        }
        if (!(aleijado2 == other.aleijado2)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 2 não confere\n");
            problemas[26] = true;
        }
        if (!(aleijado3 == other.aleijado3)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 3 não confere\n");
            problemas[27] = true;
        }
        if (!(aleijado4 == other.aleijado4)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 4 não confere\n");
            problemas[28] = true;
        }
        if (!(aleijado5 == other.aleijado5)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 5 não confere\n");
            problemas[29] = true;
        }
        if (!(aleijado6 == other.aleijado6)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 6 não confere\n");
            problemas[30] = true;
        }
        if (!(aleijado7 == other.aleijado7)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 7 não confere\n");
            problemas[31] = true;
        }
        if (!(aleijado8 == other.aleijado8)) {
            msg = msg.concat("- Retirada de Aleijado na Fase 8 não confere\n");
            problemas[32] = true;
        }
        if (msg.length() != 0) {
            return false;
        } else return true;
    }
    
    public String getErrorMessage() {
        return msg;
    }
}