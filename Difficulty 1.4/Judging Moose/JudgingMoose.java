import java.util.Scanner;
import java.lang.Math;

public class JudgingMoose{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        if (v1 == v2) {
            if (v1 != 0) {
                System.out.println("Even " + v1 * 2);
            } else {
                System.out.println("Not a moose");
            }
        } else {
            int highest = Math.max(v1, v2);
            System.out.println("Odd " + highest * 2);
        }
    }
}
