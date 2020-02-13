package brf.suino.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brf.suino.model.vo.BaiaVOST;
import brf.suino.model.vo.ConsumoTratosVOST;
import brf.suino.model.vo.InfoExpVOST;
import brf.suino.model.vo.MedicadosVOST;
import brf.suino.model.vo.MortalidadeVOST;
import brf.suino.model.vo.RmeLivreVOST;
import brf.suino.model.vo.RmeTratosVOST;
import brf.util.Utils;

public class BaiaDAOST {
	public static final String[] HEADER_MORT = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATAMO", "BRINCO", "PMORTO", "CAUSA", "FASE" };
	public static final String[] HEADER_MEDI = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATAMO", "BRINCO", "MEDICACAO", "CAUSA", "DOSE1",
			"DOSE2", "DOSE3" };
	public static final String[] HEADER_CONSL = { "BAIA", "SEXO", "TRAT1", "TRAT2", "DATA", "RACAO" };
	public static final String[] HEADER_CONST = { "BAIA", "DATA", "TRATOS", "CONSUMO" };

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
			if (b.getMortalidades() != null) {
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
						buffer.write("" + m.getData());
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
			if (b.getMedicados() != null) {
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
						buffer.write("" + m.getData());
						buffer.write(";");
						buffer.write("" + m.getBrinco());
						buffer.write(";");
						buffer.write("" + m.getMedicamento());
						buffer.write(";");
						buffer.write("" + m.getCausa());
						buffer.write(";");
//						String[] split = String.valueOf(m.getDose1()).split("");
						
						buffer.write("" + m.getDose1());
						buffer.write(";");
						buffer.write("" + m.getDose2());
						buffer.write(";");
						buffer.write("" + m.getDose3());
						buffer.write(";");
					}
				}
			}
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}

	public static void exportarArquivoConsumoLivre(InfoExpVOST infoExp, List<BaiaVOST> baias, String localArquivo) throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_CONSL));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "CONSUMOLIVRE.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}

		for (BaiaVOST b : baias) {
			if (b.getConsumos() != null) {
				if (b.getConsumos().getRme().size() > 0) {
					for (RmeLivreVOST rme : b.getConsumos().getRme()) {
						buffer.newLine();
						buffer.write("" + b.getBaia());
						buffer.write(";");
						buffer.write("" + b.getSexo());
						buffer.write(";");
						buffer.write("" + b.getTrat1());
						buffer.write(";");
						buffer.write("" + b.getTrat2());
						buffer.write(";");
						buffer.write("" + rme.getDataRacao());
						buffer.write(";");
						if (rme.getFornecida() != 0) {
							buffer.write("" + rme.getFornecida());
						} else {
							buffer.write("" + rme.getSobra() * -1);
						}
						buffer.write(";");
					}
				}
			}
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}

	public static void exportarArquivoConsumoTratos(InfoExpVOST infoExp, List<ConsumoTratosVOST> tratos, String localArquivo)
			throws IOException {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_CONST));

		BufferedWriter buffer;
		buffer = new BufferedWriter(new FileWriter(localArquivo + "CONSUMOTRATOS.csv"));
		for (String h : header) {
			buffer.write(h);
			buffer.write(";");
		}

		for (ConsumoTratosVOST c : tratos) {
			if (c.getConsumo() != null) {
				if (c.getConsumo().size() > 0) {
					for (RmeTratosVOST rme : c.getConsumo()) {
						buffer.newLine();
						buffer.write("" + rme.getBaia());
						buffer.write(";");
						buffer.write("" + c.getData());
						buffer.write(";");
						buffer.write("" + c.getTratos());
						buffer.write(";");
						buffer.write("" + rme.getConsumo());
						buffer.write(";");
					}
				}
			}
		}
		buffer.close();
		System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
	}

}
