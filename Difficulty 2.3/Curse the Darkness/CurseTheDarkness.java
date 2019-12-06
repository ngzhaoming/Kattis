import java.util.Scanner;
import java.lang.Math;

public class CurseTheDarkness{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int candles = sc.nextInt();
            boolean flag = true;
            for (int j = 0; j < candles; j++) {
                double currX = sc.nextDouble();
                double currY = sc.nextDouble();
                double calc = Math.pow((currX - x), 2) + Math.pow((currY - y), 2);
                if (calc < 64 && flag) {
                    System.out.println("light a candle");
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("curse the darkness");
            }
        }
    }
}
