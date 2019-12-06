import java.util.Scanner;

public class LostLineup {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] position = new int[size];
        position[0] = 1;
        for (int i = 2; i <= size; i++) {
            int val = sc.nextInt();
            position[val + 1] = i;
        }

        printArr(position);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
    }

}
