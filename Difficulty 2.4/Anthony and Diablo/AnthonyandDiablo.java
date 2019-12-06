import java.util.Scanner;
import java.lang.Math;

public class AnthonyandDiablo{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double length = sc.nextDouble();
        double rad = length / Math.PI / 2;
        double maxA = Math.PI * Math.pow(rad, 2);
        if (maxA >= A) {
            System.out.println("Diablo is happy!");
        } else {
            System.out.println("Need more materials!");
        }
    }
}
