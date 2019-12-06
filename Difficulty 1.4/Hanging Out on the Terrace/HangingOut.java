import java.util.Scanner;

public class HangingOut{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n = sc.nextInt();
        int curr = 0;
        int denied = 0;
        for (int i = 0; i < n; i++) {
            String action = sc.next();
            if (action.equals("enter")) {
                int addition = sc.nextInt();
                curr += addition;
                if (curr > limit) {
                    curr -= addition;
                    denied++;
                }
            } else {
                curr -= sc.nextInt();
            }
        }

        System.out.println(denied);
    }
}
