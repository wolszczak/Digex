package brf.frigoaves.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;

import brf.frango.model.ModelF;
import brf.frango.model.vo.ExperimentoVOF;
import brf.frigoaves.model.ModelFrigoAves;

public class ModelStateAvesDAO {
    private final ModelFrigoAves model;
    private Object obj;
    
    public ModelStateAvesDAO(ModelFrigoAves model) {
        this.model = model;
        obj = null;
    }
    
    public void saveModelState(boolean backup) {
        String localArquivo = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() 
                + "\\DIGEX\\experimentos\\frango\\";
//        String nomeArquivo = model.getExperimentoVO().getInfoExp().getTeste();
//        try {
//            Files.createDirectories(Paths.get(localArquivo));
//            if (Files.exists(Paths.get(localArquivo + nomeArquivo + ".digex")) && backup) {
//                FileInputStream fileIn = new FileInputStream(localArquivo + nomeArquivo + ".digex");
//                ObjectInputStream in = new ObjectInputStream(fileIn);
//                obj = in.readObject();
//                in.close();
//                fileIn.close();
//                FileOutputStream backupFile = new FileOutputStream(localArquivo +
//                    nomeArquivo + LocalDateTime.now().getDayOfMonth() + 
//                    LocalDateTime.now().getMonthValue()+ LocalDateTime.now().getYear() +
//                    LocalDateTime.now().getHour() +  LocalDateTime.now().getMinute() + ".digexbkp");
//                ObjectOutputStream backupOut = new ObjectOutputStream(backupFile);
//                backupOut.writeObject(obj);
//                backupOut.close();
//                backupFile.close();
//            }
//            FileOutputStream fileOut = new FileOutputStream(localArquivo
//                    + nomeArquivo + ".digex");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
////            out.writeObject(model.getExperimentoVO());
//            out.close();
//            fileOut.close();
//        } catch (IOException ex) {
//            Logger.getLogger(ModelStateAvesDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch(ClassNotFoundException c) {
//            System.out.println("Class not found");
//            System.out.println("XXX");
//        }
        System.out.println("Serialized data is saved in " + localArquivo);
    }
    
    public boolean loadModelState(String localArquivo) {
        Object obj = null;
        try {
           FileInputStream fileIn = new FileInputStream(localArquivo);
           ObjectInputStream in = new ObjectInputStream(fileIn);
           obj = in.readObject();
           in.close();
           fileIn.close();
        } catch(IOException i) {
           i.printStackTrace();
           return false;
        } catch(ClassNotFoundException c) {
           System.out.println("Class not found");
           c.printStackTrace();
           return false;
        }
        ExperimentoVOF e = (ExperimentoVOF) obj;
        e.getAbates().get(0).getBalanca().get(270).setAnilha(275);
//        model.setExperimentoVO(e);
        
        saveModelState(false);
        return true;
    }
}
