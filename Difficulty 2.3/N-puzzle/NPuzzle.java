import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.lang.Math;

public class NPuzzle{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Letters> myMap = new HashMap<>();
        myMap.put('A', new Letters(0, 0));
        myMap.put('B', new Letters(0, 1));
        myMap.put('C', new Letters(0, 2));
        myMap.put('D', new Letters(0, 3));
        myMap.put('E', new Letters(1, 0));
        myMap.put('F', new Letters(1, 1));
        myMap.put('G', new Letters(1, 2));
        myMap.put('H', new Letters(1, 3));
        myMap.put('I', new Letters(2, 0));
        myMap.put('J', new Letters(2, 1));
        myMap.put('K', new Letters(2, 2));
        myMap.put('L', new Letters(2, 3));
        myMap.put('M', new Letters(3, 0));
        myMap.put('N', new Letters(3, 1));
        myMap.put('O', new Letters(3, 2));
        int counter = 0;
        int result = 0;
        String s;
        while ((s = br.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);
                if (currChar != '.') {
                    Letters currLet = myMap.get(currChar);
                    result += Math.abs(currLet.X - counter);
                    result += Math.abs(currLet.Y - i);
                }
            }
            counter++;
        }

        System.out.println(result);
    }
}
