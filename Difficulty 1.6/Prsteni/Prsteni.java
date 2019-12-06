import java.util.Scanner;
import java.util.TreeSet;

public class Prsteni{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int next = sc.nextInt();
            int gcd = findGCD(first, next);
            int numerator = first / gcd;
            int denominator = next / gcd;
            System.out.println(String.format("%d/%d", numerator, denominator));
        }
    }

    public static int findGCD(int first, int next) {
        int highest = 0;
        for (int i = next; i > 0; i--) {
            if (first % i == 0 && next % i == 0) {
                highest = i;
                break;
            }
        }
        return highest;
    }
}
