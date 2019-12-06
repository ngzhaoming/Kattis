import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Simplicity{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            int val = myMap.getOrDefault(currChar, 0) + 1;
            myMap.put(currChar, val);
        }

        if (myMap.size() <= 2) {
            System.out.println(0);
        } else {
            Iterator it = myMap.keySet().iterator();
            int total = 0;
            PriorityQueue<Letters> pq = new PriorityQueue<Letters>(
            new LettersComparator());
            while (it.hasNext()) {
                char currChar = (Character) it.next();
                int value = myMap.get(currChar);
                pq.add(new Letters(currChar, value));
            }

            while (pq.size() > 2) {
                Letters currLet = pq.poll();
                total += currLet.num;
            }
            System.out.println(total);
        }
        
    }
}
