public class TerningKlient {
    public static void main(String[] args) {
    /**
     * Lager en spiller A og en spiller B ved bruk av konstruktøren Spiller
     */
    Spiller spillerA = new Spiller();
    Spiller spillerB = new Spiller();

    int rundeNummer = 0;

    /**
     * Hvis ingen av spillerne er ferdig -> øk rundenr til dne første er ferdig)
     * Print så ut poengsummen til hver spiller itillegg til antall kast spiller A og B brukte
     */
    while (!spillerA.isFerdig() && !spillerB.isFerdig()) {
        rundeNummer++;
        System.out.println("Runde nr." + rundeNummer);
        System.out.println("Spiller A kaster: " + spillerA.kastTerningen() + ". Har " + spillerA.getPoengsum() + " poeng.");
        System.out.println("Spiller B kaster: " + spillerB.kastTerningen() + ". Har " + spillerB.getPoengsum() + " poeng.");
    }

    if (spillerA.isFerdig()) {
        System.out.println("Spiller A vant!");
    } else if(spillerB.isFerdig()) {
        System.out.println("Spiller B vant!");
    }
}
}


