import java.util.Scanner;
import java.lang.Math;

public class EstimatingAreaofCircle{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double radius = sc.nextDouble();
            if (radius == 0) {
                break;
            }
            double total = sc.nextDouble();
            double fraction = sc.nextDouble() / total;
            double areaCircle = Math.PI * Math.pow(radius, 2);
            double estimated = Math.pow(radius * 2, 2) * fraction;
            System.out.println(String.format("%f %f", areaCircle, estimated));
        }
    }
}
