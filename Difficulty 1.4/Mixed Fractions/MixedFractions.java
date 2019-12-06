import java.util.Scanner;

public class MixedFractions{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            if (numerator == 0 && denominator == 0) {
                break;
            } else {
                int wholeNum = numerator / denominator;
                int newNum = numerator % denominator;
                System.out.println(String.format("%d %d / %d", wholeNum, newNum, denominator));
            }
        }
    }
}
