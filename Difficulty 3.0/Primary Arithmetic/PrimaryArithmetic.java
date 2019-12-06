import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.lang.Character;

public class PrimaryArithmetic{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();
            String[] values = s.split(" ");
            int result = 0;

            String val1 = values[0];
            String val2 = values[1];
            if (val1.equals("0") && val2.equals("0")) {
                break;
            }
            int diff = val1.length() - val2.length();

            if (diff < 0) {
                for(int i = 0; i < Math.abs(diff); i++) {
                    val1 = 0 + val1;
                }
            } else if (diff > 0) {
                for(int i = 0; i < diff; i++) {
                    val2 = 0 + val2;
                }
            }

            val1 = 0 + val1;
            val2 = 0 + val2;

            int carry = 0;
            for(int i = val1.length() - 1; i >= 0; i--) {
                int num1 = Character.getNumericValue(val1.charAt(i));
                int num2 = Character.getNumericValue(val2.charAt(i));
                int calc = num1 + num2 + carry;
                if (calc > 9) {
                    carry = 1;
                    result++;
                } else {
                    carry = 0;
                }
            }
            
            if (result == 0) {
                System.out.println("No carry operation.");
            } else if (result == 1) {
                System.out.println(result + " carry operation.");
            } else {
                System.out.println(result + " carry operations.");
            }
        }
    }
}
