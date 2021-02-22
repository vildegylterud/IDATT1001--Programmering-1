import java.util.ArrayList;
import java.util.Arrays;

public class Testprogram {

    public static void main(String[] args) {


        Arrangement astridS = new Arrangement(1, "AstridS", "Oslo", "TV2", "konsert", 202001011800L);
        Arrangement barneshow = new Arrangement(2, "Barneshow med ..", "Trondheim", "NRK", "underholdning", 202005031400L);
        Arrangement humorshow = new Arrangement(3, "Humorshow", "Oslo", "Privat", "underholdning", 202001011700L);


        ArrayList<Arrangement> arrangementer = new ArrayList<>(Arrays.asList(astridS, barneshow, humorshow));
        ArrangementRegister register = new ArrangementRegister(arrangementer);


        //Registrerer nytt arrangement
        register.regNyttArrangement(4,  "Stand up", "Bergen", "NRK","underholdning" , 202005011800L);

        //Finne alle arrangementer på et gitt sted
        System.out.println("Arrangement på sted: " + register.finnArrangementSted("Oslo").toString());

        //Finn alle arrangementer på en gitt dato
        System.out.println("Arrangement på dato: " + register.finnArrangementDato(20200101));

        //Finne alle arrangementer på et gitt tidsintervall gitt ved to datoer
        System.out.println("Arrangement i løpet av to dager: " + register.arrangementInnenforTid(20200101, 20200501));

        //Finne alle arrangementer sortert på sted
        System.out.println(register.sortertPaaSted().toString());

        //Finne alle arrangementer sortert på type
        System.out.println(register.sortertPaaType().toString());

        //Finne alle arrangementer sortert på tid
        System.out.println(register.sortertPaaTidspunkt().toString());

        System.out.println(register.toString());
    }
}
