import java.util.Scanner;

public class Beekeeper{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String bestString = "";
            int bestVal = -1;
            for (int i = 0; i < n; i++) {
                String input = sc.next();
                int counter = 0;
                char prev = input.charAt(0);
                for (int j = 1; j < input.length(); j++) {
                    char curr = input.charAt(j);
                    if (curr == prev && (curr == 'a' || curr == 'e'
                        || curr == 'i' || curr == 'o' || curr == 'u'
                        || curr == 'y')) {
                        counter++;
                    } else {
                        prev = curr;
                    }
                }
                if (counter > bestVal) {
                    bestString = input;
                    bestVal = counter;
                }
            }

            System.out.println(bestString);
        }
    }
}
