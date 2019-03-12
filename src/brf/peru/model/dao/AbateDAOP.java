package brf.peru.model.dao;

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
	private static final String[] HEADER_ABATE = { "IDADE", "BOX", "NASA", "CAMARA", "CONE", "PVIVO", "PABATE",
			"ESCGORD", "ESCCARC", "PGORDU", "PPEITO", "SOBCOX" };
	private static List<BaiaAmostradosVOP> amostrados;
	private static List<CamaraVOP> camaras;
	private static List<ConeVOP> cones;
	
	public static void exportarArquivo(InfoExpVOP infoExpVOP, List<AbateVOP> abates, String caminhoArquivo) {
		List<String> header = new ArrayList<>();
		header.addAll(Arrays.asList(HEADER_ABATE));
		
		for(AbateVOP abate : abates) {
			amostrados.addAll(abate.getBaiaAmostrados());
			camaras.addAll(abate.getCamaras());
			cones.addAll(abate.getCones());
		}
		
		amostrados.sort((BaiaAmostradosVOP b1, BaiaAmostradosVOP b2) -> {
            if (b1.getNasa()> b2.getNasa())
                return 1;
            if (b1.getNasa()< b2.getNasa())
                return -1;
            return 0;
        });
		camaras.sort((CamaraVOP c1, CamaraVOP c2) -> {
            if (c1.getNasa()> c2.getNasa())
                return 1;
            if (c1.getNasa()< c2.getNasa())
                return -1;
            return 0;
        });
		cones.sort((ConeVOP c1, ConeVOP c2) -> {
            if (c1.getNasa()> c2.getNasa())
                return 1;
            if (c1.getNasa()< c2.getNasa())
                return -1;
            return 0;
        });
		
        
        
        
        
	}

}
