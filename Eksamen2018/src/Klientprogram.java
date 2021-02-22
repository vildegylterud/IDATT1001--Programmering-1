import java.util.ArrayList;
import java.util.Arrays;


import static javax.swing.JOptionPane.*;

public class Klientprogram {
    public static void main(String[] args) {

        Soppart kantarell = new Soppart("Kantarell", "Hele soppen er eggeplommegul, kjøttfull og traktformet med gaffelgrenete nedløpende ribber. Trives best i moserik blåbærgranskog og i gammel bjørkeskog.", false);
        Soppart rodFlueSopp = new Soppart("Rød fluesopp", "Rød sopp med prikker. Du finner den i skog med bjørk og gran.", true);
        Soppart gronnFluesopp = new Soppart("Grønn fluesopp", "Grønn sopp. Næringsrik løvskog med eik, men også med bøk og hassel.", true);
        Soppart kongesjampinjong = new Soppart("Kongesjampinjong", "Hatten er først nesten kulerund med avflatet topp, senere mer hvelvet. Næringsrik jord i hager og parker.", false);

        ArrayList<Soppart> sopper = new ArrayList<>(Arrays.asList(kantarell, rodFlueSopp, gronnFluesopp, kongesjampinjong));
        Soppregister soppregister = new Soppregister(sopper);


        String[] muligheter = {"List alle sopparter", "Registrer en ny soppart", "List alle matsopper", "Søk med søkestreng", "Avslutt", "Slett en soppart"};
        final int LIST_ALLE = 0;
        final int REGISTRER_NY_SOPPART = 1;
        final int LIST_MATSOPPER = 2;
        final int DEL_AV_BESKRIVELSE = 3;
        final int AVSLUTT = 4;
        final int SLETT_SOPPART = 5;

        int valg = 0;

            while (valg != AVSLUTT) {
            valg = showOptionDialog(null, "\nVelg funksjon", "Eksamen 2018", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);


            switch (valg) {

                case LIST_ALLE:
                    showMessageDialog(null, soppregister.toString());
                    break;

                case REGISTRER_NY_SOPPART:
                    String navn = showInputDialog("Skriv inn navnet");
                    String beskrivelse = showInputDialog("Skriv inn beskrivelsen til soppen");
                    int giftig = showConfirmDialog(null, "Er soppen giftig?");

                    if (giftig == YES_OPTION) {
                        soppregister.regNySoppart(navn, beskrivelse, true);
                        showMessageDialog(null, "Soppen ble registrert");
                    } else if (giftig == NO_OPTION) {
                        soppregister.regNySoppart(navn, beskrivelse, false);
                        showMessageDialog(null, "Soppen ble registrert");
                    }
                    //else {
                   //     throw new IllegalArgumentException("Det skjedde en feil. Soppen ble ikke registrert ");
                  //  }
                    break;


                case LIST_MATSOPPER:
                    System.out.println(soppregister.getMatsopper().toString());
                    break;


                case DEL_AV_BESKRIVELSE:
                    String sokeString = soppregister.delAvBeskrivelse(showInputDialog("Skriv inn søkestrengen"));
                    System.out.println(sokeString);
                    break;

                case AVSLUTT:
                    System.exit(0);
                    break;

                case SLETT_SOPPART:
                    String sletteSopp = showInputDialog("Skriv inn navnet på soppen du ønsker å slette fra registeret!");

                    if(soppregister.slettSoppart(sletteSopp) == false) {
                        showMessageDialog(null, "Fant ingen soppart med dette navnet.");
                    } else {
                        soppregister.slettSoppart(sletteSopp);
                        showMessageDialog(null, "Soppen er slettet!");
                    }
                    break;
            }
        }
    }
}