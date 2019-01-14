package brf.frango.model.dao;

import brf.frango.model.vo.AbateVOF;
import brf.frango.model.vo.BaiaAnilhaVOF;
import brf.frango.model.vo.BalancaVOF;
import brf.frango.model.vo.InfoExpVOF;
import brf.frango.model.vo.RendimentoVOF;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RendimentoDAOF {
    public static final String[] HEADER_RENDIMENTO = {"DIGITA","PROTOCOLO","LOCAL","LOCAL1","AVIARIO","PROTOCO","NUCAMA","AREA",
                                                      "AREA1","NBOX","DALOJA","DFIM","IDAPEP","IDEQUA","IDAPE1","IDAPE2","IDAPE3",
                                                      "IDAPE4","IDAPE5","IDAPE6","IDAPE7","IDAPE8","DABATE1","DABATE2","DABATE3",
                                                      "BOX","SEXO","LADO","TRAT1","TRAT2","NASA","PVIVO","ABATE","GDIR","GESQ",
                                                      "PABATE","PGORDIR","PGORESQ","PASA","GORPEITO","PPEITO","PAD","PAE",
                                                      "ESTPDIR","ESTPESQ","COXSOB"};
    
    public static void exportarArquivo(InfoExpVOF infoExp, List<AbateVOF> abates, String localArquivo) throws IOException {
        List<String> header = new ArrayList<>();
        header.addAll(Arrays.asList(HEADER_RENDIMENTO));
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
        buffer = new BufferedWriter(new FileWriter(localArquivo+"FRIG.csv"));
        for (String h : header) {
             buffer.write(h);
             if (!h.equals("FDE")) {
                buffer.write(";"); 
             }                 
        }
        buffer.newLine();
        for (AbateVOF ab : abates) {
            for (BalancaVOF balanca: ab.getBalanca()) {
                for (BaiaAnilhaVOF baiaAnilha: ab.getBaiaAnilha()) {
                    int limInferior = 0, limSuperior = 0;
                    if (baiaAnilha.getInicioAnilha() > baiaAnilha.getFimAnilha()) {
                        if (baiaAnilha.getFimAnilha() > 0) {
                            limInferior = baiaAnilha.getFimAnilha();
                            limSuperior = baiaAnilha.getInicioAnilha();
                        } else if (baiaAnilha.getFimAnilha() == 0) {
                            limInferior = baiaAnilha.getInicioAnilha();
                            limSuperior = baiaAnilha.getInicioAnilha();
                        }
                    } else if (baiaAnilha.getInicioAnilha() == baiaAnilha.getFimAnilha()) {
                        limInferior = baiaAnilha.getInicioAnilha();
                        limSuperior = baiaAnilha.getFimAnilha();
                    } else if (baiaAnilha.getInicioAnilha() < baiaAnilha.getFimAnilha()) {
                        if (baiaAnilha.getInicioAnilha() > 0) {
                            limInferior = baiaAnilha.getInicioAnilha();
                            limSuperior = baiaAnilha.getFimAnilha();
                        } else if (baiaAnilha.getInicioAnilha() == 0) {
                            limInferior = baiaAnilha.getFimAnilha();
                            limSuperior = baiaAnilha.getFimAnilha();
                        } 
                    }
                    
                    if (balanca.getAnilha() >= limInferior && balanca.getAnilha() <= limSuperior) {
                        // escreve dados da baia/anilha
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
                        buffer.write(""+baiaAnilha.getBaia());
                        buffer.write(";");
                        buffer.write(""+baiaAnilha.getSexo());
                        buffer.write(";");
                        buffer.write(""+baiaAnilha.getLado());
                        buffer.write(";");
                        buffer.write(""+baiaAnilha.getTrat1());
                        buffer.write(";");
                        buffer.write(""+baiaAnilha.getTrat2());
                        buffer.write(";");
                        buffer.write(""+balanca.getAnilha());
                        buffer.write(";");
                        buffer.write(""+balanca.getpVivo());
                        buffer.write(";");
                        buffer.write(""+ab.getRendimento().get(0).getAbate());
                        buffer.write(";");
                        for (RendimentoVOF rend: ab.getRendimento()) {
                            // escreve dados de rendimento
                            if (rend.getNasa() == balanca.getAnilha()) {
                                buffer.write(""+rend.getgDir());
                                buffer.write(";");
                                buffer.write(""+rend.getgEsq());
                                buffer.write(";");
                                buffer.write(""+rend.getpAbate());
                                buffer.write(";");
                                buffer.write(""+rend.getpGorDir());
                                buffer.write(";");
                                buffer.write(""+rend.getpGorEsq());
                                buffer.write(";");
                                buffer.write(""+rend.getpAsa());
                                buffer.write(";");
                                buffer.write(""+rend.getGorPeito());
                                buffer.write(";");
                                buffer.write(""+rend.getpPeito());
                                buffer.write(";");
                                if (rend.getpPeito() == 0) {
                                    buffer.write("");
                                    buffer.write(";");
                                    buffer.write("");
                                    buffer.write(";");
                                    buffer.write("");
                                    buffer.write(";");
                                    buffer.write("");
                                    buffer.write(";");
                                } else {
                                    buffer.write(""+rend.getPad());
                                    buffer.write(";");
                                    buffer.write(""+rend.getPae());
                                    buffer.write(";");
                                    buffer.write(""+rend.getEstPDir());
                                    buffer.write(";");
                                    buffer.write(""+rend.getEstPEsq());
                                    buffer.write(";");
                                }
                                buffer.write(""+rend.getpCoxSob());
                                break;
                            }
                        }
                        buffer.newLine();
                        break;
                    }
                }
                
            }
        }
        buffer.close();
        System.out.println("Arquivo: " + localArquivo + " salvo com sucesso!");
    }  
}
