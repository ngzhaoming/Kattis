import java.util.Scanner;

public class GameRank {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String history = sc.nextLine();

        int currRank = 25;
        int currStar = 0;

        // To check for consecutive wins
        boolean winStreak = false;
        int conWin = 0;

        for (int i = 0; i < history.length(); i++) {
            char currChar = history.charAt(i);

            if (currRank == 0) {
                // Do nothing
            } else {
                if (currChar == 'W') {
                    conWin++;
                    if (conWin >= 3) {
                        winStreak = true;
                    }

                    if (winStreak && currRank > 5) {
                        currStar += 2;
                    } else {
                        currStar++;
                    }

                    if (currRank > 20) {
                        if (currStar > 2) {
                            currStar -= 2;
                            currRank--;
                        }
                    } else if (currRank > 15) {
                        if (currStar > 3) {
                            currStar -= 3;
                            currRank--;
                        }
                    } else if (currRank > 10) {
                        if (currStar > 4) {
                            currStar -= 4;
                            currRank--;
                        }
                    } else {
                        if (currStar > 5) {
                            currStar -= 5;
                            currRank--;
                        }
                    }
            } else {
                // This is a lost
                winStreak = false;
                conWin = 0;
                if (currRank < 21) {
                    currStar--;
                }

                if (currStar < 0) {
                    if (currRank < 20) {
                        currRank++;
                        if (currRank <= 20 && currRank >= 16) {
                            currStar = 2;
                        } else if (currRank <= 15 && currRank >= 11) {
                            currStar = 3;
                        } else {
                            currStar = 4;
                        }
                    } else {
                        currStar = 0;
                    }
                }
            }

            }
        }

        if (currRank == 0) {
            System.out.println("Legend");
        } else {
            System.out.println(currRank);
        }
    }
}
