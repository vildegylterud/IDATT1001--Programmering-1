public class Tomt {

    private int kommunenr;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;

    public Tomt(int kommunenr, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier) {
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    public Tomt(int kommunenr, String kommunenavn, int gnr, int bnr, double areal, String eier) {
        this.kommunenr = kommunenr;
        this.kommunenavn = kommunenavn;
        this.gnr = gnr;
        this.bnr = bnr;
        this.areal = areal;
        this.eier = eier;
    }

    //Get- og set-metoder

    public int getKommunenr() {
        return kommunenr;
    }

    public String getKommunenavn() {
        return kommunenavn;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    public double getAreal() {
        return areal;
    }

    public String getEier() {
        return eier;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    @Override
    public String toString() {
        return "Tomt: " + kommunenr + "-" + gnr + "/" + bnr +
                ", kommunenavn= '" + kommunenavn + '\'' +
                ", bruksnavn= '" + bruksnavn + '\'' +
                ", areal= " + areal +
                ", eier= '" + eier + "\n";
    }


    /**
     * Begrunnelse for hvorfor valg av mutator-metoder:
     *
     * Lagde kun set-metoder til de objektsvariablene jeg tenker det er naturlig at kan endres. Feks bruksnavn, eier
     *
     * Lagde ikke for gnr og bnr etc fordi jeg tenker at det ikke er naturlig at de skal endres
     *
     */
}


