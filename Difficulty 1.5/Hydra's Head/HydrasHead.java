import java.util.Scanner;

public class HydrasHead{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int heads = sc.nextInt();
            int tails = sc.nextInt();
            int moves = 0;

            if (heads == 0 && tails == 0) {
                break;
            } else if (heads % 2 != 0 && tails == 0) {
                System.out.println(-1);
                continue;
            }

            if (tails % 2 == 0) { //Even number of tails
                while (tails > 2) {
                    tails -= 2;
                    heads++;
                    moves++;
                }

                if (heads % 2 != 0) {
                    moves = moves + ((heads + 1) / 2) + 1;
                } else {
                    moves = moves + 4 + ((heads + 2) / 2);
                }
            } else {
                while (tails > 1) {
                    tails -= 2;
                    heads++;
                    moves++;
                }

                if (heads % 2 != 0) {
                    moves = moves + 2 + ((heads + 1) / 2);
                } else {
                    moves = moves + 5 + ((heads + 2) / 2);
                }
            }

            System.out.println(moves);
        }
    }
}
