import java.util.Scanner;
import java.util.TreeSet;

public class Parking{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            TreeSet<Integer> mySet = new TreeSet<>();
            int stores = sc.nextInt();
            for (int j = 0; j < stores; j++) {
                int distance = sc.nextInt();
                mySet.add(distance);
            }
            int diff = mySet.last() - mySet.first();
            System.out.println(diff * 2);
        }

    }
}
