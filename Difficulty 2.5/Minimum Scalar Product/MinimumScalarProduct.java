import java.util.Scanner;
import java.util.Arrays;

public class MinimumScalarProduct{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int coordinate = sc.nextInt();
            long[] arr1 = new long[coordinate];   
            long[] arr2 = new long[coordinate];   
            long min = 0;
            for (int j = 0; j < coordinate; j++) {
                arr1[j] = sc.nextLong();
            }   
            for (int j = 0; j < coordinate; j++) {
                arr2[j] = sc.nextLong();
            }   
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int j = 0; j < arr1.length; j++) {
                min += (arr1[j] * arr2[arr1.length - j - 1]);
            }
            System.out.println(String.format("Case #%d: %d", i, min));
        }
    }
}
