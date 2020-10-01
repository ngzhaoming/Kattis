import java.util.Scanner;

public class DigitalProduct {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int result = 1;
        boolean isFirst = true;

        while(n.length() > 1) {
            result = 1;
            for(int i = 0; i < n.length(); i++) {
                int currDigit = Character.getNumericValue(n.charAt(i));

                if (currDigit != 0) {
                    result *= currDigit;
                }
            }

            n = Integer.toString(result);
        }

        System.out.println(result);
    }
}
