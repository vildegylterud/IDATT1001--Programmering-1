import java.util.Objects;

public class Soppart {

    //Gjorde om til final i ettertid. Alle final variebler skal skrives i store boksatver

    private final String navn;
    private final String beskrivelse;
    private final boolean giftig;

    public Soppart(Soppart sopp) {
        this.navn = sopp.getNavn();
        this.beskrivelse = sopp.getBeskrivelse();
        this.giftig = sopp.isGiftig();
    }

    public Soppart(String navn, String beskrivelse, boolean giftig) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.giftig = giftig;
    }

    /**
     *
     * @return navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     *
     * @return beskrivelse
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }


    /**
     *
     * @return true eller false ettersom om soppen er giftig eller ikke
     */
    public boolean isGiftig() {
        return giftig;
    }

    public boolean delAvBeskrivelse(String sokestreng){
            return (sokestreng.contains(beskrivelse));
        }

    /**
     *
     * @param o
     * @return true eller false
     */
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Soppart)) return false; //instanceof -- aka referer objektet o til Hjelpemiddel-objektet? hvis det ikke gjør det return false
        Soppart midlertidigSoppart = (Soppart) o; //caster o til å bli et hjelpemiddel
        return midlertidigSoppart.getNavn().equals(this.navn);
    }

    /**
     *
     * @return alle sopper
     */
    public String toString(){
            return "Navn på sopparten: " + navn + "\nBeskrivelse: " + beskrivelse + "\nEr giftig: " + giftig;
    }
}



