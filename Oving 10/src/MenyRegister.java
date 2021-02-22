import java.util.ArrayList;

public class MenyRegister {

    //Objektsvariabler

    private ArrayList<Meny> menyer;
    private ArrayList<Rett> alleRetter;

    //Konstruktør

    public MenyRegister(ArrayList<Meny> menyer, ArrayList<Rett> alleRetter) {
        this.menyer = menyer;
        this.alleRetter = alleRetter;
    }

    //METODER

    // Å registrere en ny rett.

    public Rett regRett(String navn, String type, double pris, String oppskrift) {
        Rett nyRett = new Rett(navn, type, pris, oppskrift);
        this.alleRetter.add(nyRett);
        return nyRett;
    }

    //(hvis tid få med loop som sjekker om retten finnes allerede)

    // Å registrere en ny meny som består av ett sett med retter.

    public void regMeny(String NAVN, ArrayList<Rett> retter ) {
        Meny nyMeny = new Meny(NAVN, retter);
        for(int i=0; i < alleRetter.size(); i++ ) {
            if(!menyer.get(i).equals(nyMeny)) {
            }
            menyer.add(nyMeny);
        }
        }

    //(hvis tid få med en loop som sjekker om retten finnes fra før av)

    // Å finne en rett, gitt navnet.

    public String finnRett(String navn) {
        for(int i=0; i < alleRetter.size(); i++) {
            if(alleRetter.get(i).getNavn().equals(navn)) {
               return "Ja! Retten finnes.";
            }
        }
        return "Retten finnes ikke!";
    }


    // Å finne alle retter av en gitt type.

    public ArrayList<Rett> finnRettType(String type) {
        ArrayList<Rett> typeRett = new ArrayList<>();
        for(int i=0; i < alleRetter.size(); i++) {
            if(alleRetter.get(i).getType().equals(type)) {
                typeRett.add(alleRetter.get(i));
            }
        }
        return typeRett;
    }


    // Å finne alle menyer med totalpris innenfor et gitt intervall.

    public String finnMenyPris(double minPris, double maxPris) {
        ArrayList<Meny> prisMeny = new ArrayList<>();
        for (int i = 0; i < menyer.size(); i++) {
            if (menyer.get(i).getPris() > minPris && menyer.get(i).getPris() < maxPris) {
                return menyer.get(i).getNAVN();
            }
        }
        return "Finner ingen menyer innenfor denne prisen!";
    }

    //toString- metode

    @Override
    public String toString() {
        return "MenyRegister " +
                "menyer= " + menyer +
                ", alleRetter=" + alleRetter +
                '}';
    }
}
