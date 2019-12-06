import java.util.Scanner;
import java.math.BigInteger;

public class ADifferentProblem{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger v1 = new BigInteger(sc.next());
            BigInteger v2 = new BigInteger(sc.next());
            BigInteger ans = v1.subtract(v2).abs();
            System.out.println(ans.toString());
        }
    }
}
