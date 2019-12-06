import java.util.Scanner;
import java.lang.Math;

public class Tajna{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int rows = findRows(msg.length());
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < msg.length(); j = j + rows) {
                result += msg.charAt(j);
            }
        }
        System.out.println(result);
    }

    public static int findRows(int len) {
        int highest = 0;
        for (int i = 1; i <= (len / 2); i++) {
            if (len % i == 0) {
                int partner = len / i;
                if (partner >= i) {
                    highest = i;
                } else {
                    break;
                }
            }
        }
        return highest;
    }
}
