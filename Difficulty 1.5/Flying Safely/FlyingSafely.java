import java.util.Scanner;

public class FlyingSafely {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int city = sc.nextInt();
            int pilot = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < pilot; j++) {
                sc.nextLine();
            }
            System.out.println(city - 1);
        }
    }
}
