import java.util.Scanner;
import java.lang.Math;

public class Ornaments{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double r = sc.nextDouble();
            double h = sc.nextDouble();
            double percent = sc.nextDouble();
            if (r == 0 && h == 0) {
                break;
            }
            double sides = Math.sqrt(Math.pow(h, 2) - Math.pow(r, 2)); //Add
            double semi = Math.PI * r; //Add
            double angle = Math.toDegrees(Math.asin((sides / h)));
            angle = 90 - angle;
            double curves = (angle / 360) * 2 * Math.PI * r;
            double total = 2 * sides + semi + 2 * curves;
            total += (percent / 100) * total;
            System.out.println(String.format("%.2f", total));
        }
    }
}
