import java.util.Scanner;
import java.util.ArrayList;

public class Kleptography{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');
        String seen = sc.next();
        String code = sc.next();
        String result = seen;
        for (int i = 1; i <= code.length(); i++) {
            char seenChar = seen.charAt(seen.length() - i);
            char codeChar = code.charAt(code.length() - i);
            int seenVal = list.indexOf((Character) seenChar);
            int codeVal = list.indexOf((Character) codeChar);
            int diff = codeVal - seenVal;
            if (diff < 0) {
                diff += 26;
            }
            char found = list.get(diff);
            seen = found + seen;
        }
        System.out.println(seen.substring(n));
    }
}
