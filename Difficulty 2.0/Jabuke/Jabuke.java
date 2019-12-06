import java.util.Scanner;
import java.lang.Math;

public class Jabuke{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double area = calArea(x1, y1, x2, y2, x3, y3);
        System.out.println(String.format("%.1f", area));

        int n = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            double currX = sc.nextDouble();
            double currY = sc.nextDouble();
            double area1 = calArea(x1, y1, x2, y2, currX, currY);
            double area2 = calArea(x1, y1, currX, currY, x3, y3);
            double area3 = calArea(currX, currY, x2, y2, x3, y3);
            if (area1 + area2 + area3 == area) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static double calArea(double x1, double y1, double x2, double y2, 
        double x3, double y3) {
        double num = Math.abs(x1 * (y2 - y3) + x2  * (y3 - y1) + x3 * (y1 - y2));
        return num / 2;
    }
}
