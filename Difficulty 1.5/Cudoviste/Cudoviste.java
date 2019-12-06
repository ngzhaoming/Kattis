import java.util.Scanner;

public class Cudoviste{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] diagram = new char[r][c];
        sc.nextLine();
        for (int i = 0; i < r; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < c; j++) {
                diagram[i][j] = input.charAt(j);
            }
        }

        int[] amount = new int[5];
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                char char1 = diagram[i][j];
                char char2 = diagram[i + 1][j];
                char char3 = diagram[i][j + 1];
                char char4 = diagram[i + 1][j + 1];
                if (char1 == '#' || char2 == '#' || 
                        char3 == '#' || char4 == '#') {
                    continue;
                } else {
                    int counter = 0;
                    if (char1 == 'X') {
                        counter++;
                    }
                    if (char2 == 'X') {
                        counter++;
                    }
                    if (char3 == 'X') {
                        counter++;
                    }
                    if (char4 == 'X') {
                        counter++;
                    }
                    amount[counter]++;
                }
            }
        }

        for (int i = 0; i < amount.length; i++) {
            System.out.println(amount[i]);
        }
    }
}
