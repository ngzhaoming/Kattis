import java.util.Scanner;
import java.util.ArrayList;

public class vigenere {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String cipher = sc.nextLine();
        String key = sc.nextLine();
        String result = "";
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('A');
        arr.add('B');
        arr.add('C');
        arr.add('D');
        arr.add('E');
        arr.add('F');
        arr.add('G');
        arr.add('H');
        arr.add('I');
        arr.add('J');
        arr.add('K');
        arr.add('L');
        arr.add('M');
        arr.add('N');
        arr.add('O');
        arr.add('P');
        arr.add('Q');
        arr.add('R');
        arr.add('S');
        arr.add('T');
        arr.add('U');
        arr.add('V');
        arr.add('W');
        arr.add('X');
        arr.add('Y');
        arr.add('Z');

        for (int i = 0; i < cipher.length(); i++) {
            char currChar = cipher.charAt(i); 
            char currKey = key.charAt(i);

            int charVal = arr.indexOf(currChar);
            int keyVal = arr.indexOf(currKey);

            if ((i + 1) % 2 == 0) {
                result += arr.get((charVal + keyVal) % 26);    
            } else {
                result += arr.get((charVal - keyVal + 26) % 26);
            }
            
        }

        System.out.println(result);
    }
}
