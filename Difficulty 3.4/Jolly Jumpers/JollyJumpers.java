import java.util.Scanner;
import java.lang.Math;

public class JollyJumpers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] list = sc.nextLine().split(" ");
            boolean[] boolArr = new boolean[list.length - 1];

            int prev = Integer.parseInt(list[0]);

            for (int i = 1; i < list.length; i++) {
                int curr = Integer.parseInt(list[i]);
                int diff = Math.abs(prev - curr);

                if (diff < boolArr.length) {
                    boolArr[diff] = true;
                }
                
                prev = curr;
            }

            boolean verdict = true;
            for (int i = 1; i < boolArr.length; i++) {
                boolean curr = boolArr[i];
                if (curr == false) {
                    verdict = false;
                    break;
                }
            }

            if (verdict) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }
}
