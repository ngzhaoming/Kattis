import java.util.Scanner;

public class DriverDilemma {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double capacity = sc.nextDouble() / 2;
        double leak = sc.nextDouble();
        double dist = sc.nextDouble();

        double best = 0.0;

        for (int i = 0; i < 6; i++) {
            double speed = sc.nextDouble();
            double fuel = sc.nextDouble();
            double hpg = speed / fuel; //Hours per gallon
            double totalTime = dist / speed;
            double totalFuel = totalTime * hpg + totalTime * leak;

            if (totalFuel <= capacity) {
                best = speed;
            }
        }

        int result = (int) best;
        if(result != 0) {
           System.out.println("YES" + " " + result); 
        } else {
            System.out.println("NO");
        }
    }
}
