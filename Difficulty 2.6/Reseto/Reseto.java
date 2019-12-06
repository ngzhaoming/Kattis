import java.util.Scanner;
import java.util.TreeSet;

public class Reseto{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n = sc.nextInt();
        TreeSet<Integer> mySet = new TreeSet<>();
        for (int i = 2; i <= limit; i++) {
            mySet.add(i);
        }

        int counter = 0;
        int lastDel = 0;
        while (counter < n) {
            int val = mySet.first();
            int multiple = val;
            int max = mySet.last();
            while (val <= max && counter < n) {
                if (mySet.contains(val)) {
                    mySet.remove(val);
                    lastDel = val;
                    counter++;
                }
                val += multiple;
            }
        }

        System.out.println(lastDel);
    }
}
