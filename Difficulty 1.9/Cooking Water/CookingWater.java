import java.util.Scanner;

public class CookingWater{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[1001];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                list[j]++;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == n) {
                System.out.println("gunilla has a point");
                break;
            } else if (i == list.length - 1) {
                System.out.println("edward is right");
            }
        }
    }
}
