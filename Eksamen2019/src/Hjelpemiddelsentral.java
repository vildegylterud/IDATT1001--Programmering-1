import java.util.ArrayList;
import java.util.Iterator;

public class Hjelpemiddelsentral {
    private String navn;
    private ArrayList<Hjelpemiddel> hjelpemidler;

    /** public Hjelpemiddelsentral(String navn, ArrayList<Hjelpemiddel> hjelpemidler) {
        this.navn = navn;
        this.hjelpemidler = hjelpemidler;
    } **/ //Agreggering!!!

    /**
     * Hvis bruker ikke sender inn noe navn eller setter navnet lik null kaster det en feilmld
     * Hvis bruker skriver en navn opprettes det samtidig en arraylist hjelpemidler
     * @param navn
     */
    public Hjelpemiddelsentral(String navn) { //Dette en komposisjon.
        if(navn == null || navn.equals((""))) {
            throw new IllegalArgumentException("Navn kan ikke være null eller tomt");
        }
        this.navn = navn;
        this.hjelpemidler = new ArrayList<>();
    }

    /**
     *
     * @return ut navnet på hjelpemidlet
     */
    public String getNavn() {
        return navn;
    }

    /**
     * DYP KOPIERING
     * @return
     */
    public ArrayList<Hjelpemiddel> getHjelpemidler() {
        ArrayList<Hjelpemiddel> kopiHjelpemidler = new ArrayList<>(); //oppretter en ny liste med hjelpemidler

        for(Hjelpemiddel h:hjelpemidler) {
            kopiHjelpemidler.add(new Hjelpemiddel(h.getID(), h.getTYPE()));
        }
        return kopiHjelpemidler; //returnerer kopien
    }


    /**
     * Gir et hjelpemiddel et navn
     * @param navn
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * Registrerer et nytt hjelpemiddel og legger dette inn i listen
     * @param ID
     * @param TYPE
     * @return false hvis hjelpemiddelet allerede finnes (eller ikke er innenfor gyldig intervall), true hvis det ikke finnes
     */
    public boolean regNyttHjelpemiddel(int ID, String TYPE) {
        Hjelpemiddel hjelpemiddel = new Hjelpemiddel(ID, TYPE);
        for (Hjelpemiddel hj : hjelpemidler) {
            if (hj.equals(hjelpemiddel)) { //sjekker om hjelpemiddelet er likt som et hjelpemiddel som allerede finnes
                return false; // isåfall returneres false
            }
        }
        hjelpemidler.add(hjelpemiddel);
        return true;
    }


        public boolean regUtleie(int ID, String utleier){
            if(utleier == null || utleier.equals("")){
                throw new IllegalArgumentException("Utleier kan ikke være null");
            }
            for(int i=0; i < hjelpemidler.size(); i++) {
                if (hjelpemidler.get(i).getID() == ID && hjelpemidler.get(i).isLedig()) { //Sjekker om hjelpemiddelet men denne ideen finnes og om hjelpemidlet isåfall er ledig
                    hjelpemidler.get(i).setLedig(false);
                    hjelpemidler.get(i).setUtlaaner(utleier);
                    return true;
                }
            }
                return false;
        }

        public boolean avsluttLeie(int ID) {
            for (int i = 0; i < hjelpemidler.size(); i++) {
                if (hjelpemidler.get(i).getID() == ID) {
                    hjelpemidler.get(i).setUtlaaner(null);
                    hjelpemidler.get(i).setLedig(true);
                    return true;
                }
            }
            return false;
    }

    @Override
    public String toString() {
        return hjelpemidler.toString();
    }
}



