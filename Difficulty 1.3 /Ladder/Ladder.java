import java.util.Scanner;
import java.lang.Math;

public class Ladder{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        double exact = h / (Math.sin(v * (Math.PI / 180)));

        System.out.println((int) exact + 1);
    }
}
