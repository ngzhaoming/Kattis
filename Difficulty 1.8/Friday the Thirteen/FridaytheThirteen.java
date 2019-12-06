import java.util.Scanner;

public class FridaytheThirteen{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = {"sun", "mon", "tues", "wed", "thurs", "fri", "sat"};
        for (int i = 0; i < n; i++) {
            int days = sc.nextInt();
            int months = sc.nextInt();
            int counter = 0;
            int currStart = 0;
            for (int j = 0; j < months; j++) {
                int currMonthDay = sc.nextInt();
                if (currMonthDay >= 13) {
                    int thirteen = (currStart + 13) % 7 - 1; 
                    if (thirteen == -1) {
                        thirteen = 6;
                    }
                    if (list[thirteen].equals("fri")) {
                        counter++;
                    }
                }
                currStart = (currStart + currMonthDay) % 7;
            }
            System.out.println(counter);
        }
    }
}
