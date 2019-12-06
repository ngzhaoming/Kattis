import java.util.Scanner;
import java.util.Arrays;

public class PasswordHacking{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
            sc.next();
            list[i] = sc.nextDouble();
        }
        Arrays.sort(list);
        double prob = 0;
        int counter = 1;
        for (int i = list.length - 1; i >= 0; i--) {
            prob += list[i] * counter;
            counter++;
        }

        System.out.println(prob);
    }
}
