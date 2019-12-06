import java.util.Scanner;
import java.lang.Math;

public class EraseSecurely{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String initial = sc.next();
        String result = sc.next();
        if (number % 2 == 0) {
            if (initial.equals(result)) {
                System.out.println("Deletion succeeded");
            } else {
                System.out.println("Deletion failed");
            }
        } else {
            boolean flag = true;
            for (int i = 0; i < initial.length(); i++) {
                char initVal = initial.charAt(i);
                char resVal = result.charAt(i);
                if (initVal == resVal) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Deletion succeeded");
            } else {
                System.out.println("Deletion failed");
            }
        }
    }
}
