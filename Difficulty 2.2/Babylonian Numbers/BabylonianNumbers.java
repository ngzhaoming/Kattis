import java.util.Scanner;
import java.lang.Character;
import java.lang.Math;

public class BabylonianNumbers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            int counter = 0;
            long total = 0;
            int tens = 0;
            long val = 0;
            for (int j = input.length() - 1; j >= 0; j--) {
                char currChar = input.charAt(j);
                if (currChar == ',' || j == 0) {
                    if (j == 0) {
                        val += Math.pow(10, tens) * Character.getNumericValue(currChar);
                        tens++;
                    }
                    total += (Math.pow(60, counter) * val);
                    counter++;
                    val = 0;
                    tens = 0;
                } else {
                    val += Math.pow(10, tens) * Character.getNumericValue(currChar);
                    tens++;
                }
            }
            System.out.println(total);
        }
    }
}
