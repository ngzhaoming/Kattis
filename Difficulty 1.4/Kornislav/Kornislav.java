import java.util.Scanner;
import java.util.Arrays;

public class Kornislav{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[4];

        for (int i = 0; i < 4; i++) {
            values[i] = sc.nextInt();
        }
        Arrays.sort(values);
        System.out.println(values[0] * values[2]);
    }
}
