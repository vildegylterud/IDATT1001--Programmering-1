import java.util.ArrayList;

public class Soppregister {

    private ArrayList<Soppart> sopparter;

    public Soppregister(ArrayList<Soppart> sopparter) {
        this.sopparter = sopparter;
    }

    /**
     *
     * @param navn
     * @param beskrivelse
     * @param giftig
     * @return true eller false avhengig av om soppen ble registrert
     */
    public boolean regNySoppart(String navn, String beskrivelse, boolean giftig) {
        Soppart nySopp = new Soppart(navn, beskrivelse, giftig);
        for(int i = 0; i < sopparter.size(); i++) {
            if(sopparter.get(i).equals(nySopp)) {    //sjekker om soppen finnes fra før
                return false;
            }
        }
        sopparter.add(nySopp);
        return true;
    }

    /**
     *
     * @param navn
     * @return true eller false avhengig av om soppen ble slettet eller ikke
     */
    public boolean slettSoppart(String navn) {
        for (int i = 0; i < sopparter.size(); i++) {
            if (sopparter.get(i).getNavn().equals(navn)) {
                sopparter.remove(i);
                return true;
            }
        }
        return false;
    }

        /**
         * DYP KOPIERING
         * @return kopi av listen med sopparter
         */
        public ArrayList<Soppart> getSopparter () {
            ArrayList<Soppart> kopiSopparter = new ArrayList<>();

            for (Soppart s : sopparter) {
                kopiSopparter.add(new Soppart(s.getNavn(), s.getBeskrivelse(), s.isGiftig()));
            }
            return kopiSopparter;
        }



    /**
     * Legger de u-giftige soppene inn i lista matsopper
     * @return alle matsopper
     */
    public ArrayList<Soppart> getMatsopper() {
        ArrayList<Soppart> matsopper = new ArrayList<>();
        for (Soppart s : sopparter) {
            if (!s.isGiftig()) {
                matsopper.add(s);
            }
        }
        return matsopper;
    }

    /**
     *
     * @param soekString
     * @return hele beskrivelsen som samsvarer med søkestrengen
     */
    public String delAvBeskrivelse(String soekString) {
        String resultat = "";
        for (int i = 0; i < sopparter.size(); i++) {
            if (sopparter.get(i).getBeskrivelse().contains(soekString)) {
                resultat = sopparter.get(i).toString();
                return resultat;
            }
        } return "Fant ingenting som samsvarte med søkestrengen";
    }

    /**
     *
     * @return alle sopparter
     */
    public String toString() {
        return "Alle sopparter: " + "\n" + sopparter;
    }
}
