import java.util.Scanner;

public class StandOnZanzibar{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double prevVal = sc.nextDouble();
            int total = 0;
            while (sc.hasNext()) {
                double value = sc.nextDouble();
                if (value == 0) {
                    break;
                } else if (value / 2 > prevVal) {
                    total += (int) value - prevVal * 2; 
                }
                prevVal = value;
            }
            System.out.println(total);
        }
    }
}
