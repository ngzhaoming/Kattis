import java.util.Scanner;

public class Kemija{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordSet = sc.nextLine().split(" ");
        for (int j = 0; j < wordSet.length; j++) {
            String currWord = wordSet[j];
            String actual = "";
            for (int i = 0; i < currWord.length(); i++) {
                char currChar = currWord.charAt(i);
                if (currChar == 'a' || currChar == 'e' ||
                    currChar == 'i' || currChar == 'o' || currChar == 'u') {
                    actual += currChar;
                    i += 2;
                } else {
                    actual += currChar;
                }
            }

            if (j == wordSet.length - 1) {
                System.out.print(actual);
            } else {
                System.out.print(actual + " ");
            }
        }
        System.out.println();
    }
}
