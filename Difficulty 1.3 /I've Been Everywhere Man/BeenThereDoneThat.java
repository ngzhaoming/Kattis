import java.util.Scanner;
import java.util.HashSet;

public class BeenThereDoneThat{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            HashSet<String> mySet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                mySet.add(sc.next());
            }
            System.out.println(mySet.size());
        }
    }
}
