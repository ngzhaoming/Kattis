import java.util.Scanner;
import java.util.ArrayList;

public class transit {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> walk = new ArrayList<>();
        ArrayList<Integer> busRide = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            int currInt = sc.nextInt();
            walk.add(currInt);
        }

        for (int i = 0; i < n; i++) {
            int currInt = sc.nextInt();
            busRide.add(currInt);
        }

        int currArrive = 0;
        for (int i = 0; i < n; i++) {
            currArrive += walk.get(i);
            int busArrival = sc.nextInt();
            while (currArrive % busArrival != 0) {
                currArrive++;
            }
            currArrive += busRide.get(i);
        }

        currArrive += walk.get(n);


        if (currArrive > end) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
