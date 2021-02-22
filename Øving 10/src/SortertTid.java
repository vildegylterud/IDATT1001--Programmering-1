import java.util.Comparator;

public class SortertTid implements Comparator<Arrangement> {
    @Override
    public int compare(Arrangement a, Arrangement b) {
        return (int) (a.getTidspunkt() - b.getTidspunkt());
    }


}
