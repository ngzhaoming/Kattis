import java.util.Scanner;
import java.math.BigInteger;

public class AnotherCandies{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            BigInteger total = new BigInteger("0");
            int children = sc.nextInt();
            sc.nextLine();
            BigInteger numChild = new BigInteger(children + "");
            for (int j = 0; j < children; j++) {
                BigInteger curr = new BigInteger(sc.nextLine());
                total = total.add(curr);
            }
            if (total.remainder(numChild).toString().equals("0")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
