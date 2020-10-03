import java.util.Scanner;
import java.util.ArrayList;

public class Perket {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sour = new ArrayList<>();
        ArrayList<Integer> bitter = new ArrayList<>();
        int n = sc.nextInt();
        int difference = 1000000000;

        for (int i = 0; i < n; i++) {
            sour.add(sc.nextInt());
            bitter.add(sc.nextInt());
        }

        for (int i = 0; i < (1 << sour.size()); i++) {
            int currSour = 1;
            int currBitter = 0;
            for(int j = 0; j < sour.size(); j++) {
                if ((i & (1 <<j)) > 0) {
                    currSour *= sour.get(j);
                    currBitter += bitter.get(j);
                }
            }

            if (currSour != 1 && currBitter != 0) {
                int diff = Math.abs(currSour - currBitter);
                if (diff < difference) {
                    difference = diff;
                }
            }
        }

        System.out.println(difference);
    }
}
