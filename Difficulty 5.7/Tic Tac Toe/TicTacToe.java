import java.util.Scanner;

public class TicTacToe { 
    static int win[][] = {{0, 1, 2}, // Check first row.  
        {3, 4, 5}, // Check second Row  
        {6, 7, 8}, // Check third Row  
        {0, 3, 6}, // Check first column  
        {1, 4, 7}, // Check second Column  
        {2, 5, 8}, // Check third Column  
        {0, 4, 8}, // Check first Diagonal  
        {2, 4, 6}}; // Check second Diagonal  
  
    static boolean isCWin(char[] board, char c) { 
        // Check all possible winning combinations  
        for (int i = 0; i < 8; i++) { 
            if (board[win[i][0]] == c 
                    && board[win[i][1]] == c 
                    && board[win[i][2]] == c) { 
                return true; 
            } 
        } 
        return false; 
    } 
  
// Returns true if given board is valid, else returns false  
    static boolean isValid(char board[]) { 
        // Count number of 'X' and 'O' in the given board  
        int xCount = 0, oCount = 0; 
        for (int i = 0; i < 9; i++) { 
            if (board[i] == 'X') { 
                xCount++; 
            } 
            if (board[i] == 'O') { 
                oCount++; 
            } 
        } 
  
        // Board can be valid only if either xCount and oCount  
        // is same or xount is one more than oCount  
        if (xCount == oCount || xCount == oCount + 1) { 
            // Check if 'O' is winner  
            if (isCWin(board, 'O')) { 
                // Check if 'X' is also winner, then  
                // return false  
                if (isCWin(board, 'X')) { 
                    return false; 
                } 
  
                // Else return true xCount and yCount are same  
                return (xCount == oCount); 
            } 
  
            // If 'X' wins, then count of X must be greater  
            if (isCWin(board, 'X') && xCount != oCount + 1) { 
                return false; 
            } 
  
            // If 'O' is not winner, then return true  
            return true; 
        } 
        return false; 
    } 
  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            sc.nextLine();
            String first = sc.nextLine();
            String second = sc.nextLine();
            String third = sc.nextLine();
            char board[] = new char[9];

            for (int j = 0; j < 3; j++) {
                board[j] = first.charAt(j);
            }

            for (int j = 0; j < 3; j++) {
                board[j + 3] = second.charAt(j);
            }

            for (int j = 0; j < 3; j++) {
                board[j + 6] = third.charAt(j);
            }

            if ((isValid(board))) { 
                System.out.println("yes"); 
            } else { 
                System.out.println("no"); 
            } 
        }

    } 
}
