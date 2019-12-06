import java.util.Scanner;

public class Parking{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] time = new int[101];
        int[] cost = {0, sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int total = 0;
        for (int i = 0; i < 3; i++) {
            int enter = sc.nextInt();
            int exit = sc.nextInt();
            for (int j = enter; j < exit; j++) {
                time[j]++;
            }
        }

        for (int j = 1; j < time.length; j++) {
            if (time[j] == 0) {
                continue;
            } else {
                int cars = time[j];
                total += cars * cost[cars];
            }
        }
        System.out.println(total);
    }
}
