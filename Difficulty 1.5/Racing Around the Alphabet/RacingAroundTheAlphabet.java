import java.util.Scanner;
import java.util.TreeMap;
import java.lang.Math;

public class RacingAroundTheAlphabet{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        myMap.put('A', 1);
        myMap.put('B', 2);
        myMap.put('C', 3);
        myMap.put('D', 4);
        myMap.put('E', 5);
        myMap.put('F', 6);
        myMap.put('G', 7);
        myMap.put('H', 8);
        myMap.put('I', 9);
        myMap.put('J', 10);
        myMap.put('K', 11);
        myMap.put('L', 12);
        myMap.put('M', 13);
        myMap.put('N', 14);
        myMap.put('O', 15);
        myMap.put('P', 16);
        myMap.put('Q', 17);
        myMap.put('R', 18);
        myMap.put('S', 19);
        myMap.put('T', 20);
        myMap.put('U', 21);
        myMap.put('V', 22);
        myMap.put('W', 23);
        myMap.put('X', 24);
        myMap.put('Y', 25);
        myMap.put('Z', 26);
        myMap.put(' ', 27);
        myMap.put('\'', 28);
        int n = sc.nextInt();
        sc.nextLine();
        double distance = 2 * Math.PI * (60 / 2) / 28;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            double total = 0;
            for (int j = 0; j < input.length() - 1; j++) {
                char prevChar = input.charAt(j);
                char currChar = input.charAt(j + 1);
                int prevVal = myMap.get(prevChar);
                int value = myMap.get(currChar);
                double diff1 = Math.abs(value - prevVal);
                double diff2 = Math.abs(28 - diff1);
                total += Math.min(diff1, diff2);
            }
            System.out.println(total * distance / 15);
        }
    }
}
