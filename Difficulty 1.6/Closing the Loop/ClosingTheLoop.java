import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class ClosingTheLoop{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ropes = sc.nextInt();
            ArrayList<Integer> red = new ArrayList<>();
            ArrayList<Integer> blue = new ArrayList<>();
            for (int j = 0; j < ropes; j++) {
                String curr = sc.next();
                char type = curr.charAt(curr.length() - 1);
                int value = Integer.parseInt(curr.substring(0, curr.length() - 1));
                if (type == 'R') {
                    red.add(value);
                } else {
                    blue.add(value);
                }
            }
            if (red.size() == 0 || blue.size() == 0) {
                System.out.println(String.format("Case #%d: 0", i + 1));
            } else {
                Collections.sort(red);
                Collections.sort(blue);
                Collections.reverse(red);
                Collections.reverse(blue);
                int smaller = Math.min(red.size(), blue.size());
                double total = 0;
                for (int k = 0; k < smaller; k++) {
                    if (k > 0) {
                        total -= 1;
                    }
                    total += (double) red.get(k);
                    total += (double) blue.get(k);
                    total -= 1;
                }
                total -= 1;
                System.out.println(String.format("Case #%d: %d", i + 1, (int) total));
            }
        }
    }
}
