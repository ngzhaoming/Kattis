import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;

public class Incognito{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int lines = sc.nextInt();
            sc.nextLine();
            HashMap<String, Integer> gears = new HashMap<>();

            for (int j = 0; j < lines; j++) {
                String[] inpt = sc.nextLine().split(" ");
                if (gears.containsKey(inpt[1])) {
                    int oldVal = gears.get(inpt[1]);
                    gears.replace(inpt[1], oldVal + 1);
                } else {
                    gears.put(inpt[1], 1);
                }
            }

            Iterator it = gears.values().iterator();
            int result = 1;
            while(it.hasNext()) {
                result *= ((int) it.next() + 1);
            }

            System.out.println(result - 1);
        }

    }
}
