/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brf.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Lisboa
 * Verificar tipo de dados digitados se estão corretos
 */
public class VerifyRules {
      
    public static boolean verifyData(String data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        boolean retorno = true;
        try {
            formato.setLenient(false);
            formato.parse(data);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Verifique o formato da Data", "Formato Incorreto", JOptionPane.WARNING_MESSAGE);
            retorno = false;
        }
        return retorno;
    }
}
