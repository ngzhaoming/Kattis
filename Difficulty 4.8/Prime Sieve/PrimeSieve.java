import java.util.Scanner;
import java.util.BitSet;

public class PrimeSieve {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = sc.nextInt();

        // By default the value will be set to false
        BitSet prime = new BitSet(n + 1);

        for (int i = 2; i * i <= n; i++) {
            if (prime.get(i) == false) {
                for (int j = i * i; j <= n; j += i) {
                    prime.set(j);
                }
            }
        }

        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (prime.get(i) == false) {
                counter++;
            }
        }

        System.out.println(counter);

        for (int i = 0; i < num; i++) {
            int currNum = sc.nextInt();
            if (prime.get(currNum) || currNum == 1) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
