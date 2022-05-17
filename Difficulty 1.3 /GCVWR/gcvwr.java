import java.util.Scanner;

public class gcvwr{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double limit = (sc.nextDouble() - sc.nextDouble()) * 0.9;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            limit -= sc.nextDouble();
        }

        System.out.println((int) limit);
    }
}
