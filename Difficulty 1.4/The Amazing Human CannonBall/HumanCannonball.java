import java.util.Scanner;
import java.lang.Math;

public class HumanCannonball{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double v = sc.nextDouble();
            double thetha = sc.nextDouble();
            double x = sc.nextDouble();
            double h1 = sc.nextDouble();
            double h2 = sc.nextDouble();

            double t = findT(x, thetha, v);
            double y = findY(v, t, thetha);

            if (y > h1 + 1 && y < h2 - 1) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }
    }

    public static double findT(double x, double thetha, double v) {
        double radian = thetha * Math.PI / 180;
        return x / (v * Math.cos(radian));
    }

    public static double findY(double v, double t, double thetha) {
        double radian = thetha * Math.PI / 180;
        return v * t * Math.sin(radian) - 0.5 * 9.81 * Math.pow(t, 2);
    }
}
