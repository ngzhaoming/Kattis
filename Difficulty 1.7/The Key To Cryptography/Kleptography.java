import java.util.Scanner;
import java.util.ArrayList;

public class Kleptography{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        list.add('G');
        list.add('H');
        list.add('I');
        list.add('J');
        list.add('K');
        list.add('L');
        list.add('M');
        list.add('N');
        list.add('O');
        list.add('P');
        list.add('Q');
        list.add('R');
        list.add('S');
        list.add('T');
        list.add('U');
        list.add('V');
        list.add('W');
        list.add('X');
        list.add('Y');
        list.add('Z');
        String code = sc.next();
        String seen = sc.next();
        int n = seen.length();
        for (int i = 0; i < code.length(); i++) {
            char seenChar = seen.charAt(i);
            char codeChar = code.charAt(i);
            int seenVal = list.indexOf((Character) seenChar);
            int codeVal = list.indexOf((Character) codeChar);
            int diff = codeVal - seenVal;
            if (diff < 0) {
                diff += 26;
            }
            char found = list.get(diff);
            seen = seen + found;
        }
        System.out.println(seen.substring(n));
    }
}
