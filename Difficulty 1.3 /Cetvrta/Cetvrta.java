import java.util.Scanner;
import java.util.ArrayList;

public class Cetvrta{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        int nextX, nextY;
        
        for (int i = 0; i < 3; i++) {
            nextX = sc.nextInt();
            nextY = sc.nextInt();
            if (X.contains(nextX)) {
                X.remove((Integer) nextX);
            } else {
                X.add(nextX);
            }

            if (Y.contains(nextY)) {
                Y.remove((Integer) nextY);
            } else {
                Y.add(nextY);
            }
        }

        System.out.println(X.get(0) + " " + Y.get(0));
    }
}
