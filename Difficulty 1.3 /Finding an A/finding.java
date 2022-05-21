import java.util.Scanner;

public class finding {
    public static void printArr(String[] sarr) {
        for (int i =0 ; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] sarr = sc.nextLine().split("a", 2);

        if (sarr.length == 1) {
            System.out.println("a");
        } else {
            System.out.println("a" + sarr[1]);
        }
    }
}
