import java.util.Scanner;
import java.lang.Math;

public class SumSquaredDigits{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int dataSet = sc.nextInt();
            long base = sc.nextLong();
            long value = sc.nextLong();
            
            long conversion = convertBase(value, base);
            System.out.print(dataSet + " " + conversion);
            System.out.println();
        }
    }

    public static long convertBase(long value, long base) {
        long result = 0;
        while(value > 0) {
            result += Math.pow((value % base), 2);
            value /= base;
        }

        return result;
    }
}
