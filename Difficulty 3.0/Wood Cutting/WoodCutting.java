import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WoodCutting {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int people = sc.nextInt();
            ArrayList<Double> list = new ArrayList<>();
            
            for (int j = 0; j < people; j++) {
                int logs = sc.nextInt();
                double total = 0;

                for (int k = 0; k < logs; k++) {
                    total += sc.nextDouble();
                }

                list.add(total);
            }

            Collections.sort(list);

            double curr = 0;
            double total = 0;
            for (int j = 0; j < list.size(); j++) {
                curr += list.get(j);
                total += curr;
            }

            System.out.println(total / (double) people);
        }
    }
}
