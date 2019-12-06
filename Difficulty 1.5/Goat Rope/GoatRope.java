import java.util.Scanner;
import java.lang.Math;
import java.util.TreeSet;

public class GoatRope{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double goatX = sc.nextDouble();
        double goatY = sc.nextDouble();
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        double X2 = sc.nextDouble();
        double Y2 = sc.nextDouble();
        if (goatX >= X1 && goatX <= X2) {
            double diffY1 = Math.abs(goatY - Y1);
            double diffY2 = Math.abs(goatY - Y2);
            System.out.println(String.format("%.3f", Math.min(diffY1, diffY2)));
        } else if (goatY >= Y1 && goatY <= Y2) {
            double diffX1 = Math.abs(goatX - X1);
            double diffX2 = Math.abs(goatX - X2);
            System.out.println(String.format("%.3f", Math.min(diffX1, diffX2)));
        } else {
            System.out.println(String.format("%.3f", 
                        findShortest(X1, Y1, X2, Y2, goatX, goatY)));
        }
    }

    public static double findShortest(double X1, double Y1, double X2, double Y2, double goatX, double goatY) {
        TreeSet<Double> distance = new TreeSet<>();
        double diff1 = Math.sqrt(Math.pow(X1 - goatX, 2) + Math.pow(Y1 - goatY, 2));
        double diff2 = Math.sqrt(Math.pow(X1 - goatX, 2) + Math.pow(Y2 - goatY, 2));
        double diff3 = Math.sqrt(Math.pow(X2 - goatX, 2) + Math.pow(Y1 - goatY, 2));
        double diff4 = Math.sqrt(Math.pow(X2 - goatX, 2) + Math.pow(Y2 - goatY, 2));
        distance.add(diff1);
        distance.add(diff2);
        distance.add(diff3);
        distance.add(diff4);
        return distance.first();
    }
}
