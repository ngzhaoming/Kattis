import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Warehouse{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ship = sc.nextInt();
            HashMap<String, Integer> myMap = new HashMap<>();
            for (int j = 0; j < ship; j++) {
                String name = sc.next();
                int val = sc.nextInt();
                if (myMap.containsKey(name)) {
                    int old = myMap.get(name);
                    myMap.replace(name, old + val);
                } else {
                    myMap.put(name, val);
                }
            }
            
            Iterator it = myMap.keySet().iterator();
            ArrayList<Customer> custList = new ArrayList<>();

            while (it.hasNext()) {
                String name = it.next() + "";
                int val = myMap.get(name);
                Customer cust = new Customer(name, val);
                custList.add(cust);
            }
            Collections.sort(custList);
            System.out.println(myMap.size());
            for (int j = 0; j < custList.size(); j++) {
                System.out.println(custList.get(j));
            }
        }
    }
}
