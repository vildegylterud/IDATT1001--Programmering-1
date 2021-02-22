/** Dette er klassen RandomTall.java */

import java.util.Random;

public class RandomTall {

// Objektsvariabler

        private static Random randomTall = new Random();
        private int nedre;
        private int ovre;

    public static Random getRandomTall() {
        return randomTall;
    }

    public static void setRandomTall(Random randomTall) {
        RandomTall.randomTall = randomTall;
    }

    public int getNedre() {
        return nedre;
    }

    public void setNedre(int nedre) {
        this.nedre = nedre;
    }

    public int getOvre() {
        return ovre;
    }

    public void setOvre(int ovre) {
        this.ovre = ovre;
    }

    // Metoder

        public static int nesteHeltall(int nedre, int ovre) {
            return randomTall.nextInt(ovre - nedre) + 1 + nedre;
        }

        public static double nesteDesimaltall(double nedre, double ovre) {
            return randomTall.nextDouble()* (ovre-nedre) + nedre;

        }

    @Override
    public String toString() {
        return "RandomTall{" +
                "nedre=" + nedre +
                ", ovre=" + ovre +
                '}';
    }
}

