import static javax.swing.JOptionPane.*;
/**
 * Tidomregning.java
 *
 * Programmet regner om fra timer, minutter og sekunder til totalt antall sekunder. */

public class Tidomregning {

        public static void main(String[] args) {
            double timer = Double.parseDouble(showInputDialog("Skriv inn antall timer: "));
            double minutter = Double.parseDouble(showInputDialog("Skriv inn antall minutter:"));
            double sekunder = Double.parseDouble(showInputDialog("Skriv inn antall sekunder:"));
            double tidISek = timer * 3600 + minutter * 60 + sekunder;
            showMessageDialog(null, "Tiden omregnet til totalt antall sekunder er lik " + tidISek + " sekunder.");
    }
}