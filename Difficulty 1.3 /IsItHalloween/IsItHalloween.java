import java.util.Scanner;

public class IsItHalloween{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int day = sc.nextInt();
        String flag = "nope";

        if (month.equals("OCT")) {
            if (day == 31) {
                flag = "yup";    
            }
        }

        if (month.equals("DEC")) {
            if (day == 25) {
                flag = "yup";    
            }
        }

        System.out.println(flag);
    }
}
