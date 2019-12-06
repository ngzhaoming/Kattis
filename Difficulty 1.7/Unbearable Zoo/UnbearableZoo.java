import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeMap;

public class UnbearableZoo{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                TreeMap<String, Integer> myMap = new TreeMap<>();
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    String[] name = sc.nextLine().split(" ");
                    String animal = name[name.length - 1].toLowerCase();
                    if (myMap.containsKey(animal)) {
                        int value = myMap.get(animal);
                        myMap.replace(animal, value + 1);
                    } else {
                        myMap.put(animal, 1);
                    }
                }

                Iterator it = myMap.keySet().iterator();
                System.out.println(String.format("List %d:", counter));
                while(it.hasNext()) {
                    String name = it.next() + "";
                    int value = myMap.get(name);
                    System.out.println(String.format("%s | %d", name, value));
                }
                counter++;
            }
        }
    }
}
