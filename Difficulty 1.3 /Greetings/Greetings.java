import java.util.Scanner;

public class Greetings {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        int len = (x.length() - 2) * 2;

        String result = "h";

        for (int i = 0; i < len; i++) {
            result += "e";
        }

        result += "y";
        System.out.println(result);
    }
}
