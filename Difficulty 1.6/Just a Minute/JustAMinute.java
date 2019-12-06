import java.util.Scanner;

public class JustAMinute{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double stated = 0;
        double observed = 0;
        for (int i = 0; i < n; i++) {
            stated += sc.nextDouble();
            observed += sc.nextDouble();
        }

        double result = observed / (stated * 60);
        if (result <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(String.format("%.9f", result));
        }
    }
}
