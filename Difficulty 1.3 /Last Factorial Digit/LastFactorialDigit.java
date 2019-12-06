import java.util.Scanner;

public class LastFactorialDigit{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long N, current;
        N = sc.nextLong();

        for (int i = 0; i < N; i++) {
            current = sc.nextLong();
            current = factorial(current);
            System.out.println(current % 10);
        }
    }

    public static long factorial(long n) {
        long total = 1;
        for (int i = 1; i < n + 1; i++) {
            total *= i;
        }

        return total;
    }
}
