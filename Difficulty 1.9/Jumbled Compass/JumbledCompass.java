import java.util.Scanner;
import java.lang.Math;

public class JumbledCompass{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int curr = sc.nextInt();
        int actual = sc.nextInt();
        int diff = curr - actual;
        if (diff < 0) { //Turning clockwise
            diff = actual - curr;
            int anti = (360 - actual) + curr;
            if (anti < diff) {
                System.out.println(-anti);
            } else {
                System.out.println(diff);
            }   
        } else { //Turning anticlockwise
            int clock = (360 - curr) + actual;
            if (diff < clock) {
                System.out.println(-diff);
            } else {
                System.out.println(clock);
            }
        }
    }
}
