
package brf.peru.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;

import brf.peru.model.ModelP;
import brf.peru.model.vo.AbateVOP;
import brf.peru.model.vo.CamaraVOP;
import brf.peru.model.vo.DesempenhoVOP;
import brf.peru.model.vo.ExperimentoVOP;

public class ModelStateDAOP {
	private final ModelP model;
	private Object obj;

	public ModelStateDAOP(ModelP model) {
		this.model = model;
		obj = null;
	}

	public void saveModelState(boolean backup) {
		String localArquivo = new JFileChooser().getFileSystemView().getDefaultDirectory().toString()
				+ "\\DIGEX\\experimentos\\peru\\";
		String nomeArquivo = model.getExperimentoVO().getInfoExp().getTeste();
		try {
			Files.createDirectories(Paths.get(localArquivo));
			if (Files.exists(Paths.get(localArquivo + nomeArquivo + ".digex")) && backup) {
				FileInputStream fileIn = new FileInputStream(localArquivo + nomeArquivo + ".digex");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				obj = in.readObject();
				in.close();
				fileIn.close();
				FileOutputStream backupFile = new FileOutputStream(
						localArquivo + nomeArquivo + LocalDateTime.now().getDayOfMonth()
								+ LocalDateTime.now().getMonthValue() + LocalDateTime.now().getYear()
								+ LocalDateTime.now().getHour() + LocalDateTime.now().getMinute() + ".digexbkp");
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
			Logger.getLogger(ModelStateDAOP.class.getName()).log(Level.SEVERE, null, ex);
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
//		ExperimentoVOP e = (ExperimentoVOP) obj;
//		
//		for(int z = 0; z < e.getAbates().get(0).getCones().size(); z++) {
//			if(e.getAbates().get(0).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(0).getCones().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(0).getCones().size(); z++) {
//			if(e.getAbates().get(0).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(0).getCones().remove(z);
//			}
//		}
//		
//		for(int z = 0; z < e.getAbates().get(1).getCones().size(); z++) {
//			if(e.getAbates().get(1).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(1).getCones().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(1).getCones().size(); z++) {
//			if(e.getAbates().get(1).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(1).getCones().remove(z);
//			}
//		}
//		
//		for(int z = 0; z < e.getAbates().get(2).getCones().size(); z++) {
//			if(e.getAbates().get(2).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(2).getCones().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(2).getCones().size(); z++) {
//			if(e.getAbates().get(2).getCones().get(z).getNasa() == 0) {
//				e.getAbates().get(2).getCones().remove(z);
//			}
//		}
		
		
//		for(int z = 0; z < e.getAbates().get(0).getCamaras().size(); z++) {
//			if(e.getAbates().get(0).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(0).getCamaras().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(0).getCamaras().size(); z++) {
//			if(e.getAbates().get(0).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(0).getCamaras().remove(z);
//			}
//		}
//		
//		
//		for(int z = 0; z < e.getAbates().get(1).getCamaras().size(); z++) {
//			if(e.getAbates().get(1).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(1).getCamaras().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(1).getCamaras().size(); z++) {
//			if(e.getAbates().get(1).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(1).getCamaras().remove(z);
//			}
//		}
//		
//		for(int z = 0; z < e.getAbates().get(2).getCamaras().size(); z++) {
//			if(e.getAbates().get(2).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(2).getCamaras().remove(z);
//			}
//		}
//		for(int z = 0; z < e.getAbates().get(2).getCamaras().size(); z++) {
//			if(e.getAbates().get(2).getCamaras().get(z).getNasa() == 0) {
//				e.getAbates().get(2).getCamaras().remove(z);
//			}
//		}

		
		
//		for(int y = 0; y < e.getAbates().get(2).getCamaras().size();y++) {
//			
//			for(int z = 0; z < e.getAbates().get(2).getCamaras().size();z++) {
//				if(e.getAbates().get(2).getCamaras().get(z).getNasa() == 14 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 14 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 11 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 60 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 29 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 68 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 40 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 38 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 51 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 62 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 27 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 1  ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 45 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 49 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 6  ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 19 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 30 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 42 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 61 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 18 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 20 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 32 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 71 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 75 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 70 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 28 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 64 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 31 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 9  ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 50 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 15 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 23 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 21 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 35 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 34 ||
//						e.getAbates().get(2).getCamaras().get(z).getNasa() == 52 ) {
//					e.getAbates().get(2).getCamaras().remove(z);
//				}
//			}
//			
//		}
		
//		e.getAbates().remove(2);
//		e.getAbates().add(new AbateVOP());
//		e.getAbates().get(2).setAbate(3);
//		
//		
//		model.setExperimentoVO(e);
//		model.getModelStateDAO().saveModelState(false);
		
		model.setExperimentoVO(obj);
		
		return true;
	}


}
