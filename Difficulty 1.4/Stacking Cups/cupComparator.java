import java.util.Comparator;

public class cupComparator implements Comparator<cups> {
    public int compare(cups c1, cups c2) {
        int diff = c1.size - c2.size;

        if (diff < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
