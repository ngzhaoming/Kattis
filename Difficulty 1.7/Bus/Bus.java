import java.util.Scanner;

public class Bus{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(passengers(sc.nextInt()));
        }
    }

    public static long passengers(int stops) {
        double total = 0;
        while (stops > 0) {
            total = (total + 0.5) * 2;
            stops--;
        }
        return (long) total;
    }
}
