import java.util.Scanner;
import java.lang.Math;

public class DiceCup {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int M, N;

        M = sc.nextInt();
        N = sc.nextInt();
        int smallest = Math.min(M, N);
        int largest = Math.max(M, N);

        for (int i = smallest + 1; i <= largest + 1; i++) {
            System.out.println(i);
        }
    }
}
