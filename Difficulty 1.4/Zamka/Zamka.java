import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.Character;

public class Zamka{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int min = 0;
        int max = 0;

        for (int i = L; i <= D; i++) {
            if (countDigits(i) == X) {
                min = i;
                break;
            }
        }

        for (int i = D; i >= L; i--) {
            if (countDigits(i) == X) {
                max = i;
                break;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    public static int countDigits(int n) {
        int total = 0;
        while(n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total;
    }
}
