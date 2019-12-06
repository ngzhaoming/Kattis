import java.util.Scanner;
import java.util.Arrays;

public class Inflation{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] list = new double[n + 1];
        list[0] = 0;
        for (int i = 1; i < list.length; i++) {
            list[i] = sc.nextDouble();
        }
        Arrays.sort(list);
        boolean flag = false;
        for (int i = 1; i < list.length; i++) {
            double fraction = list[i] / i;
            if (fraction > 1) {
                flag = true;
                break;
            } else {
                list[i] = fraction;
            }
        }

        if (flag) {
            System.out.println("impossible");
        } else {
            Arrays.sort(list);
            if (list[1] % 1 == 0) {
                System.out.println((int) list[1]);
            } else {
                System.out.println(list[1]);
            }
        }
    }
}
