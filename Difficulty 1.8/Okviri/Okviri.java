import java.util.Scanner;

public class Okviri{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String line1 = "..#"; //Top and last line
        String line2 = "."; //Second and fourth line
        String line3 = "#"; //Middle line
        
        for (int i = 1; i <= input.length(); i++) {
            char currChar = input.charAt(i - 1);
            if (i % 3 == 0) { //Third character
                line1 += "...*";
                line2 += "*.*.";
                line3 += "*." + currChar + ".*";
            } else {
                if (i != 1) {
                    line1 += "...#";
                }

                line2 += "#.#.";

                if ((i - 1) % 3 == 0) {
                    line3 += "." + currChar + ".";
                } else {
                    line3 += "#." + currChar + ".";
                }
            }
        }

        line1 += "..";
        if (input.length() % 3 != 0) {
            line3 += "#";
        }
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);
    }
}
