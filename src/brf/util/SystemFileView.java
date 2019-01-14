package brf.util;

import java.awt.Toolkit;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;

public class SystemFileView extends FileView {
    private final ImageIcon digexIcon;

    public SystemFileView() {
        this.digexIcon = new ImageIcon(
                Toolkit.getDefaultToolkit().getImage(getClass().getResource("/brf/image/icone_DIGEX.png")));
    }
    
    @Override
    public String getName(File f) {
        return null;
    }

    @Override
    public String getDescription(File f) {
        return null;
    }

    @Override
    public Boolean isTraversable(File f) {
        return null;
    }

    @Override
    public String getTypeDescription(File f) {
        String extension = getExtension(f);
        String type = null;

        if (extension != null) {
            if (extension.equals("digex")) {
                type = "DIGEX - Sistema";
            } else if (extension.equals("dta")) {
                type = "DIGEX - Balança";
            } else if (extension.equals("csv")) {
                type = "DIGEX - Experimento";
            }
        }
        return type;
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
    public Icon getIcon(File f) {
        String extension = getExtension(f);
        Icon icon = null;

        if (extension != null) {
            if (extension.equals("digex") || extension.equals("dta")
                     || extension.equals("csv")) {
                icon = digexIcon;
            }
        }
        return icon;
    }
}
