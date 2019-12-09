import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();
        HashMap<Integer, Integer> val = new HashMap<>();
        ArrayList<Integer> order = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int curr = sc.nextInt();
            if (!order.contains(curr)) {
                order.add(curr);                
            }

            if (val.containsKey(curr)) {
                int oldVal = val.get(curr);
                oldVal++;
                val.replace(curr, oldVal); 
            } else {
                val.put(curr, 1);
            }
        }

        Iterator it = val.keySet().iterator();
        ArrayList<Tuple> result = new ArrayList<>();

        while(it.hasNext()) {
            int key = (Integer) it.next();
            int quan = val.get(key);
            result.add(new Tuple(key, quan, order.indexOf(key)));
        }

        Collections.sort(result, new sortEle());

        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                System.out.print(result.get(i) + " ");
            } else {
                System.out.print(result.get(i));
            }
        }
        System.out.println();
    }
}

class Tuple {
    int value;
    int quantity;
    int order;

    public Tuple(int value, int quantity, int order) {
        this.value = value;
        this.quantity = quantity;
        this.order = order;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < quantity; i++) {
            if (i != quantity - 1) {
                result = result + value + " ";
            } else {
                result += value;
            }
        }

        return result;
    }
}

class sortEle implements Comparator<Tuple> {
    public int compare(Tuple t1, Tuple t2) {
        if (t1.quantity - t2.quantity == 0) {
            return t1.order - t2.order;
        }

        return t2.quantity - t1.quantity;
    }
}
