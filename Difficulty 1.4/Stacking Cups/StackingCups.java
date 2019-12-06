import java.util.Scanner;
import java.util.PriorityQueue;

public class StackingCups{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<cups> cupPQ = new PriorityQueue<cups>(n, new cupComparator());

        for (int i = 0; i < n; i++) {
            String check = sc.next();
            char asciiVal = check.charAt(0);
            if (asciiVal > 47 && asciiVal < 58) { // It's a number
                int size = Integer.parseInt(check) / 2;
                String colour = sc.next();

                cups makeCup = new cups(colour, size);
                cupPQ.add(makeCup);
            } else { //Colour first
                String colour = check;
                int size = sc.nextInt();

                cups makeCup = new cups(colour, size);
                cupPQ.add(makeCup);
            }
        }

        while(cupPQ.size() != 0) {
            System.out.println(cupPQ.poll());
        }
    }
}
