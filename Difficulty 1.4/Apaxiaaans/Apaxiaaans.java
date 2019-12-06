import java.util.Scanner;

public class Apaxiaaans{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char prevChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            while (i < input.length()) {
                char currChar = input.charAt(i);
                if (currChar == prevChar) {
                    input = input.substring(0, i) + input.substring(i + 1);
                } else {
                    prevChar = currChar;
                    break;
                }
            }
        }
        System.out.println(input);
    }
}
