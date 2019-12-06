import java.util.Scanner;

public class Aaah{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String wanted = sc.next();
        if (word.contains(wanted)) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
