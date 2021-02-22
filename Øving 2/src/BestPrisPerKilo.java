/**
 * Oppgave22.java
 *
 * Programmet finner ut hvilket merke det lønner seg å kjøpe kjøttdeig fra
 *
 * Programmet regnet ut prisen per gram, hvor den laveste prisen per gram er billigst
 */

import static javax.swing.JOptionPane.*;

public class BestPrisPerKilo {
        public static void main(String[] args) {

            double prisPerGramA= 35.9/450; // regner ut prisen per gram for kjøttdeig A
            double prisPerGramB=39.5/500; // regner ut prisen per gram for kjøttdeig B

            if (prisPerGramA<prisPerGramB)
            {
                showMessageDialog(null, "Kjøttdeig A er billigst"); //printer dette hvis linja over stemmer
            }
            else
            {
                showMessageDialog(null, "Kjøttdeig B er billigst") ; //printer dette hvis linja over stemmer
            }
        }
    }

