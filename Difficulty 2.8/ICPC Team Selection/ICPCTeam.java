import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ICPCTeam {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int teams = sc.nextInt();
            int total = 0;

            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < teams * 3; j++) {
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);
            Collections.reverse(arr);

            int counter = 0;
            int index = 0;
            while (counter < teams) {
                total += arr.get(index + 1);
                index = index + 2;
                counter++;
            }
            System.out.println(total);
        }
    }
}
