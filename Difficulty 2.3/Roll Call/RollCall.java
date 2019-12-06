import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;

public class RollCall{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, ArrayList<String>> last = new TreeMap<>();
        HashMap<String, Integer> first = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            String[] input = s.split(" ");
            if (last.containsKey(input[1])) {
                ArrayList<String> old = last.get(input[1]);
                old.add(input[0]);
            } else {
                ArrayList<String> firstNames = new ArrayList<>();
                firstNames.add(input[0]);
                last.put(input[1], firstNames);
            }

            first.put(input[0], first.getOrDefault(input[0], 0) + 1);
        }

        Iterator it = last.keySet().iterator();
        while (it.hasNext()) {
            String lastName = it.next() + "";
            ArrayList<String> currList = last.get(lastName);
            if (currList.size() > 1) { // More than 1 people with the same last name
                Collections.sort(currList);
                for (int i = 0; i < currList.size(); i++) {
                    String currFirstName = currList.get(i);
                    if (first.get(currFirstName) > 1) {
                        System.out.println(currFirstName + " " + lastName);
                    } else {
                        System.out.println(currList.get(i));
                    }
                }
            } else {
                String currFirstName = currList.get(0);
                if (first.get(currFirstName) > 1) {
                    System.out.println(currFirstName + " " + lastName);
                } else {
                    System.out.println(currList.get(0));
                }
            }
        }
    }
}
