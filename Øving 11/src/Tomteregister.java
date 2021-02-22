import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Begrunnelse for valg av ArrrayList;
 *
 * ArrayList har mange innebygde metoder for feks å fjerne/legge til og finne elementer. Disse metodene passer bra med metodene som er ønsket i klassen
 * I tillegg så slipper jeg å utvide lista (hvis jeg registrer flere eiendommer) slik som man må ved bruke av Array tabeller
 * Hvis jeg fjerner et element i lista vil det heller ikke bli et "hull" med ingen verdi slik som det vil bli med tabeller
 * + at jeg er mer komfortabel ved bruk av det
 */

public class Tomteregister {

    private ArrayList<Tomt> tomter;

    public Tomteregister(ArrayList<Tomt> tomter) {
        this.tomter = tomter;
    }

    /**
     * Registrer / legger til ny eiendom i registeret (HUSK TIL EKSAMEN)
     */
    public boolean regEiendom(int kommunenr, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        if(gnr < 0 || bnr < 0 || 101 < kommunenr || kommunenr < 5054) {
            Tomt nyTomt = new Tomt(kommunenr, kommunenavn, gnr, bnr, bruksnavn, areal, eier);
            tomter.add(nyTomt);
            return true;
        } else {
           return false;
        }
    }


    /**
     * Sletter eiendom som samsvarer med både kommmunenr, gnr og bnr
     *
     * @param kommunenr
     * @param gnr
     * @param bnr
     */
    public void slettEiendom(int kommunenr, int gnr, int bnr) {
        for (int i = 0; i < tomter.size(); i++) {
            if (tomter.get(i).getKommunenr() == kommunenr && tomter.get(i).getGnr() == gnr && tomter.get(i).getBnr() == bnr) {
                tomter.remove(tomter.get(i));
            }
        }
    }

    /**
     * @return antall eiendommer i registeret
     */
    public int antallEiendommer() {
        int antEiendommer = tomter.size();
        return antEiendommer;
    }

    /**
     * @param bestemtKommunenr
     * @param bestemtGnr
     * @param bestemtBnr
     * @return bestemt eiendom som samsvarer med alle param
     */
    public ArrayList<Tomt> finnEiendom(int bestemtKommunenr, int bestemtGnr, int bestemtBnr) {
        ArrayList<Tomt> bestemtEiendom = new ArrayList<>();
        for (int i=0; i < tomter.size(); i++) {
            if (tomter.get(i).getKommunenr() == bestemtKommunenr && tomter.get(i).getGnr() == bestemtGnr && tomter.get(i).getBnr() == bestemtBnr) {
                bestemtEiendom.add(tomter.get(i));
            }
        }
        return bestemtEiendom;
    }

    /**
     *
     * @param gnr
     * @return en bestemt eiendom funnet ut i fra gitt gårdsnummer
     */
    public ArrayList<Tomt> eiendomMedGnr(int gnr) {
        ArrayList<Tomt> bestemtGnr = new ArrayList<>();
        for(int i=0; i < tomter.size(); i++) {
            if(tomter.get(i).getGnr() == gnr) {
                bestemtGnr.add(tomter.get(i));
            }
        }
        return bestemtGnr;
    }

    /**
     * @return gjennomsnittsarealet for alle eiendommene
     */
    public double gjennomnittAreal() {
        double alleAreal = 0.0;
        for(int i=0; i < tomter.size(); i++) {
            alleAreal += tomter.get(i).getAreal();
        }
        return alleAreal / antallEiendommer();
    }

    /**
     *
     * @return alle eiendommene i registeret
     */
    public String utskrift() { return "Alle eiendommene i registeret: " + tomter; }
}


/**
 * Begrunnelse for kodestil med konkrete eksempler fra koden:
 *
 * Kodestil: Jeg har skrevet kommentarer gjennom alle klassene slik at man lettere forstår hver metode
 * Oppsettet er oversiktelig
 * Endringer i den ene klassen har liten effekt på den andre klassen
 *
 *
 * Coupling: Jeg har laget metoder som avhenger lite av hverandre
 * slik at klassene trenger å vite mist mulig om hverandre
 *
 *
 * Coheshion: Jeg har laget metoder som kun har ansvar for den enkelte logiske oppgaven.
 * + at jeg gitt alle objekter og metoder fornuftige/ beskrivende navn
 */



