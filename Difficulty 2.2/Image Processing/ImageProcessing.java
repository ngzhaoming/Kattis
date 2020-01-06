import java.util.Scanner;
import java.util.Arrays;

public class ImageProcessing {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int kerRow = sc.nextInt();
        int kerCol = sc.nextInt();

        int[][] image = new int[row][col];
        int[] ker = new int[kerRow * kerCol];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        for (int i = kerRow * kerCol - 1; i >= 0; i--) {
            ker[i] = sc.nextInt();
        }

        int newRow = row - kerRow + 1;
        int newCol = col - kerCol + 1;

        int[][] newImage = new int[newRow][newCol];

        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                newImage[i][j] = calVal(image, ker, i, j, kerRow, kerCol);
            }
        }

        printArr(newImage);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == arr[0].length - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static int calVal(int[][] image, int[] ker, int row, int col, 
        int kerRow, int kerCol) {
        int counter = 0;
        int result = 0;
        
        for (int i = row; i < row + kerRow; i++) {
            for (int j = col; j < col + kerCol; j++) {
                int currVal = image[i][j];

                result += (ker[counter] * currVal);
                counter++;
            }
        }

        return result;
    }
}
