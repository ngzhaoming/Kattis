import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;

public class CircuitMath {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> hash = new HashMap<>();
        Stack<String> stack = new Stack<>();
        int counter = 65; // Start from A

        for (int i = 0; i < n; i++) {
            char currChar = (char) counter;
            String convert = "" + currChar;
            String flag = sc.next();
            hash.put(convert, flag);
            counter++;
        }

        while(sc.hasNext()) {
            String curr = sc.next();
            if (hash.containsKey(curr)) {
                //This is an operand
                String value = hash.get(curr);
                stack.push(value);
            } else {
                //This is an operation
                if (curr.equals("*")) {
                    String popVal1 = stack.pop();
                    String popVal2 = stack.pop();
                    if (popVal1.equals("T") && popVal2.equals("T")) {
                        stack.push("T");
                    } else {
                        stack.push("F");
                    }
                } else if (curr.equals("+")) {
                    String popVal1 = stack.pop();
                    String popVal2 = stack.pop();
                    if (popVal1.equals("F") && popVal2.equals("F")) {
                        stack.push("F");
                    } else {
                        stack.push("T");
                    }
                } else {
                    // This is not
                    String popVal = stack.pop();
                    if (popVal.equals("T")) {
                        stack.push("F");
                    } else {
                        stack.push("T");
                    }
                }
            }
        }

        System.out.println(stack.peek());
    }
}
