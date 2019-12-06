import java.util.Scanner;
import java.util.ArrayList;

public class PervasiveHeartMonitor{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] list = sc.nextLine().split(" ");
            double total = 0;
            double counter = 0;
            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < list.length; i++) {
                if (!list[i].matches("[a-zA-Z]+")) {
                    total += Double.parseDouble(list[i]);
                    counter++;
                } else {
                    names.add(list[i]);
                }
            }

            System.out.print((total / counter) + " ");
            for (int i = 0; i < names.size(); i++) {
                if (i < names.size() - 1) {
                    System.out.print(names.get(i) + " ");
                } else {
                    System.out.print(names.get(i));
                }
            }
            System.out.println();
        }
    }
}
