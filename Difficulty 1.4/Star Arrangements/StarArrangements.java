import java.util.Scanner;

public class StarArrangements{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value + ":");
        for (int i = 2; i < value / 2 + 2; i++) {
            int j = i - 1;
            if (value % (j + i) == 0 || 
                    value % (j + i) == i) {
                System.out.println(i + "," + j);
            }

            if (value % i == 0) {
                System.out.println(i + "," + i);
            }
        }
    }
}
