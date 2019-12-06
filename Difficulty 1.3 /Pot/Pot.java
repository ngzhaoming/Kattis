import java.util.Scanner;
import java.lang.Math;

public class Pot{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N, currNum;
        long total = 0;
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            currNum = sc.nextInt();
            total += Math.pow(currNum / 10, currNum % 10);
        }

        System.out.println(total);
    }
}
