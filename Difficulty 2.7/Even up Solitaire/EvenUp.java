import java.util.Scanner;
import java.util.Stack;

public class EvenUp {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int currVal = sc.nextInt();
            if (!stack.empty()) {
                int stackVal = stack.peek();
                if ((stackVal + currVal) % 2 == 0) {
                    stack.pop();
                } else {
                    stack.push(currVal);
                }
            } else {
                stack.push(currVal);
            }
        }

        int counter = 0;
        while (!stack.empty()) {
            stack.pop();
            counter++;
        }
        System.out.println(counter);
    }
}
