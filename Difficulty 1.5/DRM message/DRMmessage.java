import java.util.Scanner;
import java.util.ArrayList;

public class DRMmessage{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
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
        
        //Divide process
        String s1 = input.substring(0, input.length() / 2);
        String s2 = input.substring(input.length() / 2);

        //rotation process
        int rot1 = 0;
        int rot2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char currChar1 = s1.charAt(i);
            char currChar2 = s2.charAt(i);
            rot1 += list.indexOf((char) currChar1);
            rot2 += list.indexOf((char) currChar2);
        }

        String newS1 = "";
        String newS2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char currChar1 = s1.charAt(i);
            char currChar2 = s2.charAt(i);
            int val1 = list.indexOf((char) currChar1);
            int val2 = list.indexOf((char) currChar2);
            val1 = (val1 + rot1) % 26;
            val2 = (val2 + rot2) % 26;
            newS1 += list.get(val1);
            newS2 += list.get(val2);
        }

        String message = "";
        for (int i = 0; i < s1.length(); i++) {
            char currChar1 = newS1.charAt(i);
            char currChar2 = newS2.charAt(i);
            int currVal = (currChar1 + currChar2) % 26;
            message += list.get(currVal);
        }

        System.out.println(message);
    }
}
