import java.util.Scanner;
import java.util.TreeMap;

public class ANewAlphabet{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TreeMap<Character, String> myMap = new TreeMap<>();
        myMap.put('A', "@");
        myMap.put('a', "@");
        myMap.put('B', "8");
        myMap.put('b', "8");
        myMap.put('C', "(");
        myMap.put('c', "(");
        myMap.put('D', "|)");
        myMap.put('d', "|)");
        myMap.put('E', "3");
        myMap.put('e', "3");
        myMap.put('F', "#");
        myMap.put('f', "#");
        myMap.put('G', "6");
        myMap.put('g', "6");
        myMap.put('H', "[-]");
        myMap.put('h', "[-]");
        myMap.put('I', "|");
        myMap.put('i', "|");
        myMap.put('J', "_|");
        myMap.put('j', "_|");
        myMap.put('K', "|<");
        myMap.put('k', "|<");
        myMap.put('L', "1");
        myMap.put('l', "1");
        myMap.put('M', "[]\\/[]");
        myMap.put('m', "[]\\/[]");
        myMap.put('N', "[]\\[]");
        myMap.put('n', "[]\\[]");
        myMap.put('O', "0");
        myMap.put('o', "0");
        myMap.put('P', "|D");
        myMap.put('p', "|D");
        myMap.put('Q', "(,)");
        myMap.put('q', "(,)");
        myMap.put('R', "|Z");
        myMap.put('r', "|Z");
        myMap.put('S', "$");
        myMap.put('s', "$");
        myMap.put('T', "']['");
        myMap.put('t', "']['");
        myMap.put('U', "|_|");
        myMap.put('u', "|_|");
        myMap.put('V', "\\/");
        myMap.put('v', "\\/");
        myMap.put('W', "\\/\\/");
        myMap.put('w', "\\/\\/");
        myMap.put('X', "}{");
        myMap.put('x', "}{");
        myMap.put('Y', "`/");
        myMap.put('y', "`/");
        myMap.put('Z', "2");
        myMap.put('z', "2");
        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            if (myMap.containsKey(currChar)) {
                System.out.print(myMap.get(currChar));
            } else {
                System.out.print(currChar);
            }
        }
        System.out.println();
    }
}
