import java.util.Scanner;

public class YingYangStones{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String inpt = sc.nextLine();
        int white = 0;
        int black = 0;

        for (int i = 0; i < inpt.length(); i++) {
            char currChar = inpt.charAt(i);
            if (currChar == 'W') {
                white++;
            } else {
                black++;
            }
        }

        if (white == black) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
