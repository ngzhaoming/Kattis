import java.util.Scanner;

public class Brick {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int hCount = 0;
        int wCount = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            wCount += curr;

            if (wCount == w) {
                hCount++;
                wCount = 0;
            } else if (wCount > w) {
                flag = false;
                break;
            }

            if (hCount == h) {
                break;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
