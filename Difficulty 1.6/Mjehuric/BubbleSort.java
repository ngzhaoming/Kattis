import java.util.Scanner;

public class BubbleSort{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] set = new int[5];
        for (int i = 0; i < set.length; i++) {
            set[i] = sc.nextInt();
        }
        for (int i = 1; i < set.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < set.length - 1; j++) {
                if (set[j] > set[j + 1]) {
                    int temp = set[j];
                    set[j] = set[j + 1];
                    set[j + 1] = temp;
                    System.out.println(String.format("%d %d %d %d %d", 
                    set[0], set[1], set[2], set[3], set[4]));
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
