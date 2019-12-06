import java.util.Scanner;

public class Faktor {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        int total = (A * (B - 1)) + 1;

        System.out.println(total);
    }
}
