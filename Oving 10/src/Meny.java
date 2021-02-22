import java.util.ArrayList;

public class Meny {

    //Objektsvariabler

    private final String NAVN;
    private ArrayList<Rett> retter;
    private double totalpris;


    //Konstruktør

    public Meny(String NAVN, ArrayList<Rett> retter) {
        this.retter = retter;
        this.NAVN = NAVN;
        for (Rett r : retter) {
            this.totalpris += r.getPris();
        }
    }

    public double getPris() {
        return this.totalpris;
    }

    //getNAVN

    public String getNAVN() { return this.NAVN; }


    @Override
    public String toString() {
        return "Navn på menyen: '" + NAVN + '\'' +
                ", retter=" + retter +
                ", totalpris=" + totalpris; }
}




