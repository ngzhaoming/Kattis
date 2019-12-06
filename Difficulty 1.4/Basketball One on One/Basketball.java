import java.util.Scanner;
import java.lang.Character;

public class Basketball {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int A = 0;
        int B = 0;
        for (int i = 0; i < str.length(); i = i + 2) {
            char player = str.charAt(i);
            int point = Character.getNumericValue(str.charAt(i + 1));
            if (player == 'A') {
                A += point;
            } else {
                B += point;
            }
        }

        if (A > B) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
