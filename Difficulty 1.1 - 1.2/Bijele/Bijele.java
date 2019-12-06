import java.util.Scanner;

public class Bijele {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalSet = {1, 1, 2, 2, 2, 8};
        int[] changedSet = new int[6];

        for (int i = 0; i < 6; i++) {
            changedSet[i] = originalSet[i] - sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            if (i != 5) {
                System.out.print(changedSet[i] + " ");
            } else {
                System.out.print(changedSet[i]);
            }
        }
        System.out.println();
    }
}
