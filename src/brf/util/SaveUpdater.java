package brf.util;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class SaveUpdater {

    public static void startCountdown(int tempo, JLabel label) {
        label.setVisible(true);
        SwingUtilities.invokeLater(() -> {
            Timer timer = new Timer(tempo*1000, (ActionEvent e) -> {
                label.setVisible(false);
            });
            timer.start();
        });
    }
}
