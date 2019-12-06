import java.util.Scanner;
import java.lang.Math;

public class GrowlingGears{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            int gears = sc.nextInt();
            double highest = -1000;
            int gearNum = -1;
            for (int j = 1; j <= gears; j++) {
                double check = calT(sc.nextDouble(), sc.nextDouble(),
                                    sc.nextDouble());
                if (check > highest) {
                    highest = check;
                    gearNum = j;
                }
            }
            System.out.println(gearNum);
        }
    }

    public static double calT (double a, double b, double c) {
        double R = b / (a * 2);
        double Torque = -a * Math.pow(R, 2) + b * R + c; 
        return Torque;
    }
}
