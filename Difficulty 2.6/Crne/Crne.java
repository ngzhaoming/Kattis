import java.util.Scanner;

public class Crne{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(2);
        } else {
            long half, total;
            if (n % 2 == 0) {
                half = (n / 2) + 1;
                total = half * half; 
            } else {
                half = (n / 2) + 1;
                total = half * (half + 1);
            }
            System.out.println(total);
        }
    }
}
