import java.util.Scanner;

public class Timeloop{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
