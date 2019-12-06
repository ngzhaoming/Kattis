import java.util.Scanner;
import java.util.ArrayList;

public class BlackFriday{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[7];
        ArrayList<Integer> outcome = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list[val]++;
            outcome.add(val);
        }

        int unique = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] == 1) {
                unique = i;
            }
        }

        if (unique > 0) {
            int index = outcome.indexOf(unique) + 1;
            System.out.println(index);
        } else {
            System.out.println("none");
        }
    }
}
