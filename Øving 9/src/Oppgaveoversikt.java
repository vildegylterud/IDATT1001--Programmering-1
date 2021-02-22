import java.util.Arrays;
import java.util.*;

public class Oppgaveoversikt {

	//Objektsvariabler
	
	private ArrayList<Student> studenter; // tabellen opprettes i konstruktøren
	private int antStud = 0; // økes med 1 for hver ny student


	// Konstruktør

	public Oppgaveoversikt(ArrayList<Student> studenter) {
		this.studenter = studenter;
		this.antStud = studenter.size();
	}


	// METODER

	public void okAntStud() {
		antStud++;
	}
	
	public ArrayList<Student> getStudenter() {
		return studenter;
	}

	/**
	 *
	 * @return antall studenter registrert
	 */
	
	public int finnAntStud() {
		return antStud;
	}
	
	
	/**
	 * Finner antall oppgaver til en gitt student
	 *
	 * @param navn på studenten som skal finnes
	 * @return antall oppgaver til en gitt student, -1 hvis ingen er funnet
	 */
	public int finnAntOppg(String navn) {
		for (int i = 0; i < antStud; i++) {
			if (studenter.get(i).getNavn().equals(navn)) {
				return studenter.get(i).getAntOppg();
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
	public void regNyStudent(String navn, int antOppg) {
		studenter.add(new Student(navn, antOppg));
		okAntStud();
	}


	/**
	 *
	 * @param navn på en bestemt student
	 * @param antOppg man vil øke for den bestemte studenten
	 */
	public void okAntOppStud(String navn, int antOppg) {
		for (int i = 0; i < antStud; i++) {
			if (studenter.get(i).getNavn().equals(navn)) {
				studenter.get(i).okAntOppg(antOppg);
			}
		}
	}

	// toString- metode
	
	@Override
	public String toString() {
		return "Oppgaveoversikt{" +
				"studenter=" + studenter +
				", antStud=" + antStud +
				'}';
	}
	
	public static void main(String[] args) {
		
		Student simon = new Student("Simon", 2);
		Student eirik = new Student("Eirik", 4);
		Student lars = new Student("Lars", 1);
		Student mads = new Student("Mads", 9);
		ArrayList<Student> students = new ArrayList<>(Arrays.asList(simon, eirik, lars, mads));
		
		Oppgaveoversikt oversikt = new Oppgaveoversikt(students);
		
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
