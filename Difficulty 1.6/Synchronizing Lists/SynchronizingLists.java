import java.util.Scanner;
import java.util.Arrays;

public class SynchronizingLists{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                if (counter != 0) {
                    System.out.println();
                }
                int[] original = new int[n];
                int[] sortedList = new int[n];
                for (int i = 0; i < n; i++) {
                    int next = sc.nextInt();
                    original[i] = next;
                    sortedList[i] = next;
                }
                Arrays.sort(sortedList);
                int[] sortedSecond = new int[n];
                for (int i = 0; i < n; i++) {
                    sortedSecond[i] = sc.nextInt();
                }
                Arrays.sort(sortedSecond);
                for (int i = 0; i < n; i++) {
                    int curr = original[i];
                    int index = Arrays.binarySearch(sortedList, curr);
                    System.out.println(sortedSecond[index]);
                }
                counter++;
            }
        }
    }
}
