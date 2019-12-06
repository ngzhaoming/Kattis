import java.util.Scanner;

public class MissingNumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int highest = 1;
        boolean[] check = new boolean[200];

        for (int i = 0; i < check.length; i++) {
            check[i] = false; // Initialize everything to false
        }

        for (int i = 0; i < total; i++) {
            int currNum = sc.nextInt();
            if (i == total - 1) {
                highest = currNum;
                check[currNum - 1] = true;
            }

            check[currNum - 1] = true;
        }

        printArray(check, highest);
    }

    public static void printArray(boolean[] check, int highest) {
        int counter = 0;
        for (int i = 0; i < highest; i++) {
            if (check[i] == false) {
                System.out.println(i + 1);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("good job");
        }
    }
}
