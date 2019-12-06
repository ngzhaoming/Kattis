import java.util.Scanner;

public class RunLengthEncodingRun{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        char type = sc.next().charAt(0);
        String input = sc.next();
        String result = "";
        if (type == 'E') {
            result = eEncoding(input);
        } else {
            result = dEncoding(input);
        }
        System.out.println(result);
    }

    public static String eEncoding(String str) {
        char first = str.charAt(0);
        int counter = 0;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == first || i == 0) {
                counter++;
            } else {
                output = output + first + counter;
                first = currChar;
                counter = 1;
            }

            if (i == str.length() - 1) {
                output = output + currChar + counter;
            }
        }
        return output;
    }

    public static String dEncoding(String str) {
        String output = "";
        char currChar = 'A';
        int currCount = -1;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                currChar = str.charAt(i);
            } else {
                currCount = Integer.parseInt(str.charAt(i) + "");
                for (int j = 0; j < currCount; j++) {
                    output = output + currChar;
                }
            }
        }
        return output;
    }
}
