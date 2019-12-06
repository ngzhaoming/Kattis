import java.util.Scanner;

public class Exam{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int correct = sc.nextInt();
        String myAns = sc.next(); 
        String friend = sc.next();
        int wrong = myAns.length() - correct; // Count the number of wrong for friend
        int total = 0;
        for (int i = 0; i < myAns.length(); i++) {
            char myCurr = myAns.charAt(i);
            char friendCurr = friend.charAt(i);
            if (myCurr == friendCurr && correct != 0) {
                total++;
                correct--;
            } else if (myCurr != friendCurr && wrong != 0) {
                total++;
                wrong--;
            }
        }
        System.out.println(total);
    }
}
