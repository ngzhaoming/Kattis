import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class GrandpaBernie{
    public static void main (String [] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        HashMap<String, ArrayList<Integer>> myMap = new HashMap<>();
        HashSet<String> checked = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String country = sc.next();
            int year = sc.nextInt();
            ArrayList<Integer> years = myMap.getOrDefault(country,
                new ArrayList<Integer>());
            years.add(year);
            myMap.put(country, years);
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String coun = sc.next();
            int num = sc.nextInt();
            ArrayList<Integer> counYears = myMap.get(coun);
            if (!checked.contains(coun) && counYears.size() > 1) {
                Collections.sort(counYears);
                myMap.put(coun, counYears);
                checked.add(coun);
            }
            int val = counYears.get(num - 1);
            System.out.println(val);
        }
    }
}
