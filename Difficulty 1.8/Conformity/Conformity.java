import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Conformity {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            int fourth = sc.nextInt();
            int fifth = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            list.add(first);
            list.add(second);
            list.add(third);
            list.add(fourth);
            list.add(fifth);

            Collections.sort(list);

            String store = convertArr(list);

            if (hash.containsKey(store)) {
                int value = hash.get(store);
                int newVal = value + 1;
                hash.replace(store, value, newVal);
            } else {
                hash.put(store, 1);
            }
        }

        Collection list = hash.values();
        ArrayList<Integer> convertList = new ArrayList(list);
        Collections.sort(convertList);
        int currPop = 0;
        int total = 0;

        for (int i = convertList.size() - 1; i >= 0; i--) {
            int pop = convertList.get(i);
            if (pop >= currPop) {
                total += pop;
                currPop = pop;
            } else {
                break;
            }
        }
        
        System.out.println(total);
    }

    public static String convertArr(ArrayList<Integer> arr) {
        String result = "";

        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i);    
            result += " ";
        }

        return result;
    }
}
