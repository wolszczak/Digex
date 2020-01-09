package brf.frango.model.bo;

import brf.frango.controller.ControllerF;
import brf.frango.model.vo.DesempenhoVOF;
import brf.frango.model.vo.PesagemVOF;
import brf.frango.model.vo.RmeVOF;
import java.util.List;

public class DesempenhoBOF {
    private final ControllerF controller;
    
    public DesempenhoBOF(ControllerF controller) {
        this.controller = controller;
    }
    
    public String verificaCabecalho(int baia, int sexo, int lado, int nAlojados) {
        String msg = "";
        if (baia == 0) {
            msg = msg.concat("- Baia igual à 0\n");
        }
        if (sexo != 1 && sexo != 2) {
            msg = msg.concat("- Sexo diferente de 1 e 2\n");
        }
        if (lado > 2) {
            msg = msg.concat("- Lado diferente de 0, 1 e 2\n");
        }
        if (nAlojados == 0) {
            msg = msg.concat("- Número de aves alojadas igual à 0");
        }
        return msg;
    }
    
    public boolean isBaiaDigitada(int baia) {
        for(DesempenhoVOF desempenho: controller.getModel().getExperimentoVO().getDesempenho()) {
            if (baia == desempenho.getBaia()) {
                return true;
            }            
        }
        return false;
    }
    
    public void excluirBaia(int baia) {
        DesempenhoVOF baiaRemocao = null;
        for(DesempenhoVOF desempenho: controller.getModel().getExperimentoVO().getDesempenho()) {
            if (baia == desempenho.getBaia()) {
                baiaRemocao = desempenho;
                break;
            }            
        }
        controller.getModel().getExperimentoVO().getDesempenho().remove(baiaRemocao);
        controller.getModel().getModelStateDAO().saveModelState(false);
    }
    
    public String verificaRME(List<RmeVOF> rme, int idadeR, int idadeM, int idadeE, int nrAlojados,
                              int nMortos, int nElim, int pMortos, int pElim, int fornecida, int sobra) {
        String msg = "";
        int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(
                controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size()-1);
        if (idadeR > idadeFim || idadeM > idadeFim || idadeM > idadeFim) {
            msg = msg.concat("- Idade fora do período do experimento\n");
        }
        if (idadeR == 0 &&  (fornecida != 0 || sobra != 0 )) {
            msg = msg.concat("- Entrada/Saída de ração em idade igual à 0\n");
        }
        if (idadeM == 0 && pMortos != 0) {
            msg = msg.concat("- Peso do(s) morto(s) em idade igual à 0\n");
        }
        if (idadeE == 0 && pElim != 0) {
            msg = msg.concat("- Peso do(s) eliminado(s) em idade igual à 0\n");
        }
        if (nMortos == 0 && pMortos != 0) {
            msg = msg.concat("- Número de mortos igual à 0\n");
        }
        if (nElim == 0 && pElim != 0) {
            msg = msg.concat("- Número de eliminados igual à 0\n");
        }
        if (idadeR != 0 && fornecida == 0 && sobra == 0) {
            msg = msg.concat("- Entrada/Saída de ração igual à 0\n");
        }
        if (pMortos == 0 && (idadeM != 0 || nMortos != 0)) {
            msg = msg.concat("- Peso do(s) morto(s) igual à 0\n");
        }
        if (pElim == 0 && (idadeE != 0 || nElim != 0)) {
            msg = msg.concat("- Peso do(s) eliminado(s) igual à 0\n");
        }     
        int totalMortosEliminados = nMortos + nElim;
        for (RmeVOF histRme: rme) {
            totalMortosEliminados += histRme.getNrMortos() + histRme.getNrEliminados();
        }
        if (totalMortosEliminados > nrAlojados) {
            msg = msg.concat("- Número de mortos e eliminados maior que o número de alojados\n");
        }
        return msg;
    }
    
    public String verificaPesagem(List<RmeVOF> rme, List<PesagemVOF> pesagem, int nrAlojados, int idadeP, int nrPesados, 
                                  int nrAmostrados, int nrErros, int nrAleijados, int tara, int peso1, int peso2,
                                  int pAmostrados,  int pErros, int pAleijados) {
        String msg = "";
        int idadeFim = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(
                controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().size()-1);
        if (idadeP > idadeFim + 1) {
            msg = msg.concat("- Idade fora do período do experimento\n");
        }
        if (idadeP == 0 &&  (peso1 != 0 || peso2 != 0 || pAmostrados != 0 || pErros != 0 || pAleijados != 0)) {
            msg = msg.concat("- Peso(s) digitados em idade igual à 0\n");
        }
        if ((idadeP != 0 && peso1 == 0 && peso2 == 0) ||
            (nrPesados != 0 && peso1 == 0 && peso2 == 0)) {
            msg = msg.concat("- Peso(s) igual à 0\n");
        }
        if (nrPesados == 0 && (idadeP != 0 || peso1 != 0 || peso2 != 0)) {
            msg = msg.concat("- Número de aves pesadas igual à 0\n");
        }
        if (nrAmostrados == 0 && pAmostrados != 0) {
            msg = msg.concat("- Número de amostrados igual à 0\n");
        }
        if (nrErros == 0 && pErros != 0) {
            msg = msg.concat("- Número de erros igual à 0\n");
        }
        if (nrAleijados == 0 && pAleijados != 0) {
            msg = msg.concat("- Número de aleijados igual à 0\n");
        }
        if (nrAmostrados != 0 && pAmostrados == 0) {
            msg = msg.concat("- Peso do(s) amostrado(s) igual à 0\n");
        }
        if (nrErros != 0 && pErros == 0) {
            msg = msg.concat("- Peso do(s) erro(s) igual à 0\n");
        }
        if (nrAleijados != 0 && pAleijados == 0) {
            msg = msg.concat("- Peso do(s) aleijado(s) igual à 0\n");
        }     
        
        int totalMortosEliminados = 0;
        for (RmeVOF histRme: rme) {
            if (histRme.getIdadeMortos()<= idadeP) {
                totalMortosEliminados += histRme.getNrMortos();
            }
            if (histRme.getIdadeEliminados()<= idadeP) {
                totalMortosEliminados += histRme.getNrEliminados();
            }
        }
        int idadeRetiraErro = 0;
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro1()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(0);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro2()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(1);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro3()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(2);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro4()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(3);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro5()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(4);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro6()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(5);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro7()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(6);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isErro8()) {
            idadeRetiraErro = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(7);
        }
        int idadeRetiraAleijado = 0;
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado1()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(0);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado2()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(1);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado3()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(2);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado4()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(3);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado5()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(4);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado6()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(5);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado7()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(6);
        }
        if (controller.getModel().getExperimentoVO().getInfoExp().isAleijado8()) {
            idadeRetiraAleijado = controller.getModel().getExperimentoVO().getInfoExp().getIdadeFase().get(7);
        }
        System.out.println("idadeRetiraErro = " + idadeRetiraErro);
        System.out.println("idadeRetiraAleijado = " + idadeRetiraAleijado);
        
        int totalAmostrados = 0;
        for (PesagemVOF histPesagem: pesagem) {
            totalAmostrados += histPesagem.getNrAmostrados();
        }
        int totalAleijados = 0;
        if (idadeP <= idadeRetiraAleijado) {
            totalAleijados = nrAleijados;
        }
        for (PesagemVOF histPesagem: pesagem) {
            if (histPesagem.getIdade() <= idadeRetiraAleijado) {
                totalAleijados += histPesagem.getNrAleijados();
            }
        }
        int totalErros = 0;
        if (idadeP <= idadeRetiraErro) {
            totalErros = nrErros;
        }
        for (PesagemVOF histPesagem: pesagem) {
            if (histPesagem.getIdade() <= idadeRetiraErro) {
                totalErros += histPesagem.getNrErros();
            }
        }
        
        int nrAnimais;
        nrAnimais = nrAlojados - totalMortosEliminados - totalAmostrados - totalErros - totalAleijados;
        if (idadeP <= idadeRetiraErro) {
            if (nrAnimais != nrPesados && idadeP != 0) {
                msg = msg.concat("- Número de animais não está correto\n");
            } 
        } else {
            if (nrAnimais != (nrPesados + nrErros) && idadeP != 0) {
                msg = msg.concat("- Número de animais não está correto\n");
            }
        }
        System.out.println("Total ME = " + totalMortosEliminados);
        System.out.println("Total Amostrados = " + totalAmostrados);
        System.out.println("Total Erros = " + totalErros);
        System.out.println("Total Aleijados = " + totalAleijados);
        System.out.println("nrAnimais esperado = " + nrAnimais);
        return msg;
    }
}