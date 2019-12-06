import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Iterator;

public class BaconEggsAndSpam{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sc.nextLine();
            TreeMap<String, ArrayList<String>> myMap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                String[] list = sc.nextLine().split(" ");
                String name = list[0];
                for (int j = 1; j < list.length; j++) {
                    String food = list[j];
                    if (myMap.containsKey(food)) {
                        ArrayList<String> old = myMap.get(food);
                        old.add(name);
                        myMap.replace(food, old);
                    } else {
                        ArrayList<String> listName = new ArrayList<>();
                        listName.add(name);
                        myMap.put(food, listName);
                    }
                }
            }
            Iterator it = myMap.keySet().iterator();
            while (it.hasNext()) {
                String foodName = it.next() + "";
                System.out.print(foodName + " ");
                ArrayList<String> name = myMap.get(foodName);
                Collections.sort(name);
                for (int k = 0; k < name.size(); k++) {
                    if (k < name.size() - 1) {
                        System.out.print(name.get(k) + " ");
                    } else {
                        System.out.print(name.get(k));
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
