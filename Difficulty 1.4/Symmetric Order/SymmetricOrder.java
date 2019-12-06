import java.util.Scanner;
import java.util.ArrayList;

public class SymmetricOrder{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        int counter = 1;

        while (set != 0) {
            ArrayList<String> topList = new ArrayList<>();
            ArrayList<String> btmList = new ArrayList<>();

            for (int i = 0; i < set; i++) {
                if (i % 2 == 0) {
                    topList.add(sc.next());
                } else {
                    btmList.add(sc.next());
                }
            }


            System.out.println("SET " + counter);
            for (int i = 0; i < topList.size(); i++) {
                System.out.println(topList.get(i));
            }
            for (int i = btmList.size() - 1; i >= 0; i--) {
                System.out.println(btmList.get(i));
            }

            counter++;
            set = sc.nextInt();
        }
    }
}
