import java.util.Scanner;
import java.lang.Math;

public class Sevenwonders{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        int C = 0;
        int G = 0;
        char currCard;
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            currCard = input.charAt(i);
            if (currCard == 'T') {
                T++;
            } else if (currCard == 'C') {
                C++;
            } else {
                G++;
            }
        }

        int[] compare = {T, C, G};
        int lowest = 50;
        for (int i = 0; i < 3; i++) {
            if (compare[i] < lowest) {
                lowest = compare[i];
            }
        }

        double totalPoints = Math.pow(T, 2) + Math.pow(C, 2)
                        + Math.pow(G, 2) + lowest * 7;

        System.out.println((int) totalPoints);
    }
}
