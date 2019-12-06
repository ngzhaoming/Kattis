import java.util.Scanner;

public class CryptographerConundrum{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int totalSet = input.length() / 3;
        String compare = "";
        int total = 0;

        for (int i = 0; i < totalSet; i++) {
            compare += "PER";
        }

        for (int i = 0; i < compare.length(); i++) {
            if (compare.charAt(i) != input.charAt(i)) {
                total++;
            }
        }

        System.out.println(total);
    }
}
