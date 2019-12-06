import java.util.Scanner;
import java.util.Arrays;

public class Cetiri{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[3];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int diff1 = list[1] - list[0];
        int diff2 = list[2] - list[1];
        if (diff1 == diff2) {
            System.out.println(list[2] + diff2);
        } else if (diff1 > diff2) {
            System.out.println(list[0] + diff2);
        } else {
            System.out.println(list[1] + diff1);
        }
    }
}
