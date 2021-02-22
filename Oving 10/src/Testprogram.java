import java.util.ArrayList;
import java.util.Arrays;

public class Testprogram {


    public static void main(String []args) {

        //Ulike retter

        Rett brod =  new Rett("Brød med aioli", "forrett", 49.0, "blablabla");
        Rett sushi = new Rett("Sushi", "hovedrett", 113.5,"blablabla");
        Rett is = new Rett("Sjokaldeis", "dessert", 79.0, "blablabla");
        Rett oliven = new Rett("Oliven mm.", "forrett", 35.0, "blablabla");
        Rett spaghetti = new Rett("Spaghetti","hovedrett", 180.5, "blablabla");
        Rett kake = new Rett("Kake", "dessert",59.0, "blablabla" );

        //Menyer

        Meny meny1 = new Meny("Meny1", new ArrayList<>(Arrays.asList(brod, sushi, is)));
        Meny meny2 = new Meny("Meny2", new ArrayList<>(Arrays.asList(oliven, spaghetti, kake)));

        ArrayList<Meny> menyer = new ArrayList<>(Arrays.asList(meny1, meny2));
        ArrayList<Rett> alleRetter= new ArrayList<>(Arrays.asList(brod, sushi, is, oliven, spaghetti, kake));

        MenyRegister register = new MenyRegister(menyer, alleRetter);

        // REGISTRERE EN NY RETT

        Rett asparges = register.regRett("Asparges", "forrett", 35.0, "blablabla");
        Rett burger = register.regRett("Burger", "hovedrett", 150.5, "blablabla");
        Rett kakao = register.regRett("Kakao", "dessert", 55.0, "blablabla");

        // REGISTRERE EN NY MENY BESTÅNDE AV 3 RETTER

        register.regMeny("Meny3", new ArrayList<>(Arrays.asList(asparges, burger, kakao)));

        // FINNE EN RETT, GITT NAVNET

        System.out.println("Finnes sushi?: " + register.finnRett("Sushi"));

        // FINNE ALLE RETTER GITT EN TYPE

        System.out.println("Alle forretter: " + register.finnRettType("forrett"));

        // FINNE ALLE MENYER MED EN TOTALPRIS INNENFOR ET INTERVALL

        System.out.println("Innenfor pris: " + register.finnMenyPris(50.0, 250));

        // PRINTE UT MED TO-STRING-METODEN

        System.out.println(register.toString());






    }


}
