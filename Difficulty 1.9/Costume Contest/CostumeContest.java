import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.TreeMap;

public class CostumeContest{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> costumes = new TreeMap<>();
        PriorityQueue<String> lowest = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            String next = sc.next();
            if (costumes.containsKey(next)) {
                int value = costumes.get(next);
                costumes.replace(next, value + 1);
            } else {
                costumes.put(next, 1);
            }
        }
        int currLow = 1001;
        Iterator<String> mySet = costumes.keySet().iterator();
        while (mySet.hasNext()) {
            String costume = mySet.next();
            int value = costumes.get(costume);
            if (value < currLow) {
                currLow = value;
                lowest.clear();
                lowest.add(costume);
            } else if (value == currLow) {
                lowest.add(costume);
            }
        }
        while (!lowest.isEmpty()) {
            System.out.println(lowest.poll());
        }
    }
}
