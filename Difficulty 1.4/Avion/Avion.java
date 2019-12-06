import java.util.Scanner;
import java.util.ArrayList;

public class Avion {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String curr = sc.nextLine();
            if (curr.contains("FBI")) {
                arrList.add(i + 1);
            }
        }

        if (arrList.size() == 0) {
            System.out.println("HE GOT AWAY!");
        } else {
            printArr(arrList);
        }
    }

    public static void printArr(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (i != arr.size() - 1) {
                System.out.print(arr.get(i) + " ");
            } else {
                System.out.print(arr.get(i));
                System.out.println();
            }
        }
    }
}
