import java.util.Scanner;
import java.util.TreeSet;

public class Statistics{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            TreeSet<Integer> mySet = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                mySet.add(value);
            }

            int lowest = mySet.first();
            int highest = mySet.last();
            int range = highest - lowest;
            System.out.println(String.format("Case %d: %d %d %d", counter, lowest, highest, range));
            counter++;
        }
    }
}
