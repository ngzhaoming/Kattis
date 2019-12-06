import java.util.Scanner;

public class BatterUp{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double currBat;
        double total = 0;
        double considered = 0;

        for (int i = 0; i < n; i++) {
            currBat = sc.nextInt();
            if (currBat != -1) {
                total += currBat;
                considered++;
            }
        }

        System.out.println(total / considered);
    }
}
