import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class KlientArbTaker {

    public static void main(String[] args) {


        Person vilde = new Person("Vilde", "Gylterud", 2001);
        ArbTaker vildeGylterud = new ArbTaker(vilde, 100, 2018, 25000.0, 12.0);

        System.out.println("Skattetrekk per måned:  " + vildeGylterud.totalSkattetrekk()); //skattetrekk per maaned

        System.out.println("Bruttolønn per år:  " + vildeGylterud.bruttolonnPerAar()); //total lonn før skatt per aar

        System.out.println("Skattetrekk per år: " + vildeGylterud.skattetrekkPerAar()); //skattetrekk per aar

        System.out.println("Fullt navn:  " + vildeGylterud.fulltNavn()); //navn på gitt form

        System.out.println("Alder:  " + vildeGylterud.alder()); //alderen til Person

        System.out.println("Antall år ansatt:  " + vildeGylterud.antallAarAnsatt()); //antall aar ansatt

        System.out.println("Vært ansatt mer enn 10 år?:  " + vildeGylterud.jobbetAntAar(10)); //har Person vaert ansatt mer enn gitt parameter (10 aar)?


        //MENYPROGRAM BRUKEREN

        String nySkatteprosentLest = showInputDialog(null, "Ny skatteprosent: ");
        double nySkatteprosent = Double.parseDouble(nySkatteprosentLest);
        vildeGylterud.setSkatteprosent(nySkatteprosent);


        String nyMndlonnLest = showInputDialog(null, "Ny månedslønn: ");
        double nyMndlonn= Double.parseDouble(nyMndlonnLest);
        vildeGylterud.setMndlonn(nyMndlonn);


        showMessageDialog(null,vildeGylterud.toString());

    }
}

