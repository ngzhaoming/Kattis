import java.util.Scanner;

public class AlphabetSpam{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        double whitespace = 0;
        double lower = 0;
        double upper = 0;
        double symbols = 0;
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char currChar = input.charAt(i);
            int value = (int) currChar;
            if (value == 95) {
                whitespace++;
            } else if (value > 96 && value < 123) {
                lower++;
            } else if (value > 64 && value < 91) {
                upper++;
            } else {
                symbols++;
            }
        }

        System.out.println(String.format("%.6f", whitespace / len));
        System.out.println(String.format("%.6f", lower / len));
        System.out.println(String.format("%.6f", upper / len));
        System.out.println(String.format("%.6f", symbols / len));

    }
}
