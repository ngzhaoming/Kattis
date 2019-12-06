import java.util.Scanner;
import java.util.Arrays;

public class PermutedArithmeticSequence{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] list = new int[m];
            for (int j = 0; j < m; j++) {
                //Input the data into the array
                list[j] = sc.nextInt();
            }

            boolean flag = checkArithmetic(list);

            if (flag) {
                System.out.println("arithmetic");
            } else {
                Arrays.sort(list);
                flag = checkArithmetic(list);
                if (flag) {
                    System.out.println("permuted arithmetic");
                } else {
                    System.out.println("non-arithmetic");
                }
            }
        }
    }

    public static boolean checkArithmetic(int[] list) {
        int prev = list[0];
        int diff = 0;
        boolean flag = true;
        for (int i = 1; i < list.length; i++) {
            int next = list[i];
            if (i == 1) {
                diff = prev - next;
                prev = next;
            } else {
                int check = prev - next;
                if (check != diff) {
                    flag = false;
                    break;
                }
                prev = next;
            }
        }
        return flag;
    }
}
