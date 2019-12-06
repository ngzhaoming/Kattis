import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WERTYU{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Character> myMap = new HashMap<>();
        myMap.put('W', 'Q');
        myMap.put('E', 'W');
        myMap.put('R', 'E');
        myMap.put('T', 'R');
        myMap.put('Y', 'T');
        myMap.put('U', 'Y');
        myMap.put('I', 'U');
        myMap.put('O', 'I');
        myMap.put('P', 'O');
        myMap.put('[', 'P');
        myMap.put(']', '[');
        myMap.put('\\', ']');
        myMap.put('1', '`');
        myMap.put('2', '1');
        myMap.put('3', '2');
        myMap.put('4', '3');
        myMap.put('5', '4');
        myMap.put('6', '5');
        myMap.put('7', '6');
        myMap.put('8', '7');
        myMap.put('9', '8');
        myMap.put('0', '9');
        myMap.put('-', '0');
        myMap.put('=', '-');
        myMap.put('S', 'A');
        myMap.put('D', 'S');
        myMap.put('F', 'D');
        myMap.put('G', 'F');
        myMap.put('H', 'G');
        myMap.put('J', 'H');
        myMap.put('K', 'J');
        myMap.put('L', 'K');
        myMap.put(';', 'L');
        myMap.put('\'', ';');
        myMap.put('X', 'Z');
        myMap.put('C', 'X');
        myMap.put('V', 'C');
        myMap.put('B', 'V');
        myMap.put('N', 'B');
        myMap.put('M', 'N');
        myMap.put(',', 'M');
        myMap.put('.', ',');
        myMap.put('/', '.');

        String s;
        while ((s = br.readLine()) != null) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);
                if (currChar == ' ') {
                    result += " ";
                } else {
                    char charMap = myMap.get(currChar);
                    result += charMap;
                }
            }

            System.out.println(result);
        }
    }
}
