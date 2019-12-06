import java.util.Scanner;
import java.math.BigInteger;

public class SimpleAddition{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        BigInteger n1 = new BigInteger(num1);
        String num2 = sc.next();
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.add(n2);
        System.out.println(result);
    }
}
