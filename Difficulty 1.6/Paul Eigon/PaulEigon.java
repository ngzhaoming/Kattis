import java.util.Scanner;

public class PaulEigon{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int serve = sc.nextInt();
        int total = sc.nextInt() + sc.nextInt();
        int remainder = total % (serve * 2);
        if (remainder < serve) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }
}
