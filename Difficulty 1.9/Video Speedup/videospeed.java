import java.util.Scanner;

public class videospeed {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int speedup = sc.nextInt();
        int time = sc.nextInt();

        double result = 0.00;

        int min = 0;
        double rate = 1.00;

        for (int i = 0; i < n; i++) {
            int nextTiming = sc.nextInt();

            int interval = nextTiming - min;
            result += (double) interval * rate;

            if (nextTiming >= time) {
                min = nextTiming;
                break;
            }

            rate += (double) speedup / 100.00;
            min = nextTiming;
        }

        if (min < time) {
            int interval = time - min;
            result += (double) interval * rate;
        }

        System.out.println(result);
    }
}
