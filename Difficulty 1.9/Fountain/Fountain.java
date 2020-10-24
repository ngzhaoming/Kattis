import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Fountain {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String curr = sc.next();
            for (int j = 0; j < m; j++) {
                char currChar = curr.charAt(j);
                arr[i][j] = currChar;
                if (currChar == 'V') {
                    q.add(i + "," + j);
                }
            }
        }

        while(!q.isEmpty()) {
            String currPos = q.poll();

            String[] currArr = currPos.split(",");

            int x = Integer.parseInt(currArr[0]);
            int y = Integer.parseInt(currArr[1]);

            if (x + 1 >= n) {
                continue;
            }

            //Water is within range
            char btm = arr[x + 1][y];

            if (btm == '.') {
                //This is air
                arr[x + 1][y] = 'V';
                q.add((x + 1) + "," + y);
            } else if (btm == '#') {
                //This is stone
                if (y + 1 < m && arr[x][y + 1] == '.') {
                    arr[x][y + 1] = 'V';
                    q.add(x + "," + (y + 1));
                }

                if (y - 1 >= 0 && arr[x][y - 1] == '.') {
                    arr[x][y - 1] = 'V';
                    q.add(x + "," + (y - 1));
                }

            } else {
                //Do nothing, this is water
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
