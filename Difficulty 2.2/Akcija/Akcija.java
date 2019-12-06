import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Akcija{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int total = 0;
        while (list.size() >= 3) {
            total = total + list.get(list.size() - 1) + list.get(list.size() - 2);
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
        }
        while (list.size() > 0) {
            total += list.get(0);
            list.remove(0);
        }
        System.out.println(total);
    }
}
