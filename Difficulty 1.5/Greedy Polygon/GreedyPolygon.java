import java.util.Scanner;
import java.lang.Math;

public class GreedyPolygon {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double sides = sc.nextDouble();
            double base = sc.nextDouble(); 
            double dist = sc.nextDouble(); 
            double grab = sc.nextDouble(); 
            double total = 0;

            double isos = (sides * Math.pow(base, 2)) / (4 * Math.tan(Math.PI/sides));
            double rec = base * dist * grab * sides;
            double circle = Math.PI * Math.pow((dist * grab), 2);
            
            total = isos + rec + circle;
            System.out.println(total);
        }
    }
}
