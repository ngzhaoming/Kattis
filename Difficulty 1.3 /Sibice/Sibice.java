import java.util.Scanner;
import java.lang.Math;

public class Sibice{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double N, W, H, length;
        N = sc.nextInt();
        W = sc.nextInt();
        H = sc.nextInt();
        int limit = (int) Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            length = sc.nextInt();
            if (length <= limit) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
