import java.util.Scanner;
import java.lang.Math;

public class HalfCookie {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double radius = sc.nextDouble();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            sc.nextLine();

            boolean isInside = calcPt(radius, x, y);

            if (isInside) {
                double shortDist = calcDist(x, y);
                double angle = calcAngle(shortDist, radius);

                double totalArea = Math.PI * Math.pow(radius, 2);

                double sector = calcSector(angle, radius);
                double larger = totalArea - sector;

                System.out.println(String.format("%.6f %.6f", larger, sector));
            } else {
                System.out.println("miss");
            }
        }
    }

    public static boolean calcPt(double radius, double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2);
    }

    public static double calcDist(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double calcAngle(double shortDist, double radius) {
        return Math.acos(shortDist / radius);
    }

    public static double calcSector(double angle, double radius) {
        return (angle * 2 - Math.sin(angle * 2)) / 2 * Math.pow(radius, 2);
    }
}
