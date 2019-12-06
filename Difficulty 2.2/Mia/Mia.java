import java.util.Scanner;
import java.lang.Math;

public class Mia{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int s0 = sc.nextInt();
            int s1 = sc.nextInt();
            int r0 = sc.nextInt();
            int r1 = sc.nextInt();
            if (s0 == 0) {
                break;
            }

            System.out.println(checkWinner(s0, s1, r0, r1));
        }
    }

    public static String checkWinner(int s0, int s1, int r0, int r1) {
        int big1 = Math.max(s0, s1); 
        int small1 = Math.min(s0, s1); 
        int big2 = Math.max(r0, r1); 
        int small2 = Math.min(r0, r1); 
        int val1 = big1 * 10 + small1;
        int val2 = big2 * 10 + small2;
        if (val1 == val2) {
            return "Tie.";
        }
        //First check for 21 and 12
        if (val1 == 21) {
            return "Player 1 wins.";
        } else if (val2 == 21) {
            return "Player 2 wins.";
        }

        //Next check for doubles
        if (s0 == s1) {
            if (r0 == r1) {
                if (val1 > val2) {
                    return "Player 1 wins.";
                } else {
                    return "Player 2 wins.";
                }
            } else {
                return "Player 1 wins.";
            }
        } else if (r0 == r1) {
            return "Player 2 wins."; 
        }

        //Last check for others
        if (val1 > val2) {
            return "Player 1 wins.";
        } else {
            return "Player 2 wins.";
        }
    }
}
