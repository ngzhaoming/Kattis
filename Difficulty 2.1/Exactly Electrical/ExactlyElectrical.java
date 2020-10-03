import java.util.Scanner;

public class ExactlyElectrical { 
    public static void main (String [] args) { 
        Scanner sc = new Scanner(System.in);
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        int electricity = sc.nextInt();

        int dist = Math.abs(startX - endX) + Math.abs(startY - endY);
        electricity -= dist;

        if (electricity >= 0) {
            if (electricity % 2 == 0) {
                System.out.println('Y');
            } else {
                System.out.println('N');
            }
        } else {
            System.out.println('N');
        }
    }
}
