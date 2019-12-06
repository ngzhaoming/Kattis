import java.util.Scanner;

public class TrollHunt{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int groups = sc.nextInt() / sc.nextInt();
        int counter = 0;
        while (total > 1) {
            total -= groups;
            counter++;
        }
        System.out.println(counter);
    }
}
