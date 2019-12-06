import java.util.Scanner;

public class Datum{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int M = sc.nextInt();
        int[] months = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 
                            304, 334, 365};
        String[] days = {"Wednesday", "Thursday", "Friday", "Saturday"
                            , "Sunday", "Monday", "Tuesday"};
        int totalDays = D + months[M];
        System.out.println(days[totalDays % 7]);
    }
}
