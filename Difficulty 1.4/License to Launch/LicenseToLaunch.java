import java.util.Scanner;

public class LicenseToLaunch{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        long highest = 1000000001;
        for (int i = 0; i < n; i++) {
            long currVal = sc.nextInt();
            if (currVal < highest) {
                highest = currVal;
                index = i;
            }
        }

        System.out.println(index);
    }
}
