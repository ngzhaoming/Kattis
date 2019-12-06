import java.util.Comparator;

public class LettersComparator implements Comparator<Letters> {
    public int compare (Letters l1, Letters l2) {
        if (l1.num < l2.num) {
            return -1;
        } else if (l1.num == l2.num)  {
            return 0;
        } else {
            return 1;
        }
    }
}
