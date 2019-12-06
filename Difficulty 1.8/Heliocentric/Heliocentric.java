import java.util.Scanner;

public class Heliocentric{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (sc.hasNext()) {
            long total = 0;
            long earth = sc.nextLong();
            long mars = sc.nextLong();
            //Set Earth to 0;
            long amount = 365 - earth;
            if (earth == 0 && mars == 0) {
                System.out.println(String.format("Case %d: 0", counter));
                counter++;
                continue;
            }

            mars = (mars + amount) % 687;
            earth = 0;
            total += amount;

            while (mars != 0) {
                mars = (mars + 365) % 687;
                total += 365;
            }
            System.out.println(String.format("Case %d: %d", counter, total));
            counter++;
        }
    }
}
