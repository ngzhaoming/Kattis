import java.util.Scanner;

public class HoneycombWalk {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 0, 6, 12, 90, 360, 2040, 10080, 54810, 290640, 1588356, 8676360, 47977776, 266378112, 1488801600};

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            System.out.println(arr[curr]);
        }
    }
}
