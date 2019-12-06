import java.util.Scanner;

public class EulersNumber{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 1.0;
        double count = 1;
        for (int i = 1; i <= n; i++) {
            count *= (double) i;
            ans += (1 / count);
        }
        System.out.println(ans);
    }
}
