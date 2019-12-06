import java.util.Scanner;
import java.util.HashSet;

public class Karte{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> P = new HashSet<>();
        HashSet<String> K = new HashSet<>();
        HashSet<String> H = new HashSet<>();
        HashSet<String> T = new HashSet<>();
        String input = sc.next();
        boolean flag = false;
        for (int i = 0; i < input.length(); i = i + 3) {
            String card = input.substring(i, i + 3);
            char suit = card.charAt(0);
            if (suit == 'P') {
                if (P.contains(card)) {
                    flag = true;
                    break;
                } else {
                    P.add(card);
                }
            } else if (suit == 'K') {
                if (K.contains(card)) {
                    flag = true;
                    break;
                } else {
                    K.add(card);
                }
            } else if (suit == 'H') {
                if (H.contains(card)) {
                    flag = true;
                    break;
                } else {
                    H.add(card);
                }
            } else {
                if (T.contains(card)) {
                    flag = true;
                    break;
                } else {
                    T.add(card);
                }
            }
        }
        if (flag) {
            System.out.println("GRESKA");
        } else {
        System.out.println(String.format("%d %d %d %d", 13 - P.size(), 13 - K.size(), 13 - H.size(), 13 - T.size()));
        }
    }
}
