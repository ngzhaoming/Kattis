import java.util.Scanner;

public class HissingMicrophone{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char nextChar, currChar;
        String flag = "no hiss";

        for (int i = 0; i < input.length() - 1; i++) {
            currChar = input.charAt(i);
            nextChar = input.charAt(i + 1);

            if (currChar == 's') {
                if (currChar == nextChar) {
                    flag = "hiss";
                    break;
                }
            }
        }

        System.out.println(flag);
    }
}
