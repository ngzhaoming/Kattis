import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;

public class Peragrams{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        String input = sc.next();
        boolean flag = true;
        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (myMap.containsKey(curr)) {
                int val = myMap.get(curr);
                myMap.replace(curr, val + 1);
            } else {
                myMap.put(curr, 1);
            }
        }
        Iterator it = myMap.values().iterator();
        while (it.hasNext()) {
            int currVal = Integer.parseInt(it.next() + "");
            if (currVal % 2 != 0 && flag) {
                flag = false;
            } else if (currVal % 2 != 0) {
                total++;
            }
        }
        System.out.println(total);
    }
}
