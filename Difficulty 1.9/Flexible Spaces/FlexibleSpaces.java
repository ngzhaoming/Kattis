import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class FlexibleSpaces{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> mySet = new TreeSet<>();
        ArrayList<Integer> partition = new ArrayList<>();
        int max = sc.nextInt();
        int n = sc.nextInt();
        partition.add(max);
        partition.add(0);
        for (int i = 0; i < n; i++) {
            partition.add(sc.nextInt());
        }
        
        Collections.sort(partition);

        for (int i = 0; i < partition.size(); i++) {
            int curr = partition.get(i);
            for (int j = i + 1; j < partition.size(); j++) {
                int val = partition.get(j) - curr;
                mySet.add(val);
            }
        }

        Iterator it = mySet.iterator();
        while(it.hasNext()) {
            String input = it.next() + "";
            if (it.hasNext()) {
                System.out.print(input + " ");
            } else {
                System.out.print(input);
            }
        }
        System.out.println();
    }
}
