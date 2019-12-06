import java.util.Scanner;
import java.util.Arrays;

public class PlantingTrees{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] trees = new long[n];
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextLong();
        }
        Arrays.sort(trees);
        for (int i = 0; i < n; i++) {
            trees[i] += trees.length - i;
        }
        Arrays.sort(trees);
        System.out.println(trees[trees.length - 1] + 1);
    }
}
