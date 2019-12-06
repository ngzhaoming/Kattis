import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class HotHike {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int days = sc.nextInt();
        int bestDay = 1;

        int firstDay = sc.nextInt();
        int secondDay = sc.nextInt();
        int thirdDay = sc.nextInt();

        int min = Math.max(firstDay, thirdDay);

        q.add(firstDay);
        q.add(secondDay);
        q.add(thirdDay);

        for (int i = 0; i < days - 3; i++) {
            q.poll();
            int currFirst = q.peek();
            int nextThird = sc.nextInt();
            q.add(nextThird);

            int max = Math.max(currFirst, nextThird);
            if (max < min) {
                min = max;
                bestDay = 2 + i;
            }
        }

        System.out.println(bestDay + " " + min);
    }
}
