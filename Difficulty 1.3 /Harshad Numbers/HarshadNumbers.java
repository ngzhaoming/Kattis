import java.util.Scanner;

public class HarshadNumbers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        boolean flag = true;

        while (flag) {
            if (checkHarshad(digit)) {
                break;
            } else {
                digit++;
            }
        }

        System.out.println(digit);
    }

    public static boolean checkHarshad(int digit) {
        int total = 0;
        int temp = digit;
        while (temp > 0) {
            total += temp % 10;
            temp /= 10;
        }

        if (((double) digit / total) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
