package brf.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DTAReader {

    public DTAReader() {
    }

    public static List<String> readFile(String nome) {
        List<String> infoDta = new ArrayList<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(nome));
            String obs = null;
            do {
                obs = buffer.readLine();
                infoDta.add(obs);
            } while (obs != null);
            infoDta.remove(null);
            for (String it : infoDta) {
                System.out.println("it: " + it);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        } catch (IOException ex) {
            Logger.getLogger(DTAReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infoDta;
    }
}
