import java.util.Scanner;
import java.lang.Math;

public class IdentifyingMapTiles{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String quad = sc.next();
        int zoom = quad.length();
        int level = 1;
        int X = 0;
        int Y = 0;
        for (int i = quad.length() - 1; i >= 0; i--) {
            int curr = Character.getNumericValue(quad.charAt(i)); 
            if (curr == 1) {
                X += Math.pow(2, level - 1);
            } else if (curr == 2) {
                Y += Math.pow(2, level - 1);
            } else if (curr == 3) {
                X += Math.pow(2, level - 1);
                Y += Math.pow(2, level - 1);
            } else {
            }
            level++;
        }
        System.out.println(String.format("%d %d %d", zoom, X, Y));
    }
}
