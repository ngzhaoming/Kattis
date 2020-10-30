import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankQueue {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();

        int[] arr = new int[time + 1];
        ArrayList<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Person curr = new Person(sc.nextInt(), sc.nextInt());
            list.add(curr);
        }

        Collections.sort(list, new sortPerson()); 
        //printArr(list);

        for (int i = 0; i < n; i++) {
            Person curr = list.get(i);
            int maxTime = curr.time;

            for (int j = maxTime; j >= 0; j--) {
                if (arr[j] == 0) {
                    arr[j] = curr.amt;
                    break;
                }
            }
        }

        int total = 0; 
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println(total);
    }

    public static void printArr(ArrayList<Person> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

class Person {
    int amt;
    int time;

    public Person(int amt, int time) {
        this.amt = amt;
        this.time = time; 
    }

    @Override
    public String toString() {
        return amt + " " + time;
    }
}

class sortPerson implements Comparator<Person> {
    public int compare (Person a, Person b) {
        return b.amt - a.amt;
    }
}
