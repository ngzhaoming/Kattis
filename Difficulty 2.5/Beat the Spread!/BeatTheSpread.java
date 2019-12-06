import java.util.Scanner;

public class BeatTheSpread{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x, y;
            double sum = sc.nextDouble();
            double diff = sc.nextDouble();
            y = (sum - diff) / 2;
            if (y < 0 || y % 1 != 0) {
                System.out.println("impossible");
            } else {
                x = diff + y;
                System.out.println(String.format("%d %d", (int) x, (int) y));
            }
        }
    }
}
