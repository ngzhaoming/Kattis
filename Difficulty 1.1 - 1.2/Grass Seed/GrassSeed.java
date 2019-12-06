import java.util.Scanner;

public class GrassSeed {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double C, N, X, Y; 
        C = sc.nextDouble();
        N = sc.nextDouble();
        double totalArea = 0;

        for (int i = 0; i < N; i++) {
            X = sc.nextDouble();
            Y = sc.nextDouble();
            totalArea += X * Y;
        }

        double totalCost = totalArea * C;

        System.out.println(String.format("%.7f", totalCost));
    }
}
