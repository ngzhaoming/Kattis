import java.util.Scanner;

public class SpeedLimit{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int next = sc.nextInt();
            if (next == -1) {
                break;
            } else {
                int total = 0;
                int prevSpeed = sc.nextInt();
                int prevHours = sc.nextInt();
                total += prevSpeed * prevHours;
                for (int i = 0; i < next - 1; i++) {
                    int speed = sc.nextInt();
                    int hours = sc.nextInt();
                    int actualHours = hours - prevHours;
                    total += speed * actualHours;
                    prevHours = hours;
                }
                System.out.println(total + " miles");
            }
        }

    }
}
