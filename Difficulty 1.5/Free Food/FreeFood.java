import java.util.Scanner;
import java.util.TreeSet;

public class FreeFood{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> mySet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                mySet.add(j);
            }
        }

        System.out.println(mySet.size());
    }
}
