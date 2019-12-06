import java.util.Scanner;
import java.util.HashMap;

public class Bela{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char domSuit = sc.next().charAt(0);
        String currCard;
        HashMap<Integer, Integer> dominant = new HashMap<>();
        HashMap<Integer, Integer> nonDom = new HashMap<>();
        int total = 0;

        dominant.put((int) 'A', 11);
        dominant.put((int) 'K', 4);
        dominant.put((int) 'Q', 3);
        dominant.put((int) 'J', 20);
        dominant.put((int) 'T', 10);
        dominant.put((int) '9', 14);
        dominant.put((int) '8', 0);
        dominant.put((int) '7', 0);
        nonDom.put((int) 'A', 11);
        nonDom.put((int) 'K', 4);
        nonDom.put((int) 'Q', 3);
        nonDom.put((int) 'J', 2);
        nonDom.put((int) 'T', 10);
        nonDom.put((int) '9', 0);
        nonDom.put((int) '8', 0);
        nonDom.put((int) '7', 0);

        for (int i = 0; i < 4 * N; i++) {
            currCard = sc.next();
            if (currCard.charAt(1) == domSuit) {
                total += dominant.get((int) currCard.charAt(0));
            } else {
                total += nonDom.get((int) currCard.charAt(0));
            }
        }

        System.out.println(total);
    }
}
