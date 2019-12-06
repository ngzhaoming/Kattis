import java.util.Scanner;
import java.util.HashSet;

public class MarsWindow{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int month = 4;
        int year = 2018;
        HashSet<Integer> yearList = new HashSet<>();
        yearList.add(2018);
        while (year < 10001) {
            month += 2;
            year += 2;
            if (month > 12) {
                year++;
                month -= 12;
            }
            yearList.add(year);
        }
        if (yearList.contains(sc.nextInt())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
