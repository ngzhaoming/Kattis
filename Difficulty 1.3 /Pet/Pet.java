import java.util.Scanner;

public class Pet{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int winner = 0;
        int score = 0;

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += sc.nextInt();

                if (total > score) {
                    winner = i + 1;
                    score = total;
                }
            }
        }

        System.out.println(String.format("%d %d", winner, score));
    }
}
