import java.util.Scanner;
import java.util.HashSet;

public class CodeCleanups{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> list = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int total = 0;
        int counter = 0;
        int dirty = 0;
        for (int i = 1; i < 366; i++) {
            if (list.contains(i)) {
                dirty++;
            }

            total += dirty;

            if (total >= 20) {
                counter++;
                dirty = 0;
                total = 0;
            }
        }

        if (dirty > 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
