import java.util.Scanner;
import java.lang.Math;

public class DifferentDistances{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double X1 = sc.nextDouble();
            if (X1 == 0) {
                break;
            } else {
                double Y1 = sc.nextDouble();
                double X2 = sc.nextDouble();
                double Y2 = sc.nextDouble();
                double pNorm = sc.nextDouble();
                double diff1 = Math.pow(Math.abs(X1 - X2), pNorm);
                double diff2 = Math.pow(Math.abs(Y1 - Y2), pNorm);
                System.out.println(Math.pow(diff1 + diff2, 1/pNorm));
            }
        }
    }
}
