import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Iterator;

public class SortofSorting{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            TreeMap<String, ArrayList<String>> myMap = new TreeMap<>();
            if (n == 0) {
                break;
            }

            if (counter > 1) {
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                String name = sc.next();
                String prefix = name.substring(0, 2);
                ArrayList<String> list = new ArrayList<>();
                if (myMap.containsKey(prefix)) {
                    list = myMap.get(prefix);
                    list.add(name);
                    myMap.replace(prefix, list);
                } else {
                    list.add(name);
                    myMap.put(prefix, list);
                }
            }

            Iterator it = myMap.keySet().iterator();
            while (it.hasNext()) {
                String curr = it.next() + "";
                ArrayList<String> list = myMap.get(curr);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            counter++;
        }
    }
}
