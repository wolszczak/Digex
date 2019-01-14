package brf.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TextFormatter {

    public static String formatString(String text, int length) {
        switch (length) {
            case 1:
                if (text.length() == 0) {
                    text = "0" + text;
                }
                break;
            case 2:
                if (text.length() == 0) {
                    text = "00" + text;
                } else if (text.length() == 1) {
                    text = "0" + text;
                }
                break;
            case 3:
                if (text.length() == 0) {
                    text = "000" + text;
                } else if (text.length() == 1) {
                    text = "00" + text;
                } else if (text.length() == 2) {
                    text = "0" + text;
                }
                break;
            case 4:
                if (text.length() == 0) {
                    text = "0000" + text;
                } else if (text.length() == 1) {
                    text = "000" + text;
                } else if (text.length() == 2) {
                    text = "00" + text;
                } else if (text.length() == 3) {
                    text = "0" + text;
                }
                break;
            default:
                text = "   ";
                break;
        }
        return text;
    }

    public static void formatStringJFT(JFormattedTextField src, String text, int length) {
        switch (length) {
            case 1:
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 2:
                if (text.endsWith(" ")) {
                    text = text.substring(1) + text.substring(0, 1);
                }
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 3:
                if (text.endsWith("  ")) {
                    text = text.substring(1) + text.substring(0, 1);
                } else if (text.endsWith(" ")) {
                    text = text.substring(2) + text.substring(0, 2);
                }
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 4:
                if (text.endsWith("   ")) {
                    text = text.substring(1) + text.substring(0, 1);
                } else if (text.endsWith("  ")) {
                    text = text.substring(2) + text.substring(0, 2);
                } else if (text.endsWith(" ")) {
                    text = text.substring(3) + text.substring(0, 3);
                }
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 5:
                if (text.endsWith("    ")) {
                    text = text.substring(1) + text.substring(0, 1);
                } else if (text.endsWith("   ")) {
                    text = text.substring(2) + text.substring(0, 2);
                } else if (text.endsWith("  ")) {
                    text = text.substring(3) + text.substring(0, 3);
                } else if (text.endsWith(" ")) {
                    text = text.substring(4) + text.substring(0, 4);
                }
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 6:
                if (text.endsWith("     ")) {
                    text = text.substring(1) + text.substring(0, 1);
                } else if (text.endsWith("    ")) {
                    text = text.substring(2) + text.substring(0, 2);
                } else if (text.endsWith("   ")) {
                    text = text.substring(3) + text.substring(0, 3);
                } else if (text.endsWith("  ")) {
                    text = text.substring(4) + text.substring(0, 4);
                } else if (text.endsWith(" ")) {
                    text = text.substring(5) + text.substring(0, 5);
                }
                text = text.replace(' ', '0');
                src.setText(text);
                break;
            case 10:
                System.out.println("text: " + text);
                if (text.endsWith(" ")) {
                    text = "00/00/0000";
                }
                src.setText(text);
                break;
            case 25:
                System.out.println("text: " + text);
                if (text.endsWith(" ")) {
                    text = "0000.00.0000.00.00.000.00";
                }
                src.setText(text);
                break;
            default:
                text = text.replace(' ', '0');
                src.setText(text);
                break;
        }
    }

    public static void formatStringOrdem(JLabel src, String text, int ordem) {
        text = String.format("%03d", Integer.parseInt(text));
        src.setText(text);
    }
}
