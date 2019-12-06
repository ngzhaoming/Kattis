import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class EenyMeeny {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int syllabus = sc.nextLine().split(" ").length;
        int total = sc.nextInt();
        sc.nextLine();
        ArrayList<String> unsorted = new ArrayList<>();
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();

        int counter = 0;
        
        // Initialize the arraylist first
        for (int i = 0; i < total; i++) {
            unsorted.add(sc.nextLine());
        }

        int flag = 0;
        for (int i = 0; i < total; i++) {
            counter += syllabus - 1;
            counter %= unsorted.size();
            String currPlayer = unsorted.get(counter);
            if (flag == 0) {
                first.add(currPlayer);
            } else {
                second.add(currPlayer);
            }

            flag = toggle(flag);
            unsorted.remove(currPlayer);
        }

        System.out.println(first.size());
        printArr(first);

        System.out.println(second.size());
        printArr(second);
    }

    public static void printArr(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static int toggle(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
