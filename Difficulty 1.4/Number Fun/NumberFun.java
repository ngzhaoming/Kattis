import java.util.Scanner;

public class NumberFun{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double v1 = sc.nextInt();
            double v2 = sc.nextInt();
            double total = sc.nextInt();
            if (v1 + v2 == total || v1 * v2 == total ||
                v1 - v2 == total || v2 - v1 == total ||
                v1 / v2 == total || v2 / v1 == total) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible"); 
            }
        }
    }
}
