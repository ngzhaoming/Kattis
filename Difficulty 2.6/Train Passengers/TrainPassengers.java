import java.util.Scanner;

public class TrainPassengers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long cap = sc.nextLong();
        int n = sc.nextInt();
        long curr = 0;
        for (int i = 0; i < n; i++) {
            long left = sc.nextLong();
            long entered = sc.nextLong();
            long waited = sc.nextLong();
            //Last station check
            if (i == n - 1 && (waited > 0 || entered > 0 ||
                curr - left > 0)) {
                System.out.println("impossible");
                break;
            } else if (i == n - 1) {
                System.out.println("possible");
                break;
            }
            
            curr -= left;
            if (curr < 0) {
                System.out.println("impossible");
                break;
            }

            curr += entered;
            if (curr > cap) {
                System.out.println("impossible");
                break;
            } else if (curr < cap && waited > 0) {
                System.out.println("impossible");
                break;
            }
        }
    }
}
