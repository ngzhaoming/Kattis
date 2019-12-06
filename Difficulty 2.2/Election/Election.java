import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public class Election{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> candidates = new HashMap<>();
        HashMap<String, Integer> votes = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String family = sc.nextLine();
            candidates.put(name, family);
            votes.put(name, 0);
        }

        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String vote = sc.nextLine();
            if (votes.containsKey(vote)) {
                int val = votes.get(vote) + 1;
                votes.replace(vote, val);
            }
        }

        Iterator it = votes.keySet().iterator();
        int highest = -100;
        ArrayList<String> high = new ArrayList<>();
        while (it.hasNext()) {
            String name = it.next() + "";
            int currVal = votes.get(name);
            if (currVal > highest) {
                high.clear();
                high.add(name);
                highest = currVal;
            } else if (currVal == highest) {
                high.add(name);
            }
        }
        if (high.size() > 1) {
            System.out.println("tie");
        } else if (high.size() == 1) {
            System.out.println(candidates.get(high.get(0)));
        }
    }
}
