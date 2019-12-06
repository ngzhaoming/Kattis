import java.util.Scanner;

public class ToiletSeat{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        upPolicy(input);
        downPolicy(input);
        anyPolicy(input);
    }

    public static void upPolicy(String input) {
        char state = input.charAt(0);
        int counter = 0;
        for (int i = 1; i < input.length(); i++) {
            char next = input.charAt(i);
            if (next != state) {
                counter++;
                state = next;
            }

            if (state != 'U') {
                counter++;
                state = 'U';
            }
        }
        System.out.println(counter);
    }

    public static void downPolicy(String input) {
        char state = input.charAt(0);
        int counter = 0;
        for (int i = 1; i < input.length(); i++) {
            char next = input.charAt(i);
            if (next != state) {
                counter++;
                state = next;
            }

            if (state != 'D') {
                counter++;
                state = 'D';
            }
        }
        System.out.println(counter);
    }

    public static void anyPolicy(String input) {
        char state = input.charAt(0);
        int counter = 0;
        for (int i = 1; i < input.length(); i++) {
            char next = input.charAt(i);
            if (next != state) {
                counter++;
                state = next;
            }
        }
        System.out.println(counter);
    }
}
