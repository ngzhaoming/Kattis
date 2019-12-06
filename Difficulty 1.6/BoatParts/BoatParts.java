import java.util.Scanner;
import java.util.HashSet;

public class BoatParts{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> ship = new HashSet<>();
        int parts = sc.nextInt();
        int days = sc.nextInt();
        for (int i = 1; i <= days; i++) {
            String currPart = sc.next();
            ship.add(currPart);
            if (ship.size() == parts) {
                System.out.println(i);
                break;
            }
        }
        if (ship.size() != parts) {
            System.out.println("paradox avoided");
        }
    }
}
