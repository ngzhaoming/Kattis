import java.util.Scanner;
import java.lang.Math;

public class Skocimis{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int diff1 = B - A;
        int diff2 = C - B;
        System.out.println(Math.max(diff1, diff2) - 1);
    }
}
