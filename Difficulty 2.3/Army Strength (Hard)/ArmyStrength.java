import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class ArmyStrength{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> gozilla = new ArrayList<>();
            ArrayList<Integer> mechgozilla = new ArrayList<>();
            int godNum = sc.nextInt();
            int mechNum = sc.nextInt();
            for (int j = 0; j < godNum; j++) {
                gozilla.add(sc.nextInt());
            }

            for (int j = 0; j < mechNum; j++) {
                mechgozilla.add(sc.nextInt());
            }
            
            Collection.sort(gozilla);
            Collection.sort(mechgozilla);

            while (mechgozilla.size() > 0 && gozilla.size() > 0) {
                int lowgod = gozilla.get(0);
                int lowmech = mechgozilla.get(0);

                if (lowgod > lowmech || lowgod == lowmech) {
                    mechgozilla.remove(0);
                } else {
                    gozilla.remove(0);
                }
            }

            if (gozilla.size() > 0) {
                System.out.println("Godzilla");
            } else if (mechgozilla.size() > 0) {
                System.out.println("MechaGodzilla");
            } else {
                System.out.println("uncertain");
            }
        }
    }
}
