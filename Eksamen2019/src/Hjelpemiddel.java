import java.util.Objects;

public class Hjelpemiddel {

    private final int ID;
    private final String TYPE;
    private boolean ledig;
    private String utlaaner;

    /**
     * Konstruktør til en hjelpemiddel uten noen foreløpig utlaaner.
     * @param ID : int (ex: 2001)
     * @param TYPE : String
     */
    public Hjelpemiddel(int ID, String TYPE) {
        if(ID < 1001 || ID > 9999) {
            throw new IllegalArgumentException("ID-en er ikke gyldig");
        }
        this.ID = ID;
        this.TYPE = TYPE;
        this.ledig = true;
        this.utlaaner = null;
    }
    

    /**
     * Konstruktør til et hjelpemiddel som er utlånt
     * @param ID : int (ex: 2001)
     * @param TYPE : String
     * @param utlaaner : String
     */
    public Hjelpemiddel(int ID, String TYPE, String utlaaner) {
        if(ID < 1001 || ID > 9999) {
            throw new IllegalArgumentException("ID-en er ikke gyldig");
        }
        this.ID = ID;
        this.TYPE = TYPE;
        this.ledig = false;
        this.utlaaner = utlaaner;
    }


    /**
     * Henter ut ID-en til hjelpemiddelet
     * @return int
     */
    public int getID() {
        return this.ID;
    }


    /**
     * Henter ut typen hjelpemiddel
     * @return String
     */
    public String getTYPE() {
        return this.TYPE;
    }


    /**
     * Sjekker om hjelpemiddelet er ledig
     * @return boolean
     */
    public boolean isLedig() {
        return this.ledig;
    }


    /**
     * Henter navnet til personen som låner, hvis ingen låner vil den returne "ingen"
     * @return String
     */
    public String getUtlaaner() {
        return this.utlaaner;
    }


    /**
     * Setter lånerens name og endrer status til utlant (ledig=false). Hvis navnet er "ingen" vil statusen endres til ledig=true
     * @param utlaaner
     */
    public void setUtlaaner(String utlaaner) {
        this.utlaaner = utlaaner;
    }


    /**
     * Setter om et hjelpemiddel er ledig eller ikke
     * @param ledig (true eller false)
     */
    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }

    /**
     *
     * @param o (aka et objekt)
     * @return om to hjelpemidler er de samme
     */
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(!(o instanceof Hjelpemiddel)){ //instanceof -- aka referer objektet o til Hjelpemiddel-objektet? hvis det ikke gjør det return false
            return false;
        }

        Hjelpemiddel midlertidigHjelpemiddel = (Hjelpemiddel)o; //caster o til å bli et hjelpemiddel

        return midlertidigHjelpemiddel.getID() == this.ID;
    }


    /**
     *
     * @return (hvis ledig) kun id type og "ledig", (hvis !ledig returnerer det id, type, og hvem den er utleid til"
     */
    @Override
    public String toString(){
        if(ledig){
            return ID + " " + TYPE + " ledig";
        }else{
            return ID + " " + TYPE + " utleid til " + utlaaner;
        }
    }
}
