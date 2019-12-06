import java.util.Scanner;

public class EpigDanceOff{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        int total = 1;

        String[] arr = new String[row];

        for(int i = 0; i < row; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < col; i++) {
            String curr = "";
            for (int j = 0; j < row; j++) {
                curr += arr[j].charAt(i);
            }

            if (curr.indexOf('$') == -1) {
                total++;
            }
        }

        System.out.println(total);
    }

    public static void printArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
