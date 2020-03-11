package brf.suino.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;

import brf.suino.model.ModelST;
import brf.suino.model.vo.BarrigaVOST;
import brf.suino.model.vo.CostadoVOST;
import brf.suino.model.vo.ExperimentoVOST;
import brf.suino.model.vo.FrigorificoTempVOST;
import brf.suino.model.vo.PCRVOST;
import brf.suino.model.vo.PaletaVOST;
import brf.suino.model.vo.PernilVOST;

public class ModelStateDAOST {
	private final ModelST model;
	private Object obj;

	public ModelStateDAOST(ModelST model) {
		this.model = model;
		obj = null;
	}

	public void saveModelState(boolean backup) {
		String localArquivo = new JFileChooser().getFileSystemView().getDefaultDirectory().toString()
				+ "\\DIGEX\\experimentos\\suinos_terminacao\\";
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
			Logger.getLogger(ModelStateDAOST.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			System.out.println("XXX");
		}
		System.out.println("Serialized data is saved in " + localArquivo);
	}

	@SuppressWarnings("unused")
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
//		ExperimentoVOST e = (ExperimentoVOST) obj;
//		
//		for(int z = e.getFrigorificoTempVOST().getCostado().size() -1; z >= 0; z--) {
//			if(e.getFrigorificoTempVOST().getCostado().get(z).getTatuagem() == 823 || e.getFrigorificoTempVOST().getCostado().get(z).getTatuagem() == 824) {
//				e.getFrigorificoTempVOST().getCostado().remove(z);	
//			}
//		}
//		
//		
//		System.out.println(e.getFrigorificoTempVOST().getCostado().size());
		
//		e.setFrigorificoTempVOST(new FrigorificoTempVOST());
//		e.setBaias(new ArrayList<>());
//		e.setMortalidade(new ArrayList<MortalidadeVOST>());
//		e.setMedicados(new ArrayList<MedicadosVOST>());
//		e.setConsumoLivre(new ArrayList<>());
//		e.setConsumosTratos(new ArrayList<>());
//		model.setExperimentoVO(e);
//		saveModelState(false);
		model.setExperimentoVO((ExperimentoVOST) obj);
		return true;
	}
}
