import java.util.Scanner;
import java.util.Stack;

public class DelimiterSoup{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> check = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        char ans = '*';
        int val = 0;
        for (int i = 0; i < n; i++) {
            char currChar = input.charAt(i); 
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                check.push(currChar);
            } else if (currChar == '}' && !check.isEmpty() && check.peek() == '{') {
                check.pop();
            } else if (currChar == ')' && !check.isEmpty() && check.peek() == '(') {
                check.pop();    
            } else if (currChar == ']' && !check.isEmpty() && check.peek() == '[') {
                check.pop();   
            } else if (currChar == ' ') {
                continue;
            } else {
                ans = currChar;
                val = i;
                break;
            }
        }

        if (ans != '*') {
            System.out.println(String.format("%c %d", ans, val)); 
        } else {
            System.out.println("ok so far");
        }
    }
}
