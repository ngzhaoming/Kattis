import java.util.Scanner;

public class Checkerboard {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        String[][] checker = new String[dim][dim];
        sc.nextLine();

        for (int i = 0; i < dim; i++) {
            checker[i] = sc.nextLine().split("");
        }

        boolean verdict1 = checkRows(checker, dim);
        boolean verdict2 = checkCols(checker, dim);

        if (verdict1 && verdict2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean checkRows(String[][] checker, int dim) {
        boolean verdict = true;
        for (int i = 0; i < dim; i++) {
            String curr = "";
            int white = 0;
            int black = 0;
            for (int j = 0; j < dim; j++) {
                String currCol = checker[i][j];
                curr += currCol;
                if (currCol.equals("W")) {
                    white++;
                } else {
                    black++;
                }

                if (curr.length() >= 4) {
                    curr = curr.substring(1);
                }

                if (fourCon(curr)) {
                    verdict = false;
                }
            }

            if (white != black) {
                verdict = false;
            }
        }

        return verdict;
    }

    public static boolean checkCols(String[][] checker, int dim) {
        boolean verdict = true;
        for (int i = 0; i < dim; i++) {
            String curr = "";
            int white = 0;
            int black = 0;
            for (int j = 0; j < dim; j++) {
                String currCol = checker[j][i];
                curr += currCol;
                if (currCol.equals("W")) {
                    white++;
                } else {
                    black++;
                }

                if (curr.length() >= 4) {
                    curr = curr.substring(1);
                }

                if (fourCon(curr)) {
                    verdict = false;
                    break;
                }
            }

            if (white != black) {
                verdict = false;
                break;
            }
        }

        return verdict;
    }

    public static boolean fourCon(String str) {
        if (str.equals("WWW") || str.equals("BBB")) {
            return true;
        }

        return false;
    }
}
