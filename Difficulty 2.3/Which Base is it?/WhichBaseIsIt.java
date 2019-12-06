import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class WhichBaseIsIt{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            long num = sc.nextLong();
            long octal = findOctal(num);
            long hex = findHexa(num);
            System.out.println(String.format("%d %d %d %d", data, octal, num, hex));
        }
    }

    public static long findOctal(long num) {
        long counter = 0;
        long total = 0;
        boolean flag = true;

        while (num > 0) {
            long remainder = num % 10;
            if (remainder >= 8) {
                flag = false;
                break; 
            } else {
                total += ((remainder) * Math.pow(8, counter));
                num /= 10;
                counter++;
            }
        }

        if (flag) {
            return total;
        } else {
            return 0;
        }
    }

    public static long findHexa(long num) {
        long counter = 0;
        long total = 0;
        while (num > 0) {
            long remainder = num % 10;
            total += (remainder * Math.pow(16, counter));
            num /= 10;
            counter++;
        }
        return total;
    }
}
