/**
 * Kandidatnr: 10115, eksamen IDATT1001_1 des 2020
 */
import java.time.LocalDate;

public class CovidRegistrering {

    private final LocalDate DATO;
    private final String LAND;
    private int smittede;
    private int dode;


    /**
     * Konstruktør, setter inn sjekk på at oppgitt døde og smittede er et positivt heltall
     * @param land
     * @param smittede
     * @param dode
     */
    public CovidRegistrering(String land, int smittede, int dode) { //bruker skriver ikke inn dato selv
        if(smittede > 0 || dode > 0) {
            DATO = LocalDate.now(); //gir oss dagens dato, altså datoen registreringen blir gjort
            this.LAND = land;
            this.smittede = smittede;
            this.dode = dode;
        } else {
            throw new IllegalArgumentException("Er ikke mulig å registrere et negativt antall døde eller smittede");
        }
    }


    /**
     * Lager get-metoder for alle objektsvariablene
     *
     * Lager kun set-metoder for antall smittede og døde, da det ikke er naturlig å endre verken land eller dato
     *
     */

    public LocalDate getDATO() {
        return DATO;
    }

    public String getLAND() {
        return LAND;
    }

    public int getSmittede() {
        return smittede;
    }


    public int getDode() {
        return dode;
    }

    public void setDode(int dode) {
        this.dode = dode;
    }

    public void setSmittede(int smittede) {
        this.smittede = smittede;
    }


    /**
     * toString-metode
     * @return oversikt over dato, land, antall smittede og døde
     */
    @Override
    public String toString() {
        return "CovidRegistrering" +
                "Dato ved registrering: " + DATO + "\n" +
                "Land: '" + LAND + "\n" +
                "Antall smittede: " + smittede + "\n" +
                "Antall døde: " + dode;
    }

   //Velger å ikke lage equals-metode fordi jeg mener det ikke er nødvendig utifra hva det står i oppgaven at programmet skal brukes til.
}
