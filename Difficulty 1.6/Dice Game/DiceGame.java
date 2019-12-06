import java.util.Scanner;

public class DiceGame{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int gunnerTotal = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int emmaTotal = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        if (gunnerTotal > emmaTotal) {
            System.out.println("Gunnar");
        } else if (gunnerTotal < emmaTotal) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
}
