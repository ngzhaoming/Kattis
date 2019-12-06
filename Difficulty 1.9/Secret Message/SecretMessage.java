import java.util.Scanner;
import java.lang.Math;

public class SecretMessage{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            int closest = (int) Math.sqrt(line.length());
            if (closest * closest != line.length()) {
                closest++;
            }
            int temp = closest;
            closest *= closest;
            for (int j = line.length(); j < closest; j++) {
                line += "*";
            }

            String result = "";
            for (int j = closest - temp; j < closest; j++) {
                for (int k = j; k >= 0; k = k - temp) {
                    char currChar = line.charAt(k);
                    if (currChar != '*') {
                        result += currChar;
                    }
                }
            }
            System.out.println(result);
        }

    }
}
