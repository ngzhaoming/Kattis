import java.util.Scanner;
import java.lang.Math;

public class UnlockPattern{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[][] pattern = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pattern[i][j] = sc.nextInt();
            }
        }

        int counter = 1;
        int prevX = -1;
        int prevY = -1;
        double total = 0;
        while (counter < 10) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (counter == pattern[i][j]) {
                        if (counter == 1) {
                            prevX = i;
                            prevY = j;
                        } else {
                            int currX = i;
                            int currY = j;
                            if (currX == prevX || currY == prevY) {
                                double l1 = Math.abs((double) prevX - currX);
                                double l2 = Math.abs((double) prevY - currY);
                                total = total + l1 + l2;
                            } else {
                                double l1 = Math.abs((double) prevX - currX);
                                double l2 = Math.abs((double) prevY - currY);
                                double length = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
                                total += length;
                            }
                            prevX = currX;
                            prevY = currY;
                        }
                    }
                }
            }
            counter++;
        }
        System.out.println(total);
    }
}
