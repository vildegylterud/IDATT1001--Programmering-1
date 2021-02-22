
import java.util.ArrayList;

public class Student {


    //Objektsvariabler

    private final String navn;
    private int antOppg;

    //Konstruktør

    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    //Operasjoner

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void okAntOppg(int okning) {
        antOppg += okning;
    }

    // toString-metode
    @Override
    public String toString() {
        return "\nNavn: " + navn + ", Antall oppgaver godkjent: " + antOppg ;
    }

// TESTPROGRAM FOR KLASSEN STUDENT

    public static void main(String[] args) {

        Student vilde = new Student("Vilde", 8);
        vilde.okAntOppg(4);
        System.out.println(vilde.toString());

        System.out.println("\n");

        Student ada = new Student("Ada", 8);
        ada.okAntOppg(4);
        System.out.println(ada.toString());


    }
}


