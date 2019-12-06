import java.util.Scanner;

public class BookingARoom{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int booked = sc.nextInt();
        if (total == booked) {
            System.out.println("too late");
        } else {
            int[] list = new int[total + 1];
            list[0]++;
            for (int i = 0; i < booked; i++) {
                list[sc.nextInt()]++;
            }
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
