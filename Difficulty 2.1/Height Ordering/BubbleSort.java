import java.util.Scanner;

public class BubbleSort{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int caseNum = sc.nextInt();
            int[] set = new int[20];
            int counter = 0;
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
                        counter++;
                        isSorted = false;
                    }
                }
                if (isSorted) {
                    break;
                }
            }

            System.out.println(String.format("%d %d", caseNum, counter)); 
        }
    }
}
