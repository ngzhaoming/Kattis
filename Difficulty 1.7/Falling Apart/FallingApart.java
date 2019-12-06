import java.util.Scanner;
import java.util.Arrays;

public class FallingApart{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        boolean flag = true;
        int alice = 0;
        int bob = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            if (flag) {
                alice += list[i];
                flag = false;
            } else {
                bob += list[i];
                flag = true;
            }
        }
        System.out.println(String.format("%d %d", alice, bob));
    }
}
