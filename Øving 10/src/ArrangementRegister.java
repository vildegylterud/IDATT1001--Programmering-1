import java.net.SocketOption;
import java.util.Arrays;
import java.util.*;
import java.util.Collection;

public class ArrangementRegister {

    private ArrayList<Arrangement> arrangementer;
    private ArrayList<Arrangement> sortertListe= new ArrayList<>();
    //brukes for å finne arrangementer på et
    // gitt tidspunkt, sted eller type
    private int nummer = arrangementer.size()+ 1;

    public ArrangementRegister(ArrayList<Arrangement> arrangementer){
        this.arrangementer = arrangementer;
    }

    // Å registrere et nytt arrangement

    public void regNyttArrangement(int nummer,String navn, String sted, String arrangor, String type, long tidspunkt) {
        Arrangement nyttArrangement = new Arrangement(arrangementer.size()+1 , navn, sted, arrangor, type, tidspunkt);
        arrangementer.add(nyttArrangement);
    }

    // Å finne alle arrangementer på et gitt sted

    public ArrayList<Arrangement> finnArrangementSted(String bestemtSted) {
        ArrayList<Arrangement> arrangementerSted = new ArrayList<>();
        for(int i=0; i < arrangementer.size(); i++) {
            if(arrangementer.get(i).getSted().equals(bestemtSted)) {
                arrangementerSted.add(arrangementer.get(i));
            }
        }
        return arrangementerSted;
    }

    //Å finne alle arrangementer på en gitt dato

    public ArrayList<Arrangement> finnArrangementDato(int dato) {
        ArrayList<Arrangement> likDato = new ArrayList<>();
        for(int i=0; i < arrangementer.size(); i++) {
            int nyDato = Integer.parseInt(Long.toString(arrangementer.get(i).getTidspunkt()).substring(0,8));
            if(nyDato == dato) {
                likDato.add(arrangementer.get(i));

            }
        }
        return likDato;
    }

    //Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal være sortert på tid.

    public ArrayList<Arrangement> arrangementInnenforTid(int dato1, int dato2) {
        ArrayList<Arrangement> arrangementerTidSortert = new ArrayList<>();
        for(int i=0; i < arrangementer.size(); i++) {
            int nyTid = Integer.parseInt((Long.toString(arrangementer.get(i).getTidspunkt()).substring(0,8)));
            if(dato1 <= nyTid && nyTid <= dato2 ) {
                arrangementerTidSortert.add(arrangementer.get(i));
                arrangementerTidSortert.trimToSize();
                Collections.sort(arrangementerTidSortert, new SortertTid());
            }
        }
        return arrangementerTidSortert;
    }

    //Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og tidspunkt.

    public ArrayList<Arrangement> sortertPaaSted() {
        sortertListe.addAll(arrangementer);
        Collections.sort(sortertListe, new SortertSted());
        return sortertListe;
    }

    public ArrayList<Arrangement> sortertPaaType() {
        sortertListe.addAll(arrangementer);
        Collections.sort(sortertListe, new SortertType());
        return sortertListe;

    }

    public ArrayList<Arrangement> sortertPaaTidspunkt() {
        sortertListe.addAll(arrangementer);
        Collections.sort(sortertListe, new SortertTid());
        return sortertListe;
    }
}


