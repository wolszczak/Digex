package brf.suino.model.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class InfoExpVOST implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idDigitador;
	private String protocolo;
	private int local;
	private String local1;
	private int galpao;
	private String teste;
	private int tipo;
	private String tipo1;
	private int nrBaias;
	private String inicioExp;
	private String fimExp;
	private int idadeAloj;
	private int nrFases;
	private List<String> datasFases;
	private String msg;
	private boolean[] problemas = { false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false };

	public InfoExpVOST(String idDigitador, String protocolo, int local, String local1, int galpao, String teste, int tipo,
			String tipo1, int nrBaias, String inicioExp, String fimExp, int idadeAloj,  int nrFases,
			List<String> datasFases) {
		this.idDigitador = idDigitador;
		this.protocolo = protocolo;
		this.local = local;
		this.local1 = local1;
		this.galpao = galpao;
		this.teste = teste;
		this.tipo = tipo;
		this.tipo1 = tipo1;
		this.nrBaias = nrBaias;
		this.inicioExp = inicioExp;
		this.fimExp = fimExp;
		this.idadeAloj = idadeAloj;
		this.nrFases = nrFases;
		this.datasFases = datasFases;
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

	public String getgalpao() {
		return Integer.toString(galpao);
	}

	public void setgalpao(int galpao) {
		this.galpao = galpao;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
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

	public int getNrFases() {
		return nrFases;
	}

	public void setNrFases(int nrFases) {
		this.nrFases = nrFases;
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
		final InfoExpVOST other = (InfoExpVOST) obj;
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
		if (this.galpao != other.galpao) {
			msg = msg.concat("- Aviário não confere\n");
			problemas[3] = true;
		}
		if (!Objects.equals(this.teste, other.teste)) {
			msg = msg.concat("- Teste não confere\n");
			problemas[4] = true;
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
		if (this.nrFases != other.nrFases) {
			msg = msg.concat("- Número de fases não confere\n");
			problemas[13] = true;
		}

		if (!this.datasFases.equals(other.datasFases)) {
			msg = msg.concat("- Idade(s) não confere(m)\n");
			problemas[14] = true;
		}

		if (msg.length() != 0) {
			return false;
		} else
			return true;
	}

	public String getErrorMessage() {
		return msg;
	}

	public int getGalpao() {
		return galpao;
	}

	public void setGalpao(int galpao) {
		this.galpao = galpao;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<String> getDatasFases() {
		return datasFases;
	}

	public void setDatasFases(List<String> datasFases) {
		this.datasFases = datasFases;
	}
}