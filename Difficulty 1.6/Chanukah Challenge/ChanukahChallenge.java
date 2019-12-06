import java.util.Scanner;

public class ChanukahChallenge{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            int days = sc.nextInt();
            long totalCandles = (days * (days + 1)) / 2 + days;
            System.out.println(String.format("%d %d", data, totalCandles));
        }
    }
}
