import java.util.Scanner;

public class Trik{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int position = 1;
        char nextMove;

        for (int i = 0; i < input.length(); i++) {
            nextMove = input.charAt(i);
            if (nextMove == 'A') {
                if (position == 1) {
                    position++;
                } else if (position == 2) {
                    position--;
                }
            } else if (nextMove == 'B') {
                if (position == 2) {
                    position++;
                } else if (position == 3) {
                    position--;
                }
            } else {
                if (position == 1) {
                    position += 2;
                } else if (position == 3) {
                    position -= 2;
                }
            }
        }

        System.out.println(position);
    }
}
