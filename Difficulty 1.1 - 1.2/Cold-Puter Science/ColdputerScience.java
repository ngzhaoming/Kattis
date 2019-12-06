import java.util.Scanner;

public class ColdputerScience {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n, curr;
        int total = 0;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            curr = sc.nextInt();
            if (curr < 0) {
                total++;
            }
        }

        System.out.println(total);
    }
}
