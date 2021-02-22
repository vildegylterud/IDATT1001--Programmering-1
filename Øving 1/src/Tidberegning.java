import static javax.swing.JOptionPane.*;
/**
 * Oppgave31.java
 *
 * Programmet gjør om fra sekunder til antall timer, minutter og sekunder*/

public class Tidberegning {

        public static void main(String[] args) {
            int sekunder = Integer.parseInt(showInputDialog("Sekunder: "));
            int verdi = sekunder;
            double timer = verdi/3600;
            int finnMin = verdi%3600;
            double min = finnMin/60;
            int finnSek = finnMin%60;
            double sek2 = finnSek%60;
            showMessageDialog(null, sekunder + " sekunder blir " + timer + " timer, " + min + " minutter og " + sek2 + " sekunder.");
        }
    }