import java.util.Scanner;

public class NastyHacks{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, e, c;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();
            int advProfit = e - c;
            if (r > advProfit) {
                System.out.println("do not advertise");
            } else if (r < advProfit) {
                System.out.println("advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}
