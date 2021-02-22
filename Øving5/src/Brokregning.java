/** Klassen regner med brok
 *
 * Brokregner.java
 */

public class Brokregning {

// Objektsvariabler

        private int teller;
        private int nevner;

        // Kontruktør1

        public Brokregning(int teller, int nevner) {
            if (nevner == 0) {
                throw new IllegalArgumentException("Nevner kan ikke være 0.");
            }
            this.teller = teller;
            this.nevner = nevner;
        }

        // Konstruktør2

        public Brokregning(int teller) {
            this.teller = teller;
            this.nevner = 1;
        }

        // get-metoder

        public int getTeller() {
            return teller;
        }

        public int getNevner() {
            return nevner;
        }

        // Metoder for beregningene (+,-,/,*)

        // Summere (+)

        public void summer(Brokregning brok2) {
            teller = teller * brok2.getNevner() + brok2.getTeller() * nevner;
            nevner = nevner * brok2.getNevner();
        }

        // Subtrahere (-)

        public void subtraher(Brokregning brok2) {
            teller = teller * brok2.getNevner() - brok2.getTeller() * nevner;
            nevner = nevner * brok2.getNevner();
        }

        // Multiplisere (*)

        public void multiplisere(Brokregning brok2) {
            teller = teller * brok2.getTeller();
            nevner = nevner * brok2.getNevner();
        }

        // Dividere (/)

        public void dividere(Brokregning brok2) {
            teller = teller * brok2.getNevner();
            nevner = nevner * brok2.getTeller();
        }

    @Override
    public String toString() {
        return "Brokregning" +
                "teller" + teller +
                ", nevner=" + nevner;
    }
}

