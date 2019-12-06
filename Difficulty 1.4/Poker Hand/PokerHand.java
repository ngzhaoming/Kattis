import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class PokerHand{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> track = new HashMap<>();
        String[] input = sc.nextLine().split(" ");
        ArrayList<Character> listRank = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String currCard = input[i];
            char currRank = currCard.charAt(0);
            
            if (track.containsKey(currRank)) {
                int value = track.get(currRank);
                track.replace(currRank, value + 1);
            } else {
                track.put(currRank, 1);
                listRank.add(currRank);
            }
        }

        int highest = 0;
        for (int i = 0; i < listRank.size(); i++) {
            char currRank = listRank.get(i);
            int value = track.get(currRank);

            if (value > highest) {
                highest = value;
            }
        }

        System.out.println(highest);

    }
}
