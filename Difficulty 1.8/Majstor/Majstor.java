import java.util.Scanner;

public class Majstor {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String played = sc.next();
        int friends = sc.nextInt();
        Counter[] arr = new Counter[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Counter();
        }

        int total = 0;
        int max = 0;

        for (int i = 0; i < friends; i++) {
            String currFriend = sc.next();

            for (int j = 0; j < n; j++) {
                char sven = played.charAt(j);    
                char friend = currFriend.charAt(j);
                Counter currCounter = arr[j];

                currCounter.addVal(friend);
                arr[j] = currCounter;

                if (sven == friend) {
                    //This is a draw
                    total++;
                }

                if (sven == 'S' && friend == 'P') {
                    total = total + 2;
                }

                if (sven == 'R' && friend == 'S') {
                    total = total + 2;
                }

                if (sven == 'P' && friend == 'R') {
                    total = total + 2;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            Counter currRound = arr[i];
            max += currRound.maxScore();
        }

        System.out.println(total);
        System.out.println(max);
    }
}

class Counter {
    int rock = 0;
    int paper = 0;
    int scissors = 0;

    public void addVal(char play) {
        if (play == 'R') {
            rock++;
        }

        if (play == 'S') {
            scissors++;
        }

        if (play == 'P') {
            paper++;
        }
    }

    public int maxScore() {
        int total = 0;

        char[] play = {'R', 'P', 'S'};

        for (int i = 0; i < play.length; i++) {
            char currBest = play[i];
            int result = 0;
            
            if (currBest == 'R') {
                result += (scissors * 2 + rock);
            } else if (currBest == 'P') {
                result += (rock * 2 + paper);
            } else { //This is scissors
                result += (paper * 2 + scissors);
            }

            if (result > total) {
                total = result;
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return "Value of rock, paper, scissors: " + rock + " " + paper + " " + scissors;
    }
}