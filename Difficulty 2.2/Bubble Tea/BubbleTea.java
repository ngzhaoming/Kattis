import java.util.Scanner;

public class BubbleTea {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] teaPrice = new int[n];

        for (int i = 0; i < n; i++) {
            teaPrice[i] = sc.nextInt();
        }

        int o = sc.nextInt();
        int[] topPrice = new int[o];

        for (int i = 0; i < o; i++) {
            topPrice[i] = sc.nextInt();
        }

        int cheapest = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int teaP = teaPrice[i];
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int currTop = sc.nextInt();
                int topP = topPrice[currTop - 1];
                int total = topP + teaP;
                if (total < cheapest) {
                    cheapest = total;
                }
            }
        }

        int money = sc.nextInt();
        int total = money / cheapest;
        if (total >= 1) {
            System.out.println(total - 1);
        } else {
            System.out.println(0);
        }
    }
}
