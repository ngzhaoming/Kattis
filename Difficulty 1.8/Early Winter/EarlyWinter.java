import java.util.Scanner;

public class EarlyWinter {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dm = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (curr > dm) {
                total++;
            } else {
                break;
            }
        }

        if (total == n) {
            System.out.println("It had never snowed this early!");
        } else {
            System.out.println("It hadn't snowed this early in " + total + " years!");
        }
    }
}
