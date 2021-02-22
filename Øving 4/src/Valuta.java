class Valuta {

    private String navn;
    private double kurs;

    /**
     * Konstruktøren
     * @param navn
     * @param kurs
     */
    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    /**
     *
     * @return navnet til Valutaen
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Endrer en valutakurs til en gitt kurs
     * @param nyKurs
     */
    public void setKurs(double nyKurs) {
        kurs = nyKurs;
    }

    /**
     * Regner om fra norske kroner
     * @param norskeKroner
     * @return summen
     */
    public double fraNorskeKroner(double norskeKroner) {
        return norskeKroner / kurs;
    }

    /**
     * Regner om fra utenlanske kroner til norske
     * @param utenlandskeKroner
     * @return summen
     */
    public double tilNorskeKroner(double utenlandskeKroner) {
        return utenlandskeKroner*kurs;
    }
}
