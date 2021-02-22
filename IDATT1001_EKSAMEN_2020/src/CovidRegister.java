import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Kandidatnr: 10115, eksamen IDATT1001_1 des 2020
 *
 * Først og fremst så har jeg valgt å bruke ArrayList gjennom hele oppgaven, fordi jeg er mest komfortabel ved bruk av det.
 * I tillegg inneholder blant annet klassen mange innebygde metoder som feks. å fjerne/legge til og finne elementer.
 * Disse metodene passer bra med metodene som er ønsket i klassen.
 * ArrayList er også dynamisk slik at jeg slipper å utvide listen slik man må ved bruk av Array tabeller.
 */


public class CovidRegister {

    private ArrayList<CovidRegistrering> covidRegister;

    /**
     * Konstruktør, velger agregering da jeg regner med dette er offentlig informasjone
     * og at det derfor ikke er like viktig å bevare sikkerheten ved å opprette nye lister i kontruktøren
     */
    public CovidRegister(ArrayList<CovidRegistrering> covidRegister) {
        this.covidRegister = covidRegister;
    }

    /**
     * Metode for registrering av covidstatistikk i et land
     *
     * @param land
     * @param smittede
     * @param dode
     * @return true/false avhengig av om registreringen skjedde eller ikke
     */
    public boolean regNyCovid(String land, int smittede, int dode) {
        CovidRegistrering kopiListe = new CovidRegistrering(land, smittede, dode);
        if (covidRegister.add(kopiListe)) { //hvis den blir registrert returnerer den tru
            covidRegister.add(kopiListe);
            return true;
        }
        return false;
    }


    /**
     * Metode for å finne første registrering på et gitt dato
     *
     * @param tekst
     * @return en kopi av listen med følrste registrering
     */
    public ArrayList<CovidRegistrering> sokePaDato(CharSequence tekst) {
        ArrayList<CovidRegistrering> kopiListe = new ArrayList<>();

        for (int i = 0; i < covidRegister.size(); i++) {
            if (covidRegister.get(i).getDATO().equals(LocalDate.parse(tekst))) { //parser til LocalDate format, plass nr i vil her være den første registreringen
            }
            kopiListe.add(covidRegister.get(i)); //hopper dermed ut av lista når den finner første registering
            // adder da denne registreringen i kopien
            return kopiListe;  //.. og returnerer kopien
        }
        throw new IllegalArgumentException("Fant ingen registreringen med denne datoen");
    }


    /**
     * @param tekst
     * @return alle listene med covid-registrering på denne datoen
     */
    public ArrayList<CovidRegistrering> sokePaDatoer(CharSequence tekst) {
        ArrayList<CovidRegistrering> kopiListe = new ArrayList<>();

        for (int i = 0; i < covidRegister.size(); i++) {
            if (covidRegister.get(i).getDATO().equals(LocalDate.parse(tekst))) { //parser til LocalDate format,  //plass nr i vil her være den første registreringen
                kopiListe.add(covidRegister.get(i)); //adder da denne registreringen i kopien, og fortsetter å lete etter registreringer med lik dato
            }
        }
        return kopiListe;  //.. og returnerer kopien
    }

    /**
     * @param land
     * @return
     */
    public int antallDode(String land) {
        if (land == null || land == "") { //sjekker at brukeren ikke har skrevet inn et tomt felt
            throw new IllegalArgumentException("Navn kan ikke være null");
        }
        int antallDode = 0;
        for (int i = 0; i < covidRegister.size(); i++) {
            if (covidRegister.get(i).getLAND().toLowerCase().equals(land.toLowerCase())) { //finner landet som er likt med det som brukeren skriver inn
                //gjør begge landene til små boklstaver ved sjekk slik at man finner like land
                antallDode += covidRegister.get(i).getDode();//plusser på alle antall døde
            }
        }
        return antallDode;
    }


    /**
     *
     * @return listen
     */
    public Iterator<CovidRegistrering> iterator() {
        return covidRegister.iterator();
    }



        public int antallRegistreringer () {
            return covidRegister.size(); //Alle covoidregistreringer vil være størrelsen på lista
        }

        @Override
        public String toString () {
            return "CovidRegister " +
                    "covidRegister: " + covidRegister + "\n";
        }

    }



