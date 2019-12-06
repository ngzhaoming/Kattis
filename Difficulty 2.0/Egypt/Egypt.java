import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Egypt{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double val1 = sc.nextLong();
            if (val1 == 0) {
                break;
            }

            double[] length = {val1, sc.nextLong(), sc.nextLong()};
            Arrays.sort(length);
            double total = Math.pow(length[0], 2) + Math.pow(length[1], 2);
            double longest = Math.pow(length[2], 2);
            if (longest == total) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
