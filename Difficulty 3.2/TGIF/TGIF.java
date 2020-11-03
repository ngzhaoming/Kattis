import java.util.Scanner;
import java.util.Arrays;

public class TGIF {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] numDays = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        
        int day = sc.nextInt();
        String month = sc.next();
        String start = sc.next();

        int dayStart = Arrays.asList(days).indexOf(start); //Getting the integer form of day

        int total = 0;
        String finalDay = start;
        boolean vague = false;

        if(month.equals("JAN")) {
            total = day - 1 + dayStart;
            int remainder = total % 7;
            
            finalDay = days[remainder];
        } else if (month.equals("FEB")) {
            total = dayStart + day + 31 - 1;
            int remainder = total % 7;
            
            finalDay = days[remainder];
        } else {
            //This is above feb
            int monthNum = Arrays.asList(months).indexOf(month);
            int additional = numDays[monthNum - 1];

            total = dayStart + day + additional -1;
            int remainder = total % 7;

            finalDay = days[remainder];
            String finalDay2 = days[(remainder + 1) % 7];

            if (finalDay.equals("FRI") || finalDay2.equals("FRI")) {
                vague = true;
            }
        }

        if (vague) {
            System.out.println("not sure");
        } else {
            if (finalDay.equals("FRI")) {
                System.out.println("TGIF");
            } else {
                System.out.println(":(");
            }
        }
    }
}
