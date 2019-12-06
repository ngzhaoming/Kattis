import java.util.Scanner;

public class SavingDaylight{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String month = sc.next();
            int day = sc.nextInt();
            int year = sc.nextInt();
            String[] start = sc.next().split(":");
            String[] end = sc.next().split(":");
            end[0] = (Integer.parseInt(end[0]) - 1) + "";
            end[1] = (Integer.parseInt(end[1]) + 60) + "";
            int hr = Integer.parseInt(end[0]) - Integer.parseInt(start[0]);
            int min = Integer.parseInt(end[1]) - Integer.parseInt(start[1]);
            if (min >= 60) {
                min -= 60;
                hr += 1;
            }

            System.out.println(String.format("%s %d %d %d hours %d minutes", month, day, year, hr, min));
        }
    }
}
