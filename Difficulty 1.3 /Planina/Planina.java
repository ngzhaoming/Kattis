import java.util.Scanner;
import java.lang.Math;

public class Planina{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long addition = 0;

        for (int i = 0; i < N; i++) {
            addition += Math.pow(2, i);
        }

        System.out.println((long) Math.pow(addition + 2, 2));
    }
}
