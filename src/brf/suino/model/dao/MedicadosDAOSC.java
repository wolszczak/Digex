package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.ConsumoVOSC;
import brf.suino.model.vo.InfoExpVOSC;
import brf.suino.model.vo.MedicadosVOSC;
import brf.suino.model.vo.RmeVOSC;

public class MedicadosDAOSC {
	public static final String[] HEADER_CONSUMO = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATA", "MEDICA",	"CAUSA",	"DOSE1",	"DOSE2",	"DOSE3" };

	public static void exportarArquivo(InfoExpVOSC infoExp, List<MedicadosVOSC> medicados, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_CONSUMO));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "MEDICADOS.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}
		buffer.newLine();
			for (MedicadosVOSC m : medicados) {
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
				buffer.newLine();
			}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}
}
