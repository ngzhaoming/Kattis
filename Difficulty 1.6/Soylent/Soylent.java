import java.util.Scanner;

public class Soylent{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double calories = sc.nextDouble();
            double total = calories / 400;
            if (total % 1 == 0) {
                System.out.println((int) total);
            } else {
                System.out.println((int) total + 1);
            }
        }
    }
}
