import static javax.swing.JOptionPane .*;
/**
 * Tommeberegner.java
 *
 * Programmet beregner fra tommer til centimeter. */

public class Tommeberegner {

    public static void main(String[] args) {

        double tomme = Double.parseDouble(showInputDialog("Skriv inn antall tommer:"));
        double centimeter = tomme * 2.54;
        showMessageDialog(null, "Verdien i centimeter er lik " + centimeter + " centimeter.");
    }
}
