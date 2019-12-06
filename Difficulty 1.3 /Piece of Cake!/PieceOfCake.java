import java.util.Scanner;

public class PieceOfCake {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int width1 = sc.nextInt();
        int width2 = original - width1;
        int betterW = Math.max(width1, width2);
        int breadth1 = sc.nextInt();
        int breadth2 = original - breadth1;
        int betterB = Math.max(breadth1, breadth2);

        System.out.println(betterB * betterW * 4);
    }
}
