import java.util.Comparator;

    public class SortertSted implements Comparator<Arrangement> {

        @Override
        public int compare(Arrangement a, Arrangement b) {
            return a.getSted().compareToIgnoreCase(b.getSted());
        }
    }


