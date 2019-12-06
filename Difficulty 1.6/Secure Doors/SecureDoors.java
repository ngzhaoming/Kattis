import java.util.Scanner;
import java.util.TreeSet;

public class SecureDoors{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<String> nameList = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String action = sc.next();
            String name = sc.next();
            if (action.equals("entry")) {
                if (nameList.contains(name)) {
                    System.out.println(name + " entered (ANOMALY)");
                } else {
                    System.out.println(name + " entered");
                    nameList.add(name);
                }
            } else {
                if (!nameList.contains(name)) {
                    System.out.println(name + " exited (ANOMALY)");
                } else {
                    System.out.println(name + " exited");
                    nameList.remove(name);
                }
            }
        }
    }
}
