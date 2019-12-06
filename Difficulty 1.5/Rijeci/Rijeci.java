import java.util.Scanner;

public class Rijeci{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(fib(value - 1) + " " + fib(value));
    }

    public static long fib(int value) {
        if (value == 0) {
            return 0;
        }

        if (value == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= value; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }

        return nth;
    }
}
