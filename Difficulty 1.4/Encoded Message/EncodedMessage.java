import java.util.Scanner;
import java.lang.Math;

public class EncodedMessage{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String text = sc.next();
            String actual = "";
            double interval = Math.sqrt(text.length());
            for (double j = interval - 1; j >= 0; j--) {
                double counter = j;
                while (counter < text.length()) {
                    actual += text.charAt((int) counter);
                    counter += interval;
                }
            }
            System.out.println(actual);
        }
    }
}
