import java.util.Comparator;

public class SortertType implements Comparator<Arrangement> {

        @Override
        public int compare(Arrangement a, Arrangement b) {
            return a.getType().compareToIgnoreCase(b.getType());
        }
    }