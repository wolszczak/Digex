package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.BarrigaVOST;
import brf.suino.model.vo.CostadoVOST;
import brf.suino.model.vo.FrigorificoTempVOST;
import brf.suino.model.vo.FrigorificoVOST;
import brf.suino.model.vo.InfoExpVOST;
import brf.suino.model.vo.PCRVOST;
import brf.suino.model.vo.PaletaVOST;
import brf.suino.model.vo.PernilVOST;
import brf.util.Utils;

public class FrigorificoDAOST {
	public static final String[] HEADER_FRIGO = { "BRINCO", "PESOINIC", "BAIA", "SEXO", "COMEDOURO", "TRAT1", "BLOCO", "DATA1", "PESO1",
			"DATA2", "PESO2", "TATUAGEM", "DATAABA", "ABATE", "ETPAQUIM", "PLPAQUIM", "GIM", "PERPESO", "PERPELGO", "PERPEGOF", "PERPEGOM",
			"PEROSSTE", "PERMUSC", "PERPE", "PERCJPCS", "PERPH24", "PERDINI", "PERDFIN", "PALPESO", "PALPELGO", "PALPEGOF", "PALPEGOM",
			"PALOSSTE", "PALCAMA", "PALCMSP", "COSPESO", "COSOSSTE", "COSPELGO", "COSLOMBO", "COSRETA", "COSPH24", "COSCJPCS", "BARPESO",
			"BARCPTPF", "BARPRONT", "BARESGOR", "PALLECA" };
	private static List<FrigorificoVOST> frigorifico;

	public static void exportarArquivo(InfoExpVOST infoExp, List<FrigorificoVOST> frigo, FrigorificoTempVOST frigoTemp, String localArquivo)
			throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_FRIGO));
		frigorifico = new ArrayList<>();
		frigorifico.addAll(frigo);

		for (PCRVOST pcr : frigoTemp.getPcr()) {
			for (int g = 0; g < frigorifico.size(); g++) {
				if (frigorifico.get(g).getTatuagem() == pcr.getTatuagem()) {
					frigorifico.get(g).setEtpaquim(pcr.getEtpaquim());
					frigorifico.get(g).setPlpaquim(pcr.getPlpaquim());
					frigorifico.get(g).setGim(pcr.getGim());
					frigorifico.get(g).setCosph24(pcr.getCosph24());
					frigorifico.get(g).setCoscjpcs(pcr.getCoscjpcs());
				}
			}
		}

		for (PernilVOST pernil : frigoTemp.getPernil()) {
			for (int g = 0; g < frigorifico.size(); g++) {
				if (frigorifico.get(g).getTatuagem() == pernil.getTatuagem()) {
					frigorifico.get(g).setPerpeso(pernil.getPerpeso());
					frigorifico.get(g).setPerpelgo(pernil.getPerpelgo());
					frigorifico.get(g).setPerpegof(pernil.getPerpegof());
					frigorifico.get(g).setPerpegom(pernil.getPerpegom());
					frigorifico.get(g).setPerosste(pernil.getPerosste());
					frigorifico.get(g).setPermusc(pernil.getPermusc());
					frigorifico.get(g).setPerpe(pernil.getPerpe());
					frigorifico.get(g).setPercjpcs(pernil.getPercjpcs());
					frigorifico.get(g).setPerpeh24(pernil.getPerpeh24());
					frigorifico.get(g).setPerdini(pernil.getPerdini());
					frigorifico.get(g).setPerdfin(pernil.getPerdfin());
				}
			}
		}

		for (PaletaVOST paleta : frigoTemp.getPaleta()) {
			for (int g = 0; g < frigorifico.size(); g++) {
				if (frigorifico.get(g).getTatuagem() == paleta.getTatuagem()) {
					frigorifico.get(g).setPalpeso(paleta.getPalpeso());
					frigorifico.get(g).setPalpelgo(paleta.getPalpelgo());
					frigorifico.get(g).setPalpegof(paleta.getPalpegof());
					frigorifico.get(g).setPalpegom(paleta.getPalpegom());
					frigorifico.get(g).setPalosste(paleta.getPalosste());
					frigorifico.get(g).setPalcama(paleta.getPalcama());
					frigorifico.get(g).setPalcmsp(paleta.getPalcmsp());
					frigorifico.get(g).setPalleca(paleta.getPalleca());
				}
			}
		}

		for (CostadoVOST costado : frigoTemp.getCostado()) {
			for (int g = 0; g < frigorifico.size(); g++) {
				if (frigorifico.get(g).getTatuagem() == costado.getTatuagem()) {
					frigorifico.get(g).setCospeso(costado.getCospeso());
					frigorifico.get(g).setCocosste(costado.getCocosste());
					frigorifico.get(g).setCospelgo(costado.getCospelgo());
					frigorifico.get(g).setCoslombo(costado.getCoslombo());
					frigorifico.get(g).setCosreta(costado.getCosreta());
				}
			}
		}

		for (BarrigaVOST barriga : frigoTemp.getBarriga()) {
			for (int g = 0; g < frigorifico.size(); g++) {
				if (frigorifico.get(g).getTatuagem() == barriga.getTatuagem()) {
					frigorifico.get(g).setBarpeso(barriga.getBarpeso());
					frigorifico.get(g).setBarcptpf(barriga.getBarcptpf());
					frigorifico.get(g).setBarpront(barriga.getBarpront());
					frigorifico.get(g).setBaresgor(barriga.getBaresgor());
				}
			}
		}

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "FRIGORIFICO.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		for (FrigorificoVOST f : frigorifico) {
			buffer.newLine();
			buffer.write("" + f.getBrinco());
			buffer.write(";");
			buffer.write("" + f.getPesoInicial());
			buffer.write(";");
			buffer.write("" + f.getBaia());
			buffer.write(";");
			buffer.write("" + f.getSexo());
			buffer.write(";");
			buffer.write("" + f.getComedouro());
			buffer.write(";");
			buffer.write("" + f.getTrat1());
			buffer.write(";");
			buffer.write("" + f.getBloco());
			buffer.write(";");
			if (f.getData1() == null) {
				buffer.write("");
				buffer.write(";");
			} else {
				buffer.write("" + Utils.dateToString(f.getData1()));
				buffer.write(";");
			}
			if(f.getPeso1() == 0) {
				buffer.write("");
				buffer.write(";");	
			}else {
				buffer.write("" + f.getPeso1());
				buffer.write(";");
			}
			if (f.getData2() == null) {
				buffer.write("");
				buffer.write(";");
			} else {
				buffer.write("" + Utils.dateToString(f.getData2()));
				buffer.write(";");
			}
			if(f.getPeso2() == 0) {
				buffer.write("");
				buffer.write(";");	
			}else {
				buffer.write("" + f.getPeso2());
				buffer.write(";");
			}
			buffer.write("" + f.getTatuagem());
			buffer.write(";");
			if (f.getDataaba() == null) {
				buffer.write("");
				buffer.write(";");
			} else {
				buffer.write("" + Utils.dateToString(f.getDataaba()));
				buffer.write(";");
			}
			buffer.write("" + f.getAbate());
			buffer.write(";");
			buffer.write("" + f.getEtpaquim());
			buffer.write(";");
			buffer.write("" + f.getPlpaquim());
			buffer.write(";");
			buffer.write("" + f.getGim());
			buffer.write(";");
			buffer.write("" + f.getPerpeso());
			buffer.write(";");
			buffer.write("" + f.getPerpelgo());
			buffer.write(";");
			buffer.write("" + f.getPerpegof());
			buffer.write(";");
			buffer.write("" + f.getPerpegom());
			buffer.write(";");
			buffer.write("" + f.getPerosste());
			buffer.write(";");
			buffer.write("" + f.getPermusc());
			buffer.write(";");
			buffer.write("" + f.getPerpe());
			buffer.write(";");
			buffer.write("" + f.getPercjpcs());
			buffer.write(";");
			buffer.write("" + f.getPerpeh24());
			buffer.write(";");
			buffer.write("" + f.getPerdini());
			buffer.write(";");
			buffer.write("" + f.getPerdfin());
			buffer.write(";");
			buffer.write("" + f.getPalpeso());
			buffer.write(";");
			buffer.write("" + f.getPalpelgo());
			buffer.write(";");
			buffer.write("" + f.getPalpegof());
			buffer.write(";");
			buffer.write("" + f.getPalpegom());
			buffer.write(";");
			buffer.write("" + f.getPalosste());
			buffer.write(";");
			buffer.write("" + f.getPalcama());
			buffer.write(";");
			buffer.write("" + f.getPalcmsp());
			buffer.write(";");
			buffer.write("" + f.getCospeso());
			buffer.write(";");
			buffer.write("" + f.getCocosste());
			buffer.write(";");
			buffer.write("" + f.getCospelgo());
			buffer.write(";");
			buffer.write("" + f.getCoslombo());
			buffer.write(";");
			buffer.write("" + f.getCosreta());
			buffer.write(";");
			buffer.write("" + f.getCosph24());
			buffer.write(";");
			buffer.write("" + f.getCoscjpcs());
			buffer.write(";");
			buffer.write("" + f.getBarpeso());
			buffer.write(";");
			buffer.write("" + f.getBarcptpf());
			buffer.write(";");
			buffer.write("" + f.getBarpront());
			buffer.write(";");
			buffer.write("" + f.getBaresgor());
			buffer.write(";");
			buffer.write("" + f.getPalleca());
			buffer.write(";");
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}
}
