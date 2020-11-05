import java.util.Scanner;
import java.lang.StringBuilder;

public class Buka {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";

        String first = sc.next();
        String symbol = sc.next();
        String second = sc.next();

        if (symbol.equals("*")) {
            int total = (first.length() + second.length() - 2);
            result += "1";

            for (int i = 0; i < total; i++) {
                result = result + "0";
            }
        } else {
            //This is "+"
            int len1 = first.length();
            int len2 = second.length();

            if (len1 == len2) {
                result += "2";
                for (int i = 0; i < len1 - 1; i++) {
                    result = result + "0";
                }
            } else if (len1 > len2) {
                StringBuilder ans = new StringBuilder(first);

                int index = (len1 - len2);
                ans.setCharAt(index, '1');

                result = ans.toString();
            } else {
                StringBuilder ans = new StringBuilder(second);

                int index = (len2 - len1);
                ans.setCharAt(index, '1');

                result = ans.toString();
            }
        }

        System.out.println(result);
    }
}
