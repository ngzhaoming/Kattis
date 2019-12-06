import java.util.Scanner;

public class Tri{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        if (v1 + v2 == v3) {
            System.out.println(v1 + "+" + v2 + "=" + v3);
        } else if (v1 - v2 == v3) {
            System.out.println(v1 + "-" + v2 + "=" + v3);
        } else if (v1 * v2 == v3) {
            System.out.println(v1 + "*" + v2 + "=" + v3);
        } else if ((double) v1 / v2 == v3) {
            System.out.println(v1 + "/" + v2 + "=" + v3);
        } else if (v1 == v2 + v3) {
            System.out.println(v1 + "=" + v2 + "+" + v3);
        } else if (v1 == v2 - v3) {
            System.out.println(v1 + "=" + v2 + "-" + v3);
        } else if (v1 == v2 * v3) {
            System.out.println(v1 + "=" + v2 + "*" + v3);
        } else if (v1 == (double) v2 / v3) {
            System.out.println(v1 + "=" + v2 + "/" + v3);
        }
    }
}
