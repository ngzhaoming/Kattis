import java.util.Scanner;

public class betting {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println(100 / a);
        System.out.println(100 / (100 - a));
    }
}
