import java.util.Scanner;

public class Tarifa{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int X, N;

        X = sc.nextInt();
        N = sc.nextInt();
        int result = X * (N + 1);

        for (int i = 0; i < N; i++) {
            result -= sc.nextInt();
        }

        System.out.println(result);
    }
}
