import java.util.Scanner;
import java.lang.Math;

public class Herman{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println(String.format("%.6f", Math.pow(radius, 2) *
                                                    Math.PI));
        System.out.println(String.format("%.6f", 4 * Math.pow(radius, 2) / 2));
    }
}
