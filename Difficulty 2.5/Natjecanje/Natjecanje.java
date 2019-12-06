import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class Natjecanje{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> dmg = new HashSet<>();
        HashSet<Integer> rev = new HashSet<>();
        int total = sc.nextInt();
        int damaged = sc.nextInt();
        int reserved = sc.nextInt();
        for (int i = 0; i < damaged; i++) {
            dmg.add(sc.nextInt());
        }
        
        for (int i = 0; i < reserved; i++) {
            rev.add(sc.nextInt());
        }

        Iterator it = dmg.iterator();
        ArrayList<Integer> fixed = new ArrayList<>();
        while (it.hasNext()) {
            int curr = Integer.parseInt(it.next() + "");
            if (rev.contains(curr)) {
                rev.remove(curr);
                fixed.add(curr);
            }
        }

        for (int i = 0; i < fixed.size(); i++) {
            dmg.remove(fixed.get(i));
        }

        Iterator it2 = dmg.iterator();
        fixed.clear();
        while (it2.hasNext()) {
            int curr = Integer.parseInt(it2.next() + "");
            if (rev.contains(curr - 1)) {
                rev.remove(curr - 1);
                fixed.add(curr);
            } else if (rev.contains(curr + 1)) {
                rev.remove(curr + 1);
                fixed.add(curr);
            }
        }

        for (int i = 0; i < fixed.size(); i++) {
            dmg.remove(fixed.get(i));
        }
        System.out.println(dmg.size());
    }
}
