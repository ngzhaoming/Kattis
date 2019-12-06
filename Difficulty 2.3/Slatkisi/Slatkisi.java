import java.util.Scanner;

public class Slatkisi{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int temp =  candies;
        int zeros = sc.nextInt();
        String str = candies + "";
        String val = "1";
        for (int i = 0; i < zeros; i++) {
            val = val + "0";
        }

        int check = candies % Integer.parseInt(val);
        if (check >= Integer.parseInt(val) / 2) { //Round up
            candies -= check;
            candies += Integer.parseInt(val);
        } else {
            candies -= check;
        }

        if (zeros == 0) {
            System.out.println(temp);
        } else {
            System.out.println(candies);
        }
    }
}
