import java.util.Scanner;

public class Vauvau{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int agg1 = sc.nextInt();
        int calm1 = sc.nextInt();
        int total1 = agg1 + calm1;
        int agg2 = sc.nextInt();
        int calm2 = sc.nextInt();
        int total2 = agg2 + calm2;
        for (int i = 0; i < 3; i++) {
            int min = sc.nextInt();
            int counter = 0;
            int absolute1 = min % total1;
            int absolute2 = min % total2;
            if (absolute1 == 0 || absolute1 > agg1) {
            } else {
                counter++;
            }
            if (absolute2 == 0 || absolute2 > agg2) {
            } else {
                counter++;
            }
            if (counter == 0) {
                System.out.println("none");
            } else if (counter == 1) {
                System.out.println("one");
            } else {
                System.out.println("both");
            }
        }
    }
}
