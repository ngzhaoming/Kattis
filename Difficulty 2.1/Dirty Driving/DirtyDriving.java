import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class DirtyDriving{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int cars = sc.nextInt();
        int p = sc.nextInt();
        int[] dist = new int[cars];
        for (int i = 0; i < cars; i++) {
            dist[i] = sc.nextInt();
        }

        Arrays.sort(dist);
        int highest = -1;
        for (int i = 0; i < cars; i++) {
            int expect = p * (i + 1);
            int actual = dist[i];
            highest = Math.max(highest, expect - actual);
        }

        System.out.println(highest + dist[0]);
    }
}
