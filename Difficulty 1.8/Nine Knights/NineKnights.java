import java.util.Scanner;
import java.util.HashSet;

public class NineKnights{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chessBoard = new char[5][5];
        int counter = 0;
        for (int i = 0; i < 5; i++) { // Store the chessboard
            String line = sc.nextLine();
            for (int j = 0; j < 5; j++) {
                char currChar = line.charAt(j);
                if (currChar == 'k') {
                    counter++;
                }
                chessBoard[i][j] = line.charAt(j);
            }
        }

        boolean flag = true;
        if (counter != 9) {
            flag = false;
        } else {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    char currChar = chessBoard[i][j];
                    HashSet<String> check = new HashSet<>();
                    if (currChar == 'k') {
                        check.add(check1(i, j, chessBoard));
                        check.add(check2(i, j, chessBoard));
                        check.add(check3(i, j, chessBoard));
                        check.add(check4(i, j, chessBoard));
                        check.add(check5(i, j, chessBoard));
                        check.add(check6(i, j, chessBoard));
                        check.add(check7(i, j, chessBoard));
                        check.add(check8(i, j, chessBoard));
                    }

                    if (check.contains("false")) {
                        flag = false;
                        break;
                    }
                }
            }
        }


        if (flag) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    public static String check1(int i, int j, char[][] chessBoard) {
        int newI = i - 1;
        int newJ = j - 2;
        String result = "true";
        if (newI >= 0 && newJ >= 0) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check2(int i, int j, char[][] chessBoard) {
        int newI = i - 2;
        int newJ = j - 1;
        String result = "true";
        if (newI >= 0 && newJ >= 0) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check3(int i, int j, char[][] chessBoard) {
        int newI = i - 2;
        int newJ = j + 1;
        String result = "true";
        if (newI >= 0 && newJ <= 4) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check4(int i, int j, char[][] chessBoard) {
        int newI = i - 1;
        int newJ = j + 2;
        String result = "true";
        if (newI >= 0 && newJ <= 4) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check5(int i, int j, char[][] chessBoard) {
        int newI = i + 1;
        int newJ = j - 2;
        String result = "true";
        if (newI <= 4 && newJ >= 0) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check6(int i, int j, char[][] chessBoard) {
        int newI = i + 2;
        int newJ = j - 1;
        String result = "true";
        if (newI <= 4 && newJ >= 0) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check7(int i, int j, char[][] chessBoard) {
        int newI = i + 2;
        int newJ = j + 1;
        String result = "true";
        if (newI <= 4 && newJ <= 4) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }

    public static String check8(int i, int j, char[][] chessBoard) {
        int newI = i + 1;
        int newJ = j + 2;
        String result = "true";
        if (newI <= 4 && newJ <= 4) {
            char pos = chessBoard[newI][newJ];
            if (pos == 'k') {
                result = "false";
            }
        }
        return result;
    }
}
