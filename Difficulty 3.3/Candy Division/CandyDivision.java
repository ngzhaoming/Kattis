import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CandyDivision{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long candies = Long.parseLong(br.readLine());
        long temp = candies -1;
        ArrayList<Long> list = new ArrayList<>();
        list.add((long) 0);
        list.add(candies - 1);
        for (int i = 2; i < temp; i++) {
            if (candies % i == 0) {
                long val = i;
                long val1 = candies / i;
                if (val != val1) {
                    list.add(val1 - 1);
                }
                list.add(val - 1);
            }
            temp = candies / i;
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " ");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println();
    }
}
