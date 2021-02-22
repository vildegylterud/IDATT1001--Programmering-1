import java.util.ArrayList;
import java.util.Arrays;


public class Oppgaveoversikt2 {


    //Objektsvariabler

    private Student[] studenter;
    private int antStud = 0;

    //Konstruktør

    public Oppgaveoversikt2(Student[] studenter, int antStud) {
        this.studenter = new Student[5];
        this.antStud = antStud;
    }

    public void okAntStud() {
        antStud++;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    /**
     * Utvider tabellen
     */
    public void utvidTabell() {
        Student[] tabell = new Student[antStud + 5];
        for (int i = 0; i < studenter.length; i++) {
            tabell[i] = studenter[i];
        }
        studenter = tabell;
    }

    public void okAntStud2() {
        antStud++;
    }

    public Student[] getStudenter2() {
        return studenter;
    }

    /**
     * @return antall studenter registrert
     */
    public int finnAntStud2() {
        return antStud;
    }

    /**
     * Finner antall oppgaver til en gitt student
     *
     * @param navn på studenten som skal finnes
     * @return antall oppgaver til en gitt student, -1 hvis ingen er funnet
     */
    public int finnAntOppg2(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                return studenter[i].getAntOppg();
            }
        }
        return -1;
    }


    /**
     * Registrer en ny student og legger den til i listen
     *
     * @param navn    på student som skal opprettes
     * @param antOppg som studenten har løst
     */
    public void regNyStudent2(String navn, int antOppg) {
        if (antStud == studenter.length) {
            utvidTabell();
        }
        studenter[antStud] = new Student(navn, antOppg);
        okAntStud();
    }


    /**
     *
     * @param navn på en bestemt student
     * @param antOppg man vil øke for den bestemte studenten
     */
    public void okAntOppStud(String navn, int antOppg) {
        for (int i = 0; i < antStud; i++) {
            if (studenter[i].getNavn().equals(navn)) {
                studenter[i].okAntOppg(antOppg);
            }
        }
    }


    //toString-metode

    @Override
    public String toString() {
        return "Oppgaveoversikt2{" +
                "studenter=" + Arrays.toString(studenter) +
                ", antStud=" + antStud +
                '}';
    }

    public static void main(String[] args) {

        Student simon = new Student("Simon", 2);
        Student eirik = new Student("Eirik", 4);
        Student lars = new Student("Lars", 1);
        Student mads = new Student("Mads", 9);
        Student[] studenter = new Student[](simon, eirik, lars, mads));

        Oppgaveoversikt oversikt = new Oppgaveoversikt(studenter);

        //Registrerer 3 nye studenter
        oversikt.regNyStudent("Vilde", 4);
        oversikt.regNyStudent("Helena", 5);
        oversikt.regNyStudent("Henrik", 3);

        //Bruke metoden som finner antall studenter:
        System.out.println(oversikt.finnAntStud());

        //Sjekker hvor mange oppgaver som er løst før vi øker antallet
        System.out.println(oversikt.finnAntOppg("Vilde"));

        //Øker antall oppgaver for Vilde
        oversikt.okAntOppStud("Vilde", 10);

        //Finner antall oppgaver Vilde har løst
        System.out.println(oversikt.finnAntOppg("Vilde"));

        //Bruker toString- metoden
        System.out.println(oversikt.toString());

    }
}
