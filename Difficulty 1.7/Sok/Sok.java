import java.util.Scanner;
import java.util.Arrays;

public class Sok{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double[] initial = new double[3];
        double[] ratio = new double[3];
        double[] rate = new double[3];
        for (int i = 0; i < 3; i++) {
            initial[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            ratio[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            rate[i] = initial[i] / ratio[i];
        }
        Arrays.sort(rate);
        double lowest = rate[0];
        double diff1 = initial[0] - (ratio[0] * lowest);
        double diff2 = initial[1] - (ratio[1] * lowest);
        double diff3 = initial[2] - (ratio[2] * lowest);
        System.out.println(String.format("%f %f %f", diff1, diff2, diff3));
    }
}
