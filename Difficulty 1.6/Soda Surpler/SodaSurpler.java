import java.util.Scanner;

public class SodaSurpler{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int currHave = sc.nextInt() + sc.nextInt();
        int cost = sc.nextInt();
        int totalDrank = 0;

        while (currHave >= cost) {
            int purchased = currHave / cost;
            currHave = currHave - (purchased * cost) + purchased;
            totalDrank += purchased;
        }

        System.out.println(totalDrank);
    }
}
