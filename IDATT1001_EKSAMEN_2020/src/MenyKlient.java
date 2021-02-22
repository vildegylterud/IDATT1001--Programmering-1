import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JOptionPane.*;
/**
 * Kandidatnr: 10115
 * Dette er et menystyrt klientprogram
 * IDATT1001, des 2020
 */

public class MenyKlient {

    public static void main(String []args){

        CovidRegistrering norge_14des = new CovidRegistrering("Norge", 5, 1); //første jeg lagde
        CovidRegistrering china_14des = new CovidRegistrering("China", 100, 10);
        CovidRegistrering sverige_14des = new CovidRegistrering("Sverige", 50, 5);

        ArrayList<CovidRegistrering> covidRegistreringer = new ArrayList<>(Arrays.asList(norge_14des, china_14des, sverige_14des));
        CovidRegister register = new CovidRegister(covidRegistreringer);

        String [] muligheter = {"List all informasjon", "Registrering", "Finn første registrering på gitt dato", "Finn alle registeringer på gitt dato", "Finn antall døde i et gitt navn",  "Finn antall registrering som er blitt gjort", "Avslutt"};
        final int LIST_ALLE= 0;
        final int REGISTRERE = 1;
        final int SOKE_PA_DATO = 2;
        final int SOKE_PA_DATOER = 3;
        final int FINN_ANTALL_DODE= 4;
        final int ANTALL_REGISTRERINGER = 5;
        final int AVSLUTT= 6;


        int valg = showOptionDialog(null, "NAVN PÅ REGISTER EL." + "\nVelg funksjon", "Eksamen des 2020", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
        while(valg != AVSLUTT) {
            switch (valg) {

                case LIST_ALLE:
                    showMessageDialog(null, register.toString());
                    break;

                case REGISTRERE:
                String land = showInputDialog(null, "Skriv inn navnet på landet");
                int smitta = Integer.parseInt(showInputDialog(null, "Skriv inn antall smittede"));
                int dode = Integer.parseInt(showInputDialog(null, "Skriv inn antall døde"));
                if(register.regNyCovid(land, smitta, dode)) {
                    register.regNyCovid(land, smitta, dode);
                    showMessageDialog(null, "Registreringen er velykket!");
                } else {
                    showMessageDialog(null, "Noe gikk galt. Registreringen gikk ikke igjennom");
                }
                break;

                case SOKE_PA_DATO:
                    CharSequence dato = showInputDialog(null, "Skriv inn ønsket dato på formen yyyy-mm-dd");
                    showMessageDialog(null, register.sokePaDato(dato));

                    break;

                case SOKE_PA_DATOER:
                    CharSequence dato2 = showInputDialog(null, "Skriv inn ønsket dato på formen yyyy-mm-dd");
                    showMessageDialog(null, register.sokePaDatoer(dato2));

                    break;

                case FINN_ANTALL_DODE:
                    String land1 = showInputDialog(null, "Skriv inn landet vi skal sjekke for");
                    showMessageDialog(null, register.antallDode(land1));

                     break;


                case ANTALL_REGISTRERINGER:
                    showMessageDialog(null, register.antallRegistreringer());
                    break;

                default: break;

    }
            valg = showOptionDialog(null, "NAVN" + "\nVelg funksjon", "Eksamen des 2020", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
        }
    }
}
