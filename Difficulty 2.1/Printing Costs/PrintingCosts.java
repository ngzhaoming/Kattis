import java.util.Scanner;
import java.util.TreeMap;

public class PrintingCosts{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        myMap.put(' ', 0);
        myMap.put('&', 24);
        myMap.put(',', 7);
        myMap.put('2', 22);
        myMap.put('8', 23);
        myMap.put('>', 10);
        myMap.put('D', 26);
        myMap.put('J', 18);
        myMap.put('P', 23);
        myMap.put('V', 19);
        myMap.put('\\', 10);
        myMap.put('b', 25);
        myMap.put('h', 21);
        myMap.put('n', 18);
        myMap.put('t', 17);
        myMap.put('z', 19);
        myMap.put('!', 9);
        myMap.put('\'', 3);
        myMap.put('-', 7);
        myMap.put('3', 23);
        myMap.put('9', 26);
        myMap.put('?', 15);
        myMap.put('E', 26);
        myMap.put('K', 21);
        myMap.put('Q', 31);
        myMap.put('W', 26);
        myMap.put(']', 18);
        myMap.put('c', 17);
        myMap.put('i', 15);
        myMap.put('o', 20);
        myMap.put('u', 17);
        myMap.put('{', 18);
        myMap.put('\"', 6);
        myMap.put('(', 12);
        myMap.put('.', 4);
        myMap.put('4', 21);
        myMap.put(':', 8);
        myMap.put('@', 32);
        myMap.put('F', 20);
        myMap.put('L', 16);
        myMap.put('R', 28);
        myMap.put('X', 18);
        myMap.put('^', 7);
        myMap.put('d', 25);
        myMap.put('j', 20);
        myMap.put('p', 25);
        myMap.put('v', 13);
        myMap.put('|', 12);
        myMap.put('#', 24);
        myMap.put(')', 12);
        myMap.put('/', 10);
        myMap.put('5', 27);
        myMap.put(';', 11);
        myMap.put('A', 24);
        myMap.put('G', 25);
        myMap.put('M', 28);
        myMap.put('S', 25);
        myMap.put('Y', 14);
        myMap.put('_', 8);
        myMap.put('e', 23);
        myMap.put('k', 21);
        myMap.put('q', 25);
        myMap.put('w', 19);
        myMap.put('}', 18);
        myMap.put('$', 29);
        myMap.put('*', 17);
        myMap.put('0', 22);
        myMap.put('6', 26);
        myMap.put('<', 10);
        myMap.put('B', 29);
        myMap.put('H', 25);
        myMap.put('N', 25);
        myMap.put('T', 16);
        myMap.put('Z', 22);
        myMap.put('`', 3);
        myMap.put('f', 18);
        myMap.put('l', 16);
        myMap.put('r', 13);
        myMap.put('x', 13);
        myMap.put('~', 9);
        myMap.put('%', 22);
        myMap.put('+', 13);
        myMap.put('1', 19);
        myMap.put('7', 16);
        myMap.put('=', 14);
        myMap.put('C', 20);
        myMap.put('I', 18);
        myMap.put('O', 26);
        myMap.put('U', 23);
        myMap.put('[', 18);
        myMap.put('a', 23);
        myMap.put('g', 30);
        myMap.put('m', 22);
        myMap.put('s', 21);
        myMap.put('y', 24);

        while (sc.hasNext()) {
            long total = 0;
            String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char curr = input.charAt(i);
                long val = myMap.get(curr);
                total += val;
            }

            System.out.println(total);
        }
    }
}
