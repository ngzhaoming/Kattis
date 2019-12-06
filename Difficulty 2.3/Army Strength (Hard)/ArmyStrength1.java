import java.util.Scanner;

public class ArmyStrength1{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int godNum = sc.nextInt();
            int mechNum = sc.nextInt();
            int godHighest = -1000;
            int mechHighest = -1000;
            for (int j = 0; j < godNum; j++) {
                int val = sc.nextInt();
                if (val > godHighest) {
                    godHighest = val;
                }
            }

            for (int j = 0; j < mechNum; j++) {
                int val = sc.nextInt();
                if (val > mechHighest) {
                    mechHighest = val;
                }
            }
            
            if (godNum == 0 && mechNum == 0) {
                 System.out.println("uncertain");
            } else if (godHighest > mechHighest || 
                    godHighest == mechHighest) {
                System.out.println("Godzilla");
            } else {
                System.out.println("MechaGodzilla");
            }
        }
    }
}
