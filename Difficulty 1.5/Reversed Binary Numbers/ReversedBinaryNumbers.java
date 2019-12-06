import java.util.Scanner;
import java.lang.Character;

public class ReversedBinaryNumbers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(reverseBinary(value));
    }

    public static int reverseBinary(int value) {
        int temp = value;
        String binary = "";
        while (temp > 0) {
            binary += temp % 2;
            temp /= 2;
        }

        int total = 0;
        int counter = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char currChar = binary.charAt(i);
            total += Math.pow(2, counter) * Character.getNumericValue(currChar);
            counter++;
        }

        return total;
    }
}
