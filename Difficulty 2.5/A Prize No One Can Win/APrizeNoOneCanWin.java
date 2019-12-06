import java.util.Scanner;
import java.util.Arrays;

public class APrizeNoOneCanWin{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        long mini = sc.nextLong();
        long[] list = new long[amount];
        for (int i = 0; i < amount; i++) {
            list[i] = sc.nextLong();
        }
        Arrays.sort(list);
        for (int i = list.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(1);
                break;
            } else {
                long total = list[i] + list[i - 1];
                if (total <= mini) {
                    System.out.println(i + 1); 
                    break;
                }
            }
        }
    }
}
