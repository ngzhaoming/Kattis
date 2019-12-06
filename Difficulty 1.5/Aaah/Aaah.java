import java.util.Scanner;

public class Aaah{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String say = sc.next();
        String wanted = sc.next();
        if (say.contains(wanted)) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
