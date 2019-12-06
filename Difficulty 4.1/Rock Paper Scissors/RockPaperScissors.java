import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Double;

public class RockPaperScissors{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (true) {
            int players = sc.nextInt();
            if (players == 0) {
                break;
            }

            if (counter != 0) {
                System.out.println();
            }
            
            HashMap<Integer, Player> list = new HashMap<>();
            int games = sc.nextInt();

            for (int i = 0; i < players; i++) {
                list.put(i + 1, new Player());
            }
            
            for (int i = 0; i < games; i++) {
                int one = sc.nextInt();
                String onePlay = sc.next();
                int two = sc.nextInt();
                String twoPlay = sc.next();

                if (onePlay.equals("rock") && twoPlay.equals("scissors")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addWin();
                    p2.addLose();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else if (onePlay.equals("scissors") && twoPlay.equals("paper")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addWin();
                    p2.addLose();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else if (onePlay.equals("paper") && twoPlay.equals("rock")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addWin();
                    p2.addLose();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else if (onePlay.equals("paper") && twoPlay.equals("scissors")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addLose();
                    p2.addWin();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else if (onePlay.equals("scissors") && twoPlay.equals("rock")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addLose();
                    p2.addWin();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else if (onePlay.equals("rock") && twoPlay.equals("paper")) {
                    Player p1 = list.get(one);
                    Player p2 = list.get(two);
                    p1.addLose();
                    p2.addWin();
                    list.replace(one, p1);
                    list.replace(two, p2);
                } else {

                }
            }

            Iterator it = list.values().iterator();

            while(it.hasNext()) {
                Player currPlayer = (Player) it.next();
                try {
                    if (currPlayer.wins + currPlayer.loses == 0) {
                        System.out.println("-");
                    } else {
                        double result = (double) currPlayer.wins / (double) (currPlayer.wins + currPlayer.loses);
                        System.out.printf("%.3f", result);
                        System.out.println();
                    }
                } catch (Exception e) {
                    System.out.println("-");
                }
            }
            counter++;
        }
    }
}

class Player {
    int wins = 0;
    int loses = 0;

    public void addWin() {
        wins++;
    }

    public void addLose() {
        loses++;
    }
}
