/**
 * Oppgave12.java
 *
 * Programmet finner ut om et år er skuddår eller ikke
 */
import static javax.swing.JOptionPane.*;

public class Skuddaar {

        public static void main(String[] args) {

            int aarstall = Integer.parseInt(showInputDialog("Skriv inn årstall her: "));

            int aarstallModulo400 = aarstall % 400; //hvis a==0 er det et skuddår
            int aarstallModulo4= aarstall % 4; // hvis b==0 er det et skuddår
            int aarstallModulo100 = aarstall % 100; // dette blir da et hundreår hvis c!=0

            if(aarstallModulo400==0 || aarstallModulo4==0 && aarstallModulo100!=0)
            {
                showMessageDialog(null, "Dette er et skuddår!"); //skriver hvis det over stemmer
            }
            else
            {
                showMessageDialog (null, "Dette er ikke et skuddår!"); //hvis ikke det over stemmer vil den skrive dette
            }
        }
    }
