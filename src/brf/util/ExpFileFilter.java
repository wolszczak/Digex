package brf.util;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class ExpFileFilter extends FileFilter {
    
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals("csv")) {
                    return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public String getExtension(File f) {
        String ext = null;
        String nomeArquivo = f.getName();
        int i = nomeArquivo.lastIndexOf('.');
        if (i > 0 &&  i < nomeArquivo.length() - 1) {
            ext = nomeArquivo.substring(i+1).toLowerCase();
        }
        return ext;
    }

    @Override
    public String getDescription() {
        return "DIGEX - Experimento";
    }
}
