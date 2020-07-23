import java.util.Scanner;
import java.util.Arrays;

public class Peg {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[7][7];

        // Create the board first
        for (int i = 0; i < 7; i++) {
            String currLine = sc.nextLine();
            for (int j = 0; j < 7; j++) {
                board[i][j] = currLine.charAt(j);
            }
        }

        int result = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                char currChar = board[i][j];

                if (currChar == '.') {
                    // Do checks
                    int upI = i - 2;
                    int downI = i + 2;
                    int upJ = j - 2;
                    int downJ = j + 2;

                    if (upI >= 0) {
                        if (board[i - 1][j] == 'o' && board[i -2][j] == 'o') {
                            result++;
                        }
                    }

                    if (downI < 7) {
                        if (board[i + 1][j] == 'o' && board[i + 2][j] == 'o') {
                            result++;
                        }
                    }

                    if (upJ >= 0) {
                        if (board[i][j - 1] == 'o' && board[i][j - 2] == 'o') {
                            result++;
                        }
                    }

                    if (downJ < 7) {
                        if (board[i][j + 1] == 'o' && board[i][j + 2] == 'o') {
                            result++;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
