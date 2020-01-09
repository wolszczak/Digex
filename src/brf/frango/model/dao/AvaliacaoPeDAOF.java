package brf.frango.model.dao;

import brf.frango.model.vo.AbateVOF;
import brf.frango.model.vo.AvaliacaoPeVOF;
import brf.frango.model.vo.InfoExpVOF;
import brf.frango.model.vo.LacreAnilhaVOF;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvaliacaoPeDAOF {
    public static final String[] HEADER_AVALIACAO = {"DIGITA","PROTOCOLO","LOCAL","LOCAL1","AVIARIO","PROTOCO","NUCAMA","AREA",
                                                     "AREA1","NBOX","DALOJA","DFIM","IDAPEP","IDEQUA","IDAPE1","IDAPE2","IDAPE3",
                                                     "IDAPE4","IDAPE5","IDAPE6","IDAPE7","IDAPE8","DABATE1","DABATE2","DABATE3",
                                                     "ABATE","BOX","NASA","LACRE","PE","ESCORE"};
    
    public static void exportarArquivo(InfoExpVOF infoExp, List<AbateVOF> abates, String localArquivo) throws IOException {
        List<String> header = new ArrayList<>();
        header.addAll(Arrays.asList(HEADER_AVALIACAO));
        switch (infoExp.getNrFases()) {
            case 1:
                header.remove("IDAPE2");
            case 2: 
                header.remove("IDAPE3");
            case 3:    
                header.remove("IDAPE4");
            case 4:
                header.remove("IDAPE5");
            case 5: 
                header.remove("IDAPE6");
            case 6:
                header.remove("IDAPE7");
            case 7:
                header.remove("IDAPE8");
            case 8:
            default:
                break;
        }
        switch (infoExp.getNrAbate()) {
            case 0:
                header.remove("DABATE1");
            case 1:
                header.remove("DABATE2");
            case 2: 
                header.remove("DABATE3");
            case 3:
            default:
                break;
        }
        BufferedWriter buffer;
        buffer = new BufferedWriter(new FileWriter(localArquivo+"F_peh.csv"));
        for (String h : header) {
             buffer.write(h);
             if (!h.equals("ESCORE")) {
                buffer.write(";"); 
             }                 
        }
        buffer.newLine();
        for (AbateVOF ab : abates) {
            for (LacreAnilhaVOF lacreAnilha: ab.getLacreAnilha()) {
                if (lacreAnilha.getBaia() == 0) {
                    continue;
                }
                buffer.write(""+infoExp.getIdDigitador());
                buffer.write(";");
                buffer.write(""+infoExp.getProtocolo());
                buffer.write(";");
                buffer.write(""+infoExp.getLocal());
                buffer.write(";");
                buffer.write(""+infoExp.getLocal1());
                buffer.write(";");
                buffer.write(""+infoExp.getAviario());
                buffer.write(";");
                buffer.write(""+infoExp.getTeste());
                buffer.write(";");
                buffer.write(""+infoExp.getCama());
                buffer.write(";");
                buffer.write(""+infoExp.getTipo());
                buffer.write(";");
                buffer.write(""+infoExp.getTipo1());
                buffer.write(";");
                buffer.write(""+infoExp.getNrBaias());
                buffer.write(";");
                buffer.write(""+infoExp.getInicioExp());
                buffer.write(";");
                buffer.write(""+infoExp.getFimExp());
                buffer.write(";");
                buffer.write(""+infoExp.getIdadeAloj());
                buffer.write(";");
                buffer.write(""+infoExp.getEqualizacao());
                buffer.write(";");
                int idadeAnterior = 0;
                for (Integer idade : infoExp.getIdadeFase()) {
                    if (idade != idadeAnterior ) {
                        buffer.write(idade.toString());
                        buffer.write(";");
                    }
                    idadeAnterior = idade;
                }
                String abateAnterior = "";
                for (String abate : infoExp.getDataAbate()) {
                    if (!abate.equals(abateAnterior)) {
                        buffer.write(""+abate);
                        buffer.write(";");
                    }
                    abateAnterior = abate;
                } 
                buffer.write(""+ab.getAvaliacaoPe().get(0).getAbate());
                buffer.write(";");
                buffer.write(""+lacreAnilha.getBaia());
                buffer.write(";");
                buffer.write(""+lacreAnilha.getNasa());
                buffer.write(";");
                buffer.write(""+lacreAnilha.getLacre());
                buffer.write(";");
                
                for (AvaliacaoPeVOF aval: ab.getAvaliacaoPe()) {
                    if (aval.getLacre() == lacreAnilha.getLacre()) {
                        buffer.write(""+aval.getPesoPe());
                        buffer.write(";");
                        buffer.write(""+aval.getEscore());
                        break;
                    }
                }
                buffer.newLine();
            }
        }
        buffer.close();
        System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
    }
}
