package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.InfoExpVOSC;
import brf.suino.model.vo.RmeVOSC;

public class ConsumoDAOSC {
	public static final String[] HEADER_CONSUMO = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATA", "RACAO", "PESO", "NANIM" };

	public static void exportarArquivo(InfoExpVOSC infoExp, List<ConsumoVOSC> consumo, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_CONSUMO));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "CONSUMO.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		buffer.newLine();
		for (ConsumoVOSC c : consumo) {
			for (RmeVOSC r : c.getRme()) {
				buffer.write("" + c.getBaia());
				buffer.write(";");
				buffer.write("" + c.getSexo());
				buffer.write(";");
				buffer.write("" + c.getTrat1());
				buffer.write(";");
				buffer.write("" + c.getTrat2());
				buffer.write(";");
				buffer.write("" + r.getDataRacao());
				buffer.write(";");
				buffer.write("" + r.getFornecida());
				buffer.write(";");
				buffer.write("" + r.getPeso());
				buffer.write(";");
				buffer.write("" + r.getNumAnimais());
				buffer.write(";");
				buffer.newLine();
			}
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}
}
