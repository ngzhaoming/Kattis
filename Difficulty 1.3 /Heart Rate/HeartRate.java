import java.util.Scanner;

public class HeartRate{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int b = sc.nextInt();
            double p = sc.nextDouble();
            double time = 60 / p;
            double bpm = (60 * b) / p;
            double minabpm = bpm - time;
            double maxabpm = bpm + time;

            System.out.print(String.format("%.4f", minabpm));
            System.out.print(String.format(" %.4f", bpm));
            System.out.print(String.format(" %.4f", maxabpm));
            System.out.println();
        }
    }
}
