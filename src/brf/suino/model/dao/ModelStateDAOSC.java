package brf.suino.model.dao;

import brf.frango.model.vo.ExperimentoVOF;
import brf.suino.model.ModelSC;
import brf.suino.model.vo.ExperimentoVOSC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class ModelStateDAOSC {
	private final ModelSC model;
	private Object obj;

	public ModelStateDAOSC(ModelSC model) {
		this.model = model;
		obj = null;
	}

	public void saveModelState(boolean backup) {
		String localArquivo = new JFileChooser().getFileSystemView().getDefaultDirectory().toString()
				+ "\\DIGEX\\experimentos\\suinos_creche\\";
		String nomeArquivo = model.getExperimentoVO().getInfoExp().getTeste();
		try {
			Files.createDirectories(Paths.get(localArquivo));
			if (Files.exists(Paths.get(localArquivo + nomeArquivo + ".digex")) && backup) {
				FileInputStream fileIn = new FileInputStream(localArquivo + nomeArquivo + ".digex");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				obj = in.readObject();
				in.close();
				fileIn.close();
				FileOutputStream backupFile = new FileOutputStream(localArquivo + nomeArquivo + LocalDateTime.now().getDayOfMonth()
						+ LocalDateTime.now().getMonthValue() + LocalDateTime.now().getYear() + LocalDateTime.now().getHour()
						+ LocalDateTime.now().getMinute() + ".digexbkp");
				ObjectOutputStream backupOut = new ObjectOutputStream(backupFile);
				backupOut.writeObject(obj);
				backupOut.close();
				backupFile.close();
			}
			FileOutputStream fileOut = new FileOutputStream(localArquivo + nomeArquivo + ".digex");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(model.getExperimentoVO());
			out.close();
			fileOut.close();
		} catch (IOException ex) {
			Logger.getLogger(ModelStateDAOSC.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			System.out.println("XXX");
		}
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
		} catch (IOException i) {
			i.printStackTrace();
			return false;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return false;
		}
//		ExperimentoVOSC e = (ExperimentoVOSC) obj;
//		e.setMedicados(new ArrayList<>());
//		e.setMortalidade(new ArrayList<>());
		model.setExperimentoVO((ExperimentoVOSC) obj);
//		saveModelState(false);
		return true;
	}
}
