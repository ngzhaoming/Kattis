import java.util.Scanner;

public class HIndex{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] citations = new int[1000000001];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cit = sc.nextInt();
            citations[cit]++;
        }

        int max = 0;
        int total = n;
        for (int i = 0; i < 1000000001; i++) {
            if (total < i) {
                break;
            } else {
                total -= citations[i];
                max = i;
            }
        }

        System.out.println(max);
    }
}
