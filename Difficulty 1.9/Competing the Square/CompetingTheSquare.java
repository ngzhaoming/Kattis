import java.util.Scanner;
import java.lang.Math;

public class CompetingTheSquare{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double l1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double l2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double l3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double xDiff, yDiff, realX, realY;
        if (l1 == l2) { //x2 is the mid point
            if (x1 < x2) {
                xDiff = Math.abs(x2 - x1);
                realX = x3 - xDiff;
            } else {
                xDiff = Math.abs(x1 - x2); 
                realX = x3 + xDiff;
            }

            if (y1 < y2) {
                yDiff = Math.abs(y2 - y1);
                realY = y3 - yDiff;
            } else {
                yDiff = Math.abs(y1 - y2); 
                realY = y3 + yDiff;
            }
        } else if (l1 == l3) { //x1 is the mid point
            if (x2 < x1) {
                xDiff = Math.abs(x1 - x2);
                realX = x3 - xDiff;
            } else {
                xDiff = Math.abs(x2 - x1); 
                realX = x3 + xDiff;
            }

            if (y2 < y1) {
                yDiff = Math.abs(y1 - y2);
                realY = y3 - yDiff;
            } else {
                yDiff = Math.abs(y2 - y1); 
                realY = y3 + yDiff;
            }
        } else { //x3 is the mid point
            if (x2 < x3) {
                xDiff = Math.abs(x3 - x2);
                realX = x1 - xDiff;
            } else {
                xDiff = Math.abs(x2 - x3); 
                realX = x1 + xDiff;
            }

            if (y2 < y3) {
                yDiff = Math.abs(y3 - y2);
                realY = y1 - yDiff;
            } else {
                yDiff = Math.abs(y2 - y3); 
                realY = y1 + yDiff;
            }
        } 

        System.out.println(String.format("%d %d", (int) realX, (int) realY));
    }
}
