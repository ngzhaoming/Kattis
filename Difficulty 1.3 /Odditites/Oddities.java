import java.util.Scanner;

public class Oddities{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n, currNum;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            currNum = sc.nextInt();
            if (currNum % 2 == 0) {
                System.out.println(currNum + " is even");
            } else {
                System.out.println(currNum + " is odd");
            }
        }
    }
}
