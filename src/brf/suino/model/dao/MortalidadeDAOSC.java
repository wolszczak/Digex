package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.InfoExpVOSC;
import brf.suino.model.vo.MortalidadeVOSC;
import brf.suino.model.vo.RmeVOSC;

public class MortalidadeDAOSC {
	public static final String[] HEADER_CONSUMO = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATAMO", "BRINCO", "PMORTO", "CAUSA", "FASE" };

	public static void exportarArquivo(InfoExpVOSC infoExp, List<MortalidadeVOSC> mortalidade, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_CONSUMO));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "MORTALIDADE.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		buffer.newLine();
		for (MortalidadeVOSC m : mortalidade) {
			buffer.write("" + m.getBaia());
			buffer.write(";");
			buffer.write("" + m.getSexo());
			buffer.write(";");
			buffer.write("" + m.getTrat1());
			buffer.write(";");
			buffer.write("" + m.getTrat2());
			buffer.write(";");
			buffer.write("" + m.getData());
			buffer.write(";");
			buffer.write("" + m.getBrinco());
			buffer.write(";");
			buffer.write("" + m.getPeso());
			buffer.write(";");
			buffer.write("" + m.getCausa());
			buffer.write(";");
			buffer.write("" + m.getFase());
			buffer.write(";");
			buffer.newLine();
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}
}
