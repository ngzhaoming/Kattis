import java.util.Scanner;
import java.util.PriorityQueue;

public class ABC{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> list = new PriorityQueue<>();
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            ABC[i] = list.poll();
        }
        String input = sc.next();
        for (int i = 0; i < 3; i++) {
            char currChar = input.charAt(i);
            if (currChar == 'A') {
                System.out.print(ABC[0]);
            } else if (currChar == 'B') {
                System.out.print(ABC[1]);
            } else {
                System.out.print(ABC[2]);
            }

            if (i != 2) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
