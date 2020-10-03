import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FastFood {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long total = 0;
            int prizes = sc.nextInt();
            int tickets = sc.nextInt();
            ArrayList<ArrayList<Integer>> prizeTix = new ArrayList<>();
            ArrayList<Integer> tixNum = new ArrayList<>();
            ArrayList<Integer> prizePrice = new ArrayList<>();

            for (int j = 0; j < prizes; j++) {
                int x = sc.nextInt(); //Indicates no. of tix for prize
                ArrayList<Integer> currTix = new ArrayList<>();
                for (int k = 0; k < x; k++) {
                    int currTixNum = sc.nextInt();
                    currTix.add(currTixNum);
                }
                int currPrice = sc.nextInt();
                prizePrice.add(currPrice);
                prizeTix.add(currTix);
            }

            for (int j = 0; j < tickets; j++) {
                int currQty = sc.nextInt();
                tixNum.add(currQty);
            }

            for (int j = 0; j < prizes; j++) {
                ArrayList<Integer> currPrizeList = prizeTix.get(j);
                ArrayList<Integer> sorter = new ArrayList<>();
                for (int k = 0; k < currPrizeList.size(); k++) {
                    int currIndex = currPrizeList.get(k) - 1;
                    int extractTix = tixNum.get(currIndex);
                    sorter.add(extractTix);
                }
                Collections.sort(sorter);
                total += (sorter.get(0) * prizePrice.get(j));
            }

            System.out.println(total);
        }
    }
}
