import java.util.Scanner;

public class PrintedStatues{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int total = 1;
        while (total < n) {
            total *= 2;
            counter++;
        }
        System.out.println(counter);
    }
}
