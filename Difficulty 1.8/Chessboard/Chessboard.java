import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Character;

public class Chessboard{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = {"+---+---+---+---+---+---+---+---+",
        "|...|:::|...|:::|...|:::|...|:::|",
        "+---+---+---+---+---+---+---+---+",
        "|:::|...|:::|...|:::|...|:::|...|",
        "+---+---+---+---+---+---+---+---+",
        "|...|:::|...|:::|...|:::|...|:::|",
        "+---+---+---+---+---+---+---+---+",
        "|:::|...|:::|...|:::|...|:::|...|",
        "+---+---+---+---+---+---+---+---+",
        "|...|:::|...|:::|...|:::|...|:::|",
        "+---+---+---+---+---+---+---+---+",
        "|:::|...|:::|...|:::|...|:::|...|",
        "+---+---+---+---+---+---+---+---+",
        "|...|:::|...|:::|...|:::|...|:::|",
        "+---+---+---+---+---+---+---+---+",
        "|:::|...|:::|...|:::|...|:::|...|",
        "+---+---+---+---+---+---+---+---+"
        };
        ArrayList<String> col = new ArrayList<>();

        col.add("a");
        col.add("b");
        col.add("c");
        col.add("d");
        col.add("e");
        col.add("f");
        col.add("g");
        col.add("h");

        String whiteLine = sc.nextLine();
        String blackLine = sc.nextLine();
        String[] white = {};
        String[] black = {};

        if (whiteLine.length() > 7) {
            white = whiteLine.substring(7).split(",");
        }

        if (blackLine.length() > 7) {
            black = blackLine.substring(7).split(",");
        }

        if (black.length > 0) {
            for (int i = 0; i < black.length; i++) {
                String curr = black[i];
                if (curr.length() == 3) {
                    // This is a black piece
                    char piece = Character.toLowerCase(curr.charAt(0));
                    int column = col.indexOf(curr.charAt(1) + "");
                    int row = Character.getNumericValue(curr.charAt(2));
                    String modify = board[17 - row * 2];
                    modify = modify.substring(0, 4 * column + 2) + piece + modify.substring(4 * column + 3);
                    board[17 - row * 2] = modify;
                } else {
                    // This is a white
                    int column = col.indexOf(curr.charAt(0) + "");
                    int row = Character.getNumericValue(curr.charAt(1));
                    String modify = board[17 - row * 2];
                    modify = modify.substring(0, 4 * column + 2) + "p" + modify.substring(4 * column + 3);
                    board[17 - row * 2] = modify;
                }
            }
        }

        if (white.length > 0) {
            for (int i = 0; i < white.length; i++) {
                String curr = white[i];
                if (curr.length() == 3) {
                    char piece = curr.charAt(0);
                    int column = col.indexOf(curr.charAt(1) + "");
                    int row = Character.getNumericValue(curr.charAt(2));
                    String modify = board[17 - row * 2];
                    modify = modify.substring(0, 4 * column + 2) + piece + modify.substring(4 * column + 3);
                    board[17 -row * 2] = modify;
                } else {
                    int column = col.indexOf(curr.charAt(0) + "");
                    int row = Character.getNumericValue(curr.charAt(1));
                    String modify = board[17 - row * 2];
                    modify = modify.substring(0, 4 * column + 2) + "P" + modify.substring(4 * column + 3);
                    board[17 - row * 2] = modify;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
    }
}
