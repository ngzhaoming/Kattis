import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Relay {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<Runner> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Runner curr = new Runner(sc.next(), sc.nextDouble(), sc.nextDouble());
            lst.add(curr);
        }

        Collections.sort(lst, new SortSecond());

        double best = Double.MAX_VALUE;
        Runner first = lst.get(0);
        Runner second = lst.get(1);
        Runner third = lst.get(2);
        Runner fourth = lst.get(3);
        double timing = first.second + second.second + third.second;
        String firstThree = String.format(first.name + " " + second.name + " " + third.name); 
        String bestLine = ""; 

        for (int i = 0; i < n; i++) {
            double result = 0;
            Runner currRun = lst.get(i);
            String lineup = "";

            //Check if it's any of the best flying runners
            if (currRun.equals(first)) {
                result = first.first + second.second + third.second + fourth.second;
                lineup = firstThree + " " + fourth.name;
            } else if (currRun.equals(second)) {
                result = first.second + second.first + third.second + fourth.second;
                lineup = second.name + " " + first.name + " " + third.name + " " + fourth.name;
            } else if (currRun.equals(third)) {
                result = first.second + second.second + third.first + fourth.second;
                lineup = third.name + " " + first.name + " " + second.name + " " + fourth.name;
            } else {
                result = currRun.first + timing; 
                lineup = (currRun.name + " " + firstThree);
            }

            if (result < best) {
                bestLine = lineup;
                best = result;
            }
        }

        String[] arr = bestLine.split(" ");
        System.out.println(best);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Runner {
    String name;
    double first;
    double second;
    double diff;

    public Runner(String name, double first, double second) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.diff = first - second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format(name + " " + first + " " + second);
    }
}

class SortSecond implements Comparator<Runner> {
    public int compare(Runner a, Runner b) {
        double diff = a.second - b.second;

        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
