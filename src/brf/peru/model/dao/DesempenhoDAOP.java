package brf.peru.model.dao;

import brf.peru.model.vo.DesempenhoVOP;
import brf.peru.model.vo.InfoExpVOP;
import brf.peru.model.vo.RmeVOP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesempenhoDAOP {
    public static final String[] HEADER_DESEMPENHO = {"DIGITA","PROTOCOLO","LOCAL","LOCAL1","AVIARIO","PROTOCO","NUCAMA","AREA",
                                                      "AREA1","NBOX","DALOJA","DFIM","IDAPEP","IDEQUA","IDAPE1","IDAPE2","IDAPE3",
                                                      "IDAPE4","IDAPE5","IDAPE6","IDAPE7","IDAPE8","DABATE1","DABATE2","DABATE3",
                                                      "BOX","SEXO","LADO","TRAT1","NALOJ","IDADER","FORNECIDA","SOBRA",
                                                      "IDADEM","NRM","PESOM","IDADEEL","NREL","PESOEL","IDADEER","NRER",
                                                      "PESOER","IDADEA","NRA","PESOA","IDADEP","NRP","PESOP"};
    
    public static void exportarArquivo(InfoExpVOP infoExp, List<DesempenhoVOP> desempenho, String localArquivo) throws IOException {
        List<String> header = new ArrayList<>();
        header.addAll(Arrays.asList(HEADER_DESEMPENHO));
        switch (infoExp.getNrFases()){
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
        buffer = new BufferedWriter(new FileWriter(localArquivo + "BAIA.csv"));
        for (String h : header) {
            buffer.write(h);
            if (!h.equals("PESSOAL")) {
                buffer.write(";");
            }
        }
        buffer.newLine();
        for (DesempenhoVOP d : desempenho) {
            for(RmeVOP rme : d.getConsumo()) {
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
                 buffer.write(""+d.getTrata());
                 buffer.write(";");
                 buffer.write(""+d.getNrAlojados());
                 buffer.write(";");
                 buffer.write(""+rme.getIdadeRacao());
                 buffer.write(";");
                 buffer.write(""+rme.getFornecida());
                 buffer.write(";");
                 buffer.write(""+rme.getSobra());
                 buffer.write(";");
                 buffer.write(""+rme.getMortos().getIdade());
                 buffer.write(";");
                 buffer.write(""+rme.getMortos().getQuantidade());
                 buffer.write(";");
                 buffer.write(""+rme.getMortos().getPeso());
                 buffer.write(";");
                 buffer.write(""+rme.getEliminados().getIdade());
                 buffer.write(";");
                 buffer.write(""+rme.getEliminados().getQuantidade());
                 buffer.write(";");
                 buffer.write(""+rme.getEliminados().getPeso());
                 buffer.write(";");
                 buffer.write(""+rme.getErros().getIdade());
                 buffer.write(";");
                 buffer.write(""+rme.getErros().getQuantidade());
                 buffer.write(";");
                 buffer.write(""+rme.getErros().getPeso());
                 buffer.write(";");
                 buffer.write(""+rme.getAmostrados().getIdade());
                 buffer.write(";");
                 buffer.write(""+rme.getAmostrados().getQuantidade());
                 buffer.write(";");
                 buffer.write(""+rme.getAmostrados().getPeso());
                 buffer.write(";");
                 buffer.write(""+rme.getPesados().getIdade());
                 buffer.write(";");
                 buffer.write(""+rme.getPesados().getQuantidade());
                 buffer.write(";");
                 buffer.write(""+rme.getPesados().getPeso());
                 buffer.write(";");
                 buffer.newLine();
            }
        }
        buffer.close();
        System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
    }
}
