import java.util.Scanner;

public class Volim{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int questions = sc.nextInt();
        int limit = 210;
        int currTime = 0;
        for (int i = 0; i < questions; i++) {
            currTime += sc.nextInt();
            if (currTime > limit) {
                System.out.println(initial);
                break;
            } else {
                String action = sc.next();
                if (action.equals("T")) {
                    if (initial == 8) {
                        initial = 1;
                    } else {
                        initial += 1;
                    }
                }
            }
        }
    }
}
