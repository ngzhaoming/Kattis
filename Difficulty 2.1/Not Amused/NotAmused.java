import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;

public class NotAmused{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Double> cost = new TreeMap<>();
        TreeMap<String, Double> enter = new TreeMap<>();
        int counter = 1;
        while (sc.hasNext()) {
            String action = sc.next();
            if (action.equals("ENTER")) {
                enter.put(sc.next(), sc.nextDouble());
            } else if (action.equals("EXIT")) {
                String name = sc.next();
                double totalCost = (sc.nextDouble() - enter.get(name)) * 0.1;
                if (cost.containsKey(name)) {
                    double currVal = cost.get(name);
                    currVal += totalCost;
                    cost.replace(name, currVal);
                } else {
                    cost.put(name, totalCost);
                }
            } else if (action.equals("CLOSE")) {
                if (counter > 1) {
                    System.out.println();
                }
                System.out.println("Day " + counter);

                Iterator it = cost.keySet().iterator();
                while (it.hasNext()) {
                    String currName = it.next() + "";
                    double costVal = cost.get(currName);
                    System.out.println(String.format("%s $%.2f", currName, costVal));
                }
                counter++;
                cost.clear();
                enter.clear();
            }
        }
    }
}
