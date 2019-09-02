package brf.peru.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import brf.frango.model.vo.BalancaVOF;
import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.BaiaAmostradosVOP;
import brf.peru.model.vo.CamaraVOP;
import brf.peru.model.vo.ConeVOP;
import brf.peru.model.vo.InfoExpVOP;

public class AbateDAOP {
	private static final String[] HEADER_ABATE = { "IDADE", "BOX", "NASA", "CAMARA", "CONE", "PVIVO", "PABATE", "ESCGORD", "ESCCARC",
			"PGORDU", "PPEITO", "SOBCOX" };
	private static List<BaiaAmostradosVOP> amostrados;
	private static List<CamaraVOP> camaras;
	private static List<ConeVOP> cones;
	private static BaiaAmostradosVOP amostrado;
	private static CamaraVOP camara;
	private static ConeVOP cone;

	public static void exportarArquivo(InfoExpVOP infoExpVOP, List<AbateVOP> abates, String localArquivo) {
		try {
			amostrados = new ArrayList<>();
			camaras = new ArrayList<>();
			cones = new ArrayList<>();
			amostrado = new BaiaAmostradosVOP();
			camara = new CamaraVOP();
			cone = new ConeVOP();
			List<String> header = new ArrayList<>();
			header.addAll(Arrays.asList(HEADER_ABATE));

			for (AbateVOP abate : abates) {
				amostrados.addAll(abate.getBaiaAmostrados());
				camaras.addAll(abate.getCamaras());
				cones.addAll(abate.getCones());
			}

			amostrados.sort((BaiaAmostradosVOP b1, BaiaAmostradosVOP b2) -> {
				if (b1.getNasa() > b2.getNasa())
					return 1;
				if (b1.getNasa() < b2.getNasa())
					return -1;
				return 0;
			});
			camaras.sort((CamaraVOP c1, CamaraVOP c2) -> {
				if (c1.getNasa() > c2.getNasa())
					return 1;
				if (c1.getNasa() < c2.getNasa())
					return -1;
				return 0;
			});
			cones.sort((ConeVOP c1, ConeVOP c2) -> {
				if (c1.getNasa() > c2.getNasa())
					return 1;
				if (c1.getNasa() < c2.getNasa())
					return -1;
				return 0;
			});

			BufferedWriter buffer;
			buffer = new BufferedWriter(new FileWriter(localArquivo + "FRIGO.csv"));
			for (String h : header) {
				buffer.write(h);
				if (!h.equals("PESSOAL")) {
					buffer.write(";");
				}
			}
			buffer.newLine();
			boolean keyCamara = false;
			boolean keyCone = false;
			for (int i = 0; i < amostrados.size(); i++) {
				buffer.write("" + amostrados.get(i).getIdade());
				buffer.write(";");
				buffer.write("" + amostrados.get(i).getNrBaia());
				buffer.write(";");
				buffer.write("" + amostrados.get(i).getNasa());
				buffer.write(";");

				// VERIFICA SE O ANIMAL FOI AVALIADO NO FRIGORÍFICO E PEGA O NUMERO DO INDICE
				// DELE NA LISTA DE CAMARAS
				for (int j = 0; j < camaras.size(); j++) {
					if (camaras.get(j).getNasa() == amostrados.get(i).getNasa()) {
						keyCamara = true;
						camara = new CamaraVOP(camaras.get(j).getAbate(), camaras.get(j).getCamara(), camaras.get(j).getNasa(),
								camaras.get(j).getpCarcaca(), camaras.get(j).getEscGordura(), camaras.get(j).getEscCarcaca());
						camaras.remove(j);
						break;
					}
				}

				// VERIFICA SE O ANIMAL FOI AVALIADO NO FRIGORÍFICO E PEGA O NUMERO DO INDICE
				// DELE NA LISTA DE CONES
				for (int k = 0; k < cones.size(); k++) {
					if (cones.get(k).getNasa() == amostrados.get(i).getNasa()) {
						keyCone = true;
						cone = new ConeVOP(cones.get(k).getAbate(), cones.get(k).getCamara(), cones.get(k).getNcone(),
								cones.get(k).getNasa(), cones.get(k).getpGordura(), cones.get(k).getpPeito1(),
								cones.get(k).getPesoSobreCoxa());
						cones.remove(k);
						break;
					}
				}

				// TERMINA DE MONTAR O ARQUIVO CONFORME AS AVALIACOES DO ANIMAL
				if (keyCamara && keyCone) {
					buffer.write("" + camara.getCamara());
					buffer.write(";");
					buffer.write("" + cone.getNcone());
					buffer.write(";");
					buffer.write("" + amostrados.get(i).getPeso());
					buffer.write(";");
					buffer.write("" + camara.getpCarcaca());
					buffer.write(";");
					buffer.write("" + camara.getEscGordura());
					buffer.write(";");
					buffer.write("" + camara.getEscCarcaca());
					buffer.write(";");
					buffer.write("" + cone.getpGordura());
					buffer.write(";");
					buffer.write("" + cone.getpPeito1());
					buffer.write(";");
					buffer.write("" + cone.getPesoSobreCoxa());
					buffer.write(";");
				} else if (keyCamara && !keyCone) {
					buffer.write("" + camara.getCamara());
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("" + amostrados.get(i).getPeso());
					buffer.write(";");
					buffer.write("" + camara.getpCarcaca());
					buffer.write(";");
					buffer.write("" + camara.getEscGordura());
					buffer.write(";");
					buffer.write("" + camara.getEscCarcaca());
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
				} else if (!keyCamara && keyCone) {
					buffer.write("");
					buffer.write(";");
					buffer.write("" + cone.getNcone());
					buffer.write(";");
					buffer.write("" + amostrados.get(i).getPeso());
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("");
					buffer.write(";");
					buffer.write("" + cone.getpGordura());
					buffer.write(";");
					buffer.write("" + cone.getpPeito1());
					buffer.write(";");
					buffer.write("" + cone.getPesoSobreCoxa());
					buffer.write(";");
				}
				buffer.newLine();
				
				camara = new CamaraVOP();
				cone = new ConeVOP();
			}

			buffer.close();
			System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
