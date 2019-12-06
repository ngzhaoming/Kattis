import java.util.Scanner;
import java.lang.Math;

public class TemperatureConfusion{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] faren = sc.nextLine().split("/");
        int num = Integer.parseInt(faren[0]);
        int denom = Integer.parseInt(faren[1]);

        num -= (32 * denom);
        if (num != 0) {
            num *= 5;
            denom *= 9;
        }

        if (num != 0) {
            int gcd = findGcd(num, denom);
            System.out.println(String.format("%d/%d", (num / gcd), (denom / gcd)));
        } else {
            System.out.println(String.format("%d/%d", num, 1));
        }
    }

    public static int findGcd(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        int low = Math.min(n1, n2);
        int gcd = 0;
        for (int i = 1; i <= low; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
