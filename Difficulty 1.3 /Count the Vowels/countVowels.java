import java.util.Scanner;

public class countVowels {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u') {
                result++;
            }
        }

        System.out.println(result);
    }
}
