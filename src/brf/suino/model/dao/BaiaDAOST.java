package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.BaiaVOST;
import brf.suino.model.vo.InfoExpVOST;
import brf.suino.model.vo.MedicadosVOST;
import brf.suino.model.vo.MortalidadeVOST;

public class BaiaDAOST {
	public static final String[] HEADER_MORT = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATAMO", "BRINCO", "PMORTO", "CAUSA", "FASE" };
	public static final String[] HEADER_MEDI = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATAMO", "BRINCO", "MEDICACAO", "CAUSA", "DOSE1",
			"DOSE2", "DOSE3" };
	public static final String[] HEADERTRATOS = {"BAIA", "DATA",	"TRATOS", "CONSUMO"};

	public static void exportarArquivoMortalidade(InfoExpVOST infoExp, List<BaiaVOST> baias, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_MORT));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "MORTALIDADE.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		for (BaiaVOST b : baias) {
			if (b.getMortalidades().size() > 0) {
				for (MortalidadeVOST m : b.getMortalidades()) {
					buffer.newLine();
					buffer.write("" + b.getBaia());
					buffer.write(";");
					buffer.write("" + b.getSexo());
					buffer.write(";");
					buffer.write("" + b.getTrat1());
					buffer.write(";");
					buffer.write("" + b.getTrat2());
					buffer.write(";");
					buffer.write("" + m.getBrinco());
					buffer.write(";");
					buffer.write("" + m.getPesoMorto());
					buffer.write(";");
					buffer.write("" + m.getCausa());
					buffer.write(";");
					buffer.write("" + m.getFase());
					buffer.write(";");
				}
			}

		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}

	public static void exportarArquivoMedicados(InfoExpVOST infoExp, List<BaiaVOST> baias, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_MEDI));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "MEDICADOS.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		for (BaiaVOST b : baias) {
			if (b.getMedicados().size() > 0) {
				for (MedicadosVOST m : b.getMedicados()) {
					buffer.newLine();
					buffer.write("" + b.getBaia());
					buffer.write(";");
					buffer.write("" + b.getSexo());
					buffer.write(";");
					buffer.write("" + b.getTrat1());
					buffer.write(";");
					buffer.write("" + b.getTrat2());
					buffer.write(";");
					buffer.write("" + b.getBaia());
					buffer.write(";");
					buffer.write("" + m.getBrinco());
					buffer.write(";");
					buffer.write("" + m.getMedicamento());
					buffer.write(";");
					buffer.write("" + m.getCausa());
					buffer.write(";");
					buffer.write("" + m.getDose1());
					buffer.write(";");
					buffer.write("" + m.getDose2());
					buffer.write(";");
					buffer.write("" + m.getDose3());
					buffer.write(";");
				}
			}

		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}

}
