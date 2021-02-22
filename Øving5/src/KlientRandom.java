public class KlientRandom {

    public static void main(String[] args) {

        RandomTall randomTall = new RandomTall();

        int runde = 0;
        int nedreHeltall = 0;
        int ovreHeltall = 10;
        double nedreDesimaltall = 0;
        double ovreDesimaltall = 0.5;


        while (runde < 1) { //Kjører x antall ganger
            int helTall = RandomTall.nesteHeltall(nedreHeltall, ovreHeltall);
            double desimalTall = RandomTall.nesteDesimaltall(nedreDesimaltall, ovreDesimaltall);

            System.out.println("Heltall: " + helTall + "    Desimaltall: " + desimalTall); //Skriver ut heltall og desimaltall

            if (helTall > ovreHeltall || helTall < nedreHeltall){ //Sjekker om det er større eller mindre enn grense
                System.out.println("Feil");
                break; //Bryter ut av loop og avslutter program
            }
            else if (desimalTall > ovreHeltall || desimalTall < nedreHeltall) { //Sjekker om det er større eller mindre enn grense
                System.out.println("Feil");
                break; //Bryter ut av loop og avslutter program
            }

            runde++; //Legger til en på rundeteller
        }
    }
}


