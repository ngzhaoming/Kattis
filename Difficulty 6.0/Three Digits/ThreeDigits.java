import java.util.Scanner;

public class ThreeDigits{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long result = 1;

        // 5 * 2 gives 10 which we ignore the trailing zeros
        long twos = 0;
        long fives = 0;

        for (int i = 2; i <= n; i++) {
            long temp  = (long) i;
            while(temp % 5 == 0) {
                temp /= 5;
                fives++;
            }

            while(temp % 2 == 0) {
                temp /= 2;
                twos++;
            }

            result = (result * temp) % 1000;
        }

        long diff = twos - fives;

        while(diff > 0) {
            result = (result * 2) % 1000;
            diff--;
        }

        if (n > 6) {
            // Will have more than 3 digits
            System.out.println(String.format("%03d", result));
        } else {
            System.out.println(result);
        }
    }
}
