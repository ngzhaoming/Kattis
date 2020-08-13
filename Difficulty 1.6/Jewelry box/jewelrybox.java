import java.util.Scanner;
import java.lang.Math;

public class jewelrybox {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();            
            int y = sc.nextInt();            

            int a = 12;
            int b = (-4) * (x + y);
            int c = (x * y);

            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            
            double v1 = 4 * Math.pow(r1, 3) - 2 * x * Math.pow(r1, 2) - 2 * y * Math.pow(r1, 2) + x * y * r1;
            double v2 = 4 * Math.pow(r2, 3) - 2 * x * Math.pow(r2, 2) - 2 * y * Math.pow(r2, 2) + x * y * r2;

            if (v2 > v1) {
                System.out.println(v2);
            } else {
                System.out.println(v1);
            }
        }
    }
}
