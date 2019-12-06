import java.util.Scanner;

public class MirrorImage{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Test " + (i + 1));
            char[][] image = new char[r][c];
            for (int j = r - 1; j >= 0; j--) {
                String input = sc.next();
                int counter = 0;
                for (int k = c - 1; k >= 0; k--) {
                    char currChar = input.charAt(counter);
                    image[j][k] = currChar;
                    counter++;
                }
            }
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(image[j][k]);
                }
                System.out.println();
            }
        }
    }
}
