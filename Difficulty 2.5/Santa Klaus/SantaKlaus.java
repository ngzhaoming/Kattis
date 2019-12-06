import java.util.Scanner;
import java.lang.Math;

public class SantaKlaus{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int angle = sc.nextInt();
        if (angle <= 180) {
            System.out.println("safe");
        } else if (angle == 270) {
            System.out.println(height);
        } else if (angle < 270) {
            angle -= 180;
            double radAngle = (double) angle / 180 * Math.PI;
            double length = (double) height / Math.sin(radAngle);
            System.out.println((int)length);
        } else {
            angle = 360 - angle;
            double radAngle = (double) angle / 180 * Math.PI;
            double length = (double) height / Math.sin(radAngle);
            System.out.println((int)length);
        }
    }
}
