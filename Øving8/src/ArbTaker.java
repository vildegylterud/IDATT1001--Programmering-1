import java.util.Calendar;
import java.util.ArrayList;

public class ArbTaker {

    //Objektsvariabler

    private int arbtakernr;
    private int ansettelsesaar;
    private double mndlonn;
    private double skatteprosent;
    private Person personalia;


    private java.util.GregorianCalendar kalender;
    private int aar;

    //Konstruktør

    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesaar, double mndlonn, double skatteprosent) { //personlia fra Person
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.mndlonn = mndlonn;
        this.skatteprosent = skatteprosent;
        this.kalender = new java.util.GregorianCalendar();
        this.aar = kalender.get(java.util.Calendar.YEAR);

    }

    //Get + Set-metoder

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }

    public double getMndlonn() {
        return mndlonn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setMndlonn(double nyMndlonn) {
        mndlonn = nyMndlonn;
    }

    public void setSkatteprosent(double nySkatteprosent) {
        this.skatteprosent = nySkatteprosent;
    }

    //ULIKE OPERASJONER

    //Hvor mange kroner arbeidstakeren trekkes i skatt per måned

    public double totalSkattetrekk() {
        return (mndlonn * skatteprosent) / 100;
    }

    //Bruttolønn per år

    public double bruttolonnPerAar() {
        return mndlonn * 12;
    }

    //Skattetrekk per år. Husk at juni er skattefri og i desember betales halv skatt

    public double skattetrekkPerAar() {
        return (10 * mndlonn * skatteprosent + mndlonn * 0.5 * skatteprosent) / 100;
    }

    //Navn på formen: etternavn, fornavn, eksempel: Johnsen, Berit

    public String fulltNavn() {
        return (personalia.getEtternavn() + "," + personalia.getFornavn());
    }

    //Alder

    public int alder() {
        return aar - personalia.getFodselsaar();
    }

    //Antall år ansatt i bedriften

    public int antallAarAnsatt() {
        return aar - ansettelsesaar;
    }

    //Om personen har vært ansatt mer enn et gitt antall år (parameter)


    public boolean jobbetAntAar(int antAar) {
        return (antAar <= aar - ansettelsesaar);
    }


    @Override
    public String toString() {
        return "ArbTaker{" +
                "arbtakernr= " + arbtakernr +
                ", ansettelsesaar= " + ansettelsesaar +
                ", mndlonn= " + mndlonn +
                ", skatteprosent= " + skatteprosent +
                ", aar= " + aar +
                '}';
    }
}

