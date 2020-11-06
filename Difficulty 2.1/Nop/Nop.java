import java.util.Scanner;
import java.lang.Character;

public class Nop {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String old = sc.next();

        int index = 0;
        int add = 0;

        for (int i = 0; i < old.length(); i++) {
            char currChar = old.charAt(i);

            if (Character.isUpperCase(currChar)) {
                while (index % 4 != 0) {
                    index++;
                    add++;
                }
            }

            index++;
        }

        System.out.println(add);
    }
}
