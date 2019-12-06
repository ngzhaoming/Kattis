import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class DataStructure{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Stack<Integer> myStack = new Stack<>();
            Queue<Integer> myQueue = new LinkedList<>();
            PriorityQueue<Integer> myPQ = new PriorityQueue<>();
            ArrayList<String> list = new ArrayList<>();
            list.add("Stack");
            list.add("Queue");
            list.add("PQ");
            int eStack = -1;
            int eQueue = -1;
            int ePQ = -1;
            for (int i = 0; i < n; i++) { // Getting the commands
                int action = sc.nextInt();
                int val = sc.nextInt();
                if (action == 1) { //Addition
                    
                }
                for (int j = 0; j < list.size(); j++) {
                    String structure = list.get(j);

                }
            }
        }
    }
}
