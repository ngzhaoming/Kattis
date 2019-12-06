import java.util.Scanner;

public class Howl{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String howl = sc.nextLine();

        char last = howl.charAt(howl.length() - 1);

        if (last == 'W' || last == 'H') {
            howl += "O";
        } else {
            howl += "W";
        }

        System.out.println(howl);
    }
}
