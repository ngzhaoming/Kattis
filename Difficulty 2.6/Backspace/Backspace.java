import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Backspace{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> dq = new ArrayDeque<String>();
        String[] input = sc.nextLine().split("");

        for (int i = 0; i < input.length; i++) {
            String currChar = input[i];
            if (currChar.equals("<")) {
                dq.removeLast();
            } else {
                dq.add(currChar);
            }
        }

        Iterator it = dq.iterator();
        String result = "";
        while(it.hasNext()) {
            result += it.next();
        }

        System.out.println(result);
    }
}
