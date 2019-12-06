import java.util.Scanner;

public class OwlAndFox{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int next = sc.nextInt();
            int temp = next;
            int counter = 1;
            while (temp > 0) {
                int ones = temp % 10;
                if (ones != 0) {
                    System.out.println(next - counter);
                    break;
                } else {
                    temp /= 10;
                    counter *= 10;
                }
            }
        }
    }
}
