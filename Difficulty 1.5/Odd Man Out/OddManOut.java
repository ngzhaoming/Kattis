import java.util.Scanner;
import java.util.TreeSet;

public class OddManOut{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Long> mySet = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int guests = sc.nextInt();
            for (int j = 0; j < guests; j++) {
                long value = sc.nextLong();
                if (mySet.contains(value)) {
                    mySet.remove(value);
                } else {
                    mySet.add(value);
                }
            }

            System.out.println(String.format("Case #%d: %d", i, mySet.last()));
            mySet.clear();
        }
    }
}
