import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class FourThought{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> values = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    String eqn = formStr(i, j, k);
                    String val = eval(eqn);
                    values.put(val, eqn);
                }
            }
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (values.containsKey(s)) {
                String eqn = values.get(s);
                System.out.println(eqn + " = " + s);
            } else {
                System.out.println("no solution");
            }
        }
    }

    public static String formStr(int a, int b, int c) {
        return 4 + op(a) + 4 + op(b) + 4 + op(c) + 4;
    }

    public static String op(int a) {
        if (a == 0) {
            return " + ";
        } else if (a == 1) {
            return " - ";
        } else if (a == 2) {
            return " * ";
        } else {
            return " / ";
        }
    }

    public static String eval(String eqn) {
        Deque<Integer> num = new LinkedList<>();
        Deque<Character> sym = new LinkedList<>();

        for (int i = 0; i < eqn.length(); i = i + 2) {
            char currChar = eqn.charAt(i);
            if (currChar == '4') {
                num.offerLast(4);
            } else if (currChar == '+' || currChar == '-') {
                sym.offerLast(currChar);
            } else if (currChar == '*' || currChar == '/') {
                int val = num.pollLast();
                int calc;
                if (currChar == '*') {
                    calc = val * 4;
                } else {
                    calc = val / 4;
                }
                num.offerLast(calc);
                i = i + 2;
            }
        }

        while (!sym.isEmpty()) {
            char symbol = sym.pollFirst();
            int val1 = num.pollFirst();
            int val2 = num.pollFirst();
            int calc;
            if (symbol == '+') {
                calc = val2 + val1;
            } else {
                calc = val1 - val2;
            }
            num.addFirst(calc);
        }

        return num.poll() + "";
    }
}
