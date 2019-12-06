import java.util.Scanner;
import java.lang.Math;

public class ARealChallenge{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double total = Math.sqrt(n) * 4;
        if (total % 1 == 0) {
            System.out.println((int) total);
        } else {
            System.out.println(total);
        }
    }
}
