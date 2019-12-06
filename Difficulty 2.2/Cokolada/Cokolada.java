import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class Cokolada{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = logTwo(n);
        int power = (int) Math.pow(2, exp); 
        String binary = Integer.toBinaryString(n);
        int breaks = binary.length();
        for (int i = binary.length() - 1; i >= 0; i--) {
            int val = Character.getNumericValue(binary.charAt(i));
            if (val == 1 && i != 0) {
                break;
            } else if (i == 0 || val != 1) {
                breaks--;
            } 
        }

        System.out.println(String.format("%d %d", power, breaks));
    }

    public static int logTwo(int n) {
        int result = (int) Math.ceil(Math.log(n) / Math.log(2));
        return result;
    }
}
