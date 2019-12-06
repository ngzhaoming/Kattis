import java.util.Scanner;

public class SomeSum {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = startEven(N);
        int Y = startOdd(N);

        if (X % 2 == 0 && Y % 2 == 0) {
            System.out.println("Even");
        } else if (X % 2 == 1 && Y % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Either");
        }
    }

    public static int startEven(int n) {
        int result = 0;
        for (int i = 2; i < 2 + n; i++) {
            result += i;   
        }

        return result;
    }

    public static int startOdd(int n) {
        int result = 0;
        for (int i = 1; i < 1 + n; i++) {
            result += i;   
        }

        return result;
    }
}
