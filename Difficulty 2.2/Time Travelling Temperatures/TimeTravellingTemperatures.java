import java.util.Scanner;

public class TimeTravellingTemperatures{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //b - x = a;
        //yb = a;
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == 0 && y == 1) {
            System.out.println("ALL GOOD");
        } else if (x != 0 && y == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            double total = (-x / (y - 1));
            if (total % 1 == 0) {
                System.out.println((int) total);
            } else {
                System.out.println(total);
            }
        }
    }
}
