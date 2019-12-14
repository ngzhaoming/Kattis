import java.util.Scanner;

public class MoscowDream {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int easy = sc.nextInt();
        int medium = sc.nextInt();
        int hard = sc.nextInt();
        int n = sc.nextInt();

        if (easy + medium + hard >= n && easy > 0 && medium > 0 && hard > 0 && n > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
