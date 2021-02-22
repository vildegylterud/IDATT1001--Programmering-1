import static javax.swing.JOptionPane.*;

public class MenyKlient {
        public static void main(String[] args){

            Hjelpemiddelsentral ntnu = new Hjelpemiddelsentral("NTNU-sentralen");

            ntnu.regNyttHjelpemiddel(1001, "Høreapparat");
            ntnu.regNyttHjelpemiddel(1002, "Høreapparat");
            ntnu.regNyttHjelpemiddel(1003, "Høreapparat");
            ntnu.regNyttHjelpemiddel(2001, "Samtaleforsterker");
            ntnu.regNyttHjelpemiddel(2002, "Samtaleforsterker");
            ntnu.regNyttHjelpemiddel(2003, "Samtaleforsterker");
            ntnu.regNyttHjelpemiddel(3001, "Varslingsutstyr");
            ntnu.regNyttHjelpemiddel(3002, "Varslingsutstyr");
            ntnu.regNyttHjelpemiddel(3003, "Varslingsutstyr");

            ntnu.regUtleie(1001, "Per Olsen");
            ntnu.regUtleie(2001, "Per Olsen");
            ntnu.regUtleie(3001, "Per Olsen");

            String [] muligheter = {"List all informasjon", "Registrer nytt hjelpemiddel", "Registrer Utlån", "Registrer innlevering", "Avslutt"};
            final int LIST_ALLE = 0;
            final int REGISTRER_NYTT_HJELPEMIDDEL = 1;
            final int UTLEVERING_AV_HJELPEMIDDEL = 2;
            final int INNLEVERING_AV_HJELPEMIDDEL = 3;
            final int AVSLUTT = 4;

            int valg = showOptionDialog(null, "Hjelpemiddelsentralen " + ntnu.getNavn() + "\nVelg funksjon", "Eksamen des 2019", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
            while (valg != AVSLUTT){
                switch (valg){
                    case LIST_ALLE:
                        //Printer ut toString.metoden
                        showMessageDialog(null, ntnu.toString());
                        break;
                    case REGISTRER_NYTT_HJELPEMIDDEL:
                        String ID = showInputDialog("Skriv inn ID til hjelpemiddelet");
                        int ID_Lest = Integer.parseInt(ID);
                        String type = showInputDialog("Skriv inn type hjelpemiddel");

                        if(ntnu.regNyttHjelpemiddel(ID_Lest, type)){
                            showMessageDialog(null, "Apparatet ble registert");
                        }
                        else{
                            showMessageDialog(null, "Apparatet ble ikke registert fordi det skjedde en feil. Sjekk at IDen er innenfor intervallet 1001-9999 og at den ikke allerede er i bruk");
                        }

                        break;
                    case UTLEVERING_AV_HJELPEMIDDEL:
                        String IDPaaApparat = showInputDialog("Hvilken ID har apparatet du ønsker å registere?");
                        int IDPaaApparatLest = Integer.parseInt(IDPaaApparat);
                        String navnPaaUtleier = showInputDialog("Hva er navnet på den nye utleieren?");
                        //Sjekker om utleien ble registert
                        if(ntnu.regUtleie(IDPaaApparatLest, navnPaaUtleier)){
                            showMessageDialog(null, "Leien av utstyr ble registert");
                        }
                        else{
                            showMessageDialog(null, "Apparatet du prøvde å leie er enten allerede leid eller ikke eksisterende");
                        }
                        break;
                    case INNLEVERING_AV_HJELPEMIDDEL:
                        String IDPaaApparatet = showInputDialog("Hvilken ID har apparatet du ønsker å avslutte leien på?");
                        int IDPaaApparatetLest = Integer.parseInt(IDPaaApparatet);
                        //Sjekker om avslutningen av leie ble registert
                        if(ntnu.avsluttLeie(IDPaaApparatetLest)){
                            showMessageDialog(null, "Apparatet er ikke lenger leid");
                        }
                        else{
                            showMessageDialog(null, "Det skjedde en feil. Sjekk at ID er korrekt");
                        }
                        break;
                    default: break;
                }
                valg = showOptionDialog(null, "Hjelpemiddelsentralen " + ntnu.getNavn() + "\nVelg funksjon", "Eksamen des 2019", YES_NO_OPTION,INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
            }
        }
    }