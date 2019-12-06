import java.util.Scanner;
import java.lang.Math;

public class DasBlinkenlights{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int limit = sc.nextInt();
        int first = lcm(a, b);
        if (first <= limit) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static int lcm (int a, int b) {
        int lcm = Math.max(a, b);
        int max = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            } else {
                lcm += max;
            }
        }
        return lcm;
    }
}
