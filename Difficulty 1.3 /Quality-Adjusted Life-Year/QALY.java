import java.util.Scanner;

public class QALY{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        double total = 0;

        for (int i = 0; i < N; i++) {
            total += sc.nextDouble() * sc.nextDouble();
        }

        System.out.println(String.format("%.3f", total));
    }
}
