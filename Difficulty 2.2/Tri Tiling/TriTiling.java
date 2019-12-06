import java.util.Scanner;

public class TriTiling{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            if (n % 2 != 0) {
                System.out.println(0);
            } else {
                long result = triTiling(n);
                System.out.println(result);
            } 
        }
    }

    public static long triTiling(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 2) {
            return 3;
        } else {
            return (4 * triTiling(n - 2)) - (triTiling(n - 4));
        }
    }
}
