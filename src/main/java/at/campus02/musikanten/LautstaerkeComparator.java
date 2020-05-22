package at.campus02.musikanten;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {
    @Override
    public int compare(Musikant m1, Musikant m2) {
        return Double.compare(m2.spieleMusik(), m1.spieleMusik());
    }
}
