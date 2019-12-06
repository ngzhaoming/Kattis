import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.lang.Character;

public class FalseSenseOfSecurity{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, String> myMap = new HashMap<>();
        HashMap<String, Character> reversed = new HashMap<>();
        myMap.put('A',".-");
        myMap.put('B',"-...");
        myMap.put('C',"-.-.");
        myMap.put('D',"-..");
        myMap.put('E',".");
        myMap.put('F',"..-.");
        myMap.put('G',"--.");
        myMap.put('H',"....");
        myMap.put('I',"..");
        myMap.put('J',".---");
        myMap.put('K',"-.-");
        myMap.put('L',".-..");
        myMap.put('M',"--");
        myMap.put('N',"-.");
        myMap.put('O',"---");
        myMap.put('P',".--.");
        myMap.put('Q',"--.-");
        myMap.put('R',".-.");
        myMap.put('S',"...");
        myMap.put('T',"-");
        myMap.put('U',"..-");
        myMap.put('V',"...-");
        myMap.put('W',".--");
        myMap.put('X',"-..-");
        myMap.put('Y',"-.--");
        myMap.put('Z',"--..");
        myMap.put('_',"..--");
        myMap.put('.',"---.");
        myMap.put(',',".-.-");
        myMap.put('?',"----");
        reversed.put(".-", 'A');
        reversed.put("-...", 'B');
        reversed.put("-.-.", 'C');
        reversed.put("-..", 'D');
        reversed.put(".", 'E');
        reversed.put("..-.", 'F');
        reversed.put("--.", 'G');
        reversed.put("....", 'H');
        reversed.put("..", 'I');
        reversed.put(".---", 'J');
        reversed.put("-.-", 'K');
        reversed.put(".-..", 'L');
        reversed.put("--", 'M');
        reversed.put("-.", 'N');
        reversed.put("---", 'O');
        reversed.put(".--.", 'P');
        reversed.put("--.-", 'Q');
        reversed.put(".-.", 'R');
        reversed.put("...", 'S');
        reversed.put("-", 'T');
        reversed.put("..-", 'U');
        reversed.put("...-", 'V');
        reversed.put(".--", 'W');
        reversed.put("-..-", 'X');
        reversed.put("-.--", 'Y');
        reversed.put("--..", 'Z');
        reversed.put("..--", '_');
        reversed.put("---.", '.');
        reversed.put(".-.-", ',');
        reversed.put("----", '?');
        String s;
        while ((s = br.readLine()) != null) {
            String morse = "";
            String numbers = "";
            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);
                String currMorse = myMap.get(currChar);
                morse += currMorse;
                numbers = currMorse.length() + numbers;
            }

            int counter = 0;
            String answer = "";
            for (int i = 0; i < numbers.length(); i++) {
                int len = Character.getNumericValue(numbers.charAt(i));
                String morsePat = morse.substring(counter, counter + len);
                char resChar = reversed.get(morsePat);
                answer += resChar;
                counter += len;
            }

            System.out.println(answer);
        }
    }
}
