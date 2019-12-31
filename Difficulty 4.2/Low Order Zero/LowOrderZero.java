import java.util.Scanner;

public class LowOrderZero {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                System.out.println(lastDigit(n));
            }
        }
    }

    public static int lastDigit(int n) {
        int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
        if (n < 10) {
            return dig[n];
        }

        if (((n / 10) % 10) % 2 == 0) {
            return (6 * lastDigit(n / 5) * dig[n % 10]) % 10;
        } else {
            return (4 * lastDigit(n / 5) * dig[n % 10]) % 10;
        }
    }
}
