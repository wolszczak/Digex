package brf.frango.model.dao;

import brf.frango.model.vo.DesempenhoVOF;
import brf.frango.model.vo.InfoExpVOF;
import brf.frango.model.vo.PesagemVOF;
import brf.frango.model.vo.RmeVOF;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesempenhoDAOF {
    public static final String[] HEADER_DESEMPENHO = {"DIGITA","PROTOCOLO","LOCAL","LOCAL1","AVIARIO","PROTOCO","NUCAMA","AREA",
                                                      "AREA1","NBOX","DALOJA","DFIM","IDAPEP","IDEQUA","IDAPE1","IDAPE2","IDAPE3",
                                                      "IDAPE4","IDAPE5","IDAPE6","IDAPE7","IDAPE8","DABATE1","DABATE2","DABATE3",
                                                      "BOX","SEXO","LADO","TRAT1","TRAT2","NALOJ","IDADER","FORNECIDA","SOBRA",
                                                      "IDADEM","NRM","PESOM","IDADEEL","NREL","PESOEL","IDADEP","NRP","TARA",
                                                      "PESO1","PESO2","NRA","PESOA","NRER","PESOER","NRAL","PESOAL"};
    
    public static void exportarArquivo(InfoExpVOF infoExp, List<DesempenhoVOF> desempenho, String localArquivo) throws IOException {
        List<String> header = new ArrayList<>();
        header.addAll(Arrays.asList(HEADER_DESEMPENHO));
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
        buffer = new BufferedWriter(new FileWriter(localArquivo+"BAIA.csv"));
        for (String h : header) {
             buffer.write(h);
             if (!h.equals("PESOAL")) {
                buffer.write(";"); 
             }                 
        }
        buffer.newLine();            
        for (DesempenhoVOF d : desempenho) {
            for (RmeVOF r : d.getRme()) {
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
                buffer.write(""+d.getBaia());
                buffer.write(";");
                buffer.write(""+d.getSexo());
                buffer.write(";");
                buffer.write(""+d.getLado());
                buffer.write(";");
                buffer.write(""+d.getTrat1());
                buffer.write(";");
                buffer.write(""+d.getTrat2());
                buffer.write(";");
                buffer.write(""+d.getNrAlojados());
                buffer.write(";");
                buffer.write(""+r.getIdadeRacao());
                buffer.write(";");
                buffer.write(""+r.getFornecida());
                buffer.write(";");
                buffer.write(""+r.getSobra());
                buffer.write(";");
                buffer.write(""+r.getIdadeMortos());
                buffer.write(";");
                buffer.write(""+r.getNrMortos());
                buffer.write(";");
                buffer.write(""+r.getPesoMortos());
                buffer.write(";");
                buffer.write(""+r.getIdadeEliminados());
                buffer.write(";");
                buffer.write(""+r.getNrEliminados());
                buffer.write(";");
                buffer.write(""+r.getPesoEliminados());
                buffer.write(";");
                buffer.write("0;0;0;0;0;0;0;0;0;0;0");
                buffer.newLine();
            }
            for (PesagemVOF p : d.getPesagem()) {
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
                for (String abate : infoExp.getDataAbate()) {
                    buffer.write(""+abate);
                    buffer.write(";");
                }
                buffer.write(""+d.getBaia());
                buffer.write(";");
                buffer.write(""+d.getSexo());
                buffer.write(";");
                buffer.write(""+d.getLado());
                buffer.write(";");
                buffer.write(""+d.getTrat1());
                buffer.write(";");
                buffer.write(""+d.getTrat2());
                buffer.write(";");
                buffer.write(""+d.getNrAlojados());
                buffer.write(";");
                buffer.write("0;0;0;0;0;0;0;0;0;");
                buffer.write(""+p.getIdade());
                buffer.write(";");
                buffer.write(""+p.getNrAnimais());
                buffer.write(";");
                buffer.write(""+p.getTara());
                buffer.write(";");
                buffer.write(""+p.getPesoAnimais1());
                buffer.write(";");
                buffer.write(""+p.getPesoAnimais2());
                buffer.write(";");
                buffer.write(""+p.getNrAmostrados());
                buffer.write(";");
                buffer.write(""+p.getPesoAmostrados());
                buffer.write(";");
                buffer.write(""+p.getNrErros());
                buffer.write(";");
                buffer.write(""+p.getPesoErros());
                buffer.write(";");
                buffer.write(""+p.getNrAleijados());
                buffer.write(";");
                buffer.write(""+p.getPesoAleijados());
                buffer.newLine();
            }
        }    
        buffer.close();
        System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
    }
}
