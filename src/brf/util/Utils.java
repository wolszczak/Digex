package brf.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFileChooser;

public class Utils {

	public Utils() {
	}

	public static void salvarLogErro(Exception e, String msg) {
		try {
			String localArquivo = "\\DIGEX\\LOGS\\";
			String nomeArquivo = Calendar.getInstance().getTime() + "_LOG_ERRO_DIGEX.txt";
			Files.createDirectories(Paths.get(localArquivo));
			FileOutputStream fileOut = new FileOutputStream(localArquivo + nomeArquivo);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeBytes("#################################################################################################"
					+ "#################################################################################################"
					+ "############################# " + msg + "#############################"
					+ "#################################################################################################"
					+ "#################################################################################################\n"
					+ e.getMessage());
			out.close();
			fileOut.close();
		} catch (Exception e2) {
			salvarLogErro(e2,
					"#################################################################################################"
							+ "#################################################################################################"
							+ "################################# Erro no salvarLogErro #########################################"
							+ "#################################################################################################"
							+ "#################################################################################################");
		}
	}

	public static Date dateFromString(String string) {
		try {
			if(string.equals("0")) {
				return null;
			}else {
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(string);
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
