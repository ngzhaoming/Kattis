import java.util.Scanner;

public class doublePassword {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        int result = 1;

        for (int i = 0; i < first.length(); i++) {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);

            if (firstChar == secondChar) {
                result *= 1;                   
            } else {
                result *= 2;
            }
        }

        System.out.println(result);
    }
}
