import java.util.Scanner;

public class Amoebas {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[row][col];

        for (int i = 0; i < row; i++) {
            String currStr = sc.nextLine();
            for (int j = 0; j < col; j++) {
                board[i][j] = currStr.charAt(j);
            }
        }

        int result = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char currChar = board[i][j];
                if (currChar == '#') {
                    floodfill(board, i, j);
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    public static void floodfill(char[][] arr, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
            return;
        }

        if (arr[i][j] != '#') {
            return;
        }

        arr[i][j] = 'O';

        floodfill(arr, i - 1, j - 1);
        floodfill(arr, i - 1, j);
        floodfill(arr, i - 1, j + 1);
        floodfill(arr, i, j - 1);
        floodfill(arr, i, j + 1);
        floodfill(arr, i + 1, j - 1);
        floodfill(arr, i + 1, j);
        floodfill(arr, i + 1, j + 1);
    }


    public static void printArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
