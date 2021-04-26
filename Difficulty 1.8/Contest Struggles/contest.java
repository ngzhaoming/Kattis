import java.util.Scanner;

public class contest {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double totalQns = sc.nextInt();
        double currQns = sc.nextInt();
        double totalDiff = sc.nextInt();
        double currDiff = sc.nextInt();

        double finalDiff = totalDiff * totalQns;
        double finalCurr = currDiff * currQns;
        double remainQns = totalQns - currQns;

        double result = (finalDiff - finalCurr) / remainQns;

        if (result > 100 || result < 0) {
            System.out.println("impossible");
        } else {
            System.out.format("%.7f", result);
            System.out.println();
        }
    }
}
