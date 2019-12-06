import java.util.Scanner;

public class LeftBeehind{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sweet = sc.nextInt();
            int sour = sc.nextInt();

            if (sweet == 0 && sour == 0) {
                break;
            } else if (sweet + sour == 13) {
                System.out.println("Never speak again.");
            } else if (sweet == sour) {
                System.out.println("Undecided.");
            } else if (sweet < sour) {
                System.out.println("Left beehind.");
            } else {
                System.out.println("To the convention.");
            }
        }
    }
}
