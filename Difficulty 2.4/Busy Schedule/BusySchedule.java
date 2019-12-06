import java.util.Scanner;
import java.util.PriorityQueue;

public class BusySchedule{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (counter != 0) {
                System.out.println();
            }
            PriorityQueue<Time> pq = new PriorityQueue<Time>(n, new TimeComparator());
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                Time time = new Time(sc.nextLine().split(" "));
                pq.add(time);
            }

            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }
            counter++;
        }
    }
}
