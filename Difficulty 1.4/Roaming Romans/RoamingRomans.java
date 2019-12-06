import java.util.Scanner;

public class RoamingRomans{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double romanPace = 5280.0 / 4854;
        double length = sc.nextDouble() * romanPace * 1000;
        double remainder = length % 1;
        if (remainder < 0.5) {
            System.out.println((int) length);
        } else {
            System.out.println((int) length + 1);
        }
    }
}
