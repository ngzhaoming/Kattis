import java.util.Scanner;
import java.util.TreeSet;

public class Shiritori{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> said = new TreeSet<>();
        int n = sc.nextInt();
        boolean flag = true;
        int currPlayer = 2;
        String first = sc.next();
        char expectedChar = first.charAt(first.length() - 1);
        said.add(first);
        for (int i = 1; i < n; i++) {
            String word = sc.next();
            if (word.charAt(0) != expectedChar || said.contains(word)) {
                flag = false;
                System.out.println(String.format("Player %d lost", currPlayer));
                break;
            }
            
            if (currPlayer == 1) {
                currPlayer = 2;
            } else {
                currPlayer = 1;
            }

            expectedChar = word.charAt(word.length() - 1);
            said.add(word);
        }

        if (flag) {
            System.out.println("Fair Game");
        }
    }
}
