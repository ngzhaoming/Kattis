import java.util.Scanner;

public class SchoolSpirit {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;
        double expectedTotal = 0.0;

        for (int i = 0; i < n; i++) {
            double currScore = sc.nextDouble();
            total += (currScore * Math.pow((0.8), i));
            double expected = (currScore * Math.pow((0.8), i - 1)) * i + (currScore * Math.pow((0.8), i)) * (n - i - 1);  
            expectedTotal += expected;
        }

        System.out.println(total/5);
        System.out.println(expectedTotal/5/n);
    }
}
