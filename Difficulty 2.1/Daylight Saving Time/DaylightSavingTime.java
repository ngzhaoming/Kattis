import java.util.Scanner;

public class DaylightSavingTime{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char action = sc.next().charAt(0);
            int val = sc.nextInt();
            int hours = sc.nextInt();
            int mins = sc.nextInt();
            int total = 60 * hours + mins;
            if (action == 'F') {
                total += val;
            } else {
                total -= val;
            }

            hours = total / 60;
            mins = total % 60;

            if (mins >= 60) {
                mins = mins - 60;
                hours++;
            }

            if (hours >= 24) {
                hours = hours - 24;
            }
            
            if (mins < 0) {
                hours--;
                mins = 60 + mins;
            }

            if (hours < 0) {
                hours = 24 + hours;
            }

            System.out.println(String.format("%d %d", hours, mins));
        }
    }
}
