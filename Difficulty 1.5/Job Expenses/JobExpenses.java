import java.util.Scanner;

public class JobExpenses{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int next = sc.nextInt();
            if (next < 0) {
                total += next;
            }
        }

        System.out.println(Math.abs(total));
    }
}
