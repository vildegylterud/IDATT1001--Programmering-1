import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JOptionPane.*;

public class MenystyrtProgram {


    public static void main(String[] args) {


        /**
         * Alle de gitte eiendommene
         */
        Tomt jensOlsen = new Tomt(1445, "Gloppen", 77, 631,  1017.6, "Jens Olsen");
        Tomt nicolayMadsen = new Tomt(1445, "Gloppen", 77, 131, "Syninom", 661.3, "Nicolay Madsen");
        Tomt evilynJensen = new Tomt(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        Tomt karlOveBraaten = new Tomt(1445, "Gloppen", 74, 1800, 1457.2, "Karl Ove Bråten");
        Tomt elsaIndregaard = new Tomt(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        ArrayList<Tomt> tomter = new ArrayList<>(Arrays.asList(jensOlsen, nicolayMadsen, evilynJensen, karlOveBraaten, elsaIndregaard));
        Tomteregister register = new Tomteregister(tomter);

        // reg ny eiendom
        /**
         * Registerer en ny eiendom
         */
        int valgReg = showConfirmDialog(null, "Vil du registrere en ny eiendom?", "Registrere eiendom", YES_NO_OPTION);
        if (valgReg == 0) {
            int kommunenr = Integer.parseInt(showInputDialog(null, "Skriv inn kommunenr"));
            String kommunenavn = showInputDialog(null, "Skriv inn kommunenavnet!");
            int gnr = Integer.parseInt(showInputDialog(null, "Skriv inn gårdsnummer"));
            int bnr = Integer.parseInt(showInputDialog(null, "Skriv inn bruksnummer"));
            String bruksnavn = showInputDialog(null, "Skriv inn bruksnavn hvis du vil. Hvis ikke trykk ok.");
            double areal = Double.parseDouble(showInputDialog(null, "Skriv inn areal. Skriv som desimaltall med punktum som komma"));
            String eier = showInputDialog(null, "Skriv inn navnet på eier");
            register.regEiendom(kommunenr, kommunenavn, gnr, bnr, bruksnavn, areal, eier);
            showMessageDialog(null, "Eiendommen er registrert");
        }
        else {
            showMessageDialog(null, "Ingen eiendom ble registrert!");
        }

        /**
         * Sletter en eiendom
         */
        int valgSlett = showConfirmDialog(null, "Vil du slette en eiendom?", "Slette en eiendom", YES_NO_OPTION);
        if (valgSlett == 0) {
            int kommunenr = Integer.parseInt(showInputDialog(null, "Skriv inn kommunenummer"));
            int gnr = Integer.parseInt(showInputDialog(null, "Skriv inn gårdsnummer"));
            int bnr = Integer.parseInt(showInputDialog(null, "Skriv inn bruksnummer"));
            register.slettEiendom(kommunenr, gnr, bnr);
            showMessageDialog(null, "Eiendommen er slettet!");
        }
        else {
            showMessageDialog(null, "Slettet ingen eiendom!!");
        }

        /**
         * Finner antall eiendommer som er i registeret
         */
        int finneAnt = showConfirmDialog(null, "Vil du finne antall eiendommer?", "Finne antall eiendommer", YES_NO_OPTION);
        if (finneAnt == 0) {
            showMessageDialog(null, register.antallEiendommer());
        }


        /**
         * Finner gjennomsnittlig antall kvm per eiendom
         */
        int gjenKvm = showConfirmDialog(null, "Vil du finne gjennomsnittlig kvadratmeter?", "Gjennomsnittlig kvadratmeter", YES_NO_OPTION);
            if (gjenKvm == 0) {
                showMessageDialog(null, register.gjennomnittAreal());
            }


        /**
         * Finner en bestemt eiendom
         */
        int finnEiendom = showConfirmDialog(null, "Vil du finne en bestemt eiendom?", "Finne eiendom", YES_NO_OPTION);
            if (finnEiendom == 0) {
                int kommunenr = Integer.parseInt(showInputDialog(null, "Skriv inn kommunenumme"));
                int gnr = Integer.parseInt(showInputDialog(null, "Skriv inn gårdsnummer"));
                int bnr = Integer.parseInt(showInputDialog(null, "Skriv inn bruksnummer"));
                showMessageDialog(null, register.finnEiendom(kommunenr, gnr, bnr));
            }
            else {
                showMessageDialog(null, "Lette ikke etter en bestemt eiendom");
            }

        /**
         * Finner alle eiendommene med det samme gårdsnummeret
         */
        int finnEiendomGnr = showConfirmDialog(null, "Vil du finne eiendommer med samme gnr?", "Samme gårdsnummer", YES_NO_OPTION);
            if(finnEiendomGnr == 0) {
              int gnr = Integer.parseInt(showInputDialog(null, "Skriv inn gårsnummeret"));
              showMessageDialog(null, register.eiendomMedGnr(gnr));
           }

        /**
        * Skriver ut alle eiendommene i registeret
        */
        int utskrift = showConfirmDialog(null, "Vil du skrive ut alle eiendommene i registeret?", "Utskrift av alle eiendommer", YES_NO_OPTION);
        if(utskrift == 0) {
            System.out.println(register.utskrift());
        }

        /**
         * Avslutter programmet
         */
        int avslutte = showConfirmDialog(null, "Vil du avslutte programmet?", "Avslutte programmet", YES_NO_OPTION);
        if(avslutte == 0) {
            System.exit(0);
        }
    }
 }
