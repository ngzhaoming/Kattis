import java.util.Scanner;

public class TaiFormula{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        double prevH = sc.nextDouble();
        double prevL1 = sc.nextDouble();

        for (int i = 0; i < n - 1; i++) {
            double currH = sc.nextDouble();
            double currL1 = sc.nextDouble();
            double calcH = currH - prevH;

            total += findArea(prevL1, currL1, calcH);
            prevL1 = currL1;
            prevH = currH;
        }

        System.out.println(String.format("%.5f", total / 1000));
    }

    public static double findArea(double l1, double l2, double h) {
        return ((l1 + l2) / 2) * h;
    }
}
