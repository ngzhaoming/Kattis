import java.util.Scanner;
import java.util.Arrays;

public class PopularVote{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double total = 0;
            boolean repeat = false;
            int num = sc.nextInt();
            double currHighest = -1;
            int index = 0;
            for (int j = 1; j < num + 1; j++) {
                double next = sc.nextDouble();
                if (next > currHighest) {
                    index = j;
                    currHighest = next;
                    repeat = false;
                } else if (next == currHighest) {
                    repeat = true;
                }
                total += next;
            }
            if (repeat) {
                System.out.println("no winner");
            } else if (currHighest > total / 2) {
                System.out.println("majority winner " + index);
            } else {
                System.out.println("minority winner " + index);
            }
        }
    }
}
