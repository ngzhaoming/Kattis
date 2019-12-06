import java.util.Scanner;

public class SumKindOfProblem{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dataSet = sc.nextInt();
            int value = sc.nextInt();
            int s1 = (value * (value + 1)) / 2;
            int s2 = s1 * 2 - value;
            int s3 = s1 * 2; 
            System.out.println(String.format("%d %d %d %d", dataSet, s1, s2, s3));
        }
    }
}
