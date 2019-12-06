import java.util.Scanner;
import java.lang.StringBuilder;

public class Filip {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder largest = new StringBuilder();
        int A, B, tempA, tempB;
        A = sc.nextInt();
        B = sc.nextInt();
        tempA = A;
        tempB = B;

        while (largest.length() == 0) {
            if (tempA % 10 > tempB % 10) {
                largest.append(A);
            } else if (tempA % 10 == tempB % 10) {
                tempA /= 10;
                tempB /= 10;
            } else {
                largest.append(B);
            }
        }

        System.out.println(largest.reverse());
    }
}
