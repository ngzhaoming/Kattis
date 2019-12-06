import java.util.Scanner;

public class AboveAverage{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            double totalScore = 0;
            double[] setScore = new double[m];
            for (int j = 0; j < m; j++) {
                double next = sc.nextDouble();
                setScore[j] = next;
                totalScore += next;
            }
            double average = totalScore / m;
            double num = 0;
            for (int j = 0; j < setScore.length; j++) {
                if (setScore[j] > average) {
                    num++;
                }
            }
            double percentage = num / m * 100;
            System.out.println(String.format("%.3f", percentage) + "%");
        }
    }
}
