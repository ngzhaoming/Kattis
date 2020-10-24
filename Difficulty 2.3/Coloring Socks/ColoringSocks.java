import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ColoringSocks {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long socks = sc.nextLong();
        long limit = sc.nextLong();
        long diff = sc.nextLong();
        ArrayList<Long> sockColor = new ArrayList<>();

        for (int i = 0; i < socks; i++) {
            sockColor.add(sc.nextLong());
        }

        Collections.sort(sockColor);

        long min = sockColor.get(0);
        long current = 1;
        long total = 0;

        for (int i = 1; i < socks; i++) {
            long curr = sockColor.get(i);

            if (curr - min > diff || current == limit) {
                //Send curr to the next batch
                total++;
                current = 1;
                min = curr;
                continue;
            }

            current++;
        }

        System.out.println(total + 1);
    }
}
