import java.util.Scanner;

public class skruop {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int result = 7;

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            if (str.equals("Skru op!") && result < 10) {
                result++;
            } else if (str.equals("Skru ned!") && result > 0) {
                result--;
            }
        }

        System.out.println(result);
    }
}
