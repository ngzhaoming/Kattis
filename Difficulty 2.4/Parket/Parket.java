import java.util.Scanner;

public class Parket{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int total = r + c;

        for (int i = 1; i < total / 2; i++) {
            if (total % i == 0) {
                int result = total / i;
                int brown = (result - 2) * (i - 2);
                int red = result * i - brown;
                if (brown == c && red == r) {
                    System.out.println(result + " " + i);
                    break;
                }
            }
        }
    }
}
