import java.util.Scanner;

public class Sjecista{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long total = n * (n - 1) * (n - 2) * (n - 3) / 24;
        System.out.println(total);
    }
}
