import java.util.Scanner;

public class TreasureHunt {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int total = m * n;
        char[][] arr = new char[m][n];
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            String currString = sc.nextLine();
            for (int j = 0; j < n; j++) {
                char currChar = currString.charAt(j);
                arr[i][j] = currChar;
            }
        }

        int result = 0;
        int posX = 0;
        int posY = 0;
        while (result <= total) {
            char move = arr[posX][posY];
            if (move == 'T') {
                // This is the winning move
                System.out.println(result);
                break;
            } else if (move == 'N') {
                posX--;
            } else if (move == 'S') {
                posX++;
            } else if (move == 'W') {
                posY--;
            } else {
                //This is East
                posY++;
            }
            result++;
            
            if (posX < 0 || posX >= m || posY < 0 || posY >= n) {
                System.out.println("Out");
                break;
            }
        }

        if (result > total) {
            System.out.println("Lost");
        }
    }
}
