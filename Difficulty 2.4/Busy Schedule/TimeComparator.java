import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {
    public int compare (Time t1, Time t2) {
        if (t1.type.equals("a.m.") && t2.type.equals("p.m.")) {
            return -1;
        } else if (t1.type.equals("p.m.") && t2.type.equals("a.m.")) {
            return 1;
        } else { //Both the same
            if (t1.hour == t2.hour) { // Same hour
                if (t1.min == t2.min) {
                    return 0;
                } else if (t1.min < t2.min) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (t1.hour == 12) {
                return -1;
            } else if (t2.hour == 12) {
                return 1;
            } else if (t1.hour > t2.hour) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
