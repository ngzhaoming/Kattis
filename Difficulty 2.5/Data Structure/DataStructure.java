import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class DataStructure {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            boolean[] arr = new boolean[3];
            Arrays.fill(arr, Boolean.TRUE);
            boolean flag = true;

            Queue<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

            for (int i = 0; i < n; i++) {
                int command = sc.nextInt();    
                int val = sc.nextInt();

                if (command == 1) {
                    queue.add(val);
                    pq.offer(val);
                    stack.push(val);
                } else {
                    // This is the pop command need to use try catch blocks
                    try {
                        int qVal = queue.poll();
                        int sVal = stack.pop();
                        int pqVal = pq.poll();

                        for (int j = 0; j < 3; j++) {
                            if (j == 0) {
                                //stack check
                                if (!arr[0] || sVal != val) {
                                    arr[0] = false;
                                }
                            } else if (j == 1) {
                                // queue check
                                if (!arr[1] || qVal != val) {
                                    arr[1] = false;
                                }
                            } else {
                                // priority queue check
                                if (!arr[2] || pqVal != val) {
                                    arr[2] = false;
                                }
                            }
                        }
                    } catch(Exception e) {
                        flag = false;
                    }
                }
            }

            ArrayList<String> list = new ArrayList<>();
            if (arr[0]) {
                list.add("stack");
            }

            if (arr[1]) {
                list.add("queue");
            }

            if (arr[2]) {
                list.add("priority queue");
            }

            if (flag) {
                if (list.size() == 1) {
                    System.out.println(list.get(0));
                } else if (list.size() > 1) {
                    System.out.println("not sure");
                } else {
                    System.out.println("impossible");
                }
            } else {
                System.out.println("impossible");
            }
        }
    }
}
