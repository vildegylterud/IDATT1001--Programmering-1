/** Dette er Test-klientprogrammet til klassen Brokregner **/

public class KlientBrok {

        public static void main(String [] args) {

            Brokregning brok1 = new Brokregning(1, 2);
            Brokregning brok2 = new Brokregning(1, 4);

            // addering test

            brok1.summer(brok2);
            //System.out.println(brok1.getTeller()+"/" + brok1.getNevner());
            brok1.toString();

            // subtrahering test

            brok1.subtraher(brok2);
            brok1.toString();

            // dividering test

            brok1.dividere(brok2);
            brok1.toString();

            // multiplisering test

            brok1.multiplisere(brok2);
            brok1.toString();

        }
    }
