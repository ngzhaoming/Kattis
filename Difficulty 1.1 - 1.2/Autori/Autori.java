import java.util.Scanner;
import java.lang.String;

public class Autori {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String shortForm = "" + line.charAt(0);
        int currVal;
        
        for (int i = 1; i < line.length(); i++) {
            currVal = (int) line.charAt(i);
            if (currVal > 64 && currVal < 91) {
                shortForm += line.charAt(i);
            }
        }

        System.out.println(shortForm);
    }
}
