/**
 * Oppgave13
 *
 * Programmet viser gangetabellen
 */

import static javax.swing.JOptionPane.*;

public class Gangetabellen {
        public static void main(final String[] args) {

            int minsteTall = Integer.parseInt(showInputDialog(null, "Skriv inn første tallet du vil se gangetabellen til")); //endrer tallet fra bruker fra string til int
            int størsteTall = Integer.parseInt(showInputDialog(null, "Skriv inn siste tall"));

            for(int i= minsteTall; i <= størsteTall; i++) {
                System.out.println("\n" + i + "-gangen:");

                for (int tall = 0; tall <= 10; tall++) {
                    int resultat = i * tall;
                    System.out.println( i + " x " + tall + " = " + resultat);
                }
            }
        }
    }