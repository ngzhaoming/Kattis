import java.util.Scanner;

public class QuickEstimate{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String value = sc.next();
            System.out.println(value.length());
        }
    }
}
