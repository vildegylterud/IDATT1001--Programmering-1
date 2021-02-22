public class Person {

    //Objektsvariabler

    private final String fornavn;
    private final String etternavn;
    private final int fodselsaar;

    //Konstruktør

    public Person(String fornavn, String etternavn,int fodselsaar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    //Get-metoder

    public String getFornavn() { return fornavn; }

    public String getEtternavn() { return etternavn; }

    public int getFodselsaar() { return fodselsaar; }
}
