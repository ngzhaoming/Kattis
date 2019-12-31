import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class BankQueue {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int time = sc.nextInt();

        ArrayList<People> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextLong(), sc.nextInt());
        }

        Collections.sort(list, new SortPeople());

        long[] amount = new long[time];

        for (int i = 0; i < list.size(); i++) {
            long currAmt = list.get(i).amount;
            int currDur = 
        }

        long total = 0;
        for (int i = 0; i < time; i++) {
            total += amount[i];
        }

        System.out.println(total);
    }
}

class People {
    long amount;
    int duration;

    public People(long amount, int duration) {
        this.amount = amount;
        this.duration = duration;
    }
}

class SortPeople implements Comparator<People> {
    public int compare(People a, People b) {
        return a.amount - b.amount;
    }
}
