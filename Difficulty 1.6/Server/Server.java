import java.util.Scanner;

public class Server{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int limit = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            if (total + time <= limit) {
                total += time;
                counter++;
            } else {
                break;
            }
        }

        System.out.println(counter);
    }
}
