import java.util.Scanner;
import java.util.HashMap;

public class Spelling{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> myMap = new HashMap<>();
        myMap.put('a', "2");
        myMap.put('b', "22");
        myMap.put('c', "222");
        myMap.put('d', "3");
        myMap.put('e', "33");
        myMap.put('f', "333");
        myMap.put('g', "4");
        myMap.put('h', "44");
        myMap.put('i', "444");
        myMap.put('j', "5");
        myMap.put('k', "55");
        myMap.put('l', "555");
        myMap.put('m', "6");
        myMap.put('n', "66");
        myMap.put('o', "666");
        myMap.put('p', "7");
        myMap.put('q', "77");
        myMap.put('r', "777");
        myMap.put('s', "7777");
        myMap.put('t', "8");
        myMap.put('u', "88");
        myMap.put('v', "888");
        myMap.put('w', "9");
        myMap.put('x', "99");
        myMap.put('y', "999");
        myMap.put('z', "9999");
        myMap.put(' ', "0");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            char prevChar = 'A';
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < line.length(); j++) {
                char currChar = line.charAt(j);
                String value = myMap.get(currChar);
                if (value.charAt(0) == prevChar) {
                    System.out.print(" " + value);
                } else {
                    System.out.print(value);
                }
                prevChar = value.charAt(0);
            }
            System.out.println();
        }
    }
}
