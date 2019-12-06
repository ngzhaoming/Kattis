import java.util.Scanner;
import java.util.HashSet;

public class Hangman{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> list = new HashSet<>();
        String word = sc.next();
        String input = sc.next();
        String flag = "WIN";
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            list.add(currChar);
        }

        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            if (list.contains(currChar)) {
                list.remove(currChar);
                if (list.size() == 0) {
                    break;
                }
            } else {
                counter++;
                if (counter == 10) {
                    flag = "LOSE";
                    break;
                }
            }
        }

        System.out.println(flag);
    }
}
