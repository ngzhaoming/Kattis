import java.util.Scanner;

public class ClimbingWorm{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int climb = sc.nextInt();
        int fall = sc.nextInt();
        int height = sc.nextInt();
        int total = 0;
        int min = 0;
        while (total < height) {
            total += climb;
            if (total >= height) {
                min++;
                break;
            }
            total -= fall;
            min++;
        }

        System.out.println(min);
    }
}
