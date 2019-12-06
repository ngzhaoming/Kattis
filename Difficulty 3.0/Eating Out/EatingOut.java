import java.util.Scanner;

public class EatingOut{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        if (a + b + c <= 2 * m) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
